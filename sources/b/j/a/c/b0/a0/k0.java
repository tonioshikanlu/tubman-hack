package b.j.a.c.b0.a0;

import b.j.a.b.l;
import b.j.a.c.b0.i;
import b.j.a.c.b0.s;
import b.j.a.c.d;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.i0.n;
import b.j.a.c.j;
import b.j.a.c.j0.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@b.j.a.c.z.a
public class k0 extends z<Object> implements s, i {
    public static final Object[] r = new Object[0];

    /* renamed from: k  reason: collision with root package name */
    public j<Object> f1691k;

    /* renamed from: l  reason: collision with root package name */
    public j<Object> f1692l;

    /* renamed from: m  reason: collision with root package name */
    public j<Object> f1693m;

    /* renamed from: n  reason: collision with root package name */
    public j<Object> f1694n;

    /* renamed from: o  reason: collision with root package name */
    public b.j.a.c.i f1695o;

    /* renamed from: p  reason: collision with root package name */
    public b.j.a.c.i f1696p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f1697q;

    @b.j.a.c.z.a
    public static class a extends z<Object> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f1698l = new a();

        /* renamed from: k  reason: collision with root package name */
        public final boolean f1699k;

        public a() {
            super((Class<?>) Object.class);
            this.f1699k = false;
        }

        public a(boolean z) {
            super((Class<?>) Object.class);
            this.f1699k = z;
        }

