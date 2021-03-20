package g.a;

import e.v.f;
import g.a.a.l;
import g.a.a.q;
import g.a.a.s;
import g.a.a.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public abstract class n0 extends o0 {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9967l;

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9968m;
    private volatile Object _delayed = null;
    public volatile int _isCompleted = 0;
    private volatile Object _queue = null;

    public static abstract class a implements Runnable, Comparable<a>, j0, t {

        /* renamed from: h  reason: collision with root package name */
        public Object f9969h;

        /* renamed from: i  reason: collision with root package name */
        public int f9970i;

        /* renamed from: j  reason: collision with root package name */
        public long f9971j;

        public int compareTo(Object obj) {
            int i2 = ((this.f9971j - ((a) obj).f9971j) > 0 ? 1 : ((this.f9971j - ((a) obj).f9971j) == 0 ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            return i2 < 0 ? -1 : 0;
        }

        public void d(int i2) {
            this.f9970i = i2;
        }

        public final synchronized void e() {
            Object obj = this.f9969h;
            q qVar = p0.a;
            if (obj != qVar) {
                if (!(obj instanceof b)) {
                    obj = null;
                }
                b bVar = (b) obj;
                if (bVar != null) {
                    synchronized (bVar) {
                        if (m() != null) {
                            bVar.c(h());
                        }
                    }
                }
                this.f9969h = qVar;
            }
        }

        public int h() {
            return this.f9970i;
        }

        public void j(s<?> sVar) {
            if (this.f9969h != p0.a) {
                this.f9969h = sVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public s<?> m() {
            Object obj = this.f9969h;
            if (!(obj instanceof s)) {
                obj = null;
            }
            return (s) obj;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("Delayed[nanos=");
            y.append(this.f9971j);
            y.append(']');
            return y.toString();
        }
    }

    public static final class b extends s<a> {

        /* renamed from: b  reason: collision with root package name */
        public long f9972b;

        public b(long j2) {
            this.f9972b = j2;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<n0> cls2 = n0.class;
        f9967l = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f9968m = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [g.a.a.t] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        if ((r8 - r0.f9972b) > 0) goto L_0x0050;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0(long r13, g.a.n0.a r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x000a
            r0 = r4
            goto L_0x0063
        L_0x000a:
            java.lang.Object r0 = r12._delayed
            g.a.n0$b r0 = (g.a.n0.b) r0
            if (r0 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f9968m
            g.a.n0$b r5 = new g.a.n0$b
            r5.<init>(r13)
            r0.compareAndSet(r12, r3, r5)
            java.lang.Object r0 = r12._delayed
            e.x.c.i.c(r0)
            g.a.n0$b r0 = (g.a.n0.b) r0
        L_0x0022:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f9969h     // Catch:{ all -> 0x00a5 }
            g.a.a.q r6 = g.a.p0.a     // Catch:{ all -> 0x00a5 }
            if (r5 != r6) goto L_0x002b
            r0 = r2
            goto L_0x0062
        L_0x002b:
            monitor-enter(r0)     // Catch:{ all -> 0x00a5 }
            g.a.a.t r5 = r0.b()     // Catch:{ all -> 0x00a2 }
            g.a.n0$a r5 = (g.a.n0.a) r5     // Catch:{ all -> 0x00a2 }
            int r6 = r12._isCompleted     // Catch:{ all -> 0x00a2 }
            if (r6 == 0) goto L_0x0039
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            r0 = r4
            goto L_0x0062
        L_0x0039:
            r6 = 0
            if (r5 != 0) goto L_0x003f
            r8 = r13
            goto L_0x0050
        L_0x003f:
            long r8 = r5.f9971j     // Catch:{ all -> 0x00a2 }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0048
            r8 = r13
        L_0x0048:
            long r10 = r0.f9972b     // Catch:{ all -> 0x00a2 }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0052
        L_0x0050:
            r0.f9972b = r8     // Catch:{ all -> 0x00a2 }
        L_0x0052:
            long r8 = r15.f9971j     // Catch:{ all -> 0x00a2 }
            long r10 = r0.f9972b     // Catch:{ all -> 0x00a2 }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x005d
            r15.f9971j = r10     // Catch:{ all -> 0x00a2 }
        L_0x005d:
            r0.a(r15)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            r0 = r1
        L_0x0062:
            monitor-exit(r15)
        L_0x0063:
            if (r0 == 0) goto L_0x007c
            if (r0 == r4) goto L_0x0076
            if (r0 != r2) goto L_0x006a
            goto L_0x00a1
        L_0x006a:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x0076:
            g.a.c0 r0 = g.a.c0.f9929o
            r0.A0(r13, r15)
            goto L_0x00a1
        L_0x007c:
            java.lang.Object r13 = r12._delayed
            g.a.n0$b r13 = (g.a.n0.b) r13
            if (r13 == 0) goto L_0x008f
            monitor-enter(r13)
            g.a.a.t r14 = r13.b()     // Catch:{ all -> 0x008c }
            monitor-exit(r13)
            r3 = r14
            g.a.n0$a r3 = (g.a.n0.a) r3
            goto L_0x008f
        L_0x008c:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x008f:
            if (r3 != r15) goto L_0x0092
            r1 = r4
        L_0x0092:
            if (r1 == 0) goto L_0x00a1
            java.lang.Thread r13 = r12.u0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x00a1
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x00a1:
            return
        L_0x00a2:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            throw r13     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.n0.A0(long, g.a.n0$a):void");
    }

    public final void m0(f fVar, Runnable runnable) {
        v0(runnable);
    }

    public void shutdown() {
        t c;
        p1 p1Var = p1.f9975b;
        p1.a.set((Object) null);
        this._isCompleted = 1;
        q qVar = p0.f9974b;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f9967l.compareAndSet(this, (Object) null, qVar)) {
                    break;
                }
            } else if (obj instanceof l) {
                ((l) obj).b();
                break;
            } else if (obj == qVar) {
                break;
            } else {
                l lVar = new l(8, true);
                lVar.a((Runnable) obj);
                if (f9967l.compareAndSet(this, obj, lVar)) {
                    break;
                }
            }
        }
        do {
        } while (y0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            if (bVar != null) {
                synchronized (bVar) {
                    c = bVar._size > 0 ? bVar.c(0) : null;
                }
                a aVar = (a) c;
                if (aVar != null) {
                    c0.f9929o.A0(nanoTime, aVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void v0(Runnable runnable) {
        if (w0(runnable)) {
            Thread u0 = u0();
            if (Thread.currentThread() != u0) {
                LockSupport.unpark(u0);
                return;
            }
            return;
        }
        c0.f9929o.v0(runnable);
    }

    public final boolean w0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (f9967l.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof l) {
                l lVar = (l) obj;
                int a2 = lVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f9967l.compareAndSet(this, obj, lVar.e());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == p0.f9974b) {
                return false;
            } else {
                l lVar2 = new l(8, true);
                lVar2.a((Runnable) obj);
                lVar2.a(runnable);
                if (f9967l.compareAndSet(this, obj, lVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean x0() {
        g.a.a.b<h0<?>> bVar = this.f9963k;
        if (!(bVar == null || bVar.f9899b == bVar.c)) {
            return false;
        }
        b bVar2 = (b) this._delayed;
        if (bVar2 != null) {
            if (!(bVar2._size == 0)) {
                return false;
            }
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof l) {
            return ((l) obj).d();
        }
        if (obj == p0.f9974b) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long y0() {
        /*
            r12 = this;
            g.a.a.q r0 = g.a.p0.f9974b
            boolean r1 = r12.t0()
            r2 = 0
            if (r1 == 0) goto L_0x000b
            return r2
        L_0x000b:
            java.lang.Object r1 = r12._delayed
            g.a.n0$b r1 = (g.a.n0.b) r1
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0051
            int r7 = r1._size
            if (r7 != 0) goto L_0x001a
            r7 = r4
            goto L_0x001b
        L_0x001a:
            r7 = r6
        L_0x001b:
            if (r7 != 0) goto L_0x0051
            long r7 = java.lang.System.nanoTime()
        L_0x0021:
            monitor-enter(r1)
            g.a.a.t r9 = r1.b()     // Catch:{ all -> 0x004e }
            if (r9 == 0) goto L_0x0047
            g.a.n0$a r9 = (g.a.n0.a) r9     // Catch:{ all -> 0x004e }
            long r10 = r9.f9971j     // Catch:{ all -> 0x004e }
            long r10 = r7 - r10
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 < 0) goto L_0x0034
            r10 = r4
            goto L_0x0035
        L_0x0034:
            r10 = r6
        L_0x0035:
            if (r10 == 0) goto L_0x003c
            boolean r9 = r12.w0(r9)     // Catch:{ all -> 0x004e }
            goto L_0x003d
        L_0x003c:
            r9 = r6
        L_0x003d:
            if (r9 == 0) goto L_0x0044
            g.a.a.t r9 = r1.c(r6)     // Catch:{ all -> 0x004e }
            goto L_0x0045
        L_0x0044:
            r9 = r5
        L_0x0045:
            monitor-exit(r1)
            goto L_0x0049
        L_0x0047:
            monitor-exit(r1)
            r9 = r5
        L_0x0049:
            g.a.n0$a r9 = (g.a.n0.a) r9
            if (r9 == 0) goto L_0x0051
            goto L_0x0021
        L_0x004e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0051:
            java.lang.Object r1 = r12._queue
            if (r1 != 0) goto L_0x0056
            goto L_0x0081
        L_0x0056:
            boolean r7 = r1 instanceof g.a.a.l
            if (r7 == 0) goto L_0x0073
            r7 = r1
            g.a.a.l r7 = (g.a.a.l) r7
            java.lang.Object r8 = r7.f()
            g.a.a.q r9 = g.a.a.l.f9913g
            if (r8 == r9) goto L_0x0069
            r5 = r8
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            goto L_0x0081
        L_0x0069:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f9967l
            g.a.a.l r7 = r7.e()
            r8.compareAndSet(r12, r1, r7)
            goto L_0x0051
        L_0x0073:
            if (r1 != r0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f9967l
            boolean r7 = r7.compareAndSet(r12, r1, r5)
            if (r7 == 0) goto L_0x0051
            r5 = r1
            java.lang.Runnable r5 = (java.lang.Runnable) r5
        L_0x0081:
            if (r5 == 0) goto L_0x0087
            r5.run()
            return r2
        L_0x0087:
            g.a.a.b<g.a.h0<?>> r1 = r12.f9963k
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L_0x009d
            int r5 = r1.f9899b
            int r1 = r1.c
            if (r5 != r1) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r4 = r6
        L_0x0098:
            if (r4 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r4 = r2
            goto L_0x009e
        L_0x009d:
            r4 = r7
        L_0x009e:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x00a3
            goto L_0x00d9
        L_0x00a3:
            java.lang.Object r1 = r12._queue
            if (r1 != 0) goto L_0x00a8
            goto L_0x00b5
        L_0x00a8:
            boolean r4 = r1 instanceof g.a.a.l
            if (r4 == 0) goto L_0x00d6
            g.a.a.l r1 = (g.a.a.l) r1
            boolean r0 = r1.d()
            if (r0 != 0) goto L_0x00b5
            goto L_0x00d9
        L_0x00b5:
            java.lang.Object r0 = r12._delayed
            g.a.n0$b r0 = (g.a.n0.b) r0
            if (r0 == 0) goto L_0x00d8
            monitor-enter(r0)
            g.a.a.t r1 = r0.b()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            g.a.n0$a r1 = (g.a.n0.a) r1
            if (r1 == 0) goto L_0x00d8
            long r0 = r1.f9971j
            long r4 = java.lang.System.nanoTime()
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d1
            goto L_0x00d9
        L_0x00d1:
            r2 = r0
            goto L_0x00d9
        L_0x00d3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d6:
            if (r1 != r0) goto L_0x00d9
        L_0x00d8:
            r2 = r7
        L_0x00d9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.n0.y0():long");
    }

    public final void z0() {
        this._queue = null;
        this._delayed = null;
    }
}
