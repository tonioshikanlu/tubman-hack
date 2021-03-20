package b.p.b.a0.m;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class a implements f {
    public final X509TrustManager a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f6681b;

    public a(X509TrustManager x509TrustManager, Method method) {
        this.f6681b = method;
        this.a = x509TrustManager;
    }

    public X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f6681b.invoke(this.a, new Object[]{x509Certificate});
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            return null;
        }
    }
}
