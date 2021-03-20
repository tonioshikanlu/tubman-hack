package b.l.a.c.i.b;

import androidx.annotation.GuardedBy;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

public final class h4 extends Thread {

    /* renamed from: h  reason: collision with root package name */
    public final Object f4035h;

    /* renamed from: i  reason: collision with root package name */
    public final BlockingQueue<g4<?>> f4036i;
    @GuardedBy("threadLifeCycleLock")

    /* renamed from: j  reason: collision with root package name */
    public boolean f4037j = false;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ i4 f4038k;

    public h4(i4 i4Var, String str, BlockingQueue<g4<?>> blockingQueue) {
        this.f4038k = i4Var;
        Objects.requireNonNull(blockingQueue, "null reference");
        this.f4035h = new Object();
        this.f4036i = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f4038k.f4053i) {
            if (!this.f4037j) {
                this.f4038k.f4054j.release();
                this.f4038k.f4053i.notifyAll();
                i4 i4Var = this.f4038k;
                if (this == i4Var.c) {
                    i4Var.c = null;
                } else if (this == i4Var.d) {
                    i4Var.d = null;
                } else {
                    i4Var.a.a().f.a("Current scheduler thread is neither worker nor network");
                }
                this.f4037j = true;
            }
        }
    }

    public final void b(InterruptedException interruptedException) {
        this.f4038k.a.a().f4091i.b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x0012
            b.l.a.c.i.b.i4 r2 = r6.f4038k     // Catch:{ InterruptedException -> 0x000d }
            java.util.concurrent.Semaphore r2 = r2.f4054j     // Catch:{ InterruptedException -> 0x000d }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000d }
            r1 = r0
            goto L_0x0002
        L_0x000d:
            r2 = move-exception
            r6.b(r2)
            goto L_0x0002
        L_0x0012:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x007c }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x007c }
        L_0x001a:
            java.util.concurrent.BlockingQueue<b.l.a.c.i.b.g4<?>> r2 = r6.f4036i     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x007c }
            b.l.a.c.i.b.g4 r2 = (b.l.a.c.i.b.g4) r2     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x0033
            boolean r3 = r2.f4011i     // Catch:{ all -> 0x007c }
            if (r0 == r3) goto L_0x002b
            r3 = 10
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x007c }
            r2.run()     // Catch:{ all -> 0x007c }
            goto L_0x001a
        L_0x0033:
            java.lang.Object r2 = r6.f4035h     // Catch:{ all -> 0x007c }
            monitor-enter(r2)     // Catch:{ all -> 0x007c }
            java.util.concurrent.BlockingQueue<b.l.a.c.i.b.g4<?>> r3 = r6.f4036i     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x004f
            b.l.a.c.i.b.i4 r3 = r6.f4038k     // Catch:{ all -> 0x0079 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r6.f4035h     // Catch:{ InterruptedException -> 0x004b }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r3 = move-exception
            r6.b(r3)     // Catch:{ all -> 0x0079 }
        L_0x004f:
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            b.l.a.c.i.b.i4 r2 = r6.f4038k     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.f4053i     // Catch:{ all -> 0x007c }
            monitor-enter(r2)     // Catch:{ all -> 0x007c }
            java.util.concurrent.BlockingQueue<b.l.a.c.i.b.g4<?>> r3 = r6.f4036i     // Catch:{ all -> 0x0076 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0076 }
            if (r3 != 0) goto L_0x0074
            b.l.a.c.i.b.i4 r0 = r6.f4038k     // Catch:{ all -> 0x0076 }
            b.l.a.c.i.b.l4 r0 = r0.a     // Catch:{ all -> 0x0076 }
            b.l.a.c.i.b.f r0 = r0.f4114g     // Catch:{ all -> 0x0076 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r1 = b.l.a.c.i.b.x2.q0     // Catch:{ all -> 0x0076 }
            r3 = 0
            boolean r0 = r0.r(r3, r1)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x006f
            r6.a()     // Catch:{ all -> 0x0076 }
        L_0x006f:
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            r6.a()
            return
        L_0x0074:
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            goto L_0x001a
        L_0x0076:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0079:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            r6.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.h4.run():void");
    }
}
