package b.j.a.c.b0.a0;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

public class t {
    public static final HashSet<String> a = new HashSet<>();

    @b.j.a.c.z.a
    public static class a extends c0<BigDecimal> {

        /* renamed from: k  reason: collision with root package name */
        public static final a f1721k = new a();

        public a() {
            super((Class<?>) BigDecimal.class);
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            int k0 = iVar.k0();
            if (k0 == 3) {
                return (BigDecimal) v(iVar, gVar);
            }
            if (k0 == 6) {
                String trim = iVar.x0().trim();
                if (B(trim)) {
                    T(gVar, trim);
                    return null;
                }
                V(gVar, trim);
                try {
                    return new BigDecimal(trim);
                } catch (IllegalArgumentException unused) {
                    gVar.L(this.f1761h, trim, "not a valid representation", new Object[0]);
                    throw null;
                }
            } else if (k0 == 7 || k0 == 8) {
                return iVar.m0();
            } else {
                gVar.G(this.f1761h, iVar);
                throw null;
            }
        }

        public Object i(b.j.a.c.g gVar) {
            return BigDecimal.ZERO;
        }
    }

    @b.j.a.c.z.a
    public static class b extends c0<BigInteger> {

        /* renamed from: k  reason: collision with root package name */
        public static final b f1722k = new b();

        public b() {
            super((Class<?>) BigInteger.class);
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            int k0 = iVar.k0();
            if (k0 == 3) {
                return (BigInteger) v(iVar, gVar);
            }
            if (k0 != 6) {
                if (k0 == 7) {
                    int ordinal = iVar.s0().ordinal();
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                        return iVar.H();
                    }
                } else if (k0 == 8) {
                    if (gVar.O(b.j.a.c.h.ACCEPT_FLOAT_AS_INT)) {
                        return iVar.m0().toBigInteger();
                    }
                    x(iVar, gVar, "java.math.BigInteger");
                    throw null;
                }
                gVar.G(this.f1761h, iVar);
                throw null;
            }
            String trim = iVar.x0().trim();
            if (B(trim)) {
                T(gVar, trim);
                return null;
            }
            V(gVar, trim);
            try {
                return new BigInteger(trim);
            } catch (IllegalArgumentException unused) {
                gVar.L(this.f1761h, trim, "not a valid representation", new Object[0]);
                throw null;
            }
        }

