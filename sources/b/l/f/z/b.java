package b.l.f.z;

import b.l.f.u;

public final class b implements u {
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.y.b a(java.lang.String r18, b.l.f.a r19, int r20, int r21, java.util.Map<b.l.f.g, ?> r22) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = r18.isEmpty()
            if (r4 != 0) goto L_0x0434
            b.l.f.a r4 = b.l.f.a.DATA_MATRIX
            r5 = r19
            if (r5 != r4) goto L_0x0424
            if (r1 < 0) goto L_0x0408
            if (r2 < 0) goto L_0x0408
            b.l.f.z.e.k r4 = b.l.f.z.e.k.FORCE_NONE
            r5 = 0
            if (r3 == 0) goto L_0x0042
            b.l.f.g r6 = b.l.f.g.DATA_MATRIX_SHAPE
            java.lang.Object r6 = r3.get(r6)
            b.l.f.z.e.k r6 = (b.l.f.z.e.k) r6
            if (r6 == 0) goto L_0x0028
            r4 = r6
        L_0x0028:
            b.l.f.g r6 = b.l.f.g.MIN_SIZE
            java.lang.Object r6 = r3.get(r6)
            b.l.f.f r6 = (b.l.f.f) r6
            if (r6 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r6 = r5
        L_0x0034:
            b.l.f.g r7 = b.l.f.g.MAX_SIZE
            java.lang.Object r3 = r3.get(r7)
            b.l.f.f r3 = (b.l.f.f) r3
            if (r3 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r3 = r5
        L_0x0040:
            r5 = r6
            goto L_0x0043
        L_0x0042:
            r3 = r5
        L_0x0043:
            r6 = 6
            b.l.f.z.e.g[] r7 = new b.l.f.z.e.g[r6]
            b.l.f.z.e.a r8 = new b.l.f.z.e.a
            r8.<init>()
            r9 = 0
            r7[r9] = r8
            b.l.f.z.e.c r8 = new b.l.f.z.e.c
            r8.<init>()
            r10 = 1
            r7[r10] = r8
            b.l.f.z.e.l r8 = new b.l.f.z.e.l
            r8.<init>()
            r11 = 2
            r7[r11] = r8
            b.l.f.z.e.m r8 = new b.l.f.z.e.m
            r8.<init>()
            r12 = 3
            r7[r12] = r8
            b.l.f.z.e.f r8 = new b.l.f.z.e.f
            r8.<init>()
            r13 = 4
            r7[r13] = r8
            b.l.f.z.e.b r8 = new b.l.f.z.e.b
            r8.<init>()
            r14 = 5
            r7[r14] = r8
            b.l.f.z.e.h r8 = new b.l.f.z.e.h
            r8.<init>(r0)
            r8.f5876b = r4
            r8.c = r5
            r8.d = r3
            java.lang.String r15 = "[)>\u001e05\u001d"
            boolean r15 = r0.startsWith(r15)
            java.lang.String r6 = "\u001e\u0004"
            r12 = 7
            if (r15 == 0) goto L_0x009a
            boolean r15 = r0.endsWith(r6)
            if (r15 == 0) goto L_0x009a
            r0 = 236(0xec, float:3.31E-43)
        L_0x0094:
            java.lang.StringBuilder r6 = r8.f5877e
            r6.append(r0)
            goto L_0x00ab
        L_0x009a:
            java.lang.String r15 = "[)>\u001e06\u001d"
            boolean r15 = r0.startsWith(r15)
            if (r15 == 0) goto L_0x00b2
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L_0x00b2
            r0 = 237(0xed, float:3.32E-43)
            goto L_0x0094
        L_0x00ab:
            r8.f5880i = r11
            int r0 = r8.f
            int r0 = r0 + r12
            r8.f = r0
        L_0x00b2:
            r0 = r9
        L_0x00b3:
            boolean r6 = r8.d()
            if (r6 == 0) goto L_0x00c7
            r6 = r7[r0]
            r6.a(r8)
            int r6 = r8.f5878g
            if (r6 < 0) goto L_0x00b3
            r0 = -1
            r8.f5878g = r0
            r0 = r6
            goto L_0x00b3
        L_0x00c7:
            int r6 = r8.a()
            r8.e()
            b.l.f.z.e.j r7 = r8.f5879h
            int r7 = r7.f5883b
            r15 = 254(0xfe, float:3.56E-43)
            if (r6 >= r7) goto L_0x00e1
            if (r0 == 0) goto L_0x00e1
            if (r0 == r14) goto L_0x00e1
            if (r0 == r13) goto L_0x00e1
            java.lang.StringBuilder r0 = r8.f5877e
            r0.append(r15)
        L_0x00e1:
            java.lang.StringBuilder r0 = r8.f5877e
            int r6 = r0.length()
            r12 = 129(0x81, float:1.81E-43)
            if (r6 >= r7) goto L_0x00ee
            r0.append(r12)
        L_0x00ee:
            int r6 = r0.length()
            if (r6 >= r7) goto L_0x0109
            int r6 = r0.length()
            int r6 = r6 + r10
            int r6 = r6 * 149
            int r6 = r6 % 253
            int r6 = r6 + r10
            int r6 = r6 + r12
            if (r6 > r15) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            int r6 = r6 + -254
        L_0x0104:
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00ee
        L_0x0109:
            java.lang.StringBuilder r0 = r8.f5877e
            java.lang.String r0 = r0.toString()
            int r6 = r0.length()
            b.l.f.z.e.j r3 = b.l.f.z.e.j.i(r6, r4, r5, r3, r10)
            int[] r4 = b.l.f.z.e.i.a
            int r4 = r0.length()
            int r5 = r3.f5883b
            if (r4 != r5) goto L_0x0400
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r6 = r3.c
            int r5 = r5 + r6
            r4.<init>(r5)
            r4.append(r0)
            int r5 = r3.c()
            if (r5 != r10) goto L_0x013c
            int r5 = r3.c
            java.lang.String r0 = b.l.f.z.e.i.a(r0, r5)
            r4.append(r0)
            goto L_0x0198
        L_0x013c:
            int r6 = r4.capacity()
            r4.setLength(r6)
            int[] r6 = new int[r5]
            int[] r7 = new int[r5]
            r8 = r9
        L_0x0148:
            if (r8 >= r5) goto L_0x0158
            int r12 = r8 + 1
            int r15 = r3.a(r12)
            r6[r8] = r15
            int r15 = r3.f5886h
            r7[r8] = r15
            r8 = r12
            goto L_0x0148
        L_0x0158:
            r8 = r9
        L_0x0159:
            if (r8 >= r5) goto L_0x0198
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r15 = r6[r8]
            r12.<init>(r15)
            r15 = r8
        L_0x0163:
            int r14 = r3.f5883b
            if (r15 >= r14) goto L_0x0170
            char r14 = r0.charAt(r15)
            r12.append(r14)
            int r15 = r15 + r5
            goto L_0x0163
        L_0x0170:
            java.lang.String r12 = r12.toString()
            r14 = r7[r8]
            java.lang.String r12 = b.l.f.z.e.i.a(r12, r14)
            r14 = r8
            r15 = r9
        L_0x017c:
            r16 = r7[r8]
            int r13 = r16 * r5
            if (r14 >= r13) goto L_0x0193
            int r13 = r3.f5883b
            int r13 = r13 + r14
            int r16 = r15 + 1
            char r15 = r12.charAt(r15)
            r4.setCharAt(r13, r15)
            int r14 = r14 + r5
            r15 = r16
            r13 = 4
            goto L_0x017c
        L_0x0193:
            int r8 = r8 + 1
            r13 = 4
            r14 = 5
            goto L_0x0159
        L_0x0198:
            java.lang.String r0 = r4.toString()
            b.l.f.z.e.e r4 = new b.l.f.z.e.e
            int r5 = r3.e()
            int r6 = r3.d()
            r4.<init>(r0, r5, r6)
            r5 = r9
            r6 = r5
            r0 = 4
        L_0x01ac:
            int r7 = r4.f5875b
            r8 = 8
            if (r0 != r7) goto L_0x01ec
            if (r5 != 0) goto L_0x01ec
            int r12 = r6 + 1
            int r7 = r7 + -1
            r4.a(r7, r9, r6, r10)
            int r7 = r4.f5875b
            int r7 = r7 - r10
            r4.a(r7, r10, r6, r11)
            int r7 = r4.f5875b
            int r7 = r7 - r10
            r13 = 3
            r4.a(r7, r11, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r11
            r13 = 4
            r4.a(r9, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r13 = 5
            r4.a(r9, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r13 = 6
            r4.a(r10, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r13 = 7
            r4.a(r11, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r13 = 3
            r4.a(r13, r7, r6, r8)
            r6 = r12
        L_0x01ec:
            int r7 = r4.f5875b
            int r12 = r7 + -2
            if (r0 != r12) goto L_0x0231
            if (r5 != 0) goto L_0x0231
            int r12 = r4.c
            r13 = 4
            int r12 = r12 % r13
            if (r12 == 0) goto L_0x0231
            int r12 = r6 + 1
            int r7 = r7 + -3
            r4.a(r7, r9, r6, r10)
            int r7 = r4.f5875b
            int r7 = r7 - r11
            r4.a(r7, r9, r6, r11)
            int r7 = r4.f5875b
            int r7 = r7 - r10
            r13 = 3
            r4.a(r7, r9, r6, r13)
            int r7 = r4.c
            r14 = 4
            int r7 = r7 - r14
            r4.a(r9, r7, r6, r14)
            int r7 = r4.c
            int r7 = r7 - r13
            r13 = 5
            r4.a(r9, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r11
            r13 = 6
            r4.a(r9, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r13 = 7
            r4.a(r9, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r4.a(r10, r7, r6, r8)
            r6 = r12
        L_0x0231:
            int r7 = r4.f5875b
            int r12 = r7 + -2
            if (r0 != r12) goto L_0x0277
            if (r5 != 0) goto L_0x0277
            int r12 = r4.c
            int r12 = r12 % r8
            r13 = 4
            if (r12 != r13) goto L_0x0277
            int r12 = r6 + 1
            int r7 = r7 + -3
            r4.a(r7, r9, r6, r10)
            int r7 = r4.f5875b
            int r7 = r7 - r11
            r4.a(r7, r9, r6, r11)
            int r7 = r4.f5875b
            int r7 = r7 - r10
            r13 = 3
            r4.a(r7, r9, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r11
            r13 = 4
            r4.a(r9, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r13 = 5
            r4.a(r9, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r13 = 6
            r4.a(r10, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r13 = 7
            r4.a(r11, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r13 = 3
            r4.a(r13, r7, r6, r8)
            r6 = r12
        L_0x0277:
            int r7 = r4.f5875b
            int r12 = r7 + 4
            if (r0 != r12) goto L_0x02bf
            if (r5 != r11) goto L_0x02bf
            int r12 = r4.c
            int r12 = r12 % r8
            if (r12 != 0) goto L_0x02bf
            int r12 = r6 + 1
            int r7 = r7 + -1
            r4.a(r7, r9, r6, r10)
            int r7 = r4.f5875b
            int r7 = r7 - r10
            int r13 = r4.c
            int r13 = r13 - r10
            r4.a(r7, r13, r6, r11)
            int r7 = r4.c
            r13 = 3
            int r7 = r7 - r13
            r4.a(r9, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r11
            r14 = 4
            r4.a(r9, r7, r6, r14)
            int r7 = r4.c
            int r7 = r7 - r10
            r15 = 5
            r4.a(r9, r7, r6, r15)
            int r7 = r4.c
            int r7 = r7 - r13
            r13 = 6
            r4.a(r10, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r11
            r13 = 7
            r4.a(r10, r7, r6, r13)
            int r7 = r4.c
            int r7 = r7 - r10
            r4.a(r10, r7, r6, r8)
            r6 = r12
            goto L_0x02c2
        L_0x02bf:
            r13 = 7
            r14 = 4
            r15 = 5
        L_0x02c2:
            int r7 = r4.f5875b
            if (r0 >= r7) goto L_0x02d4
            if (r5 < 0) goto L_0x02d4
            boolean r7 = r4.b(r5, r0)
            if (r7 == 0) goto L_0x02d4
            int r7 = r6 + 1
            r4.d(r0, r5, r6)
            r6 = r7
        L_0x02d4:
            int r0 = r0 + -2
            int r5 = r5 + 2
            if (r0 < 0) goto L_0x02de
            int r7 = r4.c
            if (r5 < r7) goto L_0x02c2
        L_0x02de:
            int r0 = r0 + 1
            int r5 = r5 + 3
        L_0x02e2:
            if (r0 < 0) goto L_0x02f4
            int r7 = r4.c
            if (r5 >= r7) goto L_0x02f4
            boolean r7 = r4.b(r5, r0)
            if (r7 == 0) goto L_0x02f4
            int r7 = r6 + 1
            r4.d(r0, r5, r6)
            r6 = r7
        L_0x02f4:
            int r0 = r0 + 2
            int r5 = r5 + -2
            int r7 = r4.f5875b
            if (r0 >= r7) goto L_0x02fe
            if (r5 >= 0) goto L_0x02e2
        L_0x02fe:
            int r0 = r0 + 3
            int r5 = r5 + 1
            if (r0 < r7) goto L_0x01ac
            int r8 = r4.c
            if (r5 < r8) goto L_0x01ac
            int r8 = r8 - r10
            int r7 = r7 - r10
            boolean r0 = r4.b(r8, r7)
            if (r0 == 0) goto L_0x0322
            int r0 = r4.c
            int r0 = r0 - r10
            int r5 = r4.f5875b
            int r5 = r5 - r10
            r4.c(r0, r5, r10)
            int r0 = r4.c
            int r0 = r0 - r11
            int r5 = r4.f5875b
            int r5 = r5 - r11
            r4.c(r0, r5, r10)
        L_0x0322:
            int r0 = r3.e()
            int r5 = r3.d()
            b.l.f.e0.e.b r6 = new b.l.f.e0.e.b
            int r7 = r3.g()
            int r8 = r3.f()
            r6.<init>(r7, r8)
            r7 = r9
            r8 = r7
        L_0x0339:
            if (r7 >= r5) goto L_0x03ac
            int r12 = r3.f5884e
            int r12 = r7 % r12
            if (r12 != 0) goto L_0x0359
            r12 = r9
            r13 = r12
        L_0x0343:
            int r14 = r3.g()
            if (r12 >= r14) goto L_0x0357
            int r14 = r12 % 2
            if (r14 != 0) goto L_0x034f
            r14 = r10
            goto L_0x0350
        L_0x034f:
            r14 = r9
        L_0x0350:
            r6.c(r13, r8, r14)
            int r13 = r13 + r10
            int r12 = r12 + 1
            goto L_0x0343
        L_0x0357:
            int r8 = r8 + 1
        L_0x0359:
            r12 = r9
            r13 = r12
        L_0x035b:
            if (r12 >= r0) goto L_0x038f
            int r14 = r3.d
            int r14 = r12 % r14
            if (r14 != 0) goto L_0x0368
            r6.c(r13, r8, r10)
            int r13 = r13 + 1
        L_0x0368:
            byte[] r14 = r4.d
            int r15 = r4.c
            int r15 = r15 * r7
            int r15 = r15 + r12
            byte r14 = r14[r15]
            if (r14 != r10) goto L_0x0374
            r14 = r10
            goto L_0x0375
        L_0x0374:
            r14 = r9
        L_0x0375:
            r6.c(r13, r8, r14)
            int r13 = r13 + r10
            int r14 = r3.d
            int r15 = r12 % r14
            int r14 = r14 - r10
            if (r15 != r14) goto L_0x038c
            int r14 = r7 % 2
            if (r14 != 0) goto L_0x0386
            r14 = r10
            goto L_0x0387
        L_0x0386:
            r14 = r9
        L_0x0387:
            r6.c(r13, r8, r14)
            int r13 = r13 + 1
        L_0x038c:
            int r12 = r12 + 1
            goto L_0x035b
        L_0x038f:
            int r8 = r8 + 1
            int r12 = r3.f5884e
            int r13 = r7 % r12
            int r12 = r12 - r10
            if (r13 != r12) goto L_0x03a9
            r12 = r9
            r13 = r12
        L_0x039a:
            int r14 = r3.g()
            if (r12 >= r14) goto L_0x03a7
            r6.c(r13, r8, r10)
            int r13 = r13 + r10
            int r12 = r12 + 1
            goto L_0x039a
        L_0x03a7:
            int r8 = r8 + 1
        L_0x03a9:
            int r7 = r7 + 1
            goto L_0x0339
        L_0x03ac:
            int r0 = r6.f5744b
            int r3 = r6.c
            int r4 = java.lang.Math.max(r1, r0)
            int r5 = java.lang.Math.max(r2, r3)
            int r7 = r4 / r0
            int r8 = r5 / r3
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r0 * r7
            int r4 = r4 - r8
            int r4 = r4 / r11
            int r8 = r3 * r7
            int r5 = r5 - r8
            int r5 = r5 / r11
            if (r2 < r3) goto L_0x03d3
            if (r1 >= r0) goto L_0x03cd
            goto L_0x03d3
        L_0x03cd:
            b.l.f.y.b r8 = new b.l.f.y.b
            r8.<init>(r1, r2)
            goto L_0x03da
        L_0x03d3:
            b.l.f.y.b r8 = new b.l.f.y.b
            r8.<init>(r0, r3)
            r4 = r9
            r5 = r4
        L_0x03da:
            int[] r1 = r8.f5814k
            int r1 = r1.length
            r2 = r9
        L_0x03de:
            if (r2 >= r1) goto L_0x03e7
            int[] r11 = r8.f5814k
            r11[r2] = r9
            int r2 = r2 + 1
            goto L_0x03de
        L_0x03e7:
            r1 = r9
        L_0x03e8:
            if (r1 >= r3) goto L_0x03ff
            r11 = r4
            r2 = r9
        L_0x03ec:
            if (r2 >= r0) goto L_0x03fb
            byte r12 = r6.a(r2, r1)
            if (r12 != r10) goto L_0x03f7
            r8.h(r11, r5, r7, r7)
        L_0x03f7:
            int r2 = r2 + 1
            int r11 = r11 + r7
            goto L_0x03ec
        L_0x03fb:
            int r1 = r1 + 1
            int r5 = r5 + r7
            goto L_0x03e8
        L_0x03ff:
            return r8
        L_0x0400:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The number of codewords does not match the selected symbol"
            r0.<init>(r1)
            throw r0
        L_0x0408:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Requested dimensions can't be negative: "
            r3.<init>(r4)
            r3.append(r1)
            r1 = 120(0x78, float:1.68E-43)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0424:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r19)
            java.lang.String r2 = "Can only encode DATA_MATRIX, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0434:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Found empty contents"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.z.b.a(java.lang.String, b.l.f.a, int, int, java.util.Map):b.l.f.y.b");
    }
}
