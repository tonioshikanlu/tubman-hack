package g.a.u1;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import e.x.c.i;
import e.z.c;
import g.a.a.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

public final class a implements Executor, Closeable {

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9989o = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9990p = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9991q = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    public static final q r = new q("NOT_IN_STACK");
    private volatile int _isTerminated;
    public volatile long controlState;

    /* renamed from: h  reason: collision with root package name */
    public final d f9992h;

    /* renamed from: i  reason: collision with root package name */
    public final d f9993i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReferenceArray<C0230a> f9994j;

    /* renamed from: k  reason: collision with root package name */
    public final int f9995k;

    /* renamed from: l  reason: collision with root package name */
    public final int f9996l;

    /* renamed from: m  reason: collision with root package name */
    public final long f9997m;

    /* renamed from: n  reason: collision with root package name */
    public final String f9998n;
    private volatile long parkedWorkersStack;

    /* renamed from: g.a.u1.a$a  reason: collision with other inner class name */
    public final class C0230a extends Thread {

        /* renamed from: o  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f9999o = AtomicIntegerFieldUpdater.newUpdater(C0230a.class, "workerCtl");

        /* renamed from: h  reason: collision with root package name */
        public final m f10000h = new m();

        /* renamed from: i  reason: collision with root package name */
        public b f10001i = b.DORMANT;
        public volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public long f10002j;

        /* renamed from: k  reason: collision with root package name */
        public long f10003k;

        /* renamed from: l  reason: collision with root package name */
        public int f10004l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f10005m;
        public volatile Object nextParkedWorker = a.r;
        public volatile int workerCtl = 0;

