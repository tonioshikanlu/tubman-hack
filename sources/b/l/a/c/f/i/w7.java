package b.l.a.c.f.i;

import sun.misc.Unsafe;

public final class w7 extends x7 {
    public w7(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte a(Object obj, long j2) {
        return this.a.getByte(obj, j2);
    }

    public final void b(Object obj, long j2, byte b2) {
        this.a.putByte(obj, j2, b2);
    }

    public final boolean c(Object obj, long j2) {
        return this.a.getBoolean(obj, j2);
    }

    public final void d(Object obj, long j2, boolean z) {
        this.a.putBoolean(obj, j2, z);
    }

    public final float e(Object obj, long j2) {
        return this.a.getFloat(obj, j2);
    }

    public final void f(Object obj, long j2, float f) {
        this.a.putFloat(obj, j2, f);
    }

    public final double g(Object obj, long j2) {
        return this.a.getDouble(obj, j2);
    }

    public final void h(Object obj, long j2, double d) {
        this.a.putDouble(obj, j2, d);
    }

    public final boolean i() {
        Class<Object> cls = Object.class;
        if (!super.i()) {
            return false;
        }
        try {
            Class<?> cls2 = this.a.getClass();
            Class cls3 = Long.TYPE;
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            y7.u(th);
            return false;
        }
    }

    public final boolean j() {
        Class<Object> cls = Object.class;
        if (!super.j()) {
            return false;
        }
        try {
            Class<?> cls2 = this.a.getClass();
            Class cls3 = Long.TYPE;
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            y7.u(th);
            return false;
        }
    }
}
