package b.j.a.c.e0;

import b.e.a.a.a;
import b.j.a.a.b;
import b.j.a.a.h;
import b.j.a.c.a0.g;
import b.j.a.c.b;
import b.j.a.c.e0.a0;
import b.j.a.c.i;
import b.j.a.c.p;
import b.j.a.c.t;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class z {
    public final g<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1960b;
    public final boolean c;
    public final i d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1961e;
    public final i0<?> f;

    /* renamed from: g  reason: collision with root package name */
    public final b f1962g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1963h;

    /* renamed from: i  reason: collision with root package name */
    public final String f1964i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1965j;

    /* renamed from: k  reason: collision with root package name */
    public LinkedHashMap<String, a0> f1966k;

    /* renamed from: l  reason: collision with root package name */
    public LinkedList<a0> f1967l;

    /* renamed from: m  reason: collision with root package name */
    public LinkedList<h> f1968m;

    /* renamed from: n  reason: collision with root package name */
    public LinkedList<i> f1969n;

    /* renamed from: o  reason: collision with root package name */
    public LinkedList<h> f1970o;

    /* renamed from: p  reason: collision with root package name */
    public LinkedList<h> f1971p;

    /* renamed from: q  reason: collision with root package name */
    public HashSet<String> f1972q;
    public LinkedHashMap<Object, h> r;

    public z(g<?> gVar, boolean z, i iVar, b bVar, String str) {
        b bVar2;
        this.a = gVar;
        this.c = gVar.o(p.USE_STD_BEAN_NAMING);
        this.f1960b = z;
        this.d = iVar;
        this.f1961e = bVar;
        this.f1964i = str == null ? "set" : str;
        if (gVar.n()) {
            this.f1963h = true;
            bVar2 = gVar.e();
        } else {
            this.f1963h = false;
            bVar2 = x.f1957h;
        }
        this.f1962g = bVar2;
        this.f = gVar.k(iVar.f2152h, bVar);
    }

    public void a(Map<String, a0> map, l lVar) {
        a0 a0Var;
        h.a e2;
        String n2 = this.f1962g.n(lVar);
        if (n2 == null) {
            n2 = "";
        }
        t v = this.f1962g.v(lVar);
        boolean z = v != null && !v.e();
        if (!z) {
            if (!n2.isEmpty() && (e2 = this.f1962g.e(this.a, lVar.f1923j)) != null && e2 != h.a.DISABLED) {
                v = t.a(n2);
            } else {
                return;
            }
        }
        t tVar = v;
        if (!z || !n2.isEmpty()) {
            a0Var = e(map, n2);
        } else {
            String str = tVar.f2305h;
            a0Var = map.get(str);
            if (a0Var == null) {
                a0Var = new a0(this.a, this.f1962g, this.f1960b, tVar);
                map.put(str, a0Var);
            }
        }
        a0Var.f1880o = new a0.e(lVar, a0Var.f1880o, tVar, z, true, false);
        this.f1967l.add(a0Var);
    }

    public final void b(String str) {
        if (!this.f1960b) {
            if (this.f1972q == null) {
                this.f1972q = new HashSet<>();
            }
            this.f1972q.add(str);
        }
    }

    public void c(b.a aVar, h hVar) {
        if (aVar != null) {
            Object obj = aVar.f1269h;
            if (this.r == null) {
                this.r = new LinkedHashMap<>();
            }
            h hVar2 = (h) this.r.put(obj, hVar);
            if (hVar2 != null && hVar2.getClass() == hVar.getClass()) {
                String name = obj.getClass().getName();
                StringBuilder y = a.y("Duplicate injectable value with id '");
                y.append(String.valueOf(obj));
                y.append("' (of type ");
                y.append(name);
                y.append(")");
                throw new IllegalArgumentException(y.toString());
            }
        }
    }

    public final t d(String str) {
        return t.b(str, (String) null);
    }

    public a0 e(Map<String, a0> map, String str) {
        a0 a0Var = map.get(str);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this.a, this.f1962g, this.f1960b, t.a(str));
        map.put(str, a0Var2);
        return a0Var2;
    }

    public void f(a0 a0Var, List<a0> list) {
        if (list != null) {
            String str = a0Var.f1878m.f2305h;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (list.get(i2).f1878m.f2305h.equals(str)) {
                    list.set(i2, a0Var);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:266:0x04c9, code lost:
        if (r4.f1874i != false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04d2, code lost:
        if (r4.f1874i == false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06c7, code lost:
        if (r6.G() != false) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x070d, code lost:
        if ((r6.f1881p != null) != false) goto L_0x070f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0727  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0739  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0743  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x03df A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            b.j.a.c.b r3 = r0.f1962g
            boolean r4 = r0.f1960b
            if (r4 != 0) goto L_0x001b
            b.j.a.c.a0.g<?> r4 = r0.a
            b.j.a.c.p r6 = b.j.a.c.p.ALLOW_FINAL_FIELDS_AS_MUTATORS
            boolean r4 = r4.o(r6)
            if (r4 != 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            b.j.a.c.a0.g<?> r6 = r0.a
            b.j.a.c.p r7 = b.j.a.c.p.PROPAGATE_TRANSIENT_MARKER
            boolean r6 = r6.o(r7)
            b.j.a.c.e0.b r7 = r0.f1961e
            java.lang.Iterable r7 = r7.i()
            java.util.Iterator r7 = r7.iterator()
        L_0x002e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00f3
            java.lang.Object r8 = r7.next()
            r10 = r8
            b.j.a.c.e0.f r10 = (b.j.a.c.e0.f) r10
            java.lang.String r8 = r3.n(r10)
            java.lang.Boolean r9 = r3.f0(r10)
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x0057
            java.util.LinkedList<b.j.a.c.e0.h> r8 = r0.f1971p
            if (r8 != 0) goto L_0x0054
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            r0.f1971p = r8
        L_0x0054:
            java.util.LinkedList<b.j.a.c.e0.h> r8 = r0.f1971p
            goto L_0x006e
        L_0x0057:
            java.lang.Boolean r9 = r3.e0(r10)
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x0072
            java.util.LinkedList<b.j.a.c.e0.h> r8 = r0.f1970o
            if (r8 != 0) goto L_0x006c
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            r0.f1970o = r8
        L_0x006c:
            java.util.LinkedList<b.j.a.c.e0.h> r8 = r0.f1970o
        L_0x006e:
            r8.add(r10)
            goto L_0x002e
        L_0x0072:
            if (r8 != 0) goto L_0x0078
            java.lang.String r8 = r10.d()
        L_0x0078:
            boolean r9 = r0.f1960b
            if (r9 == 0) goto L_0x0081
            b.j.a.c.t r9 = r3.w(r10)
            goto L_0x0085
        L_0x0081:
            b.j.a.c.t r9 = r3.v(r10)
        L_0x0085:
            if (r9 == 0) goto L_0x0089
            r11 = 1
            goto L_0x008a
        L_0x0089:
            r11 = 0
        L_0x008a:
            if (r11 == 0) goto L_0x009a
            boolean r12 = r9.e()
            if (r12 == 0) goto L_0x009a
            b.j.a.c.t r9 = r0.d(r8)
            r12 = 0
            r13 = r12
            r12 = r9
            goto L_0x009c
        L_0x009a:
            r12 = r9
            r13 = r11
        L_0x009c:
            if (r12 == 0) goto L_0x00a0
            r9 = 1
            goto L_0x00a1
        L_0x00a0:
            r9 = 0
        L_0x00a1:
            if (r9 != 0) goto L_0x00b2
            b.j.a.c.e0.i0<?> r9 = r0.f
            b.j.a.c.e0.i0$a r9 = (b.j.a.c.e0.i0.a) r9
            java.util.Objects.requireNonNull(r9)
            java.lang.reflect.Field r14 = r10.f1903j
            b.j.a.a.f$a r9 = r9.f1920l
            boolean r9 = r9.d(r14)
        L_0x00b2:
            boolean r14 = r3.i0(r10)
            java.lang.reflect.Field r15 = r10.f1903j
            int r15 = r15.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isTransient(r15)
            if (r15 == 0) goto L_0x00c8
            if (r11 != 0) goto L_0x00c8
            if (r6 == 0) goto L_0x00c7
            r14 = 1
        L_0x00c7:
            r9 = 0
        L_0x00c8:
            r15 = r14
            r14 = r9
            if (r4 == 0) goto L_0x00de
            if (r12 != 0) goto L_0x00de
            if (r15 != 0) goto L_0x00de
            java.lang.reflect.Field r9 = r10.f1903j
            int r9 = r9.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isFinal(r9)
            if (r9 == 0) goto L_0x00de
            goto L_0x002e
        L_0x00de:
            b.j.a.c.e0.a0 r8 = r0.e(r2, r8)
            b.j.a.c.e0.a0$e r11 = new b.j.a.c.e0.a0$e
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r9 = r8.f1879n
            r16 = r9
            r9 = r11
            r5 = r11
            r11 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.f1879n = r5
            goto L_0x002e
        L_0x00f3:
            b.j.a.c.b r3 = r0.f1962g
            b.j.a.c.e0.b r4 = r0.f1961e
            b.j.a.c.e0.k r4 = r4.h()
            java.util.Iterator r4 = r4.iterator()
        L_0x00ff:
            boolean r5 = r4.hasNext()
            r6 = 2
            r7 = 0
            if (r5 == 0) goto L_0x027b
            java.lang.Object r5 = r4.next()
            r9 = r5
            b.j.a.c.e0.i r9 = (b.j.a.c.e0.i) r9
            int r5 = r9.t()
            if (r5 != 0) goto L_0x01e3
            java.lang.Class r5 = r9.w()
            java.lang.Class r6 = java.lang.Void.TYPE
            if (r5 == r6) goto L_0x0122
            java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
            if (r5 == r6) goto L_0x0122
            r5 = 1
            goto L_0x0123
        L_0x0122:
            r5 = 0
        L_0x0123:
            if (r5 != 0) goto L_0x0126
            goto L_0x00ff
        L_0x0126:
            java.lang.Boolean r5 = r3.c0(r9)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x013e
            java.util.LinkedList<b.j.a.c.e0.h> r5 = r0.f1968m
            if (r5 != 0) goto L_0x013b
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r0.f1968m = r5
        L_0x013b:
            java.util.LinkedList<b.j.a.c.e0.h> r5 = r0.f1968m
            goto L_0x0155
        L_0x013e:
            java.lang.Boolean r5 = r3.f0(r9)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0159
            java.util.LinkedList<b.j.a.c.e0.h> r5 = r0.f1971p
            if (r5 != 0) goto L_0x0153
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r0.f1971p = r5
        L_0x0153:
            java.util.LinkedList<b.j.a.c.e0.h> r5 = r0.f1971p
        L_0x0155:
            r5.add(r9)
            goto L_0x00ff
        L_0x0159:
            b.j.a.c.t r5 = r3.w(r9)
            if (r5 == 0) goto L_0x0161
            r6 = 1
            goto L_0x0162
        L_0x0161:
            r6 = 0
        L_0x0162:
            java.lang.String r7 = r3.n(r9)
            if (r6 != 0) goto L_0x01a7
            if (r7 != 0) goto L_0x0174
            java.lang.String r7 = r9.d()
            boolean r8 = r0.c
            java.lang.String r7 = b.a.a.n.f.I(r9, r7, r8)
        L_0x0174:
            if (r7 != 0) goto L_0x0194
            java.lang.String r7 = r9.d()
            boolean r8 = r0.c
            java.lang.String r7 = b.a.a.n.f.G(r9, r7, r8)
            if (r7 != 0) goto L_0x0184
            goto L_0x00ff
        L_0x0184:
            b.j.a.c.e0.i0<?> r8 = r0.f
            b.j.a.c.e0.i0$a r8 = (b.j.a.c.e0.i0.a) r8
            java.util.Objects.requireNonNull(r8)
            java.lang.reflect.Method r10 = r9.f1913k
            b.j.a.a.f$a r8 = r8.f1917i
            boolean r8 = r8.d(r10)
            goto L_0x01a3
        L_0x0194:
            b.j.a.c.e0.i0<?> r8 = r0.f
            b.j.a.c.e0.i0$a r8 = (b.j.a.c.e0.i0.a) r8
            java.util.Objects.requireNonNull(r8)
            java.lang.reflect.Method r10 = r9.f1913k
            b.j.a.a.f$a r8 = r8.f1916h
            boolean r8 = r8.d(r10)
        L_0x01a3:
            r11 = r5
            r12 = r6
            r13 = r8
            goto L_0x01cf
        L_0x01a7:
            if (r7 != 0) goto L_0x01bb
            boolean r7 = r0.c
            java.lang.String r8 = r9.d()
            java.lang.String r10 = b.a.a.n.f.G(r9, r8, r7)
            if (r10 != 0) goto L_0x01ba
            java.lang.String r7 = b.a.a.n.f.I(r9, r8, r7)
            goto L_0x01bb
        L_0x01ba:
            r7 = r10
        L_0x01bb:
            if (r7 != 0) goto L_0x01c1
            java.lang.String r7 = r9.d()
        L_0x01c1:
            boolean r8 = r5.e()
            if (r8 == 0) goto L_0x01cc
            b.j.a.c.t r5 = r0.d(r7)
            r6 = 0
        L_0x01cc:
            r11 = r5
            r12 = r6
            r13 = 1
        L_0x01cf:
            boolean r14 = r3.i0(r9)
            b.j.a.c.e0.a0 r5 = r0.e(r2, r7)
            b.j.a.c.e0.a0$e r6 = new b.j.a.c.e0.a0$e
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r10 = r5.f1881p
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r5.f1881p = r6
            goto L_0x00ff
        L_0x01e3:
            r8 = 1
            if (r5 != r8) goto L_0x025b
            if (r3 != 0) goto L_0x01ea
            r5 = r7
            goto L_0x01ee
        L_0x01ea:
            b.j.a.c.t r5 = r3.v(r9)
        L_0x01ee:
            if (r5 == 0) goto L_0x01f2
            r6 = 1
            goto L_0x01f3
        L_0x01f2:
            r6 = 0
        L_0x01f3:
            if (r6 != 0) goto L_0x021d
            if (r3 != 0) goto L_0x01f8
            goto L_0x01fc
        L_0x01f8:
            java.lang.String r7 = r3.n(r9)
        L_0x01fc:
            if (r7 != 0) goto L_0x0206
            java.lang.String r7 = r0.f1964i
            boolean r8 = r0.c
            java.lang.String r7 = b.a.a.n.f.H(r9, r7, r8)
        L_0x0206:
            if (r7 != 0) goto L_0x020a
            goto L_0x00ff
        L_0x020a:
            b.j.a.c.e0.i0<?> r8 = r0.f
            b.j.a.c.e0.i0$a r8 = (b.j.a.c.e0.i0.a) r8
            java.util.Objects.requireNonNull(r8)
            java.lang.reflect.Method r10 = r9.f1913k
            b.j.a.a.f$a r8 = r8.f1918j
            boolean r8 = r8.d(r10)
            r11 = r5
            r12 = r6
            r13 = r8
            goto L_0x0242
        L_0x021d:
            if (r3 != 0) goto L_0x0220
            goto L_0x0224
        L_0x0220:
            java.lang.String r7 = r3.n(r9)
        L_0x0224:
            if (r7 != 0) goto L_0x022e
            java.lang.String r7 = r0.f1964i
            boolean r8 = r0.c
            java.lang.String r7 = b.a.a.n.f.H(r9, r7, r8)
        L_0x022e:
            if (r7 != 0) goto L_0x0234
            java.lang.String r7 = r9.d()
        L_0x0234:
            boolean r8 = r5.e()
            if (r8 == 0) goto L_0x023f
            b.j.a.c.t r5 = r0.d(r7)
            r6 = 0
        L_0x023f:
            r11 = r5
            r12 = r6
            r13 = 1
        L_0x0242:
            if (r3 != 0) goto L_0x0246
            r5 = 0
            goto L_0x024a
        L_0x0246:
            boolean r5 = r3.i0(r9)
        L_0x024a:
            r14 = r5
            b.j.a.c.e0.a0 r5 = r0.e(r2, r7)
            b.j.a.c.e0.a0$e r6 = new b.j.a.c.e0.a0$e
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r10 = r5.f1882q
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r5.f1882q = r6
            goto L_0x00ff
        L_0x025b:
            if (r5 != r6) goto L_0x00ff
            if (r3 == 0) goto L_0x00ff
            java.lang.Boolean r5 = r3.e0(r9)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00ff
            java.util.LinkedList<b.j.a.c.e0.i> r5 = r0.f1969n
            if (r5 != 0) goto L_0x0274
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r0.f1969n = r5
        L_0x0274:
            java.util.LinkedList<b.j.a.c.e0.i> r5 = r0.f1969n
            r5.add(r9)
            goto L_0x00ff
        L_0x027b:
            b.j.a.c.e0.b r1 = r0.f1961e
            boolean r1 = r1.l()
            if (r1 != 0) goto L_0x02ec
            boolean r1 = r0.f1963h
            if (r1 != 0) goto L_0x0288
            goto L_0x02ec
        L_0x0288:
            b.j.a.c.e0.b r1 = r0.f1961e
            java.util.List r1 = r1.j()
            java.util.Iterator r1 = r1.iterator()
        L_0x0292:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02ba
            java.lang.Object r3 = r1.next()
            b.j.a.c.e0.d r3 = (b.j.a.c.e0.d) r3
            java.util.LinkedList<b.j.a.c.e0.a0> r4 = r0.f1967l
            if (r4 != 0) goto L_0x02a9
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r0.f1967l = r4
        L_0x02a9:
            int r4 = r3.t()
            r5 = 0
        L_0x02ae:
            if (r5 >= r4) goto L_0x0292
            b.j.a.c.e0.l r8 = r3.r(r5)
            r0.a(r2, r8)
            int r5 = r5 + 1
            goto L_0x02ae
        L_0x02ba:
            b.j.a.c.e0.b r1 = r0.f1961e
            java.util.List r1 = r1.k()
            java.util.Iterator r1 = r1.iterator()
        L_0x02c4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02ec
            java.lang.Object r3 = r1.next()
            b.j.a.c.e0.i r3 = (b.j.a.c.e0.i) r3
            java.util.LinkedList<b.j.a.c.e0.a0> r4 = r0.f1967l
            if (r4 != 0) goto L_0x02db
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r0.f1967l = r4
        L_0x02db:
            int r4 = r3.t()
            r5 = 0
        L_0x02e0:
            if (r5 >= r4) goto L_0x02c4
            b.j.a.c.e0.l r8 = r3.r(r5)
            r0.a(r2, r8)
            int r5 = r5 + 1
            goto L_0x02e0
        L_0x02ec:
            b.j.a.c.b r1 = r0.f1962g
            b.j.a.c.e0.b r3 = r0.f1961e
            java.lang.Iterable r3 = r3.i()
            java.util.Iterator r3 = r3.iterator()
        L_0x02f8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x030c
            java.lang.Object r4 = r3.next()
            b.j.a.c.e0.f r4 = (b.j.a.c.e0.f) r4
            b.j.a.a.b$a r5 = r1.o(r4)
            r0.c(r5, r4)
            goto L_0x02f8
        L_0x030c:
            b.j.a.c.e0.b r3 = r0.f1961e
            b.j.a.c.e0.k r3 = r3.h()
            java.util.Iterator r3 = r3.iterator()
        L_0x0316:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0332
            java.lang.Object r4 = r3.next()
            b.j.a.c.e0.i r4 = (b.j.a.c.e0.i) r4
            int r5 = r4.t()
            r8 = 1
            if (r5 == r8) goto L_0x032a
            goto L_0x0316
        L_0x032a:
            b.j.a.a.b$a r5 = r1.o(r4)
            r0.c(r5, r4)
            goto L_0x0316
        L_0x0332:
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x033a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x03cf
            java.lang.Object r3 = r1.next()
            b.j.a.c.e0.a0 r3 = (b.j.a.c.e0.a0) r3
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r4 = r3.f1879n
            boolean r4 = r3.P(r4)
            if (r4 != 0) goto L_0x0369
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1881p
            boolean r4 = r3.P(r4)
            if (r4 != 0) goto L_0x0369
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1882q
            boolean r4 = r3.P(r4)
            if (r4 != 0) goto L_0x0369
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r4 = r3.f1880o
            boolean r4 = r3.P(r4)
            if (r4 == 0) goto L_0x0367
            goto L_0x0369
        L_0x0367:
            r4 = 0
            goto L_0x036a
        L_0x0369:
            r4 = 1
        L_0x036a:
            if (r4 != 0) goto L_0x0370
            r1.remove()
            goto L_0x033a
        L_0x0370:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r4 = r3.f1879n
            boolean r4 = r3.O(r4)
            if (r4 != 0) goto L_0x0393
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1881p
            boolean r4 = r3.O(r4)
            if (r4 != 0) goto L_0x0393
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1882q
            boolean r4 = r3.O(r4)
            if (r4 != 0) goto L_0x0393
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r4 = r3.f1880o
            boolean r4 = r3.O(r4)
            if (r4 == 0) goto L_0x0391
            goto L_0x0393
        L_0x0391:
            r4 = 0
            goto L_0x0394
        L_0x0393:
            r4 = 1
        L_0x0394:
            if (r4 == 0) goto L_0x033a
            boolean r4 = r3.J()
            if (r4 != 0) goto L_0x03a0
            r1.remove()
            goto L_0x03c6
        L_0x03a0:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r4 = r3.f1879n
            b.j.a.c.e0.a0$e r4 = r3.W(r4)
            r3.f1879n = r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1881p
            b.j.a.c.e0.a0$e r4 = r3.W(r4)
            r3.f1881p = r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1882q
            b.j.a.c.e0.a0$e r4 = r3.W(r4)
            r3.f1882q = r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r4 = r3.f1880o
            b.j.a.c.e0.a0$e r4 = r3.W(r4)
            r3.f1880o = r4
            boolean r4 = r3.n()
            if (r4 != 0) goto L_0x033a
        L_0x03c6:
            java.lang.String r3 = r3.getName()
            r0.b(r3)
            goto L_0x033a
        L_0x03cf:
            b.j.a.c.a0.g<?> r1 = r0.a
            b.j.a.c.p r3 = b.j.a.c.p.INFER_PROPERTY_MUTATORS
            boolean r1 = r1.o(r3)
            java.util.Collection r3 = r2.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x03df:
            boolean r4 = r3.hasNext()
            r5 = 3
            if (r4 == 0) goto L_0x04e3
            java.lang.Object r4 = r3.next()
            b.j.a.c.e0.a0 r4 = (b.j.a.c.e0.a0) r4
            b.j.a.a.u$a r8 = b.j.a.a.u.a.AUTO
            b.j.a.c.b r9 = r4.f1876k
            if (r9 != 0) goto L_0x03f4
            goto L_0x048e
        L_0x03f4:
            boolean r10 = r4.f1874i
            if (r10 == 0) goto L_0x0444
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r10 = r4.f1881p
            if (r10 == 0) goto L_0x040a
            T r10 = r10.a
            b.j.a.c.e0.h r10 = (b.j.a.c.e0.h) r10
            b.j.a.a.u$a r9 = r9.E(r10)
            if (r9 == 0) goto L_0x040a
            if (r9 == r8) goto L_0x040a
            goto L_0x048f
        L_0x040a:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r9 = r4.f1879n
            if (r9 == 0) goto L_0x041e
            T r9 = r9.a
            b.j.a.c.e0.h r9 = (b.j.a.c.e0.h) r9
            b.j.a.c.b r10 = r4.f1876k
            b.j.a.a.u$a r9 = r10.E(r9)
            if (r9 == 0) goto L_0x041e
            if (r9 == r8) goto L_0x041e
            goto L_0x048f
        L_0x041e:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r9 = r4.f1880o
            if (r9 == 0) goto L_0x0431
            T r9 = r9.a
            b.j.a.c.e0.h r9 = (b.j.a.c.e0.h) r9
            b.j.a.c.b r10 = r4.f1876k
            b.j.a.a.u$a r9 = r10.E(r9)
            if (r9 == 0) goto L_0x0431
            if (r9 == r8) goto L_0x0431
            goto L_0x048f
        L_0x0431:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r9 = r4.f1882q
            if (r9 == 0) goto L_0x048e
            T r9 = r9.a
            b.j.a.c.e0.h r9 = (b.j.a.c.e0.h) r9
            b.j.a.c.b r10 = r4.f1876k
            b.j.a.a.u$a r9 = r10.E(r9)
            if (r9 == 0) goto L_0x048e
            if (r9 == r8) goto L_0x048e
            goto L_0x048f
        L_0x0444:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r10 = r4.f1880o
            if (r10 == 0) goto L_0x0455
            T r10 = r10.a
            b.j.a.c.e0.h r10 = (b.j.a.c.e0.h) r10
            b.j.a.a.u$a r9 = r9.E(r10)
            if (r9 == 0) goto L_0x0455
            if (r9 == r8) goto L_0x0455
            goto L_0x048f
        L_0x0455:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r9 = r4.f1882q
            if (r9 == 0) goto L_0x0468
            T r9 = r9.a
            b.j.a.c.e0.h r9 = (b.j.a.c.e0.h) r9
            b.j.a.c.b r10 = r4.f1876k
            b.j.a.a.u$a r9 = r10.E(r9)
            if (r9 == 0) goto L_0x0468
            if (r9 == r8) goto L_0x0468
            goto L_0x048f
        L_0x0468:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r9 = r4.f1879n
            if (r9 == 0) goto L_0x047b
            T r9 = r9.a
            b.j.a.c.e0.h r9 = (b.j.a.c.e0.h) r9
            b.j.a.c.b r10 = r4.f1876k
            b.j.a.a.u$a r9 = r10.E(r9)
            if (r9 == 0) goto L_0x047b
            if (r9 == r8) goto L_0x047b
            goto L_0x048f
        L_0x047b:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r9 = r4.f1881p
            if (r9 == 0) goto L_0x048e
            T r9 = r9.a
            b.j.a.c.e0.h r9 = (b.j.a.c.e0.h) r9
            b.j.a.c.b r10 = r4.f1876k
            b.j.a.a.u$a r9 = r10.E(r9)
            if (r9 == 0) goto L_0x048e
            if (r9 == r8) goto L_0x048e
            goto L_0x048f
        L_0x048e:
            r9 = r7
        L_0x048f:
            if (r9 != 0) goto L_0x0492
            goto L_0x0493
        L_0x0492:
            r8 = r9
        L_0x0493:
            int r9 = r8.ordinal()
            r10 = 1
            if (r9 == r10) goto L_0x04cc
            if (r9 == r6) goto L_0x04c5
            if (r9 == r5) goto L_0x04d6
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r5 = r4.f1881p
            b.j.a.c.e0.a0$e r5 = r4.X(r5)
            r4.f1881p = r5
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r5 = r4.f1880o
            b.j.a.c.e0.a0$e r5 = r4.X(r5)
            r4.f1880o = r5
            if (r1 == 0) goto L_0x04b4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r5 = r4.f1881p
            if (r5 != 0) goto L_0x04d6
        L_0x04b4:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r5 = r4.f1879n
            b.j.a.c.e0.a0$e r5 = r4.X(r5)
            r4.f1879n = r5
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r5 = r4.f1882q
            b.j.a.c.e0.a0$e r5 = r4.X(r5)
            r4.f1882q = r5
            goto L_0x04d6
        L_0x04c5:
            r4.f1881p = r7
            boolean r5 = r4.f1874i
            if (r5 == 0) goto L_0x04d6
            goto L_0x04d4
        L_0x04cc:
            r4.f1882q = r7
            r4.f1880o = r7
            boolean r5 = r4.f1874i
            if (r5 != 0) goto L_0x04d6
        L_0x04d4:
            r4.f1879n = r7
        L_0x04d6:
            b.j.a.a.u$a r5 = b.j.a.a.u.a.READ_ONLY
            if (r8 != r5) goto L_0x03df
            java.lang.String r4 = r4.getName()
            r0.b(r4)
            goto L_0x03df
        L_0x04e3:
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r3 = r7
        L_0x04ec:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0568
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            b.j.a.c.e0.a0 r4 = (b.j.a.c.e0.a0) r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r8 = r4.f1879n
            java.util.Set r8 = r4.S(r8, r7)
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r9 = r4.f1881p
            java.util.Set r8 = r4.S(r9, r8)
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r9 = r4.f1882q
            java.util.Set r8 = r4.S(r9, r8)
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r9 = r4.f1880o
            java.util.Set r8 = r4.S(r9, r8)
            if (r8 != 0) goto L_0x051c
            java.util.Set r8 = java.util.Collections.emptySet()
        L_0x051c:
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0523
            goto L_0x04ec
        L_0x0523:
            r1.remove()
            if (r3 != 0) goto L_0x052d
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
        L_0x052d:
            int r9 = r8.size()
            r10 = 1
            if (r9 != r10) goto L_0x0547
            java.util.Iterator r8 = r8.iterator()
            java.lang.Object r8 = r8.next()
            b.j.a.c.t r8 = (b.j.a.c.t) r8
            b.j.a.c.e0.a0 r9 = new b.j.a.c.e0.a0
            r9.<init>(r4, r8)
            r3.add(r9)
            goto L_0x04ec
        L_0x0547:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r10 = r4.f1879n
            r4.R(r8, r9, r10)
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r10 = r4.f1881p
            r4.R(r8, r9, r10)
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r10 = r4.f1882q
            r4.R(r8, r9, r10)
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r10 = r4.f1880o
            r4.R(r8, r9, r10)
            java.util.Collection r4 = r9.values()
            r3.addAll(r4)
            goto L_0x04ec
        L_0x0568:
            if (r3 == 0) goto L_0x059a
            java.util.Iterator r1 = r3.iterator()
        L_0x056e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x059a
            java.lang.Object r3 = r1.next()
            b.j.a.c.e0.a0 r3 = (b.j.a.c.e0.a0) r3
            java.lang.String r4 = r3.getName()
            java.lang.Object r8 = r2.get(r4)
            b.j.a.c.e0.a0 r8 = (b.j.a.c.e0.a0) r8
            if (r8 != 0) goto L_0x058a
            r2.put(r4, r3)
            goto L_0x058d
        L_0x058a:
            r8.a0(r3)
        L_0x058d:
            java.util.LinkedList<b.j.a.c.e0.a0> r8 = r0.f1967l
            r0.f(r3, r8)
            java.util.HashSet<java.lang.String> r3 = r0.f1972q
            if (r3 == 0) goto L_0x056e
            r3.remove(r4)
            goto L_0x056e
        L_0x059a:
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x05a2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x064a
            java.lang.Object r3 = r1.next()
            b.j.a.c.e0.a0 r3 = (b.j.a.c.e0.a0) r3
            boolean r4 = r0.f1960b
            r8 = 4
            if (r4 == 0) goto L_0x05ed
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1881p
            if (r4 == 0) goto L_0x05d6
            b.j.a.c.e0.a0$e[] r8 = new b.j.a.c.e0.a0.e[r8]
            r9 = 0
            r8[r9] = r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r4 = r3.f1879n
            r10 = 1
            r8[r10] = r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r4 = r3.f1880o
            r8[r6] = r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1882q
            r8[r5] = r4
            b.j.a.c.e0.o r4 = r3.V(r9, r8)
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r8 = r3.f1881p
            b.j.a.c.e0.a0$e r4 = r3.Q(r8, r4)
            r3.f1881p = r4
            goto L_0x05a2
        L_0x05d6:
            r4 = 0
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r8 = r3.f1879n
            if (r8 == 0) goto L_0x05a2
            b.j.a.c.e0.a0$e[] r9 = new b.j.a.c.e0.a0.e[r5]
            r9[r4] = r8
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r8 = r3.f1880o
            r10 = 1
            r9[r10] = r8
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r8 = r3.f1882q
            r9[r6] = r8
            b.j.a.c.e0.o r4 = r3.V(r4, r9)
            goto L_0x0640
        L_0x05ed:
            r4 = 0
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r9 = r3.f1880o
            if (r9 == 0) goto L_0x0610
            b.j.a.c.e0.a0$e[] r8 = new b.j.a.c.e0.a0.e[r8]
            r8[r4] = r9
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r9 = r3.f1882q
            r10 = 1
            r8[r10] = r9
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r9 = r3.f1879n
            r8[r6] = r9
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r9 = r3.f1881p
            r8[r5] = r9
            b.j.a.c.e0.o r4 = r3.V(r4, r8)
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r8 = r3.f1880o
            b.j.a.c.e0.a0$e r4 = r3.Q(r8, r4)
            r3.f1880o = r4
            goto L_0x05a2
        L_0x0610:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r8 = r3.f1882q
            if (r8 == 0) goto L_0x062f
            b.j.a.c.e0.a0$e[] r9 = new b.j.a.c.e0.a0.e[r5]
            r9[r4] = r8
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r8 = r3.f1879n
            r10 = 1
            r9[r10] = r8
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r8 = r3.f1881p
            r9[r6] = r8
            b.j.a.c.e0.o r4 = r3.V(r4, r9)
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r8 = r3.f1882q
            b.j.a.c.e0.a0$e r4 = r3.Q(r8, r4)
            r3.f1882q = r4
            goto L_0x05a2
        L_0x062f:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r8 = r3.f1879n
            if (r8 == 0) goto L_0x05a2
            b.j.a.c.e0.a0$e[] r9 = new b.j.a.c.e0.a0.e[r6]
            r9[r4] = r8
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r8 = r3.f1881p
            r10 = 1
            r9[r10] = r8
            b.j.a.c.e0.o r4 = r3.V(r4, r9)
        L_0x0640:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r8 = r3.f1879n
            b.j.a.c.e0.a0$e r4 = r3.Q(r8, r4)
            r3.f1879n = r4
            goto L_0x05a2
        L_0x064a:
            r8 = 0
            b.j.a.c.b r1 = r0.f1962g
            b.j.a.c.e0.b r3 = r0.f1961e
            java.lang.Object r1 = r1.x(r3)
            if (r1 != 0) goto L_0x065c
            b.j.a.c.a0.g<?> r1 = r0.a
            b.j.a.c.a0.a r1 = r1.f1609i
            b.j.a.c.u r1 = r1.f1588j
            goto L_0x0688
        L_0x065c:
            boolean r3 = r1 instanceof b.j.a.c.u
            if (r3 == 0) goto L_0x0661
            goto L_0x0686
        L_0x0661:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L_0x08ba
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class<b.j.a.c.u> r3 = b.j.a.c.u.class
            if (r1 != r3) goto L_0x066d
            r1 = r7
            goto L_0x0688
        L_0x066d:
            java.lang.Class<b.j.a.c.u> r3 = b.j.a.c.u.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x08a8
            b.j.a.c.a0.g<?> r3 = r0.a
            b.j.a.c.a0.a r3 = r3.f1609i
            java.util.Objects.requireNonNull(r3)
            b.j.a.c.a0.g<?> r3 = r0.a
            boolean r3 = r3.b()
            java.lang.Object r1 = b.j.a.c.j0.g.h(r1, r3)
        L_0x0686:
            b.j.a.c.u r1 = (b.j.a.c.u) r1
        L_0x0688:
            if (r1 == 0) goto L_0x0753
            java.util.Collection r3 = r2.values()
            int r4 = r2.size()
            b.j.a.c.e0.a0[] r4 = new b.j.a.c.e0.a0[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            b.j.a.c.e0.a0[] r3 = (b.j.a.c.e0.a0[]) r3
            r2.clear()
            int r4 = r3.length
            r5 = r8
        L_0x069f:
            if (r5 >= r4) goto L_0x0753
            r6 = r3[r5]
            b.j.a.c.t r9 = r6.f1877l
            boolean r10 = r6.K()
            if (r10 == 0) goto L_0x06b5
            b.j.a.c.a0.g<?> r10 = r0.a
            b.j.a.c.p r11 = b.j.a.c.p.ALLOW_EXPLICIT_PROPERTY_RENAMING
            boolean r10 = r10.o(r11)
            if (r10 == 0) goto L_0x071c
        L_0x06b5:
            boolean r10 = r0.f1960b
            if (r10 == 0) goto L_0x06ca
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r10 = r6.f1881p
            if (r10 == 0) goto L_0x06bf
            r10 = 1
            goto L_0x06c0
        L_0x06bf:
            r10 = r8
        L_0x06c0:
            if (r10 == 0) goto L_0x06c3
            goto L_0x070f
        L_0x06c3:
            boolean r10 = r6.G()
            if (r10 == 0) goto L_0x071c
            goto L_0x06f9
        L_0x06ca:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r10 = r6.f1882q
            if (r10 == 0) goto L_0x06d0
            r10 = 1
            goto L_0x06d1
        L_0x06d0:
            r10 = r8
        L_0x06d1:
            if (r10 == 0) goto L_0x06e0
            b.j.a.c.a0.g<?> r10 = r0.a
            b.j.a.c.e0.i r11 = r6.D()
            java.lang.String r12 = r9.f2305h
            java.lang.String r10 = r1.d(r10, r11, r12)
            goto L_0x071d
        L_0x06e0:
            boolean r10 = r6.F()
            if (r10 == 0) goto L_0x06f3
            b.j.a.c.a0.g<?> r10 = r0.a
            b.j.a.c.e0.l r11 = r6.w()
            java.lang.String r12 = r9.f2305h
            java.lang.String r10 = r1.a(r10, r11, r12)
            goto L_0x071d
        L_0x06f3:
            boolean r10 = r6.G()
            if (r10 == 0) goto L_0x0706
        L_0x06f9:
            b.j.a.c.a0.g<?> r10 = r0.a
            b.j.a.c.e0.f r11 = r6.y()
            java.lang.String r12 = r9.f2305h
            java.lang.String r10 = r1.b(r10, r11, r12)
            goto L_0x071d
        L_0x0706:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r10 = r6.f1881p
            if (r10 == 0) goto L_0x070c
            r10 = 1
            goto L_0x070d
        L_0x070c:
            r10 = r8
        L_0x070d:
            if (r10 == 0) goto L_0x071c
        L_0x070f:
            b.j.a.c.a0.g<?> r10 = r0.a
            b.j.a.c.e0.i r11 = r6.z()
            java.lang.String r12 = r9.f2305h
            java.lang.String r10 = r1.c(r10, r11, r12)
            goto L_0x071d
        L_0x071c:
            r10 = r7
        L_0x071d:
            if (r10 == 0) goto L_0x0739
            java.lang.String r11 = r9.f2305h
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x0739
            b.j.a.c.t r9 = r6.f1877l
            b.j.a.c.t r9 = r9.f(r10)
            b.j.a.c.t r11 = r6.f1877l
            if (r9 != r11) goto L_0x0732
            goto L_0x073b
        L_0x0732:
            b.j.a.c.e0.a0 r11 = new b.j.a.c.e0.a0
            r11.<init>(r6, r9)
            r6 = r11
            goto L_0x073b
        L_0x0739:
            java.lang.String r10 = r9.f2305h
        L_0x073b:
            java.lang.Object r9 = r2.get(r10)
            b.j.a.c.e0.a0 r9 = (b.j.a.c.e0.a0) r9
            if (r9 != 0) goto L_0x0747
            r2.put(r10, r6)
            goto L_0x074a
        L_0x0747:
            r9.a0(r6)
        L_0x074a:
            java.util.LinkedList<b.j.a.c.e0.a0> r9 = r0.f1967l
            r0.f(r6, r9)
            int r5 = r5 + 1
            goto L_0x069f
        L_0x0753:
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x075b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0788
            java.lang.Object r3 = r1.next()
            b.j.a.c.e0.a0 r3 = (b.j.a.c.e0.a0) r3
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r4 = r3.f1879n
            b.j.a.c.e0.a0$e r4 = r3.Z(r4)
            r3.f1879n = r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1881p
            b.j.a.c.e0.a0$e r4 = r3.Z(r4)
            r3.f1881p = r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r4 = r3.f1882q
            b.j.a.c.e0.a0$e r4 = r3.Z(r4)
            r3.f1882q = r4
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r4 = r3.f1880o
            b.j.a.c.e0.a0$e r4 = r3.Z(r4)
            r3.f1880o = r4
            goto L_0x075b
        L_0x0788:
            b.j.a.c.a0.g<?> r1 = r0.a
            b.j.a.c.p r3 = b.j.a.c.p.USE_WRAPPER_NAME_AS_PROPERTY_NAME
            boolean r1 = r1.o(r3)
            if (r1 == 0) goto L_0x07b9
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x079a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x07b9
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            b.j.a.c.e0.a0 r3 = (b.j.a.c.e0.a0) r3
            b.j.a.c.e0.h r3 = r3.A()
            if (r3 != 0) goto L_0x07b3
            goto L_0x079a
        L_0x07b3:
            b.j.a.c.b r3 = r0.f1962g
            java.util.Objects.requireNonNull(r3)
            goto L_0x079a
        L_0x07b9:
            b.j.a.c.b r1 = r0.f1962g
            b.j.a.c.e0.b r3 = r0.f1961e
            java.lang.Boolean r3 = r1.S(r3)
            if (r3 != 0) goto L_0x07cf
            b.j.a.c.a0.g<?> r3 = r0.a
            java.util.Objects.requireNonNull(r3)
            b.j.a.c.p r4 = b.j.a.c.p.SORT_PROPERTIES_ALPHABETICALLY
            boolean r3 = r3.o(r4)
            goto L_0x07d3
        L_0x07cf:
            boolean r3 = r3.booleanValue()
        L_0x07d3:
            b.j.a.c.e0.b r4 = r0.f1961e
            java.lang.String[] r1 = r1.R(r4)
            if (r3 != 0) goto L_0x07e3
            java.util.LinkedList<b.j.a.c.e0.a0> r4 = r0.f1967l
            if (r4 != 0) goto L_0x07e3
            if (r1 != 0) goto L_0x07e3
            goto L_0x08a2
        L_0x07e3:
            int r4 = r2.size()
            if (r3 == 0) goto L_0x07ef
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            goto L_0x07f6
        L_0x07ef:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r6 = r4 + r4
            r5.<init>(r6)
        L_0x07f6:
            java.util.Collection r6 = r2.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x07fe:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0812
            java.lang.Object r7 = r6.next()
            b.j.a.c.e0.a0 r7 = (b.j.a.c.e0.a0) r7
            java.lang.String r9 = r7.getName()
            r5.put(r9, r7)
            goto L_0x07fe
        L_0x0812:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            int r4 = r4 + r4
            r6.<init>(r4)
            if (r1 == 0) goto L_0x0852
            int r4 = r1.length
        L_0x081b:
            if (r8 >= r4) goto L_0x0852
            r7 = r1[r8]
            java.lang.Object r9 = r5.get(r7)
            b.j.a.c.e0.a0 r9 = (b.j.a.c.e0.a0) r9
            if (r9 != 0) goto L_0x084a
            java.util.Collection r10 = r2.values()
            java.util.Iterator r10 = r10.iterator()
        L_0x082f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x084a
            java.lang.Object r11 = r10.next()
            b.j.a.c.e0.a0 r11 = (b.j.a.c.e0.a0) r11
            b.j.a.c.t r12 = r11.f1878m
            java.lang.String r12 = r12.f2305h
            boolean r12 = r7.equals(r12)
            if (r12 == 0) goto L_0x082f
            java.lang.String r7 = r11.getName()
            r9 = r11
        L_0x084a:
            if (r9 == 0) goto L_0x084f
            r6.put(r7, r9)
        L_0x084f:
            int r8 = r8 + 1
            goto L_0x081b
        L_0x0852:
            java.util.LinkedList<b.j.a.c.e0.a0> r1 = r0.f1967l
            if (r1 == 0) goto L_0x0899
            if (r3 == 0) goto L_0x087b
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            java.util.LinkedList<b.j.a.c.e0.a0> r3 = r0.f1967l
            java.util.Iterator r3 = r3.iterator()
        L_0x0863:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0877
            java.lang.Object r4 = r3.next()
            b.j.a.c.e0.a0 r4 = (b.j.a.c.e0.a0) r4
            java.lang.String r7 = r4.getName()
            r1.put(r7, r4)
            goto L_0x0863
        L_0x0877:
            java.util.Collection r1 = r1.values()
        L_0x087b:
            java.util.Iterator r1 = r1.iterator()
        L_0x087f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0899
            java.lang.Object r3 = r1.next()
            b.j.a.c.e0.a0 r3 = (b.j.a.c.e0.a0) r3
            java.lang.String r4 = r3.getName()
            boolean r7 = r5.containsKey(r4)
            if (r7 == 0) goto L_0x087f
            r6.put(r4, r3)
            goto L_0x087f
        L_0x0899:
            r6.putAll(r5)
            r2.clear()
            r2.putAll(r6)
        L_0x08a2:
            r0.f1966k = r2
            r1 = 1
            r0.f1965j = r1
            return
        L_0x08a8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            java.lang.String r4 = "; expected Class<PropertyNamingStrategy>"
            java.lang.String r1 = b.e.a.a.a.e(r1, r3, r4)
            r2.<init>(r1)
            throw r2
        L_0x08ba:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "AnnotationIntrospector returned PropertyNamingStrategy definition of type "
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            java.lang.String r4 = "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead"
            java.lang.String r1 = b.e.a.a.a.f(r1, r3, r4)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.e0.z.g():void");
    }

    public void h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StringBuilder y = a.y("Problem with definition of ");
        y.append(this.f1961e);
        y.append(": ");
        y.append(str);
        throw new IllegalArgumentException(y.toString());
    }
}
