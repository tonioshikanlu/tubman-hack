package e.a.a.a.y0.b.d1.a;

import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.d.b.k;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.k.b.f0.a;
import e.a.a.a.y0.k.b.f0.d;
import e.c0.h;
import e.x.c.i;
import java.io.InputStream;

public final class f implements k {
    public final d a = new d();

    /* renamed from: b  reason: collision with root package name */
    public final ClassLoader f8284b;

    public f(ClassLoader classLoader) {
        i.e(classLoader, "classLoader");
        this.f8284b = classLoader;
    }

    public k.a a(g gVar) {
        String b2;
        i.e(gVar, "javaClass");
        b e2 = gVar.e();
        if (e2 == null || (b2 = e2.b()) == null) {
            return null;
        }
        i.d(b2, "javaClass.fqName?.asString() ?: return null");
        return d(b2);
    }

    public InputStream b(b bVar) {
        i.e(bVar, "packageFqName");
        if (!bVar.i(e.a.a.a.y0.a.g.f7642e)) {
            return null;
        }
        return this.a.a(a.f9505m.a(bVar));
    }

    public k.a c(e.a.a.a.y0.f.a aVar) {
        i.e(aVar, "classId");
        String b2 = aVar.i().b();
        i.d(b2, "relativeClassName.asString()");
        String v = h.v(b2, '.', '$', false, 4);
        b h2 = aVar.h();
        i.d(h2, "packageFqName");
        if (!h2.d()) {
            v = aVar.h() + '.' + v;
        }
        return d(v);
    }

    public final k.a d(String str) {
        e e2;
        Class<?> l3 = b.q.a.a.l3(this.f8284b, str);
        if (l3 == null || (e2 = e.e(l3)) == null) {
            return null;
        }
        return new k.a.b(e2);
    }
}
