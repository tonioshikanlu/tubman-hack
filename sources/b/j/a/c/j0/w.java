package b.j.a.c.j0;

import b.j.a.c.a0.g;
import b.j.a.c.e0.p;
import b.j.a.c.i0.b;
import b.j.a.c.t;
import java.io.Serializable;

public class w implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public transient m<b, t> f2239h = new m<>(20, 200);

    public t a(Class<?> cls, g<?> gVar) {
        b bVar = new b(cls);
        t tVar = (t) this.f2239h.f2226i.get(bVar);
        if (tVar != null) {
            return tVar;
        }
        t O = gVar.e().O(((p) gVar.m(cls)).f1937e);
        if (O == null || !O.c()) {
            O = t.a(cls.getSimpleName());
        }
        this.f2239h.b(bVar, O);
        return O;
    }
}
