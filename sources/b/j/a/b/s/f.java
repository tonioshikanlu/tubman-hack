package b.j.a.b.s;

import androidx.recyclerview.widget.RecyclerView;
import b.e.a.a.a;
import java.math.BigDecimal;

public final class f {
    public static final String a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* renamed from: b  reason: collision with root package name */
    public static final String f1479b = String.valueOf(RecyclerView.FOREVER_NS);

    public static NumberFormatException a(String str) {
        return new NumberFormatException(a.n("Value \"", str, "\" can not be represented as BigDecimal"));
    }

    public static BigDecimal b(char[] cArr, int i2, int i3) {
        try {
            return new BigDecimal(cArr, i2, i3);
        } catch (NumberFormatException unused) {
            throw a(new String(cArr, i2, i3));
        }
    }

    public static double c(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        return java.lang.Integer.parseInt(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(java.lang.String r9) {
        /*
            r0 = 0
            char r1 = r9.charAt(r0)
            int r2 = r9.length()
            r3 = 1
            r4 = 45
            if (r1 != r4) goto L_0x000f
            r0 = r3
        L_0x000f:
            r4 = 10
            if (r0 == 0) goto L_0x0026
            if (r2 == r3) goto L_0x0021
            if (r2 <= r4) goto L_0x0018
            goto L_0x0021
        L_0x0018:
            r1 = 2
            char r3 = r9.charAt(r3)
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x002f
        L_0x0021:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x0026:
            r5 = 9
            if (r2 <= r5) goto L_0x002f
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x002f:
            r5 = 57
            if (r1 > r5) goto L_0x0084
            r6 = 48
            if (r1 >= r6) goto L_0x0038
            goto L_0x0084
        L_0x0038:
            int r1 = r1 - r6
            if (r3 >= r2) goto L_0x0080
            int r7 = r3 + 1
            char r3 = r9.charAt(r3)
            if (r3 > r5) goto L_0x007b
            if (r3 >= r6) goto L_0x0046
            goto L_0x007b
        L_0x0046:
            int r1 = r1 * 10
            int r3 = r3 - r6
            int r1 = r1 + r3
            if (r7 >= r2) goto L_0x0080
            int r3 = r7 + 1
            char r7 = r9.charAt(r7)
            if (r7 > r5) goto L_0x0076
            if (r7 >= r6) goto L_0x0057
            goto L_0x0076
        L_0x0057:
            int r1 = r1 * 10
            int r7 = r7 - r6
            int r1 = r1 + r7
            if (r3 >= r2) goto L_0x0080
        L_0x005d:
            int r7 = r3 + 1
            char r3 = r9.charAt(r3)
            if (r3 > r5) goto L_0x0071
            if (r3 >= r6) goto L_0x0068
            goto L_0x0071
        L_0x0068:
            int r1 = r1 * r4
            int r3 = r3 + -48
            int r1 = r1 + r3
            if (r7 < r2) goto L_0x006f
            goto L_0x0080
        L_0x006f:
            r3 = r7
            goto L_0x005d
        L_0x0071:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x0076:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x007b:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x0080:
            if (r0 == 0) goto L_0x0083
            int r1 = -r1
        L_0x0083:
            return r1
        L_0x0084:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.s.f.d(java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return r0 + ((r2[r3] - '0') * 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        r0 = r0 + ((r2[r3] - '0') * 10000000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r0 = r0 + ((r2[r3] - '0') * 1000000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        r0 = r0 + ((r2[r3] - '0') * 100000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        r0 = r0 + ((r2[r3] - '0') * 10000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        r0 = r0 + ((r2[r3] - '0') * 1000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r0 = r0 + ((r2[r3] - '0') * 100);
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(char[] r2, int r3, int r4) {
        /*
            int r0 = r3 + r4
            int r0 = r0 + -1
            char r0 = r2[r0]
            int r0 = r0 + -48
            switch(r4) {
                case 2: goto L_0x005a;
                case 3: goto L_0x0050;
                case 4: goto L_0x0046;
                case 5: goto L_0x003c;
                case 6: goto L_0x0030;
                case 7: goto L_0x0024;
                case 8: goto L_0x0018;
                case 9: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0061
        L_0x000c:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0018:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 10000000(0x989680, float:1.4012985E-38)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0024:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0030:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x003c:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 10000
            int r0 = r0 + r3
            r3 = r4
        L_0x0046:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 1000
            int r0 = r0 + r3
            r3 = r4
        L_0x0050:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 100
            int r0 = r0 + r3
            r3 = r4
        L_0x005a:
            char r2 = r2[r3]
            int r2 = r2 + -48
            int r2 = r2 * 10
            int r0 = r0 + r2
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.s.f.e(char[], int, int):int");
    }

    public static long f(String str) {
        return str.length() <= 9 ? (long) d(str) : Long.parseLong(str);
    }

    public static long g(char[] cArr, int i2, int i3) {
        int i4 = i3 - 9;
        return (((long) e(cArr, i2, i4)) * 1000000000) + ((long) e(cArr, i2 + i4, 9));
    }
}
