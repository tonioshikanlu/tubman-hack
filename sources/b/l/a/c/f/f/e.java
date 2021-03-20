package b.l.a.c.f.f;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class e extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    public long f3447h;

    /* renamed from: i  reason: collision with root package name */
    public long f3448i = -1;

    public e(InputStream inputStream) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        this.f3447h = 1048576;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f3447h);
    }

    public final synchronized void mark(int i2) {
        this.in.mark(i2);
        this.f3448i = this.f3447h;
    }

    public final int read() {
        if (this.f3447h == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f3447h--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.f3447h;
        if (j2 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i2, (int) Math.min((long) i3, j2));
        if (read != -1) {
            this.f3447h -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f3448i != -1) {
            this.in.reset();
            this.f3447h = this.f3448i;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j2) {
        long skip = this.in.skip(Math.min(j2, this.f3447h));
        this.f3447h -= skip;
        return skip;
    }
}
