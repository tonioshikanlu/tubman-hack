package b.h.a.m.u;

import androidx.annotation.NonNull;
import b.h.a.m.u.e;
import b.h.a.m.v.c0.b;
import b.h.a.m.x.c.w;
import java.io.InputStream;

public final class k implements e<InputStream> {
    public final w a;

    public static final class a implements e.a<InputStream> {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @NonNull
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @NonNull
        public e b(Object obj) {
            return new k((InputStream) obj, this.a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        w wVar = new w(inputStream, bVar);
        this.a = wVar;
        wVar.mark(5242880);
    }

    public void b() {
        this.a.e();
    }

    @NonNull
    /* renamed from: c */
    public InputStream a() {
        this.a.reset();
        return this.a;
    }
}
