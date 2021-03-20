package b.l.f.c0;

import b.l.f.g;
import b.l.f.y.b;
import java.util.Map;

public final class d extends s {

    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r6 = r6.charAt(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.f.c0.d.a f(java.lang.CharSequence r6, int r7) {
        /*
            b.l.f.c0.d$a r0 = b.l.f.c0.d.a.ONE_DIGIT
            b.l.f.c0.d$a r1 = b.l.f.c0.d.a.UNCODABLE
            int r2 = r6.length()
            if (r7 < r2) goto L_0x000b
            return r1
        L_0x000b:
            char r3 = r6.charAt(r7)
            r4 = 241(0xf1, float:3.38E-43)
            if (r3 != r4) goto L_0x0016
            b.l.f.c0.d$a r6 = b.l.f.c0.d.a.FNC_1
            return r6
        L_0x0016:
            r4 = 48
            if (r3 < r4) goto L_0x0031
            r5 = 57
            if (r3 <= r5) goto L_0x001f
            goto L_0x0031
        L_0x001f:
            int r7 = r7 + 1
            if (r7 < r2) goto L_0x0024
            return r0
        L_0x0024:
            char r6 = r6.charAt(r7)
            if (r6 < r4) goto L_0x0030
            if (r6 <= r5) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            b.l.f.c0.d$a r6 = b.l.f.c0.d.a.TWO_DIGITS
            return r6
        L_0x0030:
            return r0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.d.f(java.lang.CharSequence, int):b.l.f.c0.d$a");
    }

    public b a(String str, b.l.f.a aVar, int i2, int i3, Map<g, ?> map) {
        if (aVar == b.l.f.a.CODE_128) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r8 == 101) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r10 <= 244) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        if (f(r0, r6 + 3) == r12) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        if (r10 == r11) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ab, code lost:
        if (r14 == r12) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ef, code lost:
        r5 = r3;
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f1, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0038 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] d(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            int[][] r1 = b.l.f.c0.c.a
            int r2 = r17.length()
            if (r2 <= 0) goto L_0x0159
            r3 = 80
            if (r2 > r3) goto L_0x0159
            r4 = 0
        L_0x000f:
            if (r4 >= r2) goto L_0x002f
            char r5 = r0.charAt(r4)
            switch(r5) {
                case 241: goto L_0x001c;
                case 242: goto L_0x001c;
                case 243: goto L_0x001c;
                case 244: goto L_0x001c;
                default: goto L_0x0018;
            }
        L_0x0018:
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L_0x001f
        L_0x001c:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x001f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Bad character in input: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x002f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
        L_0x0038:
            if (r6 >= r2) goto L_0x0114
            b.l.f.c0.d$a r11 = b.l.f.c0.d.a.ONE_DIGIT
            b.l.f.c0.d$a r12 = b.l.f.c0.d.a.TWO_DIGITS
            b.l.f.c0.d$a r13 = b.l.f.c0.d.a.FNC_1
            b.l.f.c0.d$a r14 = f(r0, r6)
            r15 = 32
            r3 = 101(0x65, float:1.42E-43)
            r5 = 96
            if (r14 != r11) goto L_0x004f
            if (r8 != r3) goto L_0x00ae
            goto L_0x0070
        L_0x004f:
            b.l.f.c0.d$a r10 = b.l.f.c0.d.a.UNCODABLE
            if (r14 != r10) goto L_0x006c
            int r10 = r17.length()
            if (r6 >= r10) goto L_0x00ae
            char r10 = r0.charAt(r6)
            if (r10 < r15) goto L_0x0070
            if (r8 != r3) goto L_0x00ae
            if (r10 < r5) goto L_0x0070
            r11 = 241(0xf1, float:3.38E-43)
            if (r10 < r11) goto L_0x00ae
            r11 = 244(0xf4, float:3.42E-43)
            if (r10 > r11) goto L_0x00ae
            goto L_0x0070
        L_0x006c:
            if (r8 != r3) goto L_0x0072
            if (r14 != r13) goto L_0x0072
        L_0x0070:
            r10 = r3
            goto L_0x00b0
        L_0x0072:
            r15 = 99
            if (r8 != r15) goto L_0x0078
        L_0x0076:
            r10 = r15
            goto L_0x00b0
        L_0x0078:
            r5 = 100
            if (r8 != r5) goto L_0x00a3
            if (r14 != r13) goto L_0x007f
            goto L_0x00ae
        L_0x007f:
            int r5 = r6 + 2
            b.l.f.c0.d$a r5 = f(r0, r5)
            if (r5 == r10) goto L_0x00ae
            if (r5 != r11) goto L_0x008a
            goto L_0x00ae
        L_0x008a:
            if (r5 != r13) goto L_0x0095
            int r5 = r6 + 3
            b.l.f.c0.d$a r5 = f(r0, r5)
            if (r5 != r12) goto L_0x00ae
            goto L_0x00ad
        L_0x0095:
            int r5 = r6 + 4
        L_0x0097:
            b.l.f.c0.d$a r10 = f(r0, r5)
            if (r10 != r12) goto L_0x00a0
            int r5 = r5 + 2
            goto L_0x0097
        L_0x00a0:
            if (r10 != r11) goto L_0x0076
            goto L_0x00ae
        L_0x00a3:
            if (r14 != r13) goto L_0x00ab
            int r5 = r6 + 1
            b.l.f.c0.d$a r14 = f(r0, r5)
        L_0x00ab:
            if (r14 != r12) goto L_0x00ae
        L_0x00ad:
            goto L_0x0076
        L_0x00ae:
            r10 = 100
        L_0x00b0:
            if (r10 != r8) goto L_0x00f3
            char r5 = r0.charAt(r6)
            switch(r5) {
                case 241: goto L_0x00c8;
                case 242: goto L_0x00c5;
                case 243: goto L_0x00c1;
                case 244: goto L_0x00ba;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x00cb
        L_0x00ba:
            if (r8 != r3) goto L_0x00bd
            goto L_0x00ef
        L_0x00bd:
            r3 = 1
            r5 = 100
            goto L_0x00f1
        L_0x00c1:
            r3 = 1
            r5 = 96
            goto L_0x00f1
        L_0x00c5:
            r3 = 97
            goto L_0x00ef
        L_0x00c8:
            r3 = 102(0x66, float:1.43E-43)
            goto L_0x00ef
        L_0x00cb:
            r5 = 100
            if (r8 == r5) goto L_0x00e9
            if (r8 == r3) goto L_0x00de
            int r3 = r6 + 2
            java.lang.String r3 = r0.substring(r6, r3)
            int r3 = java.lang.Integer.parseInt(r3)
            int r6 = r6 + 1
            goto L_0x00ef
        L_0x00de:
            char r3 = r0.charAt(r6)
            int r3 = r3 + -32
            if (r3 >= 0) goto L_0x00ef
            int r3 = r3 + 96
            goto L_0x00ef
        L_0x00e9:
            char r3 = r0.charAt(r6)
            int r3 = r3 + -32
        L_0x00ef:
            r5 = r3
            r3 = 1
        L_0x00f1:
            int r6 = r6 + r3
            goto L_0x0107
        L_0x00f3:
            if (r8 != 0) goto L_0x0104
            r5 = 100
            if (r10 == r5) goto L_0x0101
            if (r10 == r3) goto L_0x00fe
            r3 = 105(0x69, float:1.47E-43)
            goto L_0x0105
        L_0x00fe:
            r3 = 103(0x67, float:1.44E-43)
            goto L_0x0105
        L_0x0101:
            r3 = 104(0x68, float:1.46E-43)
            goto L_0x0105
        L_0x0104:
            r3 = r10
        L_0x0105:
            r5 = r3
            r8 = r10
        L_0x0107:
            r3 = r1[r5]
            r4.add(r3)
            int r5 = r5 * r9
            int r7 = r7 + r5
            if (r6 == 0) goto L_0x0038
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0114:
            r3 = 103(0x67, float:1.44E-43)
            int r7 = r7 % r3
            r0 = r1[r7]
            r4.add(r0)
            r0 = 106(0x6a, float:1.49E-43)
            r0 = r1[r0]
            r4.add(r0)
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        L_0x0128:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x013e
            java.lang.Object r2 = r0.next()
            int[] r2 = (int[]) r2
            int r3 = r2.length
            r5 = 0
        L_0x0136:
            if (r5 >= r3) goto L_0x0128
            r6 = r2[r5]
            int r1 = r1 + r6
            int r5 = r5 + 1
            goto L_0x0136
        L_0x013e:
            boolean[] r0 = new boolean[r1]
            java.util.Iterator r1 = r4.iterator()
            r3 = 0
        L_0x0145:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0158
            java.lang.Object r2 = r1.next()
            int[] r2 = (int[]) r2
            r4 = 1
            int r2 = b.l.f.c0.s.b(r0, r3, r2, r4)
            int r3 = r3 + r2
            goto L_0x0145
        L_0x0158:
            return r0
        L_0x0159:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "Contents length should be between 1 and 80 characters, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.d.d(java.lang.String):boolean[]");
    }
}
