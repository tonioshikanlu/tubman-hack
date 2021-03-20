package e.a.a.a.y0.d.a.b0.n;

import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.d.a.b0.n.k;
import e.a.a.a.y0.d.a.d0.q;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.t.o;
import e.x.c.i;
import java.util.Collection;
import java.util.List;

public abstract class s extends k {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(h hVar) {
        super(hVar, (k) null);
        i.e(hVar, "c");
    }

    public void m(d dVar, Collection<f0> collection) {
        i.e(dVar, "name");
        i.e(collection, "result");
    }

    public i0 o() {
        return null;
    }

    public k.a r(q qVar, List<? extends r0> list, d0 d0Var, List<? extends w0> list2) {
        i.e(qVar, "method");
        i.e(list, "methodTypeParameters");
        i.e(d0Var, "returnType");
        i.e(list2, "valueParameters");
        return new k.a(d0Var, (d0) null, list2, list, false, o.f7934h);
    }
}
