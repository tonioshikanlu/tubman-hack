package b.a.a.b.m;

import android.media.MediaPlayer;
import e.x.c.i;

public final class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f201h;

    public b(a aVar) {
        this.f201h = aVar;
    }

    public final void run() {
        MediaPlayer mediaPlayer = this.f201h.f182h;
        if (mediaPlayer != null) {
            i.c(mediaPlayer);
            mediaPlayer.reset();
            MediaPlayer mediaPlayer2 = this.f201h.f182h;
            i.c(mediaPlayer2);
            mediaPlayer2.release();
            this.f201h.f182h = null;
        }
    }
}
