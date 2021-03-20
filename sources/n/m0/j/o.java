package n.m0.j;

import com.airbnb.lottie.utils.Utils;
import e.x.c.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import n.y;
import o.a0;
import o.e;
import o.x;
import o.z;

public final class o {
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public long f10345b;
    public long c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<y> f10346e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final b f10347g;

    /* renamed from: h  reason: collision with root package name */
    public final a f10348h;

    /* renamed from: i  reason: collision with root package name */
    public final c f10349i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final c f10350j = new c();

    /* renamed from: k  reason: collision with root package name */
    public b f10351k;

    /* renamed from: l  reason: collision with root package name */
    public IOException f10352l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10353m;

    /* renamed from: n  reason: collision with root package name */
    public final f f10354n;

    public final class a implements x {

        /* renamed from: h  reason: collision with root package name */
        public final e f10355h = new e();

        /* renamed from: i  reason: collision with root package name */
        public boolean f10356i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f10357j;

        public a(boolean z) {
            this.f10357j = z;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r12.f10358k.f10350j.l();
            r12.f10358k.b();
            r1 = r12.f10358k;
            r10 = java.lang.Math.min(r1.d - r1.c, r12.f10355h.f10453i);
            r1 = r12.f10358k;
            r1.c += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
            if (r13 == false) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
            if (r10 != r12.f10355h.f10453i) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
            if (r1.f() != null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
            r8 = r13;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(boolean r13) {
            /*
                r12 = this;
                n.m0.j.o r0 = n.m0.j.o.this
                monitor-enter(r0)
                n.m0.j.o r1 = n.m0.j.o.this     // Catch:{ all -> 0x008b }
                n.m0.j.o$c r1 = r1.f10350j     // Catch:{ all -> 0x008b }
                r1.h()     // Catch:{ all -> 0x008b }
            L_0x000a:
                n.m0.j.o r1 = n.m0.j.o.this     // Catch:{ all -> 0x0082 }
                long r2 = r1.c     // Catch:{ all -> 0x0082 }
                long r4 = r1.d     // Catch:{ all -> 0x0082 }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x0028
                boolean r2 = r12.f10357j     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0028
                boolean r2 = r12.f10356i     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0028
                n.m0.j.b r1 = r1.f()     // Catch:{ all -> 0x0082 }
                if (r1 != 0) goto L_0x0028
                n.m0.j.o r1 = n.m0.j.o.this     // Catch:{ all -> 0x0082 }
                r1.l()     // Catch:{ all -> 0x0082 }
                goto L_0x000a
            L_0x0028:
                n.m0.j.o r1 = n.m0.j.o.this     // Catch:{ all -> 0x008b }
                n.m0.j.o$c r1 = r1.f10350j     // Catch:{ all -> 0x008b }
                r1.l()     // Catch:{ all -> 0x008b }
                n.m0.j.o r1 = n.m0.j.o.this     // Catch:{ all -> 0x008b }
                r1.b()     // Catch:{ all -> 0x008b }
                n.m0.j.o r1 = n.m0.j.o.this     // Catch:{ all -> 0x008b }
                long r2 = r1.d     // Catch:{ all -> 0x008b }
                long r4 = r1.c     // Catch:{ all -> 0x008b }
                long r2 = r2 - r4
                o.e r1 = r12.f10355h     // Catch:{ all -> 0x008b }
                long r4 = r1.f10453i     // Catch:{ all -> 0x008b }
                long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x008b }
                n.m0.j.o r1 = n.m0.j.o.this     // Catch:{ all -> 0x008b }
                long r2 = r1.c     // Catch:{ all -> 0x008b }
                long r2 = r2 + r10
                r1.c = r2     // Catch:{ all -> 0x008b }
                if (r13 == 0) goto L_0x005c
                o.e r13 = r12.f10355h     // Catch:{ all -> 0x008b }
                long r2 = r13.f10453i     // Catch:{ all -> 0x008b }
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L_0x005c
                n.m0.j.b r13 = r1.f()     // Catch:{ all -> 0x008b }
                if (r13 != 0) goto L_0x005c
                r13 = 1
                goto L_0x005d
            L_0x005c:
                r13 = 0
            L_0x005d:
                r8 = r13
                monitor-exit(r0)
                n.m0.j.o r13 = n.m0.j.o.this
                n.m0.j.o$c r13 = r13.f10350j
                r13.h()
                n.m0.j.o r13 = n.m0.j.o.this     // Catch:{ all -> 0x0079 }
                n.m0.j.f r6 = r13.f10354n     // Catch:{ all -> 0x0079 }
                int r7 = r13.f10353m     // Catch:{ all -> 0x0079 }
                o.e r9 = r12.f10355h     // Catch:{ all -> 0x0079 }
                r6.O(r7, r8, r9, r10)     // Catch:{ all -> 0x0079 }
                n.m0.j.o r13 = n.m0.j.o.this
                n.m0.j.o$c r13 = r13.f10350j
                r13.l()
                return
            L_0x0079:
                r13 = move-exception
                n.m0.j.o r0 = n.m0.j.o.this
                n.m0.j.o$c r0 = r0.f10350j
                r0.l()
                throw r13
            L_0x0082:
                r13 = move-exception
                n.m0.j.o r1 = n.m0.j.o.this     // Catch:{ all -> 0x008b }
                n.m0.j.o$c r1 = r1.f10350j     // Catch:{ all -> 0x008b }
                r1.l()     // Catch:{ all -> 0x008b }
                throw r13     // Catch:{ all -> 0x008b }
            L_0x008b:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: n.m0.j.o.a.b(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            r0 = r14.f10358k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            if (r0.f10348h.f10357j != false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            if (r14.f10355h.f10453i <= 0) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
            if (r2 == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
            if (r14.f10355h.f10453i <= 0) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
            b(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            if (r1 == false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
            r0.f10354n.O(r0.f10353m, true, (o.e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            r0 = r14.f10358k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r14.f10356i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r14.f10358k.f10354n.G.flush();
            r14.f10358k.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r14 = this;
                n.m0.j.o r0 = n.m0.j.o.this
                byte[] r1 = n.m0.c.a
                monitor-enter(r0)
                boolean r1 = r14.f10356i     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                n.m0.j.o r1 = n.m0.j.o.this     // Catch:{ all -> 0x005f }
                n.m0.j.b r1 = r1.f()     // Catch:{ all -> 0x005f }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0017
                r1 = r3
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                monitor-exit(r0)
                n.m0.j.o r0 = n.m0.j.o.this
                n.m0.j.o$a r4 = r0.f10348h
                boolean r4 = r4.f10357j
                if (r4 != 0) goto L_0x0047
                o.e r4 = r14.f10355h
                long r4 = r4.f10453i
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002c
                r2 = r3
            L_0x002c:
                if (r2 == 0) goto L_0x003a
            L_0x002e:
                o.e r0 = r14.f10355h
                long r0 = r0.f10453i
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r14.b(r3)
                goto L_0x002e
            L_0x003a:
                if (r1 == 0) goto L_0x0047
                n.m0.j.f r8 = r0.f10354n
                int r9 = r0.f10353m
                r10 = 1
                r11 = 0
                r12 = 0
                r8.O(r9, r10, r11, r12)
            L_0x0047:
                n.m0.j.o r0 = n.m0.j.o.this
                monitor-enter(r0)
                r14.f10356i = r3     // Catch:{ all -> 0x005c }
                monitor-exit(r0)
                n.m0.j.o r0 = n.m0.j.o.this
                n.m0.j.f r0 = r0.f10354n
                n.m0.j.p r0 = r0.G
                r0.flush()
                n.m0.j.o r0 = n.m0.j.o.this
                r0.a()
                return
            L_0x005c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x005f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n.m0.j.o.a.close():void");
        }

        public a0 f() {
            return o.this.f10350j;
        }

        public void flush() {
            o oVar = o.this;
            byte[] bArr = n.m0.c.a;
            synchronized (oVar) {
                o.this.b();
            }
            while (this.f10355h.f10453i > 0) {
                b(false);
                o.this.f10354n.G.flush();
            }
        }

        public void j(e eVar, long j2) {
            i.e(eVar, "source");
            byte[] bArr = n.m0.c.a;
            this.f10355h.j(eVar, j2);
            while (this.f10355h.f10453i >= 16384) {
                b(false);
            }
        }
    }

    public final class b implements z {

        /* renamed from: h  reason: collision with root package name */
        public final e f10359h = new e();

        /* renamed from: i  reason: collision with root package name */
        public final e f10360i = new e();

        /* renamed from: j  reason: collision with root package name */
        public boolean f10361j;

        /* renamed from: k  reason: collision with root package name */
        public final long f10362k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10363l;

        public b(long j2, boolean z) {
            this.f10362k = j2;
            this.f10363l = z;
        }

        public long T(e eVar, long j2) {
            long j3;
            boolean z;
            long j4;
            e eVar2 = eVar;
            long j5 = j2;
            i.e(eVar2, "sink");
            long j6 = 0;
            if (j5 >= 0) {
                while (true) {
                    Throwable th = null;
                    synchronized (o.this) {
                        o.this.f10349i.h();
                        try {
                            if (o.this.f() != null) {
                                th = o.this.f10352l;
                                if (th == null) {
                                    b f = o.this.f();
                                    i.c(f);
                                    th = new u(f);
                                }
                            }
                            if (!this.f10361j) {
                                e eVar3 = this.f10360i;
                                long j7 = eVar3.f10453i;
                                if (j7 > j6) {
                                    j4 = eVar3.T(eVar2, Math.min(j5, j7));
                                    o oVar = o.this;
                                    long j8 = oVar.a + j4;
                                    oVar.a = j8;
                                    long j9 = j8 - oVar.f10345b;
                                    if (th == null && j9 >= ((long) (oVar.f10354n.z.a() / 2))) {
                                        o oVar2 = o.this;
                                        oVar2.f10354n.e0(oVar2.f10353m, j9);
                                        o oVar3 = o.this;
                                        oVar3.f10345b = oVar3.a;
                                    }
                                } else if (this.f10363l || th != null) {
                                    j4 = -1;
                                } else {
                                    o.this.l();
                                    z = true;
                                    j3 = -1;
                                }
                                long j10 = j4;
                                z = false;
                                j3 = j10;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            o.this.f10349i.l();
                        }
                    }
                    if (z) {
                        j6 = 0;
                    } else if (j3 != -1) {
                        b(j3);
                        return j3;
                    } else if (th == null) {
                        return -1;
                    } else {
                        i.c(th);
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j5).toString());
            }
        }

        public final void b(long j2) {
            o oVar = o.this;
            byte[] bArr = n.m0.c.a;
            oVar.f10354n.N(j2);
        }

        public void close() {
            long j2;
            synchronized (o.this) {
                this.f10361j = true;
                e eVar = this.f10360i;
                j2 = eVar.f10453i;
                eVar.skip(j2);
                o oVar = o.this;
                if (oVar != null) {
                    oVar.notifyAll();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j2 > 0) {
                b(j2);
            }
            o.this.a();
        }

        public a0 f() {
            return o.this.f10349i;
        }
    }

    public final class c extends o.b {
        public c() {
        }

        public IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void k() {
            o.this.e(b.CANCEL);
            f fVar = o.this.f10354n;
            synchronized (fVar) {
                long j2 = fVar.w;
                long j3 = fVar.v;
                if (j2 >= j3) {
                    fVar.v = j3 + 1;
                    fVar.y = System.nanoTime() + ((long) Utils.SECOND_IN_NANOS);
                    n.m0.f.c cVar = fVar.f10296p;
                    String q2 = b.e.a.a.a.q(new StringBuilder(), fVar.f10291k, " ping");
                    cVar.c(new l(q2, true, q2, true, fVar), 0);
                }
            }
        }

        public final void l() {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public o(int i2, f fVar, boolean z, boolean z2, y yVar) {
        i.e(fVar, "connection");
        this.f10353m = i2;
        this.f10354n = fVar;
        this.d = (long) fVar.A.a();
        ArrayDeque<y> arrayDeque = new ArrayDeque<>();
        this.f10346e = arrayDeque;
        this.f10347g = new b((long) fVar.z.a(), z2);
        this.f10348h = new a(z);
        if (yVar != null) {
            if (!h()) {
                arrayDeque.add(yVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z;
        boolean i2;
        byte[] bArr = n.m0.c.a;
        synchronized (this) {
            b bVar = this.f10347g;
            if (!bVar.f10363l && bVar.f10361j) {
                a aVar = this.f10348h;
                if (aVar.f10357j || aVar.f10356i) {
                    z = true;
                    i2 = i();
                }
            }
            z = false;
            i2 = i();
        }
        if (z) {
            c(b.CANCEL, (IOException) null);
        } else if (!i2) {
            this.f10354n.z(this.f10353m);
        }
    }

    public final void b() {
        a aVar = this.f10348h;
        if (aVar.f10356i) {
            throw new IOException("stream closed");
        } else if (aVar.f10357j) {
            throw new IOException("stream finished");
        } else if (this.f10351k != null) {
            Throwable th = this.f10352l;
            if (th == null) {
                b bVar = this.f10351k;
                i.c(bVar);
                th = new u(bVar);
            }
            throw th;
        }
    }

    public final void c(b bVar, IOException iOException) {
        i.e(bVar, "rstStatusCode");
        if (d(bVar, iOException)) {
            f fVar = this.f10354n;
            int i2 = this.f10353m;
            Objects.requireNonNull(fVar);
            i.e(bVar, "statusCode");
            fVar.G.H(i2, bVar);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = n.m0.c.a;
        synchronized (this) {
            if (this.f10351k != null) {
                return false;
            }
            if (this.f10347g.f10363l && this.f10348h.f10357j) {
                return false;
            }
            this.f10351k = bVar;
            this.f10352l = iOException;
            notifyAll();
            this.f10354n.z(this.f10353m);
            return true;
        }
    }

    public final void e(b bVar) {
        i.e(bVar, "errorCode");
        if (d(bVar, (IOException) null)) {
            this.f10354n.Y(this.f10353m, bVar);
        }
    }

    public final synchronized b f() {
        return this.f10351k;
    }

    public final x g() {
        synchronized (this) {
            if (!(this.f || h())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f10348h;
    }

    public final boolean h() {
        return this.f10354n.f10288h == ((this.f10353m & 1) == 1);
    }

    public final synchronized boolean i() {
        if (this.f10351k != null) {
            return false;
        }
        b bVar = this.f10347g;
        if (bVar.f10363l || bVar.f10361j) {
            a aVar = this.f10348h;
            if ((aVar.f10357j || aVar.f10356i) && this.f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(n.y r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            e.x.c.i.e(r3, r0)
            byte[] r0 = n.m0.c.a
            monitor-enter(r2)
            boolean r0 = r2.f     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            n.m0.j.o$b r3 = r2.f10347g     // Catch:{ all -> 0x0035 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x001d
        L_0x0016:
            r2.f = r1     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque<n.y> r0 = r2.f10346e     // Catch:{ all -> 0x0035 }
            r0.add(r3)     // Catch:{ all -> 0x0035 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            n.m0.j.o$b r3 = r2.f10347g     // Catch:{ all -> 0x0035 }
            r3.f10363l = r1     // Catch:{ all -> 0x0035 }
        L_0x0023:
            boolean r3 = r2.i()     // Catch:{ all -> 0x0035 }
            r2.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0034
            n.m0.j.f r3 = r2.f10354n
            int r4 = r2.f10353m
            r3.z(r4)
        L_0x0034:
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.j.o.j(n.y, boolean):void");
    }

    public final synchronized void k(b bVar) {
        i.e(bVar, "errorCode");
        if (this.f10351k == null) {
            this.f10351k = bVar;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
