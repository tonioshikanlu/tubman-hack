package n.m0.g;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import e.a.a.a.y0.m.o1.c;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.a;
import n.c0;
import n.d0;
import n.e0;
import n.g0;
import n.h0;
import n.k0;
import n.l;
import n.m0.h.d;
import n.m0.i.b;
import n.m0.j.b;
import n.m0.j.e;
import n.m0.j.f;
import n.m0.j.m;
import n.m0.j.o;
import n.m0.j.p;
import n.m0.j.t;
import n.m0.k.h;
import n.u;
import n.x;
import n.y;
import n.z;
import o.g;

public final class i extends f.c implements l {

    /* renamed from: b  reason: collision with root package name */
    public Socket f10204b;
    public Socket c;
    public x d;

    /* renamed from: e  reason: collision with root package name */
    public d0 f10205e;
    public f f;

    /* renamed from: g  reason: collision with root package name */
    public g f10206g;

    /* renamed from: h  reason: collision with root package name */
    public o.f f10207h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10208i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10209j;

    /* renamed from: k  reason: collision with root package name */
    public int f10210k;

    /* renamed from: l  reason: collision with root package name */
    public int f10211l;

    /* renamed from: m  reason: collision with root package name */
    public int f10212m;

    /* renamed from: n  reason: collision with root package name */
    public int f10213n = 1;

    /* renamed from: o  reason: collision with root package name */
    public final List<Reference<e>> f10214o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public long f10215p = RecyclerView.FOREVER_NS;

    /* renamed from: q  reason: collision with root package name */
    public final k0 f10216q;

    public i(j jVar, k0 k0Var) {
        e.x.c.i.e(jVar, "connectionPool");
        e.x.c.i.e(k0Var, "route");
        this.f10216q = k0Var;
    }

