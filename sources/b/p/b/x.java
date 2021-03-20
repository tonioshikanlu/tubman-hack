package b.p.b;

import b.e.a.a.a;
import b.p.b.a0.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import o.g;

public abstract class x implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public Reader f6775h;

    /* JADX INFO: finally extract failed */
    public final String H() {
        long e2 = e();
        if (e2 <= 2147483647L) {
            g z = z();
            try {
                byte[] A = z.A();
                i.c(z);
                if (e2 == -1 || e2 == ((long) A.length)) {
                    q q2 = q();
                    return new String(A, (q2 != null ? q2.a(i.c) : i.c).name());
                }
                throw new IOException("Content-Length and stream length disagree");
            } catch (Throwable th) {
                i.c(z);
                throw th;
            }
        } else {
            throw new IOException(a.j("Cannot buffer entire body for content length: ", e2));
        }
    }

    public final Reader b() {
        Reader reader = this.f6775h;
        if (reader == null) {
            InputStream j0 = z().j0();
            q q2 = q();
            reader = new InputStreamReader(j0, q2 != null ? q2.a(i.c) : i.c);
            this.f6775h = reader;
        }
        return reader;
    }

    public void close() {
        z().close();
    }

    public abstract long e();

    public abstract q q();

    public abstract g z();
}