        public Object i(b.j.a.c.g gVar) {
            return BigInteger.ZERO;
        }
    }

    @b.j.a.c.z.a
    public static final class c extends k<Boolean> {

        /* renamed from: n  reason: collision with root package name */
        public static final c f1723n = new c(Boolean.TYPE, Boolean.FALSE);

        /* renamed from: o  reason: collision with root package name */
        public static final c f1724o = new c(Boolean.class, (Boolean) null);

        public c(Class<Boolean> cls, Boolean bool) {
            super(cls, bool, Boolean.FALSE);
        }

        public final Boolean c0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            Object obj;
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            b.j.a.b.l g0 = iVar.g0();
            if (g0 == b.j.a.b.l.VALUE_NULL) {
                if (this.f1740m) {
                    R(gVar);
                }
                return (Boolean) c(gVar);
            }
            if (g0 == b.j.a.b.l.START_ARRAY) {
                obj = v(iVar, gVar);
            } else if (g0 == b.j.a.b.l.VALUE_NUMBER_INT) {
                U(gVar, iVar);
                return Boolean.valueOf(!"0".equals(iVar.x0()));
            } else if (g0 == b.j.a.b.l.VALUE_STRING) {
                String trim = iVar.x0().trim();
                if ("true".equals(trim) || "True".equals(trim)) {
                    V(gVar, trim);
                    return bool2;
                } else if ("false".equals(trim) || "False".equals(trim)) {
                    V(gVar, trim);
                    return bool;
                } else if (trim.length() == 0) {
                    obj = q(gVar, this.f1740m);
                } else if (z(trim)) {
                    obj = t(gVar, this.f1740m);
                } else {
                    gVar.L(this.f1761h, trim, "only \"true\" or \"false\" recognized", new Object[0]);
                    throw null;
                }
            } else if (g0 == b.j.a.b.l.VALUE_TRUE) {
                return bool2;
            } else {
                if (g0 == b.j.a.b.l.VALUE_FALSE) {
                    return bool;
                }
                gVar.G(this.f1761h, iVar);
                throw null;
            }
            return (Boolean) obj;
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            b.j.a.b.l g0 = iVar.g0();
            if (g0 == b.j.a.b.l.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            return g0 == b.j.a.b.l.VALUE_FALSE ? Boolean.FALSE : c0(iVar, gVar);
        }

        public Object f(b.j.a.b.i iVar, b.j.a.c.g gVar, b.j.a.c.f0.c cVar) {
            b.j.a.b.l g0 = iVar.g0();
            if (g0 == b.j.a.b.l.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            return g0 == b.j.a.b.l.VALUE_FALSE ? Boolean.FALSE : c0(iVar, gVar);
        }
    }

    @b.j.a.c.z.a
    public static class d extends k<Byte> {

        /* renamed from: n  reason: collision with root package name */
        public static final d f1725n = new d(Byte.TYPE, (byte) 0);

        /* renamed from: o  reason: collision with root package name */
        public static final d f1726o = new d(Byte.class, (Byte) null);

        public d(Class<Byte> cls, Byte b2) {
            super(cls, b2, (byte) 0);
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            byte b2;
            Object obj;
            b.j.a.b.l lVar = b.j.a.b.l.VALUE_NUMBER_INT;
            if (iVar.L0(lVar)) {
                return Byte.valueOf(iVar.O());
            }
            b.j.a.b.l g0 = iVar.g0();
            if (g0 == b.j.a.b.l.VALUE_STRING) {
                String trim = iVar.x0().trim();
                if (z(trim)) {
                    obj = t(gVar, this.f1740m);
                } else if (trim.length() == 0) {
                    obj = q(gVar, this.f1740m);
                } else {
                    V(gVar, trim);
                    try {
                        int d = b.j.a.b.s.f.d(trim);
                        if (!(d < -128 || d > 255)) {
                            b2 = (byte) d;
                            return Byte.valueOf(b2);
                        }
                        gVar.L(this.f1761h, trim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        gVar.L(this.f1761h, trim, "not a valid Byte value", new Object[0]);
                        throw null;
                    }
                }
            } else {
                if (g0 == b.j.a.b.l.VALUE_NUMBER_FLOAT) {
                    if (!gVar.O(b.j.a.c.h.ACCEPT_FLOAT_AS_INT)) {
                        x(iVar, gVar, "Byte");
                        throw null;
                    }
                } else if (g0 == b.j.a.b.l.VALUE_NULL) {
                    if (this.f1740m) {
                        R(gVar);
                    }
                    obj = c(gVar);
                } else if (g0 == b.j.a.b.l.START_ARRAY) {
                    obj = v(iVar, gVar);
                } else if (g0 != lVar) {
                    gVar.G(this.f1761h, iVar);
                    throw null;
                }
                b2 = iVar.O();
                return Byte.valueOf(b2);
            }
            return (Byte) obj;
        }
    }

    @b.j.a.c.z.a
    public static class e extends k<Character> {

        /* renamed from: n  reason: collision with root package name */
        public static final e f1727n = new e(Character.TYPE, 0);

        /* renamed from: o  reason: collision with root package name */
        public static final e f1728o = new e(Character.class, (Character) null);

        public e(Class<Character> cls, Character ch) {
            super(cls, ch, 0);
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            Object obj;
            char c;
            int k0 = iVar.k0();
            if (k0 == 3) {
                obj = v(iVar, gVar);
            } else if (k0 != 11) {
                if (k0 != 6) {
                    if (k0 == 7) {
                        U(gVar, iVar);
                        int q0 = iVar.q0();
                        if (q0 >= 0 && q0 <= 65535) {
                            c = (char) q0;
                        }
                    }
                    gVar.G(this.f1761h, iVar);
                    throw null;
                }
                String x0 = iVar.x0();
                if (x0.length() == 1) {
                    c = x0.charAt(0);
                } else {
                    if (x0.length() == 0) {
                        obj = q(gVar, this.f1740m);
                    }
                    gVar.G(this.f1761h, iVar);
                    throw null;
                }
                return Character.valueOf(c);
            } else {
                if (this.f1740m) {
                    R(gVar);
                }
                obj = c(gVar);
            }
            return (Character) obj;
        }
    }

    @b.j.a.c.z.a
    public static class f extends k<Double> {

        /* renamed from: n  reason: collision with root package name */
        public static final f f1729n = new f(Double.TYPE, Double.valueOf(ShadowDrawableWrapper.COS_45));

        /* renamed from: o  reason: collision with root package name */
        public static final f f1730o = new f(Double.class, (Double) null);

        public f(Class<Double> cls, Double d) {
            super(cls, d, Double.valueOf(ShadowDrawableWrapper.COS_45));
        }

        public final Double c0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            b.j.a.b.l g0 = iVar.g0();
            if (g0 == b.j.a.b.l.VALUE_NUMBER_INT || g0 == b.j.a.b.l.VALUE_NUMBER_FLOAT) {
                return Double.valueOf(iVar.n0());
            }
            if (g0 == b.j.a.b.l.VALUE_STRING) {
                String trim = iVar.x0().trim();
                if (trim.length() == 0) {
                    return (Double) q(gVar, this.f1740m);
                }
                if (z(trim)) {
                    return (Double) t(gVar, this.f1740m);
                }
                char charAt = trim.charAt(0);
                if (charAt != '-') {
                    if (charAt != 'I') {
                        if (charAt == 'N' && D(trim)) {
                            return Double.valueOf(Double.NaN);
                        }
                    } else if (F(trim)) {
                        return Double.valueOf(Double.POSITIVE_INFINITY);
                    }
                } else if (E(trim)) {
                    return Double.valueOf(Double.NEGATIVE_INFINITY);
                }
                V(gVar, trim);
                try {
                    return Double.valueOf("2.2250738585072012e-308".equals(trim) ? Double.MIN_NORMAL : Double.parseDouble(trim));
                } catch (IllegalArgumentException unused) {
                    gVar.L(this.f1761h, trim, "not a valid Double value", new Object[0]);
                    throw null;
                }
            } else if (g0 == b.j.a.b.l.VALUE_NULL) {
                if (this.f1740m) {
                    R(gVar);
                }
                return (Double) c(gVar);
            } else if (g0 == b.j.a.b.l.START_ARRAY) {
                return (Double) v(iVar, gVar);
            } else {
                gVar.G(this.f1761h, iVar);
                throw null;
            }
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            return c0(iVar, gVar);
        }

        public Object f(b.j.a.b.i iVar, b.j.a.c.g gVar, b.j.a.c.f0.c cVar) {
            return c0(iVar, gVar);
        }
    }

    @b.j.a.c.z.a
    public static class g extends k<Float> {

        /* renamed from: n  reason: collision with root package name */
        public static final g f1731n = new g(Float.TYPE, Float.valueOf(0.0f));

        /* renamed from: o  reason: collision with root package name */
        public static final g f1732o = new g(Float.class, (Float) null);

        public g(Class<Float> cls, Float f) {
            super(cls, f, Float.valueOf(0.0f));
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            float f;
            Object obj;
            b.j.a.b.l g0 = iVar.g0();
            if (g0 == b.j.a.b.l.VALUE_NUMBER_FLOAT || g0 == b.j.a.b.l.VALUE_NUMBER_INT) {
                f = iVar.p0();
            } else {
                if (g0 == b.j.a.b.l.VALUE_STRING) {
                    String trim = iVar.x0().trim();
                    if (trim.length() == 0) {
                        obj = q(gVar, this.f1740m);
                    } else if (z(trim)) {
                        obj = t(gVar, this.f1740m);
                    } else {
                        char charAt = trim.charAt(0);
                        if (charAt != '-') {
                            if (charAt != 'I') {
                                if (charAt == 'N' && D(trim)) {
                                    f = Float.NaN;
                                }
                            } else if (F(trim)) {
                                f = Float.POSITIVE_INFINITY;
                            }
                        } else if (E(trim)) {
                            f = Float.NEGATIVE_INFINITY;
                        }
                        V(gVar, trim);
                        try {
                            return Float.valueOf(Float.parseFloat(trim));
                        } catch (IllegalArgumentException unused) {
                            gVar.L(this.f1761h, trim, "not a valid Float value", new Object[0]);
                            throw null;
                        }
                    }
                } else if (g0 == b.j.a.b.l.VALUE_NULL) {
                    if (this.f1740m) {
                        R(gVar);
                    }
                    obj = c(gVar);
                } else if (g0 == b.j.a.b.l.START_ARRAY) {
                    obj = v(iVar, gVar);
                } else {
                    gVar.G(this.f1761h, iVar);
                    throw null;
                }
                return (Float) obj;
            }
            return Float.valueOf(f);
        }
    }

    @b.j.a.c.z.a
    public static final class h extends k<Integer> {

        /* renamed from: n  reason: collision with root package name */
        public static final h f1733n = new h(Integer.TYPE, 0);

        /* renamed from: o  reason: collision with root package name */
        public static final h f1734o = new h(Integer.class, (Integer) null);

        public h(Class<Integer> cls, Integer num) {
            super(cls, num, 0);
        }

        public final Integer c0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            int k0 = iVar.k0();
            if (k0 == 3) {
                return (Integer) v(iVar, gVar);
            }
            if (k0 == 11) {
                if (this.f1740m) {
                    R(gVar);
                }
                return (Integer) c(gVar);
            } else if (k0 == 6) {
                String trim = iVar.x0().trim();
                int length = trim.length();
                if (length == 0) {
                    return (Integer) q(gVar, this.f1740m);
                }
                if (z(trim)) {
                    return (Integer) t(gVar, this.f1740m);
                }
                V(gVar, trim);
                if (length <= 9) {
                    return Integer.valueOf(b.j.a.b.s.f.d(trim));
                }
                try {
                    long parseLong = Long.parseLong(trim);
                    if (!A(parseLong)) {
                        return Integer.valueOf((int) parseLong);
                    }
                    gVar.L(this.f1761h, trim, String.format("Overflow: numeric value (%s) out of range of Integer (%d - %d)", new Object[]{trim, Integer.MIN_VALUE, Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)}), new Object[0]);
                    throw null;
                } catch (IllegalArgumentException unused) {
                    gVar.L(this.f1761h, trim, "not a valid Integer value", new Object[0]);
                    throw null;
                }
            } else if (k0 == 7) {
                return Integer.valueOf(iVar.q0());
            } else {
                if (k0 != 8) {
                    gVar.G(this.f1761h, iVar);
                    throw null;
                } else if (gVar.O(b.j.a.c.h.ACCEPT_FLOAT_AS_INT)) {
                    return Integer.valueOf(iVar.D0());
                } else {
                    x(iVar, gVar, "Integer");
                    throw null;
                }
            }
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            return iVar.L0(b.j.a.b.l.VALUE_NUMBER_INT) ? Integer.valueOf(iVar.q0()) : c0(iVar, gVar);
        }

        public Object f(b.j.a.b.i iVar, b.j.a.c.g gVar, b.j.a.c.f0.c cVar) {
            return iVar.L0(b.j.a.b.l.VALUE_NUMBER_INT) ? Integer.valueOf(iVar.q0()) : c0(iVar, gVar);
        }

        public boolean m() {
            return true;
        }
    }

    @b.j.a.c.z.a
    public static final class i extends k<Long> {

        /* renamed from: n  reason: collision with root package name */
        public static final i f1735n = new i(Long.TYPE, 0L);

        /* renamed from: o  reason: collision with root package name */
        public static final i f1736o = new i(Long.class, (Long) null);

        public i(Class<Long> cls, Long l2) {
            super(cls, l2, 0L);
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            Object obj;
            long j2;
            if (iVar.L0(b.j.a.b.l.VALUE_NUMBER_INT)) {
                return Long.valueOf(iVar.r0());
            }
            int k0 = iVar.k0();
            if (k0 == 3) {
                obj = v(iVar, gVar);
            } else if (k0 == 11) {
                if (this.f1740m) {
                    R(gVar);
                }
                obj = c(gVar);
            } else if (k0 != 6) {
                if (k0 == 7) {
                    j2 = iVar.r0();
                } else if (k0 != 8) {
                    gVar.G(this.f1761h, iVar);
                    throw null;
                } else if (gVar.O(b.j.a.c.h.ACCEPT_FLOAT_AS_INT)) {
                    j2 = iVar.F0();
                } else {
                    x(iVar, gVar, "Long");
                    throw null;
                }
                return Long.valueOf(j2);
            } else {
                String trim = iVar.x0().trim();
                if (trim.length() == 0) {
                    obj = q(gVar, this.f1740m);
                } else if (z(trim)) {
                    obj = t(gVar, this.f1740m);
                } else {
                    V(gVar, trim);
                    try {
                        return Long.valueOf(b.j.a.b.s.f.f(trim));
                    } catch (IllegalArgumentException unused) {
                        gVar.L(this.f1761h, trim, "not a valid Long value", new Object[0]);
                        throw null;
                    }
                }
            }
            return (Long) obj;
        }

        public boolean m() {
            return true;
        }
    }

    @b.j.a.c.z.a
    public static class j extends c0<Object> {

        /* renamed from: k  reason: collision with root package name */
        public static final j f1737k = new j();

        public j() {
            super((Class<?>) Number.class);
        }

        /* JADX WARNING: Removed duplicated region for block: B:53:0x0094 A[Catch:{ IllegalArgumentException -> 0x00ed }] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x00a5 A[EDGE_INSN: B:86:0x00a5->B:60:0x00a5 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(b.j.a.b.i r8, b.j.a.c.g r9) {
            /*
                r7 = this;
                int r0 = r8.k0()
                r1 = 3
                if (r0 == r1) goto L_0x00f7
                r1 = 6
                r2 = 0
                if (r0 == r1) goto L_0x0042
                r1 = 7
                if (r0 == r1) goto L_0x0030
                r1 = 8
                if (r0 != r1) goto L_0x002a
                b.j.a.c.h r0 = b.j.a.c.h.USE_BIG_DECIMAL_FOR_FLOATS
                boolean r9 = r9.O(r0)
                if (r9 == 0) goto L_0x0025
                boolean r9 = r8.Q0()
                if (r9 != 0) goto L_0x0025
                java.math.BigDecimal r8 = r8.m0()
                return r8
            L_0x0025:
                java.lang.Number r8 = r8.t0()
                return r8
            L_0x002a:
                java.lang.Class<?> r0 = r7.f1761h
                r9.G(r0, r8)
                throw r2
            L_0x0030:
                int r0 = b.j.a.c.b0.a0.z.f1759i
                boolean r0 = r9.M(r0)
                if (r0 == 0) goto L_0x003d
                java.lang.Object r8 = r7.r(r8, r9)
                return r8
            L_0x003d:
                java.lang.Number r8 = r8.t0()
                return r8
            L_0x0042:
                java.lang.String r8 = r8.x0()
                java.lang.String r8 = r8.trim()
                int r0 = r8.length()
                if (r0 != 0) goto L_0x0051
                return r2
            L_0x0051:
                boolean r0 = r7.z(r8)
                if (r0 == 0) goto L_0x0058
                return r2
            L_0x0058:
                boolean r0 = r7.F(r8)
                if (r0 == 0) goto L_0x0065
                r8 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            L_0x0060:
                java.lang.Double r8 = java.lang.Double.valueOf(r8)
                return r8
            L_0x0065:
                boolean r0 = r7.E(r8)
                if (r0 == 0) goto L_0x006e
                r8 = -4503599627370496(0xfff0000000000000, double:-Infinity)
                goto L_0x0060
            L_0x006e:
                boolean r0 = r7.D(r8)
                if (r0 == 0) goto L_0x0077
                r8 = 9221120237041090560(0x7ff8000000000000, double:NaN)
                goto L_0x0060
            L_0x0077:
                r7.V(r9, r8)
                r0 = 0
                int r1 = r8.length()     // Catch:{ IllegalArgumentException -> 0x00ed }
                r3 = 1
                if (r1 <= 0) goto L_0x00a4
                char r4 = r8.charAt(r0)     // Catch:{ IllegalArgumentException -> 0x00ed }
                r5 = 45
                if (r4 == r5) goto L_0x0091
                r5 = 43
                if (r4 != r5) goto L_0x008f
                goto L_0x0091
            L_0x008f:
                r4 = r0
                goto L_0x0092
            L_0x0091:
                r4 = r3
            L_0x0092:
                if (r4 >= r1) goto L_0x00a5
                char r5 = r8.charAt(r4)     // Catch:{ IllegalArgumentException -> 0x00ed }
                r6 = 57
                if (r5 > r6) goto L_0x00a4
                r6 = 48
                if (r5 >= r6) goto L_0x00a1
                goto L_0x00a4
            L_0x00a1:
                int r4 = r4 + 1
                goto L_0x0092
            L_0x00a4:
                r3 = r0
            L_0x00a5:
                if (r3 != 0) goto L_0x00ba
                b.j.a.c.h r1 = b.j.a.c.h.USE_BIG_DECIMAL_FOR_FLOATS     // Catch:{ IllegalArgumentException -> 0x00ed }
                boolean r1 = r9.O(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
                if (r1 == 0) goto L_0x00b5
                java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ IllegalArgumentException -> 0x00ed }
                r1.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x00ed }
                return r1
            L_0x00b5:
                java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ IllegalArgumentException -> 0x00ed }
                return r8
            L_0x00ba:
                b.j.a.c.h r1 = b.j.a.c.h.USE_BIG_INTEGER_FOR_INTS     // Catch:{ IllegalArgumentException -> 0x00ed }
                boolean r1 = r9.O(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
                if (r1 == 0) goto L_0x00c8
                java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ IllegalArgumentException -> 0x00ed }
                r1.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x00ed }
                return r1
            L_0x00c8:
                long r3 = java.lang.Long.parseLong(r8)     // Catch:{ IllegalArgumentException -> 0x00ed }
                b.j.a.c.h r1 = b.j.a.c.h.USE_LONG_FOR_INTS     // Catch:{ IllegalArgumentException -> 0x00ed }
                boolean r1 = r9.O(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
                if (r1 != 0) goto L_0x00e8
                r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 > 0) goto L_0x00e8
                r5 = -2147483648(0xffffffff80000000, double:NaN)
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x00e8
                int r1 = (int) r3     // Catch:{ IllegalArgumentException -> 0x00ed }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
                return r8
            L_0x00e8:
                java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x00ed }
                return r8
            L_0x00ed:
                java.lang.Class<?> r1 = r7.f1761h
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "not a valid number"
                r9.L(r1, r8, r3, r0)
                throw r2
            L_0x00f7:
                java.lang.Object r8 = r7.v(r8, r9)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.t.j.d(b.j.a.b.i, b.j.a.c.g):java.lang.Object");
        }

        public Object f(b.j.a.b.i iVar, b.j.a.c.g gVar, b.j.a.c.f0.c cVar) {
            int k0 = iVar.k0();
            return (k0 == 6 || k0 == 7 || k0 == 8) ? d(iVar, gVar) : cVar.e(iVar, gVar);
        }
    }

    public static abstract class k<T> extends c0<T> {

        /* renamed from: k  reason: collision with root package name */
        public final T f1738k;

        /* renamed from: l  reason: collision with root package name */
        public final T f1739l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f1740m;

        public k(Class<T> cls, T t, T t2) {
            super((Class<?>) cls);
            this.f1738k = t;
            this.f1739l = t2;
            this.f1740m = cls.isPrimitive();
        }

        public final T c(b.j.a.c.g gVar) {
            if (!this.f1740m || !gVar.O(b.j.a.c.h.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                return this.f1738k;
            }
            gVar.Y(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", this.f1761h.toString());
            throw null;
        }

        public Object i(b.j.a.c.g gVar) {
            return this.f1739l;
        }
    }

    @b.j.a.c.z.a
    public static class l extends k<Short> {

        /* renamed from: n  reason: collision with root package name */
        public static final l f1741n = new l(Short.TYPE, 0);

        /* renamed from: o  reason: collision with root package name */
        public static final l f1742o = new l(Short.class, (Short) null);

        public l(Class<Short> cls, Short sh) {
            super(cls, sh, (short) 0);
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            short s;
            Object obj;
            b.j.a.b.l g0 = iVar.g0();
            if (g0 != b.j.a.b.l.VALUE_NUMBER_INT) {
                if (g0 == b.j.a.b.l.VALUE_STRING) {
                    String trim = iVar.x0().trim();
                    if (trim.length() == 0) {
                        obj = q(gVar, this.f1740m);
                    } else if (z(trim)) {
                        obj = t(gVar, this.f1740m);
                    } else {
                        V(gVar, trim);
                        try {
                            int d = b.j.a.b.s.f.d(trim);
                            if (!(d < -32768 || d > 32767)) {
                                s = (short) d;
                                return Short.valueOf(s);
                            }
                            gVar.L(this.f1761h, trim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                            throw null;
                        } catch (IllegalArgumentException unused) {
                            gVar.L(this.f1761h, trim, "not a valid Short value", new Object[0]);
                            throw null;
                        }
                    }
                } else if (g0 == b.j.a.b.l.VALUE_NUMBER_FLOAT) {
                    if (!gVar.O(b.j.a.c.h.ACCEPT_FLOAT_AS_INT)) {
                        x(iVar, gVar, "Short");
                        throw null;
                    }
                } else if (g0 == b.j.a.b.l.VALUE_NULL) {
                    if (this.f1740m) {
                        R(gVar);
                    }
                    obj = c(gVar);
                } else if (g0 == b.j.a.b.l.START_ARRAY) {
                    obj = v(iVar, gVar);
                } else {
                    gVar.G(this.f1761h, iVar);
                    throw null;
                }
                return (Short) obj;
            }
            s = iVar.w0();
            return Short.valueOf(s);
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i2 = 0; i2 < 11; i2++) {
            a.add(clsArr[i2].getName());
        }
    }
}
