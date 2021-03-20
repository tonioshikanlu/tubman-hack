package b.j.a.c.b0.z;

import b.j.a.c.b0.t;
import b.j.a.c.b0.u;
import java.util.Map;

public abstract class w {
    public final w a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1849b;

    public static final class a extends w {
        public final t c;
        public final String d;

        public a(w wVar, Object obj, t tVar, String str) {
            super(wVar, obj);
            this.c = tVar;
            this.d = str;
        }

        public void a(Object obj) {
            this.c.c(obj, this.d, this.f1849b);
        }
    }

    public static final class b extends w {
        public final Object c;

        public b(w wVar, Object obj, Object obj2) {
            super(wVar, obj);
            this.c = obj2;
        }

        public void a(Object obj) {
            ((Map) obj).put(this.c, this.f1849b);
        }
    }

    public static final class c extends w {
        public final u c;

        public c(w wVar, Object obj, u uVar) {
            super(wVar, obj);
            this.c = uVar;
        }

        public void a(Object obj) {
            this.c.B(obj, this.f1849b);
        }
    }

    public w(w wVar, Object obj) {
        this.a = wVar;
        this.f1849b = obj;
    }

    public abstract void a(Object obj);
}
