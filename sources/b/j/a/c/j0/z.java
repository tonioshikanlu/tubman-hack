package b.j.a.c.j0;

import b.j.a.b.f;
import b.j.a.b.g;
import b.j.a.b.h;
import b.j.a.b.i;
import b.j.a.b.k;
import b.j.a.b.l;
import b.j.a.b.m;
import b.j.a.b.o;
import b.j.a.b.q.c;
import b.j.a.b.t.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.TreeMap;

public class z extends f {
    public static final int w = f.a.d();

    /* renamed from: i  reason: collision with root package name */
    public m f2255i;

    /* renamed from: j  reason: collision with root package name */
    public k f2256j;

    /* renamed from: k  reason: collision with root package name */
    public int f2257k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2258l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2259m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2260n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2261o;

    /* renamed from: p  reason: collision with root package name */
    public b f2262p;

    /* renamed from: q  reason: collision with root package name */
    public b f2263q;
    public int r;
    public Object s;
    public Object t;
    public boolean u;
    public e v;

    public static final class a extends c {
        public g A = null;
        public m s;
        public final boolean t;
        public final boolean u;
        public b v;
        public int w;
        public a0 x;
        public boolean y;
        public transient b.j.a.b.w.c z;

        public a(b bVar, m mVar, boolean z2, boolean z3, k kVar) {
            super(0);
            a0 a0Var;
            this.v = bVar;
            this.w = -1;
            this.s = mVar;
            if (kVar != null) {
                a0Var = new a0(kVar, (g) null);
            }
            this.x = a0Var;
            this.t = z2;
            this.u = z3;
        }

        public int A0() {
            return 0;
        }

        public g B0() {
            return Y();
        }

        public Object C0() {
            return b.b(this.v, this.w);
        }

        public BigInteger H() {
            Number t0 = t0();
            return t0 instanceof BigInteger ? (BigInteger) t0 : s0() == i.b.BIG_DECIMAL ? ((BigDecimal) t0).toBigInteger() : BigInteger.valueOf(t0.longValue());
        }

        public boolean K0() {
            return false;
        }

        public byte[] N(b.j.a.b.a aVar) {
            if (this.f1459i == l.VALUE_EMBEDDED_OBJECT) {
                Object s1 = s1();
                if (s1 instanceof byte[]) {
                    return (byte[]) s1;
                }
            }
            if (this.f1459i == l.VALUE_STRING) {
                String x0 = x0();
                if (x0 == null) {
                    return null;
                }
                b.j.a.b.w.c cVar = this.z;
                if (cVar == null) {
                    cVar = new b.j.a.b.w.c((b.j.a.b.w.a) null, 100);
                    this.z = cVar;
                } else {
                    cVar.H();
                }
                b1(x0, cVar, aVar);
                return cVar.N();
            }
            StringBuilder y2 = b.e.a.a.a.y("Current token (");
            y2.append(this.f1459i);
            y2.append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            throw new h(this, y2.toString());
        }

