package g.a.u1;

import e.a.a.a.y0.m.o1.c;
import e.a0.e;
import g.a.a.r;
import java.util.concurrent.TimeUnit;

public final class k {
    public static final long a = c.n0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f10030b;
    public static final int c;
    public static final long d = TimeUnit.SECONDS.toNanos(c.n0("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e  reason: collision with root package name */
    public static l f10031e = f.a;

    static {
        c.m0("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
        int i2 = r.a;
        int m0 = c.m0("kotlinx.coroutines.scheduler.core.pool.size", i2 < 2 ? 2 : i2, 1, 0, 8, (Object) null);
        f10030b = m0;
        c = c.m0("kotlinx.coroutines.scheduler.max.pool.size", e.a(i2 * 128, m0, 2097150), 0, 2097150, 4, (Object) null);
    }
}
