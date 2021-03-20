package b.j.a.c.b0.a0;

import b.j.a.b.i;
import b.j.a.b.s.f;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.j;
import b.j.a.c.j0.k;
import b.j.a.c.j0.z;
import b.j.a.c.o;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@b.j.a.c.z.a
public class a0 extends o implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final int f1631h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f1632i;

    /* renamed from: j  reason: collision with root package name */
    public final m<?> f1633j;

    public static final class a extends o implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        public final Class<?> f1634h;

        /* renamed from: i  reason: collision with root package name */
        public final j<?> f1635i;

        public a(Class<?> cls, j<?> jVar) {
            this.f1634h = cls;
            this.f1635i = jVar;
        }

        public final Object a(String str, g gVar) {
            if (str == null) {
                return null;
            }
            z zVar = new z(gVar.f1996m, gVar);
            zVar.Q0(str);
            try {
                i d1 = zVar.d1();
                d1.T0();
                Object d = this.f1635i.d(d1, gVar);
                if (d != null) {
                    return d;
                }
                gVar.J(this.f1634h, str, "not a valid representation", new Object[0]);
                throw null;
            } catch (Exception e2) {
                gVar.J(this.f1634h, str, "not a valid representation: %s", e2.getMessage());
                throw null;
            }
        }
    }

    @b.j.a.c.z.a
    public static final class b extends a0 {

        /* renamed from: k  reason: collision with root package name */
        public final k f1636k;

        /* renamed from: l  reason: collision with root package name */
        public final b.j.a.c.e0.i f1637l;

        /* renamed from: m  reason: collision with root package name */
        public k f1638m;

        /* renamed from: n  reason: collision with root package name */
        public final Enum<?> f1639n;

        public b(k kVar, b.j.a.c.e0.i iVar) {
            super(-1, kVar.f2219h);
            this.f1636k = kVar;
            this.f1637l = iVar;
            this.f1639n = kVar.f2222k;
        }

        public Object b(String str, g gVar) {
            k kVar;
            b.j.a.c.e0.i iVar = this.f1637l;
            if (iVar != null) {
                try {
                    return iVar.q(str);
                } catch (Exception e2) {
                    Throwable r = b.j.a.c.j0.g.r(e2);
                    String message = r.getMessage();
                    b.j.a.c.j0.g.E(r);
                    b.j.a.c.j0.g.C(r);
                    throw new IllegalArgumentException(message, r);
                }
            } else {
                if (gVar.O(h.READ_ENUMS_USING_TO_STRING)) {
                    kVar = this.f1638m;
                    if (kVar == null) {
                        synchronized (this) {
                            kVar = k.b(this.f1636k.f2219h, gVar.x());
                            this.f1638m = kVar;
                        }
                    }
                } else {
                    kVar = this.f1636k;
                }
                Enum enumR = kVar.f2221j.get(str);
                if (enumR != null) {
                    return enumR;
                }
                if (this.f1639n != null && gVar.O(h.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                    return this.f1639n;
                }
                if (gVar.O(h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return enumR;
                }
                gVar.J(this.f1632i, str, "not one of values excepted for Enum class: %s", kVar.f2221j.keySet());
                throw null;
            }
        }
    }

    public static final class c extends a0 {

        /* renamed from: k  reason: collision with root package name */
        public final Constructor<?> f1640k;

        public c(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this.f1640k = constructor;
        }

        public Object b(String str, g gVar) {
            return this.f1640k.newInstance(new Object[]{str});
        }
    }

    public static final class d extends a0 {

        /* renamed from: k  reason: collision with root package name */
        public final Method f1641k;

        public d(Method method) {
            super(-1, method.getDeclaringClass());
            this.f1641k = method;
        }

        public Object b(String str, g gVar) {
            return this.f1641k.invoke((Object) null, new Object[]{str});
        }
    }

    @b.j.a.c.z.a
    public static final class e extends a0 {

        /* renamed from: k  reason: collision with root package name */
        public static final e f1642k = new e(String.class);

        /* renamed from: l  reason: collision with root package name */
        public static final e f1643l = new e(Object.class);

        public e(Class<?> cls) {
            super(-1, cls);
        }

        public Object a(String str, g gVar) {
            return str;
        }
    }

    public a0(int i2, Class<?> cls) {
        this.f1631h = i2;
        this.f1632i = cls;
        this.f1633j = null;
    }

    public a0(int i2, Class<?> cls, m<?> mVar) {
        this.f1631h = i2;
        this.f1632i = cls;
        this.f1633j = mVar;
    }

    public Object a(String str, g gVar) {
        if (str == null) {
            return null;
        }
        try {
            Object b2 = b(str, gVar);
            if (b2 != null) {
                return b2;
            }
            if (this.f1632i.isEnum() && gVar.f1993j.x(h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            gVar.J(this.f1632i, str, "not a valid representation", new Object[0]);
            throw null;
        } catch (Exception e2) {
            gVar.J(this.f1632i, str, "not a valid representation, problem: (%s) %s", e2.getClass().getName(), b.j.a.c.j0.g.i(e2));
            throw null;
        }
    }

    public Object b(String str, g gVar) {
        switch (this.f1631h) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                gVar.J(this.f1632i, str, "value not 'true' or 'false'", new Object[0]);
                throw null;
            case 2:
                int parseInt = Integer.parseInt(str);
                if (parseInt >= -128 && parseInt <= 255) {
                    return Byte.valueOf((byte) parseInt);
                }
                gVar.J(this.f1632i, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                throw null;
            case 3:
                int parseInt2 = Integer.parseInt(str);
                if (parseInt2 >= -32768 && parseInt2 <= 32767) {
                    return Short.valueOf((short) parseInt2);
                }
                gVar.J(this.f1632i, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                throw null;
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                gVar.J(this.f1632i, str, "can only convert 1-character Strings", new Object[0]);
                throw null;
            case 5:
                return Integer.valueOf(Integer.parseInt(str));
            case 6:
                return Long.valueOf(Long.parseLong(str));
            case 7:
                return Float.valueOf((float) f.c(str));
            case 8:
                return Double.valueOf(f.c(str));
            case 9:
                try {
                    return this.f1633j.c0(str, gVar);
                } catch (IllegalArgumentException e2) {
                    c(gVar, str, e2);
                    throw null;
                }
            case 10:
                return gVar.S(str);
            case 11:
                Date S = gVar.S(str);
                Calendar instance = Calendar.getInstance(gVar.A());
                instance.setTime(S);
                return instance;
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e3) {
                    c(gVar, str, e3);
                    throw null;
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e4) {
                    c(gVar, str, e4);
                    throw null;
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e5) {
                    c(gVar, str, e5);
                    throw null;
                }
            case 15:
                try {
                    return gVar.h().l(str);
                } catch (Exception unused) {
                    gVar.J(this.f1632i, str, "unable to parse key as Class", new Object[0]);
                    throw null;
                }
            case 16:
                try {
                    return this.f1633j.c0(str, gVar);
                } catch (IllegalArgumentException e6) {
                    c(gVar, str, e6);
                    throw null;
                }
            case 17:
                try {
                    b.j.a.b.a aVar = gVar.f1993j.f1609i.f1594p;
                    Objects.requireNonNull(aVar);
                    b.j.a.b.w.c cVar = new b.j.a.b.w.c((b.j.a.b.w.a) null, 500);
                    aVar.c(str, cVar);
                    return cVar.N();
                } catch (IllegalArgumentException e7) {
                    c(gVar, str, e7);
                    throw null;
                }
            default:
                StringBuilder y = b.e.a.a.a.y("Internal error: unknown key type ");
                y.append(this.f1632i);
                throw new IllegalStateException(y.toString());
        }
    }

    public Object c(g gVar, String str, Exception exc) {
        gVar.J(this.f1632i, str, "problem: %s", b.j.a.c.j0.g.i(exc));
        throw null;
    }
}
