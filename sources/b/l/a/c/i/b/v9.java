package b.l.a.c.i.b;

import b.l.a.c.f.i.r0;
import b.l.a.c.f.i.w0;
import b.l.a.c.f.i.x0;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class v9 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4323b;
    public Boolean c;
    public Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public Long f4324e;
    public Long f;

    public v9(String str, int i2) {
        this.a = str;
        this.f4323b = i2;
    }

    public static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public static Boolean e(String str, x0 x0Var, k3 k3Var) {
        List<String> list;
        boolean z;
        w0 w0Var = w0.REGEXP;
        w0 w0Var2 = w0.IN_LIST;
        Objects.requireNonNull(x0Var, "null reference");
        if (str == null || !x0Var.s() || x0Var.t() == w0.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (x0Var.t() == w0Var2) {
            if (x0Var.z() == 0) {
                return null;
            }
        } else if (!x0Var.u()) {
            return null;
        }
        w0 t = x0Var.t();
        boolean x = x0Var.x();
        String v = (x || t == w0Var || t == w0Var2) ? x0Var.v() : x0Var.v().toUpperCase(Locale.ENGLISH);
        if (x0Var.z() == 0) {
            list = null;
        } else {
            list = x0Var.y();
            if (!x) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String upperCase : list) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = t == w0Var ? v : null;
        if (t == w0Var2) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (v == null) {
            return null;
        }
        if (!x && t != w0Var) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (t.ordinal()) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, true != x ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (k3Var == null) {
                        return null;
                    }
                    k3Var.f4091i.b("Invalid regular expression in REGEXP audience filter. expression", str2);
                    return null;
                }
            case 2:
                z = str.startsWith(v);
                break;
            case 3:
                z = str.endsWith(v);
                break;
            case 4:
                z = str.contains(v);
                break;
            case 5:
                z = str.equals(v);
                break;
            case 6:
                if (list != null) {
                    z = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean f(long j2, r0 r0Var) {
        try {
            return h(new BigDecimal(j2), r0Var, ShadowDrawableWrapper.COS_45);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean g(String str, r0 r0Var) {
        if (!f9.z(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), r0Var, ShadowDrawableWrapper.COS_45);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        if (r9.compareTo(r4) != 1) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean h(java.math.BigDecimal r9, b.l.a.c.f.i.r0 r10, double r11) {
        /*
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r10, r0)
            boolean r0 = r10.s()
            r1 = 0
            if (r0 == 0) goto L_0x010e
            b.l.a.c.f.i.q0 r0 = r10.t()
            b.l.a.c.f.i.q0 r2 = b.l.a.c.f.i.q0.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0016
            goto L_0x010e
        L_0x0016:
            b.l.a.c.f.i.q0 r0 = r10.t()
            b.l.a.c.f.i.q0 r2 = b.l.a.c.f.i.q0.BETWEEN
            if (r0 != r2) goto L_0x002c
            boolean r0 = r10.y()
            if (r0 == 0) goto L_0x002b
            boolean r0 = r10.A()
            if (r0 == 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            return r1
        L_0x002c:
            boolean r0 = r10.w()
            if (r0 != 0) goto L_0x0033
            return r1
        L_0x0033:
            b.l.a.c.f.i.q0 r0 = r10.t()
            b.l.a.c.f.i.q0 r3 = r10.t()
            if (r3 != r2) goto L_0x0068
            java.lang.String r3 = r10.z()
            boolean r3 = b.l.a.c.i.b.f9.z(r3)
            if (r3 == 0) goto L_0x0067
            java.lang.String r3 = r10.B()
            boolean r3 = b.l.a.c.i.b.f9.z(r3)
            if (r3 != 0) goto L_0x0052
            goto L_0x0067
        L_0x0052:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0067 }
            java.lang.String r4 = r10.z()     // Catch:{ NumberFormatException -> 0x0067 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0067 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0067 }
            java.lang.String r10 = r10.B()     // Catch:{ NumberFormatException -> 0x0067 }
            r4.<init>(r10)     // Catch:{ NumberFormatException -> 0x0067 }
            r10 = r3
            r3 = r1
            goto L_0x007e
        L_0x0067:
            return r1
        L_0x0068:
            java.lang.String r3 = r10.x()
            boolean r3 = b.l.a.c.i.b.f9.z(r3)
            if (r3 != 0) goto L_0x0073
            return r1
        L_0x0073:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x010e }
            java.lang.String r10 = r10.x()     // Catch:{ NumberFormatException -> 0x010e }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x010e }
            r10 = r1
            r4 = r10
        L_0x007e:
            if (r0 != r2) goto L_0x0083
            if (r10 == 0) goto L_0x0101
            goto L_0x0087
        L_0x0083:
            if (r3 != 0) goto L_0x0087
            goto L_0x0101
        L_0x0087:
            int r0 = r0.ordinal()
            r2 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x00ff
            r7 = 2
            if (r0 == r7) goto L_0x00f0
            r8 = 3
            if (r0 == r8) goto L_0x00aa
            r11 = 4
            if (r0 == r11) goto L_0x009b
            goto L_0x0101
        L_0x009b:
            if (r10 == 0) goto L_0x0101
            int r10 = r9.compareTo(r10)
            if (r10 == r2) goto L_0x00eb
            int r9 = r9.compareTo(r4)
            if (r9 == r6) goto L_0x00eb
            goto L_0x00ea
        L_0x00aa:
            if (r3 != 0) goto L_0x00ad
            goto L_0x0101
        L_0x00ad:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00e4
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r3.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00eb
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r3.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r2) goto L_0x00eb
            goto L_0x00ea
        L_0x00e4:
            int r9 = r9.compareTo(r3)
            if (r9 != 0) goto L_0x00eb
        L_0x00ea:
            r5 = r6
        L_0x00eb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            goto L_0x0101
        L_0x00f0:
            if (r3 != 0) goto L_0x00f3
            goto L_0x0101
        L_0x00f3:
            int r9 = r9.compareTo(r3)
            if (r9 != r6) goto L_0x00fa
            r5 = r6
        L_0x00fa:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00ff:
            if (r3 != 0) goto L_0x0102
        L_0x0101:
            return r1
        L_0x0102:
            int r9 = r9.compareTo(r3)
            if (r9 != r2) goto L_0x0109
            r5 = r6
        L_0x0109:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x010e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.v9.h(java.math.BigDecimal, b.l.a.c.f.i.r0, double):java.lang.Boolean");
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
