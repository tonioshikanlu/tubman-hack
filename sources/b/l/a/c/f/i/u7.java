package b.l.a.c.f.i;

import sun.misc.Unsafe;

public final class u7 extends x7 {
    public u7(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte a(Object obj, long j2) {
        if (y7.f3822i) {
            return y7.e(obj, j2);
        }
        return y7.f(obj, j2);
    }

    public final void b(Object obj, long j2, byte b2) {
        if (y7.f3822i) {
            y7.g(obj, j2, b2);
        } else {
            y7.h(obj, j2, b2);
        }
    }

    public final boolean c(Object obj, long j2) {
        if (y7.f3822i) {
            return y7.e(obj, j2) != 0;
        }
        if (y7.f(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    public final void d(Object obj, long j2, boolean z) {
        if (y7.f3822i) {
            y7.g(obj, j2, z);
        } else {
            y7.h(obj, j2, z ? (byte) 1 : 0);
        }
    }

    public final float e(Object obj, long j2) {
        return Float.intBitsToFloat(n(obj, j2));
    }

    public final void f(Object obj, long j2, float f) {
        o(obj, j2, Float.floatToIntBits(f));
    }

    public final double g(Object obj, long j2) {
        return Double.longBitsToDouble(p(obj, j2));
    }

    public final void h(Object obj, long j2, double d) {
        q(obj, j2, Double.doubleToLongBits(d));
    }
}
