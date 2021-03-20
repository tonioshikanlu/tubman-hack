package b.h.a.m.w.y;

import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.w.g;
import b.h.a.m.w.n;
import b.h.a.m.w.o;
import b.h.a.m.w.r;
import java.io.InputStream;
import java.net.URL;

public class f implements n<URL, InputStream> {
    public final n<g, InputStream> a;

    public static class a implements o<URL, InputStream> {
        @NonNull
        public n<URL, InputStream> b(r rVar) {
            return new f(rVar.b(g.class, InputStream.class));
        }
    }

    public f(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        return this.a.a(new g((URL) obj), i2, i3, pVar);
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj) {
        URL url = (URL) obj;
        return true;
    }
}
