package n.m0.g;

import androidx.core.app.NotificationCompat;
import e.x.c.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n.c0;
import n.e0;
import n.f;
import n.g;
import n.h0;
import n.m0.k.h;
import n.r;
import n.u;

public final class e implements f {

    /* renamed from: h  reason: collision with root package name */
    public final j f10186h;

    /* renamed from: i  reason: collision with root package name */
    public final u f10187i;

    /* renamed from: j  reason: collision with root package name */
    public final c f10188j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicBoolean f10189k = new AtomicBoolean();

    /* renamed from: l  reason: collision with root package name */
    public Object f10190l;

    /* renamed from: m  reason: collision with root package name */
    public d f10191m;

    /* renamed from: n  reason: collision with root package name */
    public i f10192n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10193o;

    /* renamed from: p  reason: collision with root package name */
    public c f10194p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10195q;
    public boolean r;
    public boolean s = true;
    public volatile boolean t;
    public volatile c u;
    public volatile i v;
    public final c0 w;
    public final e0 x;
    public final boolean y;

    public final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public volatile AtomicInteger f10196h = new AtomicInteger(0);

        /* renamed from: i  reason: collision with root package name */
        public final g f10197i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ e f10198j;

        public a(e eVar, g gVar) {
            i.e(gVar, "responseCallback");
            this.f10198j = eVar;
            this.f10197i = gVar;
        }

