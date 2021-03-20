package b.p.b.a0.k;

import b.p.b.i;
import b.p.b.l;
import b.p.b.n;
import b.p.b.o;
import b.p.b.p;
import b.p.b.q;
import b.p.b.r;
import b.p.b.t;
import b.p.b.u;
import b.p.b.v;
import b.p.b.w;
import b.p.b.x;
import e.a.a.a.y0.m.o1.c;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Comparator;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.e;
import o.f;
import o.m;
import o.s;

public final class g {

    /* renamed from: q  reason: collision with root package name */
    public static final x f6637q = new a();
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public final p f6638b;
    public final w c;
    public i d;

    /* renamed from: e  reason: collision with root package name */
    public long f6639e = -1;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6640g;

    /* renamed from: h  reason: collision with root package name */
    public final t f6641h;

    /* renamed from: i  reason: collision with root package name */
    public t f6642i;

    /* renamed from: j  reason: collision with root package name */
    public w f6643j;

    /* renamed from: k  reason: collision with root package name */
    public w f6644k;

    /* renamed from: l  reason: collision with root package name */
    public o.x f6645l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6646m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f6647n;

    /* renamed from: o  reason: collision with root package name */
    public b f6648o;

    /* renamed from: p  reason: collision with root package name */
    public c f6649p;

    public static class a extends x {
        public long e() {
            return 0;
        }

        public q q() {
            return null;
        }

        public o.g z() {
            return new e();
        }
    }

    public class b implements p.a {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final t f6650b;
        public int c;

        public b(int i2, t tVar) {
            this.a = i2;
            this.f6650b = tVar;
        }

        public w a(t tVar) {
            v vVar;
            this.c++;
            int i2 = this.a;
            if (i2 > 0) {
                p pVar = g.this.a.f6746n.get(i2 - 1);
                b.p.b.a aVar = g.this.f6638b.a().a.a;
                if (!tVar.a.d.equals(aVar.a.d) || tVar.a.f6725e != aVar.a.f6725e) {
                    throw new IllegalStateException("network interceptor " + pVar + " must retain the same host and port");
                } else if (this.c > 1) {
                    throw new IllegalStateException("network interceptor " + pVar + " must call proceed() exactly once");
                }
            }
            if (this.a < g.this.a.f6746n.size()) {
                g gVar = g.this;
                int i3 = this.a;
                b bVar = new b(i3 + 1, tVar);
                p pVar2 = gVar.a.f6746n.get(i3);
                w a2 = pVar2.a(bVar);
                if (bVar.c != 1) {
                    throw new IllegalStateException("network interceptor " + pVar2 + " must call proceed() exactly once");
                } else if (a2 != null) {
                    return a2;
                } else {
                    throw new NullPointerException("network interceptor " + pVar2 + " returned null");
                }
            } else {
                g.this.d.c(tVar);
                g gVar2 = g.this;
                gVar2.f6642i = tVar;
                if (gVar2.c(tVar) && (vVar = tVar.d) != null) {
                    f l2 = c.l(g.this.d.b(tVar, (long) ((u) vVar).f6761b));
                    u uVar = (u) tVar.d;
                    s sVar = (s) l2;
                    sVar.h(uVar.c, uVar.d, uVar.f6761b);
                    sVar.close();
                }
                w d2 = g.this.d();
                int i4 = d2.c;
                if ((i4 != 204 && i4 != 205) || d2.f6764g.e() <= 0) {
                    return d2;
                }
                StringBuilder z = b.e.a.a.a.z("HTTP ", i4, " had non-zero Content-Length: ");
                z.append(d2.f6764g.e());
                throw new ProtocolException(z.toString());
            }
        }
    }

    public g(r rVar, t tVar, boolean z, boolean z2, boolean z3, p pVar, l lVar, w wVar) {
        p pVar2;
        b.p.b.f fVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        r rVar2 = rVar;
        t tVar2 = tVar;
        this.a = rVar2;
        this.f6641h = tVar2;
        this.f6640g = z;
        this.f6646m = z2;
        this.f6647n = z3;
        if (pVar != null) {
            pVar2 = pVar;
        } else {
            i iVar = rVar2.w;
            if (tVar.b()) {
                SSLSocketFactory sSLSocketFactory2 = rVar2.s;
                hostnameVerifier = rVar2.t;
                sSLSocketFactory = sSLSocketFactory2;
                fVar = rVar2.u;
            } else {
                sSLSocketFactory = null;
                hostnameVerifier = null;
                fVar = null;
            }
            o oVar = tVar2.a;
            String str = oVar.d;
            int i2 = oVar.f6725e;
            l lVar2 = rVar2.x;
            SocketFactory socketFactory = rVar2.r;
            b.p.b.b bVar = rVar2.v;
            Proxy proxy = rVar2.f6742j;
            pVar2 = new p(iVar, new b.p.b.a(str, i2, lVar2, socketFactory, sSLSocketFactory, hostnameVerifier, fVar, bVar, proxy, rVar2.f6743k, rVar2.f6744l, rVar2.f6747o));
        }
        this.f6638b = pVar2;
        this.f6645l = lVar;
        this.c = wVar;
    }

