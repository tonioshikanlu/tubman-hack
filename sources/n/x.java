package n;

import e.f;
import e.t.o;
import e.x.c.i;
import e.x.c.k;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class x {
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final l0 f10424b;
    public final k c;
    public final List<Certificate> d;

    public static final class a extends k implements e.x.b.a<List<? extends Certificate>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e.x.b.a f10425h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e.x.b.a aVar) {
            super(0);
            this.f10425h = aVar;
        }

        public Object e() {
            try {
                return (List) this.f10425h.e();
            } catch (SSLPeerUnverifiedException unused) {
                return o.f7934h;
            }
        }
    }

    public x(l0 l0Var, k kVar, List<? extends Certificate> list, e.x.b.a<? extends List<? extends Certificate>> aVar) {
        i.e(l0Var, "tlsVersion");
        i.e(kVar, "cipherSuite");
        i.e(list, "localCertificates");
        i.e(aVar, "peerCertificatesFn");
        this.f10424b = l0Var;
        this.c = kVar;
        this.d = list;
        this.a = b.q.a.a.h2(new a(aVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final n.x a(javax.net.ssl.SSLSession r5) {
        /*
            e.t.o r0 = e.t.o.f7934h
            java.lang.String r1 = "$this$handshake"
            e.x.c.i.e(r5, r1)
            java.lang.String r1 = r5.getCipherSuite()
            if (r1 == 0) goto L_0x0096
            int r2 = r1.hashCode()
            r3 = 1019404634(0x3cc2e15a, float:0.023789097)
            if (r2 == r3) goto L_0x0025
            r3 = 1208658923(0x480aabeb, float:141999.67)
            if (r2 == r3) goto L_0x001c
            goto L_0x002d
        L_0x001c:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x008a
            goto L_0x002d
        L_0x0025:
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x008a
        L_0x002d:
            n.k$b r2 = n.k.t
            n.k r1 = r2.b(r1)
            java.lang.String r2 = r5.getProtocol()
            if (r2 == 0) goto L_0x007e
            java.lang.String r3 = "NONE"
            boolean r3 = e.x.c.i.a(r3, r2)
            if (r3 != 0) goto L_0x0076
            n.l0$a r3 = n.l0.f10147o
            n.l0 r2 = r3.a(r2)
            java.security.cert.Certificate[] r3 = r5.getPeerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0059 }
            if (r3 == 0) goto L_0x0059
            int r4 = r3.length     // Catch:{ SSLPeerUnverifiedException -> 0x0059 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ SSLPeerUnverifiedException -> 0x0059 }
            java.security.cert.Certificate[] r3 = (java.security.cert.Certificate[]) r3     // Catch:{ SSLPeerUnverifiedException -> 0x0059 }
            java.util.List r3 = n.m0.c.l(r3)     // Catch:{ SSLPeerUnverifiedException -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r3 = r0
        L_0x005a:
            n.x r4 = new n.x
            java.security.cert.Certificate[] r5 = r5.getLocalCertificates()
            if (r5 == 0) goto L_0x006d
            int r0 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            java.security.cert.Certificate[] r5 = (java.security.cert.Certificate[]) r5
            java.util.List r0 = n.m0.c.l(r5)
        L_0x006d:
            n.w r5 = new n.w
            r5.<init>(r3)
            r4.<init>(r2, r1, r0, r5)
            return r4
        L_0x0076:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r5.<init>(r0)
            throw r5
        L_0x007e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x008a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = b.e.a.a.a.m(r0, r1)
            r5.<init>(r0)
            throw r5
        L_0x0096:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n.x.a(javax.net.ssl.SSLSession):n.x");
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        i.d(type, "type");
        return type;
    }

    public final List<Certificate> c() {
        return (List) this.a.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            return xVar.f10424b == this.f10424b && i.a(xVar.c, this.c) && i.a(xVar.c(), c()) && i.a(xVar.d, this.d);
        }
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = c().hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.f10424b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        List<Certificate> c2 = c();
        ArrayList arrayList = new ArrayList(b.q.a.a.C(c2, 10));
        for (Certificate b2 : c2) {
            arrayList.add(b(b2));
        }
        String obj = arrayList.toString();
        StringBuilder B = b.e.a.a.a.B("Handshake{", "tlsVersion=");
        B.append(this.f10424b);
        B.append(' ');
        B.append("cipherSuite=");
        B.append(this.c);
        B.append(' ');
        B.append("peerCertificates=");
        B.append(obj);
        B.append(' ');
        B.append("localCertificates=");
        List<Certificate> list = this.d;
        ArrayList arrayList2 = new ArrayList(b.q.a.a.C(list, 10));
        for (Certificate b3 : list) {
            arrayList2.add(b(b3));
        }
        B.append(arrayList2);
        B.append('}');
        return B.toString();
    }
}
