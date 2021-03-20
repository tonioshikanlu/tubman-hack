package b.p.b;

import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class q {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6739b;

    public q(String str, String str2, String str3, String str4) {
        this.a = str;
        this.f6739b = str4;
    }

    public static q b(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = d.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                if (str2 == null || group3.equalsIgnoreCase(str2)) {
                    str2 = group3;
                } else {
                    throw new IllegalArgumentException(a.m("Multiple different charsets: ", str));
                }
            }
        }
        return new q(str, lowerCase, lowerCase2, str2);
    }

    public Charset a(Charset charset) {
        String str = this.f6739b;
        return str != null ? Charset.forName(str) : charset;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && ((q) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
