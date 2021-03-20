package b.j.a.c.h0.t;

import b.j.a.a.r;
import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.i;
import b.j.a.c.h0.s.l;
import b.j.a.c.j0.r;
import b.j.a.c.k;
import b.j.a.c.n;
import b.j.a.c.v;
import b.j.a.c.y;
import java.util.concurrent.atomic.AtomicReference;

public abstract class f0<T> extends s0<T> implements i {

    /* renamed from: j  reason: collision with root package name */
    public final b.j.a.c.i f2106j;

    /* renamed from: k  reason: collision with root package name */
    public final d f2107k;

    /* renamed from: l  reason: collision with root package name */
    public final f f2108l;

    /* renamed from: m  reason: collision with root package name */
    public final n<Object> f2109m;

    /* renamed from: n  reason: collision with root package name */
    public final r f2110n;

    /* renamed from: o  reason: collision with root package name */
    public transient l f2111o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f2112p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f2113q;

    public f0(f0<?> f0Var, d dVar, f fVar, n<?> nVar, r rVar, Object obj, boolean z) {
        super((s0<?>) f0Var);
        this.f2106j = f0Var.f2106j;
        this.f2111o = l.b.f2067b;
        this.f2107k = dVar;
        this.f2108l = fVar;
        this.f2109m = nVar;
        this.f2110n = rVar;
        this.f2112p = obj;
        this.f2113q = z;
    }

