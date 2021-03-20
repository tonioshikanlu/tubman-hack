package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.d;
import b.j.a.c.h0.h;
import b.j.a.c.h0.i;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;

public abstract class a<T> extends h<T> implements i {

    /* renamed from: j  reason: collision with root package name */
    public final d f2081j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f2082k;

    public a(a<?> aVar, d dVar, Boolean bool) {
        super(aVar.f2137h, false);
        this.f2081j = dVar;
        this.f2082k = bool;
    }

    public a(Class<T> cls) {
        super(cls);
        this.f2081j = null;
        this.f2082k = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r2 = (r2 = l(r2, r3, r1.f2137h)).b(b.j.a.a.k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r2, b.j.a.c.d r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0019
            java.lang.Class<T> r0 = r1.f2137h
            b.j.a.a.k$d r2 = r1.l(r2, r3, r0)
            if (r2 == 0) goto L_0x0019
            b.j.a.a.k$a r0 = b.j.a.a.k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r2.b(r0)
            java.lang.Boolean r0 = r1.f2082k
            if (r2 == r0) goto L_0x0019
            b.j.a.c.n r2 = r1.t(r3, r2)
            return r2
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.a.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public final void g(T t, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        fVar.Y(t);
        b e2 = fVar2.e(fVar, fVar2.d(t, l.START_ARRAY));
        u(t, fVar, yVar);
        fVar2.f(fVar, e2);
    }

    public final boolean r(y yVar) {
        Boolean bool = this.f2082k;
        return bool == null ? yVar.K(x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : bool.booleanValue();
    }

    public abstract n<?> t(d dVar, Boolean bool);

    public abstract void u(T t, f fVar, y yVar);
}
