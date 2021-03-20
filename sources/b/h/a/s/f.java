package b.h.a.s;

import android.os.SystemClock;

public final class f {
    public static final double a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f1014b = 0;

    public static double a(long j2) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j2)) * a;
    }
}
