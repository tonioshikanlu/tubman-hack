package e.a.a.a.y0.a.p;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.o.c;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;

public final class o<N> implements c<e> {
    public final /* synthetic */ k a;

    public o(k kVar) {
        this.a = kVar;
    }

    public Iterable a(Object obj) {
        e eVar = (e) obj;
        i.d(eVar, "it");
        v0 p2 = eVar.p();
        i.d(p2, "it.typeConstructor");
        Collection<d0> h2 = p2.h();
        i.d(h2, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (d0 W0 : h2) {
            h d = W0.W0().d();
            e.a.a.a.y0.d.a.b0.n.e eVar2 = null;
            h a2 = d != null ? d.a() : null;
            if (!(a2 instanceof e)) {
                a2 = null;
            }
            e eVar3 = (e) a2;
            if (eVar3 != null) {
                eVar2 = this.a.f(eVar3);
            }
            if (eVar2 != null) {
                arrayList.add(eVar2);
            }
        }
        return arrayList;
    }
}
