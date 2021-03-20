package b.j.a.c.h0.s;

import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.t.b;
import b.j.a.c.i;
import b.j.a.c.n;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.util.Iterator;

@a
public class h extends b<Iterator<?>> {
    public h(h hVar, d dVar, f fVar, n<?> nVar, Boolean bool) {
        super((b<?>) hVar, dVar, fVar, nVar, bool);
    }

    public h(i iVar, boolean z, f fVar) {
        super((Class<?>) Iterator.class, iVar, z, fVar, (n<Object>) null);
    }

    public boolean d(y yVar, Object obj) {
        return !((Iterator) obj).hasNext();
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        fVar.L0();
        u((Iterator) obj, fVar, yVar);
        fVar.q0();
    }

    public b.j.a.c.h0.h<?> q(f fVar) {
        return new h(this, this.f2084k, fVar, this.f2088o, this.f2086m);
    }

    public b v(d dVar, f fVar, n nVar, Boolean bool) {
        return new h(this, dVar, fVar, nVar, bool);
    }

    /* renamed from: w */
    public void u(Iterator<?> it, b.j.a.b.f fVar, y yVar) {
        if (it.hasNext()) {
            n<Object> nVar = this.f2088o;
            if (nVar == null) {
                f fVar2 = this.f2087n;
                l lVar = this.f2089p;
                do {
                    Object next = it.next();
                    if (next == null) {
                        yVar.t(fVar);
                    } else {
                        Class<?> cls = next.getClass();
                        n<Object> c = lVar.c(cls);
                        if (c == null) {
                            c = this.f2083j.t() ? r(lVar, yVar.d(this.f2083j, cls), yVar) : t(lVar, cls, yVar);
                            lVar = this.f2089p;
                        }
                        if (fVar2 == null) {
                            c.f(next, fVar, yVar);
                        } else {
                            c.g(next, fVar, yVar, fVar2);
                        }
                    }
                } while (it.hasNext());
                return;
            }
            f fVar3 = this.f2087n;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    yVar.t(fVar);
                } else if (fVar3 == null) {
                    nVar.f(next2, fVar, yVar);
                } else {
                    nVar.g(next2, fVar, yVar, fVar3);
                }
            } while (it.hasNext());
        }
    }
}