    public static boolean b(w wVar) {
        if (wVar.a.f6756b.equals("HEAD")) {
            return false;
        }
        int i2 = wVar.c;
        if ((i2 < 100 || i2 >= 200) && i2 != 204 && i2 != 304) {
            return true;
        }
        Comparator<String> comparator = j.a;
        if (j.a(wVar.f) == -1) {
            String a2 = wVar.f.a("Transfer-Encoding");
            if (a2 == null) {
                a2 = null;
            }
            if ("chunked".equalsIgnoreCase(a2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static w k(w wVar) {
        if (wVar == null || wVar.f6764g == null) {
            return wVar;
        }
        w.b c2 = wVar.c();
        c2.f6771g = null;
        return c2.a();
    }

    public p a() {
        o.x xVar = this.f6645l;
        if (xVar != null) {
            b.p.b.a0.i.c(xVar);
        }
        w wVar = this.f6644k;
        if (wVar != null) {
            b.p.b.a0.i.c(wVar.f6764g);
        } else {
            this.f6638b.b();
        }
        return this.f6638b;
    }

    public boolean c(t tVar) {
        return b.l.f.x.a.g.Z(tVar.f6756b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008f, code lost:
        if ("close".equalsIgnoreCase(r1) != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.p.b.w d() {
        /*
            r5 = this;
            b.p.b.a0.k.i r0 = r5.d
            r0.a()
            b.p.b.a0.k.i r0 = r5.d
            b.p.b.w$b r0 = r0.f()
            b.p.b.t r1 = r5.f6642i
            r0.a = r1
            b.p.b.a0.k.p r1 = r5.f6638b
            b.p.b.a0.l.a r1 = r1.a()
            b.p.b.m r1 = r1.d
            r0.f6770e = r1
            java.lang.String r1 = b.p.b.a0.k.j.c
            long r2 = r5.f6639e
            java.lang.String r2 = java.lang.Long.toString(r2)
            b.p.b.n$b r3 = r0.f
            r3.d(r1, r2)
            r3.e(r1)
            java.util.List<java.lang.String> r4 = r3.a
            r4.add(r1)
            java.util.List<java.lang.String> r1 = r3.a
            java.lang.String r2 = r2.trim()
            r1.add(r2)
            java.lang.String r1 = b.p.b.a0.k.j.d
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.Long.toString(r2)
            b.p.b.n$b r3 = r0.f
            r3.d(r1, r2)
            r3.e(r1)
            java.util.List<java.lang.String> r4 = r3.a
            r4.add(r1)
            java.util.List<java.lang.String> r1 = r3.a
            java.lang.String r2 = r2.trim()
            r1.add(r2)
            b.p.b.w r0 = r0.a()
            boolean r1 = r5.f6647n
            if (r1 != 0) goto L_0x006f
            b.p.b.w$b r1 = r0.c()
            b.p.b.a0.k.i r2 = r5.d
            b.p.b.x r0 = r2.g(r0)
            r1.f6771g = r0
            b.p.b.w r0 = r1.a()
        L_0x006f:
            b.p.b.t r1 = r0.a
            b.p.b.n r1 = r1.c
            java.lang.String r2 = "Connection"
            java.lang.String r1 = r1.a(r2)
            java.lang.String r3 = "close"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0091
            b.p.b.n r1 = r0.f
            java.lang.String r1 = r1.a(r2)
            if (r1 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r1 = 0
        L_0x008b:
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0096
        L_0x0091:
            b.p.b.a0.k.p r1 = r5.f6638b
            r1.f()
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.k.g.d():b.p.b.w");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
        if (r7.getTime() < r1.getTime()) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e() {
        /*
            r13 = this;
            b.p.b.w r0 = r13.f6644k
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            b.p.b.t r0 = r13.f6642i
            if (r0 != 0) goto L_0x0016
            b.p.b.w r1 = r13.f6643j
            if (r1 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call sendRequest() first!"
            r0.<init>(r1)
            throw r0
        L_0x0016:
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            boolean r1 = r13.f6647n
            java.lang.String r2 = "Content-Length"
            r3 = 0
            if (r1 == 0) goto L_0x0026
            b.p.b.a0.k.i r1 = r13.d
            r1.c(r0)
            goto L_0x0082
        L_0x0026:
            boolean r1 = r13.f6646m
            if (r1 != 0) goto L_0x0034
            b.p.b.a0.k.g$b r1 = new b.p.b.a0.k.g$b
            r1.<init>(r3, r0)
            b.p.b.w r0 = r1.a(r0)
            goto L_0x0086
        L_0x0034:
            long r4 = r13.f6639e
            r6 = -1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x006e
            java.util.Comparator<java.lang.String> r1 = b.p.b.a0.k.j.a
            b.p.b.n r0 = r0.c
            long r0 = b.p.b.a0.k.j.a(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            o.x r0 = r13.f6645l
            boolean r1 = r0 instanceof b.p.b.a0.k.l
            if (r1 == 0) goto L_0x0067
            b.p.b.a0.k.l r0 = (b.p.b.a0.k.l) r0
            o.e r0 = r0.f6660j
            long r0 = r0.f10453i
            b.p.b.t r4 = r13.f6642i
            b.p.b.t$b r4 = r4.c()
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4.b(r2, r0)
            b.p.b.t r0 = r4.a()
            r13.f6642i = r0
        L_0x0067:
            b.p.b.a0.k.i r0 = r13.d
            b.p.b.t r1 = r13.f6642i
            r0.c(r1)
        L_0x006e:
            o.x r0 = r13.f6645l
            if (r0 == 0) goto L_0x0082
            r0.close()
            o.x r0 = r13.f6645l
            boolean r1 = r0 instanceof b.p.b.a0.k.l
            if (r1 == 0) goto L_0x0082
            b.p.b.a0.k.i r1 = r13.d
            b.p.b.a0.k.l r0 = (b.p.b.a0.k.l) r0
            r1.e(r0)
        L_0x0082:
            b.p.b.w r0 = r13.d()
        L_0x0086:
            b.p.b.n r1 = r0.f
            r13.f(r1)
            b.p.b.w r1 = r13.f6643j
            java.lang.String r4 = "networkResponse"
            r5 = 1
            if (r1 == 0) goto L_0x0190
            int r6 = r0.c
            r7 = 304(0x130, float:4.26E-43)
            if (r6 != r7) goto L_0x0099
            goto L_0x00c6
        L_0x0099:
            b.p.b.n r1 = r1.f
            java.lang.String r6 = "Last-Modified"
            java.lang.String r1 = r1.a(r6)
            r7 = 0
            if (r1 == 0) goto L_0x00a9
            java.util.Date r1 = b.p.b.a0.k.f.a(r1)
            goto L_0x00aa
        L_0x00a9:
            r1 = r7
        L_0x00aa:
            if (r1 == 0) goto L_0x00c8
            b.p.b.n r8 = r0.f
            java.lang.String r6 = r8.a(r6)
            if (r6 == 0) goto L_0x00b8
            java.util.Date r7 = b.p.b.a0.k.f.a(r6)
        L_0x00b8:
            if (r7 == 0) goto L_0x00c8
            long r6 = r7.getTime()
            long r8 = r1.getTime()
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x00c8
        L_0x00c6:
            r1 = r5
            goto L_0x00c9
        L_0x00c8:
            r1 = r3
        L_0x00c9:
            if (r1 == 0) goto L_0x0189
            b.p.b.w r1 = r13.f6643j
            b.p.b.w$b r1 = r1.c()
            b.p.b.t r5 = r13.f6641h
            r1.a = r5
            b.p.b.w r5 = r13.c
            b.p.b.w r5 = k(r5)
            r1.e(r5)
            b.p.b.w r5 = r13.f6643j
            b.p.b.n r5 = r5.f
            b.p.b.n r6 = r0.f
            b.p.b.n$b r7 = new b.p.b.n$b
            r7.<init>()
            int r8 = r5.d()
            r9 = r3
        L_0x00ee:
            if (r9 >= r8) goto L_0x011b
            java.lang.String r10 = r5.b(r9)
            java.lang.String r11 = r5.e(r9)
            java.lang.String r12 = "Warning"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 == 0) goto L_0x0109
            java.lang.String r12 = "1"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x0109
            goto L_0x0118
        L_0x0109:
            boolean r12 = b.p.b.a0.k.j.b(r10)
            if (r12 == 0) goto L_0x0115
            java.lang.String r12 = r6.a(r10)
            if (r12 != 0) goto L_0x0118
        L_0x0115:
            r7.a(r10, r11)
        L_0x0118:
            int r9 = r9 + 1
            goto L_0x00ee
        L_0x011b:
            int r5 = r6.d()
        L_0x011f:
            if (r3 >= r5) goto L_0x013c
            java.lang.String r8 = r6.b(r3)
            boolean r9 = r2.equalsIgnoreCase(r8)
            if (r9 == 0) goto L_0x012c
            goto L_0x0139
        L_0x012c:
            boolean r9 = b.p.b.a0.k.j.b(r8)
            if (r9 == 0) goto L_0x0139
            java.lang.String r9 = r6.e(r3)
            r7.a(r8, r9)
        L_0x0139:
            int r3 = r3 + 1
            goto L_0x011f
        L_0x013c:
            b.p.b.n r2 = r7.c()
            r1.d(r2)
            b.p.b.w r2 = r13.f6643j
            b.p.b.w r2 = k(r2)
            r1.b(r2)
            b.p.b.w r2 = k(r0)
            if (r2 == 0) goto L_0x0155
            r1.c(r4, r2)
        L_0x0155:
            r1.f6772h = r2
            b.p.b.w r1 = r1.a()
            r13.f6644k = r1
            b.p.b.x r0 = r0.f6764g
            r0.close()
            b.p.b.a0.k.p r0 = r13.f6638b
            r0.g()
            b.p.b.a0.b r0 = b.p.b.a0.b.f6471b
            b.p.b.r r1 = r13.a
            b.p.b.r$a r0 = (b.p.b.r.a) r0
            java.util.Objects.requireNonNull(r0)
            b.p.b.a0.c r0 = r1.f6749q
            r0.d()
            b.p.b.w r1 = r13.f6643j
            b.p.b.w r2 = r13.f6644k
            b.p.b.w r2 = k(r2)
            r0.f(r1, r2)
            b.p.b.w r0 = r13.f6644k
            b.p.b.w r0 = r13.l(r0)
            r13.f6644k = r0
            return
        L_0x0189:
            b.p.b.w r1 = r13.f6643j
            b.p.b.x r1 = r1.f6764g
            b.p.b.a0.i.c(r1)
        L_0x0190:
            b.p.b.w$b r1 = r0.c()
            b.p.b.t r2 = r13.f6641h
            r1.a = r2
            b.p.b.w r2 = r13.c
            b.p.b.w r2 = k(r2)
            r1.e(r2)
            b.p.b.w r2 = r13.f6643j
            b.p.b.w r2 = k(r2)
            r1.b(r2)
            b.p.b.w r0 = k(r0)
            if (r0 == 0) goto L_0x01b3
            r1.c(r4, r0)
        L_0x01b3:
            r1.f6772h = r0
            b.p.b.w r0 = r1.a()
            r13.f6644k = r0
            boolean r0 = b(r0)
            if (r0 == 0) goto L_0x0252
            b.p.b.a0.b r0 = b.p.b.a0.b.f6471b
            b.p.b.r r1 = r13.a
            b.p.b.r$a r0 = (b.p.b.r.a) r0
            java.util.Objects.requireNonNull(r0)
            b.p.b.a0.c r0 = r1.f6749q
            if (r0 != 0) goto L_0x01cf
            goto L_0x021a
        L_0x01cf:
            b.p.b.w r1 = r13.f6644k
            b.p.b.t r2 = r13.f6642i
            boolean r1 = b.p.b.a0.k.c.a(r1, r2)
            if (r1 != 0) goto L_0x020e
            b.p.b.t r1 = r13.f6642i
            java.lang.String r1 = r1.f6756b
            java.lang.String r2 = "POST"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0205
            java.lang.String r2 = "PATCH"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0205
            java.lang.String r2 = "PUT"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0205
            java.lang.String r2 = "DELETE"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0205
            java.lang.String r2 = "MOVE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0206
        L_0x0205:
            r3 = r5
        L_0x0206:
            if (r3 == 0) goto L_0x021a
            b.p.b.t r1 = r13.f6642i     // Catch:{ IOException -> 0x021a }
            r0.b(r1)     // Catch:{ IOException -> 0x021a }
            goto L_0x021a
        L_0x020e:
            b.p.b.w r1 = r13.f6644k
            b.p.b.w r1 = k(r1)
            b.p.b.a0.k.b r0 = r0.c(r1)
            r13.f6648o = r0
        L_0x021a:
            b.p.b.a0.k.b r0 = r13.f6648o
            b.p.b.w r1 = r13.f6644k
            if (r0 != 0) goto L_0x0221
            goto L_0x024c
        L_0x0221:
            o.x r2 = r0.a()
            if (r2 != 0) goto L_0x0228
            goto L_0x024c
        L_0x0228:
            b.p.b.x r3 = r1.f6764g
            o.g r3 = r3.z()
            o.f r2 = e.a.a.a.y0.m.o1.c.l(r2)
            b.p.b.a0.k.h r4 = new b.p.b.a0.k.h
            r4.<init>(r13, r3, r0, r2)
            b.p.b.w$b r0 = r1.c()
            b.p.b.a0.k.k r2 = new b.p.b.a0.k.k
            b.p.b.n r1 = r1.f
            o.g r3 = e.a.a.a.y0.m.o1.c.m(r4)
            r2.<init>(r1, r3)
            r0.f6771g = r2
            b.p.b.w r1 = r0.a()
        L_0x024c:
            b.p.b.w r0 = r13.l(r1)
            r13.f6644k = r0
        L_0x0252:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.k.g.e():void");
    }

    public void f(n nVar) {
        CookieHandler cookieHandler = this.a.f6748p;
        if (cookieHandler != null) {
            cookieHandler.put(this.f6641h.d(), j.d(nVar, (String) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.p.b.a0.k.g g(b.p.b.a0.k.m r11) {
        /*
            r10 = this;
            b.p.b.a0.k.p r0 = r10.f6638b
            b.p.b.a0.l.a r1 = r0.d
            if (r1 == 0) goto L_0x000b
            java.io.IOException r1 = r11.f6662h
            r0.c(r1)
        L_0x000b:
            b.p.b.a0.k.n r0 = r0.c
            r1 = 0
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x003d
        L_0x0016:
            java.io.IOException r11 = r11.f6662h
            boolean r0 = r11 instanceof java.net.ProtocolException
            r2 = 1
            if (r0 == 0) goto L_0x001e
            goto L_0x0036
        L_0x001e:
            boolean r0 = r11 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L_0x0025
            boolean r11 = r11 instanceof java.net.SocketTimeoutException
            goto L_0x0039
        L_0x0025:
            boolean r0 = r11 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L_0x0032
            java.lang.Throwable r0 = r11.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            boolean r11 = r11 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r11 == 0) goto L_0x0038
        L_0x0036:
            r11 = r1
            goto L_0x0039
        L_0x0038:
            r11 = r2
        L_0x0039:
            if (r11 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            r11 = 0
            if (r1 != 0) goto L_0x0041
            return r11
        L_0x0041:
            b.p.b.r r0 = r10.a
            boolean r0 = r0.A
            if (r0 != 0) goto L_0x0048
            return r11
        L_0x0048:
            b.p.b.a0.k.p r7 = r10.a()
            b.p.b.a0.k.g r11 = new b.p.b.a0.k.g
            b.p.b.r r2 = r10.a
            b.p.b.t r3 = r10.f6641h
            boolean r4 = r10.f6640g
            boolean r5 = r10.f6646m
            boolean r6 = r10.f6647n
            o.x r0 = r10.f6645l
            r8 = r0
            b.p.b.a0.k.l r8 = (b.p.b.a0.k.l) r8
            b.p.b.w r9 = r10.c
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.k.g.g(b.p.b.a0.k.m):b.p.b.a0.k.g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == 1) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.p.b.a0.k.g h(java.io.IOException r10, o.x r11) {
        /*
            r9 = this;
            b.p.b.a0.k.p r11 = r9.f6638b
            b.p.b.a0.l.a r0 = r11.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            int r0 = r0.f6675g
            r11.c(r10)
            if (r0 != r2) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            b.p.b.a0.k.n r11 = r11.c
            if (r11 == 0) goto L_0x001a
            boolean r11 = r11.b()
            if (r11 == 0) goto L_0x0029
        L_0x001a:
            boolean r11 = r10 instanceof java.net.ProtocolException
            if (r11 == 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            boolean r10 = r10 instanceof java.io.InterruptedIOException
            if (r10 == 0) goto L_0x0025
        L_0x0023:
            r10 = r1
            goto L_0x0026
        L_0x0025:
            r10 = r2
        L_0x0026:
            if (r10 == 0) goto L_0x0029
            r1 = r2
        L_0x0029:
            r10 = 0
            if (r1 != 0) goto L_0x002d
            return r10
        L_0x002d:
            b.p.b.r r11 = r9.a
            boolean r11 = r11.A
            if (r11 != 0) goto L_0x0034
            return r10
        L_0x0034:
            b.p.b.a0.k.p r6 = r9.a()
            b.p.b.a0.k.g r10 = new b.p.b.a0.k.g
            b.p.b.r r1 = r9.a
            b.p.b.t r2 = r9.f6641h
            boolean r3 = r9.f6640g
            boolean r4 = r9.f6646m
            boolean r5 = r9.f6647n
            b.p.b.w r8 = r9.c
            r7 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.k.g.h(java.io.IOException, o.x):b.p.b.a0.k.g");
    }

    public boolean i(o oVar) {
        o oVar2 = this.f6641h.a;
        return oVar2.d.equals(oVar.d) && oVar2.f6725e == oVar.f6725e && oVar2.a.equals(oVar.a);
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [b.p.b.w, b.p.b.a0.k.c$a, b.p.b.t] */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0210, code lost:
        if (r7 > 0) goto L_0x01fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r27 = this;
            r1 = r27
            b.p.b.a0.k.c r0 = r1.f6649p
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            b.p.b.a0.k.i r0 = r1.d
            if (r0 != 0) goto L_0x0441
            b.p.b.t r0 = r1.f6641h
            b.p.b.t$b r2 = r0.c()
            b.p.b.n r3 = r0.c
            java.lang.String r4 = "Host"
            java.lang.String r3 = r3.a(r4)
            if (r3 != 0) goto L_0x0024
            b.p.b.o r3 = r0.a
            java.lang.String r3 = b.p.b.a0.i.g(r3)
            r2.b(r4, r3)
        L_0x0024:
            b.p.b.n r3 = r0.c
            java.lang.String r4 = "Connection"
            java.lang.String r3 = r3.a(r4)
            if (r3 != 0) goto L_0x0033
            java.lang.String r3 = "Keep-Alive"
            r2.b(r4, r3)
        L_0x0033:
            b.p.b.n r3 = r0.c
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r3 = r3.a(r4)
            r5 = 1
            if (r3 != 0) goto L_0x0045
            r1.f = r5
            java.lang.String r3 = "gzip"
            r2.b(r4, r3)
        L_0x0045:
            b.p.b.r r3 = r1.a
            java.net.CookieHandler r3 = r3.f6748p
            r4 = 0
            r6 = 0
            if (r3 == 0) goto L_0x00d1
            b.p.b.t r7 = r2.a()
            b.p.b.n r7 = r7.c
            java.util.Map r7 = b.p.b.a0.k.j.d(r7, r6)
            java.net.URI r8 = r0.d()
            java.util.Map r3 = r3.get(r8, r7)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0067:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00d1
            java.lang.Object r7 = r3.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "Cookie"
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 != 0) goto L_0x0089
            java.lang.String r9 = "Cookie2"
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 == 0) goto L_0x0067
        L_0x0089:
            java.lang.Object r9 = r7.getValue()
            java.util.List r9 = (java.util.List) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0067
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            int r9 = r7.size()
            if (r9 != r5) goto L_0x00a8
            java.lang.Object r7 = r7.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00cb
        L_0x00a8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r7.size()
            r11 = r4
        L_0x00b2:
            if (r11 >= r10) goto L_0x00c7
            if (r11 <= 0) goto L_0x00bb
            java.lang.String r12 = "; "
            r9.append(r12)
        L_0x00bb:
            java.lang.Object r12 = r7.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            r9.append(r12)
            int r11 = r11 + 1
            goto L_0x00b2
        L_0x00c7:
            java.lang.String r7 = r9.toString()
        L_0x00cb:
            b.p.b.n$b r9 = r2.c
            r9.a(r8, r7)
            goto L_0x0067
        L_0x00d1:
            b.p.b.n r0 = r0.c
            java.lang.String r3 = "User-Agent"
            java.lang.String r0 = r0.a(r3)
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "okhttp/2.7.5"
            r2.b(r3, r0)
        L_0x00e0:
            b.p.b.t r0 = r2.a()
            b.p.b.a0.b r2 = b.p.b.a0.b.f6471b
            b.p.b.r r3 = r1.a
            b.p.b.r$a r2 = (b.p.b.r.a) r2
            java.util.Objects.requireNonNull(r2)
            b.p.b.a0.c r2 = r3.f6749q
            if (r2 == 0) goto L_0x00f6
            b.p.b.w r3 = r2.a(r0)
            goto L_0x00f7
        L_0x00f6:
            r3 = r6
        L_0x00f7:
            long r7 = java.lang.System.currentTimeMillis()
            r9 = -1
            if (r3 == 0) goto L_0x0181
            b.p.b.n r12 = r3.f
            int r13 = r12.d()
            r14 = r4
            r16 = r6
            r21 = r16
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r15 = r9
            r17 = 0
            r19 = 0
        L_0x0116:
            if (r14 >= r13) goto L_0x0192
            java.lang.String r4 = r12.b(r14)
            java.lang.String r5 = r12.e(r14)
            java.lang.String r10 = "Date"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x012f
            java.util.Date r16 = b.p.b.a0.k.f.a(r5)
            r25 = r5
            goto L_0x017c
        L_0x012f:
            java.lang.String r10 = "Expires"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x013c
            java.util.Date r21 = b.p.b.a0.k.f.a(r5)
            goto L_0x017c
        L_0x013c:
            java.lang.String r10 = "Last-Modified"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x014b
            java.util.Date r22 = b.p.b.a0.k.f.a(r5)
            r24 = r5
            goto L_0x017c
        L_0x014b:
            java.lang.String r10 = "ETag"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x0156
            r23 = r5
            goto L_0x017c
        L_0x0156:
            java.lang.String r10 = "Age"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x0163
            int r15 = b.l.f.x.a.g.Y(r5, r9)
            goto L_0x017c
        L_0x0163:
            java.lang.String r10 = b.p.b.a0.k.j.c
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x0170
            long r19 = java.lang.Long.parseLong(r5)
            goto L_0x017c
        L_0x0170:
            java.lang.String r10 = b.p.b.a0.k.j.d
            boolean r4 = r10.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x017c
            long r17 = java.lang.Long.parseLong(r5)
        L_0x017c:
            int r14 = r14 + 1
            r4 = 0
            r5 = 1
            goto L_0x0116
        L_0x0181:
            r16 = r6
            r21 = r16
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r15 = r9
            r17 = 0
            r19 = 0
        L_0x0192:
            if (r3 != 0) goto L_0x019b
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r0, r6, r6)
            goto L_0x0301
        L_0x019b:
            boolean r4 = r0.b()
            if (r4 == 0) goto L_0x01ac
            b.p.b.m r4 = r3.f6763e
            if (r4 != 0) goto L_0x01ac
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r0, r6, r6)
            goto L_0x0301
        L_0x01ac:
            boolean r4 = b.p.b.a0.k.c.a(r3, r0)
            if (r4 != 0) goto L_0x01b9
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r0, r6, r6)
            goto L_0x0301
        L_0x01b9:
            b.p.b.c r4 = r0.a()
            boolean r5 = r4.a
            if (r5 != 0) goto L_0x02fc
            boolean r5 = b.p.b.a0.k.c.b.a(r0)
            if (r5 == 0) goto L_0x01c9
            goto L_0x02fc
        L_0x01c9:
            if (r16 == 0) goto L_0x01d8
            long r10 = r16.getTime()
            long r10 = r17 - r10
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            goto L_0x01da
        L_0x01d8:
            r10 = 0
        L_0x01da:
            if (r15 == r9) goto L_0x01e7
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r15
            long r12 = r5.toMillis(r12)
            long r10 = java.lang.Math.max(r10, r12)
        L_0x01e7:
            long r12 = r17 - r19
            long r7 = r7 - r17
            long r10 = r10 + r12
            long r10 = r10 + r7
            b.p.b.c r5 = r3.a()
            int r5 = r5.c
            if (r5 == r9) goto L_0x01fe
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r5
            long r7 = r7.toMillis(r12)
        L_0x01fc:
            r12 = r7
            goto L_0x0213
        L_0x01fe:
            if (r21 == 0) goto L_0x0217
            if (r16 == 0) goto L_0x0206
            long r17 = r16.getTime()
        L_0x0206:
            long r7 = r21.getTime()
            long r7 = r7 - r17
            r12 = 0
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x024a
            goto L_0x01fc
        L_0x0213:
            r7 = r12
            r12 = 0
            goto L_0x024d
        L_0x0217:
            if (r22 == 0) goto L_0x024a
            b.p.b.t r5 = r3.a
            b.p.b.o r5 = r5.a
            java.util.List<java.lang.String> r7 = r5.f6726g
            if (r7 != 0) goto L_0x0223
            r5 = r6
            goto L_0x0231
        L_0x0223:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.List<java.lang.String> r5 = r5.f6726g
            b.p.b.o.j(r7, r5)
            java.lang.String r5 = r7.toString()
        L_0x0231:
            if (r5 != 0) goto L_0x024a
            if (r16 == 0) goto L_0x0239
            long r19 = r16.getTime()
        L_0x0239:
            long r7 = r22.getTime()
            long r19 = r19 - r7
            r12 = 0
            int r5 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x024c
            r7 = 10
            long r7 = r19 / r7
            goto L_0x024d
        L_0x024a:
            r12 = 0
        L_0x024c:
            r7 = r12
        L_0x024d:
            int r5 = r4.c
            if (r5 == r9) goto L_0x025c
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r5
            long r12 = r14.toMillis(r12)
            long r7 = java.lang.Math.min(r7, r12)
        L_0x025c:
            int r5 = r4.f6690i
            if (r5 == r9) goto L_0x0268
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r5
            long r12 = r12.toMillis(r13)
            goto L_0x026a
        L_0x0268:
            r12 = 0
        L_0x026a:
            b.p.b.c r5 = r3.a()
            boolean r14 = r5.f6688g
            if (r14 != 0) goto L_0x0280
            int r4 = r4.f6689h
            if (r4 == r9) goto L_0x0280
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            r17 = r7
            long r6 = (long) r4
            long r6 = r14.toMillis(r6)
            goto L_0x0284
        L_0x0280:
            r17 = r7
            r6 = 0
        L_0x0284:
            boolean r4 = r5.a
            if (r4 != 0) goto L_0x02cb
            long r12 = r12 + r10
            long r6 = r6 + r17
            int r4 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x02cb
            b.p.b.w$b r4 = r3.c()
            int r5 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            java.lang.String r6 = "Warning"
            if (r5 < 0) goto L_0x02a0
            b.p.b.n$b r5 = r4.f
            java.lang.String r7 = "110 HttpURLConnection \"Response is stale\""
            r5.a(r6, r7)
        L_0x02a0:
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x02bf
            b.p.b.c r5 = r3.a()
            int r5 = r5.c
            if (r5 != r9) goto L_0x02b4
            if (r21 != 0) goto L_0x02b4
            r26 = 1
            goto L_0x02b6
        L_0x02b4:
            r26 = 0
        L_0x02b6:
            if (r26 == 0) goto L_0x02bf
            b.p.b.n$b r5 = r4.f
            java.lang.String r7 = "113 HttpURLConnection \"Heuristic expiration\""
            r5.a(r6, r7)
        L_0x02bf:
            b.p.b.a0.k.c r5 = new b.p.b.a0.k.c
            b.p.b.w r4 = r4.a()
            r6 = 0
            r5.<init>(r6, r4, r6)
        L_0x02c9:
            r4 = r5
            goto L_0x0301
        L_0x02cb:
            b.p.b.t$b r4 = r0.c()
            java.lang.String r5 = "If-Modified-Since"
            if (r23 == 0) goto L_0x02d8
            java.lang.String r5 = "If-None-Match"
            r6 = r23
            goto L_0x02e1
        L_0x02d8:
            if (r22 == 0) goto L_0x02dd
            r6 = r24
            goto L_0x02e1
        L_0x02dd:
            if (r16 == 0) goto L_0x02e4
            r6 = r25
        L_0x02e1:
            r4.b(r5, r6)
        L_0x02e4:
            b.p.b.t r4 = r4.a()
            boolean r5 = b.p.b.a0.k.c.b.a(r4)
            if (r5 == 0) goto L_0x02f5
            b.p.b.a0.k.c r5 = new b.p.b.a0.k.c
            r6 = 0
            r5.<init>(r4, r3, r6)
            goto L_0x02c9
        L_0x02f5:
            r6 = 0
            b.p.b.a0.k.c r5 = new b.p.b.a0.k.c
            r5.<init>(r4, r6, r6)
            goto L_0x02c9
        L_0x02fc:
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r0, r6, r6)
        L_0x0301:
            b.p.b.t r5 = r4.a
            if (r5 == 0) goto L_0x0312
            b.p.b.c r5 = r0.a()
            boolean r5 = r5.f6691j
            if (r5 == 0) goto L_0x0312
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r6, r6, r6)
        L_0x0312:
            r1.f6649p = r4
            b.p.b.t r5 = r4.a
            r1.f6642i = r5
            b.p.b.w r5 = r4.f6602b
            r1.f6643j = r5
            if (r2 == 0) goto L_0x0321
            r2.e(r4)
        L_0x0321:
            if (r3 == 0) goto L_0x032c
            b.p.b.w r2 = r1.f6643j
            if (r2 != 0) goto L_0x032c
            b.p.b.x r2 = r3.f6764g
            b.p.b.a0.i.c(r2)
        L_0x032c:
            b.p.b.t r2 = r1.f6642i
            if (r2 == 0) goto L_0x03f3
            java.lang.String r2 = r2.f6756b
            java.lang.String r3 = "GET"
            boolean r2 = r2.equals(r3)
            r3 = 1
            r9 = r2 ^ 1
            b.p.b.a0.k.p r2 = r1.f6638b
            b.p.b.r r3 = r1.a
            int r5 = r3.B
            int r10 = r3.C
            int r11 = r3.D
            boolean r8 = r3.A
            java.util.Objects.requireNonNull(r2)
            r4 = r2
            r6 = r10
            r7 = r11
            b.p.b.a0.l.a r3 = r4.e(r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x03ec }
            b.p.b.a0.j.d r4 = r3.f     // Catch:{ IOException -> 0x03ec }
            if (r4 == 0) goto L_0x035d
            b.p.b.a0.k.e r4 = new b.p.b.a0.k.e     // Catch:{ IOException -> 0x03ec }
            b.p.b.a0.j.d r5 = r3.f     // Catch:{ IOException -> 0x03ec }
            r4.<init>(r2, r5)     // Catch:{ IOException -> 0x03ec }
            goto L_0x0381
        L_0x035d:
            java.net.Socket r4 = r3.c     // Catch:{ IOException -> 0x03ec }
            r4.setSoTimeout(r10)     // Catch:{ IOException -> 0x03ec }
            o.g r4 = r3.f6676h     // Catch:{ IOException -> 0x03ec }
            o.a0 r4 = r4.f()     // Catch:{ IOException -> 0x03ec }
            long r5 = (long) r10     // Catch:{ IOException -> 0x03ec }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x03ec }
            r4.g(r5, r7)     // Catch:{ IOException -> 0x03ec }
            o.f r4 = r3.f6677i     // Catch:{ IOException -> 0x03ec }
            o.a0 r4 = r4.f()     // Catch:{ IOException -> 0x03ec }
            long r5 = (long) r11     // Catch:{ IOException -> 0x03ec }
            r4.g(r5, r7)     // Catch:{ IOException -> 0x03ec }
            b.p.b.a0.k.d r4 = new b.p.b.a0.k.d     // Catch:{ IOException -> 0x03ec }
            o.g r5 = r3.f6676h     // Catch:{ IOException -> 0x03ec }
            o.f r6 = r3.f6677i     // Catch:{ IOException -> 0x03ec }
            r4.<init>(r2, r5, r6)     // Catch:{ IOException -> 0x03ec }
        L_0x0381:
            b.p.b.i r5 = r2.f6669b     // Catch:{ IOException -> 0x03ec }
            monitor-enter(r5)     // Catch:{ IOException -> 0x03ec }
            int r6 = r3.f6675g     // Catch:{ all -> 0x03e9 }
            r7 = 1
            int r6 = r6 + r7
            r3.f6675g = r6     // Catch:{ all -> 0x03e9 }
            r2.f = r4     // Catch:{ all -> 0x03e9 }
            monitor-exit(r5)     // Catch:{ all -> 0x03e9 }
            r1.d = r4
            r4.d(r1)
            boolean r2 = r1.f6646m
            if (r2 == 0) goto L_0x0440
            b.p.b.t r2 = r1.f6642i
            boolean r2 = r1.c(r2)
            if (r2 == 0) goto L_0x0440
            o.x r2 = r1.f6645l
            if (r2 != 0) goto L_0x0440
            java.util.Comparator<java.lang.String> r2 = b.p.b.a0.k.j.a
            b.p.b.n r0 = r0.c
            long r2 = b.p.b.a0.k.j.a(r0)
            boolean r0 = r1.f6640g
            if (r0 == 0) goto L_0x03d7
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x03cf
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x03c9
            b.p.b.a0.k.i r0 = r1.d
            b.p.b.t r4 = r1.f6642i
            r0.c(r4)
            b.p.b.a0.k.l r0 = new b.p.b.a0.k.l
            int r2 = (int) r2
            r0.<init>(r2)
            goto L_0x03e6
        L_0x03c9:
            b.p.b.a0.k.l r0 = new b.p.b.a0.k.l
            r0.<init>()
            goto L_0x03e6
        L_0x03cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB."
            r0.<init>(r2)
            throw r0
        L_0x03d7:
            b.p.b.a0.k.i r0 = r1.d
            b.p.b.t r4 = r1.f6642i
            r0.c(r4)
            b.p.b.a0.k.i r0 = r1.d
            b.p.b.t r4 = r1.f6642i
            o.x r0 = r0.b(r4, r2)
        L_0x03e6:
            r1.f6645l = r0
            goto L_0x0440
        L_0x03e9:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03e9 }
            throw r0     // Catch:{ IOException -> 0x03ec }
        L_0x03ec:
            r0 = move-exception
            b.p.b.a0.k.m r2 = new b.p.b.a0.k.m
            r2.<init>(r0)
            throw r2
        L_0x03f3:
            b.p.b.w r0 = r1.f6643j
            if (r0 == 0) goto L_0x0412
            b.p.b.w$b r0 = r0.c()
            b.p.b.t r2 = r1.f6641h
            r0.a = r2
            b.p.b.w r2 = r1.c
            b.p.b.w r2 = k(r2)
            r0.e(r2)
            b.p.b.w r2 = r1.f6643j
            b.p.b.w r2 = k(r2)
            r0.b(r2)
            goto L_0x0434
        L_0x0412:
            b.p.b.w$b r0 = new b.p.b.w$b
            r0.<init>()
            b.p.b.t r2 = r1.f6641h
            r0.a = r2
            b.p.b.w r2 = r1.c
            b.p.b.w r2 = k(r2)
            r0.e(r2)
            b.p.b.s r2 = b.p.b.s.HTTP_1_1
            r0.f6769b = r2
            r2 = 504(0x1f8, float:7.06E-43)
            r0.c = r2
            java.lang.String r2 = "Unsatisfiable Request (only-if-cached)"
            r0.d = r2
            b.p.b.x r2 = f6637q
            r0.f6771g = r2
        L_0x0434:
            b.p.b.w r0 = r0.a()
            r1.f6644k = r0
            b.p.b.w r0 = r1.l(r0)
            r1.f6644k = r0
        L_0x0440:
            return
        L_0x0441:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.k.g.j():void");
    }

    public final w l(w wVar) {
        x xVar;
        if (!this.f) {
            return wVar;
        }
        String a2 = this.f6644k.f.a("Content-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if (!"gzip".equalsIgnoreCase(a2) || (xVar = wVar.f6764g) == null) {
            return wVar;
        }
        m mVar = new m(xVar.z());
        n.b c2 = wVar.f.c();
        c2.e("Content-Encoding");
        c2.e("Content-Length");
        n c3 = c2.c();
        w.b c4 = wVar.c();
        c4.d(c3);
        c4.f6771g = new k(c3, c.m(mVar));
        return c4.a();
    }

    public void m() {
        if (this.f6639e == -1) {
            this.f6639e = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }
}
