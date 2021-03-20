package b.l.b.a.d;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class q extends FilterOutputStream {

    /* renamed from: h  reason: collision with root package name */
    public final o f4826h;

    public q(OutputStream outputStream, Logger logger, Level level, int i2) {
        super(outputStream);
        this.f4826h = new o(logger, level, i2);
    }

    public void close() {
        this.f4826h.close();
        super.close();
    }

    public void write(int i2) {
        this.out.write(i2);
        this.f4826h.write(i2);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.out.write(bArr, i2, i3);
        this.f4826h.write(bArr, i2, i3);
    }
}
