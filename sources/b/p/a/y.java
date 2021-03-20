package b.p.a;

import b.p.a.l;
import b.p.a.q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class y {
    public static final l.a a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final l<Boolean> f6446b = new c();
    public static final l<Byte> c = new d();
    public static final l<Character> d = new e();

    /* renamed from: e  reason: collision with root package name */
    public static final l<Double> f6447e = new f();
    public static final l<Float> f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final l<Integer> f6448g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final l<Long> f6449h = new i();

    /* renamed from: i  reason: collision with root package name */
    public static final l<Short> f6450i = new j();

    /* renamed from: j  reason: collision with root package name */
    public static final l<String> f6451j = new a();

    public class a extends l<String> {
        public Object a(q qVar) {
            return qVar.e0();
        }

        public void e(u uVar, Object obj) {
            uVar.n0((String) obj);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    public class b implements l.a {
        public l<?> a(Type type, Set<? extends Annotation> set, x xVar) {
            l lVar;
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return y.f6446b;
            }
            if (type == Byte.TYPE) {
                return y.c;
            }
            if (type == Character.TYPE) {
                return y.d;
            }
            if (type == Double.TYPE) {
                return y.f6447e;
            }
            if (type == Float.TYPE) {
                return y.f;
            }
            if (type == Integer.TYPE) {
                return y.f6448g;
            }
            if (type == Long.TYPE) {
                return y.f6449h;
            }
            if (type == Short.TYPE) {
                return y.f6450i;
            }
            if (type == Boolean.class) {
                lVar = y.f6446b;
            } else if (type == Byte.class) {
                lVar = y.c;
            } else if (type == Character.class) {
                lVar = y.d;
            } else if (type == Double.class) {
                lVar = y.f6447e;
            } else if (type == Float.class) {
                lVar = y.f;
            } else if (type == Integer.class) {
                lVar = y.f6448g;
            } else if (type == Long.class) {
                lVar = y.f6449h;
            } else if (type == Short.class) {
                lVar = y.f6450i;
            } else if (type == String.class) {
                lVar = y.f6451j;
            } else if (type == Object.class) {
                lVar = new l(xVar);
            } else {
                Class<?> B = b.l.f.x.a.g.B(type);
                l<?> c = b.p.a.z.b.c(xVar, type, B);
                if (c != null) {
                    return c;
                }
                if (!B.isEnum()) {
                    return null;
                }
                lVar = new k(B);
            }
            return lVar.c();
        }
    }

    public class c extends l<Boolean> {
        public Object a(q qVar) {
            r rVar = (r) qVar;
            int i2 = rVar.f6401n;
            if (i2 == 0) {
                i2 = rVar.r0();
            }
            boolean z = false;
            if (i2 == 5) {
                rVar.f6401n = 0;
                int[] iArr = rVar.f6387k;
                int i3 = rVar.f6384h - 1;
                iArr[i3] = iArr[i3] + 1;
                z = true;
            } else if (i2 == 6) {
                rVar.f6401n = 0;
                int[] iArr2 = rVar.f6387k;
                int i4 = rVar.f6384h - 1;
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                StringBuilder y = b.e.a.a.a.y("Expected a boolean but was ");
                y.append(rVar.g0());
                y.append(" at path ");
                y.append(rVar.H());
                throw new n(y.toString());
            }
            return Boolean.valueOf(z);
        }

        public void e(u uVar, Object obj) {
            uVar.o0(((Boolean) obj).booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    public class d extends l<Byte> {
        public Object a(q qVar) {
            return Byte.valueOf((byte) y.a(qVar, "a byte", -128, 255));
        }

        public void e(u uVar, Object obj) {
            uVar.k0((long) (((Byte) obj).intValue() & 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    public class e extends l<Character> {
        public Object a(q qVar) {
            String e0 = qVar.e0();
            if (e0.length() <= 1) {
                return Character.valueOf(e0.charAt(0));
            }
            throw new n(String.format("Expected %s but was %s at path %s", new Object[]{"a char", '\"' + e0 + '\"', qVar.H()}));
        }

        public void e(u uVar, Object obj) {
            uVar.n0(((Character) obj).toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    public class f extends l<Double> {
        public Object a(q qVar) {
            return Double.valueOf(qVar.O());
        }

        public void e(u uVar, Object obj) {
            uVar.g0(((Double) obj).doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    public class g extends l<Float> {
        public Object a(q qVar) {
            float O = (float) qVar.O();
            if (!Float.isInfinite(O)) {
                return Float.valueOf(O);
            }
            throw new n("JSON forbids NaN and infinities: " + O + " at path " + qVar.H());
        }

        public void e(u uVar, Object obj) {
            Float f = (Float) obj;
            Objects.requireNonNull(f);
            uVar.m0(f);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    public class h extends l<Integer> {
        public Object a(q qVar) {
            return Integer.valueOf(qVar.S());
        }

        public void e(u uVar, Object obj) {
            uVar.k0((long) ((Integer) obj).intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    public class i extends l<Long> {
        public Object a(q qVar) {
            long j2;
            r rVar = (r) qVar;
            int i2 = rVar.f6401n;
            if (i2 == 0) {
                i2 = rVar.r0();
            }
            if (i2 == 16) {
                rVar.f6401n = 0;
                int[] iArr = rVar.f6387k;
                int i3 = rVar.f6384h - 1;
                iArr[i3] = iArr[i3] + 1;
                j2 = rVar.f6402o;
            } else {
                if (i2 == 17) {
                    rVar.f6404q = rVar.f6400m.n0((long) rVar.f6403p);
                } else if (i2 == 9 || i2 == 8) {
                    String x0 = rVar.x0(i2 == 9 ? r.s : r.r);
                    rVar.f6404q = x0;
                    try {
                        j2 = Long.parseLong(x0);
                        rVar.f6401n = 0;
                        int[] iArr2 = rVar.f6387k;
                        int i4 = rVar.f6384h - 1;
                        iArr2[i4] = iArr2[i4] + 1;
                    } catch (NumberFormatException unused) {
                    }
                } else if (i2 != 11) {
                    StringBuilder y = b.e.a.a.a.y("Expected a long but was ");
                    y.append(rVar.g0());
                    y.append(" at path ");
                    y.append(rVar.H());
                    throw new n(y.toString());
                }
                rVar.f6401n = 11;
                try {
                    j2 = new BigDecimal(rVar.f6404q).longValueExact();
                    rVar.f6404q = null;
                    rVar.f6401n = 0;
                    int[] iArr3 = rVar.f6387k;
                    int i5 = rVar.f6384h - 1;
                    iArr3[i5] = iArr3[i5] + 1;
                } catch (ArithmeticException | NumberFormatException unused2) {
                    StringBuilder y2 = b.e.a.a.a.y("Expected a long but was ");
                    y2.append(rVar.f6404q);
                    y2.append(" at path ");
                    y2.append(rVar.H());
                    throw new n(y2.toString());
                }
            }
            return Long.valueOf(j2);
        }

        public void e(u uVar, Object obj) {
            uVar.k0(((Long) obj).longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    public class j extends l<Short> {
        public Object a(q qVar) {
            return Short.valueOf((short) y.a(qVar, "a short", -32768, 32767));
        }

        public void e(u uVar, Object obj) {
            uVar.k0((long) ((Short) obj).intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    public static final class k<T extends Enum<T>> extends l<T> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f6452b;
        public final T[] c;
        public final q.a d;

        public k(Class<T> cls) {
            this.a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.c = tArr;
                this.f6452b = new String[tArr.length];
                int i2 = 0;
                while (true) {
                    T[] tArr2 = this.c;
                    if (i2 < tArr2.length) {
                        T t = tArr2[i2];
                        k kVar = (k) cls.getField(t.name()).getAnnotation(k.class);
                        this.f6452b[i2] = kVar != null ? kVar.name() : t.name();
                        i2++;
                    } else {
                        this.d = q.a.a(this.f6452b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(b.e.a.a.a.d(cls, b.e.a.a.a.y("Missing field in ")), e2);
            }
        }

        public Object a(q qVar) {
            int i2;
            q.a aVar = this.d;
            r rVar = (r) qVar;
            int i3 = rVar.f6401n;
            if (i3 == 0) {
                i3 = rVar.r0();
            }
            if (i3 < 8 || i3 > 11) {
                i2 = -1;
            } else if (i3 == 11) {
                i2 = rVar.t0(rVar.f6404q, aVar);
            } else {
                int l0 = rVar.f6399l.l0(aVar.f6388b);
                if (l0 != -1) {
                    rVar.f6401n = 0;
                    int[] iArr = rVar.f6387k;
                    int i4 = rVar.f6384h - 1;
                    iArr[i4] = iArr[i4] + 1;
                    i2 = l0;
                } else {
                    String e0 = rVar.e0();
                    i2 = rVar.t0(e0, aVar);
                    if (i2 == -1) {
                        rVar.f6401n = 11;
                        rVar.f6404q = e0;
                        int[] iArr2 = rVar.f6387k;
                        int i5 = rVar.f6384h - 1;
                        iArr2[i5] = iArr2[i5] - 1;
                    }
                }
            }
            if (i2 != -1) {
                return this.c[i2];
            }
            String H = qVar.H();
            String e02 = qVar.e0();
            StringBuilder y = b.e.a.a.a.y("Expected one of ");
            y.append(Arrays.asList(this.f6452b));
            y.append(" but was ");
            y.append(e02);
            y.append(" at path ");
            y.append(H);
            throw new n(y.toString());
        }

        public void e(u uVar, Object obj) {
            uVar.n0(this.f6452b[((Enum) obj).ordinal()]);
        }

        public String toString() {
            return b.e.a.a.a.e(this.a, b.e.a.a.a.y("JsonAdapter("), ")");
        }
    }

    public static final class l extends l<Object> {
        public final x a;

        /* renamed from: b  reason: collision with root package name */
        public final l<List> f6453b;
        public final l<Map> c;
        public final l<String> d;

        /* renamed from: e  reason: collision with root package name */
        public final l<Double> f6454e;
        public final l<Boolean> f;

        public l(x xVar) {
            this.a = xVar;
            this.f6453b = xVar.a(List.class);
            this.c = xVar.a(Map.class);
            this.d = xVar.a(String.class);
            this.f6454e = xVar.a(Double.class);
            this.f = xVar.a(Boolean.class);
        }

        public Object a(q qVar) {
            int ordinal = qVar.g0().ordinal();
            if (ordinal == 0) {
                return this.f6453b.a(qVar);
            }
            if (ordinal == 2) {
                return this.c.a(qVar);
            }
            if (ordinal == 5) {
                return this.d.a(qVar);
            }
            if (ordinal == 6) {
                return this.f6454e.a(qVar);
            }
            if (ordinal == 7) {
                return this.f.a(qVar);
            }
            if (ordinal == 8) {
                qVar.Y();
                return null;
            }
            StringBuilder y = b.e.a.a.a.y("Expected a value but was ");
            y.append(qVar.g0());
            y.append(" at path ");
            y.append(qVar.H());
            throw new IllegalStateException(y.toString());
        }

        public void e(u uVar, Object obj) {
            Class cls = obj.getClass();
            if (cls == Object.class) {
                uVar.e();
                uVar.H();
                return;
            }
            x xVar = this.a;
            if (Map.class.isAssignableFrom(cls)) {
                cls = Map.class;
            } else if (Collection.class.isAssignableFrom(cls)) {
                cls = Collection.class;
            }
            xVar.c(cls, b.p.a.z.b.a).e(uVar, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(q qVar, String str, int i2, int i3) {
        int S = qVar.S();
        if (S >= i2 && S <= i3) {
            return S;
        }
        throw new n(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(S), qVar.H()}));
    }
}
