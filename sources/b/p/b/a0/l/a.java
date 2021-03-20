package b.p.b.a0.l;

import androidx.recyclerview.widget.RecyclerView;
import b.p.b.a0.j.d;
import b.p.b.a0.k.p;
import b.p.b.a0.m.f;
import b.p.b.m;
import b.p.b.s;
import b.p.b.y;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import o.g;

public final class a {

    /* renamed from: m  reason: collision with root package name */
    public static SSLSocketFactory f6671m;

    /* renamed from: n  reason: collision with root package name */
    public static f f6672n;
    public final y a;

    /* renamed from: b  reason: collision with root package name */
    public Socket f6673b;
    public Socket c;
    public m d;

    /* renamed from: e  reason: collision with root package name */
    public s f6674e;
    public volatile d f;

    /* renamed from: g  reason: collision with root package name */
    public int f6675g;

    /* renamed from: h  reason: collision with root package name */
    public g f6676h;

    /* renamed from: i  reason: collision with root package name */
    public o.f f6677i;

    /* renamed from: j  reason: collision with root package name */
    public final List<Reference<p>> f6678j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public boolean f6679k;

    /* renamed from: l  reason: collision with root package name */
    public long f6680l = RecyclerView.FOREVER_NS;

    public a(y yVar) {
        this.a = yVar;
    }

