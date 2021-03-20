package n.m0.k.i;

import e.x.c.i;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.m0.c;

public final class l extends f {

    /* renamed from: j  reason: collision with root package name */
    public static final a f10397j = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public final Class<? super SSLSocketFactory> f10398h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f10399i;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        i.e(cls, "sslSocketClass");
        i.e(cls2, "sslSocketFactoryClass");
        i.e(cls3, "paramClass");
        this.f10398h = cls2;
        this.f10399i = cls3;
    }

    public X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        Object s = c.s(sSLSocketFactory, this.f10399i, "sslParameters");
        i.c(s);
        X509TrustManager x509TrustManager = (X509TrustManager) c.s(s, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) c.s(s, X509TrustManager.class, "trustManager");
    }

    public boolean d(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        return this.f10398h.isInstance(sSLSocketFactory);
    }
}
