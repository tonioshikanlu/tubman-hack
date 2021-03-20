package b.p.b.a0.j;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Objects;
import o.a0;
import o.e;
import o.x;
import o.z;

public final class k {
    public long a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f6537b;
    public final int c;
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final List<l> f6538e;
    public List<l> f;

    /* renamed from: g  reason: collision with root package name */
    public final c f6539g;

    /* renamed from: h  reason: collision with root package name */
    public final b f6540h;

    /* renamed from: i  reason: collision with root package name */
    public final d f6541i = new d();

    /* renamed from: j  reason: collision with root package name */
    public final d f6542j = new d();

    /* renamed from: k  reason: collision with root package name */
    public a f6543k = null;

    public final class b implements x {

        /* renamed from: h  reason: collision with root package name */
        public final e f6544h = new e();

        /* renamed from: i  reason: collision with root package name */
        public boolean f6545i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f6546j;

        public b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            throw new java.io.InterruptedIOException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r1.f6542j.l();
            b.p.b.a0.j.k.b(r11.f6547k);
            r9 = java.lang.Math.min(r11.f6547k.f6537b, r11.f6544h.f10453i);
            r1 = r11.f6547k;
            r1.f6537b -= r9;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(boolean r12) {
            /*
                r11 = this;
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this
                monitor-enter(r0)
                b.p.b.a0.j.k r1 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k$d r1 = r1.f6542j     // Catch:{ all -> 0x0080 }
                r1.h()     // Catch:{ all -> 0x0080 }
            L_0x000a:
                b.p.b.a0.j.k r1 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0077 }
                long r2 = r1.f6537b     // Catch:{ all -> 0x0077 }
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L_0x002a
                boolean r2 = r11.f6546j     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x002a
                boolean r2 = r11.f6545i     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x002a
                b.p.b.a0.j.a r2 = r1.f6543k     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x002a
                r1.wait()     // Catch:{ InterruptedException -> 0x0024 }
                goto L_0x000a
            L_0x0024:
                java.io.InterruptedIOException r12 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0077 }
                r12.<init>()     // Catch:{ all -> 0x0077 }
                throw r12     // Catch:{ all -> 0x0077 }
            L_0x002a:
                b.p.b.a0.j.k$d r1 = r1.f6542j     // Catch:{ all -> 0x0080 }
                r1.l()     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k r1 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k.b(r1)     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k r1 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0080 }
                long r1 = r1.f6537b     // Catch:{ all -> 0x0080 }
                o.e r3 = r11.f6544h     // Catch:{ all -> 0x0080 }
                long r3 = r3.f10453i     // Catch:{ all -> 0x0080 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k r1 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0080 }
                long r2 = r1.f6537b     // Catch:{ all -> 0x0080 }
                long r2 = r2 - r9
                r1.f6537b = r2     // Catch:{ all -> 0x0080 }
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k$d r0 = r1.f6542j
                r0.h()
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x006e }
                b.p.b.a0.j.d r5 = r0.d     // Catch:{ all -> 0x006e }
                int r6 = r0.c     // Catch:{ all -> 0x006e }
                if (r12 == 0) goto L_0x005f
                o.e r12 = r11.f6544h     // Catch:{ all -> 0x006e }
                long r0 = r12.f10453i     // Catch:{ all -> 0x006e }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005f
                r12 = 1
                goto L_0x0060
            L_0x005f:
                r12 = 0
            L_0x0060:
                r7 = r12
                o.e r8 = r11.f6544h     // Catch:{ all -> 0x006e }
                r5.O(r6, r7, r8, r9)     // Catch:{ all -> 0x006e }
                b.p.b.a0.j.k r12 = b.p.b.a0.j.k.this
                b.p.b.a0.j.k$d r12 = r12.f6542j
                r12.l()
                return
            L_0x006e:
                r12 = move-exception
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this
                b.p.b.a0.j.k$d r0 = r0.f6542j
                r0.l()
                throw r12
            L_0x0077:
                r12 = move-exception
                b.p.b.a0.j.k r1 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k$d r1 = r1.f6542j     // Catch:{ all -> 0x0080 }
                r1.l()     // Catch:{ all -> 0x0080 }
                throw r12     // Catch:{ all -> 0x0080 }
            L_0x0080:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.k.b.b(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r13.f6544h.f10453i <= 0) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            if (r13.f6544h.f10453i <= 0) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            b(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            r0.d.O(r0.c, true, (o.e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r1 = r13.f6547k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r13.f6545i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
            r13.f6547k.d.y.flush();
            b.p.b.a0.j.k.a(r13.f6547k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
            r0 = r13.f6547k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r0.f6540h.f6546j != false) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r13 = this;
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this
                monitor-enter(r0)
                boolean r1 = r13.f6545i     // Catch:{ all -> 0x004c }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this
                b.p.b.a0.j.k$b r1 = r0.f6540h
                boolean r1 = r1.f6546j
                r2 = 1
                if (r1 != 0) goto L_0x0034
                o.e r1 = r13.f6544h
                long r3 = r1.f10453i
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x0029
            L_0x001d:
                o.e r0 = r13.f6544h
                long r0 = r0.f10453i
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 <= 0) goto L_0x0034
                r13.b(r2)
                goto L_0x001d
            L_0x0029:
                b.p.b.a0.j.d r7 = r0.d
                int r8 = r0.c
                r9 = 1
                r10 = 0
                r11 = 0
                r7.O(r8, r9, r10, r11)
            L_0x0034:
                b.p.b.a0.j.k r1 = b.p.b.a0.j.k.this
                monitor-enter(r1)
                r13.f6545i = r2     // Catch:{ all -> 0x0049 }
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this
                b.p.b.a0.j.d r0 = r0.d
                b.p.b.a0.j.c r0 = r0.y
                r0.flush()
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this
                b.p.b.a0.j.k.a(r0)
                return
            L_0x0049:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                throw r0
            L_0x004c:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.k.b.close():void");
        }

        public a0 f() {
            return k.this.f6542j;
        }

        public void flush() {
            synchronized (k.this) {
                k.b(k.this);
            }
            while (this.f6544h.f10453i > 0) {
                b(false);
                k.this.d.flush();
            }
        }

        public void j(e eVar, long j2) {
            this.f6544h.j(eVar, j2);
            while (this.f6544h.f10453i >= 16384) {
                b(false);
            }
        }
    }

    public final class c implements z {

        /* renamed from: h  reason: collision with root package name */
        public final e f6548h = new e();

        /* renamed from: i  reason: collision with root package name */
        public final e f6549i = new e();

        /* renamed from: j  reason: collision with root package name */
        public final long f6550j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f6551k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f6552l;

        public c(long j2, a aVar) {
            this.f6550j = j2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            r11 = r8.f6553m.d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r2 = r8.f6553m.d;
            r3 = r2.r + r9;
            r2.r = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
            if (r3 < ((long) (r2.t.b(65536) / 2))) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
            r2 = r8.f6553m.d;
            r2.Y(0, r2.r);
            r8.f6553m.d.r = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
            return r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long T(o.e r9, long r10) {
            /*
                r8 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x007e
                b.p.b.a0.j.k r2 = b.p.b.a0.j.k.this
                monitor-enter(r2)
                r8.e()     // Catch:{ all -> 0x007b }
                r8.b()     // Catch:{ all -> 0x007b }
                o.e r3 = r8.f6549i     // Catch:{ all -> 0x007b }
                long r4 = r3.f10453i     // Catch:{ all -> 0x007b }
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 != 0) goto L_0x001b
                r9 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x007b }
                return r9
            L_0x001b:
                long r10 = java.lang.Math.min(r10, r4)     // Catch:{ all -> 0x007b }
                long r9 = r3.T(r9, r10)     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.k r11 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x007b }
                long r3 = r11.a     // Catch:{ all -> 0x007b }
                long r3 = r3 + r9
                r11.a = r3     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.d r11 = r11.d     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.t r11 = r11.t     // Catch:{ all -> 0x007b }
                r5 = 65536(0x10000, float:9.18355E-41)
                int r11 = r11.b(r5)     // Catch:{ all -> 0x007b }
                int r11 = r11 / 2
                long r6 = (long) r11     // Catch:{ all -> 0x007b }
                int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x004a
                b.p.b.a0.j.k r11 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.d r3 = r11.d     // Catch:{ all -> 0x007b }
                int r4 = r11.c     // Catch:{ all -> 0x007b }
                long r6 = r11.a     // Catch:{ all -> 0x007b }
                r3.Y(r4, r6)     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.k r11 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x007b }
                r11.a = r0     // Catch:{ all -> 0x007b }
            L_0x004a:
                monitor-exit(r2)     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.k r11 = b.p.b.a0.j.k.this
                b.p.b.a0.j.d r11 = r11.d
                monitor-enter(r11)
                b.p.b.a0.j.k r2 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.d r2 = r2.d     // Catch:{ all -> 0x0078 }
                long r3 = r2.r     // Catch:{ all -> 0x0078 }
                long r3 = r3 + r9
                r2.r = r3     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.t r2 = r2.t     // Catch:{ all -> 0x0078 }
                int r2 = r2.b(r5)     // Catch:{ all -> 0x0078 }
                int r2 = r2 / 2
                long r5 = (long) r2     // Catch:{ all -> 0x0078 }
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 < 0) goto L_0x0076
                b.p.b.a0.j.k r2 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.d r2 = r2.d     // Catch:{ all -> 0x0078 }
                r3 = 0
                long r4 = r2.r     // Catch:{ all -> 0x0078 }
                r2.Y(r3, r4)     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.k r2 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.d r2 = r2.d     // Catch:{ all -> 0x0078 }
                r2.r = r0     // Catch:{ all -> 0x0078 }
            L_0x0076:
                monitor-exit(r11)     // Catch:{ all -> 0x0078 }
                return r9
            L_0x0078:
                r9 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x0078 }
                throw r9
            L_0x007b:
                r9 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x007b }
                throw r9
            L_0x007e:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r10 = b.e.a.a.a.j(r0, r10)
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.k.c.T(o.e, long):long");
        }

        public final void b() {
            if (this.f6551k) {
                throw new IOException("stream closed");
            } else if (k.this.f6543k != null) {
                StringBuilder y = b.e.a.a.a.y("stream was reset: ");
                y.append(k.this.f6543k);
                throw new IOException(y.toString());
            }
        }

        public void close() {
            synchronized (k.this) {
                this.f6551k = true;
                e eVar = this.f6549i;
                eVar.skip(eVar.f10453i);
                k.this.notifyAll();
            }
            k.a(k.this);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0023 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e() {
            /*
                r4 = this;
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this
                b.p.b.a0.j.k$d r0 = r0.f6541i
                r0.h()
            L_0x0007:
                o.e r0 = r4.f6549i     // Catch:{ all -> 0x0031 }
                long r0 = r0.f10453i     // Catch:{ all -> 0x0031 }
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x0029
                boolean r0 = r4.f6552l     // Catch:{ all -> 0x0031 }
                if (r0 != 0) goto L_0x0029
                boolean r0 = r4.f6551k     // Catch:{ all -> 0x0031 }
                if (r0 != 0) goto L_0x0029
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this     // Catch:{ all -> 0x0031 }
                b.p.b.a0.j.a r1 = r0.f6543k     // Catch:{ all -> 0x0031 }
                if (r1 != 0) goto L_0x0029
                r0.wait()     // Catch:{ InterruptedException -> 0x0023 }
                goto L_0x0007
            L_0x0023:
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0031 }
                r0.<init>()     // Catch:{ all -> 0x0031 }
                throw r0     // Catch:{ all -> 0x0031 }
            L_0x0029:
                b.p.b.a0.j.k r0 = b.p.b.a0.j.k.this
                b.p.b.a0.j.k$d r0 = r0.f6541i
                r0.l()
                return
            L_0x0031:
                r0 = move-exception
                b.p.b.a0.j.k r1 = b.p.b.a0.j.k.this
                b.p.b.a0.j.k$d r1 = r1.f6541i
                r1.l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.k.c.e():void");
        }

        public a0 f() {
            return k.this.f6541i;
        }
    }

    public class d extends o.b {
        public d() {
        }

        public IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void k() {
            k.this.e(a.CANCEL);
        }

        public void l() {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public k(int i2, d dVar, boolean z, boolean z2, List<l> list) {
        Objects.requireNonNull(dVar, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.c = i2;
        this.d = dVar;
        this.f6537b = (long) dVar.u.b(65536);
        c cVar = new c((long) dVar.t.b(65536), (a) null);
        this.f6539g = cVar;
        b bVar = new b();
        this.f6540h = bVar;
        cVar.f6552l = z2;
        bVar.f6546j = z;
        this.f6538e = list;
    }

    public static void a(k kVar) {
        boolean z;
        boolean i2;
        synchronized (kVar) {
            c cVar = kVar.f6539g;
            if (!cVar.f6552l && cVar.f6551k) {
                b bVar = kVar.f6540h;
                if (bVar.f6546j || bVar.f6545i) {
                    z = true;
                    i2 = kVar.i();
                }
            }
            z = false;
            i2 = kVar.i();
        }
        if (z) {
            kVar.c(a.CANCEL);
        } else if (!i2) {
            kVar.d.z(kVar.c);
        }
    }

    public static void b(k kVar) {
        b bVar = kVar.f6540h;
        if (bVar.f6545i) {
            throw new IOException("stream closed");
        } else if (bVar.f6546j) {
            throw new IOException("stream finished");
        } else if (kVar.f6543k != null) {
            StringBuilder y = b.e.a.a.a.y("stream was reset: ");
            y.append(kVar.f6543k);
            throw new IOException(y.toString());
        }
    }

    public void c(a aVar) {
        if (d(aVar)) {
            d dVar = this.d;
            dVar.y.s(this.c, aVar);
        }
    }

    public final boolean d(a aVar) {
        synchronized (this) {
            if (this.f6543k != null) {
                return false;
            }
            if (this.f6539g.f6552l && this.f6540h.f6546j) {
                return false;
            }
            this.f6543k = aVar;
            notifyAll();
            this.d.z(this.c);
            return true;
        }
    }

    public void e(a aVar) {
        if (d(aVar)) {
            this.d.S(this.c, aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r3.f6541i.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<b.p.b.a0.j.l> f() {
        /*
            r3 = this;
            monitor-enter(r3)
            b.p.b.a0.j.k$d r0 = r3.f6541i     // Catch:{ all -> 0x0043 }
            r0.h()     // Catch:{ all -> 0x0043 }
        L_0x0006:
            java.util.List<b.p.b.a0.j.l> r0 = r3.f     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0018
            b.p.b.a0.j.a r0 = r3.f6543k     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0018
            r3.wait()     // Catch:{ InterruptedException -> 0x0012 }
            goto L_0x0006
        L_0x0012:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x003c }
            r0.<init>()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0018:
            b.p.b.a0.j.k$d r0 = r3.f6541i     // Catch:{ all -> 0x0043 }
            r0.l()     // Catch:{ all -> 0x0043 }
            java.util.List<b.p.b.a0.j.l> r0 = r3.f     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0023
            monitor-exit(r3)
            return r0
        L_0x0023:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r1.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = "stream was reset: "
            r1.append(r2)     // Catch:{ all -> 0x0043 }
            b.p.b.a0.j.a r2 = r3.f6543k     // Catch:{ all -> 0x0043 }
            r1.append(r2)     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0043 }
            r0.<init>(r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x003c:
            r0 = move-exception
            b.p.b.a0.j.k$d r1 = r3.f6541i     // Catch:{ all -> 0x0043 }
            r1.l()     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.k.f():java.util.List");
    }

    public x g() {
        synchronized (this) {
            if (this.f == null) {
                if (!h()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f6540h;
    }

    public boolean h() {
        return this.d.f6493i == ((this.c & 1) == 1);
    }

    public synchronized boolean i() {
        if (this.f6543k != null) {
            return false;
        }
        c cVar = this.f6539g;
        if (cVar.f6552l || cVar.f6551k) {
            b bVar = this.f6540h;
            if ((bVar.f6546j || bVar.f6545i) && this.f != null) {
                return false;
            }
        }
        return true;
    }

    public void j() {
        boolean i2;
        synchronized (this) {
            this.f6539g.f6552l = true;
            i2 = i();
            notifyAll();
        }
        if (!i2) {
            this.d.z(this.c);
        }
    }
}
