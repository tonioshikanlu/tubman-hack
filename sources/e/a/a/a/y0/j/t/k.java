package e.a.a.a.y0.j.t;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.g;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.j;
import e.x.c.i;

public final class k extends g<j<? extends a, ? extends d>> {

    /* renamed from: b  reason: collision with root package name */
    public final a f9414b;
    public final d c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a aVar, d dVar) {
        super(new j(aVar, dVar));
        i.e(aVar, "enumClassId");
        i.e(dVar, "enumEntryName");
        this.f9414b = aVar;
        this.c = dVar;
    }

    public d0 a(w wVar) {
        k0 s;
        i.e(wVar, "module");
        e l0 = b.q.a.a.l0(wVar, this.f9414b);
        if (l0 != null) {
            if (!g.q(l0)) {
                l0 = null;
            }
            if (!(l0 == null || (s = l0.s()) == null)) {
                return s;
            }
        }
        StringBuilder y = b.e.a.a.a.y("Containing class for error-class based enum entry ");
        y.append(this.f9414b);
        y.append('.');
        y.append(this.c);
        k0 d = e.a.a.a.y0.m.w.d(y.toString());
        i.d(d, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
        return d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9414b.j());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
