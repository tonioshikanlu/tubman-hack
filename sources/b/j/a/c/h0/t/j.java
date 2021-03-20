package b.j.a.c.h0.t;

import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.h;
import b.j.a.c.h0.s.l;
import b.j.a.c.i;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import java.util.Collection;
import java.util.Iterator;

public class j extends b<Collection<?>> {
    public j(j jVar, d dVar, f fVar, n<?> nVar, Boolean bool) {
        super((b<?>) jVar, dVar, fVar, nVar, bool);
    }

    public j(i iVar, boolean z, f fVar, n<Object> nVar) {
        super((Class<?>) Collection.class, iVar, z, fVar, nVar);
    }

    public boolean d(y yVar, Object obj) {
        return ((Collection) obj).isEmpty();
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size != 1 || ((this.f2086m != null || !yVar.K(x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.f2086m != Boolean.TRUE)) {
            fVar.M0(size);
            u(collection, fVar, yVar);
            fVar.q0();
            return;
        }
        u(collection, fVar, yVar);
    }

    public h<?> q(f fVar) {
        return new j(this, this.f2084k, fVar, this.f2088o, this.f2086m);
    }

    public b v(d dVar, f fVar, n nVar, Boolean bool) {
        return new j(this, dVar, fVar, nVar, bool);
    }

    /* renamed from: w */
    public void u(Collection<?> collection, b.j.a.b.f fVar, y yVar) {
        fVar.Y(collection);
        n<Object> nVar = this.f2088o;
        int i2 = 0;
        if (nVar != null) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                f fVar2 = this.f2087n;
                do {
                    Object next = it.next();
                    if (next == null) {
                        try {
                            yVar.t(fVar);
                        } catch (Exception e2) {
                            n(yVar, e2, collection, i2);
                            throw null;
                        }
                    } else if (fVar2 == null) {
                        nVar.f(next, fVar, yVar);
                    } else {
                        nVar.g(next, fVar, yVar, fVar2);
                    }
                    i2++;
                } while (it.hasNext());
                return;
            }
            return;
        }
        Iterator<?> it2 = collection.iterator();
        if (it2.hasNext()) {
            l lVar = this.f2089p;
            f fVar3 = this.f2087n;
            do {
                try {
                    Object next2 = it2.next();
                    if (next2 == null) {
                        yVar.t(fVar);
                    } else {
                        Class<?> cls = next2.getClass();
                        n<Object> c = lVar.c(cls);
                        if (c == null) {
                            c = this.f2083j.t() ? r(lVar, yVar.d(this.f2083j, cls), yVar) : t(lVar, cls, yVar);
                            lVar = this.f2089p;
                        }
                        if (fVar3 == null) {
                            c.f(next2, fVar, yVar);
                        } else {
                            c.g(next2, fVar, yVar, fVar3);
                        }
                    }
                    i2++;
                } catch (Exception e3) {
                    n(yVar, e3, collection, i2);
                    throw null;
                }
            } while (it2.hasNext());
        }
    }
}
