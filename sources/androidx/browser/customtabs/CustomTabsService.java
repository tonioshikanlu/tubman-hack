package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import h.a.a.a;
import h.a.a.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    private b.a mBinder = new b.a() {
        public Bundle extraCommand(String str, Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        public boolean mayLaunchUrl(a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new CustomTabsSessionToken(aVar), uri, bundle, list);
        }

        public boolean newSession(a aVar) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(aVar);
            try {
                AnonymousClass1 r2 = new IBinder.DeathRecipient() {
                    public void binderDied() {
                        CustomTabsService.this.cleanUpSession(customTabsSessionToken);
                    }
                };
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    aVar.asBinder().linkToDeath(r2, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(aVar.asBinder(), r2);
                }
                return CustomTabsService.this.newSession(customTabsSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        public int postMessage(a aVar, String str, Bundle bundle) {
            return CustomTabsService.this.postMessage(new CustomTabsSessionToken(aVar), str, bundle);
        }

        public boolean requestPostMessageChannel(a aVar, Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(aVar), uri);
        }

        public boolean updateVisuals(a aVar, Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new CustomTabsSessionToken(aVar), bundle);
        }

        public boolean validateRelationship(a aVar, int i2, Uri uri, Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new CustomTabsSessionToken(aVar), i2, uri, bundle);
        }

        public boolean warmup(long j2) {
            return CustomTabsService.this.warmup(j2);
        }
    };
    public final Map<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new ArrayMap();

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public boolean cleanUpSession(CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.mDeathRecipientMap) {
                IBinder callbackBinder = customTabsSessionToken.getCallbackBinder();
                callbackBinder.unlinkToDeath(this.mDeathRecipientMap.get(callbackBinder), 0);
                this.mDeathRecipientMap.remove(callbackBinder);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public abstract Bundle extraCommand(String str, Bundle bundle);

    public abstract boolean mayLaunchUrl(CustomTabsSessionToken customTabsSessionToken, Uri uri, Bundle bundle, List<Bundle> list);

    public abstract boolean newSession(CustomTabsSessionToken customTabsSessionToken);

    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public abstract int postMessage(CustomTabsSessionToken customTabsSessionToken, String str, Bundle bundle);

    public abstract boolean requestPostMessageChannel(CustomTabsSessionToken customTabsSessionToken, Uri uri);

    public abstract boolean updateVisuals(CustomTabsSessionToken customTabsSessionToken, Bundle bundle);

    public abstract boolean validateRelationship(CustomTabsSessionToken customTabsSessionToken, int i2, Uri uri, Bundle bundle);

    public abstract boolean warmup(long j2);
}
