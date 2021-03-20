package n;

import e.c0.h;
import e.j;
import e.t.g;
import e.t.p;
import e.x.c.i;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import n.m0.c;
import n.m0.h.f;
import n.y;
import n.z;

public final class e0 {
    public e a;

    /* renamed from: b  reason: collision with root package name */
    public final z f10092b;
    public final String c;
    public final y d;

    /* renamed from: e  reason: collision with root package name */
    public final g0 f10093e;
    public final Map<Class<?>, Object> f;

    public static class a {
        public z a;

        /* renamed from: b  reason: collision with root package name */
        public String f10094b;
        public y.a c;
        public g0 d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f10095e;

        public a() {
            this.f10095e = new LinkedHashMap();
            this.f10094b = "GET";
            this.c = new y.a();
        }

        public a(e0 e0Var) {
            Map<Class<?>, Object> map;
            i.e(e0Var, "request");
            this.f10095e = new LinkedHashMap();
            this.a = e0Var.f10092b;
            this.f10094b = e0Var.c;
            this.d = e0Var.f10093e;
            if (e0Var.f.isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = g.b0(e0Var.f);
            }
            this.f10095e = map;
            this.c = e0Var.d.n();
        }

        public a a(String str, String str2) {
            i.e(str, "name");
            i.e(str2, "value");
            y.a aVar = this.c;
            Objects.requireNonNull(aVar);
            i.e(str, "name");
            i.e(str2, "value");
            y.b bVar = y.f10426i;
            bVar.a(str);
            bVar.b(str2, str);
            aVar.a(str, str2);
            return this;
        }

        public e0 b() {
            Map map;
            z zVar = this.a;
            if (zVar != null) {
                String str = this.f10094b;
                y b2 = this.c.b();
                g0 g0Var = this.d;
                Map<Class<?>, Object> map2 = this.f10095e;
                byte[] bArr = c.a;
                i.e(map2, "$this$toImmutableMap");
                if (map2.isEmpty()) {
                    map = p.f7935h;
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(map2));
                    i.d(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                return new e0(zVar, str, b2, g0Var, map);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a c(String str, String str2) {
            i.e(str, "name");
            i.e(str2, "value");
            y.a aVar = this.c;
            Objects.requireNonNull(aVar);
            i.e(str, "name");
            i.e(str2, "value");
            y.b bVar = y.f10426i;
            bVar.a(str);
            bVar.b(str2, str);
            aVar.c(str);
            aVar.a(str, str2);
            return this;
        }

        public a d(String str, g0 g0Var) {
            i.e(str, "method");
            boolean z = true;
            if (str.length() > 0) {
                if (g0Var == null) {
                    i.e(str, "method");
                    if (!i.a(str, "POST") && !i.a(str, "PUT") && !i.a(str, "PATCH") && !i.a(str, "PROPPATCH") && !i.a(str, "REPORT")) {
                        z = false;
                    }
                    if (!(!z)) {
                        throw new IllegalArgumentException(b.e.a.a.a.n("method ", str, " must have a request body.").toString());
                    }
                } else if (!f.a(str)) {
                    throw new IllegalArgumentException(b.e.a.a.a.n("method ", str, " must not have a request body.").toString());
                }
                this.f10094b = str;
                this.d = g0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public a e(g0 g0Var) {
            i.e(g0Var, "body");
            d("POST", g0Var);
            return this;
        }

        public a f(String str) {
            i.e(str, "name");
            this.c.c(str);
            return this;
        }

        public a g(String str) {
            int i2;
            StringBuilder sb;
            i.e(str, "url");
            if (h.A(str, "ws:", true)) {
                sb = b.e.a.a.a.y("http:");
                i2 = 3;
            } else {
                if (h.A(str, "wss:", true)) {
                    sb = b.e.a.a.a.y("https:");
                    i2 = 4;
                }
                i.e(str, "$this$toHttpUrl");
                z.a aVar = new z.a();
                aVar.e((z) null, str);
                h(aVar.b());
                return this;
            }
            String substring = str.substring(i2);
            i.d(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            str = sb.toString();
            i.e(str, "$this$toHttpUrl");
            z.a aVar2 = new z.a();
            aVar2.e((z) null, str);
            h(aVar2.b());
            return this;
        }

        public a h(z zVar) {
            i.e(zVar, "url");
            this.a = zVar;
            return this;
        }
    }

    public e0(z zVar, String str, y yVar, g0 g0Var, Map<Class<?>, ? extends Object> map) {
        i.e(zVar, "url");
        i.e(str, "method");
        i.e(yVar, "headers");
        i.e(map, "tags");
        this.f10092b = zVar;
        this.c = str;
        this.d = yVar;
        this.f10093e = g0Var;
        this.f = map;
    }

    public final e a() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar;
        }
        e b2 = e.f10082n.b(this.d);
        this.a = b2;
        return b2;
    }

    public final String b(String str) {
        i.e(str, "name");
        return this.d.d(str);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Request{method=");
        y.append(this.c);
        y.append(", url=");
        y.append(this.f10092b);
        if (this.d.size() != 0) {
            y.append(", headers=[");
            int i2 = 0;
            for (Object next : this.d) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    j jVar = (j) next;
                    String str = (String) jVar.f7906h;
                    String str2 = (String) jVar.f7907i;
                    if (i2 > 0) {
                        y.append(", ");
                    }
                    y.append(str);
                    y.append(':');
                    y.append(str2);
                    i2 = i3;
                } else {
                    g.S();
                    throw null;
                }
            }
            y.append(']');
        }
        if (!this.f.isEmpty()) {
            y.append(", tags=");
            y.append(this.f);
        }
        y.append('}');
        String sb = y.toString();
        i.d(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
