package b.l.b.a.b;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class b extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    public boolean f4716h = false;

    public b(InputStream inputStream) {
        super(inputStream);
    }

    public void close() {
        if (!this.f4716h && this.in != null) {
            try {
                int i2 = b.l.c.c.b.a;
                while (((long) read(new byte[8192])) != -1) {
                }
                this.in.close();
            } finally {
                this.f4716h = true;
            }
        }
    }
}
