package b.j.a.c.h0.t;

import b.j.a.a.r;
import b.j.a.b.v.b;
import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.h;
import b.j.a.c.h0.i;
import b.j.a.c.h0.s.l;
import b.j.a.c.i0.n;
import b.j.a.c.j0.g;
import b.j.a.c.k;
import b.j.a.c.x;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

@a
public class t extends h<Map<?, ?>> implements i {
    public static final b.j.a.c.i w = n.o();
    public static final Object x = r.a.NON_EMPTY;

    /* renamed from: j  reason: collision with root package name */
    public final d f2138j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2139k;

    /* renamed from: l  reason: collision with root package name */
    public final b.j.a.c.i f2140l;

    /* renamed from: m  reason: collision with root package name */
    public final b.j.a.c.i f2141m;

    /* renamed from: n  reason: collision with root package name */
    public b.j.a.c.n<Object> f2142n;

    /* renamed from: o  reason: collision with root package name */
    public b.j.a.c.n<Object> f2143o;

    /* renamed from: p  reason: collision with root package name */
    public final f f2144p;

    /* renamed from: q  reason: collision with root package name */
    public l f2145q;
    public final Set<String> r;
    public final Object s;
    public final Object t;
    public final boolean u;
    public final boolean v;

    public t(t tVar, d dVar, b.j.a.c.n<?> nVar, b.j.a.c.n<?> nVar2, Set<String> set) {
        super(Map.class, false);
        this.r = (set == null || set.isEmpty()) ? null : set;
        this.f2140l = tVar.f2140l;
        this.f2141m = tVar.f2141m;
        this.f2139k = tVar.f2139k;
        this.f2144p = tVar.f2144p;
        this.f2142n = nVar;
        this.f2143o = nVar2;
        this.f2145q = l.b.f2067b;
        this.f2138j = dVar;
        this.s = tVar.s;
        this.v = tVar.v;
        this.t = tVar.t;
        this.u = tVar.u;
    }

    public t(t tVar, f fVar, Object obj, boolean z) {
        super(Map.class, false);
        this.r = tVar.r;
        this.f2140l = tVar.f2140l;
        this.f2141m = tVar.f2141m;
        this.f2139k = tVar.f2139k;
        this.f2144p = fVar;
        this.f2142n = tVar.f2142n;
        this.f2143o = tVar.f2143o;
        this.f2145q = tVar.f2145q;
        this.f2138j = tVar.f2138j;
        this.s = tVar.s;
        this.v = tVar.v;
        this.t = obj;
        this.u = z;
    }

    public t(t tVar, Object obj, boolean z) {
        super(Map.class, false);
        this.r = tVar.r;
        this.f2140l = tVar.f2140l;
        this.f2141m = tVar.f2141m;
        this.f2139k = tVar.f2139k;
        this.f2144p = tVar.f2144p;
        this.f2142n = tVar.f2142n;
        this.f2143o = tVar.f2143o;
        this.f2145q = l.b.f2067b;
        this.f2138j = tVar.f2138j;
        this.s = obj;
        this.v = z;
        this.t = tVar.t;
        this.u = tVar.u;
    }

