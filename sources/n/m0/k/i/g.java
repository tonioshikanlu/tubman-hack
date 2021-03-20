package n.m0.k.i;

import e.x.c.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n.d0;
import n.m0.k.c;
import n.m0.k.h;
import n.m0.k.i.j;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class g implements k {
    public static final j.a a = new a();

    public static final class a implements j.a {
        public boolean a(SSLSocket sSLSocket) {
            i.e(sSLSocket, "sslSocket");
            c.a aVar = c.f;
            return c.f10381e && (sSLSocket instanceof BCSSLSocket);
        }

        public k b(SSLSocket sSLSocket) {
            i.e(sSLSocket, "sslSocket");
            return new g();
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    public String b(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    public X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        e.a.a.a.y0.m.o1.c.t0(sSLSocketFactory);
        return null;
    }

    public boolean d(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        e.a.a.a.y0.m.o1.c.V(sSLSocketFactory);
        return false;
    }

    public boolean e() {
        c.a aVar = c.f;
        return c.f10381e;
    }

    public void f(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            i.d(parameters, "sslParameters");
            Object[] array = ((ArrayList) h.c.a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
