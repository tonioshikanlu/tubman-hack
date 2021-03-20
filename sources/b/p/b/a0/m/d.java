package b.p.b.a0.m;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class d implements HostnameVerifier {
    public static final d a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f6685b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> b2 = b(x509Certificate, 7);
        List<String> b3 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b3.size() + b2.size());
        arrayList.addAll(b2);
        arrayList.addAll(b3);
        return arrayList;
    }

    public static List<String> b(X509Certificate x509Certificate, int i2) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i2 && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0121, code lost:
        r1 = r3.f6684g;
        r4 = r3.d;
        r0 = new java.lang.String(r1, r4, r3.f - r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b4, code lost:
        throw new java.lang.IllegalStateException(r15.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(java.lang.String r14, java.security.cert.X509Certificate r15) {
        /*
            r13 = this;
            java.util.regex.Pattern r0 = f6685b
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r0 = r0.matches()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002a
            r0 = 7
            java.util.List r15 = b(r15, r0)
            int r0 = r15.size()
            r3 = r1
        L_0x0018:
            if (r3 >= r0) goto L_0x0281
            java.lang.Object r4 = r15.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r14.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0027
            goto L_0x0049
        L_0x0027:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x002a:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r14 = r14.toLowerCase(r0)
            r0 = 2
            java.util.List r3 = b(r15, r0)
            int r4 = r3.size()
            r5 = r1
            r6 = r5
        L_0x003b:
            if (r5 >= r4) goto L_0x0050
            java.lang.Object r6 = r3.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r13.d(r14, r6)
            if (r6 == 0) goto L_0x004c
        L_0x0049:
            r1 = r2
            goto L_0x0281
        L_0x004c:
            int r5 = r5 + 1
            r6 = r2
            goto L_0x003b
        L_0x0050:
            if (r6 != 0) goto L_0x0280
            javax.security.auth.x500.X500Principal r15 = r15.getSubjectX500Principal()
            b.p.b.a0.m.c r3 = new b.p.b.a0.m.c
            r3.<init>(r15)
            r3.c = r1
            r3.d = r1
            r3.f6683e = r1
            r3.f = r1
            java.lang.String r15 = r3.a
            char[] r15 = r15.toCharArray()
            r3.f6684g = r15
            java.lang.String r15 = r3.c()
            if (r15 != 0) goto L_0x0073
            goto L_0x0205
        L_0x0073:
            int r1 = r3.c
            int r4 = r3.f6682b
            if (r1 != r4) goto L_0x007b
            goto L_0x0205
        L_0x007b:
            char[] r5 = r3.f6684g
            char r5 = r5[r1]
            r6 = 92
            java.lang.String r7 = "Unexpected end of DN: "
            r8 = 34
            r9 = 32
            r10 = 59
            r11 = 44
            r12 = 43
            if (r5 == r8) goto L_0x01c8
            r8 = 35
            if (r5 == r8) goto L_0x0133
            if (r5 == r12) goto L_0x012f
            if (r5 == r11) goto L_0x012f
            if (r5 == r10) goto L_0x012f
            r3.d = r1
            r3.f6683e = r1
        L_0x009d:
            int r0 = r3.c
            int r1 = r3.f6682b
            if (r0 < r1) goto L_0x00b1
            java.lang.String r0 = new java.lang.String
            char[] r1 = r3.f6684g
            int r4 = r3.d
            int r5 = r3.f6683e
            int r5 = r5 - r4
            r0.<init>(r1, r4, r5)
            goto L_0x01f6
        L_0x00b1:
            char[] r1 = r3.f6684g
            char r4 = r1[r0]
            if (r4 == r9) goto L_0x00ea
            if (r4 == r10) goto L_0x00dc
            if (r4 == r6) goto L_0x00ca
            if (r4 == r12) goto L_0x00dc
            if (r4 == r11) goto L_0x00dc
            int r4 = r3.f6683e
            int r5 = r4 + 1
            r3.f6683e = r5
            char r5 = r1[r0]
            r1[r4] = r5
            goto L_0x00d8
        L_0x00ca:
            int r0 = r3.f6683e
            int r4 = r0 + 1
            r3.f6683e = r4
            char r4 = r3.b()
            r1[r0] = r4
            int r0 = r3.c
        L_0x00d8:
            int r0 = r0 + r2
            r3.c = r0
            goto L_0x009d
        L_0x00dc:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r3.f6684g
            int r4 = r3.d
            int r5 = r3.f6683e
            int r5 = r5 - r4
            r0.<init>(r1, r4, r5)
            goto L_0x01f6
        L_0x00ea:
            int r4 = r3.f6683e
            r3.f = r4
            int r0 = r0 + 1
            r3.c = r0
            int r0 = r4 + 1
            r3.f6683e = r0
            r1[r4] = r9
        L_0x00f8:
            int r0 = r3.c
            int r1 = r3.f6682b
            if (r0 >= r1) goto L_0x0111
            char[] r4 = r3.f6684g
            char r5 = r4[r0]
            if (r5 != r9) goto L_0x0111
            int r1 = r3.f6683e
            int r5 = r1 + 1
            r3.f6683e = r5
            r4[r1] = r9
            int r0 = r0 + 1
            r3.c = r0
            goto L_0x00f8
        L_0x0111:
            if (r0 == r1) goto L_0x0121
            char[] r1 = r3.f6684g
            char r4 = r1[r0]
            if (r4 == r11) goto L_0x0121
            char r4 = r1[r0]
            if (r4 == r12) goto L_0x0121
            char r0 = r1[r0]
            if (r0 != r10) goto L_0x009d
        L_0x0121:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r3.f6684g
            int r4 = r3.d
            int r5 = r3.f
            int r5 = r5 - r4
            r0.<init>(r1, r4, r5)
            goto L_0x01f6
        L_0x012f:
            java.lang.String r0 = ""
            goto L_0x01f6
        L_0x0133:
            int r5 = r1 + 4
            if (r5 >= r4) goto L_0x01b5
            r3.d = r1
        L_0x0139:
            int r1 = r1 + r2
            r3.c = r1
            int r4 = r3.f6682b
            if (r1 == r4) goto L_0x0176
            char[] r4 = r3.f6684g
            char r5 = r4[r1]
            if (r5 == r12) goto L_0x0176
            char r5 = r4[r1]
            if (r5 == r11) goto L_0x0176
            char r5 = r4[r1]
            if (r5 != r10) goto L_0x014f
            goto L_0x0176
        L_0x014f:
            char r5 = r4[r1]
            if (r5 != r9) goto L_0x0163
            r3.f6683e = r1
        L_0x0155:
            int r1 = r1 + r2
            r3.c = r1
            int r4 = r3.f6682b
            if (r1 >= r4) goto L_0x0178
            char[] r4 = r3.f6684g
            char r4 = r4[r1]
            if (r4 != r9) goto L_0x0178
            goto L_0x0155
        L_0x0163:
            char r5 = r4[r1]
            r6 = 65
            if (r5 < r6) goto L_0x0139
            char r5 = r4[r1]
            r6 = 70
            if (r5 > r6) goto L_0x0139
            char r5 = r4[r1]
            int r5 = r5 + r9
            char r5 = (char) r5
            r4[r1] = r5
            goto L_0x0139
        L_0x0176:
            r3.f6683e = r1
        L_0x0178:
            int r1 = r3.f6683e
            int r4 = r3.d
            int r1 = r1 - r4
            r5 = 5
            if (r1 < r5) goto L_0x01a2
            r5 = r1 & 1
            if (r5 == 0) goto L_0x01a2
            int r5 = r1 / 2
            byte[] r6 = new byte[r5]
            int r4 = r4 + 1
            r7 = 0
        L_0x018b:
            if (r7 >= r5) goto L_0x0198
            int r8 = r3.a(r4)
            byte r8 = (byte) r8
            r6[r7] = r8
            int r4 = r4 + r0
            int r7 = r7 + 1
            goto L_0x018b
        L_0x0198:
            java.lang.String r0 = new java.lang.String
            char[] r4 = r3.f6684g
            int r5 = r3.d
            r0.<init>(r4, r5, r1)
            goto L_0x01f6
        L_0x01a2:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = b.e.a.a.a.y(r7)
            java.lang.String r0 = r3.a
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x01b5:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = b.e.a.a.a.y(r7)
            java.lang.String r0 = r3.a
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x01c8:
            int r1 = r1 + 1
            r3.c = r1
            r3.d = r1
        L_0x01ce:
            r3.f6683e = r1
            int r0 = r3.c
            int r4 = r3.f6682b
            if (r0 == r4) goto L_0x026d
            char[] r4 = r3.f6684g
            char r5 = r4[r0]
            if (r5 != r8) goto L_0x0253
        L_0x01dc:
            int r0 = r0 + r2
            r3.c = r0
            int r1 = r3.f6682b
            if (r0 >= r1) goto L_0x01ea
            char[] r1 = r3.f6684g
            char r1 = r1[r0]
            if (r1 != r9) goto L_0x01ea
            goto L_0x01dc
        L_0x01ea:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r3.f6684g
            int r4 = r3.d
            int r5 = r3.f6683e
            int r5 = r5 - r4
            r0.<init>(r1, r4, r5)
        L_0x01f6:
            java.lang.String r1 = "cn"
            boolean r15 = r1.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x01ff
            goto L_0x0206
        L_0x01ff:
            int r15 = r3.c
            int r0 = r3.f6682b
            if (r15 < r0) goto L_0x020e
        L_0x0205:
            r0 = 0
        L_0x0206:
            if (r0 == 0) goto L_0x0280
            boolean r1 = r13.d(r14, r0)
            goto L_0x0281
        L_0x020e:
            char[] r0 = r3.f6684g
            char r1 = r0[r15]
            java.lang.String r4 = "Malformed DN: "
            if (r1 == r11) goto L_0x0233
            char r1 = r0[r15]
            if (r1 != r10) goto L_0x021b
            goto L_0x0233
        L_0x021b:
            char r0 = r0[r15]
            if (r0 != r12) goto L_0x0220
            goto L_0x0233
        L_0x0220:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = b.e.a.a.a.y(r4)
            java.lang.String r0 = r3.a
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x0233:
            int r15 = r15 + 1
            r3.c = r15
            java.lang.String r15 = r3.c()
            if (r15 == 0) goto L_0x0240
            r0 = 2
            goto L_0x0073
        L_0x0240:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = b.e.a.a.a.y(r4)
            java.lang.String r0 = r3.a
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x0253:
            char r5 = r4[r0]
            if (r5 != r6) goto L_0x025e
            char r0 = r3.b()
            r4[r1] = r0
            goto L_0x0262
        L_0x025e:
            char r0 = r4[r0]
            r4[r1] = r0
        L_0x0262:
            int r0 = r3.c
            int r0 = r0 + r2
            r3.c = r0
            int r0 = r3.f6683e
            int r1 = r0 + 1
            goto L_0x01ce
        L_0x026d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = b.e.a.a.a.y(r7)
            java.lang.String r0 = r3.a
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x0280:
            r1 = 0
        L_0x0281:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.m.d.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
