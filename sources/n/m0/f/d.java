package n.m0.f;

import androidx.appcompat.widget.ActivityChooserView;
import e.x.c.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f10159h;

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f10160i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f10161j = new b((DefaultConstructorMarker) null);
    public int a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10162b;
    public long c;
    public final List<c> d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final List<c> f10163e = new ArrayList();
    public final Runnable f = new C0233d(this);

    /* renamed from: g  reason: collision with root package name */
    public final a f10164g;

    public interface a {
        void a(d dVar);

        void b(d dVar, long j2);

        long c();

        void execute(Runnable runnable);
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Logger a() {
            return d.f10160i;
        }
    }

    public static final class c implements a {
        public final ThreadPoolExecutor a;

        public c(ThreadFactory threadFactory) {
            i.e(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public void a(d dVar) {
            i.e(dVar, "taskRunner");
            dVar.notify();
        }

        public void b(d dVar, long j2) {
            i.e(dVar, "taskRunner");
            long j3 = j2 / 1000000;
            long j4 = j2 - (1000000 * j3);
            if (j3 > 0 || j2 > 0) {
                dVar.wait(j3, (int) j4);
            }
        }

        public long c() {
            return System.nanoTime();
        }

        public void execute(Runnable runnable) {
            i.e(runnable, "runnable");
            this.a.execute(runnable);
        }
    }

    /* renamed from: n.m0.f.d$d  reason: collision with other inner class name */
    public static final class C0233d implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f10165h;

        public C0233d(d dVar) {
            this.f10165h = dVar;
        }

        public void run() {
            a c;
            while (true) {
                synchronized (this.f10165h) {
                    c = this.f10165h.c();
                }
                if (c != null) {
                    c cVar = c.a;
                    i.c(cVar);
                    long j2 = -1;
                    b bVar = d.f10161j;
                    boolean isLoggable = d.f10160i.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j2 = cVar.f10158e.f10164g.c();
                        e.a.a.a.y0.m.o1.c.d(c, cVar, "starting");
                    }
                    try {
                        d.a(this.f10165h, c);
                        if (isLoggable) {
                            long c2 = cVar.f10158e.f10164g.c() - j2;
                            StringBuilder y = b.e.a.a.a.y("finished run in ");
                            y.append(e.a.a.a.y0.m.o1.c.A(c2));
                            e.a.a.a.y0.m.o1.c.d(c, cVar, y.toString());
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            long c3 = cVar.f10158e.f10164g.c() - j2;
                            StringBuilder y2 = b.e.a.a.a.y("failed a run in ");
                            y2.append(e.a.a.a.y0.m.o1.c.A(c3));
                            e.a.a.a.y0.m.o1.c.d(c, cVar, y2.toString());
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        String str = n.m0.c.f10152g + " TaskRunner";
        i.e(str, "name");
        f10159h = new d(new c(new n.m0.b(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        i.d(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f10160i = logger;
    }

    public d(a aVar) {
        i.e(aVar, "backend");
        this.f10164g = aVar;
    }

    public static final void a(d dVar, a aVar) {
        Objects.requireNonNull(dVar);
        byte[] bArr = n.m0.c.a;
        Thread currentThread = Thread.currentThread();
        i.d(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.c);
        try {
            long a2 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a2);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j2) {
        byte[] bArr = n.m0.c.a;
        c cVar = aVar.a;
        i.c(cVar);
        if (cVar.f10157b == aVar) {
            boolean z = cVar.d;
            cVar.d = false;
            cVar.f10157b = null;
            this.d.remove(cVar);
            if (j2 != -1 && !z && !cVar.a) {
                cVar.d(aVar, j2, true);
            }
            if (!cVar.c.isEmpty()) {
                this.f10163e.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:29|30|31|34|35|42|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r14.f10162b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n.m0.f.a c() {
        /*
            r14 = this;
            byte[] r0 = n.m0.c.a
        L_0x0002:
            java.util.List<n.m0.f.c> r0 = r14.f10163e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            n.m0.f.d$a r0 = r14.f10164g
            long r2 = r0.c()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<n.m0.f.c> r0 = r14.f10163e
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x001e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r0.next()
            n.m0.f.c r7 = (n.m0.f.c) r7
            java.util.List<n.m0.f.a> r7 = r7.c
            java.lang.Object r7 = r7.get(r9)
            n.m0.f.a r7 = (n.m0.f.a) r7
            long r10 = r7.f10155b
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0046
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x001e
        L_0x0046:
            if (r6 == 0) goto L_0x004a
            r0 = r8
            goto L_0x004d
        L_0x004a:
            r6 = r7
            goto L_0x001e
        L_0x004c:
            r0 = r9
        L_0x004d:
            if (r6 == 0) goto L_0x0082
            byte[] r1 = n.m0.c.a
            r1 = -1
            r6.f10155b = r1
            n.m0.f.c r1 = r6.a
            e.x.c.i.c(r1)
            java.util.List<n.m0.f.a> r2 = r1.c
            r2.remove(r6)
            java.util.List<n.m0.f.c> r2 = r14.f10163e
            r2.remove(r1)
            r1.f10157b = r6
            java.util.List<n.m0.f.c> r2 = r14.d
            r2.add(r1)
            if (r0 != 0) goto L_0x007a
            boolean r0 = r14.f10162b
            if (r0 != 0) goto L_0x0081
            java.util.List<n.m0.f.c> r0 = r14.f10163e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0081
        L_0x007a:
            n.m0.f.d$a r0 = r14.f10164g
            java.lang.Runnable r1 = r14.f
            r0.execute(r1)
        L_0x0081:
            return r6
        L_0x0082:
            boolean r0 = r14.f10162b
            if (r0 == 0) goto L_0x0093
            long r6 = r14.c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            n.m0.f.d$a r0 = r14.f10164g
            r0.a(r14)
        L_0x0092:
            return r1
        L_0x0093:
            r14.f10162b = r8
            long r2 = r2 + r4
            r14.c = r2
            n.m0.f.d$a r0 = r14.f10164g     // Catch:{ InterruptedException -> 0x00a3 }
            r0.b(r14, r4)     // Catch:{ InterruptedException -> 0x00a3 }
        L_0x009d:
            r14.f10162b = r9
            goto L_0x0002
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a3:
            r14.d()     // Catch:{ all -> 0x00a1 }
            goto L_0x009d
        L_0x00a7:
            r14.f10162b = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.f.d.c():n.m0.f.a");
    }

    public final void d() {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            this.d.get(size).b();
        }
        for (int size2 = this.f10163e.size() - 1; size2 >= 0; size2--) {
            c cVar = this.f10163e.get(size2);
            cVar.b();
            if (cVar.c.isEmpty()) {
                this.f10163e.remove(size2);
            }
        }
    }

    public final void e(c cVar) {
        i.e(cVar, "taskQueue");
        byte[] bArr = n.m0.c.a;
        if (cVar.f10157b == null) {
            if (!cVar.c.isEmpty()) {
                List<c> list = this.f10163e;
                i.e(list, "$this$addIfAbsent");
                if (!list.contains(cVar)) {
                    list.add(cVar);
                }
            } else {
                this.f10163e.remove(cVar);
            }
        }
        if (this.f10162b) {
            this.f10164g.a(this);
        } else {
            this.f10164g.execute(this.f);
        }
    }

    public final c f() {
        int i2;
        synchronized (this) {
            i2 = this.a;
            this.a = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        return new c(this, sb.toString());
    }
}
