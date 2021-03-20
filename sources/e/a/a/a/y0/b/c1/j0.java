package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.b0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.j.y.c;
import e.a.a.a.y0.j.y.d;
import e.a.a.a.y0.j.y.j;
import e.t.o;
import e.t.q;
import e.x.b.l;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class j0 extends j {

    /* renamed from: b  reason: collision with root package name */
    public final w f8214b;
    public final b c;

    public j0(w wVar, b bVar) {
        i.e(wVar, "moduleDescriptor");
        i.e(bVar, "fqName");
        this.f8214b = wVar;
        this.c = bVar;
    }

    public Collection<k> c(d dVar, l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
        o oVar = o.f7934h;
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        d.a aVar = d.u;
        if (!dVar.a(d.f9439g)) {
            return oVar;
        }
        if (this.c.d() && dVar.f9450b.contains(c.b.a)) {
            return oVar;
        }
        Collection<b> y = this.f8214b.y(this.c, lVar);
        ArrayList arrayList = new ArrayList(y.size());
        for (b g2 : y) {
            e.a.a.a.y0.f.d g3 = g2.g();
            i.d(g3, "subFqName.shortName()");
            if (lVar.invoke(g3).booleanValue()) {
                i.e(g3, "name");
                b0 b0Var = null;
                if (!g3.f9211i) {
                    w wVar = this.f8214b;
                    b c2 = this.c.c(g3);
                    i.d(c2, "fqName.child(name)");
                    b0 o0 = wVar.o0(c2);
                    if (!o0.isEmpty()) {
                        b0Var = o0;
                    }
                }
                e.a.a.a.y0.m.o1.c.e(arrayList, b0Var);
            }
        }
        return arrayList;
    }

    public Set<e.a.a.a.y0.f.d> g() {
        return q.f7936h;
    }
}
