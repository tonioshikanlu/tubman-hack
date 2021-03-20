package b.j.a.c.h0.t;

import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.h;
import b.j.a.c.h0.i;
import b.j.a.c.h0.s.l;
import b.j.a.c.n;
import b.j.a.c.y;
import java.util.Objects;

public abstract class b<T> extends h<T> implements i {

    /* renamed from: j  reason: collision with root package name */
    public final b.j.a.c.i f2083j;

    /* renamed from: k  reason: collision with root package name */
    public final d f2084k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2085l;

    /* renamed from: m  reason: collision with root package name */
    public final Boolean f2086m;

    /* renamed from: n  reason: collision with root package name */
    public final f f2087n;

    /* renamed from: o  reason: collision with root package name */
    public final n<Object> f2088o;

    /* renamed from: p  reason: collision with root package name */
    public l f2089p;

    public b(b<?> bVar, d dVar, f fVar, n<?> nVar, Boolean bool) {
        super((h<?>) bVar);
        this.f2083j = bVar.f2083j;
        this.f2085l = bVar.f2085l;
        this.f2087n = fVar;
        this.f2084k = dVar;
        this.f2088o = nVar;
        this.f2089p = l.b.f2067b;
        this.f2086m = bool;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Class<?> cls, b.j.a.c.i iVar, boolean z, f fVar, n<Object> nVar) {
        super(cls, false);
        boolean z2 = false;
        this.f2083j = iVar;
        if (z || (iVar != null && iVar.D())) {
            z2 = true;
        }
        this.f2085l = z2;
        this.f2087n = fVar;
        this.f2084k = null;
        this.f2088o = nVar;
        this.f2089p = l.b.f2067b;
        this.f2086m = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r6, b.j.a.c.d r7) {
        /*
            r5 = this;
            b.j.a.c.f0.f r0 = r5.f2087n
            if (r0 == 0) goto L_0x0008
            b.j.a.c.f0.f r0 = r0.a(r7)
        L_0x0008:
            r1 = 0
            if (r7 == 0) goto L_0x0020
            b.j.a.c.b r2 = r6.B()
            b.j.a.c.e0.h r3 = r7.e()
            if (r3 == 0) goto L_0x0020
            java.lang.Object r2 = r2.d(r3)
            if (r2 == 0) goto L_0x0020
            b.j.a.c.n r2 = r6.N(r3, r2)
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            java.lang.Class<T> r3 = r5.f2137h
            b.j.a.a.k$d r3 = r5.l(r6, r7, r3)
            if (r3 == 0) goto L_0x002f
            b.j.a.a.k$a r1 = b.j.a.a.k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.b(r1)
        L_0x002f:
            if (r2 != 0) goto L_0x0033
            b.j.a.c.n<java.lang.Object> r2 = r5.f2088o
        L_0x0033:
            b.j.a.c.n r2 = r5.k(r6, r7, r2)
            if (r2 != 0) goto L_0x004d
            b.j.a.c.i r3 = r5.f2083j
            if (r3 == 0) goto L_0x004d
            boolean r4 = r5.f2085l
            if (r4 == 0) goto L_0x004d
            boolean r3 = r3.F()
            if (r3 != 0) goto L_0x004d
            b.j.a.c.i r2 = r5.f2083j
            b.j.a.c.n r2 = r6.z(r2, r7)
        L_0x004d:
            b.j.a.c.n<java.lang.Object> r6 = r5.f2088o
            if (r2 != r6) goto L_0x005f
            b.j.a.c.d r6 = r5.f2084k
            if (r7 != r6) goto L_0x005f
            b.j.a.c.f0.f r6 = r5.f2087n
            if (r6 != r0) goto L_0x005f
            java.lang.Boolean r6 = r5.f2086m
            if (r6 == r1) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            return r5
        L_0x005f:
            b.j.a.c.h0.t.b r6 = r5.v(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.b.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public void g(T t, b.j.a.b.f fVar, y yVar, f fVar2) {
        fVar.Y(t);
        b.j.a.b.v.b e2 = fVar2.e(fVar, fVar2.d(t, b.j.a.b.l.START_ARRAY));
        u(t, fVar, yVar);
        fVar2.f(fVar, e2);
    }

    public final n<Object> r(l lVar, b.j.a.c.i iVar, y yVar) {
        l.d a = lVar.a(iVar, yVar, this.f2084k);
        l lVar2 = a.f2069b;
        if (lVar != lVar2) {
            this.f2089p = lVar2;
        }
        return a.a;
    }

    public final n<Object> t(l lVar, Class<?> cls, y yVar) {
        d dVar = this.f2084k;
        Objects.requireNonNull(lVar);
        n<Object> A = yVar.A(cls, dVar);
        l b2 = lVar.b(cls, A);
        if (lVar != b2) {
            this.f2089p = b2;
        }
        return A;
    }

    public abstract void u(T t, b.j.a.b.f fVar, y yVar);

    public abstract b<T> v(d dVar, f fVar, n<?> nVar, Boolean bool);
}
