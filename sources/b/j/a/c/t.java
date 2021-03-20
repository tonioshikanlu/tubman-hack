package b.j.a.c;

import b.e.a.a.a;
import b.j.a.b.o;
import b.j.a.c.j0.g;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public class t implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final t f2303k = new t("", (String) null);

    /* renamed from: l  reason: collision with root package name */
    public static final t f2304l = new t(new String(""), (String) null);

    /* renamed from: h  reason: collision with root package name */
    public final String f2305h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2306i;

    /* renamed from: j  reason: collision with root package name */
    public o f2307j;

    public t(String str) {
        Annotation[] annotationArr = g.a;
        this.f2305h = str == null ? "" : str;
        this.f2306i = null;
    }

    public static t a(String str) {
        return (str == null || str.length() == 0) ? f2303k : new t(b.j.a.b.w.g.f1569i.a(str), (String) null);
    }

    public static t b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.length() == 0) ? f2303k : new t(b.j.a.b.w.g.f1569i.a(str), str2);
    }

    public boolean c() {
        return this.f2305h.length() > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = b.j.a.b.w.g.f1569i.a(r3.f2305h);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.t d() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f2305h
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0009
            return r3
        L_0x0009:
            b.j.a.b.w.g r0 = b.j.a.b.w.g.f1569i
            java.lang.String r1 = r3.f2305h
            java.lang.String r0 = r0.a(r1)
            java.lang.String r1 = r3.f2305h
            if (r0 != r1) goto L_0x0016
            return r3
        L_0x0016:
            b.j.a.c.t r1 = new b.j.a.c.t
            java.lang.String r2 = r3.f2306i
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.t.d():b.j.a.c.t");
    }

    public boolean e() {
        return this.f2306i == null && this.f2305h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != t.class) {
            return false;
        }
        t tVar = (t) obj;
        String str = this.f2305h;
        if (str == null) {
            if (tVar.f2305h != null) {
                return false;
            }
        } else if (!str.equals(tVar.f2305h)) {
            return false;
        }
        String str2 = this.f2306i;
        String str3 = tVar.f2306i;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public t f(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this.f2305h) ? this : new t(str, this.f2306i);
    }

    public int hashCode() {
        String str = this.f2306i;
        return str == null ? this.f2305h.hashCode() : str.hashCode() ^ this.f2305h.hashCode();
    }

    public String toString() {
        if (this.f2306i == null) {
            return this.f2305h;
        }
        StringBuilder y = a.y("{");
        y.append(this.f2306i);
        y.append("}");
        y.append(this.f2305h);
        return y.toString();
    }

    public t(String str, String str2) {
        Annotation[] annotationArr = g.a;
        this.f2305h = str == null ? "" : str;
        this.f2306i = str2;
    }
}
