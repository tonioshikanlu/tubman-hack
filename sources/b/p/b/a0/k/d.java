package b.p.b.a0.k;

import b.p.b.a0.i;
import b.p.b.n;
import b.p.b.r;
import b.p.b.t;
import b.p.b.w;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o.a0;
import o.l;
import o.x;
import o.z;

public final class d implements i {
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public final o.g f6603b;
    public final o.f c;
    public g d;

    /* renamed from: e  reason: collision with root package name */
    public int f6604e = 0;

    public abstract class b implements z {

        /* renamed from: h  reason: collision with root package name */
        public final l f6605h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f6606i;

        public b(a aVar) {
            this.f6605h = new l(d.this.f6603b.f());
        }

        public final void b() {
            d dVar = d.this;
            if (dVar.f6604e == 5) {
                d.h(dVar, this.f6605h);
                d dVar2 = d.this;
                dVar2.f6604e = 6;
                p pVar = dVar2.a;
                if (pVar != null) {
                    pVar.h(dVar2);
                    return;
                }
                return;
            }
            StringBuilder y = b.e.a.a.a.y("state: ");
            y.append(d.this.f6604e);
            throw new IllegalStateException(y.toString());
        }

        public final void e() {
            d dVar = d.this;
            if (dVar.f6604e != 6) {
                dVar.f6604e = 6;
                p pVar = dVar.a;
                if (pVar != null) {
                    pVar.f();
                    d dVar2 = d.this;
                    dVar2.a.h(dVar2);
                }
            }
        }

        public a0 f() {
            return this.f6605h;
        }
    }

    public final class c implements x {

        /* renamed from: h  reason: collision with root package name */
        public final l f6608h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f6609i;

        public c(a aVar) {
            this.f6608h = new l(d.this.c.f());
        }

        public synchronized void close() {
            if (!this.f6609i) {
                this.f6609i = true;
                d.this.c.d0("0\r\n\r\n");
                d.h(d.this, this.f6608h);
                d.this.f6604e = 3;
            }
        }

        public a0 f() {
            return this.f6608h;
        }

        public synchronized void flush() {
            if (!this.f6609i) {
                d.this.c.flush();
            }
        }

        public void j(o.e eVar, long j2) {
            if (this.f6609i) {
                throw new IllegalStateException("closed");
            } else if (j2 != 0) {
                d.this.c.o(j2);
                d.this.c.d0("\r\n");
                d.this.c.j(eVar, j2);
                d.this.c.d0("\r\n");
            }
        }
    }

    /* renamed from: b.p.b.a0.k.d$d  reason: collision with other inner class name */
    public class C0116d extends b {

        /* renamed from: k  reason: collision with root package name */
        public long f6611k = -1;

        /* renamed from: l  reason: collision with root package name */
        public boolean f6612l = true;

        /* renamed from: m  reason: collision with root package name */
        public final g f6613m;

        public C0116d(g gVar) {
            super((a) null);
            this.f6613m = gVar;
        }

