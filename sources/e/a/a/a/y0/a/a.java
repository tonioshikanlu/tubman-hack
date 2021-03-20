package e.a.a.a.y0.a;

import e.a.a.a.y0.b.b1.b;
import e.a.a.a.y0.b.b1.c;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.z;
import e.a.a.a.y0.l.m;
import e.f;
import e.g;
import e.x.c.i;
import e.x.c.k;
import java.util.ServiceLoader;

public interface a {
    public static final C0135a a = C0135a.f7638b;

    /* renamed from: e.a.a.a.y0.a.a$a  reason: collision with other inner class name */
    public static final class C0135a {
        public static final f a = b.q.a.a.g2(g.PUBLICATION, C0136a.f7639h);

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ C0135a f7638b = new C0135a();

        /* renamed from: e.a.a.a.y0.a.a$a$a  reason: collision with other inner class name */
        public static final class C0136a extends k implements e.x.b.a<a> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0136a f7639h = new C0136a();

            public C0136a() {
                super(0);
            }

            public Object e() {
                Class<a> cls = a.class;
                ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
                i.d(load, "implementations");
                a aVar = (a) e.t.g.p(load);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }
    }

    z a(m mVar, w wVar, Iterable<? extends b> iterable, c cVar, e.a.a.a.y0.b.b1.a aVar, boolean z);
}
