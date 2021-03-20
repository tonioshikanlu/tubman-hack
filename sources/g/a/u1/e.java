package g.a.u1;

import e.v.f;
import g.a.c0;
import g.a.r0;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class e extends r0 implements i, Executor {

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10020n = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: i  reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f10021i = new ConcurrentLinkedQueue<>();
    private volatile int inFlightTasks = 0;

    /* renamed from: j  reason: collision with root package name */
    public final c f10022j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10023k;

    /* renamed from: l  reason: collision with root package name */
    public final String f10024l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10025m;

    public e(c cVar, int i2, String str, int i3) {
        this.f10022j = cVar;
        this.f10023k = i2;
        this.f10024l = str;
        this.f10025m = i3;
    }

    public void H() {
        Runnable poll = this.f10021i.poll();
        if (poll != null) {
            c cVar = this.f10022j;
            Objects.requireNonNull(cVar);
            try {
                cVar.f10015i.z(poll, this, true);
            } catch (RejectedExecutionException unused) {
                c0.f9929o.v0(cVar.f10015i.e(poll, this));
            }
        } else {
            f10020n.decrementAndGet(this);
            Runnable poll2 = this.f10021i.poll();
            if (poll2 != null) {
                o0(poll2, true);
            }
        }
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        o0(runnable, false);
    }

    public int g0() {
        return this.f10025m;
    }

    public void m0(f fVar, Runnable runnable) {
        o0(runnable, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v6 java.lang.Runnable) binds: [B:0:0x0000, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o0(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f10020n
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f10023k
            if (r1 > r2) goto L_0x0021
            g.a.u1.c r0 = r3.f10022j
            java.util.Objects.requireNonNull(r0)
            g.a.u1.a r1 = r0.f10015i     // Catch:{ RejectedExecutionException -> 0x0015 }
            r1.z(r4, r3, r5)     // Catch:{ RejectedExecutionException -> 0x0015 }
            goto L_0x0020
        L_0x0015:
            g.a.c0 r5 = g.a.c0.f9929o
            g.a.u1.a r0 = r0.f10015i
            g.a.u1.h r4 = r0.e(r4, r3)
            r5.v0(r4)
        L_0x0020:
            return
        L_0x0021:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f10021i
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f10023k
            if (r4 < r0) goto L_0x002f
            return
        L_0x002f:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f10021i
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 == 0) goto L_0x003a
            goto L_0x0000
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.u1.e.o0(java.lang.Runnable, boolean):void");
    }

    public String toString() {
        String str = this.f10024l;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f10022j + ']';
    }
}
