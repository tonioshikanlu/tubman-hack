package b.l.f.c0;

import b.l.f.d;

public final class g extends r {
    public static final char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    public static final int[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f5637e;
    public final StringBuilder a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5638b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        d = iArr;
        f5637e = iArr[47];
    }

    public static void i(CharSequence charSequence, int i2, int i3) {
        int i4 = 0;
        int i5 = 1;
        for (int i6 = i2 - 1; i6 >= 0; i6--) {
            i4 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i6)) * i5;
            i5++;
            if (i5 > i3) {
                i5 = 1;
            }
        }
        if (charSequence.charAt(i2) != c[i4 % 47]) {
            throw d.a();
        }
    }

    public static int j(int[] iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int round = Math.round((((float) iArr[i5]) * 9.0f) / ((float) i2));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i5 & 1) == 0) {
                for (int i6 = 0; i6 < round; i6++) {
                    i4 = (i4 << 1) | 1;
                }
            } else {
                i4 <<= round;
            }
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r8 = c[r9];
        r7.append(r8);
        r9 = r6.length;
        r10 = 0;
        r12 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r10 >= r9) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        r12 = r12 + r6[r10];
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9 = r1.g(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r8 != '*') goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r7.deleteCharAt(r7.length() - 1);
        r8 = r6.length;
        r10 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (r10 >= r8) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        r12 = r12 + r6[r10];
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        if (r9 == r5) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (r1.f(r9) == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r7.length() < 2) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r1 = r7.length();
        i(r7, r1 - 2, 20);
        i(r7, r1 - 1, 15);
        r7.setLength(r7.length() - 2);
        r1 = r7.length();
        r5 = new java.lang.StringBuilder(r1);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        if (r6 >= r1) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        r8 = r7.charAt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        if (r8 < 'a') goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
        if (r8 > 'd') goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (r6 >= (r1 - 1)) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        r6 = r6 + 1;
        r9 = r7.charAt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dd, code lost:
        switch(r8) {
            case 97: goto L_0x014a;
            case 98: goto L_0x0101;
            case 99: goto L_0x00ef;
            case 100: goto L_0x00e2;
            default: goto L_0x00e0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        if (r9 < 'A') goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        if (r9 > 'Z') goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
        r9 = r9 + ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ee, code lost:
        throw b.l.f.h.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        if (r9 < 'A') goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f1, code lost:
        if (r9 > 'O') goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f3, code lost:
        r9 = r9 - ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f6, code lost:
        if (r9 != 'Z') goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f8, code lost:
        r8 = ':';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
        throw b.l.f.h.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0101, code lost:
        if (r9 < 'A') goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        if (r9 > 'E') goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0107, code lost:
        r9 = r9 - '&';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010c, code lost:
        if (r9 < 'F') goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0110, code lost:
        if (r9 > 'J') goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0112, code lost:
        r9 = r9 - 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0117, code lost:
        if (r9 < 'K') goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0119, code lost:
        if (r9 > 'O') goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011b, code lost:
        r9 = r9 + 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0120, code lost:
        if (r9 < 'P') goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0124, code lost:
        if (r9 > 'T') goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0126, code lost:
        r9 = r9 + '+';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012b, code lost:
        if (r9 != 'U') goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0130, code lost:
        if (r9 != 'V') goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0132, code lost:
        r8 = '@';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0137, code lost:
        if (r9 != 'W') goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0139, code lost:
        r8 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013e, code lost:
        if (r9 < 'X') goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0140, code lost:
        if (r9 > 'Z') goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0142, code lost:
        r8 = 127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0149, code lost:
        throw b.l.f.h.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        if (r9 < 'A') goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014c, code lost:
        if (r9 > 'Z') goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014e, code lost:
        r9 = r9 - '@';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0150, code lost:
        r8 = (char) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0156, code lost:
        throw b.l.f.h.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0157, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x015d, code lost:
        throw b.l.f.h.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015e, code lost:
        r5.append(r8);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0164, code lost:
        r9 = (float) r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0190, code lost:
        return new b.l.f.q(r5.toString(), (byte[]) null, new b.l.f.s[]{new b.l.f.s(((float) (r2[1] + r2[0])) / 2.0f, r9), new b.l.f.s((((float) r12) / 2.0f) + ((float) r4), r9)}, b.l.f.a.CODE_93);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0193, code lost:
        throw b.l.f.m.f5759j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0196, code lost:
        throw b.l.f.m.f5759j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.q d(int r17, b.l.f.y.a r18, java.util.Map<b.l.f.e, ?> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            int r2 = r1.f5810i
            r3 = 0
            int r4 = r1.g(r3)
            int[] r5 = r0.f5638b
            java.util.Arrays.fill(r5, r3)
            int[] r5 = r0.f5638b
            int r6 = r5.length
            r8 = r3
            r9 = r8
            r7 = r4
        L_0x0016:
            if (r4 >= r2) goto L_0x01c7
            boolean r10 = r1.f(r4)
            r11 = 1
            if (r10 == r8) goto L_0x0028
            r10 = r5[r9]
            int r10 = r10 + r11
            r5[r9] = r10
            r10 = r17
            goto L_0x01c3
        L_0x0028:
            int r10 = r6 + -1
            if (r9 != r10) goto L_0x01bb
            int r10 = j(r5)
            int r12 = f5637e
            r13 = 2
            if (r10 != r12) goto L_0x01a8
            int[] r2 = new int[r13]
            r2[r3] = r7
            r2[r11] = r4
            r4 = r2[r11]
            int r4 = r1.g(r4)
            int r5 = r1.f5810i
            int[] r6 = r0.f5638b
            java.util.Arrays.fill(r6, r3)
            java.lang.StringBuilder r7 = r0.a
            r7.setLength(r3)
        L_0x004d:
            b.l.f.c0.r.g(r1, r4, r6)
            int r8 = j(r6)
            if (r8 < 0) goto L_0x01a5
            r9 = r3
        L_0x0057:
            int[] r10 = d
            int r12 = r10.length
            if (r9 >= r12) goto L_0x01a2
            r10 = r10[r9]
            if (r10 != r8) goto L_0x019c
            char[] r8 = c
            char r8 = r8[r9]
            r7.append(r8)
            int r9 = r6.length
            r10 = r3
            r12 = r4
        L_0x006a:
            if (r10 >= r9) goto L_0x0072
            r14 = r6[r10]
            int r12 = r12 + r14
            int r10 = r10 + 1
            goto L_0x006a
        L_0x0072:
            int r9 = r1.g(r12)
            r10 = 42
            if (r8 != r10) goto L_0x0197
            int r8 = r7.length()
            int r8 = r8 - r11
            r7.deleteCharAt(r8)
            int r8 = r6.length
            r10 = r3
            r12 = r10
        L_0x0085:
            if (r10 >= r8) goto L_0x008d
            r14 = r6[r10]
            int r12 = r12 + r14
            int r10 = r10 + 1
            goto L_0x0085
        L_0x008d:
            if (r9 == r5) goto L_0x0194
            boolean r1 = r1.f(r9)
            if (r1 == 0) goto L_0x0194
            int r1 = r7.length()
            if (r1 < r13) goto L_0x0191
            int r1 = r7.length()
            int r5 = r1 + -2
            r6 = 20
            i(r7, r5, r6)
            int r1 = r1 + -1
            r5 = 15
            i(r7, r1, r5)
            int r1 = r7.length()
            int r1 = r1 - r13
            r7.setLength(r1)
            int r1 = r7.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r6 = r3
        L_0x00bf:
            if (r6 >= r1) goto L_0x0164
            char r8 = r7.charAt(r6)
            r9 = 97
            if (r8 < r9) goto L_0x015e
            r9 = 100
            if (r8 > r9) goto L_0x015e
            int r9 = r1 + -1
            if (r6 >= r9) goto L_0x0159
            int r6 = r6 + 1
            char r9 = r7.charAt(r6)
            r10 = 79
            r14 = 90
            r15 = 65
            switch(r8) {
                case 97: goto L_0x014a;
                case 98: goto L_0x0101;
                case 99: goto L_0x00ef;
                case 100: goto L_0x00e2;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            goto L_0x0157
        L_0x00e2:
            if (r9 < r15) goto L_0x00ea
            if (r9 > r14) goto L_0x00ea
            int r9 = r9 + 32
            goto L_0x0150
        L_0x00ea:
            b.l.f.h r1 = b.l.f.h.a()
            throw r1
        L_0x00ef:
            if (r9 < r15) goto L_0x00f6
            if (r9 > r10) goto L_0x00f6
            int r9 = r9 + -32
            goto L_0x0150
        L_0x00f6:
            if (r9 != r14) goto L_0x00fc
            r8 = 58
            goto L_0x015e
        L_0x00fc:
            b.l.f.h r1 = b.l.f.h.a()
            throw r1
        L_0x0101:
            if (r9 < r15) goto L_0x010a
            r8 = 69
            if (r9 > r8) goto L_0x010a
            int r9 = r9 + -38
            goto L_0x0150
        L_0x010a:
            r8 = 70
            if (r9 < r8) goto L_0x0115
            r8 = 74
            if (r9 > r8) goto L_0x0115
            int r9 = r9 + -11
            goto L_0x0150
        L_0x0115:
            r8 = 75
            if (r9 < r8) goto L_0x011e
            if (r9 > r10) goto L_0x011e
            int r9 = r9 + 16
            goto L_0x0150
        L_0x011e:
            r8 = 80
            if (r9 < r8) goto L_0x0129
            r8 = 84
            if (r9 > r8) goto L_0x0129
            int r9 = r9 + 43
            goto L_0x0150
        L_0x0129:
            r8 = 85
            if (r9 != r8) goto L_0x012e
            goto L_0x0157
        L_0x012e:
            r8 = 86
            if (r9 != r8) goto L_0x0135
            r8 = 64
            goto L_0x015e
        L_0x0135:
            r8 = 87
            if (r9 != r8) goto L_0x013c
            r8 = 96
            goto L_0x015e
        L_0x013c:
            r8 = 88
            if (r9 < r8) goto L_0x0145
            if (r9 > r14) goto L_0x0145
            r8 = 127(0x7f, float:1.78E-43)
            goto L_0x015e
        L_0x0145:
            b.l.f.h r1 = b.l.f.h.a()
            throw r1
        L_0x014a:
            if (r9 < r15) goto L_0x0152
            if (r9 > r14) goto L_0x0152
            int r9 = r9 + -64
        L_0x0150:
            char r8 = (char) r9
            goto L_0x015e
        L_0x0152:
            b.l.f.h r1 = b.l.f.h.a()
            throw r1
        L_0x0157:
            r8 = r3
            goto L_0x015e
        L_0x0159:
            b.l.f.h r1 = b.l.f.h.a()
            throw r1
        L_0x015e:
            r5.append(r8)
            int r6 = r6 + r11
            goto L_0x00bf
        L_0x0164:
            java.lang.String r1 = r5.toString()
            r5 = r2[r11]
            r2 = r2[r3]
            int r5 = r5 + r2
            float r2 = (float) r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            float r4 = (float) r4
            float r6 = (float) r12
            float r6 = r6 / r5
            float r6 = r6 + r4
            b.l.f.q r4 = new b.l.f.q
            r5 = 0
            b.l.f.s[] r7 = new b.l.f.s[r13]
            b.l.f.s r8 = new b.l.f.s
            r10 = r17
            float r9 = (float) r10
            r8.<init>(r2, r9)
            r7[r3] = r8
            b.l.f.s r2 = new b.l.f.s
            r2.<init>(r6, r9)
            r7[r11] = r2
            b.l.f.a r2 = b.l.f.a.CODE_93
            r4.<init>(r1, r5, r7, r2)
            return r4
        L_0x0191:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x0194:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x0197:
            r10 = r17
            r4 = r9
            goto L_0x004d
        L_0x019c:
            r10 = r17
            int r9 = r9 + 1
            goto L_0x0057
        L_0x01a2:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x01a5:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x01a8:
            r10 = r17
            r12 = r5[r3]
            r14 = r5[r11]
            int r12 = r12 + r14
            int r7 = r7 + r12
            int r12 = r9 + -1
            java.lang.System.arraycopy(r5, r13, r5, r3, r12)
            r5[r12] = r3
            r5[r9] = r3
            r9 = r12
            goto L_0x01bf
        L_0x01bb:
            r10 = r17
            int r9 = r9 + 1
        L_0x01bf:
            r5[r9] = r11
            r8 = r8 ^ 1
        L_0x01c3:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x01c7:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.g.d(int, b.l.f.y.a, java.util.Map):b.l.f.q");
    }
}
