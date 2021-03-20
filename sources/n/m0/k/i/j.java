package n.m0.k.i;

import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n.d0;

public final class j implements k {
    public k a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10396b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        i.e(aVar, "socketAdapterFactory");
        this.f10396b = aVar;
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return this.f10396b.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        k g2 = g(sSLSocket);
        if (g2 != null) {
            return g2.b(sSLSocket);
        }
        return null;
    }

    public X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        c.t0(sSLSocketFactory);
        return null;
    }

    public boolean d(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        c.V(sSLSocketFactory);
        return false;
    }

    public boolean e() {
        return true;
    }

    public void f(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        k g2 = g(sSLSocket);
        if (g2 != null) {
            g2.f(sSLSocket, str, list);
        }
    }

    public final synchronized k g(SSLSocket sSLSocket) {
        if (this.a == null && this.f10396b.a(sSLSocket)) {
            this.a = this.f10396b.b(sSLSocket);
        }
        return this.a;
    }
}
