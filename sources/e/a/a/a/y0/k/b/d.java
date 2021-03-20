package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.a1.c;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.x;
import e.a.a.a.y0.e.b;
import e.a.a.a.y0.e.n;
import e.a.a.a.y0.e.q;
import e.a.a.a.y0.e.s;
import e.a.a.a.y0.e.u;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.j.t.g;
import e.a.a.a.y0.k.a;
import e.a.a.a.y0.k.b.y;
import e.a.a.a.y0.m.d0;
import e.t.o;
import e.x.c.i;
import java.util.ArrayList;
import java.util.List;

public final class d implements c<c, g<?>> {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9496b;

    public d(w wVar, x xVar, a aVar) {
        i.e(wVar, "module");
        i.e(xVar, "notFoundClasses");
        i.e(aVar, "protocol");
        this.f9496b = aVar;
        this.a = new e(wVar, xVar);
    }

    public List<c> a(s sVar, e.a.a.a.y0.e.z.c cVar) {
        i.e(sVar, "proto");
        i.e(cVar, "nameResolver");
        Iterable<b> iterable = (List) sVar.l(this.f9496b.f9479l);
        if (iterable == null) {
            iterable = o.f7934h;
        }
        ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
        for (b a2 : iterable) {
            arrayList.add(this.a.a(a2, cVar));
        }
        return arrayList;
    }

    public List<c> b(y yVar, n nVar) {
        i.e(yVar, "container");
        i.e(nVar, "proto");
        return o.f7934h;
    }

    public List<c> c(y yVar, p pVar, b bVar) {
        i.e(yVar, "container");
        i.e(pVar, "proto");
        i.e(bVar, "kind");
        return o.f7934h;
    }

    public List<c> d(y yVar, p pVar, b bVar, int i2, u uVar) {
        i.e(yVar, "container");
        i.e(pVar, "callableProto");
        i.e(bVar, "kind");
        i.e(uVar, "proto");
        Iterable<b> iterable = (List) uVar.l(this.f9496b.f9477j);
        if (iterable == null) {
            iterable = o.f7934h;
        }
        ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
        for (b a2 : iterable) {
            arrayList.add(this.a.a(a2, yVar.a));
        }
        return arrayList;
    }

    public List<c> e(y yVar, n nVar) {
        i.e(yVar, "container");
        i.e(nVar, "proto");
        return o.f7934h;
    }

    public List<c> f(y.a aVar) {
        i.e(aVar, "container");
        Iterable<b> iterable = (List) aVar.f9620g.l(this.f9496b.c);
        if (iterable == null) {
            iterable = o.f7934h;
        }
        ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
        for (b a2 : iterable) {
            arrayList.add(this.a.a(a2, aVar.a));
        }
        return arrayList;
    }

    public List<c> g(q qVar, e.a.a.a.y0.e.z.c cVar) {
        i.e(qVar, "proto");
        i.e(cVar, "nameResolver");
        Iterable<b> iterable = (List) qVar.l(this.f9496b.f9478k);
        if (iterable == null) {
            iterable = o.f7934h;
        }
        ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
        for (b a2 : iterable) {
            arrayList.add(this.a.a(a2, cVar));
        }
        return arrayList;
    }

    public List<c> h(y yVar, p pVar, b bVar) {
        h.f fVar;
        h.d dVar;
        i.e(yVar, "container");
        i.e(pVar, "proto");
        i.e(bVar, "kind");
        if (pVar instanceof e.a.a.a.y0.e.d) {
            dVar = (e.a.a.a.y0.e.d) pVar;
            fVar = this.f9496b.f9472b;
        } else if (pVar instanceof e.a.a.a.y0.e.i) {
            dVar = (e.a.a.a.y0.e.i) pVar;
            fVar = this.f9496b.d;
        } else if (pVar instanceof n) {
            int ordinal = bVar.ordinal();
            if (ordinal == 1) {
                dVar = (n) pVar;
                fVar = this.f9496b.f9473e;
            } else if (ordinal == 2) {
                dVar = (n) pVar;
                fVar = this.f9496b.f;
            } else if (ordinal == 3) {
                dVar = (n) pVar;
                fVar = this.f9496b.f9474g;
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + pVar).toString());
        }
        Iterable<b> iterable = (List) dVar.l(fVar);
        if (iterable == null) {
            iterable = o.f7934h;
        }
        ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
        for (b a2 : iterable) {
            arrayList.add(this.a.a(a2, yVar.a));
        }
        return arrayList;
    }

    public Object i(y yVar, n nVar, d0 d0Var) {
        i.e(yVar, "container");
        i.e(nVar, "proto");
        i.e(d0Var, "expectedType");
        b.C0195b.c cVar = (b.C0195b.c) b.q.a.a.I0(nVar, this.f9496b.f9476i);
        if (cVar != null) {
            return this.a.c(d0Var, cVar, yVar.a);
        }
        return null;
    }

    public List<c> j(y yVar, e.a.a.a.y0.e.g gVar) {
        i.e(yVar, "container");
        i.e(gVar, "proto");
        Iterable<b> iterable = (List) gVar.l(this.f9496b.f9475h);
        if (iterable == null) {
            iterable = o.f7934h;
        }
        ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
        for (b a2 : iterable) {
            arrayList.add(this.a.a(a2, yVar.a));
        }
        return arrayList;
    }
}