    public t(Set<String> set, b.j.a.c.i iVar, b.j.a.c.i iVar2, boolean z, f fVar, b.j.a.c.n<?> nVar, b.j.a.c.n<?> nVar2) {
        super(Map.class, false);
        this.r = (set == null || set.isEmpty()) ? null : set;
        this.f2140l = iVar;
        this.f2141m = iVar2;
        this.f2139k = z;
        this.f2144p = fVar;
        this.f2142n = nVar;
        this.f2143o = nVar2;
        this.f2145q = l.b.f2067b;
        this.f2138j = null;
        this.s = null;
        this.v = false;
        this.t = null;
        this.u = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.j.a.c.h0.t.t u(java.util.Set<java.lang.String> r9, b.j.a.c.i r10, boolean r11, b.j.a.c.f0.f r12, b.j.a.c.n<java.lang.Object> r13, b.j.a.c.n<java.lang.Object> r14, java.lang.Object r15) {
        /*
            if (r10 != 0) goto L_0x0007
            b.j.a.c.i r10 = w
            r3 = r10
            r4 = r3
            goto L_0x0011
        L_0x0007:
            b.j.a.c.i r0 = r10.n()
            b.j.a.c.i r10 = r10.k()
            r4 = r10
            r3 = r0
        L_0x0011:
            r10 = 0
            if (r11 != 0) goto L_0x001f
            if (r4 == 0) goto L_0x001d
            boolean r11 = r4.D()
            if (r11 == 0) goto L_0x001d
            r10 = 1
        L_0x001d:
            r11 = r10
            goto L_0x0027
        L_0x001f:
            java.lang.Class<?> r0 = r4.f2152h
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L_0x0027
            r5 = r10
            goto L_0x0028
        L_0x0027:
            r5 = r11
        L_0x0028:
            b.j.a.c.h0.t.t r10 = new b.j.a.c.h0.t.t
            r1 = r10
            r2 = r9
            r6 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            if (r15 == 0) goto L_0x0043
            java.lang.Class<b.j.a.c.h0.t.t> r9 = b.j.a.c.h0.t.t.class
            java.lang.String r11 = "withFilterId"
            b.j.a.c.j0.g.G(r9, r10, r11)
            b.j.a.c.h0.t.t r9 = new b.j.a.c.h0.t.t
            boolean r11 = r10.v
            r9.<init>(r10, r15, r11)
            r10 = r9
        L_0x0043:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.t.u(java.util.Set, b.j.a.c.i, boolean, b.j.a.c.f0.f, b.j.a.c.n, b.j.a.c.n, java.lang.Object):b.j.a.c.h0.t.t");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x014b, code lost:
        if (r13.f2141m.b() != false) goto L_0x014d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r14, b.j.a.c.d r15) {
        /*
            r13 = this;
            b.j.a.c.b r0 = r14.B()
            r1 = 0
            if (r15 != 0) goto L_0x0009
            r2 = r1
            goto L_0x000d
        L_0x0009:
            b.j.a.c.e0.h r2 = r15.e()
        L_0x000d:
            boolean r3 = b.j.a.c.h0.t.s0.j(r2, r0)
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r0.t(r2)
            if (r3 == 0) goto L_0x001e
            b.j.a.c.n r3 = r14.N(r2, r3)
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            java.lang.Object r4 = r0.d(r2)
            if (r4 == 0) goto L_0x002a
            b.j.a.c.n r4 = r14.N(r2, r4)
            goto L_0x002e
        L_0x002a:
            r4 = r1
            goto L_0x002e
        L_0x002c:
            r3 = r1
            r4 = r3
        L_0x002e:
            if (r4 != 0) goto L_0x0032
            b.j.a.c.n<java.lang.Object> r4 = r13.f2143o
        L_0x0032:
            b.j.a.c.n r4 = r13.k(r14, r15, r4)
            if (r4 != 0) goto L_0x004a
            boolean r5 = r13.f2139k
            if (r5 == 0) goto L_0x004a
            b.j.a.c.i r5 = r13.f2141m
            boolean r5 = r5.F()
            if (r5 != 0) goto L_0x004a
            b.j.a.c.i r4 = r13.f2141m
            b.j.a.c.n r4 = r14.z(r4, r15)
        L_0x004a:
            r9 = r4
            if (r3 != 0) goto L_0x004f
            b.j.a.c.n<java.lang.Object> r3 = r13.f2142n
        L_0x004f:
            if (r3 != 0) goto L_0x0058
            b.j.a.c.i r3 = r13.f2140l
            b.j.a.c.n r3 = r14.u(r3, r15)
            goto L_0x005c
        L_0x0058:
            b.j.a.c.n r3 = r14.G(r3, r15)
        L_0x005c:
            r8 = r3
            java.util.Set<java.lang.String> r3 = r13.r
            boolean r4 = b.j.a.c.h0.t.s0.j(r2, r0)
            r11 = 0
            r12 = 1
            if (r4 == 0) goto L_0x00ac
            b.j.a.a.p$a r4 = r0.J(r2)
            if (r4 == 0) goto L_0x00a0
            java.util.Set r4 = r4.d()
            if (r4 == 0) goto L_0x007b
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x007b
            r5 = r12
            goto L_0x007c
        L_0x007b:
            r5 = r11
        L_0x007c:
            if (r5 == 0) goto L_0x00a0
            if (r3 != 0) goto L_0x0086
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            goto L_0x008c
        L_0x0086:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r3)
            r3 = r5
        L_0x008c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0090:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r3.add(r5)
            goto L_0x0090
        L_0x00a0:
            java.lang.Boolean r2 = r0.S(r2)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r2 = r4.equals(r2)
            r10 = r3
            goto L_0x00ae
        L_0x00ac:
            r10 = r3
            r2 = r11
        L_0x00ae:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            b.j.a.a.k$d r3 = r13.l(r14, r15, r3)
            if (r3 == 0) goto L_0x00c2
            b.j.a.a.k$a r4 = b.j.a.a.k.a.WRITE_SORTED_MAP_ENTRIES
            java.lang.Boolean r3 = r3.b(r4)
            if (r3 == 0) goto L_0x00c2
            boolean r2 = r3.booleanValue()
        L_0x00c2:
            java.lang.Class<b.j.a.c.h0.t.t> r3 = b.j.a.c.h0.t.t.class
            java.lang.String r4 = "withResolved"
            b.j.a.c.j0.g.G(r3, r13, r4)
            b.j.a.c.h0.t.t r3 = new b.j.a.c.h0.t.t
            r5 = r3
            r6 = r13
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r4 = r3.v
            if (r2 == r4) goto L_0x00dd
            b.j.a.c.h0.t.t r4 = new b.j.a.c.h0.t.t
            java.lang.Object r5 = r13.s
            r4.<init>(r3, r5, r2)
            r3 = r4
        L_0x00dd:
            if (r15 == 0) goto L_0x0155
            b.j.a.c.e0.h r2 = r15.e()
            if (r2 == 0) goto L_0x00ff
            java.lang.Object r0 = r0.l(r2)
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r2 = r3.s
            if (r2 != r0) goto L_0x00f0
            goto L_0x00ff
        L_0x00f0:
            java.lang.Class<b.j.a.c.h0.t.t> r2 = b.j.a.c.h0.t.t.class
            java.lang.String r4 = "withFilterId"
            b.j.a.c.j0.g.G(r2, r3, r4)
            b.j.a.c.h0.t.t r2 = new b.j.a.c.h0.t.t
            boolean r4 = r3.v
            r2.<init>(r3, r0, r4)
            r3 = r2
        L_0x00ff:
            b.j.a.c.w r0 = r14.f2320h
            b.j.a.a.r$b r15 = r15.m(r0, r1)
            if (r15 == 0) goto L_0x0155
            b.j.a.a.r$a r0 = r15.f1354i
            b.j.a.a.r$a r2 = b.j.a.a.r.a.USE_DEFAULTS
            if (r0 == r2) goto L_0x0155
            int r0 = r0.ordinal()
            if (r0 == r12) goto L_0x0150
            r2 = 2
            if (r0 == r2) goto L_0x0145
            r2 = 3
            if (r0 == r2) goto L_0x014d
            r2 = 4
            if (r0 == r2) goto L_0x012e
            r2 = 5
            if (r0 == r2) goto L_0x0120
            goto L_0x0151
        L_0x0120:
            java.lang.Class<?> r15 = r15.f1356k
            java.lang.Object r1 = r14.H(r1, r15)
            if (r1 != 0) goto L_0x0129
            goto L_0x0150
        L_0x0129:
            boolean r11 = r14.I(r1)
            goto L_0x0151
        L_0x012e:
            b.j.a.c.i r14 = r13.f2141m
            java.lang.Object r14 = b.a.a.n.f.i(r14)
            if (r14 == 0) goto L_0x014f
            java.lang.Class r15 = r14.getClass()
            boolean r15 = r15.isArray()
            if (r15 == 0) goto L_0x014f
            java.lang.Object r14 = b.j.a.c.j0.c.a(r14)
            goto L_0x014f
        L_0x0145:
            b.j.a.c.i r14 = r13.f2141m
            boolean r14 = r14.b()
            if (r14 == 0) goto L_0x0150
        L_0x014d:
            java.lang.Object r14 = x
        L_0x014f:
            r1 = r14
        L_0x0150:
            r11 = r12
        L_0x0151:
            b.j.a.c.h0.t.t r3 = r3.z(r1, r11)
        L_0x0155:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.t.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public boolean d(y yVar, Object obj) {
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return true;
        }
        Object obj2 = this.t;
        if (obj2 != null || this.u) {
            b.j.a.c.n<Object> nVar = this.f2143o;
            boolean z = x == obj2;
            if (nVar != null) {
                for (Object next : map.values()) {
                    if (next == null) {
                        if (this.u) {
                        }
                    } else if (z) {
                        if (!nVar.d(yVar, next)) {
                        }
                    } else if (obj2 != null && obj2.equals(map)) {
                    }
                }
                return true;
            }
            for (Object next2 : map.values()) {
                if (next2 != null) {
                    try {
                        b.j.a.c.n<Object> r2 = r(yVar, next2);
                        if (z) {
                            if (!r2.d(yVar, next2)) {
                            }
                        } else if (obj2 != null && obj2.equals(map)) {
                        }
                    } catch (k unused) {
                    }
                } else if (this.u) {
                }
            }
            return true;
        }
        return false;
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        Map<?, ?> map = (Map) obj;
        fVar.O0(map);
        if (!map.isEmpty()) {
            if (this.v || yVar.K(x.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = t(map, fVar, yVar);
            }
            Object obj2 = this.s;
            if (obj2 == null) {
                Object obj3 = this.t;
                if (obj3 != null || this.u) {
                    x(map, fVar, yVar, obj3);
                } else {
                    b.j.a.c.n<Object> nVar = this.f2143o;
                    if (nVar != null) {
                        w(map, fVar, yVar, nVar);
                    } else {
                        v(map, fVar, yVar);
                    }
                }
            } else {
                m(yVar, obj2, map);
                throw null;
            }
        }
        fVar.r0();
    }

    public void g(Object obj, b.j.a.b.f fVar, y yVar, f fVar2) {
        Map<?, ?> map = (Map) obj;
        fVar.Y(map);
        b e2 = fVar2.e(fVar, fVar2.d(map, b.j.a.b.l.START_OBJECT));
        if (!map.isEmpty()) {
            if (this.v || yVar.K(x.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = t(map, fVar, yVar);
            }
            Object obj2 = this.s;
            if (obj2 == null) {
                Object obj3 = this.t;
                if (obj3 != null || this.u) {
                    x(map, fVar, yVar, obj3);
                } else {
                    b.j.a.c.n<Object> nVar = this.f2143o;
                    if (nVar != null) {
                        w(map, fVar, yVar, nVar);
                    } else {
                        v(map, fVar, yVar);
                    }
                }
            } else {
                m(yVar, obj2, map);
                throw null;
            }
        }
        fVar2.f(fVar, e2);
    }

    public h q(f fVar) {
        if (this.f2144p == fVar) {
            return this;
        }
        g.G(t.class, this, "_withValueTypeSerializer");
        return new t(this, fVar, this.t, this.u);
    }

    public final b.j.a.c.n<Object> r(y yVar, Object obj) {
        Class<?> cls = obj.getClass();
        b.j.a.c.n<Object> c = this.f2145q.c(cls);
        if (c != null) {
            return c;
        }
        if (this.f2141m.t()) {
            l lVar = this.f2145q;
            l.d a = lVar.a(yVar.d(this.f2141m, cls), yVar, this.f2138j);
            l lVar2 = a.f2069b;
            if (lVar != lVar2) {
                this.f2145q = lVar2;
            }
            return a.a;
        }
        l lVar3 = this.f2145q;
        d dVar = this.f2138j;
        Objects.requireNonNull(lVar3);
        b.j.a.c.n<Object> A = yVar.A(cls, dVar);
        l b2 = lVar3.b(cls, A);
        if (lVar3 != b2) {
            this.f2145q = b2;
        }
        return A;
    }

    public Map<?, ?> t(Map<?, ?> map, b.j.a.b.f fVar, y yVar) {
        b.j.a.c.n<Object> nVar;
        if (map instanceof SortedMap) {
            return map;
        }
        if (!((map instanceof HashMap) && map.containsKey((Object) null))) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (key == null) {
                b.j.a.c.n<Object> nVar2 = yVar.f2328p;
                if (value != null) {
                    nVar = this.f2143o;
                    if (nVar == null) {
                        nVar = r(yVar, value);
                    }
                    Object obj = this.t;
                    if (obj == x) {
                        if (nVar.d(yVar, value)) {
                        }
                    } else if (obj != null && obj.equals(value)) {
                    }
                } else if (!this.u) {
                    nVar = yVar.f2327o;
                }
                try {
                    nVar2.f(null, fVar, yVar);
                    nVar.f(value, fVar, yVar);
                } catch (Exception e2) {
                    o(yVar, e2, value, "");
                    throw null;
                }
            } else {
                treeMap.put(key, value);
            }
        }
        return treeMap;
    }

    public void v(Map<?, ?> map, b.j.a.b.f fVar, y yVar) {
        Object obj;
        if (this.f2144p != null) {
            y(map, fVar, yVar, (Object) null);
            return;
        }
        b.j.a.c.n<Object> nVar = this.f2142n;
        Set<String> set = this.r;
        try {
            obj = null;
            for (Map.Entry next : map.entrySet()) {
                try {
                    Object value = next.getValue();
                    obj = next.getKey();
                    if (obj == null) {
                        yVar.f2328p.f(null, fVar, yVar);
                    } else if (set == null || !set.contains(obj)) {
                        nVar.f(obj, fVar, yVar);
                    }
                    if (value == null) {
                        yVar.t(fVar);
                    } else {
                        b.j.a.c.n<Object> nVar2 = this.f2143o;
                        if (nVar2 == null) {
                            nVar2 = r(yVar, value);
                        }
                        nVar2.f(value, fVar, yVar);
                    }
                } catch (Exception e2) {
                    e = e2;
                    o(yVar, e, map, String.valueOf(obj));
                    throw null;
                }
            }
        } catch (Exception e3) {
            e = e3;
            obj = null;
            o(yVar, e, map, String.valueOf(obj));
            throw null;
        }
    }

    public void w(Map<?, ?> map, b.j.a.b.f fVar, y yVar, b.j.a.c.n<Object> nVar) {
        b.j.a.c.n<Object> nVar2 = this.f2142n;
        Set<String> set = this.r;
        f fVar2 = this.f2144p;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    yVar.f2328p.f(null, fVar, yVar);
                } else {
                    nVar2.f(key, fVar, yVar);
                }
                Object value = next.getValue();
                if (value == null) {
                    yVar.t(fVar);
                } else if (fVar2 == null) {
                    try {
                        nVar.f(value, fVar, yVar);
                    } catch (Exception e2) {
                        o(yVar, e2, map, String.valueOf(key));
                        throw null;
                    }
                } else {
                    nVar.g(value, fVar, yVar, fVar2);
                }
            }
        }
    }

    public void x(Map<?, ?> map, b.j.a.b.f fVar, y yVar, Object obj) {
        b.j.a.c.n<Object> nVar;
        b.j.a.c.n<Object> nVar2;
        if (this.f2144p != null) {
            y(map, fVar, yVar, obj);
            return;
        }
        Set<String> set = this.r;
        boolean z = x == obj;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (key == null) {
                nVar = yVar.f2328p;
            } else if (set == null || !set.contains(key)) {
                nVar = this.f2142n;
            }
            Object value = next.getValue();
            if (value != null) {
                nVar2 = this.f2143o;
                if (nVar2 == null) {
                    nVar2 = r(yVar, value);
                }
                if (z) {
                    if (nVar2.d(yVar, value)) {
                    }
                } else if (obj != null && obj.equals(value)) {
                }
            } else if (!this.u) {
                nVar2 = yVar.f2327o;
            }
            try {
                nVar.f(key, fVar, yVar);
                nVar2.f(value, fVar, yVar);
            } catch (Exception e2) {
                o(yVar, e2, map, String.valueOf(key));
                throw null;
            }
        }
    }

    public void y(Map<?, ?> map, b.j.a.b.f fVar, y yVar, Object obj) {
        b.j.a.c.n<Object> nVar;
        b.j.a.c.n<Object> nVar2;
        Set<String> set = this.r;
        boolean z = x == obj;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (key == null) {
                nVar = yVar.f2328p;
            } else if (set == null || !set.contains(key)) {
                nVar = this.f2142n;
            }
            Object value = next.getValue();
            if (value != null) {
                nVar2 = this.f2143o;
                if (nVar2 == null) {
                    nVar2 = r(yVar, value);
                }
                if (z) {
                    if (nVar2.d(yVar, value)) {
                    }
                } else if (obj != null && obj.equals(value)) {
                }
            } else if (!this.u) {
                nVar2 = yVar.f2327o;
            }
            nVar.f(key, fVar, yVar);
            try {
                nVar2.g(value, fVar, yVar, this.f2144p);
            } catch (Exception e2) {
                o(yVar, e2, map, String.valueOf(key));
                throw null;
            }
        }
    }

    public t z(Object obj, boolean z) {
        if (obj == this.t && z == this.u) {
            return this;
        }
        g.G(t.class, this, "withContentInclusion");
        return new t(this, this.f2144p, obj, z);
    }
}
