package n.m0.m;

import e.t.o;
import e.x.c.i;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class d implements HostnameVerifier {
    public static final d a = new d();

    public final List<String> a(X509Certificate x509Certificate, int i2) {
        o oVar = o.f7934h;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List next : subjectAlternativeNames) {
                    if (next != null) {
                        if (next.size() >= 2) {
                            if (!(!i.a(next.get(0), Integer.valueOf(i2)))) {
                                Object obj = next.get(1);
                                if (obj != null) {
                                    arrayList.add((String) obj);
                                }
                            }
                        }
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.String r13, java.security.cert.X509Certificate r14) {
        /*
            r12 = this;
            java.lang.String r0 = "host"
            e.x.c.i.e(r13, r0)
            java.lang.String r0 = "certificate"
            e.x.c.i.e(r14, r0)
            byte[] r0 = n.m0.c.a
            java.lang.String r0 = "$this$canParseAsIpAddress"
            e.x.c.i.e(r13, r0)
            e.c0.d r0 = n.m0.c.f
            boolean r0 = r0.a(r13)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0048
            java.lang.String r13 = e.a.a.a.y0.m.o1.c.o0(r13)
            r0 = 7
            java.util.List r14 = r12.a(r14, r0)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x002c
            goto L_0x0133
        L_0x002c:
            java.util.Iterator r14 = r14.iterator()
        L_0x0030:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r14.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = e.a.a.a.y0.m.o1.c.o0(r0)
            boolean r0 = e.x.c.i.a(r13, r0)
            if (r0 == 0) goto L_0x0030
            goto L_0x0132
        L_0x0048:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Locale.US"
            e.x.c.i.d(r0, r3)
            java.lang.String r13 = r13.toLowerCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            e.x.c.i.d(r13, r0)
            r4 = 2
            java.util.List r14 = r12.a(r14, r4)
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L_0x0065
            goto L_0x0133
        L_0x0065:
            java.util.Iterator r14 = r14.iterator()
        L_0x0069:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0133
            java.lang.Object r5 = r14.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r13.length()
            if (r6 != 0) goto L_0x007d
            r6 = r2
            goto L_0x007e
        L_0x007d:
            r6 = r1
        L_0x007e:
            if (r6 != 0) goto L_0x012f
            java.lang.String r6 = "."
            boolean r7 = e.c0.h.C(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x012f
            java.lang.String r7 = ".."
            boolean r8 = e.c0.h.e(r13, r7, r1, r4)
            if (r8 == 0) goto L_0x0092
            goto L_0x012f
        L_0x0092:
            if (r5 == 0) goto L_0x009d
            int r8 = r5.length()
            if (r8 != 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r8 = r1
            goto L_0x009e
        L_0x009d:
            r8 = r2
        L_0x009e:
            if (r8 != 0) goto L_0x012f
            boolean r8 = e.c0.h.C(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x012f
            boolean r7 = e.c0.h.e(r5, r7, r1, r4)
            if (r7 == 0) goto L_0x00ae
            goto L_0x012f
        L_0x00ae:
            boolean r7 = e.c0.h.e(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = b.e.a.a.a.m(r13, r6)
            goto L_0x00ba
        L_0x00b9:
            r7 = r13
        L_0x00ba:
            boolean r8 = e.c0.h.e(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x00c4
            java.lang.String r5 = b.e.a.a.a.m(r5, r6)
        L_0x00c4:
            java.util.Locale r6 = java.util.Locale.US
            e.x.c.i.d(r6, r3)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r8)
            java.lang.String r5 = r5.toLowerCase(r6)
            e.x.c.i.d(r5, r0)
            java.lang.String r6 = "*"
            boolean r6 = e.c0.h.d(r5, r6, r1, r4)
            if (r6 != 0) goto L_0x00e2
            boolean r5 = e.x.c.i.a(r7, r5)
            goto L_0x0130
        L_0x00e2:
            java.lang.String r6 = "*."
            boolean r8 = e.c0.h.C(r5, r6, r1, r4)
            if (r8 == 0) goto L_0x012f
            r8 = 42
            r9 = 4
            int r8 = e.c0.h.k(r5, r8, r2, r1, r9)
            r10 = -1
            if (r8 == r10) goto L_0x00f5
            goto L_0x012f
        L_0x00f5:
            int r8 = r7.length()
            int r11 = r5.length()
            if (r8 >= r11) goto L_0x0100
            goto L_0x012f
        L_0x0100:
            boolean r6 = e.x.c.i.a(r6, r5)
            if (r6 == 0) goto L_0x0107
            goto L_0x012f
        L_0x0107:
            java.lang.String r5 = r5.substring(r2)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            e.x.c.i.d(r5, r6)
            boolean r6 = e.c0.h.e(r7, r5, r1, r4)
            if (r6 != 0) goto L_0x0117
            goto L_0x012f
        L_0x0117:
            int r6 = r7.length()
            int r5 = r5.length()
            int r6 = r6 - r5
            if (r6 <= 0) goto L_0x012d
            r5 = 46
            int r6 = r6 + -1
            int r5 = e.c0.h.o(r7, r5, r6, r1, r9)
            if (r5 == r10) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r5 = r2
            goto L_0x0130
        L_0x012f:
            r5 = r1
        L_0x0130:
            if (r5 == 0) goto L_0x0069
        L_0x0132:
            r1 = r2
        L_0x0133:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.m.d.b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public boolean verify(String str, SSLSession sSLSession) {
        i.e(str, "host");
        i.e(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return b(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
