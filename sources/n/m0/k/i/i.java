package n.m0.k.i;

import e.a.a.a.y0.m.o1.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n.d0;
import n.m0.k.d;
import n.m0.k.h;
import n.m0.k.i.j;
import org.conscrypt.Conscrypt;

public final class i implements k {
    public static final j.a a = new a();

    public static final class a implements j.a {
        public boolean a(SSLSocket sSLSocket) {
            e.x.c.i.e(sSLSocket, "sslSocket");
            d.a aVar = d.f;
            return d.f10382e && Conscrypt.isConscrypt(sSLSocket);
        }

        public k b(SSLSocket sSLSocket) {
            e.x.c.i.e(sSLSocket, "sslSocket");
            return new i();
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        e.x.c.i.e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        e.x.c.i.e(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        e.x.c.i.e(sSLSocketFactory, "sslSocketFactory");
        c.t0(sSLSocketFactory);
        return null;
    }

    public boolean d(SSLSocketFactory sSLSocketFactory) {
        e.x.c.i.e(sSLSocketFactory, "sslSocketFactory");
        c.V(sSLSocketFactory);
        return false;
    }

    public boolean e() {
        d.a aVar = d.f;
        return d.f10382e;
    }

    public void f(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        e.x.c.i.e(sSLSocket, "sslSocket");
        e.x.c.i.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) h.c.a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
