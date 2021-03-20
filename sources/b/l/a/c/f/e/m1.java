package b.l.a.c.f.e;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class m1 {
    public final Unsafe a;

    public m1(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(Object obj, long j2);

    public abstract void b(Object obj, long j2, byte b2);

    public abstract boolean c(Object obj, long j2);

    public abstract void d(Object obj, long j2, boolean z);

    public abstract float e(Object obj, long j2);

    public abstract void f(Object obj, long j2, float f);

    public abstract double g(Object obj, long j2);

    public abstract void h(Object obj, long j2, double d);

    public boolean i() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getInt", new Class[]{cls, cls3});
                cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
                cls2.getMethod("getObject", new Class[]{cls, cls3});
                cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
                return true;
            } catch (Throwable th) {
                n1.u(th);
            }
        }
        return false;
    }

    public boolean j() {
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return n1.d() != null;
            } catch (Throwable th) {
                n1.u(th);
            }
        }
        return false;
    }

    public final long k(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final int l(Class<?> cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int m(Class<?> cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final int n(Object obj, long j2) {
        return this.a.getInt(obj, j2);
    }

    public final void o(Object obj, long j2, int i2) {
        this.a.putInt(obj, j2, i2);
    }

    public final long p(Object obj, long j2) {
        return this.a.getLong(obj, j2);
    }

    public final void q(Object obj, long j2, long j3) {
        this.a.putLong(obj, j2, j3);
    }

    public final Object r(Object obj, long j2) {
        return this.a.getObject(obj, j2);
    }

    public final void s(Object obj, long j2, Object obj2) {
        this.a.putObject(obj, j2, obj2);
    }
}
