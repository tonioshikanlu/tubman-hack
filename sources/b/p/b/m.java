package b.p.b;

import b.p.b.a0.i;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class m {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Certificate> f6722b;
    public final List<Certificate> c;

    public m(String str, List<Certificate> list, List<Certificate> list2) {
        this.a = str;
        this.f6722b = list;
        this.c = list2;
    }

    public static m a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
                certificateArr = null;
            }
            List i2 = certificateArr != null ? i.i(certificateArr) : Collections.emptyList();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new m(cipherSuite, i2, localCertificates != null ? i.i(localCertificates) : Collections.emptyList());
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.a) && this.f6722b.equals(mVar.f6722b) && this.c.equals(mVar.c);
    }

    public int hashCode() {
        int hashCode = this.f6722b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }
}
