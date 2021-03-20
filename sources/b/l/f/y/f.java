package b.l.f.y;

public final class f {
    public static f a = new f();

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.y.b a(b.l.f.y.b r23, int r24, int r25, b.l.f.y.i r26) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            if (r1 <= 0) goto L_0x010b
            if (r2 <= 0) goto L_0x010b
            b.l.f.y.b r4 = new b.l.f.y.b
            r4.<init>(r1, r2)
            int r1 = r1 * 2
            float[] r5 = new float[r1]
            r7 = 0
        L_0x0016:
            if (r7 >= r2) goto L_0x010a
            float r8 = (float) r7
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r9
            r10 = 0
        L_0x001d:
            if (r10 >= r1) goto L_0x002c
            int r11 = r10 / 2
            float r11 = (float) r11
            float r11 = r11 + r9
            r5[r10] = r11
            int r11 = r10 + 1
            r5[r11] = r8
            int r10 = r10 + 2
            goto L_0x001d
        L_0x002c:
            float r8 = r3.a
            float r9 = r3.f5833b
            float r10 = r3.c
            float r11 = r3.d
            float r12 = r3.f5834e
            float r13 = r3.f
            float r14 = r3.f5835g
            float r15 = r3.f5836h
            float r6 = r3.f5837i
            int r2 = r1 + -1
            r3 = 0
        L_0x0041:
            if (r3 >= r2) goto L_0x006c
            r16 = r5[r3]
            int r17 = r3 + 1
            r18 = r5[r17]
            float r19 = r10 * r16
            float r20 = r13 * r18
            float r20 = r20 + r19
            float r20 = r20 + r6
            float r19 = r8 * r16
            float r21 = r11 * r18
            float r21 = r21 + r19
            float r21 = r21 + r14
            float r21 = r21 / r20
            r5[r3] = r21
            float r16 = r16 * r9
            float r18 = r18 * r12
            float r18 = r18 + r16
            float r18 = r18 + r15
            float r18 = r18 / r20
            r5[r17] = r18
            int r3 = r3 + 2
            goto L_0x0041
        L_0x006c:
            int r2 = r0.f5811h
            int r3 = r0.f5812i
            int r6 = r1 + -1
            r8 = 1
            r10 = r8
            r9 = 0
        L_0x0075:
            r11 = 0
            r12 = -1
            if (r9 >= r6) goto L_0x00ad
            if (r10 == 0) goto L_0x00ad
            r10 = r5[r9]
            int r10 = (int) r10
            int r13 = r9 + 1
            r14 = r5[r13]
            int r14 = (int) r14
            if (r10 < r12) goto L_0x00aa
            if (r10 > r2) goto L_0x00aa
            if (r14 < r12) goto L_0x00aa
            if (r14 > r3) goto L_0x00aa
            if (r10 != r12) goto L_0x0090
            r5[r9] = r11
            goto L_0x0097
        L_0x0090:
            if (r10 != r2) goto L_0x0099
            int r10 = r2 + -1
            float r10 = (float) r10
            r5[r9] = r10
        L_0x0097:
            r10 = r8
            goto L_0x009a
        L_0x0099:
            r10 = 0
        L_0x009a:
            if (r14 != r12) goto L_0x009f
            r5[r13] = r11
            goto L_0x00a6
        L_0x009f:
            if (r14 != r3) goto L_0x00a7
            int r10 = r3 + -1
            float r10 = (float) r10
            r5[r13] = r10
        L_0x00a6:
            r10 = r8
        L_0x00a7:
            int r9 = r9 + 2
            goto L_0x0075
        L_0x00aa:
            b.l.f.m r0 = b.l.f.m.f5759j
            throw r0
        L_0x00ad:
            int r6 = r1 + -2
            r9 = r8
        L_0x00b0:
            if (r6 < 0) goto L_0x00e6
            if (r9 == 0) goto L_0x00e6
            r9 = r5[r6]
            int r9 = (int) r9
            int r10 = r6 + 1
            r13 = r5[r10]
            int r13 = (int) r13
            if (r9 < r12) goto L_0x00e3
            if (r9 > r2) goto L_0x00e3
            if (r13 < r12) goto L_0x00e3
            if (r13 > r3) goto L_0x00e3
            if (r9 != r12) goto L_0x00c9
            r5[r6] = r11
            goto L_0x00d0
        L_0x00c9:
            if (r9 != r2) goto L_0x00d2
            int r9 = r2 + -1
            float r9 = (float) r9
            r5[r6] = r9
        L_0x00d0:
            r9 = r8
            goto L_0x00d3
        L_0x00d2:
            r9 = 0
        L_0x00d3:
            if (r13 != r12) goto L_0x00d8
            r5[r10] = r11
            goto L_0x00df
        L_0x00d8:
            if (r13 != r3) goto L_0x00e0
            int r9 = r3 + -1
            float r9 = (float) r9
            r5[r10] = r9
        L_0x00df:
            r9 = r8
        L_0x00e0:
            int r6 = r6 + -2
            goto L_0x00b0
        L_0x00e3:
            b.l.f.m r0 = b.l.f.m.f5759j
            throw r0
        L_0x00e6:
            r2 = 0
        L_0x00e7:
            if (r2 >= r1) goto L_0x0102
            r3 = r5[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00ff }
            int r3 = (int) r3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00ff }
            int r6 = r2 + 1
            r6 = r5[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00ff }
            int r6 = (int) r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00ff }
            boolean r3 = r0.b(r3, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00ff }
            if (r3 == 0) goto L_0x00fc
            int r3 = r2 / 2
            r4.g(r3, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00ff }
        L_0x00fc:
            int r2 = r2 + 2
            goto L_0x00e7
        L_0x00ff:
            b.l.f.m r0 = b.l.f.m.f5759j
            throw r0
        L_0x0102:
            int r7 = r7 + 1
            r2 = r25
            r3 = r26
            goto L_0x0016
        L_0x010a:
            return r4
        L_0x010b:
            b.l.f.m r0 = b.l.f.m.f5759j
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.y.f.a(b.l.f.y.b, int, int, b.l.f.y.i):b.l.f.y.b");
    }
}
