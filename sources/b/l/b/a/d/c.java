package b.l.b.a.d;

import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: h  reason: collision with root package name */
    public long f4780h;

    public void write(int i2) {
        this.f4780h++;
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.f4780h += (long) i3;
    }
}
