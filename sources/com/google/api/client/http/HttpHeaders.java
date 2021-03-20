package com.google.api.client.http;

import b.l.b.a.b.l;
import b.l.b.a.d.b;
import b.l.b.a.d.e;
import b.l.b.a.d.g;
import b.l.b.a.d.j;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import b.l.b.a.d.w;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HttpHeaders extends k {
    @n("Accept")
    private List<String> accept;
    @n("Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @n("Age")
    private List<Long> age;
    @n("WWW-Authenticate")
    private List<String> authenticate;
    @n("Authorization")
    private List<String> authorization;
    @n("Cache-Control")
    private List<String> cacheControl;
    @n("Content-Encoding")
    private List<String> contentEncoding;
    @n("Content-Length")
    private List<Long> contentLength;
    @n("Content-MD5")
    private List<String> contentMD5;
    @n("Content-Range")
    private List<String> contentRange;
    @n("Content-Type")
    private List<String> contentType;
    @n("Cookie")
    private List<String> cookie;
    @n("Date")
    private List<String> date;
    @n("ETag")
    private List<String> etag;
    @n("Expires")
    private List<String> expires;
    @n("If-Match")
    private List<String> ifMatch;
    @n("If-Modified-Since")
    private List<String> ifModifiedSince;
    @n("If-None-Match")
    private List<String> ifNoneMatch;
    @n("If-Range")
    private List<String> ifRange;
    @n("If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @n("Last-Modified")
    private List<String> lastModified;
    @n("Location")
    private List<String> location;
    @n("MIME-Version")
    private List<String> mimeVersion;
    @n("Range")
    private List<String> range;
    @n("Retry-After")
    private List<String> retryAfter;
    @n("User-Agent")
    private List<String> userAgent;
    @n("Warning")
    private List<String> warning;

    public static final class a {
        public final b a;

        /* renamed from: b  reason: collision with root package name */
        public final StringBuilder f7329b;
        public final e c;
        public final List<Type> d;

        public a(HttpHeaders httpHeaders, StringBuilder sb) {
            Class<?> cls = httpHeaders.getClass();
            this.d = Arrays.asList(new Type[]{cls});
            this.c = e.c(cls, true);
            this.f7329b = sb;
            this.a = new b(httpHeaders);
        }
    }

    public HttpHeaders() {
        super(EnumSet.of(k.c.IGNORE_CASE));
    }

    public static void a(Logger logger, StringBuilder sb, StringBuilder sb2, b.l.b.a.b.k kVar, String str, Object obj, Writer writer) {
        String str2;
        if (obj != null && !g.c(obj)) {
            if (obj instanceof Enum) {
                str2 = j.c((Enum) obj).d;
            } else {
                str2 = obj.toString();
            }
            String str3 = (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : str2;
            if (sb != null) {
                sb.append(str);
                sb.append(": ");
                sb.append(str3);
                sb.append(w.a);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str3);
                sb2.append("'");
            }
            if (kVar != null) {
                kVar.a(str, str2);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(": ");
                writer.write(str2);
                writer.write("\r\n");
            }
        }
    }

    public static Object k(Type type, List<Type> list, String str) {
        return g.i(g.j(list, type), str);
    }

    public final void b(l lVar, StringBuilder sb) {
        clear();
        a aVar = new a(this, sb);
        int f = lVar.f();
        for (int i2 = 0; i2 < f; i2++) {
            String g2 = lVar.g(i2);
            String h2 = lVar.h(i2);
            List<Type> list = aVar.d;
            e eVar = aVar.c;
            b bVar = aVar.a;
            StringBuilder sb2 = aVar.f7329b;
            if (sb2 != null) {
                sb2.append(g2 + ": " + h2);
                sb2.append(w.a);
            }
            j a2 = eVar.a(g2);
            if (a2 != null) {
                Type j2 = g.j(list, a2.a());
                if (b.l.b.a.d.l.j(j2)) {
                    Class<?> f2 = b.l.b.a.d.l.f(list, b.l.b.a.d.l.c(j2));
                    bVar.a(a2.f4812b, f2, k(f2, list, h2));
                } else if (b.l.b.a.d.l.k(b.l.b.a.d.l.f(list, j2), Iterable.class)) {
                    Collection<Object> collection = (Collection) a2.b(this);
                    if (collection == null) {
                        collection = g.f(j2);
                        a2.f(this, collection);
                    }
                    collection.add(k(j2 == Object.class ? null : b.l.b.a.d.l.e(j2), list, h2));
                } else {
                    a2.f(this, k(j2, list, h2));
                }
            } else {
                ArrayList arrayList = (ArrayList) get(g2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    super.set(g2, arrayList);
                }
                arrayList.add(h2);
            }
        }
        aVar.a.b();
    }

    public final <T> List<T> c(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    public k clone() {
        return (HttpHeaders) super.clone();
    }

    public final List<String> d() {
        return this.authenticate;
    }

    public final List<String> f() {
        return this.authorization;
    }

    public final String g() {
        return (String) h(this.contentType);
    }

    public final <T> T h(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    public final String i() {
        return (String) h(this.location);
    }

    public final String j() {
        return (String) h(this.userAgent);
    }

    public HttpHeaders m(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    public HttpHeaders n(String str) {
        this.accept = c(str);
        return this;
    }

    public HttpHeaders o(String str) {
        this.authorization = c(str);
        return this;
    }

    public HttpHeaders p(String str) {
        this.ifMatch = c((Object) null);
        return this;
    }

    public HttpHeaders q(String str) {
        this.ifModifiedSince = c((Object) null);
        return this;
    }

    public HttpHeaders r(String str) {
        this.ifNoneMatch = c((Object) null);
        return this;
    }

    public HttpHeaders s(String str) {
        this.ifRange = c((Object) null);
        return this;
    }

    public k set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    public HttpHeaders t(String str) {
        this.ifUnmodifiedSince = c((Object) null);
        return this;
    }

    public HttpHeaders u(String str) {
        this.userAgent = c(str);
        return this;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public Object m16clone() {
        return (HttpHeaders) super.clone();
    }
}
