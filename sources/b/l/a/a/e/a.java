package b.l.a.a.e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.a.a.n.f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class a {
    public static final String c = f.F("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public static final String d = f.F("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e  reason: collision with root package name */
    public static final String f2389e = f.F("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
    public static final Set<b.l.a.a.a> f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b.l.a.a.a[]{new b.l.a.a.a("proto"), new b.l.a.a.a("json")})));
    @NonNull
    public final String a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f2390b;

    public a(@NonNull String str, @Nullable String str2) {
        this.a = str;
        this.f2390b = str2;
    }

    @NonNull
    public static a a(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Nullable
    public byte[] b() {
        String str = this.f2390b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
