package n.m0.j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n.c0;
import n.d0;
import n.e0;
import n.h0;
import n.m0.c;
import n.m0.g.i;
import n.m0.h.d;
import n.m0.h.e;
import n.m0.h.g;
import n.m0.j.o;
import n.y;
import n.z;
import o.h;
import o.x;

public final class m implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f10329g = c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f10330h = c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public volatile o a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f10331b;
    public volatile boolean c;
    public final i d;

    /* renamed from: e  reason: collision with root package name */
    public final g f10332e;
    public final f f;

    public m(c0 c0Var, i iVar, g gVar, f fVar) {
        e.x.c.i.e(c0Var, "client");
        e.x.c.i.e(iVar, "connection");
        e.x.c.i.e(gVar, "chain");
        e.x.c.i.e(fVar, "http2Connection");
        this.d = iVar;
        this.f10332e = gVar;
        this.f = fVar;
        List<d0> list = c0Var.y;
        d0 d0Var = d0.H2_PRIOR_KNOWLEDGE;
        this.f10331b = !list.contains(d0Var) ? d0.HTTP_2 : d0Var;
    }

    public void a() {
        o oVar = this.a;
        e.x.c.i.c(oVar);
        ((o.a) oVar.g()).close();
    }

    public void b(e0 e0Var) {
        int i2;
        o oVar;
        e.x.c.i.e(e0Var, "request");
        if (this.a == null) {
            boolean z = false;
            boolean z2 = e0Var.f10093e != null;
            e.x.c.i.e(e0Var, "request");
            y yVar = e0Var.d;
            ArrayList arrayList = new ArrayList(yVar.size() + 4);
            arrayList.add(new c(c.f, e0Var.c));
            h hVar = c.f10271g;
            z zVar = e0Var.f10092b;
            e.x.c.i.e(zVar, "url");
            String b2 = zVar.b();
            String d2 = zVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            arrayList.add(new c(hVar, b2));
            String b3 = e0Var.b("Host");
            if (b3 != null) {
                arrayList.add(new c(c.f10273i, b3));
            }
            arrayList.add(new c(c.f10272h, e0Var.f10092b.f10430b));
            int size = yVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                String e2 = yVar.e(i3);
                Locale locale = Locale.US;
                e.x.c.i.d(locale, "Locale.US");
                Objects.requireNonNull(e2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = e2.toLowerCase(locale);
                e.x.c.i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!f10329g.contains(lowerCase) || (e.x.c.i.a(lowerCase, "te") && e.x.c.i.a(yVar.p(i3), "trailers"))) {
                    arrayList.add(new c(lowerCase, yVar.p(i3)));
                }
            }
            f fVar = this.f;
            Objects.requireNonNull(fVar);
            e.x.c.i.e(arrayList, "requestHeaders");
            boolean z3 = !z2;
            synchronized (fVar.G) {
                synchronized (fVar) {
                    if (fVar.f10293m > 1073741823) {
                        fVar.H(b.REFUSED_STREAM);
                    }
                    if (!fVar.f10294n) {
                        i2 = fVar.f10293m;
                        fVar.f10293m = i2 + 2;
                        oVar = new o(i2, fVar, z3, false, (y) null);
                        if (!z2 || fVar.D >= fVar.E || oVar.c >= oVar.d) {
                            z = true;
                        }
                        if (oVar.i()) {
                            fVar.f10290j.put(Integer.valueOf(i2), oVar);
                        }
                    } else {
                        throw new a();
                    }
                }
                fVar.G.z(z3, i2, arrayList);
            }
            if (z) {
                fVar.G.flush();
            }
            this.a = oVar;
            if (!this.c) {
                o oVar2 = this.a;
                e.x.c.i.c(oVar2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                oVar2.f10349i.g((long) this.f10332e.f10235h, timeUnit);
                o oVar3 = this.a;
                e.x.c.i.c(oVar3);
                oVar3.f10350j.g((long) this.f10332e.f10236i, timeUnit);
                return;
            }
            o oVar4 = this.a;
            e.x.c.i.c(oVar4);
            oVar4.e(b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public void c() {
        this.f.G.flush();
    }

    public void cancel() {
        this.c = true;
        o oVar = this.a;
        if (oVar != null) {
            oVar.e(b.CANCEL);
        }
    }

    public long d(h0 h0Var) {
        e.x.c.i.e(h0Var, "response");
        if (!e.a(h0Var)) {
            return 0;
        }
        return c.k(h0Var);
    }

    public o.z e(h0 h0Var) {
        e.x.c.i.e(h0Var, "response");
        o oVar = this.a;
        e.x.c.i.c(oVar);
        return oVar.f10347g;
    }

    public x f(e0 e0Var, long j2) {
        e.x.c.i.e(e0Var, "request");
        o oVar = this.a;
        e.x.c.i.c(oVar);
        return oVar.g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        r0.f10349i.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n.h0.a g(boolean r12) {
        /*
            r11 = this;
            n.m0.j.o r0 = r11.a
            e.x.c.i.c(r0)
            monitor-enter(r0)
            n.m0.j.o$c r1 = r0.f10349i     // Catch:{ all -> 0x00f0 }
            r1.h()     // Catch:{ all -> 0x00f0 }
        L_0x000b:
            java.util.ArrayDeque<n.y> r1 = r0.f10346e     // Catch:{ all -> 0x00e9 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00e9 }
            if (r1 == 0) goto L_0x001b
            n.m0.j.b r1 = r0.f10351k     // Catch:{ all -> 0x00e9 }
            if (r1 != 0) goto L_0x001b
            r0.l()     // Catch:{ all -> 0x00e9 }
            goto L_0x000b
        L_0x001b:
            n.m0.j.o$c r1 = r0.f10349i     // Catch:{ all -> 0x00f0 }
            r1.l()     // Catch:{ all -> 0x00f0 }
            java.util.ArrayDeque<n.y> r1 = r0.f10346e     // Catch:{ all -> 0x00f0 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00f0 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00d9
            java.util.ArrayDeque<n.y> r1 = r0.f10346e     // Catch:{ all -> 0x00f0 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = "headersQueue.removeFirst()"
            e.x.c.i.d(r1, r2)     // Catch:{ all -> 0x00f0 }
            n.y r1 = (n.y) r1     // Catch:{ all -> 0x00f0 }
            monitor-exit(r0)
            n.d0 r0 = r11.f10331b
            java.lang.String r2 = "headerBlock"
            e.x.c.i.e(r1, r2)
            java.lang.String r2 = "protocol"
            e.x.c.i.e(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            int r3 = r1.size()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
        L_0x0053:
            if (r6 >= r3) goto L_0x009e
            java.lang.String r8 = r1.e(r6)
            java.lang.String r9 = r1.p(r6)
            java.lang.String r10 = ":status"
            boolean r10 = e.x.c.i.a(r8, r10)
            if (r10 == 0) goto L_0x007b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "HTTP/1.1 "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            n.m0.h.j r7 = n.m0.h.j.a(r7)
            goto L_0x009b
        L_0x007b:
            java.util.List<java.lang.String> r10 = f10330h
            boolean r10 = r10.contains(r8)
            if (r10 != 0) goto L_0x009b
            java.lang.String r10 = "name"
            e.x.c.i.e(r8, r10)
            java.lang.String r10 = "value"
            e.x.c.i.e(r9, r10)
            r2.add(r8)
            java.lang.CharSequence r8 = e.c0.h.N(r9)
            java.lang.String r8 = r8.toString()
            r2.add(r8)
        L_0x009b:
            int r6 = r6 + 1
            goto L_0x0053
        L_0x009e:
            if (r7 == 0) goto L_0x00d1
            n.h0$a r1 = new n.h0$a
            r1.<init>()
            r1.f(r0)
            int r0 = r7.f10240b
            r1.c = r0
            java.lang.String r0 = r7.c
            r1.e(r0)
            n.y r0 = new n.y
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2, r5)
            r1.d(r0)
            if (r12 == 0) goto L_0x00cf
            int r12 = r1.c
            r0 = 100
            if (r12 != r0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r5 = r1
        L_0x00d0:
            return r5
        L_0x00d1:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r12.<init>(r0)
            throw r12
        L_0x00d9:
            java.io.IOException r12 = r0.f10352l     // Catch:{ all -> 0x00f0 }
            if (r12 == 0) goto L_0x00de
            goto L_0x00e8
        L_0x00de:
            n.m0.j.u r12 = new n.m0.j.u     // Catch:{ all -> 0x00f0 }
            n.m0.j.b r1 = r0.f10351k     // Catch:{ all -> 0x00f0 }
            e.x.c.i.c(r1)     // Catch:{ all -> 0x00f0 }
            r12.<init>(r1)     // Catch:{ all -> 0x00f0 }
        L_0x00e8:
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00e9:
            r12 = move-exception
            n.m0.j.o$c r1 = r0.f10349i     // Catch:{ all -> 0x00f0 }
            r1.l()     // Catch:{ all -> 0x00f0 }
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.j.m.g(boolean):n.h0$a");
    }

    public i h() {
        return this.d;
    }
}
