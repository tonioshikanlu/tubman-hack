package b.l.a.c.f.e;

import b.e.a.a.a;

public class mi {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final ej f3165b;

    public mi(String str, ej ejVar) {
        this.a = str;
        this.f3165b = ejVar;
    }

    public final String a(String str, String str2) {
        String str3 = this.a;
        StringBuilder sb = new StringBuilder(a.b(String.valueOf(str3).length(), 5, str.length(), String.valueOf(str2).length()));
        sb.append(str3);
        sb.append(str);
        sb.append("?key=");
        sb.append(str2);
        return sb.toString();
    }
}
