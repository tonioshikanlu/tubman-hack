package b.p.b;

import androidx.core.app.NotificationCompat;
import b.g.a.i.b.j;
import b.p.b.a0.k.g;
import b.p.b.p;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class d {
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6695b;
    public t c;
    public g d;

    public class b implements p.a {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final t f6696b;
        public final boolean c;

        public b(int i2, t tVar, boolean z) {
            this.a = i2;
            this.f6696b = tVar;
            this.c = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0201, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0113, code lost:
            if (r8.equals("HEAD") == false) goto L_0x014d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            r2.d = r4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0191 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x019b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b.p.b.w a(b.p.b.t r20) {
            /*
                r19 = this;
                r1 = r19
                r0 = r20
                int r2 = r1.a
                b.p.b.d r3 = b.p.b.d.this
                b.p.b.r r3 = r3.a
                java.util.List<b.p.b.p> r3 = r3.f6745m
                int r3 = r3.size()
                if (r2 >= r3) goto L_0x004c
                b.p.b.d$b r2 = new b.p.b.d$b
                b.p.b.d r3 = b.p.b.d.this
                int r4 = r1.a
                int r5 = r4 + 1
                boolean r6 = r1.c
                r2.<init>(r5, r0, r6)
                b.p.b.r r0 = r3.a
                java.util.List<b.p.b.p> r0 = r0.f6745m
                java.lang.Object r0 = r0.get(r4)
                b.p.b.p r0 = (b.p.b.p) r0
                b.p.b.w r2 = r0.a(r2)
                if (r2 == 0) goto L_0x0030
                return r2
            L_0x0030:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "application interceptor "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = " returned null"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                throw r2
            L_0x004c:
                b.p.b.d r2 = b.p.b.d.this
                boolean r12 = r1.c
                java.util.Objects.requireNonNull(r2)
                b.p.b.v r3 = r0.d
                java.lang.String r13 = "Content-Type"
                java.lang.String r14 = "Content-Length"
                java.lang.String r15 = "Transfer-Encoding"
                if (r3 == 0) goto L_0x0090
                b.p.b.t$b r0 = r20.c()
                b.p.b.u r3 = (b.p.b.u) r3
                b.p.b.q r4 = r3.a
                if (r4 == 0) goto L_0x006c
                java.lang.String r4 = r4.a
                r0.b(r13, r4)
            L_0x006c:
                int r3 = r3.f6761b
                long r3 = (long) r3
                r5 = -1
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 == 0) goto L_0x0082
                java.lang.String r3 = java.lang.Long.toString(r3)
                r0.b(r14, r3)
                b.p.b.n$b r3 = r0.c
                r3.e(r15)
                goto L_0x008c
            L_0x0082:
                java.lang.String r3 = "chunked"
                r0.b(r15, r3)
                b.p.b.n$b r3 = r0.c
                r3.e(r14)
            L_0x008c:
                b.p.b.t r0 = r0.a()
            L_0x0090:
                r5 = r0
                b.p.b.a0.k.g r0 = new b.p.b.a0.k.g
                b.p.b.r r4 = r2.a
                r6 = 0
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r3 = r0
                r8 = r12
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r2.d = r0
                r16 = 0
                r3 = r16
            L_0x00a5:
                r4 = 0
                r5 = 1
                b.p.b.a0.k.g r0 = r2.d     // Catch:{ m -> 0x01f4, IOException -> 0x01e9 }
                r0.j()     // Catch:{ m -> 0x01f4, IOException -> 0x01e9 }
                b.p.b.a0.k.g r0 = r2.d     // Catch:{ m -> 0x01f4, IOException -> 0x01e9 }
                r0.e()     // Catch:{ m -> 0x01f4, IOException -> 0x01e9 }
                b.p.b.a0.k.g r0 = r2.d
                b.p.b.w r11 = r0.f6644k
                if (r11 == 0) goto L_0x01e1
                b.p.b.a0.k.p r6 = r0.f6638b
                b.p.b.a0.l.a r6 = r6.a()
                if (r6 == 0) goto L_0x00c2
                b.p.b.y r6 = r6.a
                goto L_0x00c3
            L_0x00c2:
                r6 = r4
            L_0x00c3:
                if (r6 == 0) goto L_0x00c8
                java.net.Proxy r6 = r6.f6776b
                goto L_0x00cc
            L_0x00c8:
                b.p.b.r r6 = r0.a
                java.net.Proxy r6 = r6.f6742j
            L_0x00cc:
                b.p.b.w r7 = r0.f6644k
                int r7 = r7.c
                b.p.b.t r8 = r0.f6641h
                java.lang.String r8 = r8.f6756b
                r9 = 307(0x133, float:4.3E-43)
                java.lang.String r10 = "GET"
                if (r7 == r9) goto L_0x0107
                r9 = 308(0x134, float:4.32E-43)
                if (r7 == r9) goto L_0x0107
                r9 = 401(0x191, float:5.62E-43)
                if (r7 == r9) goto L_0x00fb
                r9 = 407(0x197, float:5.7E-43)
                if (r7 == r9) goto L_0x00ea
                switch(r7) {
                    case 300: goto L_0x0116;
                    case 301: goto L_0x0116;
                    case 302: goto L_0x0116;
                    case 303: goto L_0x0116;
                    default: goto L_0x00e9;
                }
            L_0x00e9:
                goto L_0x014d
            L_0x00ea:
                java.net.Proxy$Type r5 = r6.type()
                java.net.Proxy$Type r7 = java.net.Proxy.Type.HTTP
                if (r5 != r7) goto L_0x00f3
                goto L_0x00fb
            L_0x00f3:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r2 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
                r0.<init>(r2)
                throw r0
            L_0x00fb:
                b.p.b.r r5 = r0.a
                b.p.b.b r5 = r5.v
                b.p.b.w r0 = r0.f6644k
                b.p.b.t r0 = b.p.b.a0.k.j.c(r5, r0, r6)
                goto L_0x018e
            L_0x0107:
                boolean r6 = r8.equals(r10)
                if (r6 != 0) goto L_0x0116
                java.lang.String r6 = "HEAD"
                boolean r6 = r8.equals(r6)
                if (r6 != 0) goto L_0x0116
                goto L_0x014d
            L_0x0116:
                b.p.b.r r6 = r0.a
                boolean r6 = r6.z
                if (r6 != 0) goto L_0x011d
                goto L_0x014d
            L_0x011d:
                b.p.b.w r6 = r0.f6644k
                b.p.b.n r6 = r6.f
                java.lang.String r7 = "Location"
                java.lang.String r6 = r6.a(r7)
                if (r6 == 0) goto L_0x012a
                goto L_0x012b
            L_0x012a:
                r6 = r4
            L_0x012b:
                if (r6 != 0) goto L_0x012e
                goto L_0x014d
            L_0x012e:
                b.p.b.t r7 = r0.f6641h
                b.p.b.o r7 = r7.a
                b.p.b.o r6 = r7.q(r6)
                if (r6 != 0) goto L_0x0139
                goto L_0x014d
            L_0x0139:
                java.lang.String r7 = r6.a
                b.p.b.t r9 = r0.f6641h
                b.p.b.o r9 = r9.a
                java.lang.String r9 = r9.a
                boolean r7 = r7.equals(r9)
                if (r7 != 0) goto L_0x014f
                b.p.b.r r7 = r0.a
                boolean r7 = r7.y
                if (r7 != 0) goto L_0x014f
            L_0x014d:
                r5 = r4
                goto L_0x018f
            L_0x014f:
                b.p.b.t r7 = r0.f6641h
                b.p.b.t$b r7 = r7.c()
                boolean r9 = b.l.f.x.a.g.Z(r8)
                if (r9 == 0) goto L_0x017a
                java.lang.String r9 = "PROPFIND"
                boolean r9 = r8.equals(r9)
                r5 = r5 ^ r9
                if (r5 == 0) goto L_0x0168
                r7.c(r10, r4)
                goto L_0x016b
            L_0x0168:
                r7.c(r8, r4)
            L_0x016b:
                b.p.b.n$b r5 = r7.c
                r5.e(r15)
                b.p.b.n$b r5 = r7.c
                r5.e(r14)
                b.p.b.n$b r5 = r7.c
                r5.e(r13)
            L_0x017a:
                boolean r0 = r0.i(r6)
                if (r0 != 0) goto L_0x0187
                b.p.b.n$b r0 = r7.c
                java.lang.String r5 = "Authorization"
                r0.e(r5)
            L_0x0187:
                r7.d(r6)
                b.p.b.t r0 = r7.a()
            L_0x018e:
                r5 = r0
            L_0x018f:
                if (r5 != 0) goto L_0x019b
                if (r12 != 0) goto L_0x019a
                b.p.b.a0.k.g r0 = r2.d
                b.p.b.a0.k.p r0 = r0.f6638b
                r0.g()
            L_0x019a:
                return r11
            L_0x019b:
                b.p.b.a0.k.g r0 = r2.d
                b.p.b.a0.k.p r0 = r0.a()
                int r10 = r3 + 1
                r3 = 20
                if (r10 > r3) goto L_0x01ce
                b.p.b.a0.k.g r3 = r2.d
                b.p.b.o r6 = r5.a
                boolean r3 = r3.i(r6)
                if (r3 != 0) goto L_0x01b6
                r0.g()
                r9 = r4
                goto L_0x01b7
            L_0x01b6:
                r9 = r0
            L_0x01b7:
                b.p.b.a0.k.g r0 = new b.p.b.a0.k.g
                b.p.b.r r4 = r2.a
                r6 = 0
                r7 = 0
                r17 = 0
                r3 = r0
                r8 = r12
                r18 = r10
                r10 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r2.d = r0
                r3 = r18
                goto L_0x00a5
            L_0x01ce:
                r18 = r10
                r0.g()
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r2 = "Too many follow-up requests: "
                r3 = r18
                java.lang.String r2 = b.e.a.a.a.g(r2, r3)
                r0.<init>(r2)
                throw r0
            L_0x01e1:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
            L_0x01e7:
                r0 = move-exception
                goto L_0x0206
            L_0x01e9:
                r0 = move-exception
                b.p.b.a0.k.g r6 = r2.d     // Catch:{ all -> 0x01e7 }
                b.p.b.a0.k.g r4 = r6.h(r0, r4)     // Catch:{ all -> 0x01e7 }
                if (r4 == 0) goto L_0x01f3
                goto L_0x01fd
            L_0x01f3:
                throw r0     // Catch:{ all -> 0x01e7 }
            L_0x01f4:
                r0 = move-exception
                b.p.b.a0.k.g r4 = r2.d     // Catch:{ all -> 0x01e7 }
                b.p.b.a0.k.g r4 = r4.g(r0)     // Catch:{ all -> 0x01e7 }
                if (r4 == 0) goto L_0x0203
            L_0x01fd:
                r2.d = r4     // Catch:{ all -> 0x0201 }
                goto L_0x00a5
            L_0x0201:
                r0 = move-exception
                goto L_0x0208
            L_0x0203:
                java.io.IOException r0 = r0.f6662h     // Catch:{ all -> 0x01e7 }
                throw r0     // Catch:{ all -> 0x01e7 }
            L_0x0206:
                r16 = r5
            L_0x0208:
                if (r16 == 0) goto L_0x0213
                b.p.b.a0.k.g r2 = r2.d
                b.p.b.a0.k.p r2 = r2.a()
                r2.g()
            L_0x0213:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.d.b.a(b.p.b.t):b.p.b.w");
        }
    }

    public final class c extends b.p.b.a0.d {

        /* renamed from: i  reason: collision with root package name */
        public final e f6697i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f6698j;

        public c(e eVar, boolean z, a aVar) {
            super("OkHttp %s", d.this.c.a.f6728i);
            this.f6697i = eVar;
            this.f6698j = z;
        }

        public void a() {
            boolean z = false;
            try {
                d dVar = d.this;
                boolean z2 = this.f6698j;
                t tVar = dVar.c;
                w a = new b(0, tVar, z2).a(tVar);
                Objects.requireNonNull(d.this);
                z = true;
                ((j) this.f6697i).d(a);
            } catch (IOException e2) {
                if (z) {
                    Logger logger = b.p.b.a0.b.a;
                    Level level = Level.INFO;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Callback failure for ");
                    o q2 = d.this.c.a.q("/...");
                    sb.append(NotificationCompat.CATEGORY_CALL + " to " + q2);
                    logger.log(level, sb.toString(), e2);
                } else {
                    g gVar = d.this.d;
                    b.g.a.i.b.c cVar = (b.g.a.i.b.c) this.f6697i;
                    b.g.a.i.b.a<U> aVar = cVar.f454e;
                    b.g.a.c cVar2 = new b.g.a.c(e2);
                    Objects.requireNonNull(aVar);
                    cVar.f456h.b(new b.g.a.e.c("Request failed", (b.g.a.b) cVar2));
                }
            } catch (Throwable th) {
                d.this.a.f6741i.a(this);
                throw th;
            }
            d.this.a.f6741i.a(this);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(b.p.b.r r4, b.p.b.t r5) {
        /*
            r3 = this;
            r3.<init>()
            java.util.Objects.requireNonNull(r4)
            b.p.b.r r0 = new b.p.b.r
            r0.<init>(r4)
            java.net.ProxySelector r1 = r0.f6747o
            if (r1 != 0) goto L_0x0015
            java.net.ProxySelector r1 = java.net.ProxySelector.getDefault()
            r0.f6747o = r1
        L_0x0015:
            java.net.CookieHandler r1 = r0.f6748p
            if (r1 != 0) goto L_0x001f
            java.net.CookieHandler r1 = java.net.CookieHandler.getDefault()
            r0.f6748p = r1
        L_0x001f:
            javax.net.SocketFactory r1 = r0.r
            if (r1 != 0) goto L_0x0029
            javax.net.SocketFactory r1 = javax.net.SocketFactory.getDefault()
            r0.r = r1
        L_0x0029:
            javax.net.ssl.SSLSocketFactory r1 = r0.s
            if (r1 != 0) goto L_0x0052
            monitor-enter(r4)
            javax.net.ssl.SSLSocketFactory r1 = b.p.b.r.G     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch:{ GeneralSecurityException -> 0x0043 }
            r2 = 0
            r1.init(r2, r2, r2)     // Catch:{ GeneralSecurityException -> 0x0043 }
            javax.net.ssl.SSLSocketFactory r1 = r1.getSocketFactory()     // Catch:{ GeneralSecurityException -> 0x0043 }
            b.p.b.r.G = r1     // Catch:{ GeneralSecurityException -> 0x0043 }
            goto L_0x0049
        L_0x0043:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch:{ all -> 0x004f }
            r5.<init>()     // Catch:{ all -> 0x004f }
            throw r5     // Catch:{ all -> 0x004f }
        L_0x0049:
            javax.net.ssl.SSLSocketFactory r1 = b.p.b.r.G     // Catch:{ all -> 0x004f }
            monitor-exit(r4)
            r0.s = r1
            goto L_0x0052
        L_0x004f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0052:
            javax.net.ssl.HostnameVerifier r4 = r0.t
            if (r4 != 0) goto L_0x005a
            b.p.b.a0.m.d r4 = b.p.b.a0.m.d.a
            r0.t = r4
        L_0x005a:
            b.p.b.f r4 = r0.u
            if (r4 != 0) goto L_0x0062
            b.p.b.f r4 = b.p.b.f.f6700b
            r0.u = r4
        L_0x0062:
            b.p.b.b r4 = r0.v
            if (r4 != 0) goto L_0x006a
            b.p.b.b r4 = b.p.b.a0.k.a.a
            r0.v = r4
        L_0x006a:
            b.p.b.i r4 = r0.w
            if (r4 != 0) goto L_0x0072
            b.p.b.i r4 = b.p.b.i.f6712g
            r0.w = r4
        L_0x0072:
            java.util.List<b.p.b.s> r4 = r0.f6743k
            if (r4 != 0) goto L_0x007a
            java.util.List<b.p.b.s> r4 = b.p.b.r.E
            r0.f6743k = r4
        L_0x007a:
            java.util.List<b.p.b.j> r4 = r0.f6744l
            if (r4 != 0) goto L_0x0082
            java.util.List<b.p.b.j> r4 = b.p.b.r.F
            r0.f6744l = r4
        L_0x0082:
            b.p.b.l r4 = r0.x
            if (r4 != 0) goto L_0x008a
            b.p.b.l r4 = b.p.b.l.a
            r0.x = r4
        L_0x008a:
            r3.a = r0
            r3.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.d.<init>(b.p.b.r, b.p.b.t):void");
    }

    public void a(e eVar) {
        synchronized (this) {
            if (!this.f6695b) {
                this.f6695b = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        k kVar = this.a.f6741i;
        c cVar = new c(eVar, false, (a) null);
        synchronized (kVar) {
            if (kVar.c.size() >= 64 || kVar.d(cVar) >= 5) {
                kVar.f6721b.add(cVar);
            } else {
                kVar.c.add(cVar);
                kVar.b().execute(cVar);
            }
        }
    }
}
