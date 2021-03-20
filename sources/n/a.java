package n;

import e.a.a.a.y0.m.o1.c;
import e.c0.h;
import e.x.c.i;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import n.z;

public final class a {
    public final z a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d0> f10041b;
    public final List<n> c;
    public final t d;

    /* renamed from: e  reason: collision with root package name */
    public final SocketFactory f10042e;
    public final SSLSocketFactory f;

    /* renamed from: g  reason: collision with root package name */
    public final HostnameVerifier f10043g;

    /* renamed from: h  reason: collision with root package name */
    public final h f10044h;

    /* renamed from: i  reason: collision with root package name */
    public final c f10045i;

    /* renamed from: j  reason: collision with root package name */
    public final Proxy f10046j = null;

    /* renamed from: k  reason: collision with root package name */
    public final ProxySelector f10047k;

    public a(String str, int i2, t tVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, h hVar, c cVar, Proxy proxy, List<? extends d0> list, List<n> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i3 = i2;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        c cVar2 = cVar;
        ProxySelector proxySelector2 = proxySelector;
        i.e(str, "uriHost");
        i.e(tVar, "dns");
        i.e(socketFactory2, "socketFactory");
        i.e(cVar2, "proxyAuthenticator");
        i.e(list, "protocols");
        i.e(list2, "connectionSpecs");
        i.e(proxySelector2, "proxySelector");
        this.d = tVar;
        this.f10042e = socketFactory2;
        this.f = sSLSocketFactory2;
        this.f10043g = hostnameVerifier;
        this.f10044h = hVar;
        this.f10045i = cVar2;
        this.f10047k = proxySelector2;
        z.a aVar = new z.a();
        String str3 = "https";
        String str4 = sSLSocketFactory2 != null ? str3 : "http";
        i.e(str4, "scheme");
        boolean z = true;
        if (h.f(str4, "http", true)) {
            str3 = "http";
        } else if (!h.f(str4, str3, true)) {
            throw new IllegalArgumentException(b.e.a.a.a.m("unexpected scheme: ", str4));
        }
        aVar.a = str3;
        i.e(str, "host");
        String o0 = c.o0(z.b.d(z.f10429l, str, 0, 0, false, 7));
        if (o0 != null) {
            aVar.d = o0;
            if ((1 > i3 || 65535 < i3) ? false : z) {
                aVar.f10438e = i3;
                this.a = aVar.b();
                this.f10041b = n.m0.c.y(list);
                this.c = n.m0.c.y(list2);
                return;
            }
            throw new IllegalArgumentException(b.e.a.a.a.g("unexpected port: ", i2).toString());
        }
        throw new IllegalArgumentException(b.e.a.a.a.m("unexpected host: ", str));
    }

    public final boolean a(a aVar) {
        i.e(aVar, "that");
        return i.a(this.d, aVar.d) && i.a(this.f10045i, aVar.f10045i) && i.a(this.f10041b, aVar.f10041b) && i.a(this.c, aVar.c) && i.a(this.f10047k, aVar.f10047k) && i.a(this.f10046j, aVar.f10046j) && i.a(this.f, aVar.f) && i.a(this.f10043g, aVar.f10043g) && i.a(this.f10044h, aVar.f10044h) && this.a.f == aVar.a.f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && a(aVar);
        }
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.f10045i.hashCode();
        int hashCode3 = this.f10041b.hashCode();
        int hashCode4 = this.c.hashCode();
        int hashCode5 = this.f10047k.hashCode();
        int hashCode6 = Objects.hashCode(this.f10046j);
        int hashCode7 = Objects.hashCode(this.f);
        int hashCode8 = Objects.hashCode(this.f10043g);
        return Objects.hashCode(this.f10044h) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder y = b.e.a.a.a.y("Address{");
        y.append(this.a.f10431e);
        y.append(':');
        y.append(this.a.f);
        y.append(", ");
        if (this.f10046j != null) {
            sb = b.e.a.a.a.y("proxy=");
            obj = this.f10046j;
        } else {
            sb = b.e.a.a.a.y("proxySelector=");
            obj = this.f10047k;
        }
        sb.append(obj);
        y.append(sb.toString());
        y.append("}");
        return y.toString();
    }
}
