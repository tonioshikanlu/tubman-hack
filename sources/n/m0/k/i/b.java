package n.m0.k.i;

import android.net.http.X509TrustManagerExtensions;
import e.x.c.i;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import n.m0.m.c;

public final class b extends c {
    public final X509TrustManager a;

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManagerExtensions f10390b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        i.e(x509TrustManager, "trustManager");
        i.e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.a = x509TrustManager;
        this.f10390b = x509TrustManagerExtensions;
    }

    public List<Certificate> a(List<? extends Certificate> list, String str) {
        i.e(list, "chain");
        i.e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f10390b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            i.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).a == this.a;
    }

    public int hashCode() {
        return System.identityHashCode(this.a);
    }
}
