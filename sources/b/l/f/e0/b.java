package b.l.f.e0;

import b.l.f.u;

public final class b implements u {
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0165 A[LOOP:2: B:90:0x0133->B:105:0x0165, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[SYNTHETIC, Splitter:B:26:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x00bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0174 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.y.b a(java.lang.String r26, b.l.f.a r27, int r28, int r29, java.util.Map<b.l.f.g, ?> r30) {
        /*
            r25 = this;
            r0 = r26
            r1 = r28
            r2 = r29
            r3 = r30
            boolean r4 = r26.isEmpty()
            if (r4 != 0) goto L_0x069e
            b.l.f.a r4 = b.l.f.a.QR_CODE
            r5 = r27
            if (r5 != r4) goto L_0x068e
            if (r1 < 0) goto L_0x0670
            if (r2 < 0) goto L_0x0670
            b.l.f.e0.c.f r4 = b.l.f.e0.c.f.L
            if (r3 == 0) goto L_0x0045
            b.l.f.g r6 = b.l.f.g.ERROR_CORRECTION
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0030
            java.lang.Object r4 = r3.get(r6)
            java.lang.String r4 = r4.toString()
            b.l.f.e0.c.f r4 = b.l.f.e0.c.f.valueOf(r4)
        L_0x0030:
            b.l.f.g r6 = b.l.f.g.MARGIN
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0045
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = r6.toString()
            int r6 = java.lang.Integer.parseInt(r6)
            goto L_0x0046
        L_0x0045:
            r6 = 4
        L_0x0046:
            b.l.f.g r7 = b.l.f.g.GS1_FORMAT
            b.l.f.g r8 = b.l.f.g.CHARACTER_SET
            b.l.f.e0.c.h r9 = b.l.f.e0.c.h.BYTE
            if (r3 == 0) goto L_0x0056
            boolean r12 = r3.containsKey(r8)
            if (r12 == 0) goto L_0x0056
            r12 = 1
            goto L_0x0057
        L_0x0056:
            r12 = 0
        L_0x0057:
            if (r12 == 0) goto L_0x0062
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = r8.toString()
            goto L_0x0064
        L_0x0062:
            java.lang.String r8 = "ISO-8859-1"
        L_0x0064:
            java.lang.String r13 = "Shift_JIS"
            boolean r14 = r13.equals(r8)
            if (r14 == 0) goto L_0x0099
            byte[] r14 = r0.getBytes(r13)     // Catch:{ UnsupportedEncodingException -> 0x0093 }
            int r11 = r14.length
            int r16 = r11 % 2
            if (r16 == 0) goto L_0x0076
            goto L_0x0093
        L_0x0076:
            r10 = 0
        L_0x0077:
            if (r10 >= r11) goto L_0x0091
            byte r5 = r14[r10]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r15 = 129(0x81, float:1.81E-43)
            if (r5 < r15) goto L_0x0085
            r15 = 159(0x9f, float:2.23E-43)
            if (r5 <= r15) goto L_0x008e
        L_0x0085:
            r15 = 224(0xe0, float:3.14E-43)
            if (r5 < r15) goto L_0x0093
            r15 = 235(0xeb, float:3.3E-43)
            if (r5 <= r15) goto L_0x008e
            goto L_0x0093
        L_0x008e:
            int r10 = r10 + 2
            goto L_0x0077
        L_0x0091:
            r5 = 1
            goto L_0x0094
        L_0x0093:
            r5 = 0
        L_0x0094:
            if (r5 == 0) goto L_0x0099
            b.l.f.e0.c.h r5 = b.l.f.e0.c.h.KANJI
            goto L_0x00c6
        L_0x0099:
            r5 = 0
            r10 = 0
            r11 = 0
        L_0x009c:
            int r14 = r26.length()
            if (r11 >= r14) goto L_0x00bb
            char r14 = r0.charAt(r11)
            r15 = 48
            if (r14 < r15) goto L_0x00b0
            r15 = 57
            if (r14 > r15) goto L_0x00b0
            r10 = 1
            goto L_0x00b8
        L_0x00b0:
            int r5 = b.l.f.e0.e.c.b(r14)
            r14 = -1
            if (r5 == r14) goto L_0x00c5
            r5 = 1
        L_0x00b8:
            int r11 = r11 + 1
            goto L_0x009c
        L_0x00bb:
            if (r5 == 0) goto L_0x00c0
            b.l.f.e0.c.h r5 = b.l.f.e0.c.h.ALPHANUMERIC
            goto L_0x00c6
        L_0x00c0:
            if (r10 == 0) goto L_0x00c5
            b.l.f.e0.c.h r5 = b.l.f.e0.c.h.NUMERIC
            goto L_0x00c6
        L_0x00c5:
            r5 = r9
        L_0x00c6:
            b.l.f.y.a r10 = new b.l.f.y.a
            r10.<init>()
            r11 = 8
            r14 = 7
            if (r5 != r9) goto L_0x00e8
            if (r12 == 0) goto L_0x00e8
            java.util.Map<java.lang.String, b.l.f.y.d> r12 = b.l.f.y.d.L
            java.lang.Object r12 = r12.get(r8)
            b.l.f.y.d r12 = (b.l.f.y.d) r12
            if (r12 == 0) goto L_0x00e8
            r15 = 4
            r10.c(r14, r15)
            int[] r12 = r12.f5824h
            r15 = 0
            r12 = r12[r15]
            r10.c(r12, r11)
        L_0x00e8:
            if (r3 == 0) goto L_0x00f2
            boolean r12 = r3.containsKey(r7)
            if (r12 == 0) goto L_0x00f2
            r12 = 1
            goto L_0x00f3
        L_0x00f2:
            r12 = 0
        L_0x00f3:
            if (r12 == 0) goto L_0x010d
            java.lang.Object r7 = r3.get(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x010d
            r7 = 5
            r12 = 4
            r10.c(r7, r12)
            goto L_0x010e
        L_0x010d:
            r12 = 4
        L_0x010e:
            int r7 = r5.f5729i
            r10.c(r7, r12)
            b.l.f.y.a r7 = new b.l.f.y.a
            r7.<init>()
            int r15 = r5.ordinal()
            r14 = 2
            r11 = 1
            if (r15 == r11) goto L_0x01f3
            r11 = 6
            if (r15 == r14) goto L_0x01b6
            if (r15 == r12) goto L_0x019c
            if (r15 != r11) goto L_0x018c
            byte[] r8 = r0.getBytes(r13)     // Catch:{ UnsupportedEncodingException -> 0x0184 }
            int r11 = r8.length
            int r11 = r11 % r14
            if (r11 != 0) goto L_0x017c
            int r11 = r8.length
            r12 = -1
            int r11 = r11 + r12
            r12 = 0
        L_0x0133:
            if (r12 >= r11) goto L_0x0237
            byte r13 = r8[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r15 = r12 + 1
            byte r15 = r8[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r20 = 8
            int r13 = r13 << 8
            r13 = r13 | r15
            r15 = 33088(0x8140, float:4.6366E-41)
            if (r13 < r15) goto L_0x0152
            r15 = 40956(0x9ffc, float:5.7392E-41)
            if (r13 > r15) goto L_0x0152
            r15 = 33088(0x8140, float:4.6366E-41)
            goto L_0x015f
        L_0x0152:
            r15 = 57408(0xe040, float:8.0446E-41)
            if (r13 < r15) goto L_0x0161
            r15 = 60351(0xebbf, float:8.457E-41)
            if (r13 > r15) goto L_0x0161
            r15 = 49472(0xc140, float:6.9325E-41)
        L_0x015f:
            int r13 = r13 - r15
            goto L_0x0162
        L_0x0161:
            r13 = -1
        L_0x0162:
            r15 = -1
            if (r13 == r15) goto L_0x0174
            int r15 = r13 >> 8
            int r15 = r15 * 192
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r13
            r13 = 13
            r7.c(r15, r13)
            int r12 = r12 + 2
            goto L_0x0133
        L_0x0174:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Invalid byte sequence"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x017c:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Kanji byte size not even"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0184:
            r0 = move-exception
            r1 = r0
            b.l.f.v r0 = new b.l.f.v
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x018c:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Invalid mode: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x019c:
            byte[] r8 = r0.getBytes(r8)     // Catch:{ UnsupportedEncodingException -> 0x01ae }
            int r11 = r8.length
            r12 = 0
        L_0x01a2:
            if (r12 >= r11) goto L_0x0237
            byte r13 = r8[r12]
            r15 = 8
            r7.c(r13, r15)
            int r12 = r12 + 1
            goto L_0x01a2
        L_0x01ae:
            r0 = move-exception
            r1 = r0
            b.l.f.v r0 = new b.l.f.v
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x01b6:
            int r8 = r26.length()
            r12 = 0
        L_0x01bb:
            if (r12 >= r8) goto L_0x0237
            char r13 = r0.charAt(r12)
            int r13 = b.l.f.e0.e.c.b(r13)
            r15 = -1
            if (r13 == r15) goto L_0x01ed
            int r14 = r12 + 1
            if (r14 >= r8) goto L_0x01e7
            char r14 = r0.charAt(r14)
            int r14 = b.l.f.e0.e.c.b(r14)
            if (r14 == r15) goto L_0x01e1
            int r13 = r13 * 45
            int r13 = r13 + r14
            r14 = 11
            r7.c(r13, r14)
            int r12 = r12 + 2
            goto L_0x01eb
        L_0x01e1:
            b.l.f.v r0 = new b.l.f.v
            r0.<init>()
            throw r0
        L_0x01e7:
            r7.c(r13, r11)
            r12 = r14
        L_0x01eb:
            r14 = 2
            goto L_0x01bb
        L_0x01ed:
            b.l.f.v r0 = new b.l.f.v
            r0.<init>()
            throw r0
        L_0x01f3:
            int r8 = r26.length()
            r11 = 0
        L_0x01f8:
            if (r11 >= r8) goto L_0x0237
            char r12 = r0.charAt(r11)
            int r12 = r12 + -48
            int r13 = r11 + 2
            if (r13 >= r8) goto L_0x021f
            int r14 = r11 + 1
            char r14 = r0.charAt(r14)
            int r14 = r14 + -48
            char r13 = r0.charAt(r13)
            int r13 = r13 + -48
            int r12 = r12 * 100
            r15 = 10
            int r14 = r14 * r15
            int r14 = r14 + r12
            int r14 = r14 + r13
            r7.c(r14, r15)
            int r11 = r11 + 3
            goto L_0x01f8
        L_0x021f:
            int r11 = r11 + 1
            if (r11 >= r8) goto L_0x0232
            char r11 = r0.charAt(r11)
            int r11 = r11 + -48
            int r12 = r12 * 10
            int r12 = r12 + r11
            r11 = 7
            r7.c(r12, r11)
            r11 = r13
            goto L_0x01f8
        L_0x0232:
            r13 = 4
            r7.c(r12, r13)
            goto L_0x01f8
        L_0x0237:
            if (r3 == 0) goto L_0x026a
            b.l.f.g r8 = b.l.f.g.QR_VERSION
            boolean r11 = r3.containsKey(r8)
            if (r11 == 0) goto L_0x026a
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3)
            b.l.f.e0.c.j r3 = b.l.f.e0.c.j.d(r3)
            int r8 = r10.f5810i
            int r11 = r5.d(r3)
            int r11 = r11 + r8
            int r8 = r7.f5810i
            int r11 = r11 + r8
            boolean r8 = b.l.f.e0.e.c.c(r11, r3, r4)
            if (r8 == 0) goto L_0x0262
            goto L_0x028b
        L_0x0262:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Data too big for requested version"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x026a:
            r3 = 1
            b.l.f.e0.c.j r8 = b.l.f.e0.c.j.d(r3)
            int r3 = r10.f5810i
            int r8 = r5.d(r8)
            int r8 = r8 + r3
            int r3 = r7.f5810i
            int r8 = r8 + r3
            b.l.f.e0.c.j r3 = b.l.f.e0.e.c.a(r8, r4)
            int r8 = r10.f5810i
            int r3 = r5.d(r3)
            int r3 = r3 + r8
            int r8 = r7.f5810i
            int r3 = r3 + r8
            b.l.f.e0.c.j r3 = b.l.f.e0.e.c.a(r3, r4)
        L_0x028b:
            b.l.f.y.a r8 = new b.l.f.y.a
            r8.<init>()
            r8.b(r10)
            if (r5 != r9) goto L_0x029a
            int r0 = r7.i()
            goto L_0x029e
        L_0x029a:
            int r0 = r26.length()
        L_0x029e:
            int r5 = r5.d(r3)
            r9 = 1
            int r10 = r9 << r5
            if (r0 >= r10) goto L_0x0654
            r8.c(r0, r5)
            r8.b(r7)
            b.l.f.e0.c.j$b[] r0 = r3.c
            int r5 = r4.ordinal()
            r0 = r0[r5]
            int r5 = r3.d
            int r7 = r0.a
            int r9 = r0.a()
            int r9 = r9 * r7
            int r5 = r5 - r9
            int r7 = r5 << 3
            int r9 = r8.f5810i
            if (r9 > r7) goto L_0x0636
            r9 = 0
            r10 = 4
        L_0x02c7:
            if (r9 >= r10) goto L_0x02d4
            int r11 = r8.f5810i
            if (r11 >= r7) goto L_0x02d4
            r11 = 0
            r8.a(r11)
            int r9 = r9 + 1
            goto L_0x02c7
        L_0x02d4:
            r11 = 0
            int r9 = r8.f5810i
            r10 = 7
            r9 = r9 & r10
            if (r9 <= 0) goto L_0x02e8
            r10 = 8
        L_0x02dd:
            if (r9 >= r10) goto L_0x02e8
            r8.a(r11)
            int r9 = r9 + 1
            r10 = 8
            r11 = 0
            goto L_0x02dd
        L_0x02e8:
            int r9 = r8.i()
            int r9 = r5 - r9
            r10 = 0
        L_0x02ef:
            if (r10 >= r9) goto L_0x0302
            r11 = r10 & 1
            if (r11 != 0) goto L_0x02f8
            r11 = 236(0xec, float:3.31E-43)
            goto L_0x02fa
        L_0x02f8:
            r11 = 17
        L_0x02fa:
            r12 = 8
            r8.c(r11, r12)
            int r10 = r10 + 1
            goto L_0x02ef
        L_0x0302:
            int r9 = r8.f5810i
            if (r9 != r7) goto L_0x062e
            int r7 = r3.d
            int r0 = r0.a()
            int r9 = r8.i()
            if (r9 != r5) goto L_0x0626
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
        L_0x031b:
            if (r15 >= r0) goto L_0x03fc
            r13 = 1
            int[] r14 = new int[r13]
            int[] r2 = new int[r13]
            if (r15 >= r0) goto L_0x03f4
            int r13 = r7 % r0
            int r1 = r0 - r13
            int r17 = r7 / r0
            int r19 = r17 + 1
            int r21 = r5 / r0
            int r22 = r21 + 1
            r23 = r6
            int r6 = r17 - r21
            r17 = r4
            int r4 = r19 - r22
            if (r6 != r4) goto L_0x03ec
            r19 = r3
            int r3 = r1 + r13
            if (r0 != r3) goto L_0x03e4
            int r3 = r21 + r6
            int r3 = r3 * r1
            int r24 = r22 + r4
            int r24 = r24 * r13
            int r3 = r24 + r3
            if (r7 != r3) goto L_0x03dc
            if (r15 >= r1) goto L_0x0353
            r1 = 0
            r14[r1] = r21
            r2[r1] = r6
            goto L_0x0358
        L_0x0353:
            r1 = 0
            r14[r1] = r22
            r2[r1] = r4
        L_0x0358:
            r3 = r14[r1]
            byte[] r1 = new byte[r3]
            int r4 = r10 << 3
            r6 = 0
        L_0x035f:
            r26 = r0
            r21 = r7
            r0 = 0
            if (r6 >= r3) goto L_0x038b
            r7 = 8
            r13 = 0
        L_0x0369:
            if (r13 >= r7) goto L_0x037f
            boolean r7 = r8.f(r4)
            if (r7 == 0) goto L_0x0378
            int r7 = 7 - r13
            r22 = 1
            int r7 = r22 << r7
            r0 = r0 | r7
        L_0x0378:
            int r4 = r4 + 1
            int r13 = r13 + 1
            r7 = 8
            goto L_0x0369
        L_0x037f:
            int r7 = r6 + 0
            byte r0 = (byte) r0
            r1[r7] = r0
            int r6 = r6 + 1
            r0 = r26
            r7 = r21
            goto L_0x035f
        L_0x038b:
            r2 = r2[r0]
            int r0 = r3 + r2
            int[] r0 = new int[r0]
            r4 = 0
        L_0x0392:
            if (r4 >= r3) goto L_0x039d
            byte r6 = r1[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0[r4] = r6
            int r4 = r4 + 1
            goto L_0x0392
        L_0x039d:
            b.l.f.y.l.d r4 = new b.l.f.y.l.d
            b.l.f.y.l.a r6 = b.l.f.y.l.a.f5846l
            r4.<init>(r6)
            r4.a(r0, r2)
            byte[] r4 = new byte[r2]
            r6 = 0
        L_0x03aa:
            if (r6 >= r2) goto L_0x03b6
            int r7 = r3 + r6
            r7 = r0[r7]
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r6 + 1
            goto L_0x03aa
        L_0x03b6:
            b.l.f.e0.e.a r0 = new b.l.f.e0.e.a
            r0.<init>(r1, r4)
            r9.add(r0)
            int r11 = java.lang.Math.max(r11, r3)
            int r12 = java.lang.Math.max(r12, r2)
            r0 = 0
            r1 = r14[r0]
            int r10 = r10 + r1
            int r15 = r15 + 1
            r0 = r26
            r1 = r28
            r2 = r29
            r4 = r17
            r3 = r19
            r7 = r21
            r6 = r23
            goto L_0x031b
        L_0x03dc:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Total bytes mismatch"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x03e4:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "RS blocks mismatch"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x03ec:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "EC bytes mismatch"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x03f4:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Block ID too large"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x03fc:
            r19 = r3
            r17 = r4
            r23 = r6
            r21 = r7
            if (r5 != r10) goto L_0x061e
            b.l.f.y.a r0 = new b.l.f.y.a
            r0.<init>()
            r15 = 0
        L_0x040c:
            if (r15 >= r11) goto L_0x042e
            java.util.Iterator r1 = r9.iterator()
        L_0x0412:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x042b
            java.lang.Object r2 = r1.next()
            b.l.f.e0.e.a r2 = (b.l.f.e0.e.a) r2
            byte[] r2 = r2.a
            int r3 = r2.length
            if (r15 >= r3) goto L_0x0412
            byte r2 = r2[r15]
            r3 = 8
            r0.c(r2, r3)
            goto L_0x0412
        L_0x042b:
            int r15 = r15 + 1
            goto L_0x040c
        L_0x042e:
            r15 = 0
        L_0x042f:
            if (r15 >= r12) goto L_0x0451
            java.util.Iterator r1 = r9.iterator()
        L_0x0435:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x044e
            java.lang.Object r2 = r1.next()
            b.l.f.e0.e.a r2 = (b.l.f.e0.e.a) r2
            byte[] r2 = r2.f5743b
            int r3 = r2.length
            if (r15 >= r3) goto L_0x0435
            byte r2 = r2[r15]
            r3 = 8
            r0.c(r2, r3)
            goto L_0x0435
        L_0x044e:
            int r15 = r15 + 1
            goto L_0x042f
        L_0x0451:
            int r1 = r0.i()
            r2 = r21
            if (r2 != r1) goto L_0x05f9
            int r1 = r19.c()
            b.l.f.e0.e.b r2 = new b.l.f.e0.e.b
            r2.<init>(r1, r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3 = 8
            r14 = -1
            r15 = 0
        L_0x0469:
            r4 = r17
            r5 = r19
            if (r15 >= r3) goto L_0x05ae
            b.l.f.e0.e.d.a(r0, r4, r5, r15, r2)
            r6 = 1
            int r7 = b.l.f.x.a.g.d(r2, r6)
            r6 = 0
            int r8 = b.l.f.x.a.g.d(r2, r6)
            int r8 = r8 + r7
            byte[][] r7 = r2.a
            int r9 = r2.f5744b
            int r10 = r2.c
            r11 = r6
            r12 = r11
        L_0x0485:
            r13 = -1
            int r3 = r10 + -1
            if (r11 >= r3) goto L_0x04b4
            r3 = r7[r11]
            r17 = r10
        L_0x048e:
            int r10 = r9 + -1
            if (r6 >= r10) goto L_0x04ae
            byte r10 = r3[r6]
            int r18 = r6 + 1
            byte r13 = r3[r18]
            if (r10 != r13) goto L_0x04aa
            int r13 = r11 + 1
            r19 = r7[r13]
            byte r6 = r19[r6]
            if (r10 != r6) goto L_0x04aa
            r6 = r7[r13]
            byte r6 = r6[r18]
            if (r10 != r6) goto L_0x04aa
            int r12 = r12 + 1
        L_0x04aa:
            r6 = r18
            r13 = -1
            goto L_0x048e
        L_0x04ae:
            int r11 = r11 + 1
            r10 = r17
            r6 = 0
            goto L_0x0485
        L_0x04b4:
            int r12 = r12 * 3
            int r12 = r12 + r8
            byte[][] r3 = r2.a
            int r6 = r2.f5744b
            int r7 = r2.c
            r8 = 0
            r9 = 0
        L_0x04bf:
            if (r8 >= r7) goto L_0x056b
            r10 = 0
        L_0x04c2:
            if (r10 >= r6) goto L_0x0563
            r11 = r3[r8]
            int r13 = r10 + 6
            if (r13 >= r6) goto L_0x050a
            r17 = r6
            byte r6 = r11[r10]
            r30 = r0
            r0 = 1
            if (r6 != r0) goto L_0x050e
            int r6 = r10 + 1
            byte r6 = r11[r6]
            if (r6 != 0) goto L_0x050e
            int r6 = r10 + 2
            byte r6 = r11[r6]
            if (r6 != r0) goto L_0x050e
            int r6 = r10 + 3
            byte r6 = r11[r6]
            if (r6 != r0) goto L_0x050e
            int r6 = r10 + 4
            byte r6 = r11[r6]
            if (r6 != r0) goto L_0x050e
            int r6 = r10 + 5
            byte r6 = r11[r6]
            if (r6 != 0) goto L_0x050e
            byte r6 = r11[r13]
            if (r6 != r0) goto L_0x050e
            int r0 = r10 + -4
            boolean r0 = b.l.f.x.a.g.Q(r11, r0, r10)
            if (r0 != 0) goto L_0x0507
            int r0 = r10 + 7
            int r6 = r10 + 11
            boolean r0 = b.l.f.x.a.g.Q(r11, r0, r6)
            if (r0 == 0) goto L_0x050e
        L_0x0507:
            int r9 = r9 + 1
            goto L_0x050e
        L_0x050a:
            r30 = r0
            r17 = r6
        L_0x050e:
            int r0 = r8 + 6
            if (r0 >= r7) goto L_0x055b
            r6 = r3[r8]
            byte r6 = r6[r10]
            r11 = 1
            if (r6 != r11) goto L_0x055b
            int r6 = r8 + 1
            r6 = r3[r6]
            byte r6 = r6[r10]
            if (r6 != 0) goto L_0x055b
            int r6 = r8 + 2
            r6 = r3[r6]
            byte r6 = r6[r10]
            if (r6 != r11) goto L_0x055b
            int r6 = r8 + 3
            r6 = r3[r6]
            byte r6 = r6[r10]
            if (r6 != r11) goto L_0x055b
            int r6 = r8 + 4
            r6 = r3[r6]
            byte r6 = r6[r10]
            if (r6 != r11) goto L_0x055b
            int r6 = r8 + 5
            r6 = r3[r6]
            byte r6 = r6[r10]
            if (r6 != 0) goto L_0x055b
            r0 = r3[r0]
            byte r0 = r0[r10]
            if (r0 != r11) goto L_0x055b
            int r0 = r8 + -4
            boolean r0 = b.l.f.x.a.g.R(r3, r10, r0, r8)
            if (r0 != 0) goto L_0x0559
            int r0 = r8 + 7
            int r6 = r8 + 11
            boolean r0 = b.l.f.x.a.g.R(r3, r10, r0, r6)
            if (r0 == 0) goto L_0x055b
        L_0x0559:
            int r9 = r9 + 1
        L_0x055b:
            int r10 = r10 + 1
            r0 = r30
            r6 = r17
            goto L_0x04c2
        L_0x0563:
            r30 = r0
            r17 = r6
            int r8 = r8 + 1
            goto L_0x04bf
        L_0x056b:
            r30 = r0
            int r9 = r9 * 40
            int r9 = r9 + r12
            byte[][] r0 = r2.a
            int r3 = r2.f5744b
            int r6 = r2.c
            r7 = 0
            r8 = 0
        L_0x0578:
            if (r7 >= r6) goto L_0x058c
            r10 = r0[r7]
            r11 = 0
        L_0x057d:
            if (r11 >= r3) goto L_0x0589
            byte r12 = r10[r11]
            r13 = 1
            if (r12 != r13) goto L_0x0586
            int r8 = r8 + 1
        L_0x0586:
            int r11 = r11 + 1
            goto L_0x057d
        L_0x0589:
            int r7 = r7 + 1
            goto L_0x0578
        L_0x058c:
            int r0 = r2.c
            int r3 = r2.f5744b
            int r0 = r0 * r3
            int r3 = r8 << 1
            int r3 = r3 - r0
            int r3 = java.lang.Math.abs(r3)
            r6 = 10
            int r3 = r3 * r6
            int r3 = r3 / r0
            int r3 = r3 * r6
            int r3 = r3 + r9
            if (r3 >= r1) goto L_0x05a2
            r1 = r3
            r14 = r15
        L_0x05a2:
            int r15 = r15 + 1
            r0 = r30
            r17 = r4
            r19 = r5
            r3 = 8
            goto L_0x0469
        L_0x05ae:
            b.l.f.e0.e.d.a(r0, r4, r5, r14, r2)
            int r0 = r2.f5744b
            int r1 = r2.c
            r3 = 1
            int r4 = r23 << 1
            int r3 = r0 + r4
            int r4 = r4 + r1
            r5 = r28
            int r5 = java.lang.Math.max(r5, r3)
            r6 = r29
            int r6 = java.lang.Math.max(r6, r4)
            int r3 = r5 / r3
            int r4 = r6 / r4
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r0 * r3
            int r4 = r5 - r4
            r7 = 2
            int r4 = r4 / r7
            int r8 = r1 * r3
            int r8 = r6 - r8
            int r8 = r8 / r7
            b.l.f.y.b r7 = new b.l.f.y.b
            r7.<init>(r5, r6)
            r15 = 0
        L_0x05e0:
            if (r15 >= r1) goto L_0x05f8
            r6 = r4
            r5 = 0
        L_0x05e4:
            if (r5 >= r0) goto L_0x05f4
            byte r9 = r2.a(r5, r15)
            r10 = 1
            if (r9 != r10) goto L_0x05f0
            r7.h(r6, r8, r3, r3)
        L_0x05f0:
            int r5 = r5 + 1
            int r6 = r6 + r3
            goto L_0x05e4
        L_0x05f4:
            int r15 = r15 + 1
            int r8 = r8 + r3
            goto L_0x05e0
        L_0x05f8:
            return r7
        L_0x05f9:
            b.l.f.v r1 = new b.l.f.v
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Interleaving error: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " and "
            r3.append(r2)
            int r0 = r0.i()
            r3.append(r0)
            java.lang.String r0 = " differ."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x061e:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Data bytes does not match offset"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0626:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Number of bits and data bytes does not match"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x062e:
            b.l.f.v r0 = new b.l.f.v
            java.lang.String r1 = "Bits size does not equal capacity"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0636:
            b.l.f.v r0 = new b.l.f.v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "data bits cannot fit in the QR Code"
            r1.<init>(r2)
            int r2 = r8.f5810i
            r1.append(r2)
            java.lang.String r2 = " > "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0654:
            b.l.f.v r1 = new b.l.f.v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " is bigger than "
            r2.append(r0)
            r0 = 1
            int r10 = r10 - r0
            r2.append(r10)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0670:
            r5 = r1
            r6 = r2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested dimensions are too small: "
            r1.<init>(r2)
            r1.append(r5)
            r2 = 120(0x78, float:1.68E-43)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x068e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r27)
            java.lang.String r2 = "Can only encode QR_CODE, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x069e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Found empty contents"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.e0.b.a(java.lang.String, b.l.f.a, int, int, java.util.Map):b.l.f.y.b");
    }
}
