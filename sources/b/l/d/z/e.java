package b.l.d.z;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import b.l.a.c.f.f.d;
import b.l.a.c.f.f.g;
import b.l.a.c.k.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class e implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public final URL f5409h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public h<Bitmap> f5410i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public volatile InputStream f5411j;

    public e(URL url) {
        this.f5409h = url;
    }

    public static void b(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                g.a.a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    public final void close() {
        InputStream inputStream = this.f5411j;
        Logger logger = d.a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                try {
                    d.a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e2);
                } catch (IOException e3) {
                    throw new AssertionError(e3);
                }
            }
        }
    }
}
