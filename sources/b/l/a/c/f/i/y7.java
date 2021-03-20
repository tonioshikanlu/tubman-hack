package b.l.a.c.f.i;

import b.e.a.a.a;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class y7 {
    public static final Unsafe a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f3818b = i4.a;
    public static final boolean c;
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final x7 f3819e;
    public static final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f3820g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f3821h = ((long) a(byte[].class));

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f3822i;

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        Unsafe t = t();
        a = t;
        boolean c2 = c(Long.TYPE);
        c = c2;
        boolean c3 = c(Integer.TYPE);
        d = c3;
        x7 x7Var = null;
        if (t != null) {
            if (!i4.a()) {
                x7Var = new w7(t);
            } else if (c2) {
                x7Var = new v7(t);
            } else if (c3) {
                x7Var = new u7(t);
            }
        }
        f3819e = x7Var;
        boolean z = false;
        f = x7Var == null ? false : x7Var.j();
        f3820g = x7Var == null ? false : x7Var.i();
        a(cls6);
        b(cls6);
        a(cls5);
        b(cls5);
        a(cls4);
        b(cls4);
        a(cls3);
        b(cls3);
        a(cls2);
        b(cls2);
        a(cls);
        b(cls);
        Field d2 = d();
        if (!(d2 == null || x7Var == null)) {
            x7Var.k(d2);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        }
        f3822i = z;
    }

    public static int a(Class<?> cls) {
        if (f3820g) {
            return f3819e.l(cls);
        }
        return -1;
    }

    public static int b(Class<?> cls) {
        if (f3820g) {
            return f3819e.m(cls);
        }
        return -1;
    }

    public static boolean c(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!i4.a()) {
            return false;
        }
        try {
            Class<?> cls3 = f3818b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (i4.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static byte e(Object obj, long j2) {
        return (byte) ((f3819e.n(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte f(Object obj, long j2) {
        return (byte) ((f3819e.n(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static void g(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        x7 x7Var = f3819e;
        int n2 = x7Var.n(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        x7Var.o(obj, j3, ((255 & b2) << i2) | (n2 & (~(255 << i2))));
    }

    public static void h(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        x7 x7Var = f3819e;
        int i2 = (((int) j2) & 3) << 3;
        x7Var.o(obj, j3, ((255 & b2) << i2) | (x7Var.n(obj, j3) & (~(255 << i2))));
    }

    public static <T> T i(Class<T> cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int j(Object obj, long j2) {
        return f3819e.n(obj, j2);
    }

    public static long k(Object obj, long j2) {
        return f3819e.p(obj, j2);
    }

    public static void l(Object obj, long j2, long j3) {
        f3819e.q(obj, j2, j3);
    }

    public static boolean m(Object obj, long j2) {
        return f3819e.c(obj, j2);
    }

    public static float n(Object obj, long j2) {
        return f3819e.e(obj, j2);
    }

    public static double o(Object obj, long j2) {
        return f3819e.g(obj, j2);
    }

    public static void p(Object obj, long j2, double d2) {
        f3819e.h(obj, j2, d2);
    }

    public static Object q(Object obj, long j2) {
        return f3819e.r(obj, j2);
    }

    public static byte r(byte[] bArr, long j2) {
        return f3819e.a(bArr, f3821h + j2);
    }

    public static void s(byte[] bArr, long j2, byte b2) {
        f3819e.b(bArr, f3821h + j2, b2);
    }

    public static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new t7());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void u(Throwable th) {
        Logger logger = Logger.getLogger(y7.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", a.q(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }
}
