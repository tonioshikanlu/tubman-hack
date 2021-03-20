package b.j.a.c.h0.t;

import b.j.a.a.k;
import b.j.a.b.l;
import b.j.a.c.b;
import b.j.a.c.e0.h;
import b.j.a.c.f0.f;
import b.j.a.c.h0.a;
import b.j.a.c.h0.c;
import b.j.a.c.h0.e;
import b.j.a.c.h0.i;
import b.j.a.c.h0.n;
import b.j.a.c.h0.s.j;
import b.j.a.c.j0.r;
import b.j.a.c.k;
import b.j.a.c.t;
import b.j.a.c.y;
import java.io.Closeable;
import java.util.Objects;
import java.util.Set;

public abstract class d extends s0<Object> implements i, n {
    public static final c[] r = new c[0];

    /* renamed from: j  reason: collision with root package name */
    public final b.j.a.c.i f2091j;

    /* renamed from: k  reason: collision with root package name */
    public final c[] f2092k;

    /* renamed from: l  reason: collision with root package name */
    public final c[] f2093l;

    /* renamed from: m  reason: collision with root package name */
    public final a f2094m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f2095n;

    /* renamed from: o  reason: collision with root package name */
    public final h f2096o;

    /* renamed from: p  reason: collision with root package name */
    public final j f2097p;

    /* renamed from: q  reason: collision with root package name */
    public final k.c f2098q;

    static {
        new t("#object-ref");
    }

    public d(d dVar, j jVar, Object obj) {
        super(dVar.f2137h);
        this.f2091j = dVar.f2091j;
        this.f2092k = dVar.f2092k;
        this.f2093l = dVar.f2093l;
        this.f2096o = dVar.f2096o;
        this.f2094m = dVar.f2094m;
        this.f2097p = jVar;
        this.f2095n = obj;
        this.f2098q = dVar.f2098q;
    }

    public d(b.j.a.c.i iVar, e eVar, c[] cVarArr, c[] cVarArr2) {
        super(iVar);
        this.f2091j = iVar;
        this.f2092k = cVarArr;
        this.f2093l = cVarArr2;
        k.c cVar = null;
        if (eVar == null) {
            this.f2096o = null;
            this.f2094m = null;
            this.f2095n = null;
            this.f2097p = null;
        } else {
            this.f2096o = eVar.f2047g;
            this.f2094m = eVar.f2046e;
            this.f2095n = eVar.f;
            this.f2097p = eVar.f2048h;
            k.d b2 = eVar.a.b((k.d) null);
            if (b2 != null) {
                cVar = b2.f1327i;
            }
        }
        this.f2098q = cVar;
    }

