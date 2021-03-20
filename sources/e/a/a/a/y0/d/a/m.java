package e.a.a.a.y0.d.a;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.j.h;
import e.x.c.i;

public final class m implements h {
    public h.b a(a aVar, a aVar2, e eVar) {
        h.b bVar = h.b.UNKNOWN;
        i.e(aVar, "superDescriptor");
        i.e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof f0) || !(aVar instanceof f0)) {
            return bVar;
        }
        f0 f0Var = (f0) aVar2;
        f0 f0Var2 = (f0) aVar;
        return i.a(f0Var.getName(), f0Var2.getName()) ^ true ? bVar : (!b.q.a.a.Q1(f0Var) || !b.q.a.a.Q1(f0Var2)) ? (b.q.a.a.Q1(f0Var) || b.q.a.a.Q1(f0Var2)) ? h.b.INCOMPATIBLE : bVar : h.b.OVERRIDABLE;
    }

    public h.a b() {
        return h.a.BOTH;
    }
}
