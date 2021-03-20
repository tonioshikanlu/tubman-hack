package b.j.a.c.b0.a0;

import b.j.a.a.p;
import b.j.a.c.b0.i;
import b.j.a.c.b0.r;
import b.j.a.c.b0.s;
import b.j.a.c.b0.v;
import b.j.a.c.b0.x;
import b.j.a.c.b0.z.u;
import b.j.a.c.b0.z.y;
import b.j.a.c.d;
import b.j.a.c.e0.h;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@b.j.a.c.z.a
public class q extends g<Map<Object, Object>> implements i, s {

    /* renamed from: o  reason: collision with root package name */
    public final o f1712o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1713p;

    /* renamed from: q  reason: collision with root package name */
    public final j<Object> f1714q;
    public final c r;
    public final x s;
    public j<Object> t;
    public u u;
    public final boolean v;
    public Set<String> w;

    public static class a extends y.a {
        public final b c;
        public final Map<Object, Object> d = new LinkedHashMap();

        /* renamed from: e  reason: collision with root package name */
        public final Object f1715e;

        public a(b bVar, v vVar, Class<?> cls, Object obj) {
            super(vVar, cls);
            this.c = bVar;
            this.f1715e = obj;
        }

        public void a(Object obj, Object obj2) {
            b bVar = this.c;
            Iterator<a> it = bVar.c.iterator();
            Map<Object, Object> map = bVar.f1716b;
            while (it.hasNext()) {
                a next = it.next();
                if (obj.equals(next.a.f1803k.f1855b.f1304j)) {
                    it.remove();
                    map.put(next.f1715e, obj2);
                    map.putAll(next.d);
                    return;
                }
                map = next.d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public static final class b {
        public final Class<?> a;

        /* renamed from: b  reason: collision with root package name */
        public Map<Object, Object> f1716b;
        public List<a> c = new ArrayList();

        public b(Class<?> cls, Map<Object, Object> map) {
            this.a = cls;
            this.f1716b = map;
        }

        public void a(Object obj, Object obj2) {
            Map<Object, Object> map;
            if (this.c.isEmpty()) {
                map = this.f1716b;
            } else {
                List<a> list = this.c;
                map = list.get(list.size() - 1).d;
            }
            map.put(obj, obj2);
        }
    }

    public q(q qVar, o oVar, j<Object> jVar, c cVar, r rVar, Set<String> set) {
        super((g<?>) qVar, rVar, qVar.f1670m);
        this.f1712o = oVar;
        this.f1714q = jVar;
        this.r = cVar;
        this.s = qVar.s;
        this.u = qVar.u;
        this.t = qVar.t;
        this.v = qVar.v;
        this.w = set;
        this.f1713p = f0(this.f1668k, oVar);
    }

    public q(b.j.a.c.i iVar, x xVar, o oVar, j<Object> jVar, c cVar) {
        super(iVar, (r) null, (Boolean) null);
        this.f1712o = oVar;
        this.f1714q = jVar;
        this.r = cVar;
        this.s = xVar;
        this.v = xVar.i();
        this.t = null;
        this.u = null;
        this.f1713p = f0(iVar, oVar);
    }

    public b.j.a.c.i Z() {
        return this.f1668k;
    }

    public j<?> a(g gVar, d dVar) {
        h e2;
        p.a J;
        o oVar = this.f1712o;
        if (oVar == null) {
            oVar = gVar.t(this.f1668k.n(), dVar);
        } else if (oVar instanceof b.j.a.c.b0.j) {
            oVar = ((b.j.a.c.b0.j) oVar).a(gVar, dVar);
        }
        o oVar2 = oVar;
        j jVar = this.f1714q;
        if (dVar != null) {
            jVar = X(gVar, dVar, jVar);
        }
        b.j.a.c.i k2 = this.f1668k.k();
        j q2 = jVar == null ? gVar.q(k2, dVar) : gVar.F(jVar, dVar, k2);
        c cVar = this.r;
        if (cVar != null) {
            cVar = cVar.f(dVar);
        }
        c cVar2 = cVar;
        Set<String> set = this.w;
        b.j.a.c.b x = gVar.x();
        if (!(!z.G(x, dVar) || (e2 = dVar.e()) == null || (J = x.J(e2)) == null)) {
            Set<String> c = J.c();
            if (!c.isEmpty()) {
                set = set == null ? new HashSet<>() : new HashSet<>(set);
                for (String add : c) {
                    set.add(add);
                }
            }
        }
        Set<String> set2 = set;
        r W = W(gVar, dVar, q2);
        return (this.f1712o == oVar2 && this.f1714q == q2 && this.r == cVar2 && this.f1669l == W && this.w == set2) ? this : new q(this, oVar2, q2, cVar2, W, set2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(b.j.a.c.g r7) {
        /*
            r6 = this;
            b.j.a.c.b0.x r0 = r6.s
            boolean r0 = r0.j()
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L_0x0039
            b.j.a.c.b0.x r0 = r6.s
            b.j.a.c.f r5 = r7.f1993j
            b.j.a.c.i r0 = r0.A(r5)
            if (r0 == 0) goto L_0x001d
        L_0x0016:
            b.j.a.c.j r0 = r7.q(r0, r4)
            r6.t = r0
            goto L_0x0068
        L_0x001d:
            b.j.a.c.i r0 = r6.f1668k
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            b.j.a.c.b0.x r2 = r6.s
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r3[r1] = r2
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r7.l(r0, r1)
            throw r4
        L_0x0039:
            b.j.a.c.b0.x r0 = r6.s
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0068
            b.j.a.c.b0.x r0 = r6.s
            b.j.a.c.f r5 = r7.f1993j
            b.j.a.c.i r0 = r0.x(r5)
            if (r0 == 0) goto L_0x004c
            goto L_0x0016
        L_0x004c:
            b.j.a.c.i r0 = r6.f1668k
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            b.j.a.c.b0.x r2 = r6.s
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r3[r1] = r2
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r7.l(r0, r1)
            throw r4
        L_0x0068:
            b.j.a.c.b0.x r0 = r6.s
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0086
            b.j.a.c.b0.x r0 = r6.s
            b.j.a.c.f r1 = r7.f1993j
            b.j.a.c.b0.u[] r0 = r0.B(r1)
            b.j.a.c.b0.x r1 = r6.s
            b.j.a.c.p r2 = b.j.a.c.p.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            boolean r2 = r7.P(r2)
            b.j.a.c.b0.z.u r7 = b.j.a.c.b0.z.u.b(r7, r1, r0, r2)
            r6.u = r7
        L_0x0086:
            b.j.a.c.i r7 = r6.f1668k
            b.j.a.c.o r0 = r6.f1712o
            boolean r7 = r6.f0(r7, r0)
            r6.f1713p = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.q.b(b.j.a.c.g):void");
    }

    public j<Object> c0() {
        return this.f1714q;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:83|(6:88|89|(1:(1:96)(1:97))(3:91|(3:93|106|(0))|94)|(1:99)(1:100)|106|(0))(3:87|106|(0))|85|88|89|(0)(0)|(0)(0)|106|(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0179, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x017a, code lost:
        r8.e0(r12, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x017d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x017e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017f, code lost:
        r8.h0(r13, r7, r3, r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0175 A[Catch:{ v -> 0x017e, Exception -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a1 A[SYNTHETIC, Splitter:B:43:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0158 A[Catch:{ v -> 0x017e, Exception -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0164 A[Catch:{ v -> 0x017e, Exception -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0171 A[Catch:{ v -> 0x017e, Exception -> 0x0179 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(b.j.a.b.i r12, b.j.a.c.g r13) {
        /*
            r11 = this;
            b.j.a.c.b0.z.u r0 = r11.u
            r1 = 0
            if (r0 == 0) goto L_0x00b3
            b.j.a.c.b0.z.x r2 = new b.j.a.c.b0.z.x
            int r3 = r0.a
            r2.<init>(r12, r13, r3, r1)
            b.j.a.c.j<java.lang.Object> r3 = r11.f1714q
            b.j.a.c.f0.c r4 = r11.r
            boolean r5 = r12.P0()
            if (r5 == 0) goto L_0x0019
            r6 = r11
            goto L_0x0093
        L_0x0019:
            b.j.a.b.l r5 = b.j.a.b.l.FIELD_NAME
            boolean r5 = r12.L0(r5)
            if (r5 == 0) goto L_0x0027
            java.lang.String r5 = r12.e0()
            r6 = r11
            goto L_0x0029
        L_0x0027:
            r6 = r11
            r5 = r1
        L_0x0029:
            if (r5 == 0) goto L_0x00a1
            b.j.a.b.l r7 = r12.T0()
            java.util.Set<java.lang.String> r8 = r6.w
            if (r8 == 0) goto L_0x003d
            boolean r8 = r8.contains(r5)
            if (r8 == 0) goto L_0x003d
            r12.a1()
            goto L_0x0093
        L_0x003d:
            java.util.HashMap<java.lang.String, b.j.a.c.b0.u> r8 = r0.c
            java.lang.Object r8 = r8.get(r5)
            b.j.a.c.b0.u r8 = (b.j.a.c.b0.u) r8
            if (r8 == 0) goto L_0x0069
            java.lang.Object r7 = r8.c(r12, r13)
            boolean r7 = r2.b(r8, r7)
            if (r7 == 0) goto L_0x0093
            r12.T0()
            java.lang.Object r0 = r0.a(r13, r2)     // Catch:{ Exception -> 0x0060 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0060 }
            r6.g0(r12, r13, r0)
        L_0x005d:
            r1 = r0
            goto L_0x0192
        L_0x0060:
            r12 = move-exception
            b.j.a.c.i r13 = r6.f1668k
            java.lang.Class<?> r13 = r13.f2152h
            r6.e0(r12, r13, r5)
            throw r1
        L_0x0069:
            b.j.a.c.o r8 = r6.f1712o
            java.lang.Object r8 = r8.a(r5, r13)
            b.j.a.b.l r9 = b.j.a.b.l.VALUE_NULL     // Catch:{ Exception -> 0x0098 }
            if (r7 != r9) goto L_0x007f
            boolean r7 = r6.f1671n     // Catch:{ Exception -> 0x0098 }
            if (r7 == 0) goto L_0x0078
            goto L_0x0093
        L_0x0078:
            b.j.a.c.b0.r r7 = r6.f1669l     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r5 = r7.c(r13)     // Catch:{ Exception -> 0x0098 }
            goto L_0x008a
        L_0x007f:
            if (r4 != 0) goto L_0x0086
            java.lang.Object r5 = r3.d(r12, r13)     // Catch:{ Exception -> 0x0098 }
            goto L_0x008a
        L_0x0086:
            java.lang.Object r5 = r3.f(r12, r13, r4)     // Catch:{ Exception -> 0x0098 }
        L_0x008a:
            b.j.a.c.b0.z.w$b r7 = new b.j.a.c.b0.z.w$b
            b.j.a.c.b0.z.w r9 = r2.f1853h
            r7.<init>(r9, r5, r8)
            r2.f1853h = r7
        L_0x0093:
            java.lang.String r5 = r12.R0()
            goto L_0x0029
        L_0x0098:
            r12 = move-exception
            b.j.a.c.i r13 = r6.f1668k
            java.lang.Class<?> r13 = r13.f2152h
            r6.e0(r12, r13, r5)
            throw r1
        L_0x00a1:
            java.lang.Object r12 = r0.a(r13, r2)     // Catch:{ Exception -> 0x00aa }
            java.util.Map r12 = (java.util.Map) r12     // Catch:{ Exception -> 0x00aa }
            r1 = r12
            goto L_0x0192
        L_0x00aa:
            r12 = move-exception
            b.j.a.c.i r13 = r6.f1668k
            java.lang.Class<?> r13 = r13.f2152h
            r6.e0(r12, r13, r5)
            throw r1
        L_0x00b3:
            b.j.a.c.j<java.lang.Object> r0 = r11.t
            if (r0 == 0) goto L_0x00c2
            b.j.a.c.b0.x r1 = r11.s
            java.lang.Object r12 = r0.d(r12, r13)
            java.lang.Object r12 = r1.v(r13, r12)
            goto L_0x00e5
        L_0x00c2:
            boolean r0 = r11.v
            r2 = 0
            if (r0 == 0) goto L_0x0193
            b.j.a.b.l r0 = r12.g0()
            b.j.a.b.l r3 = b.j.a.b.l.START_OBJECT
            if (r0 == r3) goto L_0x00ef
            b.j.a.b.l r3 = b.j.a.b.l.FIELD_NAME
            if (r0 == r3) goto L_0x00ef
            b.j.a.b.l r3 = b.j.a.b.l.END_OBJECT
            if (r0 == r3) goto L_0x00ef
            b.j.a.b.l r2 = b.j.a.b.l.VALUE_STRING
            if (r0 != r2) goto L_0x00ea
            b.j.a.c.b0.x r0 = r11.s
            java.lang.String r12 = r12.x0()
            java.lang.Object r12 = r0.r(r13, r12)
        L_0x00e5:
            r1 = r12
            java.util.Map r1 = (java.util.Map) r1
            goto L_0x0192
        L_0x00ea:
            r11.w(r12, r13)
            goto L_0x0192
        L_0x00ef:
            b.j.a.c.b0.x r0 = r11.s
            java.lang.Object r0 = r0.u(r13)
            java.util.Map r0 = (java.util.Map) r0
            boolean r3 = r11.f1713p
            if (r3 == 0) goto L_0x018d
            b.j.a.c.j<java.lang.Object> r3 = r11.f1714q
            b.j.a.c.f0.c r4 = r11.r
            b.j.a.c.b0.z.r r5 = r3.k()
            if (r5 == 0) goto L_0x0107
            r5 = 1
            goto L_0x0108
        L_0x0107:
            r5 = r2
        L_0x0108:
            if (r5 == 0) goto L_0x0118
            b.j.a.c.b0.a0.q$b r6 = new b.j.a.c.b0.a0.q$b
            b.j.a.c.i r7 = r11.f1668k
            b.j.a.c.i r7 = r7.k()
            java.lang.Class<?> r7 = r7.f2152h
            r6.<init>(r7, r0)
            goto L_0x0119
        L_0x0118:
            r6 = r1
        L_0x0119:
            boolean r7 = r12.P0()
            if (r7 == 0) goto L_0x0127
            r8 = r11
            r2 = r0
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            goto L_0x0182
        L_0x0127:
            b.j.a.b.l r7 = r12.g0()
            b.j.a.b.l r8 = b.j.a.b.l.END_OBJECT
            if (r7 != r8) goto L_0x0131
            goto L_0x005d
        L_0x0131:
            b.j.a.b.l r8 = b.j.a.b.l.FIELD_NAME
            if (r7 != r8) goto L_0x0187
            java.lang.String r2 = r12.e0()
            r8 = r11
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r0
        L_0x0140:
            if (r3 == 0) goto L_0x005d
            b.j.a.b.l r9 = r12.T0()
            java.util.Set<java.lang.String> r10 = r8.w
            if (r10 == 0) goto L_0x0154
            boolean r10 = r10.contains(r3)
            if (r10 == 0) goto L_0x0154
            r12.a1()
            goto L_0x0182
        L_0x0154:
            b.j.a.b.l r10 = b.j.a.b.l.VALUE_NULL     // Catch:{ v -> 0x017e, Exception -> 0x0179 }
            if (r9 != r10) goto L_0x0164
            boolean r9 = r8.f1671n     // Catch:{ v -> 0x017e, Exception -> 0x0179 }
            if (r9 == 0) goto L_0x015d
            goto L_0x0182
        L_0x015d:
            b.j.a.c.b0.r r9 = r8.f1669l     // Catch:{ v -> 0x017e, Exception -> 0x0179 }
            java.lang.Object r9 = r9.c(r13)     // Catch:{ v -> 0x017e, Exception -> 0x0179 }
            goto L_0x016f
        L_0x0164:
            if (r5 != 0) goto L_0x016b
            java.lang.Object r9 = r4.d(r12, r13)     // Catch:{ v -> 0x017e, Exception -> 0x0179 }
            goto L_0x016f
        L_0x016b:
            java.lang.Object r9 = r4.f(r12, r13, r5)     // Catch:{ v -> 0x017e, Exception -> 0x0179 }
        L_0x016f:
            if (r6 == 0) goto L_0x0175
            r7.a(r3, r9)     // Catch:{ v -> 0x017e, Exception -> 0x0179 }
            goto L_0x0182
        L_0x0175:
            r2.put(r3, r9)     // Catch:{ v -> 0x017e, Exception -> 0x0179 }
            goto L_0x0182
        L_0x0179:
            r12 = move-exception
            r8.e0(r12, r2, r3)
            throw r1
        L_0x017e:
            r9 = move-exception
            r8.h0(r13, r7, r3, r9)
        L_0x0182:
            java.lang.String r3 = r12.R0()
            goto L_0x0140
        L_0x0187:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r13.b0(r11, r8, r1, r12)
            throw r1
        L_0x018d:
            r11.g0(r12, r13, r0)
            goto L_0x005d
        L_0x0192:
            return r1
        L_0x0193:
            b.j.a.c.i r0 = r11.f1668k
            java.lang.Class<?> r4 = r0.f2152h
            b.j.a.c.b0.x r5 = r11.s
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r7 = "no default constructor found"
            r3 = r13
            r6 = r12
            r3.D(r4, r5, r6, r7, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.q.d(b.j.a.b.i, b.j.a.c.g):java.lang.Object");
    }

    public x d0() {
        return this.s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e A[Catch:{ Exception -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d A[Catch:{ Exception -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df A[Catch:{ Exception -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee A[Catch:{ Exception -> 0x010e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(b.j.a.b.i r11, b.j.a.c.g r12, java.lang.Object r13) {
        /*
            r10 = this;
            java.util.Map r13 = (java.util.Map) r13
            r11.Y0(r13)
            b.j.a.b.l r0 = r11.g0()
            b.j.a.b.l r1 = b.j.a.b.l.START_OBJECT
            r2 = 0
            if (r0 == r1) goto L_0x001b
            b.j.a.b.l r1 = b.j.a.b.l.FIELD_NAME
            if (r0 != r1) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            b.j.a.c.i r13 = r10.f1668k
            java.lang.Class<?> r13 = r13.f2152h
            r12.G(r13, r11)
            throw r2
        L_0x001b:
            boolean r0 = r10.f1713p
            r1 = 0
            if (r0 == 0) goto L_0x0098
            b.j.a.c.j<java.lang.Object> r0 = r10.f1714q
            b.j.a.c.f0.c r3 = r10.r
            boolean r4 = r11.P0()
            if (r4 == 0) goto L_0x002f
            r5 = r10
            r1 = r0
            r4 = r3
            r0 = r13
            goto L_0x0088
        L_0x002f:
            b.j.a.b.l r4 = r11.g0()
            b.j.a.b.l r5 = b.j.a.b.l.END_OBJECT
            if (r4 != r5) goto L_0x0039
            goto L_0x0113
        L_0x0039:
            b.j.a.b.l r5 = b.j.a.b.l.FIELD_NAME
            if (r4 != r5) goto L_0x0092
            java.lang.String r1 = r11.e0()
            r5 = r10
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r13
        L_0x0046:
            if (r3 == 0) goto L_0x0113
            b.j.a.b.l r6 = r11.T0()
            java.util.Set<java.lang.String> r7 = r5.w
            if (r7 == 0) goto L_0x005a
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L_0x005a
            r11.a1()
            goto L_0x0088
        L_0x005a:
            b.j.a.b.l r7 = b.j.a.b.l.VALUE_NULL     // Catch:{ Exception -> 0x008d }
            if (r6 != r7) goto L_0x006d
            boolean r6 = r5.f1671n     // Catch:{ Exception -> 0x008d }
            if (r6 == 0) goto L_0x0063
            goto L_0x0088
        L_0x0063:
            b.j.a.c.b0.r r6 = r5.f1669l     // Catch:{ Exception -> 0x008d }
            java.lang.Object r6 = r6.c(r12)     // Catch:{ Exception -> 0x008d }
            r0.put(r3, r6)     // Catch:{ Exception -> 0x008d }
            goto L_0x0088
        L_0x006d:
            java.lang.Object r6 = r0.get(r3)     // Catch:{ Exception -> 0x008d }
            if (r6 == 0) goto L_0x0078
            java.lang.Object r7 = r1.e(r11, r12, r6)     // Catch:{ Exception -> 0x008d }
            goto L_0x0083
        L_0x0078:
            if (r4 != 0) goto L_0x007f
            java.lang.Object r7 = r1.d(r11, r12)     // Catch:{ Exception -> 0x008d }
            goto L_0x0083
        L_0x007f:
            java.lang.Object r7 = r1.f(r11, r12, r4)     // Catch:{ Exception -> 0x008d }
        L_0x0083:
            if (r7 == r6) goto L_0x0088
            r0.put(r3, r7)     // Catch:{ Exception -> 0x008d }
        L_0x0088:
            java.lang.String r3 = r11.R0()
            goto L_0x0046
        L_0x008d:
            r11 = move-exception
            r5.e0(r11, r0, r3)
            throw r2
        L_0x0092:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r12.b0(r10, r5, r2, r11)
            throw r2
        L_0x0098:
            b.j.a.c.o r0 = r10.f1712o
            b.j.a.c.j<java.lang.Object> r3 = r10.f1714q
            b.j.a.c.f0.c r4 = r10.r
            boolean r5 = r11.P0()
            if (r5 == 0) goto L_0x00ab
            r6 = r10
            r1 = r0
            r5 = r4
            r0 = r13
            r4 = r3
            goto L_0x0109
        L_0x00ab:
            b.j.a.b.l r5 = r11.g0()
            b.j.a.b.l r6 = b.j.a.b.l.END_OBJECT
            if (r5 != r6) goto L_0x00b5
            goto L_0x0113
        L_0x00b5:
            b.j.a.b.l r6 = b.j.a.b.l.FIELD_NAME
            if (r5 != r6) goto L_0x0114
            java.lang.String r1 = r11.e0()
            r6 = r10
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r13
        L_0x00c3:
            if (r3 == 0) goto L_0x0113
            java.lang.Object r7 = r1.a(r3, r12)
            b.j.a.b.l r8 = r11.T0()
            java.util.Set<java.lang.String> r9 = r6.w
            if (r9 == 0) goto L_0x00db
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x00db
            r11.a1()
            goto L_0x0109
        L_0x00db:
            b.j.a.b.l r9 = b.j.a.b.l.VALUE_NULL     // Catch:{ Exception -> 0x010e }
            if (r8 != r9) goto L_0x00ee
            boolean r8 = r6.f1671n     // Catch:{ Exception -> 0x010e }
            if (r8 == 0) goto L_0x00e4
            goto L_0x0109
        L_0x00e4:
            b.j.a.c.b0.r r8 = r6.f1669l     // Catch:{ Exception -> 0x010e }
            java.lang.Object r8 = r8.c(r12)     // Catch:{ Exception -> 0x010e }
            r0.put(r7, r8)     // Catch:{ Exception -> 0x010e }
            goto L_0x0109
        L_0x00ee:
            java.lang.Object r8 = r0.get(r7)     // Catch:{ Exception -> 0x010e }
            if (r8 == 0) goto L_0x00f9
            java.lang.Object r9 = r4.e(r11, r12, r8)     // Catch:{ Exception -> 0x010e }
            goto L_0x0104
        L_0x00f9:
            if (r5 != 0) goto L_0x0100
            java.lang.Object r9 = r4.d(r11, r12)     // Catch:{ Exception -> 0x010e }
            goto L_0x0104
        L_0x0100:
            java.lang.Object r9 = r4.f(r11, r12, r5)     // Catch:{ Exception -> 0x010e }
        L_0x0104:
            if (r9 == r8) goto L_0x0109
            r0.put(r7, r9)     // Catch:{ Exception -> 0x010e }
        L_0x0109:
            java.lang.String r3 = r11.R0()
            goto L_0x00c3
        L_0x010e:
            r11 = move-exception
            r6.e0(r11, r0, r3)
            throw r2
        L_0x0113:
            return r13
        L_0x0114:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r12.b0(r10, r6, r2, r11)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.q.e(b.j.a.b.i, b.j.a.c.g, java.lang.Object):java.lang.Object");
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return cVar.d(iVar, gVar);
    }

    public final boolean f0(b.j.a.c.i iVar, o oVar) {
        b.j.a.c.i n2;
        if (oVar == null || (n2 = iVar.n()) == null) {
            return true;
        }
        Class<?> cls = n2.f2152h;
        if ((cls == String.class || cls == Object.class) && b.j.a.c.j0.g.u(oVar)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:20|(6:25|26|(1:(1:33)(1:34))(3:28|(3:30|43|(1:44)(0))|31)|(1:36)(1:37)|43|(0))(3:24|43|(0)(0))|22|25|26|(0)(0)|(0)(0)|43|(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        r7.e0(r12, r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        r7.h0(r13, r6, r8, r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ v -> 0x0084, Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a A[Catch:{ v -> 0x0084, Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077 A[Catch:{ v -> 0x0084, Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b A[Catch:{ v -> 0x0084, Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(b.j.a.b.i r12, b.j.a.c.g r13, java.util.Map<java.lang.Object, java.lang.Object> r14) {
        /*
            r11 = this;
            b.j.a.c.o r0 = r11.f1712o
            b.j.a.c.j<java.lang.Object> r1 = r11.f1714q
            b.j.a.c.f0.c r2 = r11.r
            b.j.a.c.b0.z.r r3 = r1.k()
            r4 = 0
            if (r3 == 0) goto L_0x000f
            r3 = 1
            goto L_0x0010
        L_0x000f:
            r3 = r4
        L_0x0010:
            r5 = 0
            if (r3 == 0) goto L_0x0021
            b.j.a.c.b0.a0.q$b r6 = new b.j.a.c.b0.a0.q$b
            b.j.a.c.i r7 = r11.f1668k
            b.j.a.c.i r7 = r7.k()
            java.lang.Class<?> r7 = r7.f2152h
            r6.<init>(r7, r14)
            goto L_0x0022
        L_0x0021:
            r6 = r5
        L_0x0022:
            boolean r7 = r12.P0()
            if (r7 == 0) goto L_0x002a
            r7 = r11
            goto L_0x0088
        L_0x002a:
            b.j.a.b.l r7 = r12.g0()
            b.j.a.b.l r8 = b.j.a.b.l.FIELD_NAME
            if (r7 == r8) goto L_0x003d
            b.j.a.b.l r12 = b.j.a.b.l.END_OBJECT
            if (r7 != r12) goto L_0x0037
            return
        L_0x0037:
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r13.b0(r11, r8, r5, r12)
            throw r5
        L_0x003d:
            java.lang.String r4 = r12.e0()
            r7 = r11
        L_0x0042:
            if (r4 == 0) goto L_0x008d
            java.lang.Object r8 = r0.a(r4, r13)
            b.j.a.b.l r9 = r12.T0()
            java.util.Set<java.lang.String> r10 = r7.w
            if (r10 == 0) goto L_0x005a
            boolean r10 = r10.contains(r4)
            if (r10 == 0) goto L_0x005a
            r12.a1()
            goto L_0x0088
        L_0x005a:
            b.j.a.b.l r10 = b.j.a.b.l.VALUE_NULL     // Catch:{ v -> 0x0084, Exception -> 0x007f }
            if (r9 != r10) goto L_0x006a
            boolean r9 = r7.f1671n     // Catch:{ v -> 0x0084, Exception -> 0x007f }
            if (r9 == 0) goto L_0x0063
            goto L_0x0088
        L_0x0063:
            b.j.a.c.b0.r r9 = r7.f1669l     // Catch:{ v -> 0x0084, Exception -> 0x007f }
            java.lang.Object r9 = r9.c(r13)     // Catch:{ v -> 0x0084, Exception -> 0x007f }
            goto L_0x0075
        L_0x006a:
            if (r2 != 0) goto L_0x0071
            java.lang.Object r9 = r1.d(r12, r13)     // Catch:{ v -> 0x0084, Exception -> 0x007f }
            goto L_0x0075
        L_0x0071:
            java.lang.Object r9 = r1.f(r12, r13, r2)     // Catch:{ v -> 0x0084, Exception -> 0x007f }
        L_0x0075:
            if (r3 == 0) goto L_0x007b
            r6.a(r8, r9)     // Catch:{ v -> 0x0084, Exception -> 0x007f }
            goto L_0x0088
        L_0x007b:
            r14.put(r8, r9)     // Catch:{ v -> 0x0084, Exception -> 0x007f }
            goto L_0x0088
        L_0x007f:
            r12 = move-exception
            r7.e0(r12, r14, r4)
            throw r5
        L_0x0084:
            r4 = move-exception
            r7.h0(r13, r6, r8, r4)
        L_0x0088:
            java.lang.String r4 = r12.R0()
            goto L_0x0042
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.q.g0(b.j.a.b.i, b.j.a.c.g, java.util.Map):void");
    }

    public final void h0(g gVar, b bVar, Object obj, v vVar) {
        if (bVar != null) {
            a aVar = new a(bVar, vVar, bVar.a, obj);
            bVar.c.add(aVar);
            vVar.f1803k.a(aVar);
            return;
        }
        gVar.Y(this, "Unresolved forward reference but no identity info: " + vVar, new Object[0]);
        throw null;
    }

    public boolean m() {
        return this.f1714q == null && this.f1712o == null && this.r == null && this.w == null;
    }
}
