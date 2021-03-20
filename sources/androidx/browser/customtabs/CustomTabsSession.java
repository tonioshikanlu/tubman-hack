package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsSessionToken;
import h.a.a.a;
import h.a.a.b;
import java.util.List;

public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    private final a mCallback;
    private final ComponentName mComponentName;
    private final Object mLock = new Object();
    private final b mService;

    public CustomTabsSession(b bVar, a aVar, ComponentName componentName) {
        this.mService = bVar;
        this.mCallback = aVar;
        this.mComponentName = componentName;
    }

    @VisibleForTesting
    @NonNull
    public static CustomTabsSession createMockSessionForTesting(@NonNull ComponentName componentName) {
        return new CustomTabsSession((b) null, new CustomTabsSessionToken.MockCallback(), componentName);
    }

    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(String str, Bundle bundle) {
        int postMessage;
        synchronized (this.mLock) {
            try {
                postMessage = this.mService.postMessage(this.mCallback, str, bundle);
            } catch (RemoteException unused) {
                return -2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return postMessage;
    }

    public boolean requestPostMessageChannel(Uri uri) {
        try {
            return this.mService.requestPostMessageChannel(this.mCallback, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setActionButton(@NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(@Nullable RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i2, @NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i2);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i2, @NonNull Uri uri, @Nullable Bundle bundle) {
        if (i2 >= 1 && i2 <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i2, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
