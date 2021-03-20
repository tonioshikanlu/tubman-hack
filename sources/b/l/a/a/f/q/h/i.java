package b.l.a.a.f.q.h;

import b.l.a.a.f.h;
import b.l.a.a.f.n.g;
import b.l.a.a.f.r.b;

public final /* synthetic */ class i implements b.a {
    public final l a;

    /* renamed from: b  reason: collision with root package name */
    public final g f2530b;
    public final Iterable c;
    public final h d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2531e;

    public i(l lVar, g gVar, Iterable iterable, h hVar, int i2) {
        this.a = lVar;
        this.f2530b = gVar;
        this.c = iterable;
        this.d = hVar;
        this.f2531e = i2;
    }

    public Object a() {
        l lVar = this.a;
        g gVar = this.f2530b;
        Iterable iterable = this.c;
        h hVar = this.d;
        int i2 = this.f2531e;
        if (gVar.c() == g.a.TRANSIENT_ERROR) {
            lVar.c.X(iterable);
            lVar.d.a(hVar, i2 + 1);
            return null;
        }
        lVar.c.l(iterable);
        if (gVar.c() == g.a.OK) {
            lVar.c.B(hVar, gVar.b() + lVar.f2535g.a());
        }
        if (!lVar.c.W(hVar)) {
            return null;
        }
        lVar.d.a(hVar, 1);
        return null;
    }
}
