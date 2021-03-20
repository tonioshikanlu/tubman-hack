package b.h.a.m.x.c;

import android.media.MediaDataSource;
import b.h.a.m.x.c.b0;
import java.nio.ByteBuffer;

public class c0 extends MediaDataSource {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f851h;

    public c0(b0.d dVar, ByteBuffer byteBuffer) {
        this.f851h = byteBuffer;
    }

    public void close() {
    }

    public long getSize() {
        return (long) this.f851h.limit();
    }

    public int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (j2 >= ((long) this.f851h.limit())) {
            return -1;
        }
        this.f851h.position((int) j2);
        int min = Math.min(i3, this.f851h.remaining());
        this.f851h.get(bArr, i2, min);
        return min;
    }
}
