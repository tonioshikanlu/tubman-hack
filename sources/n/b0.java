package n;

import e.a0.b;
import e.a0.d;
import e.a0.e;
import e.c0.h;
import e.x.c.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b0 {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: e  reason: collision with root package name */
    public static final a f10048e = null;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f10049b;

    public static final class a {
        public static final b0 a(String str) {
            i.e(str, "$this$toMediaType");
            Matcher matcher = b0.c.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                i.d(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                i.d(locale, "Locale.US");
                String lowerCase = group.toLowerCase(locale);
                i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                i.d(group2, "typeSubtype.group(2)");
                i.d(locale, "Locale.US");
                String lowerCase2 = group2.toLowerCase(locale);
                i.d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = b0.d.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 != null) {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (h.C(group4, "'", false, 2) && h.e(group4, "'", false, 2) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                i.d(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                        }
                        end = matcher2.end();
                    } else {
                        StringBuilder y = b.e.a.a.a.y("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        i.d(substring, "(this as java.lang.String).substring(startIndex)");
                        y.append(substring);
                        y.append("\" for: \"");
                        y.append(str);
                        y.append('\"');
                        throw new IllegalArgumentException(y.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new b0(str, lowerCase, lowerCase2, (String[]) array, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public static final b0 b(String str) {
            i.e(str, "$this$toMediaTypeOrNull");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public b0(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = str;
        this.f10049b = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        i.e("charset", "name");
        String[] strArr = this.f10049b;
        i.e(strArr, "$this$indices");
        b c2 = e.c(new d(0, b.q.a.a.V0(strArr)), 2);
        int i2 = c2.f7883h;
        int i3 = c2.f7884i;
        int i4 = c2.f7885j;
        if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
            while (true) {
                if (!h.f(this.f10049b[i2], "charset", true)) {
                    if (i2 == i3) {
                        break;
                    }
                    i2 += i4;
                } else {
                    str = this.f10049b[i2 + 1];
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && i.a(((b0) obj).a, this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
