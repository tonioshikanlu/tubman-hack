package b.l.b.a.a.a;

import b.l.b.a.b.c;
import b.l.b.a.b.d;
import b.l.b.a.b.f;
import b.l.b.a.b.g;
import b.l.b.a.d.w;
import b.l.c.b.g0;
import b.l.c.b.o;
import b.l.c.b.v;
import b.l.c.c.a;
import com.google.api.client.http.HttpHeaders;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class b implements d, g {

    /* renamed from: h  reason: collision with root package name */
    public static final SecureRandom f4704h = new SecureRandom();

    /* renamed from: i  reason: collision with root package name */
    public static final b.l.b.a.d.z.b f4705i = new b.l.b.a.d.z.b("-_.~", false);
    public a a;

    /* renamed from: b  reason: collision with root package name */
    public String f4706b;
    public String c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public String f4707e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public String f4708g;

    public static class a implements Comparable<a> {

        /* renamed from: h  reason: collision with root package name */
        public final String f4709h;

        /* renamed from: i  reason: collision with root package name */
        public final String f4710i;

        public a(String str, String str2) {
            this.f4709h = str;
            this.f4710i = str2;
        }

        public int compareTo(Object obj) {
            a aVar = (a) obj;
            int compareTo = this.f4709h.compareTo(aVar.f4709h);
            return compareTo == 0 ? this.f4710i.compareTo(aVar.f4710i) : compareTo;
        }
    }

    public static String c(String str) {
        return f4705i.a(str);
    }

    public final void a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            b.l.b.a.d.z.b bVar = f4705i;
            sb.append(bVar.a(str));
            sb.append("=\"");
            sb.append(bVar.a(str2));
            sb.append("\",");
        }
    }

    public void b(String str, c cVar) {
        byte[] bArr;
        a aVar = this.a;
        Objects.requireNonNull(aVar);
        this.f4707e = "HMAC-SHA1";
        g0 g0Var = new g0(v.f4894h);
        String str2 = this.f4706b;
        if (str2 != null) {
            d(g0Var, "oauth_consumer_key", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            d(g0Var, "oauth_nonce", str3);
        }
        d(g0Var, "oauth_signature_method", "HMAC-SHA1");
        String str4 = this.f;
        if (str4 != null) {
            d(g0Var, "oauth_timestamp", str4);
        }
        String str5 = this.f4708g;
        if (str5 != null) {
            d(g0Var, "oauth_token", str5);
        }
        for (Map.Entry next : cVar.entrySet()) {
            Object value = next.getValue();
            if (value != null) {
                String str6 = (String) next.getKey();
                if (value instanceof Collection) {
                    for (Object d2 : (Collection) value) {
                        d(g0Var, str6, d2);
                    }
                } else {
                    d(g0Var, str6, value);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean z2 = true;
        for (a aVar2 : g0Var.c()) {
            if (z2) {
                z2 = false;
            } else {
                sb.append('&');
            }
            sb.append(aVar2.f4709h);
            String str7 = aVar2.f4710i;
            if (str7 != null) {
                sb.append('=');
                sb.append(str7);
            }
        }
        String sb2 = sb.toString();
        c cVar2 = new c();
        String str8 = cVar.scheme;
        Objects.requireNonNull(str8);
        cVar2.scheme = str8;
        String str9 = cVar.host;
        Objects.requireNonNull(str9);
        cVar2.host = str9;
        cVar2.pathParts = cVar.pathParts;
        int i2 = cVar.port;
        if (("http".equals(str8) && i2 == 80) || ("https".equals(str8) && i2 == 443)) {
            i2 = -1;
        }
        if (i2 < -1) {
            z = false;
        }
        b.l.a.c.b.a.o(z, "expected port >= -1");
        cVar2.port = i2;
        String build = cVar2.build();
        StringBuilder sb3 = new StringBuilder();
        b.l.b.a.d.z.b bVar = f4705i;
        sb3.append(bVar.a(str));
        sb3.append('&');
        sb3.append(c(build));
        sb3.append('&');
        sb3.append(c(sb2));
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        String str10 = aVar.a;
        if (str10 != null) {
            sb5.append(bVar.a(str10));
        }
        sb5.append('&');
        String str11 = aVar.f4703b;
        if (str11 != null) {
            sb5.append(bVar.a(str11));
        }
        String sb6 = sb5.toString();
        String str12 = w.a;
        String str13 = null;
        SecretKeySpec secretKeySpec = new SecretKeySpec(sb6 == null ? null : sb6.getBytes(StandardCharsets.UTF_8), "HmacSHA1");
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(secretKeySpec);
        if (sb4 == null) {
            bArr = null;
        } else {
            bArr = sb4.getBytes(StandardCharsets.UTF_8);
        }
        byte[] doFinal = instance.doFinal(bArr);
        if (doFinal != null) {
            b.l.c.c.a aVar3 = b.l.c.c.a.a;
            Objects.requireNonNull(aVar3);
            int length = doFinal.length;
            b.l.a.c.b.a.D(0, length + 0, doFinal.length);
            a.C0072a aVar4 = ((a.d) aVar3).f4903b;
            StringBuilder sb7 = new StringBuilder(b.l.c.d.a.a(length, aVar4.f, RoundingMode.CEILING) * aVar4.f4901e);
            try {
                aVar3.a(sb7, doFinal, 0, length);
                str13 = sb7.toString();
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
        this.d = str13;
    }

    public final void d(o<a> oVar, String str, Object obj) {
        String str2;
        String a2 = f4705i.a(str);
        if (obj == null) {
            str2 = null;
        } else {
            str2 = c(obj.toString());
        }
        oVar.add(new a(a2, str2));
    }

    public void initialize(f fVar) {
        fVar.a = this;
    }

    public void intercept(f fVar) {
        this.c = Long.toHexString(Math.abs(f4704h.nextLong()));
        this.f = Long.toString(System.currentTimeMillis() / 1000);
        try {
            b(fVar.f4726j, fVar.f4727k);
            HttpHeaders httpHeaders = fVar.f4721b;
            StringBuilder sb = new StringBuilder("OAuth");
            a(sb, "realm", (String) null);
            a(sb, "oauth_callback", (String) null);
            a(sb, "oauth_consumer_key", this.f4706b);
            a(sb, "oauth_nonce", this.c);
            a(sb, "oauth_signature", this.d);
            a(sb, "oauth_signature_method", this.f4707e);
            a(sb, "oauth_timestamp", this.f);
            a(sb, "oauth_token", this.f4708g);
            a(sb, "oauth_verifier", (String) null);
            a(sb, "oauth_version", (String) null);
            httpHeaders.o(sb.substring(0, sb.length() - 1));
        } catch (GeneralSecurityException e2) {
            IOException iOException = new IOException();
            iOException.initCause(e2);
            throw iOException;
        }
    }
}
