package e.a.a.a.y0.b.d1.a;

import e.a.a.a.y0.b.d1.b.b0;
import e.a.a.a.y0.b.d1.b.q;
import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.d.a.d0.t;
import e.a.a.a.y0.d.a.n;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.b;
import e.c0.h;
import e.x.c.i;
import java.util.Set;

public final class d implements n {
    public final ClassLoader a;

    public d(ClassLoader classLoader) {
        i.e(classLoader, "classLoader");
        this.a = classLoader;
    }

    public t a(b bVar) {
        i.e(bVar, "fqName");
        return new b0(bVar);
    }

    public g b(n.a aVar) {
        i.e(aVar, "request");
        a aVar2 = aVar.a;
        b h2 = aVar2.h();
        i.d(h2, "classId.packageFqName");
        String b2 = aVar2.i().b();
        i.d(b2, "classId.relativeClassName.asString()");
        String v = h.v(b2, '.', '$', false, 4);
        if (!h2.d()) {
            v = h2.b() + "." + v;
        }
        Class<?> l3 = b.q.a.a.l3(this.a, v);
        if (l3 != null) {
            return new q(l3);
        }
        return null;
    }

    public Set<String> c(b bVar) {
        i.e(bVar, "packageFqName");
        return null;
    }
}
