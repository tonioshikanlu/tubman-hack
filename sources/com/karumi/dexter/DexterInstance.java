package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.BaseMultiplePermissionsListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

public final class DexterInstance {
    /* access modifiers changed from: private */
    public static final MultiplePermissionsListener EMPTY_LISTENER = new BaseMultiplePermissionsListener();
    private static final int PERMISSIONS_REQUEST_CODE = 42;
    private Activity activity;
    private final AndroidPermissionService androidPermissionService;
    private WeakReference<Context> context;
    private final IntentProvider intentProvider;
    /* access modifiers changed from: private */
    public final AtomicBoolean isRequestingPermission;
    private final AtomicBoolean isShowingNativeDialog;
    /* access modifiers changed from: private */
    public MultiplePermissionsListener listener = EMPTY_LISTENER;
    private final MultiplePermissionsReport multiplePermissionsReport;
    private final Collection<String> pendingPermissions;
    private final Object pendingPermissionsMutex = new Object();
    private final AtomicBoolean rationaleAccepted;

    public final class PermissionStates {
        private final Collection<String> deniedPermissions;
        private final Collection<String> grantedPermissions;
        private final Collection<String> impossibleToGrantPermissions;

        private PermissionStates() {
            this.deniedPermissions = new LinkedList();
            this.impossibleToGrantPermissions = new LinkedList();
            this.grantedPermissions = new LinkedList();
        }

        /* access modifiers changed from: private */
        public void addDeniedPermission(String str) {
            this.deniedPermissions.add(str);
        }

        /* access modifiers changed from: private */
        public void addGrantedPermission(String str) {
            this.grantedPermissions.add(str);
        }

        /* access modifiers changed from: private */
        public void addImpossibleToGrantPermission(String str) {
            this.impossibleToGrantPermissions.add(str);
        }

        /* access modifiers changed from: private */
        public Collection<String> getDeniedPermissions() {
            return this.deniedPermissions;
        }

        /* access modifiers changed from: private */
        public Collection<String> getGrantedPermissions() {
            return this.grantedPermissions;
        }

        public Collection<String> getImpossibleToGrantPermissions() {
            return this.impossibleToGrantPermissions;
        }
    }

    public DexterInstance(Context context2, AndroidPermissionService androidPermissionService2, IntentProvider intentProvider2) {
        this.androidPermissionService = androidPermissionService2;
        this.intentProvider = intentProvider2;
        this.pendingPermissions = new TreeSet();
        this.multiplePermissionsReport = new MultiplePermissionsReport();
        this.isRequestingPermission = new AtomicBoolean();
        this.rationaleAccepted = new AtomicBoolean();
        this.isShowingNativeDialog = new AtomicBoolean();
        setContext(context2);
    }

    private void checkMultiplePermissions(final MultiplePermissionsListener multiplePermissionsListener, final Collection<String> collection, Thread thread) {
        checkNoDexterRequestOngoing();
        checkRequestSomePermission(collection);
        if (this.context.get() != null) {
            Activity activity2 = this.activity;
            if (activity2 != null && activity2.isFinishing()) {
                onActivityDestroyed(this.activity);
            }
            this.pendingPermissions.clear();
            this.pendingPermissions.addAll(collection);
            this.multiplePermissionsReport.clear();
            this.listener = new MultiplePermissionListenerThreadDecorator(multiplePermissionsListener, thread);
            if (isEveryPermissionGranted(collection, (Context) this.context.get())) {
                thread.execute(new Runnable() {
                    public void run() {
                        MultiplePermissionsReport multiplePermissionsReport = new MultiplePermissionsReport();
                        for (String from : collection) {
                            multiplePermissionsReport.addGrantedPermissionResponse(PermissionGrantedResponse.from(from));
                        }
                        DexterInstance.this.isRequestingPermission.set(false);
                        multiplePermissionsListener.onPermissionsChecked(multiplePermissionsReport);
                        MultiplePermissionsListener unused = DexterInstance.this.listener = DexterInstance.EMPTY_LISTENER;
                    }
                });
            } else {
                startTransparentActivityIfNeeded();
            }
            thread.loop();
        }
    }

    private void checkNoDexterRequestOngoing() {
        if (this.isRequestingPermission.getAndSet(true)) {
            throw new DexterException("Only one Dexter request at a time is allowed", DexterError.REQUEST_ONGOING);
        }
    }

    private void checkRequestSomePermission(Collection<String> collection) {
        if (collection.isEmpty()) {
            throw new DexterException("Dexter has to be called with at least one permission", DexterError.NO_PERMISSIONS_REQUESTED);
        }
    }

