package b.l.a.c.i.b;

import android.os.Bundle;

public final class g {
    public static final g c = new g((Boolean) null, (Boolean) null);
    public final Boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f4009b;

    public g(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.f4009b = bool2;
    }

    public static g a(Bundle bundle) {
        return bundle == null ? c : new g(k(bundle.getString("ad_storage")), k(bundle.getString("analytics_storage")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r9 != '1') goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.a.c.i.b.g b(java.lang.String r9) {
        /*
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 0
            if (r9 == 0) goto L_0x0036
            int r3 = r9.length()
            r4 = 49
            r5 = 48
            r6 = 3
            if (r3 < r6) goto L_0x0020
            r3 = 2
            char r3 = r9.charAt(r3)
            if (r3 == r5) goto L_0x001e
            if (r3 == r4) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            r3 = r0
            goto L_0x0021
        L_0x001e:
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r2
        L_0x0021:
            int r7 = r9.length()
            r8 = 4
            if (r7 < r8) goto L_0x0033
            char r9 = r9.charAt(r6)
            if (r9 == r5) goto L_0x0031
            if (r9 == r4) goto L_0x0034
            goto L_0x0033
        L_0x0031:
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r2 = r3
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            b.l.a.c.i.b.g r9 = new b.l.a.c.i.b.g
            r9.<init>(r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.g.b(java.lang.String):b.l.a.c.i.b.g");
    }

    public static Boolean g(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static boolean i(int i2, int i3) {
        return i2 <= i3;
    }

    public static final int j(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean k(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder("G1");
        Boolean bool = this.a;
        char c2 = '1';
        sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        Boolean bool2 = this.f4009b;
        if (bool2 == null) {
            c2 = '-';
        } else if (!bool2.booleanValue()) {
            c2 = '0';
        }
        sb.append(c2);
        return sb.toString();
    }

    public final boolean d() {
        Boolean bool = this.a;
        return bool == null || bool.booleanValue();
    }

    public final boolean e() {
        Boolean bool = this.f4009b;
        return bool == null || bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return j(this.a) == j(gVar.a) && j(this.f4009b) == j(gVar.f4009b);
    }

    public final boolean f(g gVar) {
        Boolean bool = this.a;
        Boolean bool2 = Boolean.FALSE;
        if (bool == bool2 && gVar.a != bool2) {
            return true;
        }
        if (this.f4009b == bool2) {
            return gVar.f4009b != bool2;
        }
        return false;
    }

    public final g h(g gVar) {
        return new g(g(this.a, gVar.a), g(this.f4009b, gVar.f4009b));
    }

    public final int hashCode() {
        return j(this.f4009b) + ((j(this.a) + 527) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.a;
        String str = "denied";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? str : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f4009b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str = "granted";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
