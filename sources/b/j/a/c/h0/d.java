package b.j.a.c.h0;

import b.e.a.a.a;
import b.j.a.b.f;
import b.j.a.c.h0.s.b;
import b.j.a.c.h0.s.j;
import b.j.a.c.h0.s.s;
import b.j.a.c.i;
import b.j.a.c.j0.r;
import b.j.a.c.n;
import b.j.a.c.y;
import java.util.Set;

public class d extends b.j.a.c.h0.t.d {
    public d(b.j.a.c.h0.t.d dVar, j jVar, Object obj) {
        super(dVar, jVar, obj);
    }

    public d(b.j.a.c.h0.t.d dVar, Set<String> set) {
        super(dVar, set);
    }

    public d(i iVar, e eVar, c[] cVarArr, c[] cVarArr2) {
        super(iVar, eVar, cVarArr, cVarArr2);
    }

    public final void f(Object obj, f fVar, y yVar) {
        if (this.f2097p != null) {
            fVar.Y(obj);
            r(obj, fVar, yVar, true);
            return;
        }
        fVar.O0(obj);
        Object obj2 = this.f2095n;
        if (obj2 != null) {
            if (this.f2093l != null) {
                Class<?> cls = yVar.f2321i;
            }
            m(yVar, obj2, obj);
            throw null;
        }
        w(obj, fVar, yVar);
        fVar.r0();
    }

    public n<Object> h(r rVar) {
        return new s((b.j.a.c.h0.t.d) this, rVar);
    }

    public String toString() {
        return a.d(this.f2137h, a.y("BeanSerializer for "));
    }

    public b.j.a.c.h0.t.d u() {
        return (this.f2097p == null && this.f2094m == null && this.f2095n == null) ? new b(this) : this;
    }

    public b.j.a.c.h0.t.d x(Object obj) {
        return new d(this, this.f2097p, obj);
    }

    public b.j.a.c.h0.t.d y(Set<String> set) {
        return new d(this, set);
    }

    public b.j.a.c.h0.t.d z(j jVar) {
        return new d(this, jVar, this.f2095n);
    }
}