        public boolean Q0() {
            if (this.f1459i != l.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object s1 = s1();
            if (s1 instanceof Double) {
                Double d = (Double) s1;
                return d.isNaN() || d.isInfinite();
            } else if (!(s1 instanceof Float)) {
                return false;
            } else {
                Float f = (Float) s1;
                return f.isNaN() || f.isInfinite();
            }
        }

        public String R0() {
            b bVar;
            l lVar;
            if (!this.y && (bVar = this.v) != null) {
                int i2 = this.w + 1;
                if (i2 < 16 && bVar.k(i2) == (lVar = l.FIELD_NAME)) {
                    this.w = i2;
                    this.f1459i = lVar;
                    Object obj = this.v.c[i2];
                    String obj2 = obj instanceof String ? (String) obj : obj.toString();
                    this.x.f2199e = obj2;
                    return obj2;
                } else if (T0() == l.FIELD_NAME) {
                    return e0();
                }
            }
            return null;
        }

        public m S() {
            return this.s;
        }

        public l T0() {
            b bVar;
            a0 a0Var;
            if (this.y || (bVar = this.v) == null) {
                return null;
            }
            int i2 = this.w + 1;
            this.w = i2;
            if (i2 >= 16) {
                this.w = 0;
                b bVar2 = bVar.a;
                this.v = bVar2;
                if (bVar2 == null) {
                    return null;
                }
            }
            l k2 = this.v.k(this.w);
            this.f1459i = k2;
            if (k2 == l.FIELD_NAME) {
                Object s1 = s1();
                this.x.f2199e = s1 instanceof String ? (String) s1 : s1.toString();
            } else {
                if (k2 == l.START_OBJECT) {
                    a0 a0Var2 = this.x;
                    Objects.requireNonNull(a0Var2);
                    a0Var = new a0(a0Var2, 2, -1);
                } else if (k2 == l.START_ARRAY) {
                    a0 a0Var3 = this.x;
                    Objects.requireNonNull(a0Var3);
                    a0Var = new a0(a0Var3, 1, -1);
                } else if (k2 == l.END_OBJECT || k2 == l.END_ARRAY) {
                    a0 a0Var4 = this.x;
                    k kVar = a0Var4.c;
                    a0Var = kVar instanceof a0 ? (a0) kVar : kVar == null ? new a0() : new a0(kVar, a0Var4.d);
                }
                this.x = a0Var;
            }
            return this.f1459i;
        }

        public int W0(b.j.a.b.a aVar, OutputStream outputStream) {
            byte[] N = N(aVar);
            if (N == null) {
                return 0;
            }
            outputStream.write(N, 0, N.length);
            return N.length;
        }

        public g Y() {
            g gVar = this.A;
            return gVar == null ? g.f1410m : gVar;
        }

        public boolean b() {
            return this.u;
        }

        public void close() {
            if (!this.y) {
                this.y = true;
            }
        }

        public void d1() {
            b.j.a.b.w.m.a();
            throw null;
        }

        public boolean e() {
            return this.t;
        }

        public String e0() {
            l lVar = this.f1459i;
            if (lVar == l.START_OBJECT || lVar == l.START_ARRAY) {
                return this.x.c.a();
            }
            return this.x.f2199e;
        }

        public BigDecimal m0() {
            Number t0 = t0();
            if (t0 instanceof BigDecimal) {
                return (BigDecimal) t0;
            }
            int ordinal = s0().ordinal();
            return (ordinal == 0 || ordinal == 1) ? BigDecimal.valueOf(t0.longValue()) : ordinal != 2 ? BigDecimal.valueOf(t0.doubleValue()) : new BigDecimal((BigInteger) t0);
        }

        public double n0() {
            return t0().doubleValue();
        }

        public Object o0() {
            if (this.f1459i == l.VALUE_EMBEDDED_OBJECT) {
                return s1();
            }
            return null;
        }

        public float p0() {
            return t0().floatValue();
        }

        public int q0() {
            Number t0 = this.f1459i == l.VALUE_NUMBER_INT ? (Number) s1() : t0();
            if (!(t0 instanceof Integer)) {
                if (!((t0 instanceof Short) || (t0 instanceof Byte))) {
                    if (t0 instanceof Long) {
                        long longValue = t0.longValue();
                        int i2 = (int) longValue;
                        if (((long) i2) == longValue) {
                            return i2;
                        }
                        n1();
                        throw null;
                    }
                    if (t0 instanceof BigInteger) {
                        BigInteger bigInteger = (BigInteger) t0;
                        if (c.f1452k.compareTo(bigInteger) > 0 || c.f1453l.compareTo(bigInteger) < 0) {
                            n1();
                            throw null;
                        }
                    } else if ((t0 instanceof Double) || (t0 instanceof Float)) {
                        double doubleValue = t0.doubleValue();
                        if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                            return (int) doubleValue;
                        }
                        n1();
                        throw null;
                    } else if (t0 instanceof BigDecimal) {
                        BigDecimal bigDecimal = (BigDecimal) t0;
                        if (c.f1458q.compareTo(bigDecimal) > 0 || c.r.compareTo(bigDecimal) < 0) {
                            n1();
                            throw null;
                        }
                    } else {
                        b.j.a.b.w.m.a();
                        throw null;
                    }
                    return t0.intValue();
                }
            }
            return t0.intValue();
        }

