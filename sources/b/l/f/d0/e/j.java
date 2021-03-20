package b.l.f.d0.e;

import b.l.f.d0.e.k.a;
import b.l.f.s;
import b.l.f.x.a.g;
import b.l.f.y.b;

public final class j {
    public static final a a = new a();

    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.f.d0.e.c a(b.l.f.d0.e.h r15) {
        /*
            r0 = 0
            if (r15 != 0) goto L_0x0004
            return r0
        L_0x0004:
            b.l.f.d0.e.a r1 = r15.c()
            r2 = 0
            r3 = -1
            r4 = 1
            if (r1 != 0) goto L_0x0010
            r5 = r0
            goto L_0x0079
        L_0x0010:
            b.l.f.d0.e.c r5 = r15.a
            boolean r6 = r15.c
            if (r6 == 0) goto L_0x0019
            b.l.f.s r7 = r5.f5660b
            goto L_0x001b
        L_0x0019:
            b.l.f.s r7 = r5.d
        L_0x001b:
            if (r6 == 0) goto L_0x0020
            b.l.f.s r5 = r5.c
            goto L_0x0022
        L_0x0020:
            b.l.f.s r5 = r5.f5661e
        L_0x0022:
            float r6 = r7.f5775b
            int r6 = (int) r6
            int r6 = r15.b(r6)
            float r5 = r5.f5775b
            int r5 = (int) r5
            int r5 = r15.b(r5)
            b.l.f.d0.e.d[] r7 = r15.f5676b
            r9 = r2
            r8 = r3
            r10 = r4
        L_0x0035:
            if (r6 >= r5) goto L_0x005f
            r11 = r7[r6]
            if (r11 == 0) goto L_0x005c
            r11 = r7[r6]
            r11.b()
            int r12 = r11.f5666e
            int r13 = r12 - r8
            if (r13 != 0) goto L_0x0049
            int r9 = r9 + 1
            goto L_0x005c
        L_0x0049:
            if (r13 != r4) goto L_0x0053
            int r10 = java.lang.Math.max(r10, r9)
            int r8 = r11.f5666e
            r9 = r4
            goto L_0x005c
        L_0x0053:
            int r11 = r1.f5659e
            if (r12 < r11) goto L_0x005a
            r7[r6] = r0
            goto L_0x005c
        L_0x005a:
            r9 = r4
            r8 = r12
        L_0x005c:
            int r6 = r6 + 1
            goto L_0x0035
        L_0x005f:
            int r1 = r1.f5659e
            int[] r5 = new int[r1]
            b.l.f.d0.e.d[] r6 = r15.f5676b
            int r7 = r6.length
            r8 = r2
        L_0x0067:
            if (r8 >= r7) goto L_0x0079
            r9 = r6[r8]
            if (r9 == 0) goto L_0x0076
            int r9 = r9.f5666e
            if (r9 >= r1) goto L_0x0076
            r10 = r5[r9]
            int r10 = r10 + r4
            r5[r9] = r10
        L_0x0076:
            int r8 = r8 + 1
            goto L_0x0067
        L_0x0079:
            if (r5 != 0) goto L_0x007c
            return r0
        L_0x007c:
            int r0 = r5.length
            r1 = r2
            r6 = r3
        L_0x007f:
            if (r1 >= r0) goto L_0x008a
            r7 = r5[r1]
            int r6 = java.lang.Math.max(r6, r7)
            int r1 = r1 + 1
            goto L_0x007f
        L_0x008a:
            int r0 = r5.length
            r1 = r2
            r7 = r1
        L_0x008d:
            if (r1 >= r0) goto L_0x0099
            r8 = r5[r1]
            int r9 = r6 - r8
            int r7 = r7 + r9
            if (r8 > 0) goto L_0x0099
            int r1 = r1 + 1
            goto L_0x008d
        L_0x0099:
            b.l.f.d0.e.d[] r0 = r15.f5676b
            r1 = r2
        L_0x009c:
            if (r7 <= 0) goto L_0x00a7
            r8 = r0[r1]
            if (r8 != 0) goto L_0x00a7
            int r7 = r7 + -1
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00a7:
            int r1 = r5.length
            int r1 = r1 - r4
            r8 = r2
        L_0x00aa:
            if (r1 < 0) goto L_0x00b8
            r9 = r5[r1]
            int r9 = r6 - r9
            int r8 = r8 + r9
            r9 = r5[r1]
            if (r9 > 0) goto L_0x00b8
            int r1 = r1 + -1
            goto L_0x00aa
        L_0x00b8:
            int r1 = r0.length
            int r1 = r1 - r4
        L_0x00ba:
            if (r8 <= 0) goto L_0x00c5
            r4 = r0[r1]
            if (r4 != 0) goto L_0x00c5
            int r8 = r8 + -1
            int r1 = r1 + -1
            goto L_0x00ba
        L_0x00c5:
            b.l.f.d0.e.c r0 = r15.a
            boolean r15 = r15.c
            b.l.f.s r1 = r0.f5660b
            b.l.f.s r4 = r0.c
            b.l.f.s r5 = r0.d
            b.l.f.s r6 = r0.f5661e
            if (r7 <= 0) goto L_0x00ef
            if (r15 == 0) goto L_0x00d7
            r9 = r1
            goto L_0x00d8
        L_0x00d7:
            r9 = r5
        L_0x00d8:
            float r10 = r9.f5775b
            int r10 = (int) r10
            int r10 = r10 - r7
            if (r10 >= 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r2 = r10
        L_0x00e0:
            b.l.f.s r7 = new b.l.f.s
            float r9 = r9.a
            float r2 = (float) r2
            r7.<init>(r9, r2)
            if (r15 == 0) goto L_0x00ec
            r1 = r7
            goto L_0x00ef
        L_0x00ec:
            r11 = r1
            r13 = r7
            goto L_0x00f1
        L_0x00ef:
            r11 = r1
            r13 = r5
        L_0x00f1:
            if (r8 <= 0) goto L_0x0113
            if (r15 == 0) goto L_0x00f7
            r1 = r4
            goto L_0x00f8
        L_0x00f7:
            r1 = r6
        L_0x00f8:
            float r2 = r1.f5775b
            int r2 = (int) r2
            int r2 = r2 + r8
            b.l.f.y.b r5 = r0.a
            int r5 = r5.f5812i
            if (r2 < r5) goto L_0x0104
            int r2 = r5 + -1
        L_0x0104:
            b.l.f.s r3 = new b.l.f.s
            float r1 = r1.a
            float r2 = (float) r2
            r3.<init>(r1, r2)
            if (r15 == 0) goto L_0x0110
            r4 = r3
            goto L_0x0113
        L_0x0110:
            r14 = r3
            r12 = r4
            goto L_0x0115
        L_0x0113:
            r12 = r4
            r14 = r6
        L_0x0115:
            b.l.f.d0.e.c r15 = new b.l.f.d0.e.c
            b.l.f.y.b r10 = r0.a
            r9 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.d0.e.j.a(b.l.f.d0.e.h):b.l.f.d0.e.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c4, code lost:
        r6 = b.l.f.d0.e.e.b(r0, r6 + 1, r11);
        java.lang.Long.parseLong(r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d7, code lost:
        r6 = b.l.f.d0.e.e.b(r0, r6 + 1, r11);
        java.lang.Integer.parseInt(r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ea, code lost:
        r6 = b.l.f.d0.e.e.c(r0, r6 + 1, r11);
        r11.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0335, code lost:
        r9 = new java.io.ByteArrayOutputStream();
        r14 = 900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0345, code lost:
        if (r6 == 901) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0349, code lost:
        if (r6 == 924) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x034c, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x034d, code lost:
        r19 = 0;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0354, code lost:
        if (r7 >= r0[0]) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0356, code lost:
        if (r6 != false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0358, code lost:
        r11 = r7 + 1;
        r7 = r0[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x035c, code lost:
        if (r7 >= 900) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x035e, code lost:
        r10 = r10 + 1;
        r19 = (r19 * r14) + ((long) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0366, code lost:
        if (r7 == 928) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0368, code lost:
        switch(r7) {
            case 900: goto L_0x0370;
            case 901: goto L_0x0370;
            case 902: goto L_0x0370;
            default: goto L_0x036b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x036b, code lost:
        switch(r7) {
            case 922: goto L_0x0370;
            case 923: goto L_0x0370;
            case 924: goto L_0x0370;
            default: goto L_0x036e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036e, code lost:
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0370, code lost:
        r7 = r11 - 1;
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0376, code lost:
        if ((r10 % 5) != 0) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0378, code lost:
        if (r10 <= 0) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x037a, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x037b, code lost:
        if (r10 >= 6) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x037d, code lost:
        r9.write((byte) ((int) (r19 >> ((5 - r10) * 8))));
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x038b, code lost:
        r14 = 900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x038f, code lost:
        r14 = 900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0392, code lost:
        r6 = r7;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0396, code lost:
        r6 = new int[6];
        r10 = r7 + 1;
        r7 = r0[r7];
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x039d, code lost:
        r14 = r11;
        r19 = 0;
        r15 = 0;
        r11 = r10;
        r10 = r7;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a6, code lost:
        if (r11 >= r0[r15]) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a8, code lost:
        if (r14 != false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03aa, code lost:
        r8 = r7 + 1;
        r6[r7] = r10;
        r23 = r14;
        r19 = (r19 * 900) + ((long) r10);
        r10 = r11 + 1;
        r7 = r0[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03bb, code lost:
        if (r7 == 928) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03bd, code lost:
        switch(r7) {
            case 900: goto L_0x03e8;
            case 901: goto L_0x03e8;
            case 902: goto L_0x03e8;
            default: goto L_0x03c0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c0, code lost:
        switch(r7) {
            case 922: goto L_0x03e8;
            case 923: goto L_0x03e8;
            case 924: goto L_0x03e8;
            default: goto L_0x03c3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c5, code lost:
        if ((r8 % 5) != 0) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c7, code lost:
        if (r8 <= 0) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03c9, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03cb, code lost:
        if (r8 >= 6) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03cd, code lost:
        r9.write((byte) ((int) (r19 >> ((5 - r8) * 8))));
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03db, code lost:
        r11 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03e0, code lost:
        r11 = r10;
        r14 = r23;
        r15 = 0;
        r10 = r7;
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03e8, code lost:
        r11 = r10 - 1;
        r10 = r7;
        r7 = r8;
        r14 = true;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f0, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03f3, code lost:
        if (r11 != r0[0]) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f7, code lost:
        if (r10 >= 900) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f9, code lost:
        r12 = r7 + 1;
        r6[r7] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03fe, code lost:
        r12 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03ff, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0400, code lost:
        if (r7 >= r12) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0402, code lost:
        r9.write((byte) r6[r7]);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x040b, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x040c, code lost:
        r3.append(new java.lang.String(r9.toByteArray(), r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x041e, code lost:
        r6 = b.l.f.d0.e.e.c(r0, r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0249, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.f.y.e b(int[] r25, int r26, int[] r27) {
        /*
            r0 = r25
            r1 = r27
            int r2 = r0.length
            if (r2 == 0) goto L_0x046c
            int r2 = r26 + 1
            r3 = 1
            int r2 = r3 << r2
            if (r1 == 0) goto L_0x0015
            int r4 = r1.length
            int r5 = r2 / 2
            int r5 = r5 + 3
            if (r4 > r5) goto L_0x0467
        L_0x0015:
            if (r2 < 0) goto L_0x0467
            r4 = 512(0x200, float:7.175E-43)
            if (r2 > r4) goto L_0x0467
            b.l.f.d0.e.k.a r4 = a
            b.l.f.d0.e.k.c r5 = new b.l.f.d0.e.k.c
            b.l.f.d0.e.k.b r6 = r4.a
            r5.<init>(r6, r0)
            int[] r6 = new int[r2]
            r7 = 0
            r8 = r2
            r9 = r7
        L_0x0029:
            if (r8 <= 0) goto L_0x003f
            b.l.f.d0.e.k.b r10 = r4.a
            int[] r10 = r10.a
            r10 = r10[r8]
            int r10 = r5.b(r10)
            int r11 = r2 - r8
            r6[r11] = r10
            if (r10 == 0) goto L_0x003c
            r9 = r3
        L_0x003c:
            int r8 = r8 + -1
            goto L_0x0029
        L_0x003f:
            r5 = 2
            if (r9 != 0) goto L_0x0044
            goto L_0x0200
        L_0x0044:
            b.l.f.d0.e.k.b r8 = r4.a
            b.l.f.d0.e.k.c r8 = r8.d
            if (r1 == 0) goto L_0x006f
            int r9 = r1.length
            r10 = r7
        L_0x004c:
            if (r10 >= r9) goto L_0x006f
            r11 = r1[r10]
            b.l.f.d0.e.k.b r12 = r4.a
            int r13 = r0.length
            int r13 = r13 - r3
            int r13 = r13 - r11
            int[] r11 = r12.a
            r11 = r11[r13]
            b.l.f.d0.e.k.c r13 = new b.l.f.d0.e.k.c
            int[] r14 = new int[r5]
            int r11 = r12.e(r7, r11)
            r14[r7] = r11
            r14[r3] = r3
            r13.<init>(r12, r14)
            b.l.f.d0.e.k.c r8 = r8.g(r13)
            int r10 = r10 + 1
            goto L_0x004c
        L_0x006f:
            b.l.f.d0.e.k.c r8 = new b.l.f.d0.e.k.c
            b.l.f.d0.e.k.b r9 = r4.a
            r8.<init>(r9, r6)
            b.l.f.d0.e.k.b r6 = r4.a
            b.l.f.d0.e.k.c r6 = r6.b(r2, r3)
            int r9 = r6.d()
            int r10 = r8.d()
            if (r9 >= r10) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            r24 = r8
            r8 = r6
            r6 = r24
        L_0x008c:
            b.l.f.d0.e.k.b r9 = r4.a
            b.l.f.d0.e.k.c r10 = r9.c
            b.l.f.d0.e.k.c r9 = r9.d
        L_0x0092:
            r24 = r8
            r8 = r6
            r6 = r24
            int r11 = r8.d()
            int r12 = r2 / 2
            if (r11 < r12) goto L_0x0139
            boolean r11 = r8.e()
            if (r11 != 0) goto L_0x0134
            b.l.f.d0.e.k.b r11 = r4.a
            b.l.f.d0.e.k.c r11 = r11.c
            int r12 = r8.d()
            int r12 = r8.c(r12)
            b.l.f.d0.e.k.b r13 = r4.a
            int r12 = r13.c(r12)
        L_0x00b7:
            int r13 = r6.d()
            int r14 = r8.d()
            if (r13 < r14) goto L_0x0121
            boolean r13 = r6.e()
            if (r13 != 0) goto L_0x0121
            int r13 = r6.d()
            int r14 = r8.d()
            int r13 = r13 - r14
            b.l.f.d0.e.k.b r14 = r4.a
            int r15 = r6.d()
            int r15 = r6.c(r15)
            int r14 = r14.d(r15, r12)
            b.l.f.d0.e.k.b r15 = r4.a
            b.l.f.d0.e.k.c r15 = r15.b(r13, r14)
            b.l.f.d0.e.k.c r11 = r11.a(r15)
            if (r13 < 0) goto L_0x011b
            if (r14 != 0) goto L_0x00f1
            b.l.f.d0.e.k.b r13 = r8.a
            b.l.f.d0.e.k.c r13 = r13.c
            goto L_0x0113
        L_0x00f1:
            int[] r15 = r8.f5679b
            int r15 = r15.length
            int r13 = r13 + r15
            int[] r13 = new int[r13]
            r3 = r7
        L_0x00f8:
            if (r3 >= r15) goto L_0x010b
            b.l.f.d0.e.k.b r5 = r8.a
            int[] r7 = r8.f5679b
            r7 = r7[r3]
            int r5 = r5.d(r7, r14)
            r13[r3] = r5
            int r3 = r3 + 1
            r5 = 2
            r7 = 0
            goto L_0x00f8
        L_0x010b:
            b.l.f.d0.e.k.c r3 = new b.l.f.d0.e.k.c
            b.l.f.d0.e.k.b r5 = r8.a
            r3.<init>(r5, r13)
            r13 = r3
        L_0x0113:
            b.l.f.d0.e.k.c r6 = r6.i(r13)
            r3 = 1
            r5 = 2
            r7 = 0
            goto L_0x00b7
        L_0x011b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0121:
            b.l.f.d0.e.k.c r3 = r11.g(r9)
            b.l.f.d0.e.k.c r3 = r3.i(r10)
            b.l.f.d0.e.k.c r3 = r3.h()
            r10 = r9
            r5 = 2
            r7 = 0
            r9 = r3
            r3 = 1
            goto L_0x0092
        L_0x0134:
            b.l.f.d r0 = b.l.f.d.a()
            throw r0
        L_0x0139:
            r3 = r7
            int r5 = r9.c(r3)
            if (r5 == 0) goto L_0x0462
            b.l.f.d0.e.k.b r6 = r4.a
            int r5 = r6.c(r5)
            b.l.f.d0.e.k.c r6 = r9.f(r5)
            b.l.f.d0.e.k.c r5 = r8.f(r5)
            r7 = 2
            b.l.f.d0.e.k.c[] r8 = new b.l.f.d0.e.k.c[r7]
            r8[r3] = r6
            r6 = 1
            r8[r6] = r5
            r5 = r8[r3]
            r3 = r8[r6]
            int r6 = r5.d()
            int[] r7 = new int[r6]
            r8 = 1
            r9 = 0
        L_0x0162:
            b.l.f.d0.e.k.b r10 = r4.a
            java.util.Objects.requireNonNull(r10)
            r10 = 929(0x3a1, float:1.302E-42)
            if (r8 >= r10) goto L_0x0180
            if (r9 >= r6) goto L_0x0180
            int r10 = r5.b(r8)
            if (r10 != 0) goto L_0x017d
            b.l.f.d0.e.k.b r10 = r4.a
            int r10 = r10.c(r8)
            r7[r9] = r10
            int r9 = r9 + 1
        L_0x017d:
            int r8 = r8 + 1
            goto L_0x0162
        L_0x0180:
            if (r9 != r6) goto L_0x045d
            int r8 = r5.d()
            int[] r9 = new int[r8]
            r10 = 1
        L_0x0189:
            if (r10 > r8) goto L_0x019c
            int r11 = r8 - r10
            b.l.f.d0.e.k.b r12 = r4.a
            int r13 = r5.c(r10)
            int r12 = r12.d(r10, r13)
            r9[r11] = r12
            int r10 = r10 + 1
            goto L_0x0189
        L_0x019c:
            b.l.f.d0.e.k.c r5 = new b.l.f.d0.e.k.c
            b.l.f.d0.e.k.b r8 = r4.a
            r5.<init>(r8, r9)
            int[] r8 = new int[r6]
            r9 = 0
        L_0x01a6:
            if (r9 >= r6) goto L_0x01d0
            b.l.f.d0.e.k.b r10 = r4.a
            r11 = r7[r9]
            int r10 = r10.c(r11)
            b.l.f.d0.e.k.b r11 = r4.a
            int r12 = r3.b(r10)
            r13 = 0
            int r11 = r11.e(r13, r12)
            b.l.f.d0.e.k.b r12 = r4.a
            int r10 = r5.b(r10)
            int r10 = r12.c(r10)
            b.l.f.d0.e.k.b r12 = r4.a
            int r10 = r12.d(r11, r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x01a6
        L_0x01d0:
            r3 = 0
        L_0x01d1:
            if (r3 >= r6) goto L_0x0200
            int r5 = r0.length
            r9 = 1
            int r5 = r5 - r9
            b.l.f.d0.e.k.b r9 = r4.a
            r10 = r7[r3]
            java.util.Objects.requireNonNull(r9)
            if (r10 == 0) goto L_0x01fa
            int[] r9 = r9.f5678b
            r9 = r9[r10]
            int r5 = r5 - r9
            if (r5 < 0) goto L_0x01f5
            b.l.f.d0.e.k.b r9 = r4.a
            r10 = r0[r5]
            r11 = r8[r3]
            int r9 = r9.e(r10, r11)
            r0[r5] = r9
            int r3 = r3 + 1
            goto L_0x01d1
        L_0x01f5:
            b.l.f.d r0 = b.l.f.d.a()
            throw r0
        L_0x01fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0200:
            int r3 = r0.length
            r4 = 4
            if (r3 < r4) goto L_0x0458
            r3 = 0
            r4 = r0[r3]
            int r5 = r0.length
            if (r4 > r5) goto L_0x0453
            if (r4 != 0) goto L_0x0219
            int r4 = r0.length
            if (r2 >= r4) goto L_0x0214
            int r4 = r0.length
            int r4 = r4 - r2
            r0[r3] = r4
            goto L_0x0219
        L_0x0214:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x0219:
            java.lang.String r2 = java.lang.String.valueOf(r26)
            char[] r3 = b.l.f.d0.e.e.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r0.length
            r5 = 1
            int r4 = r4 << r5
            r3.<init>(r4)
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1
            r6 = r0[r5]
            b.l.f.d0.c r5 = new b.l.f.d0.c
            r5.<init>()
            r7 = 2
            r8 = 0
        L_0x0232:
            r9 = r0[r8]
            if (r7 >= r9) goto L_0x043a
            r8 = 913(0x391, float:1.28E-42)
            if (r6 == r8) goto L_0x0423
            switch(r6) {
                case 900: goto L_0x0250;
                case 901: goto L_0x024c;
                case 902: goto L_0x0245;
                default: goto L_0x023d;
            }
        L_0x023d:
            switch(r6) {
                case 922: goto L_0x0419;
                case 923: goto L_0x0419;
                case 924: goto L_0x024c;
                case 925: goto L_0x032f;
                case 926: goto L_0x0329;
                case 927: goto L_0x0315;
                case 928: goto L_0x0253;
                default: goto L_0x0240;
            }
        L_0x0240:
            r8 = 0
            int r7 = r7 + -1
            goto L_0x041e
        L_0x0245:
            int r6 = b.l.f.d0.e.e.b(r0, r7, r3)
        L_0x0249:
            r8 = 0
            goto L_0x042c
        L_0x024c:
            r8 = 2
            r11 = 1
            goto L_0x0335
        L_0x0250:
            r8 = 0
            goto L_0x041e
        L_0x0253:
            int r6 = r7 + 2
            r8 = 0
            r9 = r0[r8]
            if (r6 > r9) goto L_0x0310
            r8 = 2
            int[] r6 = new int[r8]
            r9 = 0
        L_0x025e:
            if (r9 >= r8) goto L_0x0269
            r10 = r0[r7]
            r6[r9] = r10
            int r9 = r9 + 1
            int r7 = r7 + 1
            goto L_0x025e
        L_0x0269:
            java.lang.String r6 = b.l.f.d0.e.e.a(r6, r8)
            java.lang.Integer.parseInt(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = b.l.f.d0.e.e.c(r0, r7, r6)
            r6.toString()
            r6 = r0[r7]
            r9 = 923(0x39b, float:1.293E-42)
            r10 = -1
            if (r6 != r9) goto L_0x028c
            int r6 = r7 + 1
            r11 = 0
            r24 = r7
            r7 = r6
            r6 = r24
            goto L_0x028f
        L_0x028c:
            r6 = r7
            r7 = r10
        L_0x028e:
            r11 = 0
        L_0x028f:
            r12 = r0[r11]
            if (r6 >= r12) goto L_0x02ff
            r11 = r0[r6]
            r12 = 922(0x39a, float:1.292E-42)
            if (r11 == r12) goto L_0x02f9
            if (r11 != r9) goto L_0x02f4
            int r6 = r6 + 1
            r11 = r0[r6]
            switch(r11) {
                case 0: goto L_0x02e5;
                case 1: goto L_0x02d2;
                case 2: goto L_0x02bf;
                case 3: goto L_0x02b9;
                case 4: goto L_0x02b3;
                case 5: goto L_0x02ad;
                case 6: goto L_0x02a7;
                default: goto L_0x02a2;
            }
        L_0x02a2:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x02a7:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            goto L_0x02d7
        L_0x02ad:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            goto L_0x02c4
        L_0x02b3:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            goto L_0x02ea
        L_0x02b9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            goto L_0x02ea
        L_0x02bf:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L_0x02c4:
            int r6 = r6 + 1
            int r6 = b.l.f.d0.e.e.b(r0, r6, r11)
            java.lang.String r11 = r11.toString()
            java.lang.Long.parseLong(r11)
            goto L_0x028e
        L_0x02d2:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L_0x02d7:
            int r6 = r6 + 1
            int r6 = b.l.f.d0.e.e.b(r0, r6, r11)
            java.lang.String r11 = r11.toString()
            java.lang.Integer.parseInt(r11)
            goto L_0x028e
        L_0x02e5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L_0x02ea:
            int r6 = r6 + 1
            int r6 = b.l.f.d0.e.e.c(r0, r6, r11)
            r11.toString()
            goto L_0x028e
        L_0x02f4:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x02f9:
            int r6 = r6 + 1
            r11 = 1
            r5.a = r11
            goto L_0x028e
        L_0x02ff:
            r11 = 1
            if (r7 == r10) goto L_0x0249
            int r9 = r6 - r7
            boolean r10 = r5.a
            if (r10 == 0) goto L_0x030a
            int r9 = r9 + -1
        L_0x030a:
            int r9 = r9 + r7
            java.util.Arrays.copyOfRange(r0, r7, r9)
            goto L_0x0249
        L_0x0310:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x0315:
            r8 = 2
            r11 = 1
            int r6 = r7 + 1
            r4 = r0[r7]
            b.l.f.y.d r4 = b.l.f.y.d.d(r4)
            java.lang.String r4 = r4.name()
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            goto L_0x0249
        L_0x0329:
            r8 = 2
            r11 = 1
            int r6 = r7 + 2
            goto L_0x0249
        L_0x032f:
            r8 = 2
            r11 = 1
            int r6 = r7 + 1
            goto L_0x0249
        L_0x0335:
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            r10 = 901(0x385, float:1.263E-42)
            r12 = 928(0x3a0, float:1.3E-42)
            r13 = 6
            r14 = 900(0x384, double:4.447E-321)
            r16 = 0
            r8 = 900(0x384, float:1.261E-42)
            if (r6 == r10) goto L_0x0396
            r10 = 924(0x39c, float:1.295E-42)
            if (r6 == r10) goto L_0x034c
            goto L_0x0392
        L_0x034c:
            r6 = 0
        L_0x034d:
            r19 = r16
            r10 = 0
        L_0x0350:
            r18 = 0
            r11 = r0[r18]
            if (r7 >= r11) goto L_0x0392
            if (r6 != 0) goto L_0x0392
            int r11 = r7 + 1
            r7 = r0[r7]
            if (r7 >= r8) goto L_0x0366
            int r10 = r10 + 1
            long r19 = r19 * r14
            long r14 = (long) r7
            long r19 = r19 + r14
            goto L_0x036e
        L_0x0366:
            if (r7 == r12) goto L_0x0370
            switch(r7) {
                case 900: goto L_0x0370;
                case 901: goto L_0x0370;
                case 902: goto L_0x0370;
                default: goto L_0x036b;
            }
        L_0x036b:
            switch(r7) {
                case 922: goto L_0x0370;
                case 923: goto L_0x0370;
                case 924: goto L_0x0370;
                default: goto L_0x036e;
            }
        L_0x036e:
            r7 = r11
            goto L_0x0374
        L_0x0370:
            int r11 = r11 + -1
            r7 = r11
            r6 = 1
        L_0x0374:
            int r11 = r10 % 5
            if (r11 != 0) goto L_0x038f
            if (r10 <= 0) goto L_0x038f
            r10 = 0
        L_0x037b:
            if (r10 >= r13) goto L_0x038b
            int r11 = 5 - r10
            int r11 = r11 * 8
            long r14 = r19 >> r11
            int r11 = (int) r14
            byte r11 = (byte) r11
            r9.write(r11)
            int r10 = r10 + 1
            goto L_0x037b
        L_0x038b:
            r11 = 1
            r14 = 900(0x384, double:4.447E-321)
            goto L_0x034d
        L_0x038f:
            r14 = 900(0x384, double:4.447E-321)
            goto L_0x0350
        L_0x0392:
            r6 = r7
            r8 = 0
            goto L_0x040c
        L_0x0396:
            int[] r6 = new int[r13]
            int r10 = r7 + 1
            r7 = r0[r7]
            r11 = 0
        L_0x039d:
            r14 = r11
            r19 = r16
            r15 = 0
            r11 = r10
            r10 = r7
            r7 = 0
        L_0x03a4:
            r8 = r0[r15]
            if (r11 >= r8) goto L_0x03f0
            if (r14 != 0) goto L_0x03f0
            int r8 = r7 + 1
            r6[r7] = r10
            r21 = 900(0x384, double:4.447E-321)
            long r19 = r19 * r21
            r23 = r14
            long r13 = (long) r10
            long r19 = r19 + r13
            int r10 = r11 + 1
            r7 = r0[r11]
            if (r7 == r12) goto L_0x03e8
            switch(r7) {
                case 900: goto L_0x03e8;
                case 901: goto L_0x03e8;
                case 902: goto L_0x03e8;
                default: goto L_0x03c0;
            }
        L_0x03c0:
            switch(r7) {
                case 922: goto L_0x03e8;
                case 923: goto L_0x03e8;
                case 924: goto L_0x03e8;
                default: goto L_0x03c3;
            }
        L_0x03c3:
            int r11 = r8 % 5
            if (r11 != 0) goto L_0x03e0
            if (r8 <= 0) goto L_0x03e0
            r8 = 0
            r13 = 6
        L_0x03cb:
            if (r8 >= r13) goto L_0x03db
            int r11 = 5 - r8
            int r11 = r11 * 8
            long r14 = r19 >> r11
            int r11 = (int) r14
            byte r11 = (byte) r11
            r9.write(r11)
            int r8 = r8 + 1
            goto L_0x03cb
        L_0x03db:
            r11 = r23
            r8 = 900(0x384, float:1.261E-42)
            goto L_0x039d
        L_0x03e0:
            r13 = 6
            r11 = r10
            r14 = r23
            r15 = 0
            r10 = r7
            r7 = r8
            goto L_0x03a4
        L_0x03e8:
            r13 = 6
            int r11 = r10 + -1
            r10 = r7
            r7 = r8
            r14 = 1
            r15 = 0
            goto L_0x03a4
        L_0x03f0:
            r8 = 0
            r12 = r0[r8]
            if (r11 != r12) goto L_0x03fe
            r12 = 900(0x384, float:1.261E-42)
            if (r10 >= r12) goto L_0x03fe
            int r12 = r7 + 1
            r6[r7] = r10
            goto L_0x03ff
        L_0x03fe:
            r12 = r7
        L_0x03ff:
            r7 = r8
        L_0x0400:
            if (r7 >= r12) goto L_0x040b
            r10 = r6[r7]
            byte r10 = (byte) r10
            r9.write(r10)
            int r7 = r7 + 1
            goto L_0x0400
        L_0x040b:
            r6 = r11
        L_0x040c:
            java.lang.String r7 = new java.lang.String
            byte[] r9 = r9.toByteArray()
            r7.<init>(r9, r4)
            r3.append(r7)
            goto L_0x042c
        L_0x0419:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x041e:
            int r6 = b.l.f.d0.e.e.c(r0, r7, r3)
            goto L_0x042c
        L_0x0423:
            r8 = 0
            int r6 = r7 + 1
            r7 = r0[r7]
            char r7 = (char) r7
            r3.append(r7)
        L_0x042c:
            int r7 = r0.length
            if (r6 >= r7) goto L_0x0435
            int r7 = r6 + 1
            r6 = r0[r6]
            goto L_0x0232
        L_0x0435:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x043a:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x044e
            b.l.f.y.e r0 = new b.l.f.y.e
            java.lang.String r3 = r3.toString()
            r4 = 0
            r0.<init>(r4, r3, r4, r2)
            r0.f = r5
            int r1 = r1.length
            return r0
        L_0x044e:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x0453:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x0458:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x045d:
            b.l.f.d r0 = b.l.f.d.a()
            throw r0
        L_0x0462:
            b.l.f.d r0 = b.l.f.d.a()
            throw r0
        L_0x0467:
            b.l.f.d r0 = b.l.f.d.a()
            throw r0
        L_0x046c:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.d0.e.j.b(int[], int, int[]):b.l.f.y.e");
    }

    public static d c(b bVar, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        int i8;
        b bVar2 = bVar;
        int i9 = i2;
        int i10 = i3;
        int i11 = i5;
        int i12 = z ? -1 : 1;
        boolean z2 = z;
        int i13 = i4;
        int i14 = 0;
        loop0:
        while (true) {
            if (i14 >= 2) {
                break;
            }
            while (true) {
                if (!z2) {
                    if (i13 >= i10) {
                        continue;
                        break;
                    }
                } else if (i13 < i9) {
                    continue;
                    break;
                }
                if (z2 != bVar2.b(i13, i11)) {
                    continue;
                    break;
                } else if (Math.abs(i4 - i13) > 2) {
                    i13 = i4;
                    break loop0;
                } else {
                    i13 += i12;
                }
            }
            i12 = -i12;
            z2 = !z2;
            i14++;
        }
        int[] iArr = new int[8];
        int i15 = z ? 1 : -1;
        boolean z3 = z;
        int i16 = 0;
        int i17 = i13;
        while (true) {
            if (!z) {
                if (i17 < i9) {
                    break;
                }
            } else if (i17 >= i10) {
                break;
            }
            if (i16 >= 8) {
                break;
            } else if (bVar2.b(i17, i11) == z3) {
                iArr[i16] = iArr[i16] + 1;
                i17 += i15;
            } else {
                i16++;
                z3 = !z3;
            }
        }
        if (i16 != 8) {
            if (z) {
                i9 = i10;
            }
            if (!(i17 == i9 && i16 == 7)) {
                iArr = null;
            }
        }
        if (iArr == null) {
            return null;
        }
        int o0 = g.o0(iArr);
        if (z) {
            i8 = i13 + o0;
        } else {
            for (int i18 = 0; i18 < iArr.length / 2; i18++) {
                int i19 = iArr[i18];
                iArr[i18] = iArr[(iArr.length - 1) - i18];
                iArr[(iArr.length - 1) - i18] = i19;
            }
            int i20 = i13;
            i13 -= o0;
            i8 = i20;
        }
        if (!(i6 + -2 <= o0 && o0 <= i7 + 2)) {
            return null;
        }
        float[][] fArr = i.a;
        float o02 = (float) g.o0(iArr);
        int[] iArr2 = new int[8];
        int i21 = 0;
        int i22 = 0;
        for (int i23 = 0; i23 < 17; i23++) {
            if (((float) (iArr[i21] + i22)) <= ((((float) i23) * o02) / 17.0f) + (o02 / 34.0f)) {
                i22 += iArr[i21];
                i21++;
            }
            iArr2[i21] = iArr2[i21] + 1;
        }
        long j2 = 0;
        for (int i24 = 0; i24 < 8; i24++) {
            for (int i25 = 0; i25 < iArr2[i24]; i25++) {
                j2 = (j2 << 1) | ((long) (i24 % 2 == 0 ? 1 : 0));
            }
        }
        int i26 = (int) j2;
        if (b.l.f.d0.a.a(i26) == -1) {
            i26 = -1;
        }
        if (i26 == -1) {
            int o03 = g.o0(iArr);
            float[] fArr2 = new float[8];
            if (o03 > 1) {
                for (int i27 = 0; i27 < 8; i27++) {
                    fArr2[i27] = ((float) iArr[i27]) / ((float) o03);
                }
            }
            float f = Float.MAX_VALUE;
            i26 = -1;
            int i28 = 0;
            while (true) {
                float[][] fArr3 = i.a;
                if (i28 >= fArr3.length) {
                    break;
                }
                float f2 = 0.0f;
                float[] fArr4 = fArr3[i28];
                for (int i29 = 0; i29 < 8; i29++) {
                    float f3 = fArr4[i29] - fArr2[i29];
                    f2 += f3 * f3;
                    if (f2 >= f) {
                        break;
                    }
                }
                if (f2 < f) {
                    i26 = b.l.f.d0.a.f5657b[i28];
                    f = f2;
                }
                i28++;
            }
        }
        int a2 = b.l.f.d0.a.a(i26);
        if (a2 == -1) {
            return null;
        }
        int[] iArr3 = new int[8];
        int i30 = 0;
        int i31 = 7;
        while (true) {
            int i32 = i26 & 1;
            if (i32 != i30) {
                i31--;
                if (i31 < 0) {
                    return new d(i13, i8, ((((iArr3[0] - iArr3[2]) + iArr3[4]) - iArr3[6]) + 9) % 9, a2);
                }
                i30 = i32;
            }
            iArr3[i31] = iArr3[i31] + 1;
            i26 >>= 1;
        }
    }

    public static h d(b bVar, c cVar, s sVar, boolean z, int i2, int i3) {
        int i4;
        c cVar2 = cVar;
        s sVar2 = sVar;
        boolean z2 = z;
        h hVar = new h(cVar2, z2);
        int i5 = 0;
        while (i5 < 2) {
            int i6 = i5 == 0 ? 1 : -1;
            int i7 = (int) sVar2.a;
            int i8 = (int) sVar2.f5775b;
            while (i8 <= cVar2.f5664i && i8 >= cVar2.f5663h) {
                d c = c(bVar, 0, bVar.f5811h, z, i7, i8, i2, i3);
                if (c != null) {
                    hVar.f5676b[i8 - hVar.a.f5663h] = c;
                    if (z2) {
                        i4 = c.a;
                    } else {
                        i4 = c.f5665b;
                    }
                    i7 = i4;
                }
                i8 += i6;
            }
            i5++;
        }
        return hVar;
    }

    public static boolean e(f fVar, int i2) {
        return i2 >= 0 && i2 <= fVar.d + 1;
    }
}
