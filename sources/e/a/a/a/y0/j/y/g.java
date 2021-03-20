package e.a.a.a.y0.j.y;

import b.e.a.a.a;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.c.a.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.y.d;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public final class g extends j {

    /* renamed from: b  reason: collision with root package name */
    public final i f9455b;

    public g(i iVar) {
        i.e(iVar, "workerScope");
        this.f9455b = iVar;
    }

    public h b(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        h b2 = this.f9455b.b(dVar, bVar);
        if (b2 == null) {
            return null;
        }
        e eVar = (e) (!(b2 instanceof e) ? null : b2);
        if (eVar != null) {
            return eVar;
        }
        if (!(b2 instanceof q0)) {
            b2 = null;
        }
        return (q0) b2;
    }

    public Collection c(d dVar, l lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        d.a aVar = d.u;
        int i2 = d.f9443k & dVar.a;
        d dVar2 = i2 == 0 ? null : new d(i2, dVar.f9450b);
        if (dVar2 == null) {
            return o.f7934h;
        }
        Collection<k> c = this.f9455b.c(dVar2, lVar);
        ArrayList arrayList = new ArrayList();
        for (T next : c) {
            if (next instanceof e.a.a.a.y0.b.i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Set<e.a.a.a.y0.f.d> e() {
        return this.f9455b.e();
    }

    public Set<e.a.a.a.y0.f.d> f() {
        return this.f9455b.f();
    }

    public Set<e.a.a.a.y0.f.d> g() {
        return this.f9455b.g();
    }

    public String toString() {
        StringBuilder y = a.y("Classes from ");
        y.append(this.f9455b);
        return y.toString();
    }
}
