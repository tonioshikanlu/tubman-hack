package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import h.a.b.b.g.b;
import h.a.b.b.g.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RequiresApi(21)
public class MediaControllerCompat$MediaControllerImplApi21 {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f25b = new Object();
    @GuardedBy("mLock")
    public final List<c> c = new ArrayList();
    public HashMap<c, a> d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final MediaSessionCompat.Token f26e;

    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: h  reason: collision with root package name */
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> f27h;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super((Handler) null);
            this.f27h = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        public void onReceiveResult(int i2, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f27h.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f25b) {
                    mediaControllerCompat$MediaControllerImplApi21.f26e.f33i = b.a.g(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    MediaSessionCompat.Token token = mediaControllerCompat$MediaControllerImplApi21.f26e;
                    bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                    Objects.requireNonNull(token);
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    public static class a extends c.b {
        public a(c cVar) {
            super(cVar);
        }

        public void A() {
            throw new AssertionError();
        }

        public void B(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        public void j0(Bundle bundle) {
            throw new AssertionError();
        }

        public void m1(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        public void p0(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        public void s(CharSequence charSequence) {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        this.f26e = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f32h);
        this.a = mediaController;
        if (token.f33i == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    @GuardedBy("mLock")
    public void a() {
        if (this.f26e.f33i != null) {
            for (c next : this.c) {
                a aVar = new a(next);
                this.d.put(next, aVar);
                next.a = aVar;
                try {
                    this.f26e.f33i.y(aVar);
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                }
            }
            this.c.clear();
        }
    }
}