    public static final c[] v(c[] cVarArr, r rVar) {
        if (cVarArr == null || cVarArr.length == 0 || rVar == null || rVar == r.f2232h) {
            return cVarArr;
        }
        int length = cVarArr.length;
        c[] cVarArr2 = new c[length];
        for (int i2 = 0; i2 < length; i2++) {
            c cVar = cVarArr[i2];
            if (cVar != null) {
                cVarArr2[i2] = cVar.g(rVar);
            }
        }
        return cVarArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.Set<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.Set<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.Set<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.util.Set<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.Set<java.lang.String>} */
    /* JADX WARNING: type inference failed for: r8v2, types: [b.j.a.c.h0.s.k, b.j.a.a.i0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r18, b.j.a.c.d r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r9 = r19
            b.j.a.c.b r2 = r18.B()
            r3 = 0
            if (r9 == 0) goto L_0x0015
            if (r2 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            b.j.a.c.e0.h r4 = r19.e()
            goto L_0x0016
        L_0x0015:
            r4 = r3
        L_0x0016:
            b.j.a.c.w r5 = r1.f2320h
            java.lang.Class<T> r6 = r0.f2137h
            b.j.a.a.k$d r6 = r0.l(r1, r9, r6)
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x00a9
            b.j.a.a.k$c r10 = r6.f1327i
            b.j.a.a.k$c r11 = b.j.a.a.k.c.ANY
            if (r10 == r11) goto L_0x002a
            r12 = r8
            goto L_0x002b
        L_0x002a:
            r12 = r7
        L_0x002b:
            if (r12 == 0) goto L_0x00a9
            if (r10 == r11) goto L_0x00aa
            b.j.a.a.k$c r11 = r0.f2098q
            if (r10 == r11) goto L_0x00aa
            java.lang.Class<T> r11 = r0.f2137h
            boolean r11 = r11.isEnum()
            if (r11 == 0) goto L_0x0067
            int r11 = r10.ordinal()
            r12 = 5
            if (r11 == r12) goto L_0x004a
            r12 = 7
            if (r11 == r12) goto L_0x004a
            r12 = 8
            if (r11 == r12) goto L_0x004a
            goto L_0x00aa
        L_0x004a:
            b.j.a.c.i r2 = r0.f2091j
            r5.l(r2)
            b.j.a.c.i r2 = r0.f2091j
            java.lang.Class<?> r2 = r2.f2152h
            b.j.a.c.w r4 = r1.f2320h
            b.j.a.c.j0.l r4 = b.j.a.c.j0.l.a(r4, r2)
            java.lang.Boolean r2 = b.j.a.c.h0.t.m.q(r2, r6, r8, r3)
            b.j.a.c.h0.t.m r3 = new b.j.a.c.h0.t.m
            r3.<init>(r4, r2)
            b.j.a.c.n r1 = r1.F(r3, r9)
            return r1
        L_0x0067:
            b.j.a.a.k$c r5 = b.j.a.a.k.c.NATURAL
            if (r10 != r5) goto L_0x00aa
            b.j.a.c.i r5 = r0.f2091j
            boolean r5 = r5.G()
            if (r5 == 0) goto L_0x007e
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            java.lang.Class<T> r6 = r0.f2137h
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L_0x007e
            goto L_0x00aa
        L_0x007e:
            java.lang.Class<java.util.Map$Entry> r5 = java.util.Map.Entry.class
            java.lang.Class<T> r6 = r0.f2137h
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L_0x00aa
            b.j.a.c.i r2 = r0.f2091j
            java.lang.Class<java.util.Map$Entry> r3 = java.util.Map.Entry.class
            b.j.a.c.i r2 = r2.i(r3)
            b.j.a.c.i r4 = r2.h(r7)
            b.j.a.c.i r5 = r2.h(r8)
            b.j.a.c.h0.s.i r10 = new b.j.a.c.h0.s.i
            b.j.a.c.i r3 = r0.f2091j
            r6 = 0
            r7 = 0
            r2 = r10
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            b.j.a.c.n r1 = r1.F(r10, r9)
            return r1
        L_0x00a9:
            r10 = r3
        L_0x00aa:
            b.j.a.c.h0.s.j r5 = r0.f2097p
            if (r4 == 0) goto L_0x0179
            b.j.a.a.p$a r6 = r2.J(r4)
            if (r6 == 0) goto L_0x00b9
            java.util.Set r6 = r6.d()
            goto L_0x00ba
        L_0x00b9:
            r6 = r3
        L_0x00ba:
            b.j.a.c.e0.y r11 = r2.z(r4)
            if (r11 != 0) goto L_0x00e5
            if (r5 == 0) goto L_0x0165
            b.j.a.c.e0.y r7 = r2.A(r4, r3)
            if (r7 == 0) goto L_0x0165
            b.j.a.c.h0.s.j r5 = r0.f2097p
            boolean r7 = r7.f1959e
            boolean r8 = r5.f2063e
            if (r7 != r8) goto L_0x00d2
            goto L_0x0165
        L_0x00d2:
            b.j.a.c.h0.s.j r8 = new b.j.a.c.h0.s.j
            b.j.a.c.i r12 = r5.a
            b.j.a.b.o r13 = r5.f2062b
            b.j.a.a.i0<?> r14 = r5.c
            b.j.a.c.n<java.lang.Object> r15 = r5.d
            r11 = r8
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            r5 = r8
            goto L_0x0165
        L_0x00e5:
            b.j.a.c.e0.y r5 = r2.A(r4, r11)
            java.lang.Class<? extends b.j.a.a.i0<?>> r11 = r5.f1958b
            b.j.a.c.i r12 = r1.e(r11)
            b.j.a.c.i0.n r13 = r18.h()
            java.lang.Class<b.j.a.a.i0> r14 = b.j.a.a.i0.class
            b.j.a.c.i[] r12 = r13.m(r12, r14)
            r12 = r12[r7]
            java.lang.Class<b.j.a.a.k0> r13 = b.j.a.a.k0.class
            if (r11 != r13) goto L_0x0159
            b.j.a.c.t r11 = r5.a
            java.lang.String r11 = r11.f2305h
            b.j.a.c.h0.c[] r12 = r0.f2092k
            int r12 = r12.length
            r13 = r7
        L_0x0107:
            if (r13 == r12) goto L_0x0140
            b.j.a.c.h0.c[] r14 = r0.f2092k
            r14 = r14[r13]
            b.j.a.b.s.i r15 = r14.f2037k
            java.lang.String r15 = r15.f1484h
            boolean r15 = r11.equals(r15)
            if (r15 == 0) goto L_0x013d
            if (r13 <= 0) goto L_0x012f
            b.j.a.c.h0.c[] r11 = r0.f2092k
            java.lang.System.arraycopy(r11, r7, r11, r8, r13)
            b.j.a.c.h0.c[] r11 = r0.f2092k
            r11[r7] = r14
            b.j.a.c.h0.c[] r11 = r0.f2093l
            if (r11 == 0) goto L_0x012f
            r12 = r11[r13]
            java.lang.System.arraycopy(r11, r7, r11, r8, r13)
            b.j.a.c.h0.c[] r8 = r0.f2093l
            r8[r7] = r12
        L_0x012f:
            b.j.a.c.i r7 = r14.f2039m
            b.j.a.c.h0.s.k r8 = new b.j.a.c.h0.s.k
            r8.<init>((b.j.a.c.e0.y) r5, (b.j.a.c.h0.c) r14)
            boolean r5 = r5.f1959e
            b.j.a.c.h0.s.j r5 = b.j.a.c.h0.s.j.a(r7, r3, r8, r5)
            goto L_0x0165
        L_0x013d:
            int r13 = r13 + 1
            goto L_0x0107
        L_0x0140:
            b.j.a.c.i r2 = r0.f2091j
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Class<T> r5 = r0.f2137h
            java.lang.String r5 = r5.getName()
            r4[r7] = r5
            r4[r8] = r11
            java.lang.String r5 = "Invalid Object Id definition for %s: cannot find property with name '%s'"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r1.l(r2, r4)
            throw r3
        L_0x0159:
            b.j.a.a.i0 r7 = r1.j(r4, r5)
            b.j.a.c.t r8 = r5.a
            boolean r5 = r5.f1959e
            b.j.a.c.h0.s.j r5 = b.j.a.c.h0.s.j.a(r12, r8, r7, r5)
        L_0x0165:
            java.lang.Object r2 = r2.l(r4)
            if (r2 == 0) goto L_0x0176
            java.lang.Object r4 = r0.f2095n
            if (r4 == 0) goto L_0x0175
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0176
        L_0x0175:
            r3 = r2
        L_0x0176:
            r2 = r3
            r3 = r6
            goto L_0x017a
        L_0x0179:
            r2 = r3
        L_0x017a:
            if (r5 == 0) goto L_0x019b
            b.j.a.c.i r4 = r5.a
            b.j.a.c.n r15 = r1.z(r4, r9)
            b.j.a.c.h0.s.j r1 = new b.j.a.c.h0.s.j
            b.j.a.c.i r12 = r5.a
            b.j.a.b.o r13 = r5.f2062b
            b.j.a.a.i0<?> r14 = r5.c
            boolean r4 = r5.f2063e
            r11 = r1
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            b.j.a.c.h0.s.j r4 = r0.f2097p
            if (r1 == r4) goto L_0x019b
            b.j.a.c.h0.t.d r1 = r0.z(r1)
            goto L_0x019c
        L_0x019b:
            r1 = r0
        L_0x019c:
            if (r3 == 0) goto L_0x01a8
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x01a8
            b.j.a.c.h0.t.d r1 = r1.y(r3)
        L_0x01a8:
            if (r2 == 0) goto L_0x01ae
            b.j.a.c.h0.t.d r1 = r1.x(r2)
        L_0x01ae:
            if (r10 != 0) goto L_0x01b2
            b.j.a.a.k$c r10 = r0.f2098q
        L_0x01b2:
            b.j.a.a.k$c r2 = b.j.a.a.k.c.ARRAY
            if (r10 != r2) goto L_0x01ba
            b.j.a.c.h0.t.d r1 = r1.u()
        L_0x01ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.d.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public void b(y yVar) {
        c cVar;
        f fVar;
        h hVar;
        Object Q;
        b.j.a.c.n<Object> nVar;
        c cVar2;
        c[] cVarArr = this.f2093l;
        int length = cVarArr == null ? 0 : cVarArr.length;
        int length2 = this.f2092k.length;
        for (int i2 = 0; i2 < length2; i2++) {
            c cVar3 = this.f2092k[i2];
            boolean z = true;
            if (!cVar3.x) {
                if (!(cVar3.u != null) && (nVar = yVar.f2327o) != null) {
                    cVar3.c(nVar);
                    if (i2 < length && (cVar2 = this.f2093l[i2]) != null) {
                        cVar2.c(nVar);
                    }
                }
            }
            if (cVar3.t == null) {
                z = false;
            }
            if (!z) {
                b B = yVar.B();
                b.j.a.c.n<Object> nVar2 = null;
                if (!(B == null || (hVar = cVar3.f2043q) == null || (Q = B.Q(hVar)) == null)) {
                    b.j.a.c.j0.j<Object, Object> f = yVar.f(cVar3.f2043q, Q);
                    b.j.a.c.i c = f.c(yVar.h());
                    if (!c.F()) {
                        nVar2 = yVar.z(c, cVar3);
                    }
                    nVar2 = new l0(f, c, nVar2);
                }
                if (nVar2 == null) {
                    b.j.a.c.i iVar = cVar3.f2040n;
                    if (iVar == null) {
                        iVar = cVar3.f2039m;
                        if (!iVar.D()) {
                            if (iVar.A() || iVar.g() > 0) {
                                cVar3.f2041o = iVar;
                            }
                        }
                    }
                    nVar2 = yVar.z(iVar, cVar3);
                    if (iVar.A() && (fVar = (f) iVar.k().f2155k) != null && (nVar2 instanceof b.j.a.c.h0.h)) {
                        b.j.a.c.h0.h hVar2 = (b.j.a.c.h0.h) nVar2;
                        Objects.requireNonNull(hVar2);
                        nVar2 = hVar2.q(fVar);
                    }
                }
                if (i2 >= length || (cVar = this.f2093l[i2]) == null) {
                    cVar3.f(nVar2);
                } else {
                    cVar.f(nVar2);
                }
            }
        }
        a aVar = this.f2094m;
        if (aVar != null) {
            b.j.a.c.n<Object> nVar3 = aVar.c;
            if (nVar3 instanceof i) {
                b.j.a.c.n<?> F = yVar.F(nVar3, aVar.a);
                aVar.c = F;
                if (F instanceof t) {
                    aVar.d = (t) F;
                }
            }
        }
    }

    public void g(Object obj, b.j.a.b.f fVar, y yVar, f fVar2) {
        j jVar = this.f2097p;
        fVar.Y(obj);
        if (jVar != null) {
            q(obj, fVar, yVar, fVar2);
            return;
        }
        b.j.a.b.v.b t = t(fVar2, obj, l.START_OBJECT);
        fVar2.e(fVar, t);
        Object obj2 = this.f2095n;
        if (obj2 != null) {
            if (this.f2093l != null) {
                Class<?> cls = yVar.f2321i;
            }
            m(yVar, obj2, obj);
            throw null;
        }
        w(obj, fVar, yVar);
        fVar2.f(fVar, t);
    }

    public boolean i() {
        return this.f2097p != null;
    }

    public final void q(Object obj, b.j.a.b.f fVar, y yVar, f fVar2) {
        j jVar = this.f2097p;
        b.j.a.c.h0.s.t v = yVar.v(obj, jVar.c);
        if (!v.b(fVar, yVar, jVar)) {
            if (v.f2080b == null) {
                v.f2080b = v.a.c(obj);
            }
            Object obj2 = v.f2080b;
            if (jVar.f2063e) {
                jVar.d.f(obj2, fVar, yVar);
                return;
            }
            j jVar2 = this.f2097p;
            b.j.a.b.v.b t = t(fVar2, obj, l.START_OBJECT);
            fVar2.e(fVar, t);
            v.a(fVar, yVar, jVar2);
            Object obj3 = this.f2095n;
            if (obj3 == null) {
                w(obj, fVar, yVar);
                fVar2.f(fVar, t);
                return;
            }
            m(yVar, obj3, obj);
            throw null;
        }
    }

    public final void r(Object obj, b.j.a.b.f fVar, y yVar, boolean z) {
        j jVar = this.f2097p;
        b.j.a.c.h0.s.t v = yVar.v(obj, jVar.c);
        if (!v.b(fVar, yVar, jVar)) {
            if (v.f2080b == null) {
                v.f2080b = v.a.c(obj);
            }
            Object obj2 = v.f2080b;
            if (jVar.f2063e) {
                jVar.d.f(obj2, fVar, yVar);
                return;
            }
            if (z) {
                fVar.O0(obj);
            }
            v.a(fVar, yVar, jVar);
            Object obj3 = this.f2095n;
            if (obj3 == null) {
                w(obj, fVar, yVar);
                if (z) {
                    fVar.r0();
                    return;
                }
                return;
            }
            m(yVar, obj3, obj);
            throw null;
        }
    }

    public final b.j.a.b.v.b t(f fVar, Object obj, l lVar) {
        h hVar = this.f2096o;
        if (hVar == null) {
            return fVar.d(obj, lVar);
        }
        Object k2 = hVar.k(obj);
        if (k2 == null) {
            k2 = "";
        }
        b.j.a.b.v.b d = fVar.d(obj, lVar);
        d.c = k2;
        return d;
    }

    public abstract d u();

    public void w(Object obj, b.j.a.b.f fVar, y yVar) {
        String str = "[anySetter]";
        c[] cVarArr = this.f2093l;
        if (cVarArr == null || yVar.f2321i == null) {
            cVarArr = this.f2092k;
        }
        try {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    cVar.k(obj, fVar, yVar);
                }
            }
            a aVar = this.f2094m;
            if (aVar != null) {
                aVar.a(obj, fVar, yVar);
            }
        } catch (Exception e2) {
            if (0 != cVarArr.length) {
                str = cVarArr[0].f2037k.f1484h;
            }
            o(yVar, e2, obj, str);
            throw null;
        } catch (StackOverflowError e3) {
            b.j.a.c.k kVar = new b.j.a.c.k((Closeable) fVar, "Infinite recursion (StackOverflowError)", (Throwable) e3);
            if (0 != cVarArr.length) {
                str = cVarArr[0].f2037k.f1484h;
            }
            kVar.e(new k.a(obj, str));
            throw kVar;
        }
    }

    public abstract d x(Object obj);

    public abstract d y(Set<String> set);

    public abstract d z(j jVar);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(d dVar, r rVar) {
        super(dVar.f2137h);
        c[] v = v(dVar.f2092k, rVar);
        c[] v2 = v(dVar.f2093l, rVar);
        this.f2091j = dVar.f2091j;
        this.f2092k = v;
        this.f2093l = v2;
        this.f2096o = dVar.f2096o;
        this.f2094m = dVar.f2094m;
        this.f2097p = dVar.f2097p;
        this.f2095n = dVar.f2095n;
        this.f2098q = dVar.f2098q;
    }

    /* JADX WARNING: type inference failed for: r11v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(b.j.a.c.h0.t.d r10, java.util.Set<java.lang.String> r11) {
        /*
            r9 = this;
            java.lang.Class<T> r0 = r10.f2137h
            r9.<init>(r0)
            b.j.a.c.i r0 = r10.f2091j
            r9.f2091j = r0
            b.j.a.c.h0.c[] r0 = r10.f2092k
            b.j.a.c.h0.c[] r1 = r10.f2093l
            int r2 = r0.length
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = 0
            if (r1 != 0) goto L_0x0018
            r5 = r4
            goto L_0x001d
        L_0x0018:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x001d:
            r6 = 0
        L_0x001e:
            if (r6 >= r2) goto L_0x003c
            r7 = r0[r6]
            if (r11 == 0) goto L_0x002f
            b.j.a.b.s.i r8 = r7.f2037k
            java.lang.String r8 = r8.f1484h
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r3.add(r7)
            if (r1 == 0) goto L_0x0039
            r7 = r1[r6]
            r5.add(r7)
        L_0x0039:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x003c:
            int r11 = r3.size()
            b.j.a.c.h0.c[] r11 = new b.j.a.c.h0.c[r11]
            java.lang.Object[] r11 = r3.toArray(r11)
            b.j.a.c.h0.c[] r11 = (b.j.a.c.h0.c[]) r11
            r9.f2092k = r11
            if (r5 != 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            int r11 = r5.size()
            b.j.a.c.h0.c[] r11 = new b.j.a.c.h0.c[r11]
            java.lang.Object[] r11 = r5.toArray(r11)
            r4 = r11
            b.j.a.c.h0.c[] r4 = (b.j.a.c.h0.c[]) r4
        L_0x005a:
            r9.f2093l = r4
            b.j.a.c.e0.h r11 = r10.f2096o
            r9.f2096o = r11
            b.j.a.c.h0.a r11 = r10.f2094m
            r9.f2094m = r11
            b.j.a.c.h0.s.j r11 = r10.f2097p
            r9.f2097p = r11
            java.lang.Object r11 = r10.f2095n
            r9.f2095n = r11
            b.j.a.a.k$c r10 = r10.f2098q
            r9.f2098q = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.d.<init>(b.j.a.c.h0.t.d, java.util.Set):void");
    }
}
