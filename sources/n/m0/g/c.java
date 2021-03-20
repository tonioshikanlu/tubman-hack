package n.m0.g;

import androidx.core.app.NotificationCompat;
import e.x.c.i;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import n.e0;
import n.g0;
import n.h0;
import n.m0.h.d;
import n.u;
import o.e;
import o.j;
import o.k;
import o.x;
import o.z;

public final class c {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final i f10167b;
    public final e c;
    public final u d;

    /* renamed from: e  reason: collision with root package name */
    public final d f10168e;
    public final d f;

    public final class a extends j {

        /* renamed from: i  reason: collision with root package name */
        public boolean f10169i;

        /* renamed from: j  reason: collision with root package name */
        public long f10170j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f10171k;

        /* renamed from: l  reason: collision with root package name */
        public final long f10172l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ c f10173m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, x xVar, long j2) {
            super(xVar);
            i.e(xVar, "delegate");
            this.f10173m = cVar;
            this.f10172l = j2;
        }

        public final <E extends IOException> E b(E e2) {
            if (this.f10169i) {
                return e2;
            }
            this.f10169i = true;
            return this.f10173m.a(this.f10170j, false, true, e2);
        }

        public void close() {
            if (!this.f10171k) {
                this.f10171k = true;
                long j2 = this.f10172l;
                if (j2 == -1 || this.f10170j == j2) {
                    try {
                        this.f10463h.close();
                        b((IOException) null);
                    } catch (IOException e2) {
                        throw b(e2);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                this.f10463h.flush();
            } catch (IOException e2) {
                throw b(e2);
            }
        }

        public void j(e eVar, long j2) {
            i.e(eVar, "source");
            if (!this.f10171k) {
                long j3 = this.f10172l;
                if (j3 == -1 || this.f10170j + j2 <= j3) {
                    try {
                        i.e(eVar, "source");
                        this.f10463h.j(eVar, j2);
                        this.f10170j += j2;
                    } catch (IOException e2) {
                        throw b(e2);
                    }
                } else {
                    StringBuilder y = b.e.a.a.a.y("expected ");
                    y.append(this.f10172l);
                    y.append(" bytes but received ");
                    y.append(this.f10170j + j2);
                    throw new ProtocolException(y.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public final class b extends k {

        /* renamed from: i  reason: collision with root package name */
        public long f10174i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f10175j = true;

        /* renamed from: k  reason: collision with root package name */
        public boolean f10176k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10177l;

        /* renamed from: m  reason: collision with root package name */
        public final long f10178m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ c f10179n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, z zVar, long j2) {
            super(zVar);
            i.e(zVar, "delegate");
            this.f10179n = cVar;
            this.f10178m = j2;
            if (j2 == 0) {
                b((IOException) null);
            }
        }

        public long T(e eVar, long j2) {
            i.e(eVar, "sink");
            if (!this.f10177l) {
                try {
                    long T = this.f10464h.T(eVar, j2);
                    if (this.f10175j) {
                        this.f10175j = false;
                        c cVar = this.f10179n;
                        u uVar = cVar.d;
                        e eVar2 = cVar.c;
                        Objects.requireNonNull(uVar);
                        i.e(eVar2, NotificationCompat.CATEGORY_CALL);
                    }
                    if (T == -1) {
                        b((IOException) null);
                        return -1;
                    }
                    long j3 = this.f10174i + T;
                    long j4 = this.f10178m;
                    if (j4 != -1) {
                        if (j3 > j4) {
                            throw new ProtocolException("expected " + this.f10178m + " bytes but received " + j3);
                        }
                    }
                    this.f10174i = j3;
                    if (j3 == j4) {
                        b((IOException) null);
                    }
                    return T;
                } catch (IOException e2) {
                    throw b(e2);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E b(E e2) {
            if (this.f10176k) {
                return e2;
            }
            this.f10176k = true;
            if (e2 == null && this.f10175j) {
                this.f10175j = false;
                c cVar = this.f10179n;
                u uVar = cVar.d;
                e eVar = cVar.c;
                Objects.requireNonNull(uVar);
                i.e(eVar, NotificationCompat.CATEGORY_CALL);
            }
            return this.f10179n.a(this.f10174i, true, false, e2);
        }

        public void close() {
            if (!this.f10177l) {
                this.f10177l = true;
                try {
                    super.close();
                    b((IOException) null);
                } catch (IOException e2) {
                    throw b(e2);
                }
            }
        }
    }

    public c(e eVar, u uVar, d dVar, d dVar2) {
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        i.e(uVar, "eventListener");
        i.e(dVar, "finder");
        i.e(dVar2, "codec");
        this.c = eVar;
        this.d = uVar;
        this.f10168e = dVar;
        this.f = dVar2;
        this.f10167b = dVar2.h();
    }

    public final <E extends IOException> E a(long j2, boolean z, boolean z2, E e2) {
        if (e2 != null) {
            e(e2);
        }
        if (z2) {
            u uVar = this.d;
            e eVar = this.c;
            if (e2 != null) {
                uVar.b(eVar, e2);
            } else {
                Objects.requireNonNull(uVar);
                i.e(eVar, NotificationCompat.CATEGORY_CALL);
            }
        }
        if (z) {
            if (e2 != null) {
                this.d.c(this.c, e2);
            } else {
                u uVar2 = this.d;
                e eVar2 = this.c;
                Objects.requireNonNull(uVar2);
                i.e(eVar2, NotificationCompat.CATEGORY_CALL);
            }
        }
        return this.c.k(this, z2, z, e2);
    }

    public final x b(e0 e0Var, boolean z) {
        i.e(e0Var, "request");
        this.a = z;
        g0 g0Var = e0Var.f10093e;
        i.c(g0Var);
        long a2 = g0Var.a();
        u uVar = this.d;
        e eVar = this.c;
        Objects.requireNonNull(uVar);
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        return new a(this, this.f.f(e0Var, a2), a2);
    }

    public final h0.a c(boolean z) {
        try {
            h0.a g2 = this.f.g(z);
            if (g2 != null) {
                i.e(this, "deferredTrailers");
                g2.f10118m = this;
            }
            return g2;
        } catch (IOException e2) {
            this.d.c(this.c, e2);
            e(e2);
            throw e2;
        }
    }

    public final void d() {
        u uVar = this.d;
        e eVar = this.c;
        Objects.requireNonNull(uVar);
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r6 > 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.io.IOException r6) {
        /*
            r5 = this;
            n.m0.g.d r0 = r5.f10168e
            r0.c(r6)
            n.m0.h.d r0 = r5.f
            n.m0.g.i r0 = r0.h()
            n.m0.g.e r1 = r5.c
            monitor-enter(r0)
            java.lang.String r2 = "call"
            e.x.c.i.e(r1, r2)     // Catch:{ all -> 0x0056 }
            boolean r2 = r6 instanceof n.m0.j.u     // Catch:{ all -> 0x0056 }
            r3 = 1
            if (r2 == 0) goto L_0x0038
            r2 = r6
            n.m0.j.u r2 = (n.m0.j.u) r2     // Catch:{ all -> 0x0056 }
            n.m0.j.b r2 = r2.f10376h     // Catch:{ all -> 0x0056 }
            n.m0.j.b r4 = n.m0.j.b.REFUSED_STREAM     // Catch:{ all -> 0x0056 }
            if (r2 != r4) goto L_0x002b
            int r6 = r0.f10212m     // Catch:{ all -> 0x0056 }
            int r6 = r6 + r3
            r0.f10212m = r6     // Catch:{ all -> 0x0056 }
            if (r6 <= r3) goto L_0x0054
        L_0x0028:
            r0.f10208i = r3     // Catch:{ all -> 0x0056 }
            goto L_0x004f
        L_0x002b:
            n.m0.j.u r6 = (n.m0.j.u) r6     // Catch:{ all -> 0x0056 }
            n.m0.j.b r6 = r6.f10376h     // Catch:{ all -> 0x0056 }
            n.m0.j.b r2 = n.m0.j.b.CANCEL     // Catch:{ all -> 0x0056 }
            if (r6 != r2) goto L_0x0028
            boolean r6 = r1.t     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0028
            goto L_0x0054
        L_0x0038:
            boolean r2 = r0.j()     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0042
            boolean r2 = r6 instanceof n.m0.j.a     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0054
        L_0x0042:
            r0.f10208i = r3     // Catch:{ all -> 0x0056 }
            int r2 = r0.f10211l     // Catch:{ all -> 0x0056 }
            if (r2 != 0) goto L_0x0054
            n.c0 r1 = r1.w     // Catch:{ all -> 0x0056 }
            n.k0 r2 = r0.f10216q     // Catch:{ all -> 0x0056 }
            r0.d(r1, r2, r6)     // Catch:{ all -> 0x0056 }
        L_0x004f:
            int r6 = r0.f10210k     // Catch:{ all -> 0x0056 }
            int r6 = r6 + r3
            r0.f10210k = r6     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)
            return
        L_0x0056:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.g.c.e(java.io.IOException):void");
    }
}
