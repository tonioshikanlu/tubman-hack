package b.j.a.c.j0;

import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class e extends InputStream {

    /* renamed from: h  reason: collision with root package name */
    public final ByteBuffer f2210h;

    public e(ByteBuffer byteBuffer) {
        this.f2210h = byteBuffer;
    }

    public int available() {
        return this.f2210h.remaining();
    }

    public int read() {
        if (this.f2210h.hasRemaining()) {
            return this.f2210h.get() & ExifInterface.MARKER;
        }
        return -1;
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (!this.f2210h.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i3, this.f2210h.remaining());
        this.f2210h.get(bArr, i2, min);
        return min;
    }
}