        public Object d(b.j.a.b.i iVar, g gVar) {
            int i2 = 2;
            switch (iVar.k0()) {
                case 1:
                    if (iVar.T0() == l.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    l T0 = iVar.T0();
                    l lVar = l.END_ARRAY;
                    if (T0 == lVar) {
                        return gVar.O(h.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? k0.r : new ArrayList(2);
                    }
                    if (gVar.O(h.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        t R = gVar.R();
                        Object[] g2 = R.g();
                        int i3 = 0;
                        while (true) {
                            Object d = d(iVar, gVar);
                            if (i3 >= g2.length) {
                                g2 = R.c(g2);
                                i3 = 0;
                            }
                            int i4 = i3 + 1;
                            g2[i3] = d;
                            if (iVar.T0() == l.END_ARRAY) {
                                int i5 = R.c + i4;
                                Object[] objArr = new Object[i5];
                                R.a(objArr, i5, g2, i4);
                                R.b();
                                return objArr;
                            }
                            i3 = i4;
                        }
                    } else {
                        Object d2 = d(iVar, gVar);
                        if (iVar.T0() == lVar) {
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(d2);
                            return arrayList;
                        }
                        Object d3 = d(iVar, gVar);
                        if (iVar.T0() == lVar) {
                            ArrayList arrayList2 = new ArrayList(2);
                            arrayList2.add(d2);
                            arrayList2.add(d3);
                            return arrayList2;
                        }
                        t R2 = gVar.R();
                        Object[] g3 = R2.g();
                        g3[0] = d2;
                        g3[1] = d3;
                        int i6 = 2;
                        while (true) {
                            Object d4 = d(iVar, gVar);
                            i2++;
                            if (i6 >= g3.length) {
                                g3 = R2.c(g3);
                                i6 = 0;
                            }
                            int i7 = i6 + 1;
                            g3[i6] = d4;
                            if (iVar.T0() == l.END_ARRAY) {
                                ArrayList arrayList3 = new ArrayList(i2);
                                R2.d(g3, i7, arrayList3);
                                return arrayList3;
                            }
                            i6 = i7;
                        }
                    }
                case 5:
                    break;
                case 6:
                    return iVar.x0();
                case 7:
                    return gVar.M(z.f1759i) ? r(iVar, gVar) : iVar.t0();
                case 8:
                    return gVar.O(h.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.m0() : iVar.t0();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return iVar.o0();
                default:
                    gVar.G(Object.class, iVar);
                    throw null;
            }
            String x0 = iVar.x0();
            iVar.T0();
            Object d5 = d(iVar, gVar);
            String R0 = iVar.R0();
            if (R0 == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(x0, d5);
                return linkedHashMap;
            }
            iVar.T0();
            Object d6 = d(iVar, gVar);
            String R02 = iVar.R0();
            if (R02 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                linkedHashMap2.put(x0, d5);
                linkedHashMap2.put(R0, d6);
                return linkedHashMap2;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(x0, d5);
            linkedHashMap3.put(R0, d6);
            do {
                iVar.T0();
                linkedHashMap3.put(R02, d(iVar, gVar));
                R02 = iVar.R0();
            } while (R02 != null);
            return linkedHashMap3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
            if (r0 != 5) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object e(b.j.a.b.i r5, b.j.a.c.g r6, java.lang.Object r7) {
            /*
                r4 = this;
                boolean r0 = r4.f1699k
                if (r0 == 0) goto L_0x0009
                java.lang.Object r5 = r4.d(r5, r6)
                return r5
            L_0x0009:
                int r0 = r5.k0()
                r1 = 1
                if (r0 == r1) goto L_0x003d
                r1 = 2
                if (r0 == r1) goto L_0x003c
                r1 = 3
                if (r0 == r1) goto L_0x001d
                r1 = 4
                if (r0 == r1) goto L_0x003c
                r1 = 5
                if (r0 == r1) goto L_0x0046
                goto L_0x006f
            L_0x001d:
                b.j.a.b.l r0 = r5.T0()
                b.j.a.b.l r1 = b.j.a.b.l.END_ARRAY
                if (r0 != r1) goto L_0x0026
                return r7
            L_0x0026:
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L_0x006f
                r0 = r7
                java.util.Collection r0 = (java.util.Collection) r0
            L_0x002d:
                java.lang.Object r1 = r4.d(r5, r6)
                r0.add(r1)
                b.j.a.b.l r1 = r5.T0()
                b.j.a.b.l r2 = b.j.a.b.l.END_ARRAY
                if (r1 != r2) goto L_0x002d
            L_0x003c:
                return r7
            L_0x003d:
                b.j.a.b.l r0 = r5.T0()
                b.j.a.b.l r1 = b.j.a.b.l.END_OBJECT
                if (r0 != r1) goto L_0x0046
                return r7
            L_0x0046:
                boolean r0 = r7 instanceof java.util.Map
                if (r0 == 0) goto L_0x006f
                r0 = r7
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = r5.e0()
            L_0x0051:
                r5.T0()
                java.lang.Object r2 = r0.get(r1)
                if (r2 == 0) goto L_0x005f
                java.lang.Object r3 = r4.e(r5, r6, r2)
                goto L_0x0063
            L_0x005f:
                java.lang.Object r3 = r4.d(r5, r6)
            L_0x0063:
                if (r3 == r2) goto L_0x0068
                r0.put(r1, r3)
            L_0x0068:
                java.lang.String r1 = r5.R0()
                if (r1 != 0) goto L_0x0051
                return r7
            L_0x006f:
                java.lang.Object r5 = r4.d(r5, r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.k0.a.e(b.j.a.b.i, b.j.a.c.g, java.lang.Object):java.lang.Object");
        }

        public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
            int k0 = iVar.k0();
            if (!(k0 == 1 || k0 == 3)) {
                switch (k0) {
                    case 5:
                        break;
                    case 6:
                        return iVar.x0();
                    case 7:
                        return gVar.O(h.USE_BIG_INTEGER_FOR_INTS) ? iVar.H() : iVar.t0();
                    case 8:
                        return gVar.O(h.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.m0() : iVar.t0();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return iVar.o0();
                    default:
                        gVar.G(Object.class, iVar);
                        throw null;
                }
            }
            return cVar.b(iVar, gVar);
        }

        public Boolean n(f fVar) {
            if (this.f1699k) {
                return Boolean.FALSE;
            }
            return null;
        }
    }

    @Deprecated
    public k0() {
        super((Class<?>) Object.class);
        this.f1695o = null;
        this.f1696p = null;
        this.f1697q = false;
    }

    public k0(k0 k0Var, boolean z) {
        super((Class<?>) Object.class);
        this.f1691k = k0Var.f1691k;
        this.f1692l = k0Var.f1692l;
        this.f1693m = k0Var.f1693m;
        this.f1694n = k0Var.f1694n;
        this.f1695o = k0Var.f1695o;
        this.f1696p = k0Var.f1696p;
        this.f1697q = z;
    }

    public k0(b.j.a.c.i iVar, b.j.a.c.i iVar2) {
        super((Class<?>) Object.class);
        this.f1695o = iVar;
        this.f1696p = iVar2;
        this.f1697q = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.j<?> a(b.j.a.c.g r4, b.j.a.c.d r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            b.j.a.c.f r4 = r4.f1993j
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            b.j.a.c.a0.d r2 = r4.f1616q
            r2.a(r1)
            b.j.a.c.a0.d r4 = r4.f1616q
            java.util.Objects.requireNonNull(r4)
            r4 = 0
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x001c
            r4 = r0
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            b.j.a.c.j<java.lang.Object> r5 = r3.f1693m
            if (r5 != 0) goto L_0x003e
            b.j.a.c.j<java.lang.Object> r5 = r3.f1694n
            if (r5 != 0) goto L_0x003e
            b.j.a.c.j<java.lang.Object> r5 = r3.f1691k
            if (r5 != 0) goto L_0x003e
            b.j.a.c.j<java.lang.Object> r5 = r3.f1692l
            if (r5 != 0) goto L_0x003e
            java.lang.Class<b.j.a.c.b0.a0.k0> r5 = b.j.a.c.b0.a0.k0.class
            java.lang.Class<b.j.a.c.b0.a0.k0> r1 = b.j.a.c.b0.a0.k0.class
            if (r5 != r1) goto L_0x003e
            if (r4 == 0) goto L_0x003b
            b.j.a.c.b0.a0.k0$a r4 = new b.j.a.c.b0.a0.k0$a
            r4.<init>(r0)
            goto L_0x003d
        L_0x003b:
            b.j.a.c.b0.a0.k0$a r4 = b.j.a.c.b0.a0.k0.a.f1698l
        L_0x003d:
            return r4
        L_0x003e:
            boolean r5 = r3.f1697q
            if (r4 == r5) goto L_0x0048
            b.j.a.c.b0.a0.k0 r5 = new b.j.a.c.b0.a0.k0
            r5.<init>((b.j.a.c.b0.a0.k0) r3, (boolean) r4)
            return r5
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.k0.a(b.j.a.c.g, b.j.a.c.d):b.j.a.c.j");
    }

    public void b(g gVar) {
        j<Object> jVar;
        j<Object> jVar2;
        b.j.a.c.i n2 = gVar.n(Object.class);
        b.j.a.c.i n3 = gVar.n(String.class);
        n h2 = gVar.h();
        b.j.a.c.i iVar = this.f1695o;
        if (iVar == null) {
            jVar = c0(gVar.f1991h.f(gVar, gVar.f1992i, h2.g(List.class, n2)));
        } else {
            jVar = d0(gVar, iVar);
        }
        this.f1692l = jVar;
        b.j.a.c.i iVar2 = this.f1696p;
        if (iVar2 == null) {
            jVar2 = c0(gVar.f1991h.f(gVar, gVar.f1992i, h2.j(Map.class, n3, n2)));
        } else {
            jVar2 = d0(gVar, iVar2);
        }
        this.f1691k = jVar2;
        this.f1693m = c0(d0(gVar, n3));
        this.f1694n = c0(d0(gVar, h2.b((b.j.a.c.i0.c) null, Number.class, n.f2185l)));
        b.j.a.c.i o2 = n.o();
        this.f1691k = gVar.F(this.f1691k, (d) null, o2);
        this.f1692l = gVar.F(this.f1692l, (d) null, o2);
        this.f1693m = gVar.F(this.f1693m, (d) null, o2);
        this.f1694n = gVar.F(this.f1694n, (d) null, o2);
    }

    public j<Object> c0(j<Object> jVar) {
        if (b.j.a.c.j0.g.u(jVar)) {
            return null;
        }
        return jVar;
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        switch (iVar.k0()) {
            case 1:
            case 2:
            case 5:
                j<Object> jVar = this.f1691k;
                return jVar != null ? jVar.d(iVar, gVar) : g0(iVar, gVar);
            case 3:
                if (gVar.O(h.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return f0(iVar, gVar);
                }
                j<Object> jVar2 = this.f1692l;
                return jVar2 != null ? jVar2.d(iVar, gVar) : e0(iVar, gVar);
            case 6:
                j<Object> jVar3 = this.f1693m;
                return jVar3 != null ? jVar3.d(iVar, gVar) : iVar.x0();
            case 7:
                j<Object> jVar4 = this.f1694n;
                return jVar4 != null ? jVar4.d(iVar, gVar) : gVar.M(z.f1759i) ? r(iVar, gVar) : iVar.t0();
            case 8:
                j<Object> jVar5 = this.f1694n;
                return jVar5 != null ? jVar5.d(iVar, gVar) : gVar.O(h.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.m0() : iVar.t0();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return iVar.o0();
            default:
                gVar.G(Object.class, iVar);
                throw null;
        }
    }

    public j<Object> d0(g gVar, b.j.a.c.i iVar) {
        return gVar.f1991h.f(gVar, gVar.f1992i, iVar);
    }

    public Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        if (this.f1697q) {
            return d(iVar, gVar);
        }
        switch (iVar.k0()) {
            case 1:
            case 2:
            case 5:
                j<Object> jVar = this.f1691k;
                if (jVar != null) {
                    return jVar.e(iVar, gVar, obj);
                }
                if (!(obj instanceof Map)) {
                    return g0(iVar, gVar);
                }
                Map map = (Map) obj;
                l g0 = iVar.g0();
                if (g0 == l.START_OBJECT) {
                    g0 = iVar.T0();
                }
                if (g0 == l.END_OBJECT) {
                    return map;
                }
                String e0 = iVar.e0();
                do {
                    iVar.T0();
                    Object obj2 = map.get(e0);
                    Object e2 = obj2 != null ? e(iVar, gVar, obj2) : d(iVar, gVar);
                    if (e2 != obj2) {
                        map.put(e0, e2);
                    }
                    e0 = iVar.R0();
                } while (e0 != null);
                return map;
            case 3:
                j<Object> jVar2 = this.f1692l;
                if (jVar2 != null) {
                    return jVar2.e(iVar, gVar, obj);
                }
                if (!(obj instanceof Collection)) {
                    return gVar.O(h.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? f0(iVar, gVar) : e0(iVar, gVar);
                }
                Collection collection = (Collection) obj;
                while (iVar.T0() != l.END_ARRAY) {
                    collection.add(d(iVar, gVar));
                }
                return collection;
            case 6:
                j<Object> jVar3 = this.f1693m;
                return jVar3 != null ? jVar3.e(iVar, gVar, obj) : iVar.x0();
            case 7:
                j<Object> jVar4 = this.f1694n;
                if (jVar4 != null) {
                    return jVar4.e(iVar, gVar, obj);
                }
                return gVar.M(z.f1759i) ? r(iVar, gVar) : iVar.t0();
            case 8:
                j<Object> jVar5 = this.f1694n;
                if (jVar5 != null) {
                    return jVar5.e(iVar, gVar, obj);
                }
                return gVar.O(h.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.m0() : iVar.t0();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return iVar.o0();
            default:
                return d(iVar, gVar);
        }
    }

    public Object e0(b.j.a.b.i iVar, g gVar) {
        l T0 = iVar.T0();
        l lVar = l.END_ARRAY;
        int i2 = 2;
        if (T0 == lVar) {
            return new ArrayList(2);
        }
        Object d = d(iVar, gVar);
        if (iVar.T0() == lVar) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(d);
            return arrayList;
        }
        Object d2 = d(iVar, gVar);
        if (iVar.T0() == lVar) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(d);
            arrayList2.add(d2);
            return arrayList2;
        }
        t R = gVar.R();
        Object[] g2 = R.g();
        g2[0] = d;
        g2[1] = d2;
        int i3 = 2;
        while (true) {
            Object d3 = d(iVar, gVar);
            i2++;
            if (i3 >= g2.length) {
                g2 = R.c(g2);
                i3 = 0;
            }
            int i4 = i3 + 1;
            g2[i3] = d3;
            if (iVar.T0() == l.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i2);
                R.d(g2, i4, arrayList3);
                return arrayList3;
            }
            i3 = i4;
        }
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        int k0 = iVar.k0();
        if (!(k0 == 1 || k0 == 3)) {
            switch (k0) {
                case 5:
                    break;
                case 6:
                    j<Object> jVar = this.f1693m;
                    return jVar != null ? jVar.d(iVar, gVar) : iVar.x0();
                case 7:
                    j<Object> jVar2 = this.f1694n;
                    return jVar2 != null ? jVar2.d(iVar, gVar) : gVar.M(z.f1759i) ? r(iVar, gVar) : iVar.t0();
                case 8:
                    j<Object> jVar3 = this.f1694n;
                    return jVar3 != null ? jVar3.d(iVar, gVar) : gVar.O(h.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.m0() : iVar.t0();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return iVar.o0();
                default:
                    gVar.G(Object.class, iVar);
                    throw null;
            }
        }
        return cVar.b(iVar, gVar);
    }

    public Object[] f0(b.j.a.b.i iVar, g gVar) {
        if (iVar.T0() == l.END_ARRAY) {
            return r;
        }
        t R = gVar.R();
        Object[] g2 = R.g();
        int i2 = 0;
        while (true) {
            Object d = d(iVar, gVar);
            if (i2 >= g2.length) {
                g2 = R.c(g2);
                i2 = 0;
            }
            int i3 = i2 + 1;
            g2[i2] = d;
            if (iVar.T0() == l.END_ARRAY) {
                int i4 = R.c + i3;
                Object[] objArr = new Object[i4];
                R.a(objArr, i4, g2, i3);
                R.b();
                return objArr;
            }
            i2 = i3;
        }
    }

    public Object g0(b.j.a.b.i iVar, g gVar) {
        l g0 = iVar.g0();
        String str = null;
        if (g0 == l.START_OBJECT) {
            str = iVar.R0();
        } else if (g0 == l.FIELD_NAME) {
            str = iVar.e0();
        } else if (g0 != l.END_OBJECT) {
            gVar.G(this.f1761h, iVar);
            throw null;
        }
        if (str == null) {
            return new LinkedHashMap(2);
        }
        iVar.T0();
        Object d = d(iVar, gVar);
        String R0 = iVar.R0();
        if (R0 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str, d);
            return linkedHashMap;
        }
        iVar.T0();
        Object d2 = d(iVar, gVar);
        String R02 = iVar.R0();
        if (R02 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str, d);
            linkedHashMap2.put(R0, d2);
            return linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str, d);
        linkedHashMap3.put(R0, d2);
        do {
            iVar.T0();
            linkedHashMap3.put(R02, d(iVar, gVar));
            R02 = iVar.R0();
        } while (R02 != null);
        return linkedHashMap3;
    }

    public boolean m() {
        return true;
    }

    public Boolean n(f fVar) {
        return null;
    }
}
