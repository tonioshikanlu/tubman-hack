package n;

import e.t.g;
import e.t.o;
import e.x.c.i;
import e.x.c.y;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.m0.m.c;
import o.h;

public final class h {
    public static final h c = new h(g.d0(new ArrayList()), (c) null, 2);
    public static final a d = new a((DefaultConstructorMarker) null);
    public final Set<b> a;

    /* renamed from: b  reason: collision with root package name */
    public final c f10099b;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final String a(Certificate certificate) {
            i.e(certificate, "certificate");
            return "sha256/" + b((X509Certificate) certificate).d();
        }

        public final o.h b(X509Certificate x509Certificate) {
            i.e(x509Certificate, "$this$sha256Hash");
            h.a aVar = o.h.f10456l;
            PublicKey publicKey = x509Certificate.getPublicKey();
            i.d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            i.d(encoded, "publicKey.encoded");
            return h.a.c(aVar, encoded, 0, 0, 3).h("SHA-256");
        }
    }

    public static final class b {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            Objects.requireNonNull(bVar);
            if (!i.a((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            if (!i.a((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            return !(i.a((Object) null, (Object) null) ^ true);
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append((String) null);
            sb.append('/');
            throw null;
        }
    }

    public h(Set<b> set, c cVar) {
        i.e(set, "pins");
        this.a = set;
        this.f10099b = cVar;
    }

    public h(Set set, c cVar, int i2) {
        int i3 = i2 & 2;
        i.e(set, "pins");
        this.a = set;
        this.f10099b = null;
    }

    public final void a(String str, e.x.b.a<? extends List<? extends X509Certificate>> aVar) {
        i.e(str, "hostname");
        i.e(aVar, "cleanedPeerCertificatesFn");
        i.e(str, "hostname");
        Set<b> set = this.a;
        List<b> list = o.f7934h;
        for (T next : set) {
            Objects.requireNonNull((b) next);
            i.e(str, "hostname");
            if (e.c0.h.C((String) null, "**.", false, 2)) {
                throw null;
            } else if (e.c0.h.C((String) null, "*.", false, 2)) {
                throw null;
            } else if (i.a(str, (Object) null)) {
                if (list.isEmpty()) {
                    list = new ArrayList<>();
                }
                if (!(list instanceof e.x.c.z.a) || (list instanceof e.x.c.z.b)) {
                    list.add(next);
                } else {
                    y.c(list, "kotlin.collections.MutableList");
                    throw null;
                }
            }
        }
        if (!list.isEmpty()) {
            List<X509Certificate> list2 = (List) aVar.e();
            for (X509Certificate x509Certificate : list2) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Objects.requireNonNull((b) it.next());
                    throw null;
                }
            }
            StringBuilder B = b.e.a.a.a.B("Certificate pinning failure!", "\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list2) {
                B.append("\n    ");
                i.e(x509Certificate2, "certificate");
                StringBuilder sb = new StringBuilder();
                sb.append("sha256/");
                i.e(x509Certificate2, "$this$sha256Hash");
                h.a aVar2 = o.h.f10456l;
                PublicKey publicKey = x509Certificate2.getPublicKey();
                i.d(publicKey, "publicKey");
                byte[] encoded = publicKey.getEncoded();
                i.d(encoded, "publicKey.encoded");
                sb.append(h.a.c(aVar2, encoded, 0, 0, 3).h("SHA-256").d());
                B.append(sb.toString());
                B.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                i.d(subjectDN, "element.subjectDN");
                B.append(subjectDN.getName());
            }
            B.append("\n  Pinned certificates for ");
            B.append(str);
            B.append(":");
            for (b append : list) {
                B.append("\n    ");
                B.append(append);
            }
            String sb2 = B.toString();
            i.d(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public final h b(c cVar) {
        i.e(cVar, "certificateChainCleaner");
        return i.a(this.f10099b, cVar) ? this : new h(this.a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return i.a(hVar.a, this.a) && i.a(hVar.f10099b, this.f10099b);
        }
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        c cVar = this.f10099b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
