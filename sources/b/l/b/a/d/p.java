package b.l.b.a.d;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class p extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    public final o f4825h;

    public p(InputStream inputStream, Logger logger, Level level, int i2) {
        super(inputStream);
        this.f4825h = new o(logger, level, i2);
    }

    public void close() {
        this.f4825h.close();
        super.close();
    }

    public int read() {
        int read = super.read();
        this.f4825h.write(read);
        return read;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = super.read(bArr, i2, i3);
        if (read > 0) {
            this.f4825h.write(bArr, i2, read);
        }
        return read;
    }
}
