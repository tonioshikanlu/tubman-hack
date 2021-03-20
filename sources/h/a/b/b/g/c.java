package h.a.b.b.g;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import h.a.b.b.g.a;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class c implements IBinder.DeathRecipient {
    public a a;

    public static class a implements f {
        public final WeakReference<c> a;

        public a(c cVar) {
            this.a = new WeakReference<>(cVar);
        }
    }

    public static class b extends a.C0153a {
        public final WeakReference<c> a;

        public b(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        public void A() {
            c cVar = (c) this.a.get();
        }

        public void B(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = (c) this.a.get();
        }

        public void j0(Bundle bundle) {
            c cVar = (c) this.a.get();
        }

        public void m1(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = (c) this.a.get();
        }

        public void p0(List<MediaSessionCompat.QueueItem> list) {
            c cVar = (c) this.a.get();
        }

        public void s(CharSequence charSequence) {
            c cVar = (c) this.a.get();
        }
    }

    public c() {
        new g(new a(this));
    }

    public void binderDied() {
    }
}
