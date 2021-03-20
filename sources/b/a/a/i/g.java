package b.a.a.i;

import android.media.MediaPlayer;
import android.os.Handler;
import b.e.a.a.a;
import e.x.c.i;

public final class g {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f316b;
    public final MediaPlayer c;
    public Handler d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f317e;

    public g(String str, String str2, MediaPlayer mediaPlayer, Handler handler, boolean z) {
        i.e(mediaPlayer, "mediaPlayer");
        i.e(handler, "handler");
        this.a = str;
        this.f316b = str2;
        this.c = mediaPlayer;
        this.d = handler;
        this.f317e = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return i.a(this.a, gVar.a) && i.a(this.f316b, gVar.f316b) && i.a(this.c, gVar.c) && i.a(this.d, gVar.d) && this.f317e == gVar.f317e;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f316b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        MediaPlayer mediaPlayer = this.c;
        int hashCode3 = (hashCode2 + (mediaPlayer != null ? mediaPlayer.hashCode() : 0)) * 31;
        Handler handler = this.d;
        if (handler != null) {
            i2 = handler.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z = this.f317e;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder y = a.y("MediaPlayerInContainer(audioUrl=");
        y.append(this.a);
        y.append(", containerId=");
        y.append(this.f316b);
        y.append(", mediaPlayer=");
        y.append(this.c);
        y.append(", handler=");
        y.append(this.d);
        y.append(", runInBackground=");
        return a.s(y, this.f317e, ")");
    }
}
