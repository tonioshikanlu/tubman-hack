package n;

import androidx.renderscript.ScriptIntrinsicBLAS;
import e.c0.h;
import e.x.c.i;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<String> f10127b = new a();
    public static final Map<String, k> c = new LinkedHashMap();
    public static final k d;

    /* renamed from: e  reason: collision with root package name */
    public static final k f10128e;
    public static final k f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f10129g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f10130h;

    /* renamed from: i  reason: collision with root package name */
    public static final k f10131i;

    /* renamed from: j  reason: collision with root package name */
    public static final k f10132j;

    /* renamed from: k  reason: collision with root package name */
    public static final k f10133k;

    /* renamed from: l  reason: collision with root package name */
    public static final k f10134l;

    /* renamed from: m  reason: collision with root package name */
    public static final k f10135m;

    /* renamed from: n  reason: collision with root package name */
    public static final k f10136n;

    /* renamed from: o  reason: collision with root package name */
    public static final k f10137o;

    /* renamed from: p  reason: collision with root package name */
    public static final k f10138p;

    /* renamed from: q  reason: collision with root package name */
    public static final k f10139q;
    public static final k r;
    public static final k s;
    public static final b t;
    public final String a;

    public static final class a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            i.e(str, "a");
            i.e(str2, "b");
            int min = Math.min(str.length(), str2.length());
            int i2 = 4;
            while (true) {
                if (i2 < min) {
                    char charAt = str.charAt(i2);
                    char charAt2 = str2.charAt(i2);
                    if (charAt == charAt2) {
                        i2++;
                    } else if (i.g(charAt, charAt2) < 0) {
                        return -1;
                    }
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length < length2) {
                        return -1;
                    }
                }
            }
            return 1;
        }
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final k a(b bVar, String str, int i2) {
            k kVar = new k(str, (DefaultConstructorMarker) null);
            k.c.put(str, kVar);
            return kVar;
        }

        public final synchronized k b(String str) {
            k kVar;
            i.e(str, "javaName");
            Map<String, k> map = k.c;
            kVar = map.get(str);
            if (kVar == null) {
                kVar = map.get(c(str));
                if (kVar == null) {
                    kVar = new k(str, (DefaultConstructorMarker) null);
                }
                map.put(str, kVar);
            }
            return kVar;
        }

        public final String c(String str) {
            if (h.C(str, "TLS_", false, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                String substring = str.substring(4);
                i.d(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                return sb.toString();
            } else if (!h.C(str, "SSL_", false, 2)) {
                return str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TLS_");
                String substring2 = str.substring(4);
                i.d(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                return sb2.toString();
            }
        }
    }

    static {
        b bVar = new b((DefaultConstructorMarker) null);
        t = bVar;
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5", 1);
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA", 2);
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5", 4);
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA", 5);
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        d = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        b.a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        b.a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        b.a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        b.a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f10128e = b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f = b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        b.a(bVar, "TLS_RSA_WITH_NULL_SHA256", 59);
        b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", ScriptIntrinsicBLAS.UNIT);
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        b.a(bVar, "TLS_PSK_WITH_RC4_128_SHA", 138);
        b.a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        b.a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        b.a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA", ScriptIntrinsicBLAS.LEFT);
        b.a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f10129g = b.a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f10130h = b.a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        b.a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        b.a(bVar, "TLS_FALLBACK_SCSV", 22016);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        b.a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        b.a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        b.a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f10131i = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f10132j = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        b.a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        b.a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        b.a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f10133k = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f10134l = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f10135m = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f10136n = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f10137o = b.a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f10138p = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        b.a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        b.a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f10139q = b.a(bVar, "TLS_AES_128_GCM_SHA256", 4865);
        r = b.a(bVar, "TLS_AES_256_GCM_SHA384", 4866);
        s = b.a(bVar, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        b.a(bVar, "TLS_AES_128_CCM_SHA256", 4868);
        b.a(bVar, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = str;
    }

    public String toString() {
        return this.a;
    }
}
