package n.m0.k.i;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n.d0;
import n.m0.k.h;

@SuppressLint({"NewApi"})
public final class a implements k {

    /* renamed from: n.m0.k.i.a$a  reason: collision with other inner class name */
    public static final class C0237a {
        public static final boolean a() {
            return h.c.c() && Build.VERSION.SDK_INT >= 29;
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @SuppressLint({"NewApi"})
    public String b(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
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
        return C0237a.a();
    }

    @SuppressLint({"NewApi"})
    public void f(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            i.d(sSLParameters, "sslParameters");
            Object[] array = ((ArrayList) h.c.a(list)).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}
