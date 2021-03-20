package n.m0.i;

import e.c0.h;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n.c0;
import n.e0;
import n.h0;
import n.m0.g.i;
import n.m0.h.j;
import n.q;
import n.y;
import o.a0;
import o.g;
import o.l;
import o.x;
import o.z;

public final class b implements n.m0.h.d {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10242b;
    public y c;
    public final c0 d;

    /* renamed from: e  reason: collision with root package name */
    public final i f10243e;
    public final g f;

    /* renamed from: g  reason: collision with root package name */
    public final o.f f10244g;

    public abstract class a implements z {

        /* renamed from: h  reason: collision with root package name */
        public final l f10245h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10246i;

        public a() {
            this.f10245h = new l(b.this.f.f());
        }

        public long T(o.e eVar, long j2) {
            e.x.c.i.e(eVar, "sink");
            try {
                return b.this.f.T(eVar, j2);
            } catch (IOException e2) {
                b.this.f10243e.l();
                b();
                throw e2;
            }
        }

        public final void b() {
            b bVar = b.this;
            int i2 = bVar.a;
            if (i2 != 6) {
                if (i2 == 5) {
                    b.i(bVar, this.f10245h);
                    b.this.a = 6;
                    return;
                }
                StringBuilder y = b.e.a.a.a.y("state: ");
                y.append(b.this.a);
                throw new IllegalStateException(y.toString());
            }
        }

        public a0 f() {
            return this.f10245h;
        }
    }

    /* renamed from: n.m0.i.b$b  reason: collision with other inner class name */
    public final class C0234b implements x {

        /* renamed from: h  reason: collision with root package name */
        public final l f10248h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10249i;

        public C0234b() {
            this.f10248h = new l(b.this.f10244g.f());
        }

        public synchronized void close() {
            if (!this.f10249i) {
                this.f10249i = true;
                b.this.f10244g.d0("0\r\n\r\n");
                b.i(b.this, this.f10248h);
                b.this.a = 3;
            }
        }

        public a0 f() {
            return this.f10248h;
        }

        public synchronized void flush() {
            if (!this.f10249i) {
                b.this.f10244g.flush();
            }
        }

        public void j(o.e eVar, long j2) {
            e.x.c.i.e(eVar, "source");
            if (!(!this.f10249i)) {
                throw new IllegalStateException("closed".toString());
            } else if (j2 != 0) {
                b.this.f10244g.o(j2);
                b.this.f10244g.d0("\r\n");
                b.this.f10244g.j(eVar, j2);
                b.this.f10244g.d0("\r\n");
            }
        }
    }

    public final class c extends a {

        /* renamed from: k  reason: collision with root package name */
        public long f10251k = -1;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10252l = true;

        /* renamed from: m  reason: collision with root package name */
        public final n.z f10253m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ b f10254n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, n.z zVar) {
            super();
            e.x.c.i.e(zVar, "url");
            this.f10254n = bVar;
            this.f10253m = zVar;
        }

