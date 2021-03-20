package b.p.b;

import b.p.b.a0.i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.h;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final f f6700b = new f(new b(), (a) null);
    public final Map<String, Set<h>> a;

    public static final class b {
        public final Map<String, Set<h>> a = new LinkedHashMap();
    }

    public f(b bVar, a aVar) {
        Map<String, Set<h>> map = bVar.a;
        byte[] bArr = i.a;
        this.a = Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder y = b.e.a.a.a.y("sha1/");
            y.append(c((X509Certificate) certificate).d());
            return y.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public static h c(X509Certificate x509Certificate) {
        h t = h.t(x509Certificate.getPublicKey().getEncoded());
        byte[] bArr = i.a;
        try {
            return h.t(MessageDigest.getInstance("SHA-1").digest(t.x()));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public void a(String str, List<Certificate> list) {
        Set set;
        Set<h> set2 = this.a.get(str);
        int indexOf = str.indexOf(46);
        if (indexOf != str.lastIndexOf(46)) {
            Map<String, Set<h>> map = this.a;
            StringBuilder y = b.e.a.a.a.y("*.");
            y.append(str.substring(indexOf + 1));
            set = map.get(y.toString());
        } else {
            set = null;
        }
        if (set2 == null && set == null) {
            set2 = null;
        } else if (set2 != null && set != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set2);
            linkedHashSet.addAll(set);
            set2 = linkedHashSet;
        } else if (set2 == null) {
            set2 = set;
        }
        if (set2 != null) {
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                if (!set2.contains(c((X509Certificate) list.get(i2)))) {
                    i2++;
                } else {
                    return;
                }
            }
            StringBuilder B = b.e.a.a.a.B("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i3);
                B.append("\n    ");
                B.append(b(x509Certificate));
                B.append(": ");
                B.append(x509Certificate.getSubjectDN().getName());
            }
            B.append("\n  Pinned certificates for ");
            B.append(str);
            B.append(":");
            for (h d : set2) {
                B.append("\n    sha1/");
                B.append(d.d());
            }
            throw new SSLPeerUnverifiedException(B.toString());
        }
    }
}
