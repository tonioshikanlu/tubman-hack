package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.c.d;
import b.j.a.c.h0.i;
import b.j.a.c.h0.n;
import b.j.a.c.i0.c;
import b.j.a.c.j0.g;
import b.j.a.c.j0.j;
import b.j.a.c.y;

public class l0 extends s0<Object> implements i, n {

    /* renamed from: j  reason: collision with root package name */
    public final j<Object, ?> f2121j;

    /* renamed from: k  reason: collision with root package name */
    public final b.j.a.c.i f2122k;

    /* renamed from: l  reason: collision with root package name */
    public final b.j.a.c.n<Object> f2123l;

    public l0(j<Object, ?> jVar, b.j.a.c.i iVar, b.j.a.c.n<?> nVar) {
        super(iVar);
        this.f2121j = jVar;
        this.f2122k = iVar;
        this.f2123l = nVar;
    }

    public b.j.a.c.n<?> a(y yVar, d dVar) {
        b.j.a.c.n nVar = this.f2123l;
        b.j.a.c.i iVar = this.f2122k;
        if (nVar == null) {
            if (iVar == null) {
                iVar = this.f2121j.c(yVar.h());
            }
            if (!iVar.F()) {
                nVar = yVar.y(iVar);
            }
        }
        if (nVar instanceof i) {
            nVar = yVar.G(nVar, dVar);
        }
        if (nVar == this.f2123l && iVar == this.f2122k) {
            return this;
        }
        j<Object, ?> jVar = this.f2121j;
        g.G(l0.class, this, "withDelegate");
        return new l0(jVar, iVar, nVar);
    }

    public void b(y yVar) {
        b.j.a.c.n<Object> nVar = this.f2123l;
        if (nVar != null && (nVar instanceof n)) {
            ((n) nVar).b(yVar);
        }
    }

    public boolean d(y yVar, Object obj) {
        Object a = this.f2121j.a(obj);
        if (a == null) {
            return true;
        }
        b.j.a.c.n<Object> nVar = this.f2123l;
        if (nVar != null) {
            return nVar.d(yVar, a);
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    public void f(Object obj, f fVar, y yVar) {
        Object a = this.f2121j.a(obj);
        if (a == null) {
            yVar.t(fVar);
            return;
        }
        b.j.a.c.n<Object> nVar = this.f2123l;
        if (nVar == null) {
            nVar = q(a, yVar);
        }
        nVar.f(a, fVar, yVar);
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        Object a = this.f2121j.a(obj);
        b.j.a.c.n<Object> nVar = this.f2123l;
        if (nVar == null) {
            nVar = q(obj, yVar);
        }
        nVar.g(a, fVar, yVar, fVar2);
    }

    public b.j.a.c.n<Object> q(Object obj, y yVar) {
        Class<?> cls = obj.getClass();
        b.j.a.c.n<Object> b2 = yVar.f2329q.b(cls);
        if (b2 != null) {
            return b2;
        }
        b.j.a.c.n<Object> b3 = yVar.f2323k.b(cls);
        if (b3 != null) {
            return b3;
        }
        b.j.a.c.n<Object> a = yVar.f2323k.a(yVar.f2320h.f1609i.f1589k.b((c) null, cls, b.j.a.c.i0.n.f2185l));
        if (a != null) {
            return a;
        }
        b.j.a.c.n<Object> o2 = yVar.o(cls);
        return o2 == null ? yVar.E(cls) : o2;
    }
}