        public long r0() {
            Number t0 = this.f1459i == l.VALUE_NUMBER_INT ? (Number) s1() : t0();
            if (!(t0 instanceof Long)) {
                if (!((t0 instanceof Integer) || (t0 instanceof Short) || (t0 instanceof Byte))) {
                    if (t0 instanceof BigInteger) {
                        BigInteger bigInteger = (BigInteger) t0;
                        if (c.f1454m.compareTo(bigInteger) > 0 || c.f1455n.compareTo(bigInteger) < 0) {
                            p1();
                            throw null;
                        }
                    } else if ((t0 instanceof Double) || (t0 instanceof Float)) {
                        double doubleValue = t0.doubleValue();
                        if (doubleValue >= -9.223372036854776E18d && doubleValue <= 9.223372036854776E18d) {
                            return (long) doubleValue;
                        }
                        p1();
                        throw null;
                    } else if (t0 instanceof BigDecimal) {
                        BigDecimal bigDecimal = (BigDecimal) t0;
                        if (c.f1456o.compareTo(bigDecimal) > 0 || c.f1457p.compareTo(bigDecimal) < 0) {
                            p1();
                            throw null;
                        }
                    } else {
                        b.j.a.b.w.m.a();
                        throw null;
                    }
                    return t0.longValue();
                }
            }
            return t0.longValue();
        }

        public i.b s0() {
            i.b bVar = i.b.INT;
            Number t0 = t0();
            if (t0 instanceof Integer) {
                return bVar;
            }
            if (t0 instanceof Long) {
                return i.b.LONG;
            }
            if (t0 instanceof Double) {
                return i.b.DOUBLE;
            }
            if (t0 instanceof BigDecimal) {
                return i.b.BIG_DECIMAL;
            }
            if (t0 instanceof BigInteger) {
                return i.b.BIG_INTEGER;
            }
            if (t0 instanceof Float) {
                return i.b.FLOAT;
            }
            if (t0 instanceof Short) {
                return bVar;
            }
            return null;
        }

        public final Object s1() {
            b bVar = this.v;
            return bVar.c[this.w];
        }

        public final Number t0() {
            l lVar = this.f1459i;
            if (lVar == null || !lVar.f1444n) {
                StringBuilder y2 = b.e.a.a.a.y("Current token (");
                y2.append(this.f1459i);
                y2.append(") not numeric, cannot use numeric value accessors");
                throw new h(this, y2.toString());
            }
            Object s1 = s1();
            if (s1 instanceof Number) {
                return (Number) s1;
            }
            if (s1 instanceof String) {
                String str = (String) s1;
                return str.indexOf(46) >= 0 ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
            } else if (s1 == null) {
                return null;
            } else {
                StringBuilder y3 = b.e.a.a.a.y("Internal error: entry should be a Number, but is of type ");
                y3.append(s1.getClass().getName());
                throw new IllegalStateException(y3.toString());
            }
        }

        public Object u0() {
            return b.a(this.v, this.w);
        }

        public k v0() {
            return this.x;
        }

        public String x0() {
            l lVar = this.f1459i;
            if (lVar == l.VALUE_STRING || lVar == l.FIELD_NAME) {
                Object s1 = s1();
                if (s1 instanceof String) {
                    return (String) s1;
                }
                Annotation[] annotationArr = g.a;
                if (s1 == null) {
                    return null;
                }
                return s1.toString();
            } else if (lVar == null) {
                return null;
            } else {
                int ordinal = lVar.ordinal();
                if (ordinal != 8 && ordinal != 9) {
                    return this.f1459i.f1438h;
                }
                Object s12 = s1();
                Annotation[] annotationArr2 = g.a;
                if (s12 == null) {
                    return null;
                }
                return s12.toString();
            }
        }