    public static synchronized f b(SSLSocketFactory sSLSocketFactory) {
        f fVar;
        synchronized (a.class) {
            if (sSLSocketFactory != f6671m) {
                b.p.b.a0.f fVar2 = b.p.b.a0.f.a;
                f6672n = fVar2.g(fVar2.f(sSLSocketFactory));
                f6671m = sSLSocketFactory;
            }
            fVar = f6672n;
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0233 A[Catch:{ all -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0239 A[Catch:{ all -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x023d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r18, int r19, int r20, b.p.b.a0.a r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            b.p.b.s r2 = b.p.b.s.HTTP_1_1
            java.net.Socket r3 = r1.f6673b
            r3.setSoTimeout(r0)
            b.p.b.a0.f r3 = b.p.b.a0.f.a     // Catch:{ ConnectException -> 0x029f }
            java.net.Socket r4 = r1.f6673b     // Catch:{ ConnectException -> 0x029f }
            b.p.b.y r5 = r1.a     // Catch:{ ConnectException -> 0x029f }
            java.net.InetSocketAddress r5 = r5.c     // Catch:{ ConnectException -> 0x029f }
            r6 = r18
            r3.c(r4, r5, r6)     // Catch:{ ConnectException -> 0x029f }
            java.net.Socket r3 = r1.f6673b
            o.z r3 = e.a.a.a.y0.m.o1.c.g0(r3)
            o.g r3 = e.a.a.a.y0.m.o1.c.m(r3)
            r1.f6676h = r3
            java.net.Socket r3 = r1.f6673b
            o.x r3 = e.a.a.a.y0.m.o1.c.e0(r3)
            o.f r3 = e.a.a.a.y0.m.o1.c.l(r3)
            r1.f6677i = r3
            b.p.b.y r3 = r1.a
            b.p.b.a r4 = r3.a
            javax.net.ssl.SSLSocketFactory r4 = r4.f6467i
            r5 = 0
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0246
            java.net.Proxy r3 = r3.f6776b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP
            if (r3 != r4) goto L_0x0047
            r3 = r6
            goto L_0x0048
        L_0x0047:
            r3 = r7
        L_0x0048:
            if (r3 == 0) goto L_0x013c
            b.p.b.t$b r3 = new b.p.b.t$b
            r3.<init>()
            b.p.b.y r4 = r1.a
            b.p.b.a r4 = r4.a
            b.p.b.o r4 = r4.a
            r3.d(r4)
            b.p.b.y r4 = r1.a
            b.p.b.a r4 = r4.a
            b.p.b.o r4 = r4.a
            java.lang.String r4 = b.p.b.a0.i.g(r4)
            java.lang.String r8 = "Host"
            r3.b(r8, r4)
            java.lang.String r4 = "Proxy-Connection"
            java.lang.String r8 = "Keep-Alive"
            r3.b(r4, r8)
            java.lang.String r4 = "User-Agent"
            java.lang.String r8 = "okhttp/2.7.5"
            r3.b(r4, r8)
            b.p.b.t r3 = r3.a()
            b.p.b.o r4 = r3.a
            java.lang.String r8 = "CONNECT "
            java.lang.StringBuilder r8 = b.e.a.a.a.y(r8)
            java.lang.String r9 = r4.d
            r8.append(r9)
            java.lang.String r9 = ":"
            r8.append(r9)
            int r4 = r4.f6725e
            java.lang.String r9 = " HTTP/1.1"
            java.lang.String r4 = b.e.a.a.a.o(r8, r4, r9)
        L_0x0093:
            b.p.b.a0.k.d r8 = new b.p.b.a0.k.d
            o.g r9 = r1.f6676h
            o.f r10 = r1.f6677i
            r8.<init>(r5, r9, r10)
            o.a0 r9 = r9.f()
            long r10 = (long) r0
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.g(r10, r12)
            o.f r9 = r1.f6677i
            o.a0 r9 = r9.f()
            r10 = r20
            long r13 = (long) r10
            r9.g(r13, r12)
            b.p.b.n r9 = r3.c
            r8.l(r9, r4)
            o.f r9 = r8.c
            r9.flush()
            b.p.b.w$b r9 = r8.k()
            r9.a = r3
            b.p.b.w r3 = r9.a()
            java.util.Comparator<java.lang.String> r9 = b.p.b.a0.k.j.a
            b.p.b.n r9 = r3.f
            long r13 = b.p.b.a0.k.j.a(r9)
            r15 = -1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x00d6
            r13 = 0
        L_0x00d6:
            o.z r8 = r8.i(r13)
            r9 = 2147483647(0x7fffffff, float:NaN)
            b.p.b.a0.i.l(r8, r9, r12)
            b.p.b.a0.k.d$f r8 = (b.p.b.a0.k.d.f) r8
            r8.close()
            int r8 = r3.c
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 == r9) goto L_0x011b
            r9 = 407(0x197, float:5.7E-43)
            if (r8 != r9) goto L_0x0106
            b.p.b.y r8 = r1.a
            b.p.b.a r9 = r8.a
            b.p.b.b r9 = r9.d
            java.net.Proxy r8 = r8.f6776b
            b.p.b.t r3 = b.p.b.a0.k.j.c(r9, r3, r8)
            if (r3 == 0) goto L_0x00fe
            goto L_0x0093
        L_0x00fe:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Failed to authenticate with proxy"
            r0.<init>(r2)
            throw r0
        L_0x0106:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Unexpected response code for CONNECT: "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            int r3 = r3.c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x011b:
            o.g r0 = r1.f6676h
            o.e r0 = r0.a()
            boolean r0 = r0.D()
            if (r0 == 0) goto L_0x0134
            o.f r0 = r1.f6677i
            o.e r0 = r0.a()
            boolean r0 = r0.D()
            if (r0 == 0) goto L_0x0134
            goto L_0x013c
        L_0x0134:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TLS tunnel buffered too many bytes!"
            r0.<init>(r2)
            throw r0
        L_0x013c:
            b.p.b.y r0 = r1.a
            b.p.b.a r0 = r0.a
            javax.net.ssl.SSLSocketFactory r3 = r0.f6467i
            java.net.Socket r4 = r1.f6673b     // Catch:{ AssertionError -> 0x022c }
            b.p.b.o r8 = r0.a     // Catch:{ AssertionError -> 0x022c }
            java.lang.String r9 = r8.d     // Catch:{ AssertionError -> 0x022c }
            int r8 = r8.f6725e     // Catch:{ AssertionError -> 0x022c }
            java.net.Socket r3 = r3.createSocket(r4, r9, r8, r6)     // Catch:{ AssertionError -> 0x022c }
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3     // Catch:{ AssertionError -> 0x022c }
            r4 = r21
            b.p.b.j r4 = r4.a(r3)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            boolean r8 = r4.f6719b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r8 == 0) goto L_0x0165
            b.p.b.a0.f r8 = b.p.b.a0.f.a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.o r9 = r0.a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r9 = r9.d     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.util.List<b.p.b.s> r10 = r0.f6464e     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r8.b(r3, r9, r10)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
        L_0x0165:
            r3.startHandshake()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            javax.net.ssl.SSLSession r8 = r3.getSession()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.m r8 = b.p.b.m.a(r8)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            javax.net.ssl.HostnameVerifier r9 = r0.f6468j     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.o r10 = r0.a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r10 = r10.d     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            javax.net.ssl.SSLSession r11 = r3.getSession()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            boolean r9 = r9.verify(r10, r11)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r9 == 0) goto L_0x01d5
            b.p.b.f r9 = r0.f6469k     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.f r10 = b.p.b.f.f6700b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r9 == r10) goto L_0x01a0
            javax.net.ssl.SSLSocketFactory r9 = r0.f6467i     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.a0.m.f r9 = b(r9)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.a0.m.b r10 = new b.p.b.a0.m.b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r10.<init>(r9)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.util.List<java.security.cert.Certificate> r9 = r8.f6722b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.util.List r9 = r10.a(r9)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.f r10 = r0.f6469k     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.o r0 = r0.a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r0.d     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r10.a(r0, r9)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
        L_0x01a0:
            boolean r0 = r4.f6719b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r0 == 0) goto L_0x01ab
            b.p.b.a0.f r0 = b.p.b.a0.f.a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r0.d(r3)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            goto L_0x01ac
        L_0x01ab:
            r0 = r5
        L_0x01ac:
            r1.c = r3     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            o.z r4 = e.a.a.a.y0.m.o1.c.g0(r3)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            o.g r4 = e.a.a.a.y0.m.o1.c.m(r4)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r1.f6676h = r4     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.net.Socket r4 = r1.c     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            o.x r4 = e.a.a.a.y0.m.o1.c.e0(r4)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            o.f r4 = e.a.a.a.y0.m.o1.c.l(r4)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r1.f6677i = r4     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r1.d = r8     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r0 == 0) goto L_0x01cc
            b.p.b.s r2 = b.p.b.s.d(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
        L_0x01cc:
            r1.f6674e = r2     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.a0.f r0 = b.p.b.a0.f.a
            r0.a(r3)
            goto L_0x024c
        L_0x01d5:
            java.util.List<java.security.cert.Certificate> r2 = r8.f6722b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            javax.net.ssl.SSLPeerUnverifiedException r4 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.<init>()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r6 = "Hostname "
            r5.append(r6)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.o r0 = r0.a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r0.d     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = " not verified:"
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = "\n    certificate: "
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = b.p.b.f.b(r2)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = "\n    DN: "
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.security.Principal r0 = r2.getSubjectDN()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.util.List r0 = b.p.b.a0.m.d.a(r2)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r5.toString()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r4.<init>(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            throw r4     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
        L_0x0225:
            r0 = move-exception
            goto L_0x023b
        L_0x0227:
            r0 = move-exception
            r5 = r3
            goto L_0x022d
        L_0x022a:
            r0 = move-exception
            goto L_0x023a
        L_0x022c:
            r0 = move-exception
        L_0x022d:
            boolean r2 = b.p.b.a0.i.k(r0)     // Catch:{ all -> 0x022a }
            if (r2 == 0) goto L_0x0239
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x022a }
            r2.<init>(r0)     // Catch:{ all -> 0x022a }
            throw r2     // Catch:{ all -> 0x022a }
        L_0x0239:
            throw r0     // Catch:{ all -> 0x022a }
        L_0x023a:
            r3 = r5
        L_0x023b:
            if (r3 == 0) goto L_0x0242
            b.p.b.a0.f r2 = b.p.b.a0.f.a
            r2.a(r3)
        L_0x0242:
            b.p.b.a0.i.d(r3)
            throw r0
        L_0x0246:
            r1.f6674e = r2
            java.net.Socket r0 = r1.f6673b
            r1.c = r0
        L_0x024c:
            b.p.b.s r0 = r1.f6674e
            b.p.b.s r2 = b.p.b.s.SPDY_3
            if (r0 == r2) goto L_0x0256
            b.p.b.s r2 = b.p.b.s.HTTP_2
            if (r0 != r2) goto L_0x029e
        L_0x0256:
            java.net.Socket r0 = r1.c
            r0.setSoTimeout(r7)
            b.p.b.a0.j.d$c r0 = new b.p.b.a0.j.d$c
            r0.<init>(r6)
            java.net.Socket r2 = r1.c
            b.p.b.y r3 = r1.a
            b.p.b.a r3 = r3.a
            b.p.b.o r3 = r3.a
            java.lang.String r3 = r3.d
            o.g r4 = r1.f6676h
            o.f r6 = r1.f6677i
            r0.a = r2
            r0.f6508b = r3
            r0.c = r4
            r0.d = r6
            b.p.b.s r2 = r1.f6674e
            r0.f6509e = r2
            b.p.b.a0.j.d r2 = new b.p.b.a0.j.d
            r2.<init>(r0, r5)
            b.p.b.a0.j.c r0 = r2.y
            r0.F()
            b.p.b.a0.j.c r0 = r2.y
            b.p.b.a0.j.t r3 = r2.t
            r0.f0(r3)
            b.p.b.a0.j.t r0 = r2.t
            r3 = 65536(0x10000, float:9.18355E-41)
            int r0 = r0.b(r3)
            if (r0 == r3) goto L_0x029c
            b.p.b.a0.j.c r4 = r2.y
            int r0 = r0 - r3
            long r5 = (long) r0
            r4.g(r7, r5)
        L_0x029c:
            r1.f = r2
        L_0x029e:
            return
        L_0x029f:
            java.net.ConnectException r0 = new java.net.ConnectException
            java.lang.String r2 = "Failed to connect to "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            b.p.b.y r3 = r1.a
            java.net.InetSocketAddress r3 = r3.c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.l.a.a(int, int, int, b.p.b.a0.a):void");
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Connection{");
        y.append(this.a.a.a.d);
        y.append(":");
        y.append(this.a.a.a.f6725e);
        y.append(", proxy=");
        y.append(this.a.f6776b);
        y.append(" hostAddress=");
        y.append(this.a.c);
        y.append(" cipherSuite=");
        m mVar = this.d;
        y.append(mVar != null ? mVar.a : "none");
        y.append(" protocol=");
        y.append(this.f6674e);
        y.append('}');
        return y.toString();
    }
}
