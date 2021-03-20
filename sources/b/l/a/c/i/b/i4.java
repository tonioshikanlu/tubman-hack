package b.l.a.c.i.b;

import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class i4 extends g5 {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicLong f4049k = new AtomicLong(Long.MIN_VALUE);
    @Nullable
    public h4 c;
    @Nullable
    public h4 d;

    /* renamed from: e  reason: collision with root package name */
    public final PriorityBlockingQueue<g4<?>> f4050e = new PriorityBlockingQueue<>();
    public final BlockingQueue<g4<?>> f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f4051g = new f4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f4052h = new f4(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i  reason: collision with root package name */
    public final Object f4053i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f4054j = new Semaphore(2);

    public i4(l4 l4Var) {
        super(l4Var);
    }

    public final void g() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void h() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean i() {
        return false;
    }

    public final boolean o() {
        return Thread.currentThread() == this.c;
    }

    public final <V> Future<V> p(Callable<V> callable) {
        l();
        g4 g4Var = new g4(this, callable, false);
        if (Thread.currentThread() == this.c) {
            if (!this.f4050e.isEmpty()) {
                this.a.a().f4091i.a("Callable skipped the worker queue.");
            }
            g4Var.run();
        } else {
            u(g4Var);
        }
        return g4Var;
    }

    public final void q(Runnable runnable) {
        l();
        Objects.requireNonNull(runnable, "null reference");
        u(new g4(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r5.length() == 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.a.a().f4091i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r5.length() != 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r1.a.a().f4091i;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T r(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ all -> 0x0054 }
            b.l.a.c.i.b.i4 r0 = r0.d()     // Catch:{ all -> 0x0054 }
            r0.q(r6)     // Catch:{ all -> 0x0054 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0033 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0032
            b.l.a.c.i.b.l4 r3 = r1.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f4091i
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0029
            java.lang.String r4 = r4.concat(r5)
            goto L_0x002f
        L_0x0029:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x002f:
            r3.a(r4)
        L_0x0032:
            return r2
        L_0x0033:
            b.l.a.c.i.b.l4 r3 = r1.a     // Catch:{ all -> 0x0054 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0054 }
            b.l.a.c.i.b.i3 r3 = r3.f4091i     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x0048
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0054 }
            goto L_0x004e
        L_0x0048:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0054 }
            r5.<init>(r4)     // Catch:{ all -> 0x0054 }
            r4 = r5
        L_0x004e:
            r3.a(r4)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r2 = 0
            return r2
        L_0x0054:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.i4.r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final void s(Runnable runnable) {
        l();
        u(new g4(this, runnable, true, "Task exception on worker thread"));
    }

    public final void t(Runnable runnable) {
        l();
        g4 g4Var = new g4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f4053i) {
            this.f.add(g4Var);
            h4 h4Var = this.d;
            if (h4Var == null) {
                h4 h4Var2 = new h4(this, "Measurement Network", this.f);
                this.d = h4Var2;
                h4Var2.setUncaughtExceptionHandler(this.f4052h);
                this.d.start();
            } else {
                synchronized (h4Var.f4035h) {
                    h4Var.f4035h.notifyAll();
                }
            }
        }
    }

    public final void u(g4<?> g4Var) {
        synchronized (this.f4053i) {
            this.f4050e.add(g4Var);
            h4 h4Var = this.c;
            if (h4Var == null) {
                h4 h4Var2 = new h4(this, "Measurement Worker", this.f4050e);
                this.c = h4Var2;
                h4Var2.setUncaughtExceptionHandler(this.f4051g);
                this.c.start();
            } else {
                synchronized (h4Var.f4035h) {
                    h4Var.f4035h.notifyAll();
                }
            }
        }
    }
}
