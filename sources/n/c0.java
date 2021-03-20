package n;

import e.x.c.i;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.m0.c;
import n.m0.g.e;
import n.m0.g.k;
import n.m0.m.d;
import n.u;

public class c0 implements Cloneable {
    public static final List<d0> G = c.l(d0.HTTP_2, d0.HTTP_1_1);
    public static final List<n> H = c.l(n.f10401g, n.f10402h);
    public static final b I = new b((DefaultConstructorMarker) null);
    public final h A;
    public final n.m0.m.c B;
    public final int C;
    public final int D;
    public final int E;
    public final k F;

    /* renamed from: h  reason: collision with root package name */
    public final r f10050h;

    /* renamed from: i  reason: collision with root package name */
    public final m f10051i;

    /* renamed from: j  reason: collision with root package name */
    public final List<a0> f10052j;

    /* renamed from: k  reason: collision with root package name */
    public final List<a0> f10053k;

    /* renamed from: l  reason: collision with root package name */
    public final u.b f10054l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f10055m;

    /* renamed from: n  reason: collision with root package name */
    public final c f10056n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f10057o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f10058p;

    /* renamed from: q  reason: collision with root package name */
    public final q f10059q;
    public final t r;
    public final ProxySelector s;
    public final c t;
    public final SocketFactory u;
    public final SSLSocketFactory v;
    public final X509TrustManager w;
    public final List<n> x;
    public final List<d0> y;
    public final HostnameVerifier z;

    public static final class a {
        public r a = new r();

        /* renamed from: b  reason: collision with root package name */
        public m f10060b = new m();
        public final List<a0> c = new ArrayList();
        public final List<a0> d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public u.b f10061e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public c f10062g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10063h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10064i;

        /* renamed from: j  reason: collision with root package name */
        public q f10065j;

        /* renamed from: k  reason: collision with root package name */
        public t f10066k;

        /* renamed from: l  reason: collision with root package name */
        public c f10067l;

        /* renamed from: m  reason: collision with root package name */
        public SocketFactory f10068m;

        /* renamed from: n  reason: collision with root package name */
        public SSLSocketFactory f10069n;

        /* renamed from: o  reason: collision with root package name */
        public X509TrustManager f10070o;

        /* renamed from: p  reason: collision with root package name */
        public List<n> f10071p;

        /* renamed from: q  reason: collision with root package name */
        public List<? extends d0> f10072q;
        public HostnameVerifier r;
        public h s;
        public n.m0.m.c t;
        public int u;
        public int v;
        public int w;
        public long x;

        public a() {
            u uVar = u.a;
            i.e(uVar, "$this$asFactory");
            this.f10061e = new n.m0.a(uVar);
            this.f = true;
            c cVar = c.a;
            this.f10062g = cVar;
            this.f10063h = true;
            this.f10064i = true;
            this.f10065j = q.a;
            this.f10066k = t.a;
            this.f10067l = cVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            i.d(socketFactory, "SocketFactory.getDefault()");
            this.f10068m = socketFactory;
            b bVar = c0.I;
            this.f10071p = c0.H;
            this.f10072q = c0.G;
            this.r = d.a;
            this.s = h.c;
            this.u = 10000;
            this.v = 10000;
            this.w = 10000;
            this.x = 1024;
        }

        public final a a(long j2, TimeUnit timeUnit) {
            i.e(timeUnit, "unit");
            this.u = c.b("timeout", j2, timeUnit);
            return this;
        }

        public final a b(long j2, TimeUnit timeUnit) {
            i.e(timeUnit, "unit");
            this.v = c.b("timeout", j2, timeUnit);
            return this;
        }

