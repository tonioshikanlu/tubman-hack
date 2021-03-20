package n;

import e.x.c.i;
import java.io.Closeable;
import java.util.Objects;
import n.m0.g.c;
import n.y;

public final class h0 implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public final e0 f10100h;

    /* renamed from: i  reason: collision with root package name */
    public final d0 f10101i;

    /* renamed from: j  reason: collision with root package name */
    public final String f10102j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10103k;

    /* renamed from: l  reason: collision with root package name */
    public final x f10104l;

    /* renamed from: m  reason: collision with root package name */
    public final y f10105m;

    /* renamed from: n  reason: collision with root package name */
    public final j0 f10106n;

    /* renamed from: o  reason: collision with root package name */
    public final h0 f10107o;

    /* renamed from: p  reason: collision with root package name */
    public final h0 f10108p;

    /* renamed from: q  reason: collision with root package name */
    public final h0 f10109q;
    public final long r;
    public final long s;
    public final c t;

    public static class a {
        public e0 a;

        /* renamed from: b  reason: collision with root package name */
        public d0 f10110b;
        public int c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public x f10111e;
        public y.a f;

        /* renamed from: g  reason: collision with root package name */
        public j0 f10112g;

        /* renamed from: h  reason: collision with root package name */
        public h0 f10113h;

        /* renamed from: i  reason: collision with root package name */
        public h0 f10114i;

        /* renamed from: j  reason: collision with root package name */
        public h0 f10115j;

        /* renamed from: k  reason: collision with root package name */
        public long f10116k;

        /* renamed from: l  reason: collision with root package name */
        public long f10117l;

        /* renamed from: m  reason: collision with root package name */
        public c f10118m;

        public a() {
            this.c = -1;
            this.f = new y.a();
        }

        public a(h0 h0Var) {
            i.e(h0Var, "response");
            this.c = -1;
            this.a = h0Var.f10100h;
            this.f10110b = h0Var.f10101i;
            this.c = h0Var.f10103k;
            this.d = h0Var.f10102j;
            this.f10111e = h0Var.f10104l;
            this.f = h0Var.f10105m.n();
            this.f10112g = h0Var.f10106n;
            this.f10113h = h0Var.f10107o;
            this.f10114i = h0Var.f10108p;
            this.f10115j = h0Var.f10109q;
            this.f10116k = h0Var.r;
            this.f10117l = h0Var.s;
            this.f10118m = h0Var.t;
        }

        public h0 a() {
            int i2 = this.c;
            if (i2 >= 0) {
                e0 e0Var = this.a;
                if (e0Var != null) {
                    d0 d0Var = this.f10110b;
                    if (d0Var != null) {
                        String str = this.d;
                        if (str != null) {
                            return new h0(e0Var, d0Var, str, i2, this.f10111e, this.f.b(), this.f10112g, this.f10113h, this.f10114i, this.f10115j, this.f10116k, this.f10117l, this.f10118m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder y = b.e.a.a.a.y("code < 0: ");
            y.append(this.c);
            throw new IllegalStateException(y.toString().toString());
        }

        public a b(h0 h0Var) {
            c("cacheResponse", h0Var);
            this.f10114i = h0Var;
            return this;
        }

        public final void c(String str, h0 h0Var) {
            if (h0Var != null) {
                boolean z = true;
                if (h0Var.f10106n == null) {
                    if (h0Var.f10107o == null) {
                        if (h0Var.f10108p == null) {
                            if (h0Var.f10109q != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(b.e.a.a.a.m(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(b.e.a.a.a.m(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(b.e.a.a.a.m(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(b.e.a.a.a.m(str, ".body != null").toString());
            }
        }

        public a d(y yVar) {
            i.e(yVar, "headers");
            this.f = yVar.n();
            return this;
        }

        public a e(String str) {
            i.e(str, "message");
            this.d = str;
            return this;
        }

        public a f(d0 d0Var) {
            i.e(d0Var, "protocol");
            this.f10110b = d0Var;
            return this;
        }

        public a g(e0 e0Var) {
            i.e(e0Var, "request");
            this.a = e0Var;
            return this;
        }
    }

    public h0(e0 e0Var, d0 d0Var, String str, int i2, x xVar, y yVar, j0 j0Var, h0 h0Var, h0 h0Var2, h0 h0Var3, long j2, long j3, c cVar) {
        i.e(e0Var, "request");
        i.e(d0Var, "protocol");
        i.e(str, "message");
        i.e(yVar, "headers");
        this.f10100h = e0Var;
        this.f10101i = d0Var;
        this.f10102j = str;
        this.f10103k = i2;
        this.f10104l = xVar;
        this.f10105m = yVar;
        this.f10106n = j0Var;
        this.f10107o = h0Var;
        this.f10108p = h0Var2;
        this.f10109q = h0Var3;
        this.r = j2;
        this.s = j3;
        this.t = cVar;
    }

    public static String b(h0 h0Var, String str, String str2, int i2) {
        int i3 = i2 & 2;
        Objects.requireNonNull(h0Var);
        i.e(str, "name");
        String d = h0Var.f10105m.d(str);
        if (d != null) {
            return d;
        }
        return null;
    }

    public void close() {
        j0 j0Var = this.f10106n;
        if (j0Var != null) {
            j0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean e() {
        int i2 = this.f10103k;
        return 200 <= i2 && 299 >= i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Response{protocol=");
        y.append(this.f10101i);
        y.append(", code=");
        y.append(this.f10103k);
        y.append(", message=");
        y.append(this.f10102j);
        y.append(", url=");
        y.append(this.f10100h.f10092b);
        y.append('}');
        return y.toString();
    }
}
