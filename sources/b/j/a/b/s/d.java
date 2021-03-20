package b.j.a.b.s;

import b.e.a.a.a;

public final class d {
    public static final char[] a = ((char[]) a.a.clone());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f1473b = ((byte[]) a.f1461b.clone());
    public static final d c = new d();

    public static int a(int i2, int i3) {
        if (i3 < 56320 || i3 > 57343) {
            StringBuilder y = a.y("Broken surrogate pair: first char 0x");
            y.append(Integer.toHexString(i2));
            y.append(", second 0x");
            y.append(Integer.toHexString(i3));
            y.append("; illegal combination");
            throw new IllegalArgumentException(y.toString());
        }
        return (i3 - 56320) + ((i2 - 55296) << 10) + 65536;
    }

    public static void b(int i2) {
        throw new IllegalArgumentException(k.b(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] c(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = r13.length()
            r1 = 200(0xc8, float:2.8E-43)
            byte[] r2 = new byte[r1]
            r3 = 0
            r4 = 0
            r7 = r3
            r5 = r4
            r6 = r5
        L_0x000d:
            if (r5 >= r0) goto L_0x00fc
            int r8 = r5 + 1
            char r5 = r13.charAt(r5)
        L_0x0015:
            r9 = 127(0x7f, float:1.78E-43)
            if (r5 > r9) goto L_0x0040
            if (r6 < r1) goto L_0x002c
            if (r7 != 0) goto L_0x0022
            b.j.a.b.w.c r7 = new b.j.a.b.w.c
            r7.<init>((byte[]) r2, (int) r6)
        L_0x0022:
            r7.b()
            byte[] r1 = r7.f1553j
            int r2 = r1.length
            r6 = r4
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x002c:
            int r9 = r6 + 1
            byte r5 = (byte) r5
            r2[r6] = r5
            if (r8 < r0) goto L_0x0036
            r6 = r9
            goto L_0x00fc
        L_0x0036:
            int r5 = r8 + 1
            char r6 = r13.charAt(r8)
            r8 = r5
            r5 = r6
            r6 = r9
            goto L_0x0015
        L_0x0040:
            if (r7 != 0) goto L_0x0047
            b.j.a.b.w.c r7 = new b.j.a.b.w.c
            r7.<init>((byte[]) r2, (int) r6)
        L_0x0047:
            if (r6 < r1) goto L_0x0050
            r7.b()
            byte[] r2 = r7.f1553j
            int r1 = r2.length
            r6 = r4
        L_0x0050:
            r9 = 2048(0x800, float:2.87E-42)
            if (r5 >= r9) goto L_0x005f
            int r9 = r6 + 1
            int r10 = r5 >> 6
            r10 = r10 | 192(0xc0, float:2.69E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
            goto L_0x00e1
        L_0x005f:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r9) goto L_0x00c0
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r9) goto L_0x006a
            goto L_0x00c0
        L_0x006a:
            r9 = 56319(0xdbff, float:7.892E-41)
            if (r5 > r9) goto L_0x00bc
            if (r8 >= r0) goto L_0x00b8
            int r9 = r8 + 1
            char r8 = r13.charAt(r8)
            int r5 = a(r5, r8)
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r5 > r8) goto L_0x00b4
            int r8 = r6 + 1
            int r10 = r5 >> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
            if (r8 < r1) goto L_0x0092
            r7.b()
            byte[] r2 = r7.f1553j
            int r1 = r2.length
            r8 = r4
        L_0x0092:
            int r6 = r8 + 1
            int r10 = r5 >> 12
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r2[r8] = r10
            if (r6 < r1) goto L_0x00a6
            r7.b()
            byte[] r2 = r7.f1553j
            int r1 = r2.length
            r6 = r4
        L_0x00a6:
            int r8 = r6 + 1
            int r10 = r5 >> 6
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
            r6 = r5
            r5 = r9
            goto L_0x00e4
        L_0x00b4:
            b(r5)
            throw r3
        L_0x00b8:
            b(r5)
            throw r3
        L_0x00bc:
            b(r5)
            throw r3
        L_0x00c0:
            int r9 = r6 + 1
            int r10 = r5 >> 12
            r10 = r10 | 224(0xe0, float:3.14E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
            if (r9 < r1) goto L_0x00d5
            r7.b()
            byte[] r1 = r7.f1553j
            int r2 = r1.length
            r9 = r4
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x00d5:
            int r6 = r9 + 1
            int r10 = r5 >> 6
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r2[r9] = r10
            r9 = r6
        L_0x00e1:
            r6 = r5
            r5 = r8
            r8 = r9
        L_0x00e4:
            if (r8 < r1) goto L_0x00f0
            r7.b()
            byte[] r1 = r7.f1553j
            int r2 = r1.length
            r8 = r4
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x00f0:
            int r9 = r8 + 1
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r2[r8] = r6
            r6 = r9
            goto L_0x000d
        L_0x00fc:
            if (r7 != 0) goto L_0x0103
            byte[] r13 = java.util.Arrays.copyOfRange(r2, r4, r6)
            return r13
        L_0x0103:
            r7.f1554k = r6
            byte[] r13 = r7.N()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.s.d.c(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r14 >= 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        r10[1] = 'u';
        r11 = a;
        r10[4] = r11[r7 >> 4];
        r10[5] = r11[r7 & 15];
        r11 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r10[1] = (char) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r7 = r9 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r7 <= r1.length) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r7 = r1.length - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r7 <= 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        java.lang.System.arraycopy(r10, 0, r1, r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r8 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r8 = new b.j.a.b.w.k((b.j.a.b.w.a) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r1 = r8.l();
        r11 = r11 - r7;
        java.lang.System.arraycopy(r10, r7, r1, 0, r11);
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        java.lang.System.arraycopy(r10, 0, r1, r9, r11);
        r9 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r10 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r10 = new char[6];
        r10[0] = '\\';
        r10[2] = '0';
        r10[3] = '0';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r13 = r7 + 1;
        r7 = r0.charAt(r7);
        r14 = r2[r7];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] d(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            r1 = 120(0x78, float:1.68E-43)
            char[] r1 = new char[r1]
            int[] r2 = b.j.a.b.s.a.f1464h
            int r3 = r2.length
            int r4 = r17.length()
            r5 = 0
            r6 = 0
            r8 = r5
            r10 = r8
            r7 = r6
            r9 = r7
        L_0x0013:
            if (r7 >= r4) goto L_0x008f
        L_0x0015:
            char r11 = r0.charAt(r7)
            if (r11 >= r3) goto L_0x0077
            r12 = r2[r11]
            if (r12 == 0) goto L_0x0077
            r11 = 2
            r12 = 6
            if (r10 != 0) goto L_0x0030
            char[] r10 = new char[r12]
            r13 = 92
            r10[r6] = r13
            r13 = 48
            r10[r11] = r13
            r14 = 3
            r10[r14] = r13
        L_0x0030:
            int r13 = r7 + 1
            char r7 = r0.charAt(r7)
            r14 = r2[r7]
            r15 = 1
            if (r14 >= 0) goto L_0x0051
            r11 = 117(0x75, float:1.64E-43)
            r10[r15] = r11
            char[] r11 = a
            int r14 = r7 >> 4
            char r14 = r11[r14]
            r15 = 4
            r10[r15] = r14
            r7 = r7 & 15
            char r7 = r11[r7]
            r11 = 5
            r10[r11] = r7
            r11 = r12
            goto L_0x0054
        L_0x0051:
            char r7 = (char) r14
            r10[r15] = r7
        L_0x0054:
            int r7 = r9 + r11
            int r12 = r1.length
            if (r7 <= r12) goto L_0x0071
            int r7 = r1.length
            int r7 = r7 - r9
            if (r7 <= 0) goto L_0x0060
            java.lang.System.arraycopy(r10, r6, r1, r9, r7)
        L_0x0060:
            if (r8 != 0) goto L_0x0067
            b.j.a.b.w.k r8 = new b.j.a.b.w.k
            r8.<init>(r5, r1)
        L_0x0067:
            char[] r1 = r8.l()
            int r11 = r11 - r7
            java.lang.System.arraycopy(r10, r7, r1, r6, r11)
            r9 = r11
            goto L_0x0075
        L_0x0071:
            java.lang.System.arraycopy(r10, r6, r1, r9, r11)
            r9 = r7
        L_0x0075:
            r7 = r13
            goto L_0x0013
        L_0x0077:
            int r12 = r1.length
            if (r9 < r12) goto L_0x0086
            if (r8 != 0) goto L_0x0081
            b.j.a.b.w.k r8 = new b.j.a.b.w.k
            r8.<init>(r5, r1)
        L_0x0081:
            char[] r1 = r8.l()
            r9 = r6
        L_0x0086:
            int r12 = r9 + 1
            r1[r9] = r11
            int r7 = r7 + 1
            r9 = r12
            if (r7 < r4) goto L_0x0015
        L_0x008f:
            if (r8 != 0) goto L_0x0096
            char[] r0 = java.util.Arrays.copyOfRange(r1, r6, r9)
            return r0
        L_0x0096:
            r8.f1581i = r9
            char[] r0 = r8.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.s.d.d(java.lang.String):char[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] e(java.lang.String r12) {
        /*
            r11 = this;
            int r0 = r12.length()
            r1 = 200(0xc8, float:2.8E-43)
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        L_0x000d:
            if (r4 >= r0) goto L_0x014a
            int[] r7 = b.j.a.b.s.a.f1464h
        L_0x0011:
            char r8 = r12.charAt(r4)
            r9 = 127(0x7f, float:1.78E-43)
            if (r8 > r9) goto L_0x003a
            r10 = r7[r8]
            if (r10 == 0) goto L_0x001e
            goto L_0x003a
        L_0x001e:
            int r9 = r1.length
            if (r5 < r9) goto L_0x002e
            if (r6 != 0) goto L_0x0028
            b.j.a.b.w.c r6 = new b.j.a.b.w.c
            r6.<init>((byte[]) r1, (int) r5)
        L_0x0028:
            r6.b()
            byte[] r1 = r6.f1553j
            r5 = r3
        L_0x002e:
            int r9 = r5 + 1
            byte r8 = (byte) r8
            r1[r5] = r8
            int r4 = r4 + 1
            r5 = r9
            if (r4 < r0) goto L_0x0011
            goto L_0x014a
        L_0x003a:
            if (r6 != 0) goto L_0x0041
            b.j.a.b.w.c r6 = new b.j.a.b.w.c
            r6.<init>((byte[]) r1, (int) r5)
        L_0x0041:
            int r8 = r1.length
            if (r5 < r8) goto L_0x004a
            r6.b()
            byte[] r1 = r6.f1553j
            r5 = r3
        L_0x004a:
            int r8 = r4 + 1
            char r4 = r12.charAt(r4)
            if (r4 > r9) goto L_0x009c
            r1 = r7[r4]
            r6.f1554k = r5
            r5 = 92
            r6.e(r5)
            if (r1 >= 0) goto L_0x0091
            r1 = 117(0x75, float:1.64E-43)
            r6.e(r1)
            r1 = 255(0xff, float:3.57E-43)
            if (r4 <= r1) goto L_0x007b
            int r1 = r4 >> 8
            byte[] r5 = f1473b
            int r7 = r1 >> 4
            byte r7 = r5[r7]
            r6.e(r7)
            r1 = r1 & 15
            byte r1 = r5[r1]
            r6.e(r1)
            r4 = r4 & 255(0xff, float:3.57E-43)
            goto L_0x0083
        L_0x007b:
            r1 = 48
            r6.e(r1)
            r6.e(r1)
        L_0x0083:
            byte[] r1 = f1473b
            int r5 = r4 >> 4
            byte r5 = r1[r5]
            r6.e(r5)
            r4 = r4 & 15
            byte r1 = r1[r4]
            goto L_0x0092
        L_0x0091:
            byte r1 = (byte) r1
        L_0x0092:
            r6.e(r1)
            int r5 = r6.f1554k
            byte[] r1 = r6.f1553j
            r4 = r8
            goto L_0x000d
        L_0x009c:
            r7 = 2047(0x7ff, float:2.868E-42)
            if (r4 > r7) goto L_0x00af
            int r7 = r5 + 1
            int r9 = r4 >> 6
            r9 = r9 | 192(0xc0, float:2.69E-43)
            byte r9 = (byte) r9
            r1[r5] = r9
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            goto L_0x0136
        L_0x00af:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r7) goto L_0x0114
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r4 <= r7) goto L_0x00ba
            goto L_0x0114
        L_0x00ba:
            r7 = 56319(0xdbff, float:7.892E-41)
            if (r4 > r7) goto L_0x0110
            if (r8 >= r0) goto L_0x010c
            int r7 = r8 + 1
            char r8 = r12.charAt(r8)
            int r4 = a(r4, r8)
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 > r8) goto L_0x0108
            int r8 = r5 + 1
            int r9 = r4 >> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r1[r5] = r9
            int r5 = r1.length
            if (r8 < r5) goto L_0x00e2
            r6.b()
            byte[] r1 = r6.f1553j
            r8 = r3
        L_0x00e2:
            int r5 = r8 + 1
            int r9 = r4 >> 12
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r1[r8] = r9
            int r8 = r1.length
            if (r5 < r8) goto L_0x00f6
            r6.b()
            byte[] r1 = r6.f1553j
            r5 = r3
        L_0x00f6:
            int r8 = r5 + 1
            int r9 = r4 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r1[r5] = r9
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            r5 = r4
            r4 = r7
            goto L_0x0139
        L_0x0108:
            b(r4)
            throw r2
        L_0x010c:
            b(r4)
            throw r2
        L_0x0110:
            b(r4)
            throw r2
        L_0x0114:
            int r7 = r5 + 1
            int r9 = r4 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r1[r5] = r9
            int r5 = r1.length
            if (r7 < r5) goto L_0x0126
            r6.b()
            byte[] r1 = r6.f1553j
            r7 = r3
        L_0x0126:
            int r5 = r7 + 1
            int r9 = r4 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r1[r7] = r9
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            r7 = r5
        L_0x0136:
            r5 = r4
            r4 = r8
            r8 = r7
        L_0x0139:
            int r7 = r1.length
            if (r8 < r7) goto L_0x0142
            r6.b()
            byte[] r1 = r6.f1553j
            r8 = r3
        L_0x0142:
            int r7 = r8 + 1
            byte r5 = (byte) r5
            r1[r8] = r5
            r5 = r7
            goto L_0x000d
        L_0x014a:
            if (r6 != 0) goto L_0x0151
            byte[] r12 = java.util.Arrays.copyOfRange(r1, r3, r5)
            return r12
        L_0x0151:
            r6.f1554k = r5
            byte[] r12 = r6.N()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.s.d.e(java.lang.String):byte[]");
    }
}
