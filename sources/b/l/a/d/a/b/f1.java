package b.l.a.d.a.b;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

public final class f1 extends InputStream {

    /* renamed from: h  reason: collision with root package name */
    public final Enumeration<File> f4539h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public InputStream f4540i;

    public f1(Enumeration<File> enumeration) {
        this.f4539h = enumeration;
        b();
    }

    public final void b() {
        InputStream inputStream = this.f4540i;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f4540i = this.f4539h.hasMoreElements() ? new FileInputStream(this.f4539h.nextElement()) : null;
    }

    public final void close() {
        super.close();
        InputStream inputStream = this.f4540i;
        if (inputStream != null) {
            inputStream.close();
            this.f4540i = null;
        }
    }

    public final int read() {
        while (true) {
            InputStream inputStream = this.f4540i;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            b();
        }
    }

    public final int read(byte[] bArr, int i2, int i3) {
        if (this.f4540i == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        } else if (i3 == 0) {
            return 0;
        } else {
            do {
                int read = this.f4540i.read(bArr, i2, i3);
                if (read > 0) {
                    return read;
                }
                b();
            } while (this.f4540i != null);
            return -1;
        }
    }
}
