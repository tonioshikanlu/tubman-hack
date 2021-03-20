package androidx.core.math;

public class MathUtils {
    private MathUtils() {
    }

    public static double clamp(double d, double d2, double d3) {
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    public static float clamp(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int clamp(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static long clamp(long j2, long j3, long j4) {
        return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
    }
}