        public long T(o.e eVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j2));
            } else if (this.f6606i) {
                throw new IllegalStateException("closed");
            } else if (!this.f6612l) {
                return -1;
            } else {
                long j3 = this.f6611k;
                if (j3 == 0 || j3 == -1) {
                    if (j3 != -1) {
                        d.this.f6603b.y();
                    }
                    try {
                        this.f6611k = d.this.f6603b.h0();
                        String trim = d.this.f6603b.y().trim();
                        if (this.f6611k < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f6611k + trim + "\"");
                        }
                        if (this.f6611k == 0) {
                            this.f6612l = false;
                            this.f6613m.f(d.this.j());
                            b();
                        }
                        if (!this.f6612l) {
                            return -1;
                        }
                    } catch (NumberFormatException e2) {
                        throw new ProtocolException(e2.getMessage());
                    }
                }
                long T = d.this.f6603b.T(eVar, Math.min(j2, this.f6611k));
                if (T != -1) {
                    this.f6611k -= T;
                    return T;
                }
                e();
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() {
            if (!this.f6606i) {
                if (this.f6612l && !i.e(this, 100, TimeUnit.MILLISECONDS)) {
                    e();
                }
                this.f6606i = true;
            }
        }
    }

    public final class e implements x {

        /* renamed from: h  reason: collision with root package name */
        public final l f6615h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f6616i;

        /* renamed from: j  reason: collision with root package name */
        public long f6617j;

        public e(long j2, a aVar) {
            this.f6615h = new l(d.this.c.f());
            this.f6617j = j2;
        }

        public void close() {
            if (!this.f6616i) {
                this.f6616i = true;
                if (this.f6617j <= 0) {
                    d.h(d.this, this.f6615h);
                    d.this.f6604e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public a0 f() {
            return this.f6615h;
        }

        public void flush() {
            if (!this.f6616i) {
                d.this.c.flush();
            }
        }

        public void j(o.e eVar, long j2) {
            if (!this.f6616i) {
                i.a(eVar.f10453i, 0, j2);
                if (j2 <= this.f6617j) {
                    d.this.c.j(eVar, j2);
                    this.f6617j -= j2;
                    return;
                }
                StringBuilder y = b.e.a.a.a.y("expected ");
                y.append(this.f6617j);
                y.append(" bytes but received ");
                y.append(j2);
                throw new ProtocolException(y.toString());
            }
            throw new IllegalStateException("closed");
        }
    }

    public class f extends b {

        /* renamed from: k  reason: collision with root package name */
        public long f6619k;

        public f(long j2) {
            super((a) null);
            this.f6619k = j2;
            if (j2 == 0) {
                b();
            }
        }

        public long T(o.e eVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j2));
            } else if (!this.f6606i) {
                long j3 = this.f6619k;
                if (j3 == 0) {
                    return -1;
                }
                long T = d.this.f6603b.T(eVar, Math.min(j3, j2));
                if (T != -1) {
                    long j4 = this.f6619k - T;
                    this.f6619k = j4;
                    if (j4 == 0) {
                        b();
                    }
                    return T;
                }
                e();
                throw new ProtocolException("unexpected end of stream");
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f6606i) {
                if (this.f6619k != 0 && !i.e(this, 100, TimeUnit.MILLISECONDS)) {
                    e();
                }
                this.f6606i = true;
            }
        }
    }

    public class g extends b {

        /* renamed from: k  reason: collision with root package name */
        public boolean f6621k;

        public g(a aVar) {
            super((a) null);
        }

        public long T(o.e eVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j2));
            } else if (this.f6606i) {
                throw new IllegalStateException("closed");
            } else if (this.f6621k) {
                return -1;
            } else {
                long T = d.this.f6603b.T(eVar, j2);
                if (T != -1) {
                    return T;
                }
                this.f6621k = true;
                b();
                return -1;
            }
        }

        public void close() {
            if (!this.f6606i) {
                if (!this.f6621k) {
                    e();
                }
                this.f6606i = true;
            }
        }
    }

    public d(p pVar, o.g gVar, o.f fVar) {
        this.a = pVar;
        this.f6603b = gVar;
        this.c = fVar;
    }

    public static void h(d dVar, l lVar) {
        Objects.requireNonNull(dVar);
        a0 a0Var = lVar.f10465e;
        a0 a0Var2 = a0.d;
        e.x.c.i.e(a0Var2, "delegate");
        lVar.f10465e = a0Var2;
        a0Var.a();
        a0Var.b();
    }

    public void a() {
        this.c.flush();
    }

    public x b(t tVar, long j2) {
        if ("chunked".equalsIgnoreCase(tVar.c.a("Transfer-Encoding"))) {
            if (this.f6604e == 1) {
                this.f6604e = 2;
                return new c((a) null);
            }
            StringBuilder y = b.e.a.a.a.y("state: ");
            y.append(this.f6604e);
            throw new IllegalStateException(y.toString());
        } else if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f6604e == 1) {
            this.f6604e = 2;
            return new e(j2, (a) null);
        } else {
            StringBuilder y2 = b.e.a.a.a.y("state: ");
            y2.append(this.f6604e);
            throw new IllegalStateException(y2.toString());
        }
    }

    public void c(t tVar) {
        this.d.m();
        Proxy.Type type = this.d.f6638b.a().a.f6776b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(tVar.f6756b);
        sb.append(' ');
        if (!tVar.b() && type == Proxy.Type.HTTP) {
            sb.append(tVar.a);
        } else {
            sb.append(b.l.f.x.a.g.e0(tVar.a));
        }
        sb.append(" HTTP/1.1");
        l(tVar.c, sb.toString());
    }

    public void d(g gVar) {
        this.d = gVar;
    }

    public void e(l lVar) {
        if (this.f6604e == 1) {
            this.f6604e = 3;
            o.f fVar = this.c;
            o.e eVar = new o.e();
            o.e eVar2 = lVar.f6660j;
            eVar2.z(eVar, 0, eVar2.f10453i);
            fVar.j(eVar, eVar.f10453i);
            return;
        }
        StringBuilder y = b.e.a.a.a.y("state: ");
        y.append(this.f6604e);
        throw new IllegalStateException(y.toString());
    }

    public w.b f() {
        return k();
    }

    public b.p.b.x g(w wVar) {
        z zVar;
        if (!g.b(wVar)) {
            zVar = i(0);
        } else {
            String a2 = wVar.f.a("Transfer-Encoding");
            if (a2 == null) {
                a2 = null;
            }
            if ("chunked".equalsIgnoreCase(a2)) {
                g gVar = this.d;
                if (this.f6604e == 4) {
                    this.f6604e = 5;
                    zVar = new C0116d(gVar);
                } else {
                    StringBuilder y = b.e.a.a.a.y("state: ");
                    y.append(this.f6604e);
                    throw new IllegalStateException(y.toString());
                }
            } else {
                Comparator<String> comparator = j.a;
                long a3 = j.a(wVar.f);
                if (a3 != -1) {
                    zVar = i(a3);
                } else if (this.f6604e == 4) {
                    p pVar = this.a;
                    if (pVar != null) {
                        this.f6604e = 5;
                        pVar.f();
                        zVar = new g((a) null);
                    } else {
                        throw new IllegalStateException("streamAllocation == null");
                    }
                } else {
                    StringBuilder y2 = b.e.a.a.a.y("state: ");
                    y2.append(this.f6604e);
                    throw new IllegalStateException(y2.toString());
                }
            }
        }
        return new k(wVar.f, e.a.a.a.y0.m.o1.c.m(zVar));
    }

    public z i(long j2) {
        if (this.f6604e == 4) {
            this.f6604e = 5;
            return new f(j2);
        }
        StringBuilder y = b.e.a.a.a.y("state: ");
        y.append(this.f6604e);
        throw new IllegalStateException(y.toString());
    }

    public n j() {
        n.b bVar = new n.b();
        while (true) {
            String y = this.f6603b.y();
            if (y.length() == 0) {
                return bVar.c();
            }
            Objects.requireNonNull((r.a) b.p.b.a0.b.f6471b);
            int indexOf = y.indexOf(":", 1);
            if (indexOf != -1) {
                bVar.b(y.substring(0, indexOf), y.substring(indexOf + 1));
            } else {
                if (y.startsWith(":")) {
                    y = y.substring(1);
                }
                bVar.a.add("");
                bVar.a.add(y.trim());
            }
        }
    }

    public w.b k() {
        o a2;
        w.b bVar;
        int i2 = this.f6604e;
        if (i2 == 1 || i2 == 3) {
            do {
                try {
                    a2 = o.a(this.f6603b.y());
                    bVar = new w.b();
                    bVar.f6769b = a2.a;
                    bVar.c = a2.f6668b;
                    bVar.d = a2.c;
                    bVar.d(j());
                } catch (EOFException e2) {
                    StringBuilder y = b.e.a.a.a.y("unexpected end of stream on ");
                    y.append(this.a);
                    IOException iOException = new IOException(y.toString());
                    iOException.initCause(e2);
                    throw iOException;
                }
            } while (a2.f6668b == 100);
            this.f6604e = 4;
            return bVar;
        }
        StringBuilder y2 = b.e.a.a.a.y("state: ");
        y2.append(this.f6604e);
        throw new IllegalStateException(y2.toString());
    }

    public void l(n nVar, String str) {
        if (this.f6604e == 0) {
            this.c.d0(str).d0("\r\n");
            int d2 = nVar.d();
            for (int i2 = 0; i2 < d2; i2++) {
                this.c.d0(nVar.b(i2)).d0(": ").d0(nVar.e(i2)).d0("\r\n");
            }
            this.c.d0("\r\n");
            this.f6604e = 1;
            return;
        }
        StringBuilder y = b.e.a.a.a.y("state: ");
        y.append(this.f6604e);
        throw new IllegalStateException(y.toString());
    }
}
