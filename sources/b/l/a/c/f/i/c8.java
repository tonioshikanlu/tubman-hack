package b.l.a.c.f.i;

import b.l.a.c.b.a;

public final class c8 extends z7 {
    public static int d(byte[] bArr, int i2, long j2, int i3) {
        if (i3 == 0) {
            z7 z7Var = d8.a;
            if (i2 > -12) {
                return -1;
            }
            return i2;
        } else if (i3 == 1) {
            byte r = y7.r(bArr, j2);
            z7 z7Var2 = d8.a;
            if (i2 > -12 || r > -65) {
                return -1;
            }
            return i2 ^ (r << 8);
        } else if (i3 == 2) {
            return d8.d(i2, y7.r(bArr, j2), y7.r(bArr, j2 + 1));
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return d(r0, r2, r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r16, byte[] r17, int r18, int r19) {
        /*
            r15 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.length
            r4 = r1 | r2
            int r5 = r3 - r2
            r4 = r4 | r5
            r5 = 2
            r6 = 3
            r7 = 0
            if (r4 < 0) goto L_0x00b9
            long r3 = (long) r1
            long r1 = (long) r2
            long r1 = r1 - r3
            int r1 = (int) r1
            r2 = 16
            r8 = 1
            if (r1 >= r2) goto L_0x001d
            r2 = r7
            goto L_0x002e
        L_0x001d:
            r10 = r3
            r2 = r7
        L_0x001f:
            if (r2 >= r1) goto L_0x002d
            long r12 = r10 + r8
            byte r10 = b.l.a.c.f.i.y7.r(r0, r10)
            if (r10 < 0) goto L_0x002e
            int r2 = r2 + 1
            r10 = r12
            goto L_0x001f
        L_0x002d:
            r2 = r1
        L_0x002e:
            int r1 = r1 - r2
            long r10 = (long) r2
            long r3 = r3 + r10
        L_0x0031:
            r2 = r7
        L_0x0032:
            if (r1 <= 0) goto L_0x0041
            long r10 = r3 + r8
            byte r2 = b.l.a.c.f.i.y7.r(r0, r3)
            if (r2 < 0) goto L_0x0040
            int r1 = r1 + -1
            r3 = r10
            goto L_0x0032
        L_0x0040:
            r3 = r10
        L_0x0041:
            r10 = -1
            if (r1 != 0) goto L_0x0046
            goto L_0x00b8
        L_0x0046:
            int r1 = r1 + -1
            r11 = -32
            r12 = -65
            if (r2 >= r11) goto L_0x0065
            if (r1 == 0) goto L_0x0063
            int r1 = r1 + -1
            r11 = -62
            if (r2 < r11) goto L_0x0061
            long r13 = r3 + r8
            byte r2 = b.l.a.c.f.i.y7.r(r0, r3)
            if (r2 <= r12) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r3 = r13
            goto L_0x0031
        L_0x0061:
            r7 = r10
            goto L_0x00b8
        L_0x0063:
            r7 = r2
            goto L_0x00b8
        L_0x0065:
            r13 = -16
            if (r2 >= r13) goto L_0x008d
            if (r1 >= r5) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r1 = r1 + -2
            long r13 = r3 + r8
            byte r3 = b.l.a.c.f.i.y7.r(r0, r3)
            if (r3 > r12) goto L_0x0061
            r4 = -96
            if (r2 != r11) goto L_0x007c
            if (r3 < r4) goto L_0x0061
        L_0x007c:
            r11 = -19
            if (r2 != r11) goto L_0x0082
            if (r3 >= r4) goto L_0x0061
        L_0x0082:
            long r2 = r13 + r8
            byte r4 = b.l.a.c.f.i.y7.r(r0, r13)
            if (r4 <= r12) goto L_0x008b
            goto L_0x0061
        L_0x008b:
            r3 = r2
            goto L_0x0031
        L_0x008d:
            if (r1 >= r6) goto L_0x0094
        L_0x008f:
            int r7 = d(r0, r2, r3, r1)
            goto L_0x00b8
        L_0x0094:
            int r1 = r1 + -3
            long r13 = r3 + r8
            byte r3 = b.l.a.c.f.i.y7.r(r0, r3)
            if (r3 > r12) goto L_0x0061
            int r2 = r2 << 28
            int r3 = r3 + 112
            int r3 = r3 + r2
            int r2 = r3 >> 30
            if (r2 != 0) goto L_0x0061
            long r2 = r13 + r8
            byte r4 = b.l.a.c.f.i.y7.r(r0, r13)
            if (r4 > r12) goto L_0x0061
            long r13 = r2 + r8
            byte r2 = b.l.a.c.f.i.y7.r(r0, r2)
            if (r2 <= r12) goto L_0x005f
            goto L_0x0061
        L_0x00b8:
            return r7
        L_0x00b9:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r7] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r3 = 1
            r4[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r4[r5] = r1
            java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.c8.a(int, byte[], int, int):int");
    }

    public final String b(byte[] bArr, int i2, int i3) {
        int i4;
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) >= 0) {
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (r13 < i5) {
                byte r = y7.r(bArr, (long) r13);
                if (!a.u1(r)) {
                    break;
                }
                i2 = r13 + 1;
                cArr[i4] = (char) r;
                i6 = i4 + 1;
            }
            while (r13 < i5) {
                int i7 = r13 + 1;
                byte r2 = y7.r(bArr, (long) r13);
                if (a.u1(r2)) {
                    int i8 = i4 + 1;
                    cArr[i4] = (char) r2;
                    r13 = i7;
                    while (true) {
                        i4 = i8;
                        if (r13 >= i5) {
                            break;
                        }
                        byte r3 = y7.r(bArr, (long) r13);
                        if (!a.u1(r3)) {
                            break;
                        }
                        r13++;
                        i8 = i4 + 1;
                        cArr[i4] = (char) r3;
                    }
                } else {
                    if (!(r2 < -32)) {
                        if (r2 < -16) {
                            if (i7 < i5 - 1) {
                                int i9 = i7 + 1;
                                a.m2(r2, y7.r(bArr, (long) i7), y7.r(bArr, (long) i9), cArr, i4);
                                r13 = i9 + 1;
                                i4++;
                            } else {
                                throw y5.d();
                            }
                        } else if (i7 < i5 - 2) {
                            int i10 = i7 + 1;
                            int i11 = i10 + 1;
                            a.q2(r2, y7.r(bArr, (long) i7), y7.r(bArr, (long) i10), y7.r(bArr, (long) i11), cArr, i4);
                            i4 += 2;
                            r13 = i11 + 1;
                        } else {
                            throw y5.d();
                        }
                    } else if (i7 < i5) {
                        a.Y1(r2, y7.r(bArr, (long) i7), cArr, i4);
                        r13 = i7 + 1;
                        i4++;
                    } else {
                        throw y5.d();
                    }
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031 A[LOOP:1: B:11:0x0031->B:35:0x00f7, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:35:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:35:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:35:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x002f, B:35:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            long r4 = (long) r2
            long r6 = (long) r3
            long r6 = r6 + r4
            int r8 = r22.length()
            java.lang.String r9 = " at index "
            java.lang.String r10 = "Failed writing "
            if (r8 > r3) goto L_0x0143
            int r11 = r1.length
            int r11 = r11 - r3
            if (r11 < r2) goto L_0x0143
            r2 = 0
        L_0x001a:
            r3 = 128(0x80, float:1.794E-43)
            r11 = 1
            if (r2 >= r8) goto L_0x002f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x002f
            long r11 = r11 + r4
            byte r3 = (byte) r13
            b.l.a.c.f.i.y7.s(r1, r4, r3)
            int r2 = r2 + 1
            r4 = r11
            goto L_0x001a
        L_0x002f:
            if (r2 == r8) goto L_0x0141
        L_0x0031:
            if (r2 >= r8) goto L_0x013f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x0048
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x0048
            long r14 = r4 + r11
            byte r13 = (byte) r13
            b.l.a.c.f.i.y7.s(r1, r4, r13)
            r4 = r11
            r12 = r14
            r11 = r3
            goto L_0x00f7
        L_0x0048:
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 >= r14) goto L_0x0071
            r14 = -2
            long r14 = r14 + r6
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0071
            long r14 = r4 + r11
            int r3 = r13 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            b.l.a.c.f.i.y7.s(r1, r4, r3)
            long r3 = r14 + r11
            r5 = r13 & 63
            r13 = 128(0x80, float:1.794E-43)
            r5 = r5 | r13
            byte r5 = (byte) r5
            b.l.a.c.f.i.y7.s(r1, r14, r5)
            r19 = r11
            r11 = 128(0x80, float:1.794E-43)
            r12 = r3
            r4 = r19
            goto L_0x00f7
        L_0x0071:
            r3 = 57343(0xdfff, float:8.0355E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r14) goto L_0x007b
            if (r13 <= r3) goto L_0x00ab
        L_0x007b:
            r15 = -3
            long r15 = r15 + r6
            int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r15 > 0) goto L_0x00ab
            long r14 = r4 + r11
            int r3 = r13 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            b.l.a.c.f.i.y7.s(r1, r4, r3)
            long r3 = r14 + r11
            int r5 = r13 >>> 6
            r5 = r5 & 63
            r11 = 128(0x80, float:1.794E-43)
            r5 = r5 | r11
            byte r5 = (byte) r5
            b.l.a.c.f.i.y7.s(r1, r14, r5)
            r14 = 1
            long r17 = r3 + r14
            r5 = r13 & 63
            r5 = r5 | r11
            byte r5 = (byte) r5
            b.l.a.c.f.i.y7.s(r1, r3, r5)
            r12 = r17
            r4 = 1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00f7
        L_0x00ab:
            r11 = -4
            long r11 = r11 + r6
            int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x010a
            int r3 = r2 + 1
            if (r3 == r8) goto L_0x0102
            char r2 = r0.charAt(r3)
            boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
            if (r11 == 0) goto L_0x0101
            int r2 = java.lang.Character.toCodePoint(r13, r2)
            r11 = 1
            long r13 = r4 + r11
            int r15 = r2 >>> 18
            r15 = r15 | 240(0xf0, float:3.36E-43)
            byte r15 = (byte) r15
            b.l.a.c.f.i.y7.s(r1, r4, r15)
            long r4 = r13 + r11
            int r15 = r2 >>> 12
            r15 = r15 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r15 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            b.l.a.c.f.i.y7.s(r1, r13, r12)
            r12 = 1
            long r14 = r4 + r12
            int r16 = r2 >>> 6
            r12 = r16 & 63
            r12 = r12 | r11
            byte r12 = (byte) r12
            b.l.a.c.f.i.y7.s(r1, r4, r12)
            r4 = 1
            long r12 = r14 + r4
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            b.l.a.c.f.i.y7.s(r1, r14, r2)
            r2 = r3
        L_0x00f7:
            int r2 = r2 + 1
            r3 = r11
            r19 = r4
            r4 = r12
            r11 = r19
            goto L_0x0031
        L_0x0101:
            r2 = r3
        L_0x0102:
            b.l.a.c.f.i.b8 r0 = new b.l.a.c.f.i.b8
            int r2 = r2 + -1
            r0.<init>(r2, r8)
            throw r0
        L_0x010a:
            if (r13 < r14) goto L_0x0122
            if (r13 > r3) goto L_0x0122
            int r1 = r2 + 1
            if (r1 == r8) goto L_0x011c
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0122
        L_0x011c:
            b.l.a.c.f.i.b8 r0 = new b.l.a.c.f.i.b8
            r0.<init>(r2, r8)
            throw r0
        L_0x0122:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 46
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            r1.append(r9)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x013f:
            int r0 = (int) r4
            return r0
        L_0x0141:
            int r0 = (int) r4
            return r0
        L_0x0143:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 37
            r4.<init>(r5)
            r4.append(r10)
            r4.append(r0)
            r4.append(r9)
            int r0 = r2 + r3
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.c8.c(java.lang.CharSequence, byte[], int, int):int");
    }
}
