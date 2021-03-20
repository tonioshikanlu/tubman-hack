package b.l.f.e0.e;

import androidx.renderscript.ScriptIntrinsicBLAS;
import b.l.f.v;

public final class d {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b  reason: collision with root package name */
    public static final int[][] f5745b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, ScriptIntrinsicBLAS.RIGHT, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, ScriptIntrinsicBLAS.UNIT, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, ScriptIntrinsicBLAS.RIGHT, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0235, code lost:
        if (r16 != 0) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0237, code lost:
        r16 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x023a, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x023c, code lost:
        if (r16 == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x023e, code lost:
        r13 = !r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0209, code lost:
        r16 = r15 + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021f, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0220, code lost:
        r16 = r16 & 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(b.l.f.y.a r20, b.l.f.e0.c.f r21, b.l.f.e0.c.j r22, int r23, b.l.f.e0.e.b r24) {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            byte[][] r4 = r3.a
            int r5 = r4.length
            r6 = 0
            r7 = r6
        L_0x000d:
            r8 = -1
            if (r7 >= r5) goto L_0x0018
            r9 = r4[r7]
            java.util.Arrays.fill(r9, r8)
            int r7 = r7 + 1
            goto L_0x000d
        L_0x0018:
            int[][] r4 = a
            r4 = r4[r6]
            int r4 = r4.length
            d(r6, r6, r3)
            int r5 = r3.f5744b
            int r5 = r5 - r4
            d(r5, r6, r3)
            int r5 = r3.f5744b
            int r5 = r5 - r4
            d(r6, r5, r3)
            r4 = 7
            c(r6, r4, r3)
            int r5 = r3.f5744b
            int r5 = r5 + -8
            c(r5, r4, r3)
            int r5 = r3.f5744b
            int r5 = r5 + -8
            c(r6, r5, r3)
            e(r4, r6, r3)
            int r5 = r3.c
            int r5 = r5 - r4
            int r5 = r5 + r8
            e(r5, r6, r3)
            int r5 = r3.c
            int r5 = r5 - r4
            e(r4, r5, r3)
            int r5 = r3.c
            r7 = 8
            int r5 = r5 - r7
            byte r5 = r3.a(r7, r5)
            if (r5 == 0) goto L_0x02b5
            int r5 = r3.c
            int r5 = r5 - r7
            r9 = 1
            r3.b(r7, r5, r9)
            int r5 = r1.a
            r10 = 5
            r11 = 2
            if (r5 >= r11) goto L_0x0067
            goto L_0x00c1
        L_0x0067:
            int r5 = r5 + r8
            int[][] r12 = c
            r5 = r12[r5]
            int r12 = r5.length
            r13 = r6
        L_0x006e:
            if (r13 >= r12) goto L_0x00c1
            r14 = r5[r13]
            if (r14 < 0) goto L_0x00b6
            int r15 = r5.length
            r8 = r6
        L_0x0076:
            if (r8 >= r15) goto L_0x00b6
            r11 = r5[r8]
            if (r11 < 0) goto L_0x00ac
            byte r18 = r3.a(r11, r14)
            boolean r18 = g(r18)
            if (r18 == 0) goto L_0x00ac
            int r11 = r11 + -2
            int r18 = r14 + -2
            r4 = r6
        L_0x008b:
            if (r4 >= r10) goto L_0x00ac
            int[][] r19 = f5745b
            r19 = r19[r4]
            r9 = r6
        L_0x0092:
            if (r9 >= r10) goto L_0x00a4
            int r6 = r11 + r9
            int r10 = r18 + r4
            r7 = r19[r9]
            r3.b(r6, r10, r7)
            int r9 = r9 + 1
            r6 = 0
            r7 = 8
            r10 = 5
            goto L_0x0092
        L_0x00a4:
            int r4 = r4 + 1
            r6 = 0
            r7 = 8
            r9 = 1
            r10 = 5
            goto L_0x008b
        L_0x00ac:
            int r8 = r8 + 1
            r4 = 7
            r6 = 0
            r7 = 8
            r9 = 1
            r10 = 5
            r11 = 2
            goto L_0x0076
        L_0x00b6:
            int r13 = r13 + 1
            r4 = 7
            r6 = 0
            r7 = 8
            r8 = -1
            r9 = 1
            r10 = 5
            r11 = 2
            goto L_0x006e
        L_0x00c1:
            r4 = 8
        L_0x00c3:
            int r5 = r3.f5744b
            r6 = 8
            int r5 = r5 - r6
            r6 = 6
            if (r4 >= r5) goto L_0x00eb
            int r5 = r4 + 1
            int r7 = r5 % 2
            byte r8 = r3.a(r4, r6)
            boolean r8 = g(r8)
            if (r8 == 0) goto L_0x00dc
            r3.b(r4, r6, r7)
        L_0x00dc:
            byte r8 = r3.a(r6, r4)
            boolean r8 = g(r8)
            if (r8 == 0) goto L_0x00e9
            r3.b(r6, r4, r7)
        L_0x00e9:
            r4 = r5
            goto L_0x00c3
        L_0x00eb:
            b.l.f.y.a r4 = new b.l.f.y.a
            r4.<init>()
            if (r2 < 0) goto L_0x00f8
            r5 = 8
            if (r2 >= r5) goto L_0x00f8
            r5 = 1
            goto L_0x00f9
        L_0x00f8:
            r5 = 0
        L_0x00f9:
            if (r5 == 0) goto L_0x02ad
            r5 = r21
            int r5 = r5.f5718h
            r7 = 3
            int r5 = r5 << r7
            r5 = r5 | r2
            r8 = 5
            r4.c(r5, r8)
            r8 = 1335(0x537, float:1.871E-42)
            int r5 = b(r5, r8)
            r8 = 10
            r4.c(r5, r8)
            b.l.f.y.a r5 = new b.l.f.y.a
            r5.<init>()
            r8 = 21522(0x5412, float:3.0159E-41)
            r9 = 15
            r5.c(r8, r9)
            int r8 = r4.f5810i
            int r10 = r5.f5810i
            if (r8 != r10) goto L_0x02a5
            r8 = 0
        L_0x0124:
            int[] r10 = r4.f5809h
            int r11 = r10.length
            if (r8 >= r11) goto L_0x0135
            r11 = r10[r8]
            int[] r12 = r5.f5809h
            r12 = r12[r8]
            r11 = r11 ^ r12
            r10[r8] = r11
            int r8 = r8 + 1
            goto L_0x0124
        L_0x0135:
            int r5 = r4.f5810i
            java.lang.String r8 = "should not happen but we got: "
            if (r5 != r9) goto L_0x0291
            r5 = 0
        L_0x013c:
            int r9 = r4.f5810i
            if (r5 >= r9) goto L_0x016d
            int r9 = r9 + -1
            int r9 = r9 - r5
            boolean r9 = r4.f(r9)
            int[][] r10 = d
            r10 = r10[r5]
            r11 = 0
            r12 = r10[r11]
            r13 = 1
            r10 = r10[r13]
            r3.c(r12, r10, r9)
            r10 = 8
            if (r5 >= r10) goto L_0x0160
            int r12 = r3.f5744b
            int r12 = r12 - r5
            int r12 = r12 - r13
            r3.c(r12, r10, r9)
            goto L_0x016a
        L_0x0160:
            int r12 = r3.c
            int r12 = r12 + -7
            int r13 = r5 + -8
            int r13 = r13 + r12
            r3.c(r10, r13, r9)
        L_0x016a:
            int r5 = r5 + 1
            goto L_0x013c
        L_0x016d:
            r11 = 0
            int r4 = r1.a
            r5 = 7
            if (r4 >= r5) goto L_0x0174
            goto L_0x01b3
        L_0x0174:
            b.l.f.y.a r5 = new b.l.f.y.a
            r5.<init>()
            r5.c(r4, r6)
            int r1 = r1.a
            r4 = 7973(0x1f25, float:1.1173E-41)
            int r1 = b(r1, r4)
            r4 = 12
            r5.c(r1, r4)
            int r1 = r5.f5810i
            r4 = 18
            if (r1 != r4) goto L_0x027d
            r1 = 17
            r4 = r11
        L_0x0192:
            if (r4 >= r6) goto L_0x01b3
            r8 = r11
        L_0x0195:
            if (r8 >= r7) goto L_0x01b0
            boolean r9 = r5.f(r1)
            int r1 = r1 + -1
            int r10 = r3.c
            int r10 = r10 + -11
            int r10 = r10 + r8
            r3.c(r4, r10, r9)
            int r10 = r3.c
            int r10 = r10 + -11
            int r10 = r10 + r8
            r3.c(r10, r4, r9)
            int r8 = r8 + 1
            goto L_0x0195
        L_0x01b0:
            int r4 = r4 + 1
            goto L_0x0192
        L_0x01b3:
            int r1 = r3.f5744b
            r4 = 1
            int r1 = r1 - r4
            int r5 = r3.c
            int r5 = r5 - r4
            r4 = r11
            r8 = -1
        L_0x01bc:
            if (r1 <= 0) goto L_0x025a
            if (r1 != r6) goto L_0x01c2
            int r1 = r1 + -1
        L_0x01c2:
            if (r5 < 0) goto L_0x0251
            int r9 = r3.c
            if (r5 >= r9) goto L_0x0251
            r9 = r11
            r10 = 2
        L_0x01ca:
            if (r9 >= r10) goto L_0x024c
            int r12 = r1 - r9
            byte r13 = r3.a(r12, r5)
            boolean r13 = g(r13)
            if (r13 == 0) goto L_0x0246
            int r13 = r0.f5810i
            if (r4 >= r13) goto L_0x01e3
            boolean r13 = r0.f(r4)
            int r4 = r4 + 1
            goto L_0x01e4
        L_0x01e3:
            r13 = r11
        L_0x01e4:
            r14 = -1
            if (r2 == r14) goto L_0x0241
            switch(r2) {
                case 0: goto L_0x0231;
                case 1: goto L_0x022d;
                case 2: goto L_0x0229;
                case 3: goto L_0x0223;
                case 4: goto L_0x0219;
                case 5: goto L_0x020e;
                case 6: goto L_0x0204;
                case 7: goto L_0x01fa;
                default: goto L_0x01ea;
            }
        L_0x01ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r2 = "Invalid mask pattern: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x01fa:
            int r15 = r5 * r12
            int r15 = r15 % r7
            int r16 = r5 + r12
            r17 = 1
            r16 = r16 & 1
            goto L_0x0209
        L_0x0204:
            int r15 = r5 * r12
            r16 = r15 & 1
            int r15 = r15 % r7
        L_0x0209:
            int r15 = r15 + r16
            r16 = r15
            goto L_0x021f
        L_0x020e:
            int r15 = r5 * r12
            r16 = r15 & 1
            int r15 = r15 % r7
            int r15 = r15 + r16
            r16 = r15
            r15 = 1
            goto L_0x0235
        L_0x0219:
            int r15 = r5 / 2
            int r16 = r12 / 3
            int r16 = r16 + r15
        L_0x021f:
            r15 = 1
        L_0x0220:
            r16 = r16 & 1
            goto L_0x0235
        L_0x0223:
            r15 = 1
            int r16 = r5 + r12
            int r16 = r16 % 3
            goto L_0x0235
        L_0x0229:
            r15 = 1
            int r16 = r12 % 3
            goto L_0x0235
        L_0x022d:
            r15 = 1
            r16 = r5
            goto L_0x0220
        L_0x0231:
            r15 = 1
            int r16 = r5 + r12
            goto L_0x0220
        L_0x0235:
            if (r16 != 0) goto L_0x023a
            r16 = r15
            goto L_0x023c
        L_0x023a:
            r16 = r11
        L_0x023c:
            if (r16 == 0) goto L_0x0242
            r13 = r13 ^ 1
            goto L_0x0242
        L_0x0241:
            r15 = 1
        L_0x0242:
            r3.c(r12, r5, r13)
            goto L_0x0248
        L_0x0246:
            r14 = -1
            r15 = 1
        L_0x0248:
            int r9 = r9 + 1
            goto L_0x01ca
        L_0x024c:
            r14 = -1
            r15 = 1
            int r5 = r5 + r8
            goto L_0x01c2
        L_0x0251:
            r10 = 2
            r14 = -1
            r15 = 1
            int r8 = -r8
            int r5 = r5 + r8
            int r1 = r1 + -2
            goto L_0x01bc
        L_0x025a:
            int r1 = r0.f5810i
            if (r4 != r1) goto L_0x025f
            return
        L_0x025f:
            b.l.f.v r1 = new b.l.f.v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Not all bits consumed: "
            r2.<init>(r3)
            r2.append(r4)
            r3 = 47
            r2.append(r3)
            int r0 = r0.f5810i
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x027d:
            b.l.f.v r0 = new b.l.f.v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            int r2 = r5.f5810i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0291:
            b.l.f.v r0 = new b.l.f.v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            int r2 = r4.f5810i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Sizes don't match"
            r0.<init>(r1)
            throw r0
        L_0x02ad:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Invalid mask pattern"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02b5:
            b.l.f.v r0 = new b.l.f.v
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.e0.e.d.a(b.l.f.y.a, b.l.f.e0.c.f, b.l.f.e0.c.j, int, b.l.f.e0.e.b):void");
    }

    public static int b(int i2, int i3) {
        if (i3 != 0) {
            int f = f(i3);
            int i4 = i2 << (f - 1);
            while (f(i4) >= f) {
                i4 ^= i3 << (f(i4) - f);
            }
            return i4;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void c(int i2, int i3, b bVar) {
        int i4 = 0;
        while (i4 < 8) {
            int i5 = i2 + i4;
            if (g(bVar.a(i5, i3))) {
                bVar.b(i5, i3, 0);
                i4++;
            } else {
                throw new v();
            }
        }
    }

    public static void d(int i2, int i3, b bVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = a[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                bVar.b(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static void e(int i2, int i3, b bVar) {
        int i4 = 0;
        while (i4 < 7) {
            int i5 = i3 + i4;
            if (g(bVar.a[i5][i2])) {
                bVar.a[i5][i2] = (byte) 0;
                i4++;
            } else {
                throw new v();
            }
        }
    }

    public static int f(int i2) {
        return 32 - Integer.numberOfLeadingZeros(i2);
    }

    public static boolean g(int i2) {
        return i2 == -1;
    }
}
