package b.j.a.c;

import b.j.a.a.i0;
import b.j.a.b.f;
import b.j.a.c.a0.e;
import b.j.a.c.c0.b;
import b.j.a.c.e0.a;
import b.j.a.c.e0.r;
import b.j.a.c.h0.i;
import b.j.a.c.h0.j;
import b.j.a.c.h0.o;
import b.j.a.c.h0.p;
import b.j.a.c.h0.s.c;
import b.j.a.c.h0.s.m;
import b.j.a.c.h0.s.q;
import b.j.a.c.h0.s.t;
import b.j.a.c.h0.t.u;
import b.j.a.c.i0.n;
import b.j.a.c.j0.b0;
import b.j.a.c.j0.g;
import java.io.Closeable;
import java.text.DateFormat;
import java.util.Map;

public abstract class y extends e {
    public static final n<Object> t = new c("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    public static final n<Object> u = new q();

    /* renamed from: h  reason: collision with root package name */
    public final w f2320h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f2321i;

    /* renamed from: j  reason: collision with root package name */
    public final p f2322j;

    /* renamed from: k  reason: collision with root package name */
    public final o f2323k;

    /* renamed from: l  reason: collision with root package name */
    public transient e f2324l;

    /* renamed from: m  reason: collision with root package name */
    public n<Object> f2325m;

    /* renamed from: n  reason: collision with root package name */
    public n<Object> f2326n;

    /* renamed from: o  reason: collision with root package name */
    public n<Object> f2327o;

    /* renamed from: p  reason: collision with root package name */
    public n<Object> f2328p;

    /* renamed from: q  reason: collision with root package name */
    public final m f2329q;
    public DateFormat r;
    public final boolean s;

    public y() {
        this.f2325m = u;
        this.f2327o = u.f2146j;
        this.f2328p = t;
        this.f2320h = null;
        this.f2322j = null;
        this.f2323k = new o();
        this.f2329q = null;
        this.f2321i = null;
        this.f2324l = null;
        this.s = true;
    }

    public y(y yVar, w wVar, p pVar) {
        this.f2325m = u;
        this.f2327o = u.f2146j;
        n<Object> nVar = t;
        this.f2328p = nVar;
        this.f2322j = pVar;
        this.f2320h = wVar;
        o oVar = yVar.f2323k;
        this.f2323k = oVar;
        this.f2325m = yVar.f2325m;
        this.f2326n = yVar.f2326n;
        n<Object> nVar2 = yVar.f2327o;
        this.f2327o = nVar2;
        this.f2328p = yVar.f2328p;
        this.s = nVar2 == nVar;
        this.f2321i = wVar.f1613n;
        this.f2324l = wVar.f1614o;
        m mVar = oVar.f2052b.get();
        if (mVar == null) {
            synchronized (oVar) {
                mVar = oVar.f2052b.get();
                if (mVar == null) {
                    m mVar2 = new m(oVar.a);
                    oVar.f2052b.set(mVar2);
                    mVar = mVar2;
                }
            }
        }
        this.f2329q = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.f2323k.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r4.f2323k.a(r4.f2320h.f1609i.f1589k.b((b.j.a.c.i0.c) null, r5, b.j.a.c.i0.n.f2185l));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r0 = o(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<java.lang.Object> A(java.lang.Class<?> r5, b.j.a.c.d r6) {
        /*
            r4 = this;
            b.j.a.c.h0.s.m r0 = r4.f2329q
            b.j.a.c.n r0 = r0.b(r5)
            if (r0 != 0) goto L_0x0030
            b.j.a.c.h0.o r0 = r4.f2323k
            b.j.a.c.n r0 = r0.b(r5)
            if (r0 != 0) goto L_0x0030
            b.j.a.c.h0.o r0 = r4.f2323k
            b.j.a.c.w r1 = r4.f2320h
            b.j.a.c.a0.a r1 = r1.f1609i
            b.j.a.c.i0.n r1 = r1.f1589k
            b.j.a.c.i0.m r2 = b.j.a.c.i0.n.f2185l
            r3 = 0
            b.j.a.c.i r1 = r1.b(r3, r5, r2)
            b.j.a.c.n r0 = r0.a(r1)
            if (r0 != 0) goto L_0x0030
            b.j.a.c.n r0 = r4.o(r5)
            if (r0 != 0) goto L_0x0030
            b.j.a.c.n r5 = r4.E(r5)
            return r5
        L_0x0030:
            b.j.a.c.n r5 = r4.G(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.y.A(java.lang.Class, b.j.a.c.d):b.j.a.c.n");
    }

    public final b B() {
        return this.f2320h.e();
    }

    public Object D(Object obj) {
        Object obj2;
        e.a aVar = (e.a) this.f2324l;
        Map<Object, Object> map = aVar.f1601i;
        if (map == null || (obj2 = map.get(obj)) == null) {
            return aVar.f1600h.get(obj);
        }
        if (obj2 == e.a.f1599k) {
            return null;
        }
        return obj2;
    }

    public n<Object> E(Class<?> cls) {
        return cls == Object.class ? this.f2325m : new q(cls);
    }

    public n<?> F(n<?> nVar, d dVar) {
        return (nVar == null || !(nVar instanceof i)) ? nVar : ((i) nVar).a(this, dVar);
    }

    public n<?> G(n<?> nVar, d dVar) {
        return (nVar == null || !(nVar instanceof i)) ? nVar : ((i) nVar).a(this, dVar);
    }

    public abstract Object H(r rVar, Class<?> cls);

    public abstract boolean I(Object obj);

    public final boolean J(p pVar) {
        return this.f2320h.o(pVar);
    }

    public final boolean K(x xVar) {
        return this.f2320h.w(xVar);
    }

    public <T> T L(c cVar, r rVar, String str, Object... objArr) {
        String b2 = b(str, objArr);
        String str2 = "N/A";
        String c = rVar != null ? c(rVar.getName()) : str2;
        if (cVar != null) {
            str2 = g.y(cVar.a.f2152h);
        }
        throw new b(((j) this).x, String.format("Invalid definition for property %s (of type %s): %s", new Object[]{c, str2, b2}), cVar, rVar);
    }

    public <T> T M(c cVar, String str, Object... objArr) {
        throw new b(((j) this).x, String.format("Invalid type definition for type %s: %s", new Object[]{g.y(cVar.a.f2152h), b(str, objArr)}), cVar, (r) null);
    }

    public abstract n<Object> N(a aVar, Object obj);

    public b.j.a.c.a0.g g() {
        return this.f2320h;
    }

    public final n h() {
        return this.f2320h.f1609i.f1589k;
    }

    public k i(i iVar, String str, String str2) {
        return new b.j.a.c.c0.e((b.j.a.b.i) null, a(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, iVar}), str2), iVar, str);
    }

    public <T> T l(i iVar, String str) {
        throw new b(((j) this).x, str, iVar);
    }

    public n<Object> n(i iVar) {
        try {
            n<Object> q2 = q(iVar);
            if (q2 != null) {
                o oVar = this.f2323k;
                synchronized (oVar) {
                    if (oVar.a.put(new b0(iVar, false), q2) == null) {
                        oVar.f2052b.set((Object) null);
                    }
                    if (q2 instanceof b.j.a.c.h0.n) {
                        ((b.j.a.c.h0.n) q2).b(this);
                    }
                }
            }
            return q2;
        } catch (IllegalArgumentException e2) {
            throw new k((Closeable) ((j) this).x, b(g.i(e2), new Object[0]), (Throwable) e2);
        }
    }

    public n<Object> o(Class<?> cls) {
        n<Object> a;
        i b2 = this.f2320h.f1609i.f1589k.b((b.j.a.c.i0.c) null, cls, n.f2185l);
        try {
            synchronized (this.f2323k) {
                a = this.f2322j.a(this, b2);
            }
            if (a != null) {
                o oVar = this.f2323k;
                synchronized (oVar) {
                    n<Object> put = oVar.a.put(new b0(cls, false), a);
                    n<Object> put2 = oVar.a.put(new b0(b2, false), a);
                    if (put == null || put2 == null) {
                        oVar.f2052b.set((Object) null);
                    }
                    if (a instanceof b.j.a.c.h0.n) {
                        ((b.j.a.c.h0.n) a).b(this);
                    }
                }
            }
            return a;
        } catch (IllegalArgumentException e2) {
            throw new k((Closeable) ((j) this).x, b(g.i(e2), new Object[0]), (Throwable) e2);
        }
    }

    public n<Object> q(i iVar) {
        n<Object> a;
        synchronized (this.f2323k) {
            a = this.f2322j.a(this, iVar);
        }
        return a;
    }

    public final DateFormat r() {
        DateFormat dateFormat = this.r;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.f2320h.f1609i.f1591m.clone();
        this.r = dateFormat2;
        return dateFormat2;
    }

    public final void t(f fVar) {
        if (this.s) {
            fVar.u0();
        } else {
            this.f2327o.f(null, fVar, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002d A[LOOP:0: B:6:0x002d->B:9:0x003d, LOOP_START, PHI: r4 
      PHI: (r4v3 b.j.a.c.n<?>) = (r4v0 b.j.a.c.n<?>), (r4v6 b.j.a.c.n<?>) binds: [B:5:0x0023, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<java.lang.Object> u(b.j.a.c.i r11, b.j.a.c.d r12) {
        /*
            r10 = this;
            b.j.a.c.h0.p r0 = r10.f2322j
            b.j.a.c.w r1 = r10.f2320h
            b.j.a.c.n<java.lang.Object> r2 = r10.f2326n
            b.j.a.c.h0.b r0 = (b.j.a.c.h0.b) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<?> r3 = r11.f2152h
            b.j.a.c.c r3 = r1.m(r3)
            r4 = 0
            b.j.a.c.a0.i r5 = r0.f2036h
            java.util.Objects.requireNonNull(r5)
            b.j.a.c.h0.q[] r5 = b.j.a.c.a0.i.f1617h
            int r6 = r5.length
            r7 = 1
            r8 = 0
            if (r6 <= 0) goto L_0x0020
            r6 = r7
            goto L_0x0021
        L_0x0020:
            r6 = r8
        L_0x0021:
            if (r6 == 0) goto L_0x003f
            b.j.a.c.a0.i r6 = r0.f2036h
            b.j.a.c.j0.d r9 = new b.j.a.c.j0.d
            java.util.Objects.requireNonNull(r6)
            r9.<init>(r5)
        L_0x002d:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r4 = r9.next()
            b.j.a.c.h0.q r4 = (b.j.a.c.h0.q) r4
            b.j.a.c.n r4 = r4.e(r1, r11, r3)
            if (r4 == 0) goto L_0x002d
        L_0x003f:
            if (r4 != 0) goto L_0x009e
            if (r2 != 0) goto L_0x009f
            java.lang.Class<?> r2 = r11.f2152h
            b.j.a.c.n r2 = b.j.a.c.h0.t.q0.a(r2, r8)
            if (r2 != 0) goto L_0x009f
            b.j.a.c.c r2 = r1.v(r11)
            b.j.a.c.e0.h r2 = r2.c()
            if (r2 == 0) goto L_0x0076
            java.lang.Class r11 = r2.e()
            b.j.a.c.n r11 = b.j.a.c.h0.t.q0.a(r11, r7)
            boolean r3 = r1.b()
            if (r3 == 0) goto L_0x0070
            java.lang.reflect.Member r3 = r2.j()
            b.j.a.c.p r4 = b.j.a.c.p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r1 = r1.o(r4)
            b.j.a.c.j0.g.e(r3, r1)
        L_0x0070:
            b.j.a.c.h0.t.s r1 = new b.j.a.c.h0.t.s
            r1.<init>(r2, r11)
            goto L_0x009c
        L_0x0076:
            java.lang.Class<?> r11 = r11.f2152h
            if (r11 == 0) goto L_0x0095
            java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
            if (r11 != r2) goto L_0x0085
            b.j.a.c.h0.t.q0$b r11 = new b.j.a.c.h0.t.q0$b
            r11.<init>()
            r2 = r11
            goto L_0x009f
        L_0x0085:
            boolean r2 = r11.isEnum()
            if (r2 == 0) goto L_0x0095
            b.j.a.c.j0.l r1 = b.j.a.c.j0.l.a(r1, r11)
            b.j.a.c.h0.t.q0$c r2 = new b.j.a.c.h0.t.q0$c
            r2.<init>(r11, r1)
            goto L_0x009f
        L_0x0095:
            b.j.a.c.h0.t.q0$a r1 = new b.j.a.c.h0.t.q0$a
            r2 = 8
            r1.<init>(r2, r11)
        L_0x009c:
            r2 = r1
            goto L_0x009f
        L_0x009e:
            r2 = r4
        L_0x009f:
            b.j.a.c.a0.i r11 = r0.f2036h
            boolean r11 = r11.a()
            if (r11 == 0) goto L_0x00bf
            b.j.a.c.a0.i r11 = r0.f2036h
            java.lang.Iterable r11 = r11.b()
            b.j.a.c.j0.d r11 = (b.j.a.c.j0.d) r11
        L_0x00af:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r11.next()
            b.j.a.c.h0.g r0 = (b.j.a.c.h0.g) r0
            java.util.Objects.requireNonNull(r0)
            goto L_0x00af
        L_0x00bf:
            boolean r11 = r2 instanceof b.j.a.c.h0.n
            if (r11 == 0) goto L_0x00c9
            r11 = r2
            b.j.a.c.h0.n r11 = (b.j.a.c.h0.n) r11
            r11.b(r10)
        L_0x00c9:
            b.j.a.c.n r11 = r10.G(r2, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.y.u(b.j.a.c.i, b.j.a.c.d):b.j.a.c.n");
    }

    public abstract t v(Object obj, i0<?> i0Var);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.f2323k.a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = n(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<java.lang.Object> w(b.j.a.c.i r2, b.j.a.c.d r3) {
        /*
            r1 = this;
            b.j.a.c.h0.s.m r0 = r1.f2329q
            b.j.a.c.n r0 = r0.a(r2)
            if (r0 != 0) goto L_0x001d
            b.j.a.c.h0.o r0 = r1.f2323k
            b.j.a.c.n r0 = r0.a(r2)
            if (r0 != 0) goto L_0x001d
            b.j.a.c.n r0 = r1.n(r2)
            if (r0 != 0) goto L_0x001d
            java.lang.Class<?> r2 = r2.f2152h
            b.j.a.c.n r2 = r1.E(r2)
            return r2
        L_0x001d:
            b.j.a.c.n r2 = r1.F(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.y.w(b.j.a.c.i, b.j.a.c.d):b.j.a.c.n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<java.lang.Object> x(java.lang.Class<?> r8, boolean r9, b.j.a.c.d r10) {
        /*
            r7 = this;
            b.j.a.c.h0.s.m r0 = r7.f2329q
            b.j.a.c.h0.s.m$a[] r1 = r0.a
            java.lang.String r2 = r8.getName()
            int r2 = r2.hashCode()
            r3 = 1
            int r2 = r2 + r3
            int r0 = r0.f2072b
            r0 = r0 & r2
            r0 = r1[r0]
            r1 = 0
            if (r0 != 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            java.lang.Class<?> r2 = r0.c
            r4 = 0
            if (r2 != r8) goto L_0x0022
            boolean r2 = r0.f2074e
            if (r2 == 0) goto L_0x0022
            r2 = r3
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            if (r2 == 0) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            b.j.a.c.h0.s.m$a r0 = r0.f2073b
            if (r0 == 0) goto L_0x003a
            java.lang.Class<?> r2 = r0.c
            if (r2 != r8) goto L_0x0034
            boolean r2 = r0.f2074e
            if (r2 == 0) goto L_0x0034
            r2 = r3
            goto L_0x0035
        L_0x0034:
            r2 = r4
        L_0x0035:
            if (r2 == 0) goto L_0x0026
        L_0x0037:
            b.j.a.c.n<java.lang.Object> r0 = r0.a
            goto L_0x003b
        L_0x003a:
            r0 = r1
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            return r0
        L_0x003e:
            b.j.a.c.h0.o r0 = r7.f2323k
            monitor-enter(r0)
            java.util.HashMap<b.j.a.c.j0.b0, b.j.a.c.n<java.lang.Object>> r2 = r0.a     // Catch:{ all -> 0x0091 }
            b.j.a.c.j0.b0 r4 = new b.j.a.c.j0.b0     // Catch:{ all -> 0x0091 }
            r4.<init>((java.lang.Class<?>) r8, (boolean) r3)     // Catch:{ all -> 0x0091 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0091 }
            b.j.a.c.n r2 = (b.j.a.c.n) r2     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x0052
            return r2
        L_0x0052:
            b.j.a.c.n r0 = r7.A(r8, r10)
            b.j.a.c.h0.p r2 = r7.f2322j
            b.j.a.c.w r4 = r7.f2320h
            b.j.a.c.a0.a r5 = r4.f1609i
            b.j.a.c.i0.n r5 = r5.f1589k
            b.j.a.c.i0.m r6 = b.j.a.c.i0.n.f2185l
            b.j.a.c.i r5 = r5.b(r1, r8, r6)
            b.j.a.c.f0.f r2 = r2.b(r4, r5)
            if (r2 == 0) goto L_0x0074
            b.j.a.c.f0.f r10 = r2.a(r10)
            b.j.a.c.h0.s.p r2 = new b.j.a.c.h0.s.p
            r2.<init>(r10, r0)
            r0 = r2
        L_0x0074:
            if (r9 == 0) goto L_0x0090
            b.j.a.c.h0.o r9 = r7.f2323k
            monitor-enter(r9)
            java.util.HashMap<b.j.a.c.j0.b0, b.j.a.c.n<java.lang.Object>> r10 = r9.a     // Catch:{ all -> 0x008d }
            b.j.a.c.j0.b0 r2 = new b.j.a.c.j0.b0     // Catch:{ all -> 0x008d }
            r2.<init>((java.lang.Class<?>) r8, (boolean) r3)     // Catch:{ all -> 0x008d }
            java.lang.Object r8 = r10.put(r2, r0)     // Catch:{ all -> 0x008d }
            if (r8 != 0) goto L_0x008b
            java.util.concurrent.atomic.AtomicReference<b.j.a.c.h0.s.m> r8 = r9.f2052b     // Catch:{ all -> 0x008d }
            r8.set(r1)     // Catch:{ all -> 0x008d }
        L_0x008b:
            monitor-exit(r9)     // Catch:{ all -> 0x008d }
            goto L_0x0090
        L_0x008d:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x008d }
            throw r8
        L_0x0090:
            return r0
        L_0x0091:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.y.x(java.lang.Class, boolean, b.j.a.c.d):b.j.a.c.n");
    }

    public n<Object> y(i iVar) {
        n<Object> a = this.f2329q.a(iVar);
        if (a != null) {
            return a;
        }
        n<Object> a2 = this.f2323k.a(iVar);
        if (a2 != null) {
            return a2;
        }
        n<Object> n2 = n(iVar);
        return n2 == null ? E(iVar.f2152h) : n2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r0 = r2.f2323k.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = n(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<java.lang.Object> z(b.j.a.c.i r3, b.j.a.c.d r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0024
            b.j.a.c.h0.s.m r0 = r2.f2329q
            b.j.a.c.n r0 = r0.a(r3)
            if (r0 != 0) goto L_0x001f
            b.j.a.c.h0.o r0 = r2.f2323k
            b.j.a.c.n r0 = r0.a(r3)
            if (r0 != 0) goto L_0x001f
            b.j.a.c.n r0 = r2.n(r3)
            if (r0 != 0) goto L_0x001f
            java.lang.Class<?> r3 = r3.f2152h
            b.j.a.c.n r3 = r2.E(r3)
            return r3
        L_0x001f:
            b.j.a.c.n r3 = r2.G(r0, r4)
            return r3
        L_0x0024:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r2
            b.j.a.c.h0.j r4 = (b.j.a.c.h0.j) r4
            b.j.a.b.f r4 = r4.x
            java.lang.String r0 = "Null passed for `valueType` of `findValueSerializer()`"
            java.lang.String r3 = r2.b(r0, r3)
            b.j.a.c.k r0 = new b.j.a.c.k
            r1 = 0
            r0.<init>((java.io.Closeable) r4, (java.lang.String) r3, (java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.y.z(b.j.a.c.i, b.j.a.c.d):b.j.a.c.n");
    }
}