    public synchronized void a(f fVar, t tVar) {
        e.x.c.i.e(fVar, "connection");
        e.x.c.i.e(tVar, "settings");
        this.f10213n = (tVar.a & 16) != 0 ? tVar.f10375b[4] : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public void b(o oVar) {
        e.x.c.i.e(oVar, "stream");
        oVar.c(b.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015b A[EDGE_INSN: B:78:0x015b->B:70:0x015b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r17, int r18, int r19, int r20, boolean r21, n.f r22, n.u r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r12 = "call"
            e.x.c.i.e(r8, r12)
            java.lang.String r0 = "eventListener"
            e.x.c.i.e(r9, r0)
            n.d0 r0 = r7.f10205e
            if (r0 != 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0169
            n.k0 r0 = r7.f10216q
            n.a r0 = r0.a
            java.util.List<n.n> r0 = r0.c
            n.m0.g.b r13 = new n.m0.g.b
            r13.<init>(r0)
            n.k0 r1 = r7.f10216q
            n.a r1 = r1.a
            javax.net.ssl.SSLSocketFactory r2 = r1.f
            if (r2 != 0) goto L_0x006b
            n.n r1 = n.n.f10402h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005e
            n.k0 r0 = r7.f10216q
            n.a r0 = r0.a
            n.z r0 = r0.a
            java.lang.String r0 = r0.f10431e
            n.m0.k.h$a r1 = n.m0.k.h.c
            n.m0.k.h r1 = n.m0.k.h.a
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L_0x004b
            goto L_0x0075
        L_0x004b:
            n.m0.g.l r1 = new n.m0.g.l
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = b.e.a.a.a.n(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x005e:
            n.m0.g.l r0 = new n.m0.g.l
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006b:
            java.util.List<n.d0> r0 = r1.f10041b
            n.d0 r1 = n.d0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x015c
        L_0x0075:
            r14 = 0
            r15 = r14
        L_0x0077:
            n.k0 r0 = r7.f10216q     // Catch:{ IOException -> 0x00df }
            boolean r0 = r0.a()     // Catch:{ IOException -> 0x00df }
            if (r0 == 0) goto L_0x009d
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00df }
            java.net.Socket r0 = r7.f10204b     // Catch:{ IOException -> 0x00df }
            if (r0 != 0) goto L_0x0093
            goto L_0x00b8
        L_0x0093:
            r1 = r17
            r2 = r18
            goto L_0x00a4
        L_0x0098:
            r1 = r17
            r2 = r18
            goto L_0x00dc
        L_0x009d:
            r1 = r17
            r2 = r18
            r7.e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00db }
        L_0x00a4:
            r3 = r20
            r7.g(r13, r3, r8, r9)     // Catch:{ IOException -> 0x00d9 }
            n.k0 r0 = r7.f10216q     // Catch:{ IOException -> 0x00d9 }
            java.net.InetSocketAddress r4 = r0.c     // Catch:{ IOException -> 0x00d9 }
            java.net.Proxy r0 = r0.f10140b     // Catch:{ IOException -> 0x00d9 }
            e.x.c.i.e(r8, r12)     // Catch:{ IOException -> 0x00d9 }
            e.x.c.i.e(r4, r11)     // Catch:{ IOException -> 0x00d9 }
            e.x.c.i.e(r0, r10)     // Catch:{ IOException -> 0x00d9 }
        L_0x00b8:
            n.k0 r0 = r7.f10216q
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00d2
            java.net.Socket r0 = r7.f10204b
            if (r0 == 0) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            n.m0.g.l r0 = new n.m0.g.l
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            long r0 = java.lang.System.nanoTime()
            r7.f10215p = r0
            return
        L_0x00d9:
            r0 = move-exception
            goto L_0x00e1
        L_0x00db:
            r0 = move-exception
        L_0x00dc:
            r3 = r20
            goto L_0x00e1
        L_0x00df:
            r0 = move-exception
            goto L_0x0098
        L_0x00e1:
            java.net.Socket r4 = r7.c
            if (r4 == 0) goto L_0x00e8
            n.m0.c.e(r4)
        L_0x00e8:
            java.net.Socket r4 = r7.f10204b
            if (r4 == 0) goto L_0x00ef
            n.m0.c.e(r4)
        L_0x00ef:
            r7.c = r14
            r7.f10204b = r14
            r7.f10206g = r14
            r7.f10207h = r14
            r7.d = r14
            r7.f10205e = r14
            r7.f = r14
            r4 = 1
            r7.f10213n = r4
            n.k0 r4 = r7.f10216q
            java.net.InetSocketAddress r5 = r4.c
            java.net.Proxy r4 = r4.f10140b
            e.x.c.i.e(r8, r12)
            e.x.c.i.e(r5, r11)
            e.x.c.i.e(r4, r10)
            java.lang.String r4 = "ioe"
            e.x.c.i.e(r0, r4)
            java.lang.String r4 = "e"
            if (r15 != 0) goto L_0x011e
            n.m0.g.l r15 = new n.m0.g.l
            r15.<init>(r0)
            goto L_0x0128
        L_0x011e:
            e.x.c.i.e(r0, r4)
            java.io.IOException r5 = r15.f10221i
            b.q.a.a.k(r5, r0)
            r15.f10220h = r0
        L_0x0128:
            if (r21 == 0) goto L_0x015b
            e.x.c.i.e(r0, r4)
            r4 = 1
            r13.c = r4
            boolean r5 = r13.f10166b
            if (r5 != 0) goto L_0x0135
            goto L_0x0156
        L_0x0135:
            boolean r5 = r0 instanceof java.net.ProtocolException
            if (r5 == 0) goto L_0x013a
            goto L_0x0156
        L_0x013a:
            boolean r5 = r0 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L_0x013f
            goto L_0x0156
        L_0x013f:
            boolean r5 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x014c
            java.lang.Throwable r5 = r0.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L_0x014c
            goto L_0x0156
        L_0x014c:
            boolean r5 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r5 == 0) goto L_0x0151
            goto L_0x0156
        L_0x0151:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r4 = 0
        L_0x0157:
            if (r4 == 0) goto L_0x015b
            goto L_0x0077
        L_0x015b:
            throw r15
        L_0x015c:
            n.m0.g.l r0 = new n.m0.g.l
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0169:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.g.i.c(int, int, int, int, boolean, n.f, n.u):void");
    }

    public final void d(c0 c0Var, k0 k0Var, IOException iOException) {
        e.x.c.i.e(c0Var, "client");
        e.x.c.i.e(k0Var, "failedRoute");
        e.x.c.i.e(iOException, "failure");
        if (k0Var.f10140b.type() != Proxy.Type.DIRECT) {
            a aVar = k0Var.a;
            aVar.f10047k.connectFailed(aVar.a.j(), k0Var.f10140b.address(), iOException);
        }
        k kVar = c0Var.F;
        synchronized (kVar) {
            e.x.c.i.e(k0Var, "failedRoute");
            kVar.a.add(k0Var);
        }
    }

    public final void e(int i2, int i3, n.f fVar, u uVar) {
        Socket socket;
        int i4;
        k0 k0Var = this.f10216q;
        Proxy proxy = k0Var.f10140b;
        a aVar = k0Var.a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i4 = f.a[type.ordinal()]) == 1 || i4 == 2)) {
            socket = aVar.f10042e.createSocket();
            e.x.c.i.c(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f10204b = socket;
        InetSocketAddress inetSocketAddress = this.f10216q.c;
        Objects.requireNonNull(uVar);
        e.x.c.i.e(fVar, NotificationCompat.CATEGORY_CALL);
        e.x.c.i.e(inetSocketAddress, "inetSocketAddress");
        e.x.c.i.e(proxy, "proxy");
        socket.setSoTimeout(i3);
        try {
            h.a aVar2 = h.c;
            h.a.e(socket, this.f10216q.c, i2);
            try {
                this.f10206g = c.m(c.g0(socket));
                this.f10207h = c.l(c.e0(socket));
            } catch (NullPointerException e2) {
                if (e.x.c.i.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder y = b.e.a.a.a.y("Failed to connect to ");
            y.append(this.f10216q.c);
            ConnectException connectException = new ConnectException(y.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i2, int i3, int i4, n.f fVar, u uVar) {
        e0 e0Var;
        int i5 = i3;
        n.f fVar2 = fVar;
        e0.a aVar = new e0.a();
        aVar.h(this.f10216q.a.a);
        c0 c0Var = null;
        aVar.d("CONNECT", (g0) null);
        boolean z = true;
        aVar.c("Host", n.m0.c.x(this.f10216q.a.a, true));
        aVar.c("Proxy-Connection", "Keep-Alive");
        aVar.c("User-Agent", "okhttp/4.9.0");
        e0 b2 = aVar.b();
        h0.a aVar2 = new h0.a();
        aVar2.g(b2);
        aVar2.f(d0.HTTP_1_1);
        aVar2.c = 407;
        aVar2.e("Preemptive Authenticate");
        aVar2.f10112g = n.m0.c.c;
        aVar2.f10116k = -1;
        aVar2.f10117l = -1;
        e.x.c.i.e("Proxy-Authenticate", "name");
        e.x.c.i.e("OkHttp-Preemptive", "value");
        y.a aVar3 = aVar2.f;
        Objects.requireNonNull(aVar3);
        e.x.c.i.e("Proxy-Authenticate", "name");
        e.x.c.i.e("OkHttp-Preemptive", "value");
        y.b bVar = y.f10426i;
        bVar.a("Proxy-Authenticate");
        bVar.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.c("Proxy-Authenticate");
        aVar3.a("Proxy-Authenticate", "OkHttp-Preemptive");
        h0 a = aVar2.a();
        k0 k0Var = this.f10216q;
        e0 a2 = k0Var.a.f10045i.a(k0Var, a);
        if (a2 != null) {
            b2 = a2;
        }
        z zVar = e0Var.f10092b;
        int i6 = 0;
        while (i6 < 21) {
            e(i2, i5, fVar2, uVar);
            String str = "CONNECT " + n.m0.c.x(zVar, z) + " HTTP/1.1";
            while (true) {
                g gVar = this.f10206g;
                e.x.c.i.c(gVar);
                o.f fVar3 = this.f10207h;
                e.x.c.i.c(fVar3);
                n.m0.i.b bVar2 = new n.m0.i.b(c0Var, this, gVar, fVar3);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                gVar.f().g((long) i5, timeUnit);
                fVar3.f().g((long) i4, timeUnit);
                bVar2.k(e0Var.d, str);
                bVar2.f10244g.flush();
                h0.a g2 = bVar2.g(false);
                e.x.c.i.c(g2);
                g2.g(e0Var);
                h0 a3 = g2.a();
                e.x.c.i.e(a3, "response");
                long k2 = n.m0.c.k(a3);
                if (k2 != -1) {
                    o.z j2 = bVar2.j(k2);
                    n.m0.c.v(j2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, timeUnit);
                    ((b.d) j2).close();
                }
                int i7 = a3.f10103k;
                if (i7 != 200) {
                    if (i7 == 407) {
                        k0 k0Var2 = this.f10216q;
                        e0 a4 = k0Var2.a.f10045i.a(k0Var2, a3);
                        if (a4 == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        } else if (e.c0.h.f("close", h0.b(a3, "Connection", (String) null, 2), true)) {
                            e0Var = a4;
                            z = true;
                            break;
                        } else {
                            int i8 = i2;
                            u uVar2 = uVar;
                            e0 e0Var2 = a4;
                            c0Var = null;
                            e0Var = e0Var2;
                        }
                    } else {
                        StringBuilder y = b.e.a.a.a.y("Unexpected response code for CONNECT: ");
                        y.append(a3.f10103k);
                        throw new IOException(y.toString());
                    }
                } else if (!gVar.d().D() || !fVar3.d().D()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else {
                    z = true;
                    e0Var = null;
                }
            }
            if (e0Var != null) {
                Socket socket = this.f10204b;
                if (socket != null) {
                    n.m0.c.e(socket);
                }
                c0Var = null;
                this.f10204b = null;
                this.f10207h = null;
                this.f10206g = null;
                k0 k0Var3 = this.f10216q;
                InetSocketAddress inetSocketAddress = k0Var3.c;
                Proxy proxy = k0Var3.f10140b;
                e.x.c.i.e(fVar2, NotificationCompat.CATEGORY_CALL);
                e.x.c.i.e(inetSocketAddress, "inetSocketAddress");
                e.x.c.i.e(proxy, "proxy");
                i6++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(n.m0.g.b r17, int r18, n.f r19, n.u r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            n.d0 r3 = n.d0.HTTP_2
            n.d0 r4 = n.d0.H2_PRIOR_KNOWLEDGE
            n.d0 r5 = n.d0.HTTP_1_1
            n.k0 r6 = r1.f10216q
            n.a r6 = r6.a
            javax.net.ssl.SSLSocketFactory r7 = r6.f
            if (r7 != 0) goto L_0x002d
            java.util.List<n.d0> r2 = r6.f10041b
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0026
            java.net.Socket r2 = r1.f10204b
            r1.c = r2
            r1.f10205e = r4
            r1.m(r0)
            return
        L_0x0026:
            java.net.Socket r0 = r1.f10204b
            r1.c = r0
            r1.f10205e = r5
            return
        L_0x002d:
            java.lang.String r6 = "call"
            e.x.c.i.e(r2, r6)
            n.k0 r7 = r1.f10216q
            n.a r7 = r7.a
            javax.net.ssl.SSLSocketFactory r8 = r7.f
            r9 = 0
            e.x.c.i.c(r8)     // Catch:{ all -> 0x01eb }
            java.net.Socket r10 = r1.f10204b     // Catch:{ all -> 0x01eb }
            n.z r11 = r7.a     // Catch:{ all -> 0x01eb }
            java.lang.String r12 = r11.f10431e     // Catch:{ all -> 0x01eb }
            int r11 = r11.f     // Catch:{ all -> 0x01eb }
            r13 = 1
            java.net.Socket r8 = r8.createSocket(r10, r12, r11, r13)     // Catch:{ all -> 0x01eb }
            if (r8 == 0) goto L_0x01e3
            javax.net.ssl.SSLSocket r8 = (javax.net.ssl.SSLSocket) r8     // Catch:{ all -> 0x01eb }
            r10 = r17
            n.n r10 = r10.a(r8)     // Catch:{ all -> 0x01e1 }
            boolean r11 = r10.f10403b     // Catch:{ all -> 0x01e1 }
            if (r11 == 0) goto L_0x0064
            n.m0.k.h$a r11 = n.m0.k.h.c     // Catch:{ all -> 0x01e1 }
            n.m0.k.h r11 = n.m0.k.h.a     // Catch:{ all -> 0x01e1 }
            n.z r12 = r7.a     // Catch:{ all -> 0x01e1 }
            java.lang.String r12 = r12.f10431e     // Catch:{ all -> 0x01e1 }
            java.util.List<n.d0> r14 = r7.f10041b     // Catch:{ all -> 0x01e1 }
            r11.d(r8, r12, r14)     // Catch:{ all -> 0x01e1 }
        L_0x0064:
            r8.startHandshake()     // Catch:{ all -> 0x01e1 }
            javax.net.ssl.SSLSession r11 = r8.getSession()     // Catch:{ all -> 0x01e1 }
            java.lang.String r12 = "sslSocketSession"
            e.x.c.i.d(r11, r12)     // Catch:{ all -> 0x01e1 }
            n.x r12 = n.x.a(r11)     // Catch:{ all -> 0x01e1 }
            javax.net.ssl.HostnameVerifier r14 = r7.f10043g     // Catch:{ all -> 0x01e1 }
            e.x.c.i.c(r14)     // Catch:{ all -> 0x01e1 }
            n.z r15 = r7.a     // Catch:{ all -> 0x01e1 }
            java.lang.String r15 = r15.f10431e     // Catch:{ all -> 0x01e1 }
            boolean r11 = r14.verify(r15, r11)     // Catch:{ all -> 0x01e1 }
            if (r11 != 0) goto L_0x0123
            java.util.List r0 = r12.c()     // Catch:{ all -> 0x01e1 }
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x01e1 }
            r2 = r2 ^ r13
            if (r2 == 0) goto L_0x0103
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x009d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r0.<init>(r2)     // Catch:{ all -> 0x01e1 }
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x009d:
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ all -> 0x01e1 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r3.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "\n              |Hostname "
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            n.z r4 = r7.a     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.f10431e     // Catch:{ all -> 0x01e1 }
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = " not verified:\n              |    certificate: "
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            n.h$a r4 = n.h.d     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.a(r0)     // Catch:{ all -> 0x01e1 }
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "\n              |    DN: "
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            java.security.Principal r4 = r0.getSubjectDN()     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "cert.subjectDN"
            e.x.c.i.d(r4, r5)     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x01e1 }
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "\n              |    subjectAltNames: "
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            n.m0.m.d r4 = n.m0.m.d.a     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "certificate"
            e.x.c.i.e(r0, r5)     // Catch:{ all -> 0x01e1 }
            r5 = 7
            java.util.List r5 = r4.a(r0, r5)     // Catch:{ all -> 0x01e1 }
            r6 = 2
            java.util.List r0 = r4.a(r0, r6)     // Catch:{ all -> 0x01e1 }
            java.util.List r0 = e.t.g.I(r5, r0)     // Catch:{ all -> 0x01e1 }
            r3.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "\n              "
            r3.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = e.c0.h.O(r0, r9, r13)     // Catch:{ all -> 0x01e1 }
            r2.<init>(r0)     // Catch:{ all -> 0x01e1 }
            throw r2     // Catch:{ all -> 0x01e1 }
        L_0x0103:
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r2.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x01e1 }
            n.z r3 = r7.a     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = r3.f10431e     // Catch:{ all -> 0x01e1 }
            r2.append(r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = " not verified (no certificates)"
            r2.append(r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01e1 }
            r0.<init>(r2)     // Catch:{ all -> 0x01e1 }
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x0123:
            n.h r9 = r7.f10044h     // Catch:{ all -> 0x01e1 }
            e.x.c.i.c(r9)     // Catch:{ all -> 0x01e1 }
            n.x r11 = new n.x     // Catch:{ all -> 0x01e1 }
            n.l0 r13 = r12.f10424b     // Catch:{ all -> 0x01e1 }
            n.k r14 = r12.c     // Catch:{ all -> 0x01e1 }
            java.util.List<java.security.cert.Certificate> r15 = r12.d     // Catch:{ all -> 0x01e1 }
            r20 = r4
            n.m0.g.g r4 = new n.m0.g.g     // Catch:{ all -> 0x01e1 }
            r4.<init>(r9, r12, r7)     // Catch:{ all -> 0x01e1 }
            r11.<init>(r13, r14, r15, r4)     // Catch:{ all -> 0x01e1 }
            r1.d = r11     // Catch:{ all -> 0x01e1 }
            n.z r4 = r7.a     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.f10431e     // Catch:{ all -> 0x01e1 }
            n.m0.g.h r7 = new n.m0.g.h     // Catch:{ all -> 0x01e1 }
            r7.<init>(r1)     // Catch:{ all -> 0x01e1 }
            r9.a(r4, r7)     // Catch:{ all -> 0x01e1 }
            boolean r4 = r10.f10403b     // Catch:{ all -> 0x01e1 }
            if (r4 == 0) goto L_0x0155
            n.m0.k.h$a r4 = n.m0.k.h.c     // Catch:{ all -> 0x01e1 }
            n.m0.k.h r4 = n.m0.k.h.a     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.f(r8)     // Catch:{ all -> 0x01e1 }
            goto L_0x0156
        L_0x0155:
            r4 = 0
        L_0x0156:
            r1.c = r8     // Catch:{ all -> 0x01e1 }
            o.z r7 = e.a.a.a.y0.m.o1.c.g0(r8)     // Catch:{ all -> 0x01e1 }
            o.g r7 = e.a.a.a.y0.m.o1.c.m(r7)     // Catch:{ all -> 0x01e1 }
            r1.f10206g = r7     // Catch:{ all -> 0x01e1 }
            o.x r7 = e.a.a.a.y0.m.o1.c.e0(r8)     // Catch:{ all -> 0x01e1 }
            o.f r7 = e.a.a.a.y0.m.o1.c.l(r7)     // Catch:{ all -> 0x01e1 }
            r1.f10207h = r7     // Catch:{ all -> 0x01e1 }
            if (r4 == 0) goto L_0x01cd
            java.lang.String r7 = "protocol"
            e.x.c.i.e(r4, r7)     // Catch:{ all -> 0x01e1 }
            n.d0 r7 = n.d0.HTTP_1_0     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = "http/1.0"
            boolean r9 = e.x.c.i.a(r4, r9)     // Catch:{ all -> 0x01e1 }
            if (r9 == 0) goto L_0x017f
            r4 = r7
            goto L_0x01b4
        L_0x017f:
            java.lang.String r7 = "http/1.1"
            boolean r7 = e.x.c.i.a(r4, r7)     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x0188
            goto L_0x01cd
        L_0x0188:
            java.lang.String r5 = "h2_prior_knowledge"
            boolean r5 = e.x.c.i.a(r4, r5)     // Catch:{ all -> 0x01e1 }
            if (r5 == 0) goto L_0x0193
            r4 = r20
            goto L_0x01b4
        L_0x0193:
            java.lang.String r5 = "h2"
            boolean r5 = e.x.c.i.a(r4, r5)     // Catch:{ all -> 0x01e1 }
            if (r5 == 0) goto L_0x019d
            r4 = r3
            goto L_0x01b4
        L_0x019d:
            n.d0 r5 = n.d0.SPDY_3     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "spdy/3.1"
            boolean r7 = e.x.c.i.a(r4, r7)     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x01a9
        L_0x01a7:
            r4 = r5
            goto L_0x01b4
        L_0x01a9:
            n.d0 r5 = n.d0.QUIC     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "quic"
            boolean r7 = e.x.c.i.a(r4, r7)     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x01b6
            goto L_0x01a7
        L_0x01b4:
            r5 = r4
            goto L_0x01cd
        L_0x01b6:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r2.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "Unexpected protocol: "
            r2.append(r3)     // Catch:{ all -> 0x01e1 }
            r2.append(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01e1 }
            r0.<init>(r2)     // Catch:{ all -> 0x01e1 }
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x01cd:
            r1.f10205e = r5     // Catch:{ all -> 0x01e1 }
            n.m0.k.h$a r4 = n.m0.k.h.c
            n.m0.k.h r4 = n.m0.k.h.a
            r4.a(r8)
            e.x.c.i.e(r2, r6)
            n.d0 r2 = r1.f10205e
            if (r2 != r3) goto L_0x01e0
            r1.m(r0)
        L_0x01e0:
            return
        L_0x01e1:
            r0 = move-exception
            goto L_0x01ed
        L_0x01e3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r0.<init>(r2)     // Catch:{ all -> 0x01eb }
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x01eb:
            r0 = move-exception
            r8 = 0
        L_0x01ed:
            if (r8 == 0) goto L_0x01f6
            n.m0.k.h$a r2 = n.m0.k.h.c
            n.m0.k.h r2 = n.m0.k.h.a
            r2.a(r8)
        L_0x01f6:
            if (r8 == 0) goto L_0x01fb
            n.m0.c.e(r8)
        L_0x01fb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.g.i.g(n.m0.g.b, int, n.f, n.u):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r8 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da A[SYNTHETIC, Splitter:B:53:0x00da] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(n.a r7, java.util.List<n.k0> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "address"
            e.x.c.i.e(r7, r0)
            byte[] r0 = n.m0.c.a
            java.util.List<java.lang.ref.Reference<n.m0.g.e>> r0 = r6.f10214o
            int r0 = r0.size()
            int r1 = r6.f10213n
            r2 = 0
            if (r0 >= r1) goto L_0x00ff
            boolean r0 = r6.f10208i
            if (r0 == 0) goto L_0x0018
            goto L_0x00ff
        L_0x0018:
            n.k0 r0 = r6.f10216q
            n.a r0 = r0.a
            boolean r0 = r0.a(r7)
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            n.z r0 = r7.a
            java.lang.String r0 = r0.f10431e
            n.k0 r1 = r6.f10216q
            n.a r1 = r1.a
            n.z r1 = r1.a
            java.lang.String r1 = r1.f10431e
            boolean r0 = e.x.c.i.a(r0, r1)
            r1 = 1
            if (r0 == 0) goto L_0x0037
            return r1
        L_0x0037:
            n.m0.j.f r0 = r6.f
            if (r0 != 0) goto L_0x003c
            return r2
        L_0x003c:
            if (r8 == 0) goto L_0x00ff
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0045
            goto L_0x007e
        L_0x0045:
            java.util.Iterator r8 = r8.iterator()
        L_0x0049:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r8.next()
            n.k0 r0 = (n.k0) r0
            java.net.Proxy r3 = r0.f10140b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            n.k0 r3 = r6.f10216q
            java.net.Proxy r3 = r3.f10140b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            n.k0 r3 = r6.f10216q
            java.net.InetSocketAddress r3 = r3.c
            java.net.InetSocketAddress r0 = r0.c
            boolean r0 = e.x.c.i.a(r3, r0)
            if (r0 == 0) goto L_0x0079
            r0 = r1
            goto L_0x007a
        L_0x0079:
            r0 = r2
        L_0x007a:
            if (r0 == 0) goto L_0x0049
            r8 = r1
            goto L_0x007f
        L_0x007e:
            r8 = r2
        L_0x007f:
            if (r8 != 0) goto L_0x0083
            goto L_0x00ff
        L_0x0083:
            javax.net.ssl.HostnameVerifier r8 = r7.f10043g
            n.m0.m.d r0 = n.m0.m.d.a
            if (r8 == r0) goto L_0x008a
            return r2
        L_0x008a:
            n.z r8 = r7.a
            byte[] r3 = n.m0.c.a
            n.k0 r3 = r6.f10216q
            n.a r3 = r3.a
            n.z r3 = r3.a
            int r4 = r8.f
            int r5 = r3.f
            if (r4 == r5) goto L_0x009b
            goto L_0x00d6
        L_0x009b:
            java.lang.String r4 = r8.f10431e
            java.lang.String r3 = r3.f10431e
            boolean r3 = e.x.c.i.a(r4, r3)
            if (r3 == 0) goto L_0x00a6
            goto L_0x00d4
        L_0x00a6:
            boolean r3 = r6.f10209j
            if (r3 != 0) goto L_0x00d6
            n.x r3 = r6.d
            if (r3 == 0) goto L_0x00d6
            e.x.c.i.c(r3)
            java.util.List r3 = r3.c()
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x00d1
            java.lang.String r8 = r8.f10431e
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r3, r4)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            boolean r8 = r0.b(r8, r3)
            if (r8 == 0) goto L_0x00d1
            r8 = r1
            goto L_0x00d2
        L_0x00d1:
            r8 = r2
        L_0x00d2:
            if (r8 == 0) goto L_0x00d6
        L_0x00d4:
            r8 = r1
            goto L_0x00d7
        L_0x00d6:
            r8 = r2
        L_0x00d7:
            if (r8 != 0) goto L_0x00da
            return r2
        L_0x00da:
            n.h r8 = r7.f10044h     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            e.x.c.i.c(r8)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            n.z r7 = r7.a     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.lang.String r7 = r7.f10431e     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            n.x r0 = r6.d     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            e.x.c.i.c(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.util.List r0 = r0.c()     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.lang.String r3 = "hostname"
            e.x.c.i.e(r7, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.lang.String r3 = "peerCertificates"
            e.x.c.i.e(r0, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            n.i r3 = new n.i     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            r3.<init>(r8, r0, r7)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            r8.a(r7, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            return r1
        L_0x00ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.g.i.h(n.a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = n.m0.c.a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f10204b
            e.x.c.i.c(r2)
            java.net.Socket r3 = r9.c
            e.x.c.i.c(r3)
            o.g r4 = r9.f10206g
            e.x.c.i.c(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x0086
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x0086
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x0086
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x0086
        L_0x002f:
            n.m0.j.f r2 = r9.f
            r6 = 1
            if (r2 == 0) goto L_0x0050
            monitor-enter(r2)
            boolean r10 = r2.f10294n     // Catch:{ all -> 0x004d }
            if (r10 == 0) goto L_0x003b
        L_0x0039:
            monitor-exit(r2)
            goto L_0x004c
        L_0x003b:
            long r3 = r2.w     // Catch:{ all -> 0x004d }
            long r7 = r2.v     // Catch:{ all -> 0x004d }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004a
            long r3 = r2.y     // Catch:{ all -> 0x004d }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004a
            goto L_0x0039
        L_0x004a:
            monitor-exit(r2)
            r5 = r6
        L_0x004c:
            return r5
        L_0x004d:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0050:
            monitor-enter(r9)
            long r7 = r9.f10215p     // Catch:{ all -> 0x0083 }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0082
            if (r10 == 0) goto L_0x0082
            java.lang.String r10 = "$this$isHealthy"
            e.x.c.i.e(r3, r10)
            java.lang.String r10 = "source"
            e.x.c.i.e(r4, r10)
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x007b }
            boolean r0 = r4.D()     // Catch:{ all -> 0x007b }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
            r5 = r0
            goto L_0x0081
        L_0x007b:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
        L_0x0080:
            r5 = r6
        L_0x0081:
            return r5
        L_0x0082:
            return r6
        L_0x0083:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.g.i.i(boolean):boolean");
    }

    public final boolean j() {
        return this.f != null;
    }

    public final d k(c0 c0Var, n.m0.h.g gVar) {
        e.x.c.i.e(c0Var, "client");
        e.x.c.i.e(gVar, "chain");
        Socket socket = this.c;
        e.x.c.i.c(socket);
        g gVar2 = this.f10206g;
        e.x.c.i.c(gVar2);
        o.f fVar = this.f10207h;
        e.x.c.i.c(fVar);
        f fVar2 = this.f;
        if (fVar2 != null) {
            return new m(c0Var, this, gVar, fVar2);
        }
        socket.setSoTimeout(gVar.f10235h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar2.f().g((long) gVar.f10235h, timeUnit);
        fVar.f().g((long) gVar.f10236i, timeUnit);
        return new n.m0.i.b(c0Var, this, gVar2, fVar);
    }

    public final synchronized void l() {
        this.f10208i = true;
    }

    public final void m(int i2) {
        StringBuilder sb;
        Socket socket = this.c;
        e.x.c.i.c(socket);
        g gVar = this.f10206g;
        e.x.c.i.c(gVar);
        o.f fVar = this.f10207h;
        e.x.c.i.c(fVar);
        socket.setSoTimeout(0);
        n.m0.f.d dVar = n.m0.f.d.f10159h;
        f.b bVar = new f.b(true, dVar);
        String str = this.f10216q.a.a.f10431e;
        e.x.c.i.e(socket, "socket");
        e.x.c.i.e(str, "peerName");
        e.x.c.i.e(gVar, "source");
        e.x.c.i.e(fVar, "sink");
        bVar.a = socket;
        if (bVar.f10302h) {
            sb = new StringBuilder();
            sb.append(n.m0.c.f10152g);
            sb.append(' ');
        } else {
            sb = b.e.a.a.a.y("MockWebServer ");
        }
        sb.append(str);
        bVar.f10299b = sb.toString();
        bVar.c = gVar;
        bVar.d = fVar;
        e.x.c.i.e(this, "listener");
        bVar.f10300e = this;
        bVar.f10301g = i2;
        f fVar2 = new f(bVar);
        this.f = fVar2;
        f fVar3 = f.K;
        t tVar = f.J;
        this.f10213n = (tVar.a & 16) != 0 ? tVar.f10375b[4] : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        e.x.c.i.e(dVar, "taskRunner");
        p pVar = fVar2.G;
        synchronized (pVar) {
            if (pVar.f10369j) {
                throw new IOException("closed");
            } else if (pVar.f10372m) {
                Logger logger = p.f10366n;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(n.m0.c.i(">> CONNECTION " + e.a.m(), new Object[0]));
                }
                pVar.f10371l.M(e.a);
                pVar.f10371l.flush();
            }
        }
        p pVar2 = fVar2.G;
        t tVar2 = fVar2.z;
        synchronized (pVar2) {
            e.x.c.i.e(tVar2, "settings");
            if (!pVar2.f10369j) {
                pVar2.e(0, Integer.bitCount(tVar2.a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    if (((1 << i3) & tVar2.a) != 0) {
                        pVar2.f10371l.r(i3 != 4 ? i3 != 7 ? i3 : 4 : 3);
                        pVar2.f10371l.v(tVar2.f10375b[i3]);
                    }
                    i3++;
                }
                pVar2.f10371l.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a = fVar2.z.a();
        if (a != 65535) {
            fVar2.G.g(0, (long) (a - 65535));
        }
        n.m0.f.c f2 = dVar.f();
        String str2 = fVar2.f10291k;
        f2.c(new n.m0.f.b(fVar2.H, str2, true, str2, true), 0);
    }

    public String toString() {
        Object obj;
        StringBuilder y = b.e.a.a.a.y("Connection{");
        y.append(this.f10216q.a.a.f10431e);
        y.append(':');
        y.append(this.f10216q.a.a.f);
        y.append(',');
        y.append(" proxy=");
        y.append(this.f10216q.f10140b);
        y.append(" hostAddress=");
        y.append(this.f10216q.c);
        y.append(" cipherSuite=");
        x xVar = this.d;
        if (xVar == null || (obj = xVar.c) == null) {
            obj = "none";
        }
        y.append(obj);
        y.append(" protocol=");
        y.append(this.f10205e);
        y.append('}');
        return y.toString();
    }
}
