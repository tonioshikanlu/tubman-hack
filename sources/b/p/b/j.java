package b.p.b;

import b.p.b.a0.i;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final h[] f6716e;
    public static final j f;

    /* renamed from: g  reason: collision with root package name */
    public static final j f6717g;

    /* renamed from: h  reason: collision with root package name */
    public static final j f6718h = new b(false).a();
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6719b;
    public final String[] c;
    public final String[] d;

    public static final class b {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f6720b;
        public String[] c;
        public boolean d;

        public b(j jVar) {
            this.a = jVar.a;
            this.f6720b = jVar.c;
            this.c = jVar.d;
            this.d = jVar.f6719b;
        }

        public b(boolean z) {
            this.a = z;
        }

        public j a() {
            return new j(this, (a) null);
        }

        public b b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f6720b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public b c(z... zVarArr) {
            if (this.a) {
                String[] strArr = new String[zVarArr.length];
                for (int i2 = 0; i2 < zVarArr.length; i2++) {
                    strArr[i2] = zVarArr[i2].f6782h;
                }
                d(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public b d(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }
    }

    static {
        h[] hVarArr = {h.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, h.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, h.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, h.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, h.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, h.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, h.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, h.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, h.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, h.TLS_RSA_WITH_AES_128_GCM_SHA256, h.TLS_RSA_WITH_AES_128_CBC_SHA, h.TLS_RSA_WITH_AES_256_CBC_SHA, h.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f6716e = hVarArr;
        b bVar = new b(true);
        String[] strArr = new String[13];
        for (int i2 = 0; i2 < 13; i2++) {
            strArr[i2] = hVarArr[i2].f6711h;
        }
        bVar.b(strArr);
        z zVar = z.TLS_1_0;
        bVar.c(z.TLS_1_2, z.TLS_1_1, zVar);
        if (bVar.a) {
            bVar.d = true;
            j a2 = bVar.a();
            f = a2;
            b bVar2 = new b(a2);
            bVar2.c(zVar);
            if (bVar2.a) {
                bVar2.d = true;
                f6717g = bVar2.a();
                return;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public j(b bVar, a aVar) {
        this.a = bVar.a;
        this.c = bVar.f6720b;
        this.d = bVar.c;
        this.f6719b = bVar.d;
    }

    public static boolean b(String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                byte[] bArr = i.a;
                if (Arrays.asList(strArr2).contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !b(strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || b(strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z = this.a;
        if (z != jVar.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, jVar.c) && Arrays.equals(this.d, jVar.d) && this.f6719b == jVar.f6719b);
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + (this.f6719b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        z zVar;
        List list;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.c;
        List list2 = null;
        String str2 = "[all enabled]";
        int i2 = 0;
        if (strArr != null) {
            if (strArr == null) {
                list = null;
            } else {
                h[] hVarArr = new h[strArr.length];
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.c;
                    if (i3 >= strArr2.length) {
                        break;
                    }
                    String str3 = strArr2[i3];
                    h hVar = h.TLS_RSA_WITH_NULL_MD5;
                    if (str3.startsWith("SSL_")) {
                        StringBuilder y = b.e.a.a.a.y("TLS_");
                        y.append(str3.substring(4));
                        str3 = y.toString();
                    }
                    hVarArr[i3] = h.valueOf(str3);
                    i3++;
                }
                list = i.i(hVarArr);
            }
            str = list.toString();
        } else {
            str = str2;
        }
        String[] strArr3 = this.d;
        if (strArr3 != null) {
            if (strArr3 != null) {
                z[] zVarArr = new z[strArr3.length];
                while (true) {
                    String[] strArr4 = this.d;
                    if (i2 < strArr4.length) {
                        String str4 = strArr4[i2];
                        str4.hashCode();
                        str4.hashCode();
                        char c2 = 65535;
                        switch (str4.hashCode()) {
                            case -503070503:
                                if (str4.equals("TLSv1.1")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -503070502:
                                if (str4.equals("TLSv1.2")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 79201641:
                                if (str4.equals("SSLv3")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 79923350:
                                if (str4.equals("TLSv1")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
                            case 0:
                                zVar = z.TLS_1_1;
                                break;
                            case 1:
                                zVar = z.TLS_1_2;
                                break;
                            case 2:
                                zVar = z.SSL_3_0;
                                break;
                            case 3:
                                zVar = z.TLS_1_0;
                                break;
                            default:
                                throw new IllegalArgumentException(b.e.a.a.a.m("Unexpected TLS version: ", str4));
                        }
                        zVarArr[i2] = zVar;
                        i2++;
                    } else {
                        list2 = i.i(zVarArr);
                    }
                }
            }
            str2 = list2.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        return b.e.a.a.a.s(sb, this.f6719b, ")");
    }
}
