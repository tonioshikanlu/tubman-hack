package b.j.a.c.e0;

import b.j.a.a.h0;
import b.j.a.a.r;
import b.j.a.a.z;
import b.j.a.c.a0.h;
import b.j.a.c.b;
import b.j.a.c.i;
import b.j.a.c.i0.n;
import b.j.a.c.s;
import b.j.a.c.t;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public class a0 extends r implements Comparable<a0> {
    public static final b.a t = new b.a(b.a.C0049a.MANAGED_REFERENCE, "");

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1874i;

    /* renamed from: j  reason: collision with root package name */
    public final b.j.a.c.a0.g<?> f1875j;

    /* renamed from: k  reason: collision with root package name */
    public final b.j.a.c.b f1876k;

    /* renamed from: l  reason: collision with root package name */
    public final t f1877l;

    /* renamed from: m  reason: collision with root package name */
    public final t f1878m;

    /* renamed from: n  reason: collision with root package name */
    public e<f> f1879n;

    /* renamed from: o  reason: collision with root package name */
    public e<l> f1880o;

    /* renamed from: p  reason: collision with root package name */
    public e<i> f1881p;

    /* renamed from: q  reason: collision with root package name */
    public e<i> f1882q;
    public transient s r;
    public transient b.a s;

    public class a implements g<Class<?>[]> {
        public a() {
        }

        public Object a(h hVar) {
            return a0.this.f1876k.b0(hVar);
        }
    }

    public class b implements g<b.a> {
        public b() {
        }

        public Object a(h hVar) {
            return a0.this.f1876k.N(hVar);
        }
    }

    public class c implements g<Boolean> {
        public c() {
        }

        public Object a(h hVar) {
            return a0.this.f1876k.m0(hVar);
        }
    }

    public class d implements g<y> {
        public d() {
        }

        public Object a(h hVar) {
            y z = a0.this.f1876k.z(hVar);
            return z != null ? a0.this.f1876k.A(hVar, z) : z;
        }
    }

    public static final class e<T> {
        public final T a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f1883b;
        public final t c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f1884e;
        public final boolean f;

        public e(T t, e<T> eVar, t tVar, boolean z, boolean z2, boolean z3) {
            this.a = t;
            this.f1883b = eVar;
            t tVar2 = (tVar == null || tVar.e()) ? null : tVar;
            this.c = tVar2;
            if (z) {
                if (tVar2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                } else if (!tVar.c()) {
                    z = false;
                }
            }
            this.d = z;
            this.f1884e = z2;
            this.f = z3;
        }

        public e<T> a(e<T> eVar) {
            e<T> eVar2 = this.f1883b;
            return eVar2 == null ? c(eVar) : c(eVar2.a(eVar));
        }

        public e<T> b() {
            e<T> eVar = this.f1883b;
            if (eVar == null) {
                return this;
            }
            e<T> b2 = eVar.b();
            if (this.c != null) {
                return b2.c == null ? c((e) null) : c(b2);
            }
            if (b2.c != null) {
                return b2;
            }
            boolean z = this.f1884e;
            return z == b2.f1884e ? c(b2) : z ? c((e) null) : b2;
        }

        public e<T> c(e<T> eVar) {
            if (eVar == this.f1883b) {
                return this;
            }
            return new e(this.a, eVar, this.c, this.d, this.f1884e, this.f);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
            r0 = r0.d();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b.j.a.c.e0.a0.e<T> d() {
            /*
                r2 = this;
                boolean r0 = r2.f
                if (r0 == 0) goto L_0x000f
                b.j.a.c.e0.a0$e<T> r0 = r2.f1883b
                if (r0 != 0) goto L_0x000a
                r0 = 0
                goto L_0x000e
            L_0x000a:
                b.j.a.c.e0.a0$e r0 = r0.d()
            L_0x000e:
                return r0
            L_0x000f:
                b.j.a.c.e0.a0$e<T> r0 = r2.f1883b
                if (r0 == 0) goto L_0x0020
                b.j.a.c.e0.a0$e r0 = r0.d()
                b.j.a.c.e0.a0$e<T> r1 = r2.f1883b
                if (r0 == r1) goto L_0x0020
                b.j.a.c.e0.a0$e r0 = r2.c(r0)
                return r0
            L_0x0020:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.e0.a0.e.d():b.j.a.c.e0.a0$e");
        }

        public e<T> e() {
            return this.f1883b == null ? this : new e(this.a, (e) null, this.c, this.d, this.f1884e, this.f);
        }

        public e<T> f() {
            e<T> eVar = this.f1883b;
            e<T> f2 = eVar == null ? null : eVar.f();
            return this.f1884e ? c(f2) : f2;
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", new Object[]{this.a.toString(), Boolean.valueOf(this.f1884e), Boolean.valueOf(this.f), Boolean.valueOf(this.d)});
            if (this.f1883b == null) {
                return format;
            }
            StringBuilder B = b.e.a.a.a.B(format, ", ");
            B.append(this.f1883b.toString());
            return B.toString();
        }
    }

    public static class f<T extends h> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        public e<T> f1885h;

        public f(e<T> eVar) {
            this.f1885h = eVar;
        }

        public boolean hasNext() {
            return this.f1885h != null;
        }

        public Object next() {
            e<T> eVar = this.f1885h;
            if (eVar != null) {
                h hVar = (h) eVar.a;
                this.f1885h = eVar.f1883b;
                return hVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public interface g<T> {
        T a(h hVar);
    }

    public a0(b.j.a.c.a0.g<?> gVar, b.j.a.c.b bVar, boolean z, t tVar) {
        this.f1875j = gVar;
        this.f1876k = bVar;
        this.f1878m = tVar;
        this.f1877l = tVar;
        this.f1874i = z;
    }

    public a0(b.j.a.c.a0.g<?> gVar, b.j.a.c.b bVar, boolean z, t tVar, t tVar2) {
        this.f1875j = gVar;
        this.f1876k = bVar;
        this.f1878m = tVar;
        this.f1877l = tVar2;
        this.f1874i = z;
    }

    public a0(a0 a0Var, t tVar) {
        this.f1875j = a0Var.f1875j;
        this.f1876k = a0Var.f1876k;
        this.f1878m = a0Var.f1878m;
        this.f1877l = tVar;
        this.f1879n = a0Var.f1879n;
        this.f1880o = a0Var.f1880o;
        this.f1881p = a0Var.f1881p;
        this.f1882q = a0Var.f1882q;
        this.f1874i = a0Var.f1874i;
    }

    public static <T> e<T> c0(e<T> eVar, e<T> eVar2) {
        if (eVar == null) {
            return eVar2;
        }
        if (eVar2 == null) {
            return eVar;
        }
        e<T> eVar3 = eVar.f1883b;
        if (eVar3 != null) {
            eVar2 = eVar3.a(eVar2);
        }
        return eVar.c(eVar2);
    }

    public h A() {
        if (this.f1874i) {
            return v();
        }
        h w = w();
        if (w == null && (w = D()) == null) {
            w = y();
        }
        return w == null ? v() : w;
    }

    public i B() {
        if (this.f1874i) {
            i z = z();
            if (z != null) {
                return z.f();
            }
            f y = y();
            return y == null ? n.o() : y.f();
        }
        a w = w();
        if (w == null) {
            i D = D();
            if (D != null) {
                return D.u(0);
            }
            w = y();
        }
        return (w == null && (w = z()) == null) ? n.o() : w.f();
    }

    public Class<?> C() {
        return B().f2152h;
    }

    public i D() {
        e<i> eVar = this.f1882q;
        if (eVar == null) {
            return null;
        }
        e<T> eVar2 = eVar.f1883b;
        if (eVar2 != null) {
            while (eVar2 != null) {
                Class<?> h2 = ((i) eVar.a).h();
                Class<?> h3 = ((i) eVar2.a).h();
                if (h2 != h3) {
                    if (!h2.isAssignableFrom(h3)) {
                        if (h3.isAssignableFrom(h2)) {
                            continue;
                            eVar2 = eVar2.f1883b;
                        }
                    }
                    eVar = eVar2;
                    eVar2 = eVar2.f1883b;
                }
                i iVar = (i) eVar2.a;
                i iVar2 = (i) eVar.a;
                int Y = Y(iVar);
                int Y2 = Y(iVar2);
                if (Y != Y2) {
                    if (Y >= Y2) {
                        eVar2 = eVar2.f1883b;
                    }
                    eVar = eVar2;
                    eVar2 = eVar2.f1883b;
                } else {
                    b.j.a.c.b bVar = this.f1876k;
                    if (bVar != null) {
                        i p0 = bVar.p0(this.f1875j, iVar2, iVar);
                        if (p0 != iVar2) {
                            if (p0 != iVar) {
                            }
                            eVar = eVar2;
                            eVar2 = eVar2.f1883b;
                        } else {
                            continue;
                            eVar2 = eVar2.f1883b;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", new Object[]{getName(), ((i) eVar.a).i(), ((i) eVar2.a).i()}));
                }
            }
            this.f1882q = eVar.e();
        }
        return (i) eVar.a;
    }

    public t E() {
        b.j.a.c.b bVar;
        if (A() == null || (bVar = this.f1876k) == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public boolean F() {
        return this.f1880o != null;
    }

    public boolean G() {
        return this.f1879n != null;
    }

    public boolean H(t tVar) {
        return this.f1877l.equals(tVar);
    }

    public boolean I() {
        return this.f1882q != null;
    }

    public boolean J() {
        return N(this.f1879n) || N(this.f1881p) || N(this.f1882q) || M(this.f1880o);
    }

    public boolean K() {
        return M(this.f1879n) || M(this.f1881p) || M(this.f1882q) || M(this.f1880o);
    }

    public boolean L() {
        Boolean bool = (Boolean) b0(new c());
        return bool != null && bool.booleanValue();
    }

    public final <T> boolean M(e<T> eVar) {
        while (eVar != null) {
            if (eVar.c != null && eVar.d) {
                return true;
            }
            eVar = eVar.f1883b;
        }
        return false;
    }

    public final <T> boolean N(e<T> eVar) {
        while (eVar != null) {
            t tVar = eVar.c;
            if (tVar != null && tVar.c()) {
                return true;
            }
            eVar = eVar.f1883b;
        }
        return false;
    }

    public final <T> boolean O(e<T> eVar) {
        while (eVar != null) {
            if (eVar.f) {
                return true;
            }
            eVar = eVar.f1883b;
        }
        return false;
    }

    public final <T> boolean P(e<T> eVar) {
        while (eVar != null) {
            if (eVar.f1884e) {
                return true;
            }
            eVar = eVar.f1883b;
        }
        return false;
    }

    public final <T extends h> e<T> Q(e<T> eVar, o oVar) {
        T t2 = (h) ((h) eVar.a).m(oVar);
        e<T> eVar2 = eVar.f1883b;
        if (eVar2 != null) {
            eVar = eVar.c(Q(eVar2, oVar));
        }
        return t2 == eVar.a ? eVar : new e<>(t2, eVar.f1883b, eVar.c, eVar.d, eVar.f1884e, eVar.f);
    }

    public final void R(Collection<t> collection, Map<t, a0> map, e<?> eVar) {
        for (e eVar2 = eVar; eVar2 != null; eVar2 = eVar2.f1883b) {
            t tVar = eVar2.c;
            if (eVar2.d && tVar != null) {
                a0 a0Var = map.get(tVar);
                if (a0Var == null) {
                    a0Var = new a0(this.f1875j, this.f1876k, this.f1874i, this.f1878m, tVar);
                    map.put(tVar, a0Var);
                }
                if (eVar == this.f1879n) {
                    a0Var.f1879n = eVar2.c(a0Var.f1879n);
                } else if (eVar == this.f1881p) {
                    a0Var.f1881p = eVar2.c(a0Var.f1881p);
                } else if (eVar == this.f1882q) {
                    a0Var.f1882q = eVar2.c(a0Var.f1882q);
                } else if (eVar == this.f1880o) {
                    a0Var.f1880o = eVar2.c(a0Var.f1880o);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (eVar2.f1884e) {
                StringBuilder y = b.e.a.a.a.y("Conflicting/ambiguous property name definitions (implicit name '");
                y.append(this.f1877l);
                y.append("'): found multiple explicit names: ");
                y.append(collection);
                y.append(", but also implicit accessor: ");
                y.append(eVar2);
                throw new IllegalStateException(y.toString());
            }
        }
    }

    public final Set<t> S(e<? extends h> eVar, Set<t> set) {
        e<T> eVar2;
        while (eVar2 != null) {
            if (eVar2.d && eVar2.c != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(eVar2.c);
            }
            e<T> eVar3 = eVar2.f1883b;
            eVar2 = eVar;
            eVar2 = eVar3;
        }
        return set;
    }

    public final <T extends h> o T(e<T> eVar) {
        o oVar = ((h) eVar.a).f1909i;
        e<T> eVar2 = eVar.f1883b;
        return eVar2 != null ? o.c(oVar, T(eVar2)) : oVar;
    }

    public int U(i iVar) {
        String d2 = iVar.d();
        if (!d2.startsWith("get") || d2.length() <= 3) {
            return (!d2.startsWith("is") || d2.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public final o V(int i2, e<? extends h>... eVarArr) {
        e<? extends h> eVar = eVarArr[i2];
        o oVar = ((h) eVar.a).f1909i;
        e<T> eVar2 = eVar.f1883b;
        if (eVar2 != null) {
            oVar = o.c(oVar, T(eVar2));
        }
        do {
            i2++;
            if (i2 >= eVarArr.length) {
                return oVar;
            }
        } while (eVarArr[i2] == null);
        return o.c(oVar, V(i2, eVarArr));
    }

    public final <T> e<T> W(e<T> eVar) {
        return eVar == null ? eVar : eVar.d();
    }

    public final <T> e<T> X(e<T> eVar) {
        return eVar == null ? eVar : eVar.f();
    }

    public int Y(i iVar) {
        String d2 = iVar.d();
        return (!d2.startsWith("set") || d2.length() <= 3) ? 2 : 1;
    }

    public final <T> e<T> Z(e<T> eVar) {
        return eVar == null ? eVar : eVar.b();
    }

    public void a0(a0 a0Var) {
        this.f1879n = c0(this.f1879n, a0Var.f1879n);
        this.f1880o = c0(this.f1880o, a0Var.f1880o);
        this.f1881p = c0(this.f1881p, a0Var.f1881p);
        this.f1882q = c0(this.f1882q, a0Var.f1882q);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r2.f1879n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 != null) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T b0(b.j.a.c.e0.a0.g<T> r3) {
        /*
            r2 = this;
            b.j.a.c.b r0 = r2.f1876k
            r1 = 0
            if (r0 == 0) goto L_0x0036
            boolean r0 = r2.f1874i
            if (r0 == 0) goto L_0x000e
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r0 = r2.f1881p
            if (r0 == 0) goto L_0x0028
            goto L_0x0020
        L_0x000e:
            b.j.a.c.e0.a0$e<b.j.a.c.e0.l> r0 = r2.f1880o
            if (r0 == 0) goto L_0x001a
            T r0 = r0.a
            b.j.a.c.e0.h r0 = (b.j.a.c.e0.h) r0
            java.lang.Object r1 = r3.a(r0)
        L_0x001a:
            if (r1 != 0) goto L_0x0028
            b.j.a.c.e0.a0$e<b.j.a.c.e0.i> r0 = r2.f1882q
            if (r0 == 0) goto L_0x0028
        L_0x0020:
            T r0 = r0.a
            b.j.a.c.e0.h r0 = (b.j.a.c.e0.h) r0
            java.lang.Object r1 = r3.a(r0)
        L_0x0028:
            if (r1 != 0) goto L_0x0036
            b.j.a.c.e0.a0$e<b.j.a.c.e0.f> r0 = r2.f1879n
            if (r0 == 0) goto L_0x0036
            T r0 = r0.a
            b.j.a.c.e0.h r0 = (b.j.a.c.e0.h) r0
            java.lang.Object r1 = r3.a(r0)
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.e0.a0.b0(b.j.a.c.e0.a0$g):java.lang.Object");
    }

    public int compareTo(Object obj) {
        a0 a0Var = (a0) obj;
        if (this.f1880o != null) {
            if (a0Var.f1880o == null) {
                return -1;
            }
        } else if (a0Var.f1880o != null) {
            return 1;
        }
        return getName().compareTo(a0Var.getName());
    }

    public String getName() {
        t tVar = this.f1877l;
        if (tVar == null) {
            return null;
        }
        return tVar.f2305h;
    }

    public t h() {
        return this.f1877l;
    }

    public s l() {
        s sVar;
        boolean z;
        h0 h0Var;
        h0 h0Var2;
        Boolean u;
        if (this.r == null) {
            Boolean bool = (Boolean) b0(new b0(this));
            String str = (String) b0(new c0(this));
            Integer num = (Integer) b0(new d0(this));
            String str2 = (String) b0(new e0(this));
            if (bool == null && num == null && str2 == null) {
                sVar = s.f2294q;
                if (str != null) {
                    sVar = new s(sVar.f2295h, str, sVar.f2297j, sVar.f2298k, sVar.f2299l, sVar.f2300m, sVar.f2301n);
                }
            } else {
                sVar = s.a(bool, str, num, str2);
            }
            this.r = sVar;
            if (!this.f1874i) {
                s sVar2 = this.r;
                h A = A();
                h v = v();
                if (A != null) {
                    b.j.a.c.b bVar = this.f1876k;
                    if (bVar != null) {
                        z = false;
                        if (v == null || (u = bVar.u(A)) == null) {
                            z = true;
                        } else if (u.booleanValue()) {
                            sVar2 = sVar2.b(new s.a(v, false));
                        }
                        z.a V = this.f1876k.V(A);
                        if (V != null) {
                            h0Var = V.b();
                            h0Var2 = V.a();
                            if (z || h0Var == null || h0Var2 == null) {
                                this.f1875j.f(C());
                            }
                        }
                    } else {
                        z = true;
                    }
                    h0Var2 = null;
                    h0Var = null;
                    this.f1875j.f(C());
                } else {
                    z = true;
                    h0Var2 = null;
                    h0Var = null;
                }
                if (z || h0Var == null || h0Var2 == null) {
                    z.a aVar = ((h) this.f1875j).f1616q.f1596i;
                    if (h0Var == null) {
                        h0Var = aVar.b();
                    }
                    if (h0Var2 == null) {
                        h0Var2 = aVar.a();
                    }
                    if (z) {
                        Objects.requireNonNull(((h) this.f1875j).f1616q);
                        if (Boolean.TRUE.equals((Object) null) && v != null) {
                            sVar2 = sVar2.b(new s.a(v, true));
                        }
                    }
                }
                h0 h0Var3 = h0Var2;
                h0 h0Var4 = h0Var;
                if (!(h0Var4 == null && h0Var3 == null)) {
                    sVar2 = new s(sVar2.f2295h, sVar2.f2296i, sVar2.f2297j, sVar2.f2298k, sVar2.f2299l, h0Var4, h0Var3);
                }
                this.r = sVar2;
            }
        }
        return this.r;
    }

    public boolean n() {
        return (this.f1880o == null && this.f1882q == null && this.f1879n == null) ? false : true;
    }

    public boolean p() {
        return (this.f1881p == null && this.f1879n == null) ? false : true;
    }

    public r.b r() {
        h v = v();
        b.j.a.c.b bVar = this.f1876k;
        r.b K = bVar == null ? null : bVar.K(v);
        if (K != null) {
            return K;
        }
        r.b bVar2 = r.b.f1352l;
        return r.b.f1352l;
    }

    public y s() {
        return (y) b0(new d());
    }

    public b.a t() {
        b.a aVar = t;
        b.a aVar2 = this.s;
        if (aVar2 == null) {
            b.a aVar3 = (b.a) b0(new b());
            if (aVar3 != null) {
                aVar = aVar3;
            }
            this.s = aVar;
            return aVar3;
        } else if (aVar2 == aVar) {
            return null;
        } else {
            return aVar2;
        }
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("[Property '");
        y.append(this.f1877l);
        y.append("'; ctors: ");
        y.append(this.f1880o);
        y.append(", field(s): ");
        y.append(this.f1879n);
        y.append(", getter(s): ");
        y.append(this.f1881p);
        y.append(", setter(s): ");
        y.append(this.f1882q);
        y.append("]");
        return y.toString();
    }

    public Class<?>[] u() {
        return (Class[]) b0(new a());
    }

    public l w() {
        e eVar = this.f1880o;
        if (eVar == null) {
            return null;
        }
        do {
            T t2 = eVar.a;
            if (((l) t2).f1923j instanceof d) {
                return (l) t2;
            }
            eVar = eVar.f1883b;
        } while (eVar != null);
        return (l) this.f1880o.a;
    }

    public Iterator<l> x() {
        e<l> eVar = this.f1880o;
        if (eVar == null) {
            return b.j.a.c.j0.g.c;
        }
        return new f(eVar);
    }

    public f y() {
        f fVar;
        e eVar = this.f1879n;
        if (eVar == null) {
            return null;
        }
        f fVar2 = (f) eVar.a;
        while (true) {
            eVar = eVar.f1883b;
            if (eVar != null) {
                fVar = (f) eVar.a;
                Class<?> h2 = fVar2.h();
                Class<?> h3 = fVar.h();
                if (h2 != h3) {
                    if (!h2.isAssignableFrom(h3)) {
                        if (!h3.isAssignableFrom(h2)) {
                            break;
                        }
                    } else {
                        fVar2 = fVar;
                    }
                } else {
                    break;
                }
            } else {
                return fVar2;
            }
        }
        StringBuilder y = b.e.a.a.a.y("Multiple fields representing property \"");
        y.append(getName());
        y.append("\": ");
        y.append(fVar2.i());
        y.append(" vs ");
        y.append(fVar.i());
        throw new IllegalArgumentException(y.toString());
    }

    public i z() {
        e<i> eVar = this.f1881p;
        if (eVar == null) {
            return null;
        }
        e<T> eVar2 = eVar.f1883b;
        if (eVar2 != null) {
            while (eVar2 != null) {
                Class<?> h2 = ((i) eVar.a).h();
                Class<?> h3 = ((i) eVar2.a).h();
                if (h2 != h3) {
                    if (!h2.isAssignableFrom(h3)) {
                        if (h3.isAssignableFrom(h2)) {
                            continue;
                            eVar2 = eVar2.f1883b;
                        }
                    }
                    eVar = eVar2;
                    eVar2 = eVar2.f1883b;
                }
                int U = U((i) eVar2.a);
                int U2 = U((i) eVar.a);
                if (U != U2) {
                    if (U >= U2) {
                        eVar2 = eVar2.f1883b;
                    }
                    eVar = eVar2;
                    eVar2 = eVar2.f1883b;
                } else {
                    StringBuilder y = b.e.a.a.a.y("Conflicting getter definitions for property \"");
                    y.append(getName());
                    y.append("\": ");
                    y.append(((i) eVar.a).i());
                    y.append(" vs ");
                    y.append(((i) eVar2.a).i());
                    throw new IllegalArgumentException(y.toString());
                }
            }
            this.f1881p = eVar.e();
        }
        return (i) eVar.a;
    }
}
