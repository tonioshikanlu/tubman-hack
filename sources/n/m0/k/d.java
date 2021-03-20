package n.m0.k;

import e.x.c.i;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.d0;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

public final class d extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10382e;
    public static final a f;
    public final Provider d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean a(int i2, int i3, int i4) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i2 ? version.major() > i2 : version.minor() != i3 ? version.minor() > i3 : version.patch() >= i4;
        }
    }

    public static final class b implements ConscryptHostnameVerifier {
        public static final b a = new b();
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f10382e = z;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        i.d(newProvider, "Conscrypt.newProvider()");
        this.d = newProvider;
    }

    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            i.e(list, "protocols");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((d0) next) != d0.HTTP_1_0) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(b.q.a.a.C(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((d0) it2.next()).f10081h);
            }
            Object[] array = arrayList2.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.d(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        super.f(sSLSocket);
        return null;
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.d);
        i.d(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        SSLContext instance = SSLContext.getInstance("TLS", this.d);
        i.d(instance, "SSLContext.getInstance(\"TLS\", provider)");
        instance.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = instance.getSocketFactory();
        i.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        i.d(instance, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = instance.getTrustManagers();
        i.c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.a);
            return x509TrustManager;
        }
        StringBuilder y = b.e.a.a.a.y("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        i.d(arrays, "java.util.Arrays.toString(this)");
        y.append(arrays);
        throw new IllegalStateException(y.toString().toString());
    }

    public X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        return null;
    }
}
