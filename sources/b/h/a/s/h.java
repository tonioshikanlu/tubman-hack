package b.h.a.s;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.InputStream;

public class h extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    public int f1016h = Integer.MIN_VALUE;

    public h(@NonNull InputStream inputStream) {
        super(inputStream);
    }

    public int available() {
        int i2 = this.f1016h;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    public final long b(long j2) {
        int i2 = this.f1016h;
        if (i2 == 0) {
            return -1;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : (long) i2;
    }

    public final void e(long j2) {
        int i2 = this.f1016h;
        if (i2 != Integer.MIN_VALUE && j2 != -1) {
            this.f1016h = (int) (((long) i2) - j2);
        }
    }

    public synchronized void mark(int i2) {
        super.mark(i2);
        this.f1016h = i2;
    }

    public int read() {
        if (b(1) == -1) {
            return -1;
        }
        int read = super.read();
        e(1);
        return read;
    }

    public int read(@NonNull byte[] bArr, int i2, int i3) {
        int b2 = (int) b((long) i3);
        if (b2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i2, b2);
        e((long) read);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f1016h = Integer.MIN_VALUE;
    }

    public long skip(long j2) {
        long b2 = b(j2);
        if (b2 == -1) {
            return 0;
        }
        long skip = super.skip(b2);
        e(skip);
        return skip;
    }
}
