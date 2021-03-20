package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.media.MediaBrowserServiceCompat;
import b.e.a.a.a;
import h.a.b.b.g.b;
import h.a.b.b.g.e;
import java.util.HashSet;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {
    private static final String TAG = "MediaButtonReceiver";

    public static class MediaButtonConnectionCallback extends MediaBrowserCompat.b {
        private final Context mContext;
        private final Intent mIntent;
        private MediaBrowserCompat mMediaBrowser;
        private final BroadcastReceiver.PendingResult mPendingResult;

        public MediaButtonConnectionCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.mContext = context;
            this.mIntent = intent;
            this.mPendingResult = pendingResult;
        }

        private void finish() {
            Messenger messenger;
            MediaBrowserCompat.d dVar = (MediaBrowserCompat.d) this.mMediaBrowser.a;
            MediaBrowserCompat.h hVar = dVar.f;
            if (!(hVar == null || (messenger = dVar.f7g) == null)) {
                try {
                    hVar.a(7, (Bundle) null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            ((MediaBrowser) dVar.f5b).disconnect();
            this.mPendingResult.finish();
        }

        public void onConnected() {
            try {
                Context context = this.mContext;
                MediaBrowserCompat.d dVar = (MediaBrowserCompat.d) this.mMediaBrowser.a;
                if (dVar.f8h == null) {
                    dVar.f8h = MediaSessionCompat.Token.a(((MediaBrowser) dVar.f5b).getSessionToken(), (b) null);
                }
                MediaSessionCompat.Token token = dVar.f8h;
                new HashSet();
                if (token != null) {
                    e eVar = new e(context, token);
                    KeyEvent keyEvent = (KeyEvent) this.mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (keyEvent != null) {
                        ((MediaController) eVar.a).dispatchMediaButtonEvent(keyEvent);
                        finish();
                        return;
                    }
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                throw new IllegalArgumentException("sessionToken must not be null");
            } catch (RemoteException e2) {
                Log.e(MediaButtonReceiver.TAG, "Failed to create a media controller", e2);
            }
        }

        public void onConnectionFailed() {
            finish();
        }

        public void onConnectionSuspended() {
            finish();
        }

        public void setMediaBrowser(MediaBrowserCompat mediaBrowserCompat) {
            this.mMediaBrowser = mediaBrowserCompat;
        }
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, long j2) {
        ComponentName mediaButtonReceiverComponent = getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent != null) {
            return buildMediaButtonPendingIntent(context, mediaButtonReceiverComponent, j2);
        }
        Log.w(TAG, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
        return null;
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, ComponentName componentName, long j2) {
        String str;
        if (componentName == null) {
            str = "The component name of media button receiver should be provided.";
        } else {
            int i2 = j2 == 4 ? 126 : j2 == 2 ? 127 : j2 == 32 ? 87 : j2 == 16 ? 88 : j2 == 1 ? 86 : j2 == 64 ? 90 : j2 == 8 ? 89 : j2 == 512 ? 85 : 0;
            if (i2 == 0) {
                str = "Cannot build a media button pending intent with the given action: " + j2;
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i2));
                return PendingIntent.getBroadcast(context, i2, intent, 0);
            }
        }
        Log.w(TAG, str);
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ComponentName getMediaButtonReceiverComponent(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() <= 1) {
            return null;
        } else {
            Log.w(TAG, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
    }

    private static ComponentName getServiceComponentByAction(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder C = a.C("Expected 1 service that handles ", str, ", found ");
            C.append(queryIntentServices.size());
            throw new IllegalStateException(C.toString());
        }
    }

    public static KeyEvent handleIntent(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        throw null;
    }

    private static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d(TAG, "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
        if (serviceComponentByAction != null) {
            intent.setComponent(serviceComponentByAction);
            startForegroundService(context, intent);
            return;
        }
        ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, MediaBrowserServiceCompat.SERVICE_INTERFACE);
        if (serviceComponentByAction2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, serviceComponentByAction2, mediaButtonConnectionCallback, (Bundle) null);
            mediaButtonConnectionCallback.setMediaBrowser(mediaBrowserCompat);
            ((MediaBrowser) ((MediaBrowserCompat.d) mediaBrowserCompat.a).f5b).connect();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