        public C0230a(int i2) {
            setDaemon(true);
            c.a aVar = c.f7991b;
            this.f10004l = c.a.a();
            d(i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final g.a.u1.h a(boolean r11) {
            /*
                r10 = this;
                g.a.u1.a$b r0 = g.a.u1.a.b.CPU_ACQUIRED
                g.a.u1.a$b r1 = r10.f10001i
                r2 = 0
                r3 = 1
                if (r1 != r0) goto L_0x0009
                goto L_0x0030
            L_0x0009:
                g.a.u1.a r1 = g.a.u1.a.this
            L_0x000b:
                long r6 = r1.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r8 = 42
                long r4 = r4 >> r8
                int r4 = (int) r4
                if (r4 != 0) goto L_0x001b
                r1 = r2
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = g.a.u1.a.f9990p
                r5 = r1
                boolean r4 = r4.compareAndSet(r5, r6, r8)
                if (r4 == 0) goto L_0x000b
                r1 = r3
            L_0x002c:
                if (r1 == 0) goto L_0x0032
                r10.f10001i = r0
            L_0x0030:
                r0 = r3
                goto L_0x0033
            L_0x0032:
                r0 = r2
            L_0x0033:
                if (r0 == 0) goto L_0x006c
                if (r11 == 0) goto L_0x0060
                g.a.u1.a r11 = g.a.u1.a.this
                int r11 = r11.f9995k
                int r11 = r11 * 2
                int r11 = r10.b(r11)
                if (r11 != 0) goto L_0x0044
                goto L_0x0045
            L_0x0044:
                r3 = r2
            L_0x0045:
                if (r3 == 0) goto L_0x004e
                g.a.u1.h r11 = r10.c()
                if (r11 == 0) goto L_0x004e
                goto L_0x006b
            L_0x004e:
                g.a.u1.m r11 = r10.f10000h
                g.a.u1.h r11 = r11.e()
                if (r11 == 0) goto L_0x0057
                goto L_0x006b
            L_0x0057:
                if (r3 != 0) goto L_0x0067
                g.a.u1.h r11 = r10.c()
                if (r11 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0060:
                g.a.u1.h r11 = r10.c()
                if (r11 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                g.a.u1.h r11 = r10.f(r2)
            L_0x006b:
                return r11
            L_0x006c:
                if (r11 == 0) goto L_0x0077
                g.a.u1.m r11 = r10.f10000h
                g.a.u1.h r11 = r11.e()
                if (r11 == 0) goto L_0x0077
                goto L_0x0081
            L_0x0077:
                g.a.u1.a r11 = g.a.u1.a.this
                g.a.u1.d r11 = r11.f9993i
                java.lang.Object r11 = r11.d()
                g.a.u1.h r11 = (g.a.u1.h) r11
            L_0x0081:
                if (r11 == 0) goto L_0x0084
                goto L_0x0088
            L_0x0084:
                g.a.u1.h r11 = r10.f(r3)
            L_0x0088:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.u1.a.C0230a.a(boolean):g.a.u1.h");
        }

        public final int b(int i2) {
            int i3 = this.f10004l;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f10004l = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) % i2;
        }

        public final h c() {
            d dVar;
            if (b(2) == 0) {
                h hVar = (h) a.this.f9992h.d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = a.this.f9993i;
            } else {
                h hVar2 = (h) a.this.f9993i.d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = a.this.f9992h;
            }
            return (h) dVar.d();
        }

        public final void d(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f9998n);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final boolean e(b bVar) {
            b bVar2 = this.f10001i;
            boolean z = bVar2 == b.CPU_ACQUIRED;
            if (z) {
                a.f9990p.addAndGet(a.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.f10001i = bVar;
            }
            return z;
        }

        public final h f(boolean z) {
            long j2;
            long j3;
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int b2 = b(i2);
            long j4 = RecyclerView.FOREVER_NS;
            for (int i3 = 0; i3 < i2; i3++) {
                b2++;
                if (b2 > i2) {
                    b2 = 1;
                }
                C0230a aVar = a.this.f9994j.get(b2);
                if (!(aVar == null || aVar == this)) {
                    m mVar = this.f10000h;
                    m mVar2 = aVar.f10000h;
                    if (z) {
                        j2 = mVar.g(mVar2);
                    } else {
                        Objects.requireNonNull(mVar);
                        h f = mVar2.f();
                        if (f != null) {
                            mVar.a(f, false);
                            j3 = -1;
                        } else {
                            j3 = mVar.h(mVar2, false);
                        }
                        j2 = j3;
                    }
                    if (j2 == -1) {
                        return this.f10000h.e();
                    }
                    if (j2 > 0) {
                        j4 = Math.min(j4, j2);
                    }
                }
            }
            if (j4 == RecyclerView.FOREVER_NS) {
                j4 = 0;
            }
            this.f10003k = j4;
            return null;
        }

        public void run() {
            b bVar = b.PARKING;
            b bVar2 = b.TERMINATED;
            loop0:
            while (true) {
                boolean z = false;
                while (!a.this.isTerminated() && this.f10001i != bVar2) {
                    h a = a(this.f10005m);
                    if (a == null) {
                        this.f10005m = false;
                        if (this.f10003k == 0) {
                            if (this.nextParkedWorker != a.r) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != a.r) || a.this.isTerminated() || this.f10001i == bVar2) {
                                        break;
                                    }
                                    e(bVar);
                                    Thread.interrupted();
                                    if (this.f10002j == 0) {
                                        this.f10002j = System.nanoTime() + a.this.f9997m;
                                    }
                                    LockSupport.parkNanos(a.this.f9997m);
                                    if (System.nanoTime() - this.f10002j >= 0) {
                                        this.f10002j = 0;
                                        synchronized (a.this.f9994j) {
                                            if (!a.this.isTerminated()) {
                                                if (((int) (a.this.controlState & 2097151)) > a.this.f9995k) {
                                                    if (f9999o.compareAndSet(this, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        d(0);
                                                        a.this.O(this, i2, 0);
                                                        int andDecrement = (int) (a.f9990p.getAndDecrement(a.this) & 2097151);
                                                        if (andDecrement != i2) {
                                                            C0230a aVar = a.this.f9994j.get(andDecrement);
                                                            i.c(aVar);
                                                            C0230a aVar2 = aVar;
                                                            a.this.f9994j.set(i2, aVar2);
                                                            aVar2.d(i2);
                                                            a.this.O(aVar2, andDecrement, i2);
                                                        }
                                                        a.this.f9994j.set(andDecrement, (Object) null);
                                                        this.f10001i = bVar2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                a.this.N(this);
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            e(bVar);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f10003k);
                            this.f10003k = 0;
                        }
                    } else {
                        this.f10003k = 0;
                        b bVar3 = b.BLOCKING;
                        int g0 = a.f10028i.g0();
                        this.f10002j = 0;
                        if (this.f10001i == bVar) {
                            this.f10001i = bVar3;
                        }
                        if (g0 != 0 && e(bVar3)) {
                            a.this.Y();
                        }
                        a.this.S(a);
                        if (g0 != 0) {
                            a.f9990p.addAndGet(a.this, -2097152);
                            if (this.f10001i != bVar2) {
                                this.f10001i = b.DORMANT;
                            }
                        }
                    }
                }
            }
            e(bVar2);
        }
    }

    public enum b {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i2, int i3, long j2, String str) {
        this.f9995k = i2;
        this.f9996l = i3;
        this.f9997m = j2;
        this.f9998n = str;
        if (i2 >= 1) {
            if (i3 >= i2) {
                if (i3 <= 2097150) {
                    if (j2 > 0) {
                        this.f9992h = new d();
                        this.f9993i = new d();
                        this.parkedWorkersStack = 0;
                        this.f9994j = new AtomicReferenceArray<>(i3 + 1);
                        this.controlState = ((long) i2) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(b.e.a.a.a.h("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(b.e.a.a.a.i("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        throw new IllegalArgumentException(b.e.a.a.a.h("Core pool size ", i2, " should be at least 1").toString());
    }

    public final int H(C0230a aVar) {
        int i2;
        do {
            Object obj = aVar.nextParkedWorker;
            if (obj == r) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            aVar = (C0230a) obj;
            i2 = aVar.indexInArray;
        } while (i2 == 0);
        return i2;
    }

    public final boolean N(C0230a aVar) {
        long j2;
        int i2;
        if (aVar.nextParkedWorker != r) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            i2 = aVar.indexInArray;
            aVar.nextParkedWorker = this.f9994j.get((int) (2097151 & j2));
        } while (!f9989o.compareAndSet(this, j2, ((2097152 + j2) & -2097152) | ((long) i2)));
        return true;
    }

    public final void O(C0230a aVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                i4 = i3 == 0 ? H(aVar) : i3;
            }
            if (i4 >= 0) {
                if (f9989o.compareAndSet(this, j2, j3 | ((long) i4))) {
                    return;
                }
            }
        }
    }

    public final void S(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public final void Y() {
        if (!g0() && !e0(this.controlState)) {
            g0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<g.a.u1.a$a> r0 = r10.f9994j
            monitor-enter(r0)
            int r1 = r10._isTerminated     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x000a
            r1 = -1
        L_0x0008:
            monitor-exit(r0)
            return r1
        L_0x000a:
            long r1 = r10.controlState     // Catch:{ all -> 0x0077 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x0077 }
            int r1 = r5 - r1
            r2 = 0
            if (r1 >= 0) goto L_0x0022
            r1 = r2
        L_0x0022:
            int r6 = r10.f9995k     // Catch:{ all -> 0x0077 }
            if (r1 < r6) goto L_0x0028
            monitor-exit(r0)
            return r2
        L_0x0028:
            int r6 = r10.f9996l     // Catch:{ all -> 0x0077 }
            if (r5 < r6) goto L_0x002e
            monitor-exit(r0)
            return r2
        L_0x002e:
            long r5 = r10.controlState     // Catch:{ all -> 0x0077 }
            long r5 = r5 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 1
            int r5 = r5 + r6
            if (r5 <= 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicReferenceArray<g.a.u1.a$a> r7 = r10.f9994j     // Catch:{ all -> 0x0077 }
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x0077 }
            if (r7 != 0) goto L_0x0040
            r7 = r6
            goto L_0x0041
        L_0x0040:
            r7 = r2
        L_0x0041:
            if (r7 == 0) goto L_0x006b
            g.a.u1.a$a r7 = new g.a.u1.a$a     // Catch:{ all -> 0x0077 }
            r7.<init>(r5)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReferenceArray<g.a.u1.a$a> r8 = r10.f9994j     // Catch:{ all -> 0x0077 }
            r8.set(r5, r7)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f9990p     // Catch:{ all -> 0x0077 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0077 }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x0077 }
            if (r5 != r3) goto L_0x0058
            r2 = r6
        L_0x0058:
            if (r2 == 0) goto L_0x005f
            r7.start()     // Catch:{ all -> 0x0077 }
            int r1 = r1 + r6
            goto L_0x0008
        L_0x005f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x006b:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.u1.a.b():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f9991q
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x009c
        L_0x000c:
            g.a.u1.a$a r0 = r9.q()
            java.util.concurrent.atomic.AtomicReferenceArray<g.a.u1.a$a> r3 = r9.f9994j
            monitor-enter(r3)
            long r4 = r9.controlState     // Catch:{ all -> 0x009d }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r3)
            if (r2 > r4) goto L_0x0063
            r3 = r2
        L_0x001e:
            java.util.concurrent.atomic.AtomicReferenceArray<g.a.u1.a$a> r5 = r9.f9994j
            java.lang.Object r5 = r5.get(r3)
            e.x.c.i.c(r5)
            g.a.u1.a$a r5 = (g.a.u1.a.C0230a) r5
            if (r5 == r0) goto L_0x005e
        L_0x002b:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L_0x003a
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x002b
        L_0x003a:
            g.a.u1.m r5 = r5.f10000h
            g.a.u1.d r6 = r9.f9993i
            java.util.Objects.requireNonNull(r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = g.a.u1.m.f10032b
            r8 = 0
            java.lang.Object r7 = r7.getAndSet(r5, r8)
            g.a.u1.h r7 = (g.a.u1.h) r7
            if (r7 == 0) goto L_0x004f
            r6.a(r7)
        L_0x004f:
            g.a.u1.h r7 = r5.f()
            if (r7 == 0) goto L_0x005a
            r6.a(r7)
            r7 = r2
            goto L_0x005b
        L_0x005a:
            r7 = r1
        L_0x005b:
            if (r7 == 0) goto L_0x005e
            goto L_0x004f
        L_0x005e:
            if (r3 == r4) goto L_0x0063
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0063:
            g.a.u1.d r1 = r9.f9993i
            r1.b()
            g.a.u1.d r1 = r9.f9992h
            r1.b()
        L_0x006d:
            if (r0 == 0) goto L_0x0076
            g.a.u1.h r1 = r0.a(r2)
            if (r1 == 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            g.a.u1.d r1 = r9.f9992h
            java.lang.Object r1 = r1.d()
            g.a.u1.h r1 = (g.a.u1.h) r1
        L_0x007e:
            if (r1 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            g.a.u1.d r1 = r9.f9993i
            java.lang.Object r1 = r1.d()
            g.a.u1.h r1 = (g.a.u1.h) r1
        L_0x0089:
            if (r1 == 0) goto L_0x008f
            r9.S(r1)
            goto L_0x006d
        L_0x008f:
            if (r0 == 0) goto L_0x0096
            g.a.u1.a$b r1 = g.a.u1.a.b.TERMINATED
            r0.e(r1)
        L_0x0096:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L_0x009c:
            return
        L_0x009d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.u1.a.close():void");
    }

    public final h e(Runnable runnable, i iVar) {
        long a = k.f10031e.a();
        if (!(runnable instanceof h)) {
            return new j(runnable, a, iVar);
        }
        h hVar = (h) runnable;
        hVar.f10027h = a;
        hVar.f10028i = iVar;
        return hVar;
    }

    public final boolean e0(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 < this.f9995k) {
            int b2 = b();
            if (b2 == 1 && this.f9995k > 1) {
                b();
            }
            if (b2 > 0) {
                return true;
            }
        }
        return false;
    }

    public void execute(Runnable runnable) {
        z(runnable, g.f10026h, false);
    }

    public final boolean g0() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            C0230a aVar = this.f9994j.get((int) (2097151 & j2));
            if (aVar != null) {
                long j3 = (2097152 + j2) & -2097152;
                int H = H(aVar);
                if (H < 0) {
                    continue;
                } else {
                    if (f9989o.compareAndSet(this, j2, ((long) H) | j3)) {
                        aVar.nextParkedWorker = r;
                    } else {
                        continue;
                    }
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return false;
            }
            if (C0230a.f9999o.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final C0230a q() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C0230a)) {
            currentThread = null;
        }
        C0230a aVar = (C0230a) currentThread;
        if (aVar == null || !i.a(a.this, this)) {
            return null;
        }
        return aVar;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        int length = this.f9994j.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < length; i7++) {
            C0230a aVar = this.f9994j.get(i7);
            if (aVar != null) {
                int d = aVar.f10000h.d();
                int ordinal = aVar.f10001i.ordinal();
                if (ordinal == 0) {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(d));
                    str = "c";
                } else if (ordinal == 1) {
                    i3++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(d));
                    str = "b";
                } else if (ordinal == 2) {
                    i4++;
                } else if (ordinal == 3) {
                    i5++;
                    if (d > 0) {
                        sb = new StringBuilder();
                        sb.append(String.valueOf(d));
                        str = "d";
                    }
                } else if (ordinal == 4) {
                    i6++;
                }
                sb.append(str);
                arrayList.add(sb.toString());
            }
        }
        long j2 = this.controlState;
        return this.f9998n + '@' + e.a.a.a.y0.m.o1.c.F(this) + '[' + "Pool Size {" + "core = " + this.f9995k + ", " + "max = " + this.f9996l + "}, " + "Worker States {" + "CPU = " + i2 + ", " + "blocking = " + i3 + ", " + "parked = " + i4 + ", " + "dormant = " + i5 + ", " + "terminated = " + i6 + "}, " + "running workers queues = " + arrayList + ", " + "global CPU queue size = " + this.f9992h.c() + ", " + "global blocking queue size = " + this.f9993i.c() + ", " + "Control State {" + "created workers= " + ((int) (2097151 & j2)) + ", " + "blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", " + "CPUs acquired = " + (this.f9995k - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final void z(Runnable runnable, i iVar, boolean z) {
        h hVar;
        h e2 = e(runnable, iVar);
        C0230a q2 = q();
        boolean z2 = true;
        if (q2 == null || q2.f10001i == b.TERMINATED || (e2.f10028i.g0() == 0 && q2.f10001i == b.BLOCKING)) {
            hVar = e2;
        } else {
            q2.f10005m = true;
            hVar = q2.f10000h.a(e2, z);
        }
        if (hVar != null) {
            if (!(hVar.f10028i.g0() == 1 ? this.f9993i : this.f9992h).a(hVar)) {
                throw new RejectedExecutionException(b.e.a.a.a.q(new StringBuilder(), this.f9998n, " was terminated"));
            }
        }
        if (!z || q2 == null) {
            z2 = false;
        }
        if (e2.f10028i.g0() != 0) {
            long addAndGet = f9990p.addAndGet(this, 2097152);
            if (!z2 && !g0() && !e0(addAndGet)) {
                g0();
            }
        } else if (!z2) {
            Y();
        }
    }
}