    private int checkSelfPermission(Activity activity2, String str) {
        try {
            return this.androidPermissionService.checkSelfPermission(activity2, str);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    private void checkSinglePermission(PermissionListener permissionListener, String str, Thread thread) {
        checkMultiplePermissions(new MultiplePermissionsListenerToPermissionListenerAdapter(permissionListener), Collections.singleton(str), thread);
    }

    private PermissionStates getPermissionStates(Collection<String> collection) {
        PermissionStates permissionStates = new PermissionStates();
        for (String next : collection) {
            int checkSelfPermission = checkSelfPermission(this.activity, next);
            if (checkSelfPermission == -2) {
                permissionStates.addImpossibleToGrantPermission(next);
            } else if (checkSelfPermission != -1) {
                permissionStates.addGrantedPermission(next);
            } else {
                permissionStates.addDeniedPermission(next);
            }
        }
        return permissionStates;
    }

    private void handleDeniedPermissions(Collection<String> collection) {
        if (!collection.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            for (String next : collection) {
                if (this.androidPermissionService.shouldShowRequestPermissionRationale(this.activity, next)) {
                    linkedList.add(new PermissionRequest(next));
                }
            }
            if (linkedList.isEmpty()) {
                requestPermissionsToSystem(collection);
            } else if (!this.rationaleAccepted.get()) {
                this.listener.onPermissionRationaleShouldBeShown(linkedList, new PermissionRationaleToken(this));
            }
        }
    }

    private boolean isEveryPermissionGranted(Collection<String> collection, Context context2) {
        for (String checkSelfPermission : collection) {
            if (this.androidPermissionService.checkSelfPermission(context2, checkSelfPermission) != 0) {
                return false;
            }
        }
        return true;
    }

    private void onPermissionsChecked(Collection<String> collection) {
        if (!this.pendingPermissions.isEmpty()) {
            synchronized (this.pendingPermissionsMutex) {
                this.pendingPermissions.removeAll(collection);
                if (this.pendingPermissions.isEmpty()) {
                    Activity activity2 = this.activity;
                    if (activity2 != null) {
                        activity2.finish();
                    }
                    this.isRequestingPermission.set(false);
                    this.rationaleAccepted.set(false);
                    this.isShowingNativeDialog.set(false);
                    MultiplePermissionsListener multiplePermissionsListener = this.listener;
                    this.listener = EMPTY_LISTENER;
                    multiplePermissionsListener.onPermissionsChecked(this.multiplePermissionsReport);
                }
            }
        }
    }

    private void requestPermissionsToSystem(Collection<String> collection) {
        if (!this.isShowingNativeDialog.get()) {
            this.androidPermissionService.requestPermissions(this.activity, (String[]) collection.toArray(new String[0]), 42);
        }
        this.isShowingNativeDialog.set(true);
    }

    private void startTransparentActivityIfNeeded() {
        Context context2 = (Context) this.context.get();
        if (context2 != null) {
            Intent intent = this.intentProvider.get(context2, DexterActivity.class);
            if (!(context2 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context2.startActivity(intent);
        }
    }

    private void updatePermissionsAsDenied(Collection<String> collection) {
        for (String next : collection) {
            this.multiplePermissionsReport.addDeniedPermissionResponse(PermissionDeniedResponse.from(next, this.androidPermissionService.isPermissionPermanentlyDenied(this.activity, next)));
        }
        onPermissionsChecked(collection);
    }

    private void updatePermissionsAsGranted(Collection<String> collection) {
        for (String from : collection) {
            this.multiplePermissionsReport.addGrantedPermissionResponse(PermissionGrantedResponse.from(from));
        }
        onPermissionsChecked(collection);
    }

    public void checkPermission(PermissionListener permissionListener, String str, Thread thread) {
        checkSinglePermission(permissionListener, str, thread);
    }

    public void checkPermissions(MultiplePermissionsListener multiplePermissionsListener, Collection<String> collection, Thread thread) {
        checkMultiplePermissions(multiplePermissionsListener, collection, thread);
    }

    public void onActivityDestroyed(Activity activity2) {
        if (this.activity == activity2) {
            this.activity = null;
            this.isRequestingPermission.set(false);
            this.rationaleAccepted.set(false);
            this.isShowingNativeDialog.set(false);
            this.listener = EMPTY_LISTENER;
        }
    }

    public void onActivityReady(Activity activity2) {
        PermissionStates permissionStates;
        this.activity = activity2;
        synchronized (this.pendingPermissionsMutex) {
            permissionStates = activity2 != null ? getPermissionStates(this.pendingPermissions) : null;
        }
        if (permissionStates != null) {
            handleDeniedPermissions(permissionStates.getDeniedPermissions());
            updatePermissionsAsDenied(permissionStates.getImpossibleToGrantPermissions());
            updatePermissionsAsGranted(permissionStates.getGrantedPermissions());
        }
    }

    public void onCancelPermissionRequest() {
        this.rationaleAccepted.set(false);
        updatePermissionsAsDenied(this.pendingPermissions);
    }

    public void onContinuePermissionRequest() {
        this.rationaleAccepted.set(true);
        requestPermissionsToSystem(this.pendingPermissions);
    }

    public void onPermissionRequestDenied(Collection<String> collection) {
        updatePermissionsAsDenied(collection);
    }

    public void onPermissionRequestGranted(Collection<String> collection) {
        updatePermissionsAsGranted(collection);
    }

    public void setContext(Context context2) {
        this.context = new WeakReference<>(context2);
    }
}
