package b.j.a.c.h0.s;

import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.i;
import b.j.a.c.n;
import b.j.a.c.y;

public final class p extends n<Object> implements i {

    /* renamed from: h  reason: collision with root package name */
    public final f f2078h;

    /* renamed from: i  reason: collision with root package name */
    public final n<Object> f2079i;

    public p(f fVar, n<?> nVar) {
        this.f2078h = fVar;
        this.f2079i = nVar;
    }

    public n<?> a(y yVar, d dVar) {
        n nVar = this.f2079i;
        if (nVar instanceof i) {
            nVar = yVar.G(nVar, dVar);
        }
        return nVar == this.f2079i ? this : new p(this.f2078h, nVar);
    }

    public Class<Object> c() {
        return Object.class;
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        this.f2079i.g(obj, fVar, yVar, this.f2078h);
    }

    public void g(Object obj, b.j.a.b.f fVar, y yVar, f fVar2) {
        this.f2079i.g(obj, fVar, yVar, fVar2);
    }
}