        public long T(o.e eVar, long j2) {
            e.x.c.i.e(eVar, "sink");
            boolean z = true;
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j2).toString());
            } else if (!(!this.f10246i)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f10252l) {
                return -1;
            } else {
                long j3 = this.f10251k;
                if (j3 == 0 || j3 == -1) {
                    if (j3 != -1) {
                        this.f10254n.f.y();
                    }
                    try {
                        this.f10251k = this.f10254n.f.h0();
                        String y = this.f10254n.f.y();
                        if (y != null) {
                            String obj = h.N(y).toString();
                            if (this.f10251k >= 0) {
                                if (obj.length() <= 0) {
                                    z = false;
                                }
                                if (!z || h.C(obj, ";", false, 2)) {
                                    if (this.f10251k == 0) {
                                        this.f10252l = false;
                                        b bVar = this.f10254n;
                                        bVar.c = bVar.f10242b.a();
                                        c0 c0Var = this.f10254n.d;
                                        e.x.c.i.c(c0Var);
                                        q qVar = c0Var.f10059q;
                                        n.z zVar = this.f10253m;
                                        y yVar = this.f10254n.c;
                                        e.x.c.i.c(yVar);
                                        n.m0.h.e.d(qVar, zVar, yVar);
                                        b();
                                    }
                                    if (!this.f10252l) {
                                        return -1;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f10251k + obj + '\"');
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    } catch (NumberFormatException e2) {
                        throw new ProtocolException(e2.getMessage());
                    }
                }
                long T = super.T(eVar, Math.min(j2, this.f10251k));
                if (T != -1) {
                    this.f10251k -= T;
                    return T;
                }
                this.f10254n.f10243e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
        }

        public void close() {
            if (!this.f10246i) {
                if (this.f10252l && !n.m0.c.h(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f10254n.f10243e.l();
                    b();
                }
                this.f10246i = true;
            }
        }
    }

    public final class d extends a {

        /* renamed from: k  reason: collision with root package name */
        public long f10255k;

        public d(long j2) {
            super();
            this.f10255k = j2;
            if (j2 == 0) {
                b();
            }
        }

        public long T(o.e eVar, long j2) {
            e.x.c.i.e(eVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j2).toString());
            } else if (!this.f10246i) {
                long j3 = this.f10255k;
                if (j3 == 0) {
                    return -1;
                }
                long T = super.T(eVar, Math.min(j3, j2));
                if (T != -1) {
                    long j4 = this.f10255k - T;
                    this.f10255k = j4;
                    if (j4 == 0) {
                        b();
                    }
                    return T;
                }
                b.this.f10243e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!this.f10246i) {
                if (this.f10255k != 0 && !n.m0.c.h(this, 100, TimeUnit.MILLISECONDS)) {
                    b.this.f10243e.l();
                    b();
                }
                this.f10246i = true;
            }
        }
    }

    public final class e implements x {

        /* renamed from: h  reason: collision with root package name */
        public final l f10257h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10258i;

        public e() {
            this.f10257h = new l(b.this.f10244g.f());
        }

        public void close() {
            if (!this.f10258i) {
                this.f10258i = true;
                b.i(b.this, this.f10257h);
                b.this.a = 3;
            }
        }

        public a0 f() {
            return this.f10257h;
        }

        public void flush() {
            if (!this.f10258i) {
                b.this.f10244g.flush();
            }
        }

        public void j(o.e eVar, long j2) {
            e.x.c.i.e(eVar, "source");
            if (!this.f10258i) {
                n.m0.c.c(eVar.f10453i, 0, j2);
                b.this.f10244g.j(eVar, j2);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public final class f extends a {

        /* renamed from: k  reason: collision with root package name */
        public boolean f10260k;

        public f(b bVar) {
            super();
        }

        public long T(o.e eVar, long j2) {
            e.x.c.i.e(eVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j2).toString());
            } else if (!(!this.f10246i)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f10260k) {
                return -1;
            } else {
                long T = super.T(eVar, j2);
                if (T != -1) {
                    return T;
                }
                this.f10260k = true;
                b();
                return -1;
            }
        }

        public void close() {
            if (!this.f10246i) {
                if (!this.f10260k) {
                    b();
                }
                this.f10246i = true;
            }
        }
    }

    public b(c0 c0Var, i iVar, g gVar, o.f fVar) {
        e.x.c.i.e(iVar, "connection");
        e.x.c.i.e(gVar, "source");
        e.x.c.i.e(fVar, "sink");
        this.d = c0Var;
        this.f10243e = iVar;
        this.f = gVar;
        this.f10244g = fVar;
        this.f10242b = new a(gVar);
    }

    public static final void i(b bVar, l lVar) {
        Objects.requireNonNull(bVar);
        a0 a0Var = lVar.f10465e;
        a0 a0Var2 = a0.d;
        e.x.c.i.e(a0Var2, "delegate");
        lVar.f10465e = a0Var2;
        a0Var.a();
        a0Var.b();
    }

    public void a() {
        this.f10244g.flush();
    }

    public void b(e0 e0Var) {
        e.x.c.i.e(e0Var, "request");
        Proxy.Type type = this.f10243e.f10216q.f10140b.type();
        e.x.c.i.d(type, "connection.route().proxy.type()");
        e.x.c.i.e(e0Var, "request");
        e.x.c.i.e(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(e0Var.c);
        sb.append(' ');
        n.z zVar = e0Var.f10092b;
        if (!zVar.a && type == Proxy.Type.HTTP) {
            sb.append(zVar);
        } else {
            e.x.c.i.e(zVar, "url");
            String b2 = zVar.b();
            String d2 = zVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            sb.append(b2);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        e.x.c.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k(e0Var.d, sb2);
    }

    public void c() {
        this.f10244g.flush();
    }

    public void cancel() {
        Socket socket = this.f10243e.f10204b;
        if (socket != null) {
            n.m0.c.e(socket);
        }
    }

    public long d(h0 h0Var) {
        e.x.c.i.e(h0Var, "response");
        if (!n.m0.h.e.a(h0Var)) {
            return 0;
        }
        if (h.f("chunked", h0.b(h0Var, "Transfer-Encoding", (String) null, 2), true)) {
            return -1;
        }
        return n.m0.c.k(h0Var);
    }

    public z e(h0 h0Var) {
        e.x.c.i.e(h0Var, "response");
        if (!n.m0.h.e.a(h0Var)) {
            return j(0);
        }
        boolean z = true;
        if (h.f("chunked", h0.b(h0Var, "Transfer-Encoding", (String) null, 2), true)) {
            n.z zVar = h0Var.f10100h.f10092b;
            if (this.a != 4) {
                z = false;
            }
            if (z) {
                this.a = 5;
                return new c(this, zVar);
            }
            StringBuilder y = b.e.a.a.a.y("state: ");
            y.append(this.a);
            throw new IllegalStateException(y.toString().toString());
        }
        long k2 = n.m0.c.k(h0Var);
        if (k2 != -1) {
            return j(k2);
        }
        if (this.a != 4) {
            z = false;
        }
        if (z) {
            this.a = 5;
            this.f10243e.l();
            return new f(this);
        }
        StringBuilder y2 = b.e.a.a.a.y("state: ");
        y2.append(this.a);
        throw new IllegalStateException(y2.toString().toString());
    }

    public x f(e0 e0Var, long j2) {
        e.x.c.i.e(e0Var, "request");
        boolean z = true;
        if (h.f("chunked", e0Var.b("Transfer-Encoding"), true)) {
            if (this.a != 1) {
                z = false;
            }
            if (z) {
                this.a = 2;
                return new C0234b();
            }
            StringBuilder y = b.e.a.a.a.y("state: ");
            y.append(this.a);
            throw new IllegalStateException(y.toString().toString());
        } else if (j2 != -1) {
            if (this.a != 1) {
                z = false;
            }
            if (z) {
                this.a = 2;
                return new e();
            }
            StringBuilder y2 = b.e.a.a.a.y("state: ");
            y2.append(this.a);
            throw new IllegalStateException(y2.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public h0.a g(boolean z) {
        int i2 = this.a;
        boolean z2 = true;
        if (!(i2 == 1 || i2 == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                j a2 = j.a(this.f10242b.b());
                h0.a aVar = new h0.a();
                aVar.f(a2.a);
                aVar.c = a2.f10240b;
                aVar.e(a2.c);
                aVar.d(this.f10242b.a());
                if (z && a2.f10240b == 100) {
                    return null;
                }
                if (a2.f10240b == 100) {
                    this.a = 3;
                    return aVar;
                }
                this.a = 4;
                return aVar;
            } catch (EOFException e2) {
                throw new IOException(b.e.a.a.a.m("unexpected end of stream on ", this.f10243e.f10216q.a.a.i()), e2);
            }
        } else {
            StringBuilder y = b.e.a.a.a.y("state: ");
            y.append(this.a);
            throw new IllegalStateException(y.toString().toString());
        }
    }

    public i h() {
        return this.f10243e;
    }

    public final z j(long j2) {
        if (this.a == 4) {
            this.a = 5;
            return new d(j2);
        }
        StringBuilder y = b.e.a.a.a.y("state: ");
        y.append(this.a);
        throw new IllegalStateException(y.toString().toString());
    }

    public final void k(y yVar, String str) {
        e.x.c.i.e(yVar, "headers");
        e.x.c.i.e(str, "requestLine");
        if (this.a == 0) {
            this.f10244g.d0(str).d0("\r\n");
            int size = yVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f10244g.d0(yVar.e(i2)).d0(": ").d0(yVar.p(i2)).d0("\r\n");
            }
            this.f10244g.d0("\r\n");
            this.a = 1;
            return;
        }
        StringBuilder y = b.e.a.a.a.y("state: ");
        y.append(this.a);
        throw new IllegalStateException(y.toString().toString());
    }
}