    public f0(b.j.a.c.i0.i iVar, f fVar, n nVar) {
        super((b.j.a.c.i) iVar);
        this.f2106j = iVar.f2165q;
        this.f2107k = null;
        this.f2108l = fVar;
        this.f2109m = nVar;
        this.f2110n = null;
        this.f2112p = null;
        this.f2113q = false;
        this.f2111o = l.b.f2067b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (r6 == b.j.a.c.z.f.b.DYNAMIC) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00db, code lost:
        if (r8.f2106j.b() != false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r9, b.j.a.c.d r10) {
        /*
            r8 = this;
            b.j.a.a.r$a r0 = b.j.a.a.r.a.NON_EMPTY
            b.j.a.c.f0.f r1 = r8.f2108l
            if (r1 == 0) goto L_0x000a
            b.j.a.c.f0.f r1 = r1.a(r10)
        L_0x000a:
            r2 = 0
            if (r10 == 0) goto L_0x0022
            b.j.a.c.e0.h r3 = r10.e()
            b.j.a.c.b r4 = r9.B()
            if (r3 == 0) goto L_0x0022
            java.lang.Object r4 = r4.d(r3)
            if (r4 == 0) goto L_0x0022
            b.j.a.c.n r3 = r9.N(r3, r4)
            goto L_0x0023
        L_0x0022:
            r3 = r2
        L_0x0023:
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0075
            b.j.a.c.n<java.lang.Object> r3 = r8.f2109m
            if (r3 != 0) goto L_0x0071
            b.j.a.c.i r6 = r8.f2106j
            boolean r7 = r6.F()
            if (r7 == 0) goto L_0x0035
        L_0x0033:
            r6 = r4
            goto L_0x0068
        L_0x0035:
            boolean r7 = r6.D()
            if (r7 == 0) goto L_0x003d
        L_0x003b:
            r6 = r5
            goto L_0x0068
        L_0x003d:
            boolean r6 = r6.f2156l
            if (r6 == 0) goto L_0x0042
            goto L_0x003b
        L_0x0042:
            b.j.a.c.b r6 = r9.B()
            if (r6 == 0) goto L_0x0062
            if (r10 == 0) goto L_0x0062
            b.j.a.c.e0.h r7 = r10.e()
            if (r7 == 0) goto L_0x0062
            b.j.a.c.e0.h r7 = r10.e()
            b.j.a.c.z.f$b r6 = r6.T(r7)
            b.j.a.c.z.f$b r7 = b.j.a.c.z.f.b.STATIC
            if (r6 != r7) goto L_0x005d
            goto L_0x003b
        L_0x005d:
            b.j.a.c.z.f$b r7 = b.j.a.c.z.f.b.DYNAMIC
            if (r6 != r7) goto L_0x0062
            goto L_0x0033
        L_0x0062:
            b.j.a.c.p r6 = b.j.a.c.p.USE_STATIC_TYPING
            boolean r6 = r9.J(r6)
        L_0x0068:
            if (r6 == 0) goto L_0x0075
            b.j.a.c.i r3 = r8.f2106j
            b.j.a.c.n r3 = r9.z(r3, r10)
            goto L_0x0075
        L_0x0071:
            b.j.a.c.n r3 = r9.F(r3, r10)
        L_0x0075:
            b.j.a.c.d r6 = r8.f2107k
            if (r6 != r10) goto L_0x0083
            b.j.a.c.f0.f r6 = r8.f2108l
            if (r6 != r1) goto L_0x0083
            b.j.a.c.n<java.lang.Object> r6 = r8.f2109m
            if (r6 != r3) goto L_0x0083
            r1 = r8
            goto L_0x0089
        L_0x0083:
            b.j.a.c.j0.r r6 = r8.f2110n
            b.j.a.c.h0.t.f0 r1 = r8.t(r10, r1, r3, r6)
        L_0x0089:
            if (r10 == 0) goto L_0x00ec
            b.j.a.c.w r3 = r9.f2320h
            java.lang.Class<T> r6 = r8.f2137h
            b.j.a.a.r$b r10 = r10.m(r3, r6)
            if (r10 == 0) goto L_0x00ec
            b.j.a.a.r$a r3 = r10.f1354i
            b.j.a.a.r$a r6 = b.j.a.a.r.a.USE_DEFAULTS
            if (r3 == r6) goto L_0x00ec
            int r3 = r3.ordinal()
            if (r3 == r5) goto L_0x00de
            r6 = 2
            if (r3 == r6) goto L_0x00d5
            r6 = 3
            if (r3 == r6) goto L_0x00d3
            r0 = 4
            if (r3 == r0) goto L_0x00bd
            r0 = 5
            if (r3 == r0) goto L_0x00af
            r0 = r2
            goto L_0x00e0
        L_0x00af:
            java.lang.Class<?> r10 = r10.f1356k
            java.lang.Object r0 = r9.H(r2, r10)
            if (r0 != 0) goto L_0x00b8
            goto L_0x00d3
        L_0x00b8:
            boolean r4 = r9.I(r0)
            goto L_0x00e0
        L_0x00bd:
            b.j.a.c.i r9 = r8.f2106j
            java.lang.Object r0 = b.a.a.n.f.i(r9)
            if (r0 == 0) goto L_0x00d3
            java.lang.Class r9 = r0.getClass()
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L_0x00d3
            java.lang.Object r0 = b.j.a.c.j0.c.a(r0)
        L_0x00d3:
            r4 = r5
            goto L_0x00e0
        L_0x00d5:
            b.j.a.c.i r9 = r8.f2106j
            boolean r9 = r9.b()
            if (r9 == 0) goto L_0x00de
            goto L_0x00d3
        L_0x00de:
            r0 = r2
            goto L_0x00d3
        L_0x00e0:
            java.lang.Object r9 = r8.f2112p
            if (r9 != r0) goto L_0x00e8
            boolean r9 = r8.f2113q
            if (r9 == r4) goto L_0x00ec
        L_0x00e8:
            b.j.a.c.h0.t.f0 r1 = r1.r(r0, r4)
        L_0x00ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.f0.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public boolean d(y yVar, T t) {
        AtomicReference atomicReference = (AtomicReference) t;
        if (!(atomicReference.get() != null)) {
            return true;
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            return this.f2113q;
        }
        if (this.f2112p == null) {
            return false;
        }
        n<Object> nVar = this.f2109m;
        if (nVar == null) {
            try {
                nVar = q(yVar, obj.getClass());
            } catch (k e2) {
                throw new v(e2);
            }
        }
        Object obj2 = this.f2112p;
        return obj2 == r.a.NON_EMPTY ? nVar.d(yVar, obj) : obj2.equals(obj);
    }

    public boolean e() {
        return this.f2110n != null;
    }

    public void f(T t, b.j.a.b.f fVar, y yVar) {
        Object obj = ((AtomicReference) t).get();
        if (obj != null) {
            n<Object> nVar = this.f2109m;
            if (nVar == null) {
                nVar = q(yVar, obj.getClass());
            }
            f fVar2 = this.f2108l;
            if (fVar2 != null) {
                nVar.g(obj, fVar, yVar, fVar2);
            } else {
                nVar.f(obj, fVar, yVar);
            }
        } else if (this.f2110n == null) {
            yVar.t(fVar);
        }
    }

    public void g(T t, b.j.a.b.f fVar, y yVar, f fVar2) {
        Object obj = ((AtomicReference) t).get();
        if (obj != null) {
            n<Object> nVar = this.f2109m;
            if (nVar == null) {
                nVar = q(yVar, obj.getClass());
            }
            nVar.g(obj, fVar, yVar, fVar2);
        } else if (this.f2110n == null) {
            yVar.t(fVar);
        }
    }

    public n<T> h(b.j.a.c.j0.r rVar) {
        n<Object> nVar = this.f2109m;
        if (nVar != null) {
            nVar = nVar.h(rVar);
        }
        b.j.a.c.j0.r rVar2 = this.f2110n;
        if (rVar2 != null) {
            rVar = new r.a(rVar, rVar2);
        }
        return (this.f2109m == nVar && rVar2 == rVar) ? this : t(this.f2107k, this.f2108l, nVar, rVar);
    }

    public final n<Object> q(y yVar, Class<?> cls) {
        n<Object> c = this.f2111o.c(cls);
        if (c != null) {
            return c;
        }
        n<Object> z = this.f2106j.t() ? yVar.z(yVar.d(this.f2106j, cls), this.f2107k) : yVar.A(cls, this.f2107k);
        b.j.a.c.j0.r rVar = this.f2110n;
        if (rVar != null) {
            z = z.h(rVar);
        }
        n<Object> nVar = z;
        this.f2111o = this.f2111o.b(cls, nVar);
        return nVar;
    }

    public abstract f0<T> r(Object obj, boolean z);

    public abstract f0<T> t(d dVar, f fVar, n<?> nVar, b.j.a.c.j0.r rVar);
}
