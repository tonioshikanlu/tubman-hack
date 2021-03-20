package e.a.a.a.y0.d.a.b0.n;

import b.q.a.a;
import e.a.a.a.y0.b.c1.c;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.d.a.b0.f;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.d.a.d0.j;
import e.a.a.a.y0.d.a.d0.w;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class t extends c {
    public final f r;
    public final h s;
    public final w t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(h hVar, w wVar, int i2, k kVar) {
        super(hVar.c.a, kVar, wVar.getName(), j1.INVARIANT, false, i2, m0.a, hVar.c.f8354m);
        i.e(hVar, "c");
        i.e(wVar, "javaTypeParameter");
        i.e(kVar, "containingDeclaration");
        this.s = hVar;
        this.t = wVar;
        this.r = new f(hVar, wVar);
    }

    public List<d0> K0() {
        Collection<j> upperBounds = this.t.getUpperBounds();
        if (upperBounds.isEmpty()) {
            k0 f = this.s.c.f8356o.v().f();
            i.d(f, "c.module.builtIns.anyType");
            k0 p2 = this.s.c.f8356o.v().p();
            i.d(p2, "c.module.builtIns.nullableAnyType");
            return a.l2(e0.c(f, p2));
        }
        ArrayList arrayList = new ArrayList(a.C(upperBounds, 10));
        for (j d : upperBounds) {
            arrayList.add(this.s.f8366b.d(d, e.a.a.a.y0.d.a.b0.o.i.c(e.a.a.a.y0.d.a.z.k.COMMON, false, this, 1)));
        }
        return arrayList;
    }

    public e.a.a.a.y0.b.a1.h k() {
        return this.r;
    }

    public void w0(d0 d0Var) {
        i.e(d0Var, "type");
    }
}
