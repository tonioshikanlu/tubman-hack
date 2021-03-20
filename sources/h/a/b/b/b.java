package h.a.b.b;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserProtocol;
import h.a.b.b.a;
import h.a.b.b.g.b;
import java.util.Objects;

public class b<T extends a> extends MediaBrowser.ConnectionCallback {
    public final T a;

    public b(T t) {
        this.a = t;
    }

    public void onConnected() {
        MediaBrowserCompat.b.C0000b bVar = (MediaBrowserCompat.b.C0000b) this.a;
        MediaBrowserCompat.b.a aVar = MediaBrowserCompat.b.this.mConnectionCallbackInternal;
        if (aVar != null) {
            MediaBrowserCompat.d dVar = (MediaBrowserCompat.d) aVar;
            Bundle extras = ((MediaBrowser) dVar.f5b).getExtras();
            if (extras != null) {
                extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                if (binder != null) {
                    dVar.f = new MediaBrowserCompat.h(binder, dVar.c);
                    Messenger messenger = new Messenger(dVar.d);
                    dVar.f7g = messenger;
                    dVar.d.a(messenger);
                    try {
                        MediaBrowserCompat.h hVar = dVar.f;
                        Context context = dVar.a;
                        Messenger messenger2 = dVar.f7g;
                        Objects.requireNonNull(hVar);
                        Bundle bundle = new Bundle();
                        bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
                        bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, hVar.f9b);
                        hVar.a(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                h.a.b.b.g.b g2 = b.a.g(BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
                if (g2 != null) {
                    dVar.f8h = MediaSessionCompat.Token.a(((MediaBrowser) dVar.f5b).getSessionToken(), g2);
                }
            }
        }
        MediaBrowserCompat.b.this.onConnected();
    }

    public void onConnectionFailed() {
        MediaBrowserCompat.b bVar = MediaBrowserCompat.b.this;
        MediaBrowserCompat.b.a aVar = bVar.mConnectionCallbackInternal;
        if (aVar != null) {
            MediaBrowserCompat.d dVar = (MediaBrowserCompat.d) aVar;
        }
        bVar.onConnectionFailed();
    }

    public void onConnectionSuspended() {
        MediaBrowserCompat.b.C0000b bVar = (MediaBrowserCompat.b.C0000b) this.a;
        MediaBrowserCompat.b.a aVar = MediaBrowserCompat.b.this.mConnectionCallbackInternal;
        if (aVar != null) {
            MediaBrowserCompat.d dVar = (MediaBrowserCompat.d) aVar;
            dVar.f = null;
            dVar.f7g = null;
            dVar.f8h = null;
            dVar.d.a((Messenger) null);
        }
        MediaBrowserCompat.b.this.onConnectionSuspended();
    }
}