        public final String a() {
            return this.f10198j.x.f10092b.f10431e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[Catch:{ all -> 0x0075, all -> 0x00b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ all -> 0x0075, all -> 0x00b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009a A[Catch:{ all -> 0x0075, all -> 0x00b7 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "OkHttp "
                java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
                n.m0.g.e r1 = r7.f10198j
                n.e0 r1 = r1.x
                n.z r1 = r1.f10092b
                java.lang.String r1 = r1.i()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                e.x.c.i.d(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                n.m0.g.e r0 = r7.f10198j     // Catch:{ all -> 0x00b7 }
                n.m0.g.e$c r0 = r0.f10188j     // Catch:{ all -> 0x00b7 }
                r0.h()     // Catch:{ all -> 0x00b7 }
                r0 = 0
                n.m0.g.e r3 = r7.f10198j     // Catch:{ IOException -> 0x0077, all -> 0x004c }
                n.h0 r0 = r3.j()     // Catch:{ IOException -> 0x0077, all -> 0x004c }
                r3 = 1
                n.g r4 = r7.f10197i     // Catch:{ IOException -> 0x0047, all -> 0x0042 }
                n.m0.g.e r5 = r7.f10198j     // Catch:{ IOException -> 0x0047, all -> 0x0042 }
                r4.a(r5, r0)     // Catch:{ IOException -> 0x0047, all -> 0x0042 }
                n.m0.g.e r0 = r7.f10198j     // Catch:{ all -> 0x00b7 }
            L_0x003f:
                n.c0 r0 = r0.w     // Catch:{ all -> 0x00b7 }
                goto L_0x00a4
            L_0x0042:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x004d
            L_0x0047:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x0078
            L_0x004c:
                r3 = move-exception
            L_0x004d:
                n.m0.g.e r4 = r7.f10198j     // Catch:{ all -> 0x0075 }
                r4.f()     // Catch:{ all -> 0x0075 }
                if (r0 != 0) goto L_0x0074
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                r4.append(r3)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                r0.<init>(r4)     // Catch:{ all -> 0x0075 }
                b.q.a.a.k(r0, r3)     // Catch:{ all -> 0x0075 }
                n.g r4 = r7.f10197i     // Catch:{ all -> 0x0075 }
                n.m0.g.e r5 = r7.f10198j     // Catch:{ all -> 0x0075 }
                r4.b(r5, r0)     // Catch:{ all -> 0x0075 }
            L_0x0074:
                throw r3     // Catch:{ all -> 0x0075 }
            L_0x0075:
                r0 = move-exception
                goto L_0x00ad
            L_0x0077:
                r3 = move-exception
            L_0x0078:
                if (r0 == 0) goto L_0x009a
                n.m0.k.h$a r0 = n.m0.k.h.c     // Catch:{ all -> 0x0075 }
                n.m0.k.h r0 = n.m0.k.h.a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                n.m0.g.e r5 = r7.f10198j     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = n.m0.g.e.a(r5)     // Catch:{ all -> 0x0075 }
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                r5 = 4
                r0.i(r4, r5, r3)     // Catch:{ all -> 0x0075 }
                goto L_0x00a1
            L_0x009a:
                n.g r0 = r7.f10197i     // Catch:{ all -> 0x0075 }
                n.m0.g.e r4 = r7.f10198j     // Catch:{ all -> 0x0075 }
                r0.b(r4, r3)     // Catch:{ all -> 0x0075 }
            L_0x00a1:
                n.m0.g.e r0 = r7.f10198j     // Catch:{ all -> 0x00b7 }
                goto L_0x003f
            L_0x00a4:
                n.r r0 = r0.f10050h     // Catch:{ all -> 0x00b7 }
                r0.c(r7)     // Catch:{ all -> 0x00b7 }
                r1.setName(r2)
                return
            L_0x00ad:
                n.m0.g.e r3 = r7.f10198j     // Catch:{ all -> 0x00b7 }
                n.c0 r3 = r3.w     // Catch:{ all -> 0x00b7 }
                n.r r3 = r3.f10050h     // Catch:{ all -> 0x00b7 }
                r3.c(r7)     // Catch:{ all -> 0x00b7 }
                throw r0     // Catch:{ all -> 0x00b7 }
            L_0x00b7:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n.m0.g.e.a.run():void");
        }
    }

    public static final class b extends WeakReference<e> {
        public final Object a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            i.e(eVar, "referent");
            this.a = obj;
        }
    }

    public static final class c extends o.b {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e f10199l;

        public c(e eVar) {
            this.f10199l = eVar;
        }

        public void k() {
            this.f10199l.f();
        }
    }

    public e(c0 c0Var, e0 e0Var, boolean z) {
        i.e(c0Var, "client");
        i.e(e0Var, "originalRequest");
        this.w = c0Var;
        this.x = e0Var;
        this.y = z;
        this.f10186h = c0Var.f10051i.a;
        this.f10187i = c0Var.f10054l.a(this);
        c cVar = new c(this);
        cVar.g((long) 0, TimeUnit.MILLISECONDS);
        this.f10188j = cVar;
    }

    public static final String a(e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.t ? "canceled " : "");
        sb.append(eVar.y ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(eVar.x.f10092b.i());
        return sb.toString();
    }

    public final void b(i iVar) {
        i.e(iVar, "connection");
        byte[] bArr = n.m0.c.a;
        if (this.f10192n == null) {
            this.f10192n = iVar;
            iVar.f10214o.add(new b(this, this.f10190l));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <E extends IOException> E c(E e2) {
        E e3;
        Socket m2;
        byte[] bArr = n.m0.c.a;
        i iVar = this.f10192n;
        if (iVar != null) {
            synchronized (iVar) {
                m2 = m();
            }
            if (this.f10192n == null) {
                if (m2 != null) {
                    n.m0.c.e(m2);
                }
                Objects.requireNonNull(this.f10187i);
                i.e(this, NotificationCompat.CATEGORY_CALL);
                i.e(iVar, "connection");
            } else {
                if (!(m2 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f10193o && this.f10188j.i()) {
            e3 = new InterruptedIOException("timeout");
            if (e2 != null) {
                e3.initCause(e2);
            }
        } else {
            e3 = e2;
        }
        if (e2 != null) {
            u uVar = this.f10187i;
            i.c(e3);
            Objects.requireNonNull(uVar);
            i.e(this, NotificationCompat.CATEGORY_CALL);
            i.e(e3, "ioe");
        } else {
            Objects.requireNonNull(this.f10187i);
            i.e(this, NotificationCompat.CATEGORY_CALL);
        }
        return e3;
    }

    public Object clone() {
        return new e(this.w, this.x, this.y);
    }

    public final void d() {
        h.a aVar = h.c;
        this.f10190l = h.a.g("response.body().close()");
        Objects.requireNonNull(this.f10187i);
        i.e(this, NotificationCompat.CATEGORY_CALL);
    }

    public void f() {
        Socket socket;
        if (!this.t) {
            this.t = true;
            c cVar = this.u;
            if (cVar != null) {
                cVar.f.cancel();
            }
            i iVar = this.v;
            if (!(iVar == null || (socket = iVar.f10204b) == null)) {
                n.m0.c.e(socket);
            }
            Objects.requireNonNull(this.f10187i);
            i.e(this, NotificationCompat.CATEGORY_CALL);
        }
    }

    public void g(g gVar) {
        a aVar;
        i.e(gVar, "responseCallback");
        if (this.f10189k.compareAndSet(false, true)) {
            d();
            r rVar = this.w.f10050h;
            a aVar2 = new a(this, gVar);
            Objects.requireNonNull(rVar);
            i.e(aVar2, NotificationCompat.CATEGORY_CALL);
            synchronized (rVar) {
                rVar.f10420b.add(aVar2);
                if (!aVar2.f10198j.y) {
                    String a2 = aVar2.a();
                    Iterator<a> it = rVar.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<a> it2 = rVar.f10420b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                }
                                aVar = it2.next();
                                if (i.a(aVar.a(), a2)) {
                                    break;
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (i.a(aVar.a(), a2)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        i.e(aVar, "other");
                        aVar2.f10196h = aVar.f10196h;
                    }
                }
            }
            rVar.d();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public h0 h() {
        if (this.f10189k.compareAndSet(false, true)) {
            this.f10188j.h();
            d();
            try {
                r rVar = this.w.f10050h;
                synchronized (rVar) {
                    i.e(this, NotificationCompat.CATEGORY_CALL);
                    rVar.d.add(this);
                }
                h0 j2 = j();
                r rVar2 = this.w.f10050h;
                Objects.requireNonNull(rVar2);
                i.e(this, NotificationCompat.CATEGORY_CALL);
                rVar2.b(rVar2.d, this);
                return j2;
            } catch (Throwable th) {
                r rVar3 = this.w.f10050h;
                Objects.requireNonNull(rVar3);
                i.e(this, NotificationCompat.CATEGORY_CALL);
                rVar3.b(rVar3.d, this);
                throw th;
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public final void i(boolean z) {
        c cVar;
        synchronized (this) {
            if (!this.s) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.u) != null) {
            cVar.f.cancel();
            cVar.c.k(cVar, true, true, (IOException) null);
        }
        this.f10194p = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n.h0 j() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            n.c0 r0 = r11.w
            java.util.List<n.a0> r0 = r0.f10052j
            e.t.g.b(r2, r0)
            n.m0.h.i r0 = new n.m0.h.i
            n.c0 r1 = r11.w
            r0.<init>(r1)
            r2.add(r0)
            n.m0.h.a r0 = new n.m0.h.a
            n.c0 r1 = r11.w
            n.q r1 = r1.f10059q
            r0.<init>(r1)
            r2.add(r0)
            n.m0.e.a r0 = new n.m0.e.a
            n.c0 r1 = r11.w
            java.util.Objects.requireNonNull(r1)
            r0.<init>()
            r2.add(r0)
            n.m0.g.a r0 = n.m0.g.a.a
            r2.add(r0)
            boolean r0 = r11.y
            if (r0 != 0) goto L_0x003f
            n.c0 r0 = r11.w
            java.util.List<n.a0> r0 = r0.f10053k
            e.t.g.b(r2, r0)
        L_0x003f:
            n.m0.h.b r0 = new n.m0.h.b
            boolean r1 = r11.y
            r0.<init>(r1)
            r2.add(r0)
            n.m0.h.g r9 = new n.m0.h.g
            r3 = 0
            r4 = 0
            n.e0 r5 = r11.x
            n.c0 r0 = r11.w
            int r6 = r0.C
            int r7 = r0.D
            int r8 = r0.E
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            n.e0 r2 = r11.x     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            n.h0 r2 = r9.c(r2)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            boolean r3 = r11.t     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            if (r3 != 0) goto L_0x006c
            r11.l(r1)
            return r2
        L_0x006c:
            n.m0.c.d(r2)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            throw r2     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
        L_0x0077:
            r2 = move-exception
            goto L_0x008e
        L_0x0079:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.l(r0)     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0089
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x0089:
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L_0x008e:
            if (r0 != 0) goto L_0x0093
            r11.l(r1)
        L_0x0093:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.g.e.j():n.h0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E k(n.m0.g.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            e.x.c.i.e(r3, r0)
            n.m0.g.c r0 = r2.u
            boolean r3 = e.x.c.i.a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f10195q     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x0042
        L_0x001b:
            if (r5 == 0) goto L_0x0044
            boolean r1 = r2.r     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0044
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f10195q = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.r = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.f10195q     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.r     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.r     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.s     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            r3 = r0
        L_0x003f:
            r4 = r3
            r3 = r5
            goto L_0x0045
        L_0x0042:
            monitor-exit(r2)
            throw r3
        L_0x0044:
            r4 = r3
        L_0x0045:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            r2.u = r3
            n.m0.g.i r3 = r2.f10192n
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)
            int r5 = r3.f10211l     // Catch:{ all -> 0x0057 }
            int r5 = r5 + r0
            r3.f10211l = r5     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            goto L_0x005a
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.io.IOException r3 = r2.c(r6)
            return r3
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.g.e.k(n.m0.g.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException l(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.s) {
                this.s = false;
                if (!this.f10195q && !this.r) {
                    z = true;
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket m() {
        i iVar = this.f10192n;
        i.c(iVar);
        byte[] bArr = n.m0.c.a;
        List<Reference<e>> list = iVar.f10214o;
        Iterator<Reference<e>> it = list.iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (i.a((e) it.next().get(), this)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            list.remove(i2);
            this.f10192n = null;
            if (list.isEmpty()) {
                iVar.f10215p = System.nanoTime();
                j jVar = this.f10186h;
                Objects.requireNonNull(jVar);
                i.e(iVar, "connection");
                byte[] bArr2 = n.m0.c.a;
                if (iVar.f10208i || jVar.f10218e == 0) {
                    iVar.f10208i = true;
                    jVar.d.remove(iVar);
                    if (jVar.d.isEmpty()) {
                        jVar.f10217b.a();
                    }
                    z = true;
                } else {
                    jVar.f10217b.c(jVar.c, 0);
                }
                if (z) {
                    Socket socket = iVar.c;
                    i.c(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
