package b.l.b.a.c;

import b.l.b.a.c.j.b;
import b.l.b.a.d.d;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;

public abstract class c {
    public abstract d a(OutputStream outputStream, Charset charset);

    public abstract f b(InputStream inputStream, Charset charset);

    public abstract f c(Reader reader);

    public abstract f d(String str);

    public final String e(Object obj, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d a = a(byteArrayOutputStream, d.a);
        if (z) {
            ((b) a).f4767h.g0();
        }
        a.b(false, obj);
        ((b) a).f4767h.flush();
        return byteArrayOutputStream.toString("UTF-8");
    }
}
