package b.p.b;

import b.l.f.x.a.g;
import b.p.b.a0.k.j;
import b.p.b.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class w {
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final s f6762b;
    public final int c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final m f6763e;
    public final n f;

    /* renamed from: g  reason: collision with root package name */
    public final x f6764g;

    /* renamed from: h  reason: collision with root package name */
    public w f6765h;

    /* renamed from: i  reason: collision with root package name */
    public w f6766i;

    /* renamed from: j  reason: collision with root package name */
    public final w f6767j;

    /* renamed from: k  reason: collision with root package name */
    public volatile c f6768k;

    public static class b {
        public t a;

        /* renamed from: b  reason: collision with root package name */
        public s f6769b;
        public int c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public m f6770e;
        public n.b f;

        /* renamed from: g  reason: collision with root package name */
        public x f6771g;

        /* renamed from: h  reason: collision with root package name */
        public w f6772h;

        /* renamed from: i  reason: collision with root package name */
        public w f6773i;

        /* renamed from: j  reason: collision with root package name */
        public w f6774j;

        public b() {
            this.c = -1;
            this.f = new n.b();
        }

        public b(w wVar, a aVar) {
            this.c = -1;
            this.a = wVar.a;
            this.f6769b = wVar.f6762b;
            this.c = wVar.c;
            this.d = wVar.d;
            this.f6770e = wVar.f6763e;
            this.f = wVar.f.c();
            this.f6771g = wVar.f6764g;
            this.f6772h = wVar.f6765h;
            this.f6773i = wVar.f6766i;
            this.f6774j = wVar.f6767j;
        }

        public w a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f6769b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c >= 0) {
                return new w(this, (a) null);
            } else {
                StringBuilder y = b.e.a.a.a.y("code < 0: ");
                y.append(this.c);
                throw new IllegalStateException(y.toString());
            }
        }

        public b b(w wVar) {
            if (wVar != null) {
                c("cacheResponse", wVar);
            }
            this.f6773i = wVar;
            return this;
        }

        public final void c(String str, w wVar) {
            if (wVar.f6764g != null) {
                throw new IllegalArgumentException(b.e.a.a.a.m(str, ".body != null"));
            } else if (wVar.f6765h != null) {
                throw new IllegalArgumentException(b.e.a.a.a.m(str, ".networkResponse != null"));
            } else if (wVar.f6766i != null) {
                throw new IllegalArgumentException(b.e.a.a.a.m(str, ".cacheResponse != null"));
            } else if (wVar.f6767j != null) {
                throw new IllegalArgumentException(b.e.a.a.a.m(str, ".priorResponse != null"));
            }
        }

        public b d(n nVar) {
            this.f = nVar.c();
            return this;
        }

        public b e(w wVar) {
            if (wVar == null || wVar.f6764g == null) {
                this.f6774j = wVar;
                return this;
            }
            throw new IllegalArgumentException("priorResponse.body != null");
        }
    }

    public w(b bVar, a aVar) {
        this.a = bVar.a;
        this.f6762b = bVar.f6769b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.f6763e = bVar.f6770e;
        this.f = bVar.f.c();
        this.f6764g = bVar.f6771g;
        this.f6765h = bVar.f6772h;
        this.f6766i = bVar.f6773i;
        this.f6767j = bVar.f6774j;
    }

    public c a() {
        c cVar = this.f6768k;
        if (cVar != null) {
            return cVar;
        }
        c a2 = c.a(this.f);
        this.f6768k = a2;
        return a2;
    }

    public List<g> b() {
        String str;
        int i2 = this.c;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else if (i2 != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        n nVar = this.f;
        Comparator<String> comparator = j.a;
        ArrayList arrayList = new ArrayList();
        int d2 = nVar.d();
        for (int i3 = 0; i3 < d2; i3++) {
            if (str.equalsIgnoreCase(nVar.b(i3))) {
                String e2 = nVar.e(i3);
                int i4 = 0;
                while (i4 < e2.length()) {
                    int m0 = g.m0(e2, i4, " ");
                    String trim = e2.substring(i4, m0).trim();
                    int n0 = g.n0(e2, m0);
                    if (!e2.regionMatches(true, n0, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i5 = n0 + 7;
                    int m02 = g.m0(e2, i5, "\"");
                    String substring = e2.substring(i5, m02);
                    i4 = g.n0(e2, g.m0(e2, m02 + 1, ",") + 1);
                    arrayList.add(new g(trim, substring));
                }
            }
        }
        return arrayList;
    }

    public b c() {
        return new b(this, (a) null);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Response{protocol=");
        y.append(this.f6762b);
        y.append(", code=");
        y.append(this.c);
        y.append(", message=");
        y.append(this.d);
        y.append(", url=");
        return b.e.a.a.a.p(y, this.a.a.f6728i, '}');
    }
}
