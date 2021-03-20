package b.j.a.c.j0;

import java.io.OutputStream;
import java.nio.ByteBuffer;

public class f extends OutputStream {

    /* renamed from: h  reason: collision with root package name */
    public final ByteBuffer f2211h;

    public f(ByteBuffer byteBuffer) {
        this.f2211h = byteBuffer;
    }

    public void write(int i2) {
        this.f2211h.put((byte) i2);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.f2211h.put(bArr, i2, i3);
    }
}
