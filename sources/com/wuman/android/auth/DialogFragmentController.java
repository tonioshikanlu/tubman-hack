package com.wuman.android.auth;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import b.l.b.a.a.b.b;
import b.l.b.a.a.b.d;
import b.l.b.a.b.c;
import com.google.api.client.auth.oauth.OAuthAuthorizeTemporaryTokenUrl;
import com.wuman.android.auth.DialogFragmentCompat;
import com.wuman.android.auth.oauth2.implicit.ImplicitResponseUrl;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public abstract class DialogFragmentController implements AuthorizationDialogController {
    public String codeOrToken;
    public String error;
    public final FragmentManagerCompat fragmentManager;
    public final boolean fullScreen;
    public final Condition gotAuthorizationResponse;
    public final boolean hideFullScreenTitle;
    public final boolean horizontalProgress;
    public ImplicitResponseUrl implicitResponseUrl;
    public final Lock lock;
    public String progressColor = "#490D82";
    public final Handler uiHandler;

    static {
        Logger.getLogger("OAuthAndroid");
    }

    public DialogFragmentController(FragmentManager fragmentManager2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.gotAuthorizationResponse = reentrantLock.newCondition();
        this.uiHandler = new Handler(Looper.getMainLooper());
        Objects.requireNonNull(fragmentManager2);
        this.fragmentManager = new FragmentManagerCompat(fragmentManager2);
        this.fullScreen = true;
        this.horizontalProgress = true;
        this.hideFullScreenTitle = true;
        this.progressColor = "#490D82";
    }

    public final void dismissDialog() {
        this.uiHandler.post(new Runnable() {
            public void run() {
                DialogFragmentCompat dialogFragmentCompat = (DialogFragmentCompat) DialogFragmentController.this.fragmentManager.findFragmentByTag(DialogFragmentCompat.class, "oauth_dialog");
                if (dialogFragmentCompat != null) {
                    DialogFragment dialogFragment = dialogFragmentCompat.supportDialogFragment;
                    if (dialogFragment != null) {
                        dialogFragment.dismissAllowingStateLoss();
                    } else {
                        dialogFragmentCompat.nativeDialogFragment.dismissAllowingStateLoss();
                    }
                }
            }
        });
    }

    public void requestAuthorization(final b bVar) {
        this.uiHandler.post(new Runnable() {
            public void run() {
                OAuthDialogFragment oAuthDialogFragment;
                DialogFragmentCompat.NativeDialogFragmentImpl nativeDialogFragmentImpl;
                FragmentManager fragmentManager = DialogFragmentController.this.fragmentManager.supportFragmentManager;
                Objects.requireNonNull(fragmentManager);
                if (!fragmentManager.isDestroyed()) {
                    FragmentManager fragmentManager2 = DialogFragmentController.this.fragmentManager.supportFragmentManager;
                    Objects.requireNonNull(fragmentManager2);
                    FragmentTransactionCompat fragmentTransactionCompat = new FragmentTransactionCompat(fragmentManager2.beginTransaction());
                    FragmentCompat findFragmentByTag = DialogFragmentController.this.fragmentManager.findFragmentByTag(FragmentCompat.class, "oauth_dialog");
                    FragmentManager fragmentManager3 = null;
                    if (findFragmentByTag != null) {
                        FragmentTransaction fragmentTransaction = fragmentTransactionCompat.supportFragmentTransaction;
                        if (fragmentTransaction != null) {
                            Object obj = findFragmentByTag.supportFragment;
                            if (obj == null) {
                                obj = findFragmentByTag.nativeFragment;
                            }
                            fragmentTransaction.remove((Fragment) obj);
                        } else {
                            Object obj2 = findFragmentByTag.supportFragment;
                            if (obj2 == null) {
                                obj2 = findFragmentByTag.nativeFragment;
                            }
                            android.app.Fragment fragment = (android.app.Fragment) obj2;
                            throw null;
                        }
                    }
                    c cVar = r2;
                    DialogFragmentController dialogFragmentController = DialogFragmentController.this;
                    Logger logger = OAuthDialogFragment.LOGGER;
                    OAuthDialogFragment.severalScopes = cVar.get("scope") != null && cVar.get("scope").toString().contains(" ");
                    Bundle bundle = new Bundle();
                    bundle.putString("authRequestUrl", cVar.build());
                    bundle.putString("authType", cVar instanceof OAuthAuthorizeTemporaryTokenUrl ? "10a" : cVar instanceof b ? "explicit" : "implicit");
                    FragmentManager fragmentManager4 = dialogFragmentController.fragmentManager.supportFragmentManager;
                    if (fragmentManager4 != null) {
                        fragmentManager3 = fragmentManager4;
                    }
                    if (fragmentManager3 instanceof FragmentManager) {
                        DialogFragment supportDialogFragmentImpl = new DialogFragmentCompat.SupportDialogFragmentImpl();
                        boolean z = dialogFragmentController.fullScreen;
                        boolean z2 = dialogFragmentController.horizontalProgress;
                        boolean z3 = dialogFragmentController.hideFullScreenTitle;
                        oAuthDialogFragment = new OAuthDialogFragment(supportDialogFragmentImpl, z, z2, z3, dialogFragmentController.progressColor);
                        nativeDialogFragmentImpl = supportDialogFragmentImpl;
                        if (z3) {
                            supportDialogFragmentImpl.setStyle(0, 16974390);
                            nativeDialogFragmentImpl = supportDialogFragmentImpl;
                        }
                    } else {
                        DialogFragmentCompat.NativeDialogFragmentImpl nativeDialogFragmentImpl2 = new DialogFragmentCompat.NativeDialogFragmentImpl();
                        boolean z4 = dialogFragmentController.fullScreen;
                        boolean z5 = dialogFragmentController.horizontalProgress;
                        boolean z6 = dialogFragmentController.hideFullScreenTitle;
                        oAuthDialogFragment = new OAuthDialogFragment(nativeDialogFragmentImpl2, z4, z5, z6);
                        nativeDialogFragmentImpl = nativeDialogFragmentImpl2;
                        if (z6) {
                            nativeDialogFragmentImpl2.setStyle(0, 16973834);
                            nativeDialogFragmentImpl = nativeDialogFragmentImpl2;
                        }
                    }
                    nativeDialogFragmentImpl.setDialogFragmentCompat(oAuthDialogFragment);
                    Fragment fragment2 = oAuthDialogFragment.supportFragment;
                    if (fragment2 != null) {
                        fragment2.setArguments(bundle);
                    } else {
                        oAuthDialogFragment.nativeFragment.setArguments(bundle);
                    }
                    oAuthDialogFragment.mController = dialogFragmentController;
                    if (oAuthDialogFragment.supportDialogFragment != null) {
                        ((FragmentTransaction) fragmentTransactionCompat.getFragmentTransaction()).add((Fragment) oAuthDialogFragment.supportDialogFragment, "oauth_dialog");
                        ((FragmentTransaction) fragmentTransactionCompat.getFragmentTransaction()).commitAllowingStateLoss();
                        return;
                    }
                    ((android.app.FragmentTransaction) fragmentTransactionCompat.getFragmentTransaction()).add(oAuthDialogFragment.nativeDialogFragment, "oauth_dialog");
                    ((android.app.FragmentTransaction) fragmentTransactionCompat.getFragmentTransaction()).commitAllowingStateLoss();
                }
            }
        });
    }

    public void set(String str, String str2, ImplicitResponseUrl implicitResponseUrl2, boolean z) {
        this.lock.lock();
        try {
            this.error = str2;
            this.codeOrToken = str;
            this.implicitResponseUrl = implicitResponseUrl2;
            if (z) {
                this.gotAuthorizationResponse.signal();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void stop() {
        set((String) null, (String) null, (ImplicitResponseUrl) null, true);
        dismissDialog();
    }

    public String waitForExplicitCode() {
        this.lock.lock();
        while (this.codeOrToken == null && this.error == null) {
            try {
                this.gotAuthorizationResponse.awaitUninterruptibly();
            } finally {
                this.lock.unlock();
            }
        }
        dismissDialog();
        String str = this.error;
        if (str == null) {
            return this.codeOrToken;
        }
        if (TextUtils.equals("user_cancelled", str)) {
            throw new CancellationException("User authorization failed (" + this.error + ")");
        }
        throw new IOException("User authorization failed (" + this.error + ")");
    }

    public ImplicitResponseUrl waitForImplicitResponseUrl() {
        this.lock.lock();
        while (this.codeOrToken == null && this.error == null) {
            try {
                this.gotAuthorizationResponse.awaitUninterruptibly();
            } finally {
                this.lock.unlock();
            }
        }
        dismissDialog();
        String str = this.error;
        if (str == null) {
            return this.implicitResponseUrl;
        }
        if (TextUtils.equals("user_cancelled", str)) {
            throw new CancellationException("User authorization failed (" + this.error + ")");
        }
        throw new IOException("User authorization failed (" + this.error + ")");
    }

    public void requestAuthorization(final d dVar) {
        this.uiHandler.post(new Runnable() {
            public void run() {
                OAuthDialogFragment oAuthDialogFragment;
                DialogFragmentCompat.NativeDialogFragmentImpl nativeDialogFragmentImpl;
                FragmentManager fragmentManager = DialogFragmentController.this.fragmentManager.supportFragmentManager;
                Objects.requireNonNull(fragmentManager);
                if (!fragmentManager.isDestroyed()) {
                    FragmentManager fragmentManager2 = DialogFragmentController.this.fragmentManager.supportFragmentManager;
                    Objects.requireNonNull(fragmentManager2);
                    FragmentTransactionCompat fragmentTransactionCompat = new FragmentTransactionCompat(fragmentManager2.beginTransaction());
                    FragmentCompat findFragmentByTag = DialogFragmentController.this.fragmentManager.findFragmentByTag(FragmentCompat.class, "oauth_dialog");
                    FragmentManager fragmentManager3 = null;
                    if (findFragmentByTag != null) {
                        FragmentTransaction fragmentTransaction = fragmentTransactionCompat.supportFragmentTransaction;
                        if (fragmentTransaction != null) {
                            Object obj = findFragmentByTag.supportFragment;
                            if (obj == null) {
                                obj = findFragmentByTag.nativeFragment;
                            }
                            fragmentTransaction.remove((Fragment) obj);
                        } else {
                            Object obj2 = findFragmentByTag.supportFragment;
                            if (obj2 == null) {
                                obj2 = findFragmentByTag.nativeFragment;
                            }
                            android.app.Fragment fragment = (android.app.Fragment) obj2;
                            throw null;
                        }
                    }
                    c cVar = dVar;
                    DialogFragmentController dialogFragmentController = DialogFragmentController.this;
                    Logger logger = OAuthDialogFragment.LOGGER;
                    OAuthDialogFragment.severalScopes = cVar.get("scope") != null && cVar.get("scope").toString().contains(" ");
                    Bundle bundle = new Bundle();
                    bundle.putString("authRequestUrl", cVar.build());
                    bundle.putString("authType", cVar instanceof OAuthAuthorizeTemporaryTokenUrl ? "10a" : cVar instanceof b ? "explicit" : "implicit");
                    FragmentManager fragmentManager4 = dialogFragmentController.fragmentManager.supportFragmentManager;
                    if (fragmentManager4 != null) {
                        fragmentManager3 = fragmentManager4;
                    }
                    if (fragmentManager3 instanceof FragmentManager) {
                        DialogFragment supportDialogFragmentImpl = new DialogFragmentCompat.SupportDialogFragmentImpl();
                        boolean z = dialogFragmentController.fullScreen;
                        boolean z2 = dialogFragmentController.horizontalProgress;
                        boolean z3 = dialogFragmentController.hideFullScreenTitle;
                        oAuthDialogFragment = new OAuthDialogFragment(supportDialogFragmentImpl, z, z2, z3, dialogFragmentController.progressColor);
                        nativeDialogFragmentImpl = supportDialogFragmentImpl;
                        if (z3) {
                            supportDialogFragmentImpl.setStyle(0, 16974390);
                            nativeDialogFragmentImpl = supportDialogFragmentImpl;
                        }
                    } else {
                        DialogFragmentCompat.NativeDialogFragmentImpl nativeDialogFragmentImpl2 = new DialogFragmentCompat.NativeDialogFragmentImpl();
                        boolean z4 = dialogFragmentController.fullScreen;
                        boolean z5 = dialogFragmentController.horizontalProgress;
                        boolean z6 = dialogFragmentController.hideFullScreenTitle;
                        oAuthDialogFragment = new OAuthDialogFragment(nativeDialogFragmentImpl2, z4, z5, z6);
                        nativeDialogFragmentImpl = nativeDialogFragmentImpl2;
                        if (z6) {
                            nativeDialogFragmentImpl2.setStyle(0, 16973834);
                            nativeDialogFragmentImpl = nativeDialogFragmentImpl2;
                        }
                    }
                    nativeDialogFragmentImpl.setDialogFragmentCompat(oAuthDialogFragment);
                    Fragment fragment2 = oAuthDialogFragment.supportFragment;
                    if (fragment2 != null) {
                        fragment2.setArguments(bundle);
                    } else {
                        oAuthDialogFragment.nativeFragment.setArguments(bundle);
                    }
                    oAuthDialogFragment.mController = dialogFragmentController;
                    if (oAuthDialogFragment.supportDialogFragment != null) {
                        ((FragmentTransaction) fragmentTransactionCompat.getFragmentTransaction()).add((Fragment) oAuthDialogFragment.supportDialogFragment, "oauth_dialog");
                        ((FragmentTransaction) fragmentTransactionCompat.getFragmentTransaction()).commitAllowingStateLoss();
                        return;
                    }
                    ((android.app.FragmentTransaction) fragmentTransactionCompat.getFragmentTransaction()).add(oAuthDialogFragment.nativeDialogFragment, "oauth_dialog");
                    ((android.app.FragmentTransaction) fragmentTransactionCompat.getFragmentTransaction()).commitAllowingStateLoss();
                }
            }
        });
    }
}
