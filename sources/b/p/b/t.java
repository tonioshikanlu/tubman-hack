package b.p.b;

import b.l.f.x.a.g;
import b.p.b.n;
import java.io.IOException;
import java.net.URI;

public final class t {
    public final o a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6756b;
    public final n c;
    public final v d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f6757e;
    public volatile URI f;

    /* renamed from: g  reason: collision with root package name */
    public volatile c f6758g;

    public static class b {
        public o a;

        /* renamed from: b  reason: collision with root package name */
        public String f6759b;
        public n.b c;
        public v d;

        /* renamed from: e  reason: collision with root package name */
        public Object f6760e;

        public b() {
            this.f6759b = "GET";
            this.c = new n.b();
        }

        public b(t tVar, a aVar) {
            this.a = tVar.a;
            this.f6759b = tVar.f6756b;
            this.d = tVar.d;
            this.f6760e = tVar.f6757e;
            this.c = tVar.c.c();
        }

        public t a() {
            if (this.a != null) {
                return new t(this, (a) null);
            }
            throw new IllegalStateException("url == null");
        }

        public b b(String str, String str2) {
            n.b bVar = this.c;
            bVar.d(str, str2);
            bVar.e(str);
            bVar.a.add(str);
            bVar.a.add(str2.trim());
            return this;
        }

        public b c(String str, v vVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (vVar != null && !g.Z(str)) {
                throw new IllegalArgumentException(b.e.a.a.a.n("method ", str, " must not have a request body."));
            } else if (vVar != null || !g.f0(str)) {
                this.f6759b = str;
                this.d = vVar;
                return this;
            } else {
                throw new IllegalArgumentException(b.e.a.a.a.n("method ", str, " must have a request body."));
            }
        }

        public b d(o oVar) {
            if (oVar != null) {
                this.a = oVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }
    }

    public t(b bVar, a aVar) {
        this.a = bVar.a;
        this.f6756b = bVar.f6759b;
        this.c = bVar.c.c();
        this.d = bVar.d;
        Object obj = bVar.f6760e;
        this.f6757e = obj == null ? this : obj;
    }

    public c a() {
        c cVar = this.f6758g;
        if (cVar != null) {
            return cVar;
        }
        c a2 = c.a(this.c);
        this.f6758g = a2;
        return a2;
    }

    public boolean b() {
        return this.a.a.equals("https");
    }

    public b c() {
        return new b(this, (a) null);
    }

    public URI d() {
        try {
            URI uri = this.f;
            if (uri != null) {
                return uri;
            }
            URI r = this.a.r();
            this.f = r;
            return r;
        } catch (IllegalStateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Request{method=");
        y.append(this.f6756b);
        y.append(", url=");
        y.append(this.a);
        y.append(", tag=");
        Object obj = this.f6757e;
        if (obj == this) {
            obj = null;
        }
        y.append(obj);
        y.append('}');
        return y.toString();
    }
}
