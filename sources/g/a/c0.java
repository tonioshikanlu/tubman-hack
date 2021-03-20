package g.a;

import java.util.concurrent.TimeUnit;

public final class c0 extends n0 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* renamed from: n  reason: collision with root package name */
    public static final long f9928n;

    /* renamed from: o  reason: collision with root package name */
    public static final c0 f9929o;

    static {
        Long l2;
        c0 c0Var = new c0();
        f9929o = c0Var;
        c0Var.r0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f9928n = timeUnit.toNanos(l2.longValue());
    }

    public final synchronized void B0() {
        if (C0()) {
            debugStatus = 3;
            z0();
            notifyAll();
        }
    }

    public final boolean C0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        _thread = null;
        B0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (x0() == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008f, code lost:
        u0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0092, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            g.a.p1 r0 = g.a.p1.f9975b
            java.lang.ThreadLocal<g.a.m0> r0 = g.a.p1.a
            r0.set(r12)
            r0 = 0
            monitor-enter(r12)     // Catch:{ all -> 0x0083 }
            boolean r1 = r12.C0()     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0011
            r1 = 0
            goto L_0x0017
        L_0x0011:
            r1 = 1
            debugStatus = r1     // Catch:{ all -> 0x0080 }
            r12.notifyAll()     // Catch:{ all -> 0x0080 }
        L_0x0017:
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0029
            _thread = r0
            r12.B0()
            boolean r0 = r12.x0()
            if (r0 != 0) goto L_0x0028
            r12.u0()
        L_0x0028:
            return
        L_0x0029:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L_0x002f:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0083 }
            long r5 = r12.y0()     // Catch:{ all -> 0x0083 }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0062
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0083 }
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0047
            long r3 = f9928n     // Catch:{ all -> 0x0083 }
            long r3 = r3 + r10
        L_0x0047:
            long r10 = r3 - r10
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x005c
            _thread = r0
            r12.B0()
            boolean r0 = r12.x0()
            if (r0 != 0) goto L_0x005b
            r12.u0()
        L_0x005b:
            return
        L_0x005c:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0063
            r5 = r10
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x002f
            boolean r7 = r12.C0()     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x007c
            _thread = r0
            r12.B0()
            boolean r0 = r12.x0()
            if (r0 != 0) goto L_0x007b
            r12.u0()
        L_0x007b:
            return
        L_0x007c:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch:{ all -> 0x0083 }
            goto L_0x002f
        L_0x0080:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            _thread = r0
            r12.B0()
            boolean r0 = r12.x0()
            if (r0 != 0) goto L_0x0092
            r12.u0()
        L_0x0092:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.c0.run():void");
    }

    public Thread u0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }
}