        public char[] y0() {
            String x0 = x0();
            if (x0 == null) {
                return null;
            }
            return x0.toCharArray();
        }

        public int z0() {
            String x0 = x0();
            if (x0 == null) {
                return 0;
            }
            return x0.length();
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final l[] f2264e;
        public b a;

        /* renamed from: b  reason: collision with root package name */
        public long f2265b;
        public final Object[] c = new Object[16];
        public TreeMap<Integer, Object> d;

        static {
            l[] lVarArr = new l[16];
            f2264e = lVarArr;
            System.arraycopy(l.values(), 1, lVarArr, 1, Math.min(15, 12));
        }

        public static Object a(b bVar, int i2) {
            TreeMap<Integer, Object> treeMap = bVar.d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i2 + i2 + 1));
        }

        public static Object b(b bVar, int i2) {
            TreeMap<Integer, Object> treeMap = bVar.d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i2 + i2));
        }

        public b c(int i2, l lVar) {
            if (i2 < 16) {
                long ordinal = (long) lVar.ordinal();
                if (i2 > 0) {
                    ordinal <<= i2 << 2;
                }
                this.f2265b |= ordinal;
                return null;
            }
            b bVar = new b();
            this.a = bVar;
            bVar.f2265b = ((long) lVar.ordinal()) | bVar.f2265b;
            return this.a;
        }

        public b d(int i2, l lVar, Object obj) {
            if (i2 < 16) {
                h(i2, lVar, obj);
                return null;
            }
            b bVar = new b();
            this.a = bVar;
            bVar.h(0, lVar, obj);
            return this.a;
        }

        public b e(int i2, l lVar, Object obj, Object obj2) {
            if (i2 < 16) {
                i(i2, lVar, obj, obj2);
                return null;
            }
            b bVar = new b();
            this.a = bVar;
            bVar.i(0, lVar, obj, obj2);
            return this.a;
        }

        public b f(int i2, l lVar, Object obj, Object obj2, Object obj3) {
            if (i2 < 16) {
                j(i2, lVar, obj, obj2, obj3);
                return null;
            }
            b bVar = new b();
            this.a = bVar;
            bVar.j(0, lVar, obj, obj2, obj3);
            return this.a;
        }

        public final void g(int i2, Object obj, Object obj2) {
            if (this.d == null) {
                this.d = new TreeMap<>();
            }
            if (obj != null) {
                this.d.put(Integer.valueOf(i2 + i2 + 1), obj);
            }
            if (obj2 != null) {
                this.d.put(Integer.valueOf(i2 + i2), obj2);
            }
        }

        public final void h(int i2, l lVar, Object obj) {
            this.c[i2] = obj;
            long ordinal = (long) lVar.ordinal();
            if (i2 > 0) {
                ordinal <<= i2 << 2;
            }
            this.f2265b |= ordinal;
        }

        public final void i(int i2, l lVar, Object obj, Object obj2) {
            long ordinal = (long) lVar.ordinal();
            if (i2 > 0) {
                ordinal <<= i2 << 2;
            }
            this.f2265b = ordinal | this.f2265b;
            g(i2, obj, obj2);
        }

        public final void j(int i2, l lVar, Object obj, Object obj2, Object obj3) {
            this.c[i2] = obj;
            long ordinal = (long) lVar.ordinal();
            if (i2 > 0) {
                ordinal <<= i2 << 2;
            }
            this.f2265b = ordinal | this.f2265b;
            g(i2, obj2, obj3);
        }

        public l k(int i2) {
            long j2 = this.f2265b;
            if (i2 > 0) {
                j2 >>= i2 << 2;
            }
            return f2264e[((int) j2) & 15];
        }
    }

    public z(i iVar, b.j.a.c.g gVar) {
        boolean z = false;
        this.u = false;
        this.f2255i = iVar.S();
        this.f2256j = iVar.v0();
        this.f2257k = w;
        this.v = e.m((b.j.a.b.t.b) null);
        b bVar = new b();
        this.f2263q = bVar;
        this.f2262p = bVar;
        this.r = 0;
        this.f2258l = iVar.e();
        boolean b2 = iVar.b();
        this.f2259m = b2;
        this.f2260n = b2 | this.f2258l;
        this.f2261o = gVar != null ? gVar.O(b.j.a.c.h.USE_BIG_DECIMAL_FOR_FLOATS) : z;
    }

    public z(m mVar, boolean z) {
        this.u = false;
        this.f2255i = null;
        this.f2257k = w;
        this.v = e.m((b.j.a.b.t.b) null);
        b bVar = new b();
        this.f2263q = bVar;
        this.f2262p = bVar;
        this.r = 0;
        this.f2258l = z;
        this.f2259m = z;
        this.f2260n = z | z;
    }

    public static z c1(i iVar) {
        z zVar = new z(iVar, (b.j.a.c.g) null);
        zVar.g1(iVar);
        return zVar;
    }

    public void A0(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            X0(l.VALUE_NULL);
        } else {
            Y0(l.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public void B0(BigInteger bigInteger) {
        if (bigInteger == null) {
            X0(l.VALUE_NULL);
        } else {
            Y0(l.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public void C0(short s2) {
        Y0(l.VALUE_NUMBER_INT, Short.valueOf(s2));
    }

    public void D0(Object obj) {
        if (obj == null) {
            X0(l.VALUE_NULL);
        } else if (obj.getClass() == byte[].class || (obj instanceof v)) {
            Y0(l.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            m mVar = this.f2255i;
            if (mVar == null) {
                Y0(l.VALUE_EMBEDDED_OBJECT, obj);
            } else {
                mVar.a(this, obj);
            }
        }
    }

    public void E0(Object obj) {
        this.t = obj;
        this.u = true;
    }

    public void F0(char c) {
        a1();
        throw null;
    }

    public void G0(o oVar) {
        a1();
        throw null;
    }

    public f H(f.a aVar) {
        this.f2257k = (~aVar.f1409i) & this.f2257k;
        return this;
    }

    public void H0(String str) {
        a1();
        throw null;
    }

    public void I0(char[] cArr, int i2, int i3) {
        a1();
        throw null;
    }

    public void K0(String str) {
        Y0(l.VALUE_EMBEDDED_OBJECT, new v(str));
    }

    public final void L0() {
        this.v.p();
        U0(l.START_ARRAY);
        this.v = this.v.j();
    }

    public int N() {
        return this.f2257k;
    }

    public final void N0() {
        this.v.p();
        U0(l.START_OBJECT);
        this.v = this.v.k();
    }

    public k O() {
        return this.v;
    }

    public void O0(Object obj) {
        this.v.p();
        U0(l.START_OBJECT);
        e k2 = this.v.k();
        this.v = k2;
        if (obj != null) {
            k2.f1512g = obj;
        }
    }

    public void P0(o oVar) {
        if (oVar == null) {
            X0(l.VALUE_NULL);
        } else {
            Y0(l.VALUE_STRING, oVar);
        }
    }

    public void Q0(String str) {
        if (str == null) {
            X0(l.VALUE_NULL);
        } else {
            Y0(l.VALUE_STRING, str);
        }
    }

    public void R0(char[] cArr, int i2, int i3) {
        Q0(new String(cArr, i2, i3));
    }

    public f S(int i2, int i3) {
        this.f2257k = (i2 & i3) | (this.f2257k & (~i3));
        return this;
    }

    public void T0(Object obj) {
        this.s = obj;
        this.u = true;
    }

    public final void U0(l lVar) {
        b e2 = this.u ? this.f2263q.e(this.r, lVar, this.t, this.s) : this.f2263q.c(this.r, lVar);
        if (e2 == null) {
            this.r++;
            return;
        }
        this.f2263q = e2;
        this.r = 1;
    }

    public final void V0(l lVar, Object obj) {
        b bVar;
        if (this.u) {
            bVar = this.f2263q.f(this.r, lVar, obj, this.t, this.s);
        } else {
            bVar = this.f2263q.d(this.r, lVar, obj);
        }
        if (bVar == null) {
            this.r++;
            return;
        }
        this.f2263q = bVar;
        this.r = 1;
    }

    public final void W0(StringBuilder sb) {
        Object a2 = b.a(this.f2263q, this.r - 1);
        if (a2 != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(a2));
            sb.append(']');
        }
        Object b2 = b.b(this.f2263q, this.r - 1);
        if (b2 != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(b2));
            sb.append(']');
        }
    }

    public final void X0(l lVar) {
        this.v.p();
        b e2 = this.u ? this.f2263q.e(this.r, lVar, this.t, this.s) : this.f2263q.c(this.r, lVar);
        if (e2 == null) {
            this.r++;
            return;
        }
        this.f2263q = e2;
        this.r = 1;
    }

    public final void Y0(l lVar, Object obj) {
        b bVar;
        this.v.p();
        if (this.u) {
            bVar = this.f2263q.f(this.r, lVar, obj, this.t, this.s);
        } else {
            bVar = this.f2263q.d(this.r, lVar, obj);
        }
        if (bVar == null) {
            this.r++;
            return;
        }
        this.f2263q = bVar;
        this.r = 1;
    }

    public final void Z0(i iVar) {
        Object C0 = iVar.C0();
        this.s = C0;
        if (C0 != null) {
            this.u = true;
        }
        Object u0 = iVar.u0();
        this.t = u0;
        if (u0 != null) {
            this.u = true;
        }
    }

    public void a1() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public z b1(z zVar) {
        if (!this.f2258l) {
            this.f2258l = zVar.f2258l;
        }
        if (!this.f2259m) {
            this.f2259m = zVar.f2259m;
        }
        this.f2260n = this.f2258l | this.f2259m;
        i d1 = zVar.d1();
        while (d1.T0() != null) {
            g1(d1);
        }
        return this;
    }

    public void close() {
    }

    public i d1() {
        return new a(this.f2262p, this.f2255i, this.f2258l, this.f2259m, this.f2256j);
    }

    public boolean e() {
        return true;
    }

    @Deprecated
    public f e0(int i2) {
        this.f2257k = i2;
        return this;
    }

    public i e1(i iVar) {
        a aVar = new a(this.f2262p, iVar.S(), this.f2258l, this.f2259m, this.f2256j);
        aVar.A = iVar.B0();
        return aVar;
    }

    public i f1() {
        a aVar = new a(this.f2262p, this.f2255i, this.f2258l, this.f2259m, this.f2256j);
        aVar.T0();
        return aVar;
    }

    public void flush() {
    }

    public f g0() {
        return this;
    }

    public void g1(i iVar) {
        l g0 = iVar.g0();
        if (g0 == l.FIELD_NAME) {
            if (this.f2260n) {
                Z0(iVar);
            }
            t0(iVar.e0());
            g0 = iVar.T0();
        }
        if (this.f2260n) {
            Z0(iVar);
        }
        int ordinal = g0.ordinal();
        boolean z = true;
        if (ordinal == 1) {
            N0();
            while (iVar.T0() != l.END_OBJECT) {
                g1(iVar);
            }
            r0();
        } else if (ordinal != 3) {
            if (this.f2260n) {
                Z0(iVar);
            }
            switch (iVar.g0().ordinal()) {
                case 1:
                    N0();
                    return;
                case 2:
                    r0();
                    return;
                case 3:
                    L0();
                    return;
                case 4:
                    q0();
                    return;
                case 5:
                    t0(iVar.e0());
                    return;
                case 6:
                    D0(iVar.o0());
                    return;
                case 7:
                    if (iVar.K0()) {
                        R0(iVar.y0(), iVar.A0(), iVar.z0());
                        return;
                    } else {
                        Q0(iVar.x0());
                        return;
                    }
                case 8:
                    int ordinal2 = iVar.s0().ordinal();
                    if (ordinal2 == 0) {
                        x0(iVar.q0());
                        return;
                    } else if (ordinal2 != 2) {
                        y0(iVar.r0());
                        return;
                    } else {
                        B0(iVar.H());
                        return;
                    }
                case 9:
                    if (!this.f2261o) {
                        int ordinal3 = iVar.s0().ordinal();
                        if (ordinal3 == 3) {
                            w0(iVar.p0());
                            return;
                        } else if (ordinal3 != 5) {
                            v0(iVar.n0());
                            return;
                        }
                    }
                    A0(iVar.m0());
                    return;
                case 10:
                    break;
                case 11:
                    z = false;
                    break;
                case 12:
                    X0(l.VALUE_NULL);
                    return;
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
            o0(z);
        } else {
            L0();
            while (iVar.T0() != l.END_ARRAY) {
                g1(iVar);
            }
            q0();
        }
    }

    public int k0(b.j.a.b.a aVar, InputStream inputStream, int i2) {
        throw new UnsupportedOperationException();
    }

    public void m0(b.j.a.b.a aVar, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        D0(bArr2);
    }

    public void o0(boolean z) {
        X0(z ? l.VALUE_TRUE : l.VALUE_FALSE);
    }

    public void p0(Object obj) {
        Y0(l.VALUE_EMBEDDED_OBJECT, obj);
    }

    public boolean q() {
        return this.f2259m;
    }

    public final void q0() {
        U0(l.END_ARRAY);
        e eVar = this.v.c;
        if (eVar != null) {
            this.v = eVar;
        }
    }

    public final void r0() {
        U0(l.END_OBJECT);
        e eVar = this.v.c;
        if (eVar != null) {
            this.v = eVar;
        }
    }

    public void s0(o oVar) {
        this.v.o(oVar.getValue());
        V0(l.FIELD_NAME, oVar);
    }

    public final void t0(String str) {
        this.v.o(str);
        V0(l.FIELD_NAME, str);
    }

    public String toString() {
        int i2;
        StringBuilder y = b.e.a.a.a.y("[TokenBuffer: ");
        i d1 = d1();
        boolean z = false;
        if (this.f2258l || this.f2259m) {
            z = true;
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (true) {
            try {
                l T0 = d1.T0();
                if (T0 == null) {
                    break;
                }
                if (z) {
                    W0(y);
                }
                if (i2 < 100) {
                    if (i2 > 0) {
                        y.append(", ");
                    }
                    y.append(T0.toString());
                    if (T0 == l.FIELD_NAME) {
                        y.append('(');
                        y.append(d1.e0());
                        y.append(')');
                    }
                }
                i2++;
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        if (i2 >= 100) {
            y.append(" ... (truncated ");
            y.append(i2 - 100);
            y.append(" entries)");
        }
        y.append(']');
        return y.toString();
    }

    public void u0() {
        X0(l.VALUE_NULL);
    }

    public void v0(double d) {
        Y0(l.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public void w0(float f) {
        Y0(l.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    public void x0(int i2) {
        Y0(l.VALUE_NUMBER_INT, Integer.valueOf(i2));
    }

    public void y0(long j2) {
        Y0(l.VALUE_NUMBER_INT, Long.valueOf(j2));
    }

    public boolean z() {
        return this.f2258l;
    }

    public void z0(String str) {
        Y0(l.VALUE_NUMBER_FLOAT, str);
    }
}