        public final a c(long j2, TimeUnit timeUnit) {
            i.e(timeUnit, "unit");
            this.w = c.b("timeout", j2, timeUnit);
            return this;
        }
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c0() {
        this(new a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c0(n.c0.a r6) {
        /*
            r5 = this;
            java.lang.String r0 = "builder"
            e.x.c.i.e(r6, r0)
            r5.<init>()
            n.r r0 = r6.a
            r5.f10050h = r0
            n.m r0 = r6.f10060b
            r5.f10051i = r0
            java.util.List<n.a0> r0 = r6.c
            java.util.List r0 = n.m0.c.y(r0)
            r5.f10052j = r0
            java.util.List<n.a0> r0 = r6.d
            java.util.List r0 = n.m0.c.y(r0)
            r5.f10053k = r0
            n.u$b r0 = r6.f10061e
            r5.f10054l = r0
            boolean r0 = r6.f
            r5.f10055m = r0
            n.c r0 = r6.f10062g
            r5.f10056n = r0
            boolean r0 = r6.f10063h
            r5.f10057o = r0
            boolean r0 = r6.f10064i
            r5.f10058p = r0
            n.q r0 = r6.f10065j
            r5.f10059q = r0
            n.t r0 = r6.f10066k
            r5.r = r0
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            n.m0.l.a r0 = n.m0.l.a.a
        L_0x0045:
            r5.s = r0
            n.c r0 = r6.f10067l
            r5.t = r0
            javax.net.SocketFactory r0 = r6.f10068m
            r5.u = r0
            java.util.List<n.n> r0 = r6.f10071p
            r5.x = r0
            java.util.List<? extends n.d0> r1 = r6.f10072q
            r5.y = r1
            javax.net.ssl.HostnameVerifier r1 = r6.r
            r5.z = r1
            r1 = 0
            int r2 = r6.u
            r5.C = r2
            int r2 = r6.v
            r5.D = r2
            int r2 = r6.w
            r5.E = r2
            n.m0.g.k r2 = new n.m0.g.k
            r2.<init>()
            r5.F = r2
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 1
            if (r2 == 0) goto L_0x007b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x007b
            goto L_0x0091
        L_0x007b:
            java.util.Iterator r0 = r0.iterator()
        L_0x007f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r0.next()
            n.n r2 = (n.n) r2
            boolean r2 = r2.a
            if (r2 == 0) goto L_0x007f
            r0 = r1
            goto L_0x0092
        L_0x0091:
            r0 = r3
        L_0x0092:
            r2 = 0
            if (r0 == 0) goto L_0x009e
            r5.v = r2
            r5.B = r2
            r5.w = r2
            n.h r6 = n.h.c
            goto L_0x00e1
        L_0x009e:
            javax.net.ssl.SSLSocketFactory r0 = r6.f10069n
            if (r0 == 0) goto L_0x00b3
            r5.v = r0
            n.m0.m.c r0 = r6.t
            e.x.c.i.c(r0)
            r5.B = r0
            javax.net.ssl.X509TrustManager r4 = r6.f10070o
            e.x.c.i.c(r4)
            r5.w = r4
            goto L_0x00d8
        L_0x00b3:
            n.m0.k.h$a r0 = n.m0.k.h.c
            n.m0.k.h r0 = n.m0.k.h.a
            javax.net.ssl.X509TrustManager r0 = r0.n()
            r5.w = r0
            n.m0.k.h r4 = n.m0.k.h.a
            e.x.c.i.c(r0)
            javax.net.ssl.SSLSocketFactory r4 = r4.m(r0)
            r5.v = r4
            e.x.c.i.c(r0)
            java.lang.String r4 = "trustManager"
            e.x.c.i.e(r0, r4)
            n.m0.k.h r4 = n.m0.k.h.a
            n.m0.m.c r0 = r4.b(r0)
            r5.B = r0
        L_0x00d8:
            n.h r6 = r6.s
            e.x.c.i.c(r0)
            n.h r6 = r6.b(r0)
        L_0x00e1:
            r5.A = r6
            java.util.List<n.a0> r6 = r5.f10052j
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            java.util.Objects.requireNonNull(r6, r0)
            boolean r6 = r6.contains(r2)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01bb
            java.util.List<n.a0> r6 = r5.f10053k
            java.util.Objects.requireNonNull(r6, r0)
            boolean r6 = r6.contains(r2)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01a2
            java.util.List<n.n> r6 = r5.x
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x010a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x010a
            goto L_0x0120
        L_0x010a:
            java.util.Iterator r6 = r6.iterator()
        L_0x010e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r6.next()
            n.n r0 = (n.n) r0
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x010e
            r6 = r1
            goto L_0x0121
        L_0x0120:
            r6 = r3
        L_0x0121:
            if (r6 == 0) goto L_0x0171
            javax.net.ssl.SSLSocketFactory r6 = r5.v
            if (r6 != 0) goto L_0x0129
            r6 = r3
            goto L_0x012a
        L_0x0129:
            r6 = r1
        L_0x012a:
            java.lang.String r0 = "Check failed."
            if (r6 == 0) goto L_0x0167
            n.m0.m.c r6 = r5.B
            if (r6 != 0) goto L_0x0134
            r6 = r3
            goto L_0x0135
        L_0x0134:
            r6 = r1
        L_0x0135:
            if (r6 == 0) goto L_0x015d
            javax.net.ssl.X509TrustManager r6 = r5.w
            if (r6 != 0) goto L_0x013c
            r1 = r3
        L_0x013c:
            if (r1 == 0) goto L_0x0153
            n.h r6 = r5.A
            n.h r1 = n.h.c
            boolean r6 = e.x.c.i.a(r6, r1)
            if (r6 == 0) goto L_0x0149
            goto L_0x017d
        L_0x0149:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0153:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x015d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0167:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0171:
            javax.net.ssl.SSLSocketFactory r6 = r5.v
            if (r6 == 0) goto L_0x0196
            n.m0.m.c r6 = r5.B
            if (r6 == 0) goto L_0x018a
            javax.net.ssl.X509TrustManager r6 = r5.w
            if (r6 == 0) goto L_0x017e
        L_0x017d:
            return
        L_0x017e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "x509TrustManager == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x018a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "certificateChainCleaner == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0196:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "sslSocketFactory == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01a2:
            java.lang.String r6 = "Null network interceptor: "
            java.lang.StringBuilder r6 = b.e.a.a.a.y(r6)
            java.util.List<n.a0> r0 = r5.f10053k
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x01bb:
            java.lang.String r6 = "Null interceptor: "
            java.lang.StringBuilder r6 = b.e.a.a.a.y(r6)
            java.util.List<n.a0> r0 = r5.f10052j
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.c0.<init>(n.c0$a):void");
    }

    public f a(e0 e0Var) {
        i.e(e0Var, "request");
        return new e(this, e0Var, false);
    }

    public Object clone() {
        return super.clone();
    }
}
