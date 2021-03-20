package b.p.b;

import b.p.b.a0.i;
import b.p.b.o;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class a {
    public final o a;

    /* renamed from: b  reason: collision with root package name */
    public final l f6463b;
    public final SocketFactory c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final List<s> f6464e;
    public final List<j> f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f6465g;

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f6466h;

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f6467i;

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f6468j;

    /* renamed from: k  reason: collision with root package name */
    public final f f6469k;

    public a(String str, int i2, l lVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<s> list, List<j> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i3 = i2;
        l lVar2 = lVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        b bVar2 = bVar;
        ProxySelector proxySelector2 = proxySelector;
        o.b bVar3 = new o.b();
        String str3 = "https";
        String str4 = sSLSocketFactory2 != null ? str3 : "http";
        if (str4.equalsIgnoreCase("http")) {
            str3 = "http";
        } else if (!str4.equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException(b.e.a.a.a.m("unexpected scheme: ", str4));
        }
        bVar3.a = str3;
        if (str2 != null) {
            String d2 = o.b.d(str, 0, str.length());
            if (d2 != null) {
                bVar3.d = d2;
                if (i3 <= 0 || i3 > 65535) {
                    throw new IllegalArgumentException(b.e.a.a.a.g("unexpected port: ", i2));
                }
                bVar3.f6730e = i3;
                this.a = bVar3.c();
                if (lVar2 != null) {
                    this.f6463b = lVar2;
                    if (socketFactory2 != null) {
                        this.c = socketFactory2;
                        if (bVar2 != null) {
                            this.d = bVar2;
                            if (list != null) {
                                this.f6464e = i.h(list);
                                if (list2 != null) {
                                    this.f = i.h(list2);
                                    if (proxySelector2 != null) {
                                        this.f6465g = proxySelector2;
                                        this.f6466h = proxy;
                                        this.f6467i = sSLSocketFactory2;
                                        this.f6468j = hostnameVerifier;
                                        this.f6469k = fVar;
                                        return;
                                    }
                                    throw new IllegalArgumentException("proxySelector == null");
                                }
                                throw new IllegalArgumentException("connectionSpecs == null");
                            }
                            throw new IllegalArgumentException("protocols == null");
                        }
                        throw new IllegalArgumentException("authenticator == null");
                    }
                    throw new IllegalArgumentException("socketFactory == null");
                }
                throw new IllegalArgumentException("dns == null");
            }
            throw new IllegalArgumentException(b.e.a.a.a.m("unexpected host: ", str));
        }
        throw new IllegalArgumentException("host == null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.f6463b.equals(aVar.f6463b) && this.d.equals(aVar.d) && this.f6464e.equals(aVar.f6464e) && this.f.equals(aVar.f) && this.f6465g.equals(aVar.f6465g) && i.f(this.f6466h, aVar.f6466h) && i.f(this.f6467i, aVar.f6467i) && i.f(this.f6468j, aVar.f6468j) && i.f(this.f6469k, aVar.f6469k);
    }

    public int hashCode() {
        int hashCode = this.f6463b.hashCode();
        int hashCode2 = (this.f6465g.hashCode() + ((this.f.hashCode() + ((this.f6464e.hashCode() + ((this.d.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f6466h;
        int i2 = 0;
        int hashCode3 = (hashCode2 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f6467i;
        int hashCode4 = (hashCode3 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f6468j;
        int hashCode5 = (hashCode4 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f6469k;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode5 + i2;
    }
}
