package b.l.a.d.a.b;

import java.io.InputStream;

public final class u extends InputStream {

    /* renamed from: h  reason: collision with root package name */
    public final InputStream f4632h;

    /* renamed from: i  reason: collision with root package name */
    public long f4633i;

    public u(InputStream inputStream, long j2) {
        this.f4632h = inputStream;
        this.f4633i = j2;
    }

    public final void close() {
        super.close();
        this.f4632h.close();
        this.f4633i = 0;
    }

    public final int read() {
        long j2 = this.f4633i;
        if (j2 <= 0) {
            return -1;
        }
        this.f4633i = j2 - 1;
        return this.f4632h.read();
    }

    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.f4633i;
        if (j2 <= 0) {
            return -1;
        }
        int read = this.f4632h.read(bArr, i2, (int) Math.min((long) i3, j2));
        if (read != -1) {
            this.f4633i -= (long) read;
        }
        return read;
    }
}
