package e.a.a.a.y0.j.y;

import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.c.a.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.o.g;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class j implements i {
    public Collection<? extends l0> a(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return o.f7934h;
    }

    public h b(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return null;
    }

    public Collection<k> c(d dVar, l<? super d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        return o.f7934h;
    }

    public Collection<? extends f0> d(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return o.f7934h;
    }

    public Set<d> e() {
        Collection<k> c = c(d.f9449q, g.a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : c) {
            if (next instanceof l0) {
                d name = ((l0) next).getName();
                i.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Set<d> f() {
        Collection<k> c = c(d.r, g.a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : c) {
            if (next instanceof l0) {
                d name = ((l0) next).getName();
                i.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Set<d> g() {
        return null;
    }
}
