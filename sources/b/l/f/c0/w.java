package b.l.f.c0;

public final class w {
    public static final int[] c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    public final int[] a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f5650b = new StringBuilder();

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.q a(int r18, b.l.f.y.a r19, int[] r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            java.lang.StringBuilder r2 = r0.f5650b
            r3 = 0
            r2.setLength(r3)
            int[] r4 = r0.a
            r4[r3] = r3
            r5 = 1
            r4[r5] = r3
            r6 = 2
            r4[r6] = r3
            r7 = 3
            r4[r7] = r3
            int r8 = r1.f5810i
            r9 = r20[r5]
            r10 = r3
            r11 = r10
        L_0x001d:
            r12 = 48
            r13 = 5
            r14 = 10
            if (r10 >= r13) goto L_0x0053
            if (r9 >= r8) goto L_0x0053
            int[][] r13 = b.l.f.c0.y.f5654h
            int r13 = b.l.f.c0.y.k(r1, r4, r9, r13)
            int r15 = r13 % 10
            int r15 = r15 + r12
            char r12 = (char) r15
            r2.append(r12)
            int r12 = r4.length
            r15 = r3
        L_0x0035:
            if (r15 >= r12) goto L_0x003e
            r16 = r4[r15]
            int r9 = r9 + r16
            int r15 = r15 + 1
            goto L_0x0035
        L_0x003e:
            if (r13 < r14) goto L_0x0045
            int r12 = 4 - r10
            int r12 = r5 << r12
            r11 = r11 | r12
        L_0x0045:
            r12 = 4
            if (r10 == r12) goto L_0x0050
            int r9 = r1.g(r9)
            int r9 = r1.h(r9)
        L_0x0050:
            int r10 = r10 + 1
            goto L_0x001d
        L_0x0053:
            int r1 = r2.length()
            if (r1 != r13) goto L_0x0161
            r1 = r3
        L_0x005a:
            if (r1 >= r14) goto L_0x015e
            int[] r4 = c
            r4 = r4[r1]
            if (r11 != r4) goto L_0x0158
            java.lang.String r4 = r2.toString()
            int r8 = r4.length()
            int r10 = r8 + -2
            r11 = r3
        L_0x006d:
            if (r10 < 0) goto L_0x0079
            char r15 = r4.charAt(r10)
            int r15 = r15 + -48
            int r11 = r11 + r15
            int r10 = r10 + -2
            goto L_0x006d
        L_0x0079:
            int r11 = r11 * r7
            r10 = -1
            int r8 = r8 + r10
        L_0x007c:
            if (r8 < 0) goto L_0x0088
            char r15 = r4.charAt(r8)
            int r15 = r15 + -48
            int r11 = r11 + r15
            int r8 = r8 + -2
            goto L_0x007c
        L_0x0088:
            int r11 = r11 * r7
            int r11 = r11 % r14
            if (r11 != r1) goto L_0x0155
            java.lang.String r1 = r2.toString()
            int r2 = r1.length()
            r4 = 0
            if (r2 == r13) goto L_0x0099
            goto L_0x011d
        L_0x0099:
            char r2 = r1.charAt(r3)
            if (r2 == r12) goto L_0x00e1
            r7 = 53
            if (r2 == r7) goto L_0x00de
            r7 = 57
            if (r2 == r7) goto L_0x00a8
            goto L_0x00d3
        L_0x00a8:
            int r2 = r1.hashCode()
            switch(r2) {
                case 54118329: goto L_0x00c6;
                case 54395376: goto L_0x00bb;
                case 54395377: goto L_0x00b0;
                default: goto L_0x00af;
            }
        L_0x00af:
            goto L_0x00d0
        L_0x00b0:
            java.lang.String r2 = "99991"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00b9
            goto L_0x00d0
        L_0x00b9:
            r10 = r6
            goto L_0x00d0
        L_0x00bb:
            java.lang.String r2 = "99990"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00c4
            goto L_0x00d0
        L_0x00c4:
            r10 = r5
            goto L_0x00d0
        L_0x00c6:
            java.lang.String r2 = "90000"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r10 = r3
        L_0x00d0:
            switch(r10) {
                case 0: goto L_0x00dc;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00d6;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            java.lang.String r2 = ""
            goto L_0x00e3
        L_0x00d6:
            java.lang.String r2 = "0.00"
            goto L_0x011b
        L_0x00d9:
            java.lang.String r2 = "Used"
            goto L_0x011b
        L_0x00dc:
            r2 = r4
            goto L_0x011b
        L_0x00de:
            java.lang.String r2 = "$"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r2 = "£"
        L_0x00e3:
            java.lang.String r7 = r1.substring(r5)
            int r7 = java.lang.Integer.parseInt(r7)
            int r8 = r7 / 100
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r7 = r7 % 100
            if (r7 >= r14) goto L_0x0100
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r10 = "0"
            java.lang.String r7 = r10.concat(r7)
            goto L_0x0104
        L_0x0100:
            java.lang.String r7 = java.lang.String.valueOf(r7)
        L_0x0104:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r8)
            r2 = 46
            r10.append(r2)
            r10.append(r7)
            java.lang.String r2 = r10.toString()
        L_0x011b:
            if (r2 != 0) goto L_0x011f
        L_0x011d:
            r7 = r4
            goto L_0x012b
        L_0x011f:
            java.util.EnumMap r7 = new java.util.EnumMap
            java.lang.Class<b.l.f.r> r8 = b.l.f.r.class
            r7.<init>(r8)
            b.l.f.r r8 = b.l.f.r.SUGGESTED_PRICE
            r7.put(r8, r2)
        L_0x012b:
            b.l.f.q r2 = new b.l.f.q
            b.l.f.s[] r6 = new b.l.f.s[r6]
            b.l.f.s r8 = new b.l.f.s
            r10 = r20[r3]
            r11 = r20[r5]
            int r10 = r10 + r11
            float r10 = (float) r10
            r11 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r11
            r15 = r18
            float r11 = (float) r15
            r8.<init>(r10, r11)
            r6[r3] = r8
            b.l.f.s r3 = new b.l.f.s
            float r8 = (float) r9
            r3.<init>(r8, r11)
            r6[r5] = r3
            b.l.f.a r3 = b.l.f.a.UPC_EAN_EXTENSION
            r2.<init>(r1, r4, r6, r3)
            if (r7 == 0) goto L_0x0154
            r2.a(r7)
        L_0x0154:
            return r2
        L_0x0155:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x0158:
            r15 = r18
            int r1 = r1 + 1
            goto L_0x005a
        L_0x015e:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x0161:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.w.a(int, b.l.f.y.a, int[]):b.l.f.q");
    }
}
