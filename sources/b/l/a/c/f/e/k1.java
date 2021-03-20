package b.l.a.c.f.e;

import sun.misc.Unsafe;

public final class k1 extends m1 {
    public k1(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte a(Object obj, long j2) {
        if (n1.f3185i) {
            return n1.e(obj, j2);
        }
        return n1.f(obj, j2);
    }

    public final void b(Object obj, long j2, byte b2) {
        if (n1.f3185i) {
            n1.g(obj, j2, b2);
        } else {
            n1.h(obj, j2, b2);
        }
    }

    public final boolean c(Object obj, long j2) {
        if (n1.f3185i) {
            return n1.e(obj, j2) != 0;
        }
        if (n1.f(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    public final void d(Object obj, long j2, boolean z) {
        if (n1.f3185i) {
            n1.g(obj, j2, z);
        } else {
            n1.h(obj, j2, z ? (byte) 1 : 0);
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
