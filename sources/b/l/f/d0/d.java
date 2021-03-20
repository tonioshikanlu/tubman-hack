package b.l.f.d0;

import b.l.f.u;
import b.l.f.y.b;
import java.lang.reflect.Array;

public final class d implements u {
    public static b b(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        b bVar = new b(bArr[0].length + i3, bArr.length + i3);
        int length = bVar.f5814k.length;
        for (int i4 = 0; i4 < length; i4++) {
            bVar.f5814k[i4] = 0;
        }
        int i5 = (bVar.f5812i - i2) - 1;
        int i6 = 0;
        while (i6 < bArr.length) {
            byte[] bArr2 = bArr[i6];
            for (int i7 = 0; i7 < bArr[0].length; i7++) {
                if (bArr2[i7] == 1) {
                    bVar.g(i7 + i2, i5);
                }
            }
            i6++;
            i5--;
        }
        return bVar;
    }

    public static byte[][] c(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length2 = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length2] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:197:0x0416 A[LOOP:14: B:196:0x0414->B:197:0x0416, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0438  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.y.b a(java.lang.String r22, b.l.f.a r23, int r24, int r25, java.util.Map<b.l.f.g, ?> r26) {
        /*
            r21 = this;
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            b.l.f.a r4 = b.l.f.a.PDF_417
            r5 = r23
            if (r5 != r4) goto L_0x04c0
            b.l.f.d0.g.c r4 = b.l.f.d0.g.c.AUTO
            if (r3 == 0) goto L_0x00a0
            b.l.f.g r5 = b.l.f.g.PDF417_COMPACT
            boolean r6 = r3.containsKey(r5)
            if (r6 == 0) goto L_0x002b
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = r5.toString()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            b.l.f.g r6 = b.l.f.g.PDF417_COMPACTION
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0040
            java.lang.Object r4 = r3.get(r6)
            java.lang.String r4 = r4.toString()
            b.l.f.d0.g.c r4 = b.l.f.d0.g.c.valueOf(r4)
        L_0x0040:
            b.l.f.g r6 = b.l.f.g.PDF417_DIMENSIONS
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0056
            java.lang.Object r6 = r3.get(r6)
            b.l.f.d0.g.d r6 = (b.l.f.d0.g.d) r6
            java.util.Objects.requireNonNull(r6)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            goto L_0x005c
        L_0x0056:
            r6 = 2
            r7 = 30
            r8 = 2
            r9 = 30
        L_0x005c:
            b.l.f.g r10 = b.l.f.g.MARGIN
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0071
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = r10.toString()
            int r10 = java.lang.Integer.parseInt(r10)
            goto L_0x0073
        L_0x0071:
            r10 = 30
        L_0x0073:
            b.l.f.g r11 = b.l.f.g.ERROR_CORRECTION
            boolean r12 = r3.containsKey(r11)
            if (r12 == 0) goto L_0x0088
            java.lang.Object r11 = r3.get(r11)
            java.lang.String r11 = r11.toString()
            int r11 = java.lang.Integer.parseInt(r11)
            goto L_0x0089
        L_0x0088:
            r11 = 2
        L_0x0089:
            b.l.f.g r12 = b.l.f.g.CHARACTER_SET
            boolean r13 = r3.containsKey(r12)
            if (r13 == 0) goto L_0x009e
            java.lang.Object r3 = r3.get(r12)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            goto L_0x00ab
        L_0x009e:
            r3 = 0
            goto L_0x00ab
        L_0x00a0:
            r3 = 0
            r5 = 0
            r6 = 2
            r7 = 30
            r8 = 2
            r9 = 30
            r10 = 30
            r11 = 2
        L_0x00ab:
            int r12 = b.l.f.d0.g.f.a(r11)
            byte[] r13 = b.l.f.d0.g.g.a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r14 = r22.length()
            r13.<init>(r14)
            if (r3 != 0) goto L_0x00bf
            java.nio.charset.Charset r3 = b.l.f.d0.g.g.f5689e
            goto L_0x011f
        L_0x00bf:
            java.nio.charset.Charset r14 = b.l.f.d0.g.g.f5689e
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L_0x011f
            java.lang.String r14 = r3.name()
            java.util.Map<java.lang.String, b.l.f.y.d> r15 = b.l.f.y.d.L
            java.lang.Object r14 = r15.get(r14)
            b.l.f.y.d r14 = (b.l.f.y.d) r14
            if (r14 == 0) goto L_0x011f
            int[] r14 = r14.f5824h
            r15 = 0
            r14 = r14[r15]
            if (r14 < 0) goto L_0x00e6
            r15 = 900(0x384, float:1.261E-42)
            if (r14 >= r15) goto L_0x00e6
            r15 = 927(0x39f, float:1.299E-42)
            r13.append(r15)
            goto L_0x00fa
        L_0x00e6:
            r15 = 810900(0xc5f94, float:1.136313E-39)
            if (r14 >= r15) goto L_0x00fc
            r15 = 926(0x39e, float:1.298E-42)
            r13.append(r15)
            int r15 = r14 / 900
            int r15 = r15 + -1
            char r15 = (char) r15
            r13.append(r15)
            int r14 = r14 % 900
        L_0x00fa:
            char r14 = (char) r14
            goto L_0x010b
        L_0x00fc:
            r15 = 811800(0xc6318, float:1.137574E-39)
            if (r14 >= r15) goto L_0x010f
            r15 = 925(0x39d, float:1.296E-42)
            r13.append(r15)
            r15 = 810900(0xc5f94, float:1.136313E-39)
            int r15 = r15 - r14
            char r14 = (char) r15
        L_0x010b:
            r13.append(r14)
            goto L_0x011f
        L_0x010f:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = java.lang.String.valueOf(r14)
            java.lang.String r2 = "ECI number not in valid range from 0..811799, but was "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x011f:
            int r14 = r22.length()
            int r4 = r4.ordinal()
            r15 = 1
            if (r4 == r15) goto L_0x02ab
            r15 = 2
            if (r4 == r15) goto L_0x0298
            r15 = 3
            if (r4 == r15) goto L_0x0286
            r4 = 0
            r15 = 0
        L_0x0132:
            r16 = 0
        L_0x0134:
            if (r15 >= r14) goto L_0x027d
            r23 = r10
            int r10 = r22.length()
            r17 = 0
            if (r15 >= r10) goto L_0x0154
            r1 = r15
        L_0x0141:
            char r18 = r0.charAt(r1)
        L_0x0145:
            boolean r19 = b.l.f.d0.g.g.f(r18)
            if (r19 == 0) goto L_0x0154
            if (r1 >= r10) goto L_0x0154
            int r17 = r17 + 1
            int r1 = r1 + 1
            if (r1 >= r10) goto L_0x0145
            goto L_0x0141
        L_0x0154:
            r1 = r17
            r10 = 13
            if (r1 < r10) goto L_0x0169
            r4 = 902(0x386, float:1.264E-42)
            r13.append(r4)
            b.l.f.d0.g.g.b(r0, r15, r1, r13)
            int r15 = r15 + r1
            r4 = 2
            r10 = r23
            r1 = r24
            goto L_0x0132
        L_0x0169:
            int r10 = r22.length()
            r2 = r15
        L_0x016e:
            if (r2 >= r10) goto L_0x01c7
            char r17 = r0.charAt(r2)
            r18 = 13
            r19 = 0
            r26 = r5
            r5 = r18
            r18 = r11
            r11 = r19
        L_0x0180:
            if (r11 >= r5) goto L_0x019b
            boolean r5 = b.l.f.d0.g.g.f(r17)
            if (r5 == 0) goto L_0x0199
            if (r2 >= r10) goto L_0x0199
            int r11 = r11 + 1
            int r2 = r2 + 1
            if (r2 >= r10) goto L_0x0196
            char r5 = r0.charAt(r2)
            r17 = r5
        L_0x0196:
            r5 = 13
            goto L_0x0180
        L_0x0199:
            r5 = 13
        L_0x019b:
            if (r11 < r5) goto L_0x01a0
            int r2 = r2 - r15
            int r2 = r2 - r11
            goto L_0x01cc
        L_0x01a0:
            if (r11 > 0) goto L_0x01c2
            char r5 = r0.charAt(r2)
            r11 = 9
            if (r5 == r11) goto L_0x01bd
            r11 = 10
            if (r5 == r11) goto L_0x01bd
            r11 = 13
            if (r5 == r11) goto L_0x01bd
            r11 = 32
            if (r5 < r11) goto L_0x01bb
            r11 = 126(0x7e, float:1.77E-43)
            if (r5 > r11) goto L_0x01bb
            goto L_0x01bd
        L_0x01bb:
            r5 = 0
            goto L_0x01be
        L_0x01bd:
            r5 = 1
        L_0x01be:
            if (r5 == 0) goto L_0x01cb
            int r2 = r2 + 1
        L_0x01c2:
            r5 = r26
            r11 = r18
            goto L_0x016e
        L_0x01c7:
            r26 = r5
            r18 = r11
        L_0x01cb:
            int r2 = r2 - r15
        L_0x01cc:
            r5 = 5
            if (r2 >= r5) goto L_0x025a
            if (r1 != r14) goto L_0x01d3
            goto L_0x025a
        L_0x01d3:
            java.nio.charset.CharsetEncoder r1 = r3.newEncoder()
            int r2 = r22.length()
            r5 = r15
        L_0x01dc:
            if (r5 >= r2) goto L_0x0236
            char r10 = r0.charAt(r5)
            r11 = 13
            r17 = 0
            r20 = r17
            r17 = r6
            r6 = r20
        L_0x01ec:
            if (r6 >= r11) goto L_0x0201
            boolean r10 = b.l.f.d0.g.g.f(r10)
            if (r10 == 0) goto L_0x0201
            int r6 = r6 + 1
            int r10 = r5 + r6
            if (r10 >= r2) goto L_0x0201
            char r10 = r0.charAt(r10)
            r11 = 13
            goto L_0x01ec
        L_0x0201:
            r10 = 13
            if (r6 < r10) goto L_0x0206
            goto L_0x0238
        L_0x0206:
            char r6 = r0.charAt(r5)
            boolean r10 = r1.canEncode(r6)
            if (r10 == 0) goto L_0x0215
            int r5 = r5 + 1
            r6 = r17
            goto L_0x01dc
        L_0x0215:
            b.l.f.v r0 = new b.l.f.v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-encodable character detected: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " (Unicode: "
            r1.append(r2)
            r1.append(r6)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0236:
            r17 = r6
        L_0x0238:
            int r5 = r5 - r15
            if (r5 != 0) goto L_0x023c
            r5 = 1
        L_0x023c:
            int r5 = r5 + r15
            java.lang.String r1 = r0.substring(r15, r5)
            byte[] r1 = r1.getBytes(r3)
            int r2 = r1.length
            r6 = 1
            if (r2 != r6) goto L_0x0250
            if (r4 != 0) goto L_0x0250
            r2 = 0
            b.l.f.d0.g.g.a(r1, r2, r6, r2, r13)
            goto L_0x0258
        L_0x0250:
            r2 = 0
            int r6 = r1.length
            b.l.f.d0.g.g.a(r1, r2, r6, r4, r13)
            r4 = 1
            r16 = 0
        L_0x0258:
            r15 = r5
            goto L_0x026f
        L_0x025a:
            r17 = r6
            if (r4 == 0) goto L_0x0266
            r1 = 900(0x384, float:1.261E-42)
            r13.append(r1)
            r16 = 0
            r4 = 0
        L_0x0266:
            r1 = r16
            int r1 = b.l.f.d0.g.g.c(r0, r15, r2, r13, r1)
            int r15 = r15 + r2
            r16 = r1
        L_0x026f:
            r10 = r23
            r1 = r24
            r2 = r25
            r5 = r26
            r6 = r17
            r11 = r18
            goto L_0x0134
        L_0x027d:
            r26 = r5
            r17 = r6
            r23 = r10
            r18 = r11
            goto L_0x02b7
        L_0x0286:
            r26 = r5
            r17 = r6
            r23 = r10
            r18 = r11
            r1 = 902(0x386, float:1.264E-42)
            r13.append(r1)
            r1 = 0
            b.l.f.d0.g.g.b(r0, r1, r14, r13)
            goto L_0x02b7
        L_0x0298:
            r26 = r5
            r17 = r6
            r23 = r10
            r18 = r11
            r1 = 0
            byte[] r2 = r0.getBytes(r3)
            int r3 = r2.length
            r4 = 1
            b.l.f.d0.g.g.a(r2, r1, r3, r4, r13)
            goto L_0x02b7
        L_0x02ab:
            r26 = r5
            r17 = r6
            r23 = r10
            r18 = r11
            r1 = 0
            b.l.f.d0.g.g.c(r0, r1, r14, r13, r1)
        L_0x02b7:
            java.lang.String r1 = r13.toString()
            int r2 = r1.length()
            r3 = 0
            r4 = 0
            r5 = r17
        L_0x02c3:
            if (r5 > r7) goto L_0x0307
            int r6 = r2 + 1
            int r6 = r6 + r12
            int r10 = r6 / r5
            int r10 = r10 + 1
            int r11 = r5 * r10
            int r6 = r6 + r5
            if (r11 < r6) goto L_0x02d3
            int r10 = r10 + -1
        L_0x02d3:
            if (r10 < r8) goto L_0x0307
            if (r10 > r9) goto L_0x0304
            int r6 = r5 * 17
            int r6 = r6 + 69
            float r6 = (float) r6
            r11 = 1052166324(0x3eb6c8b4, float:0.357)
            float r6 = r6 * r11
            float r11 = (float) r10
            r13 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r13
            float r6 = r6 / r11
            if (r4 == 0) goto L_0x02f9
            r11 = 1077936128(0x40400000, float:3.0)
            float r13 = r6 - r11
            float r13 = java.lang.Math.abs(r13)
            float r11 = r3 - r11
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0304
        L_0x02f9:
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 0
            r3[r4] = r5
            r4 = 1
            r3[r4] = r10
            r4 = r3
            r3 = r6
        L_0x0304:
            int r5 = r5 + 1
            goto L_0x02c3
        L_0x0307:
            if (r4 != 0) goto L_0x0325
            int r3 = r2 + 1
            int r3 = r3 + r12
            int r5 = r3 / r17
            r6 = 1
            int r5 = r5 + r6
            int r7 = r17 * r5
            int r3 = r3 + r17
            if (r7 < r3) goto L_0x0318
            int r5 = r5 + -1
        L_0x0318:
            if (r5 >= r8) goto L_0x0323
            r3 = 2
            int[] r4 = new int[r3]
            r3 = 0
            r4[r3] = r17
            r4[r6] = r8
            goto L_0x0327
        L_0x0323:
            r3 = 0
            goto L_0x0327
        L_0x0325:
            r3 = 0
            r6 = 1
        L_0x0327:
            if (r4 == 0) goto L_0x04b8
            r3 = r4[r3]
            r4 = r4[r6]
            int r5 = r3 * r4
            int r5 = r5 - r12
            int r7 = r2 + 1
            if (r5 <= r7) goto L_0x0338
            int r5 = r5 - r2
            int r5 = r5 + -1
            goto L_0x0339
        L_0x0338:
            r5 = 0
        L_0x0339:
            int r12 = r12 + r2
            int r12 = r12 + r6
            r7 = 929(0x3a1, float:1.302E-42)
            if (r12 > r7) goto L_0x049b
            int r2 = r2 + r5
            int r2 = r2 + r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            char r2 = (char) r2
            r0.append(r2)
            r0.append(r1)
            r1 = 0
        L_0x034e:
            if (r1 >= r5) goto L_0x0358
            r2 = 900(0x384, float:1.261E-42)
            r0.append(r2)
            int r1 = r1 + 1
            goto L_0x034e
        L_0x0358:
            java.lang.String r0 = r0.toString()
            int[][] r1 = b.l.f.d0.g.f.a
            int r2 = b.l.f.d0.g.f.a(r18)
            char[] r5 = new char[r2]
            int r6 = r0.length()
            r8 = 0
        L_0x0369:
            if (r8 >= r6) goto L_0x039a
            char r9 = r0.charAt(r8)
            int r10 = r2 + -1
            char r11 = r5[r10]
            int r9 = r9 + r11
            int r9 = r9 % r7
        L_0x0375:
            if (r10 <= 0) goto L_0x038a
            r11 = r1[r18]
            r11 = r11[r10]
            int r11 = r11 * r9
            int r11 = r11 % r7
            int r11 = 929 - r11
            int r12 = r10 + -1
            char r13 = r5[r12]
            int r13 = r13 + r11
            int r13 = r13 % r7
            char r11 = (char) r13
            r5[r10] = r11
            r10 = r12
            goto L_0x0375
        L_0x038a:
            r10 = r1[r18]
            r11 = 0
            r10 = r10[r11]
            int r9 = r9 * r10
            int r9 = r9 % r7
            int r9 = 929 - r9
            int r9 = r9 % r7
            char r9 = (char) r9
            r5[r11] = r9
            int r8 = r8 + 1
            goto L_0x0369
        L_0x039a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
        L_0x039f:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x03b4
            char r6 = r5[r2]
            if (r6 == 0) goto L_0x03ae
            char r6 = r5[r2]
            int r6 = 929 - r6
            char r6 = (char) r6
            r5[r2] = r6
        L_0x03ae:
            char r6 = r5[r2]
            r1.append(r6)
            goto L_0x039f
        L_0x03b4:
            java.lang.String r1 = r1.toString()
            b.l.f.d0.g.a r2 = new b.l.f.d0.g.a
            r2.<init>(r4, r3)
            java.lang.String r0 = b.e.a.a.a.m(r0, r1)
            int[][] r1 = b.l.f.d0.g.e.a
            r5 = 0
            r6 = 0
        L_0x03c5:
            if (r6 >= r4) goto L_0x0450
            int r7 = r6 % 3
            int r8 = r2.f5681b
            int r8 = r8 + 1
            r2.f5681b = r8
            r8 = 130728(0x1fea8, float:1.83189E-40)
            b.l.f.d0.g.b r9 = r2.a()
            r10 = 17
            b.l.f.d0.g.e.a(r8, r10, r9)
            int r8 = r6 / 3
            int r8 = r8 * 30
            if (r7 != 0) goto L_0x03e9
            int r9 = r4 + -1
            int r9 = r9 / 3
            int r9 = r9 + r8
            int r11 = r3 + -1
            goto L_0x03fb
        L_0x03e9:
            r9 = 1
            if (r7 != r9) goto L_0x03fd
            int r11 = r18 * 3
            int r11 = r11 + r8
            int r9 = r4 + -1
            int r12 = r9 % 3
            int r11 = r11 + r12
            int r9 = r9 / 3
            r20 = r11
            r11 = r9
            r9 = r20
        L_0x03fb:
            int r11 = r11 + r8
            goto L_0x0408
        L_0x03fd:
            int r9 = r3 + -1
            int r9 = r9 + r8
            int r11 = r18 * 3
            int r11 = r11 + r8
            int r8 = r4 + -1
            int r8 = r8 % 3
            int r11 = r11 + r8
        L_0x0408:
            r8 = r1[r7]
            r8 = r8[r9]
            b.l.f.d0.g.b r9 = r2.a()
            b.l.f.d0.g.e.a(r8, r10, r9)
            r8 = 0
        L_0x0414:
            if (r8 >= r3) goto L_0x042a
            r9 = r1[r7]
            char r12 = r0.charAt(r5)
            r9 = r9[r12]
            b.l.f.d0.g.b r12 = r2.a()
            b.l.f.d0.g.e.a(r9, r10, r12)
            int r5 = r5 + 1
            int r8 = r8 + 1
            goto L_0x0414
        L_0x042a:
            r8 = 260649(0x3fa29, float:3.65247E-40)
            if (r26 == 0) goto L_0x0438
            b.l.f.d0.g.b r7 = r2.a()
            r9 = 1
            b.l.f.d0.g.e.a(r8, r9, r7)
            goto L_0x044c
        L_0x0438:
            r7 = r1[r7]
            r7 = r7[r11]
            b.l.f.d0.g.b r9 = r2.a()
            b.l.f.d0.g.e.a(r7, r10, r9)
            r7 = 18
            b.l.f.d0.g.b r9 = r2.a()
            b.l.f.d0.g.e.a(r8, r7, r9)
        L_0x044c:
            int r6 = r6 + 1
            goto L_0x03c5
        L_0x0450:
            r0 = 4
            r1 = 1
            byte[][] r0 = r2.b(r1, r0)
            r1 = 0
            r3 = r24
            r4 = r25
            if (r4 <= r3) goto L_0x045f
            r5 = 1
            goto L_0x0460
        L_0x045f:
            r5 = 0
        L_0x0460:
            r6 = r0[r1]
            int r6 = r6.length
            int r7 = r0.length
            if (r6 >= r7) goto L_0x0468
            r6 = 1
            goto L_0x0469
        L_0x0468:
            r6 = r1
        L_0x0469:
            if (r5 == r6) goto L_0x0471
            byte[][] r0 = c(r0)
            r5 = 1
            goto L_0x0472
        L_0x0471:
            r5 = r1
        L_0x0472:
            r1 = r0[r1]
            int r1 = r1.length
            int r1 = r3 / r1
            int r3 = r0.length
            int r3 = r4 / r3
            if (r1 >= r3) goto L_0x047d
            goto L_0x047e
        L_0x047d:
            r1 = r3
        L_0x047e:
            r3 = 1
            if (r1 <= r3) goto L_0x0494
            int r0 = r1 << 2
            byte[][] r0 = r2.b(r1, r0)
            if (r5 == 0) goto L_0x048d
            byte[][] r0 = c(r0)
        L_0x048d:
            r10 = r23
            b.l.f.y.b r0 = b(r0, r10)
            goto L_0x049a
        L_0x0494:
            r10 = r23
            b.l.f.y.b r0 = b(r0, r10)
        L_0x049a:
            return r0
        L_0x049b:
            b.l.f.v r1 = new b.l.f.v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Encoded message contains too many code words, message too big ("
            r2.<init>(r3)
            int r0 = r22.length()
            r2.append(r0)
            java.lang.String r0 = " bytes)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x04b8:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Unable to fit message in columns"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04c0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r2 = "Can only encode PDF_417, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.d0.d.a(java.lang.String, b.l.f.a, int, int, java.util.Map):b.l.f.y.b");
    }
}
