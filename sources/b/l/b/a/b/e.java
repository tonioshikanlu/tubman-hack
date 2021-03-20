package b.l.b.a.b;

import b.l.a.c.b.a;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f4717e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    public static final Pattern f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f4718g = Pattern.compile("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?", 32);

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f4719h = Pattern.compile("\\s*;\\s*(" + "[^\\s/=;\"]+" + ")=(" + "\"([^\"]*)\"|[^\\s;\"]*" + ")");
    public String a = "application";

    /* renamed from: b  reason: collision with root package name */
    public String f4720b = "octet-stream";
    public final SortedMap<String, String> c = new TreeMap();
    public String d;

    public e(String str) {
        Matcher matcher = f4718g.matcher(str);
        a.o(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        Pattern pattern = f4717e;
        a.o(pattern.matcher(group).matches(), "Type contains reserved characters");
        this.a = group;
        this.d = null;
        String group2 = matcher.group(2);
        a.o(pattern.matcher(group2).matches(), "Subtype contains reserved characters");
        this.f4720b = group2;
        this.d = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = f4719h.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                e(group4, group5);
            }
        }
    }

    public static boolean c(String str, String str2) {
        return new e(str).b(new e(str2));
    }

    public String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.f4720b);
        SortedMap<String, String> sortedMap = this.c;
        if (sortedMap != null) {
            for (Map.Entry next : sortedMap.entrySet()) {
                String str2 = (String) next.getValue();
                sb.append("; ");
                sb.append((String) next.getKey());
                sb.append("=");
                if (!f.matcher(str2).matches()) {
                    str2 = b.e.a.a.a.n("\"", str2.replace("\\", "\\\\").replace("\"", "\\\""), "\"");
                }
                sb.append(str2);
            }
        }
        String sb2 = sb.toString();
        this.d = sb2;
        return sb2;
    }

    public boolean b(e eVar) {
        return eVar != null && this.a.equalsIgnoreCase(eVar.a) && this.f4720b.equalsIgnoreCase(eVar.f4720b);
    }

    public Charset d() {
        String str = (String) this.c.get("charset".toLowerCase(Locale.US));
        if (str == null) {
            return null;
        }
        return Charset.forName(str);
    }

    public e e(String str, String str2) {
        if (str2 == null) {
            this.d = null;
            this.c.remove(str.toLowerCase(Locale.US));
            return this;
        }
        a.o(f.matcher(str).matches(), "Name contains reserved characters");
        this.d = null;
        this.c.put(str.toLowerCase(Locale.US), str2);
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return b(eVar) && this.c.equals(eVar.c);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a();
    }
}
