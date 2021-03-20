package b.h.a.s;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    public final long f1007h;

    /* renamed from: i  reason: collision with root package name */
    public int f1008i;

    public c(@NonNull InputStream inputStream, long j2) {
        super(inputStream);
        this.f1007h = j2;
    }

    public synchronized int available() {
        return (int) Math.max(this.f1007h - ((long) this.f1008i), (long) this.in.available());
    }

    public final int b(int i2) {
        if (i2 >= 0) {
            this.f1008i += i2;
        } else if (this.f1007h - ((long) this.f1008i) > 0) {
            StringBuilder y = a.y("Failed to read all expected data, expected: ");
            y.append(this.f1007h);
            y.append(", but read: ");
            y.append(this.f1008i);
            throw new IOException(y.toString());
        }
        return i2;
    }

    public synchronized int read() {
        int read;
        read = super.read();
        b(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i2, int i3) {
        int read;
        read = super.read(bArr, i2, i3);
        b(read);
        return read;
    }
}
