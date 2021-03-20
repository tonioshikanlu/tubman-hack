package b.l.f.w;

import b.l.f.u;

public final class c implements u {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.y.b a(java.lang.String r18, b.l.f.a r19, int r20, int r21, java.util.Map<b.l.f.g, ?> r22) {
        /*
            r17 = this;
            r0 = r22
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = 33
            if (r0 == 0) goto L_0x0045
            b.l.f.g r3 = b.l.f.g.CHARACTER_SET
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r3)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
        L_0x001c:
            b.l.f.g r3 = b.l.f.g.ERROR_CORRECTION
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L_0x0030
            java.lang.Object r2 = r0.get(r3)
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
        L_0x0030:
            b.l.f.g r3 = b.l.f.g.AZTEC_LAYERS
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L_0x0045
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            b.l.f.a r3 = b.l.f.a.AZTEC
            r4 = r19
            if (r4 != r3) goto L_0x044b
            r3 = r18
            byte[] r1 = r3.getBytes(r1)
            int[] r3 = b.l.f.w.f.b.a
            b.l.f.w.f.d r4 = new b.l.f.w.f.d
            r4.<init>(r1)
            b.l.f.w.f.f r1 = b.l.f.w.f.f.f5792e
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r5 = 0
        L_0x0060:
            byte[] r6 = r4.a
            int r7 = r6.length
            r8 = 32
            r9 = 10
            r10 = 3
            r11 = 4
            r12 = 2
            r13 = 1
            if (r5 >= r7) goto L_0x0170
            int r7 = r5 + 1
            int r14 = r6.length
            if (r7 >= r14) goto L_0x0075
            byte r14 = r6[r7]
            goto L_0x0076
        L_0x0075:
            r14 = 0
        L_0x0076:
            byte r6 = r6[r5]
            r15 = 13
            if (r6 == r15) goto L_0x0095
            r9 = 44
            if (r6 == r9) goto L_0x0091
            r9 = 46
            if (r6 == r9) goto L_0x008d
            r9 = 58
            if (r6 == r9) goto L_0x0089
            goto L_0x0099
        L_0x0089:
            if (r14 != r8) goto L_0x0099
            r6 = 5
            goto L_0x009a
        L_0x008d:
            if (r14 != r8) goto L_0x0099
            r6 = r10
            goto L_0x009a
        L_0x0091:
            if (r14 != r8) goto L_0x0099
            r6 = r11
            goto L_0x009a
        L_0x0095:
            if (r14 != r9) goto L_0x0099
            r6 = r12
            goto L_0x009a
        L_0x0099:
            r6 = 0
        L_0x009a:
            if (r6 <= 0) goto L_0x00ef
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a5:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x00e8
            java.lang.Object r9 = r1.next()
            b.l.f.w.f.f r9 = (b.l.f.w.f.f) r9
            b.l.f.w.f.f r14 = r9.c(r5)
            b.l.f.w.f.f r15 = r14.e(r11, r6)
            r8.add(r15)
            int r15 = r9.a
            if (r15 == r11) goto L_0x00c7
            b.l.f.w.f.f r15 = r14.f(r11, r6)
            r8.add(r15)
        L_0x00c7:
            if (r6 == r10) goto L_0x00cb
            if (r6 != r11) goto L_0x00d8
        L_0x00cb:
            int r15 = 16 - r6
            b.l.f.w.f.f r14 = r14.e(r12, r15)
            b.l.f.w.f.f r14 = r14.e(r12, r13)
            r8.add(r14)
        L_0x00d8:
            int r14 = r9.c
            if (r14 <= 0) goto L_0x00a5
            b.l.f.w.f.f r9 = r9.a(r5)
            b.l.f.w.f.f r9 = r9.a(r7)
            r8.add(r9)
            goto L_0x00a5
        L_0x00e8:
            java.util.Collection r1 = b.l.f.w.f.d.a(r8)
            r5 = r7
            goto L_0x016d
        L_0x00ef:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f8:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0169
            java.lang.Object r7 = r1.next()
            b.l.f.w.f.f r7 = (b.l.f.w.f.f) r7
            byte[] r8 = r4.a
            byte r8 = r8[r5]
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = (char) r8
            int[][] r9 = b.l.f.w.f.d.d
            int r10 = r7.a
            r9 = r9[r10]
            r9 = r9[r8]
            if (r9 <= 0) goto L_0x0117
            r9 = r13
            goto L_0x0118
        L_0x0117:
            r9 = 0
        L_0x0118:
            r10 = 0
            r14 = 0
        L_0x011a:
            if (r10 > r11) goto L_0x0151
            int[][] r11 = b.l.f.w.f.d.d
            r11 = r11[r10]
            r11 = r11[r8]
            if (r11 <= 0) goto L_0x014c
            if (r14 != 0) goto L_0x012a
            b.l.f.w.f.f r14 = r7.c(r5)
        L_0x012a:
            if (r9 == 0) goto L_0x0132
            int r15 = r7.a
            if (r10 == r15) goto L_0x0132
            if (r10 != r12) goto L_0x0139
        L_0x0132:
            b.l.f.w.f.f r12 = r14.e(r10, r11)
            r6.add(r12)
        L_0x0139:
            if (r9 != 0) goto L_0x014c
            int[][] r12 = b.l.f.w.f.d.f5791e
            int r15 = r7.a
            r12 = r12[r15]
            r12 = r12[r10]
            if (r12 < 0) goto L_0x014c
            b.l.f.w.f.f r11 = r14.f(r10, r11)
            r6.add(r11)
        L_0x014c:
            int r10 = r10 + 1
            r11 = 4
            r12 = 2
            goto L_0x011a
        L_0x0151:
            int r9 = r7.c
            if (r9 > 0) goto L_0x015f
            int[][] r9 = b.l.f.w.f.d.d
            int r10 = r7.a
            r9 = r9[r10]
            r8 = r9[r8]
            if (r8 != 0) goto L_0x0166
        L_0x015f:
            b.l.f.w.f.f r7 = r7.a(r5)
            r6.add(r7)
        L_0x0166:
            r11 = 4
            r12 = 2
            goto L_0x00f8
        L_0x0169:
            java.util.Collection r1 = b.l.f.w.f.d.a(r6)
        L_0x016d:
            int r5 = r5 + r13
            goto L_0x0060
        L_0x0170:
            b.l.f.w.f.c r5 = new b.l.f.w.f.c
            r5.<init>(r4)
            java.lang.Object r1 = java.util.Collections.min(r1, r5)
            b.l.f.w.f.f r1 = (b.l.f.w.f.f) r1
            byte[] r4 = r4.a
            java.util.Objects.requireNonNull(r1)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            int r6 = r4.length
            b.l.f.w.f.f r1 = r1.c(r6)
            b.l.f.w.f.g r1 = r1.f5793b
        L_0x018c:
            if (r1 == 0) goto L_0x0194
            r5.addFirst(r1)
            b.l.f.w.f.g r1 = r1.a
            goto L_0x018c
        L_0x0194:
            b.l.f.y.a r1 = new b.l.f.y.a
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x019d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01ad
            java.lang.Object r6 = r5.next()
            b.l.f.w.f.g r6 = (b.l.f.w.f.g) r6
            r6.a(r1, r4)
            goto L_0x019d
        L_0x01ad:
            int r4 = r1.f5810i
            r5 = 100
            r6 = 11
            int r2 = b.e.a.a.a.H(r2, r4, r5, r6)
            int r4 = r4 + r2
            if (r0 == 0) goto L_0x020d
            if (r0 >= 0) goto L_0x01be
            r4 = r13
            goto L_0x01bf
        L_0x01be:
            r4 = 0
        L_0x01bf:
            int r5 = java.lang.Math.abs(r0)
            if (r4 == 0) goto L_0x01c6
            r8 = 4
        L_0x01c6:
            if (r5 > r8) goto L_0x01f8
            if (r4 == 0) goto L_0x01cd
            r0 = 88
            goto L_0x01cf
        L_0x01cd:
            r0 = 112(0x70, float:1.57E-43)
        L_0x01cf:
            int r7 = r5 << 4
            int r0 = r0 + r7
            int r0 = r0 * r5
            r3 = r3[r5]
            int r7 = r0 % r3
            int r7 = r0 - r7
            b.l.f.y.a r1 = b.l.f.w.f.b.c(r1, r3)
            int r8 = r1.f5810i
            int r2 = r2 + r8
            java.lang.String r9 = "Data to large for user specified layer"
            if (r2 > r7) goto L_0x01f2
            if (r4 == 0) goto L_0x024f
            int r2 = r3 << 6
            if (r8 > r2) goto L_0x01ec
            goto L_0x024f
        L_0x01ec:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x01f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x01f8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "Illegal value %s for layers"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x020d:
            r0 = 0
            r5 = 0
            r7 = r0
            r9 = r8
            r8 = r5
            r5 = r7
        L_0x0213:
            if (r0 > r9) goto L_0x0443
            if (r0 > r10) goto L_0x0218
            r5 = r13
        L_0x0218:
            if (r5 == 0) goto L_0x021d
            int r9 = r0 + 1
            goto L_0x021e
        L_0x021d:
            r9 = r0
        L_0x021e:
            if (r5 == 0) goto L_0x0223
            r11 = 88
            goto L_0x0225
        L_0x0223:
            r11 = 112(0x70, float:1.57E-43)
        L_0x0225:
            int r12 = r9 << 4
            int r11 = r11 + r12
            int r11 = r11 * r9
            if (r4 > r11) goto L_0x0436
            if (r8 == 0) goto L_0x0231
            r12 = r3[r9]
            if (r7 == r12) goto L_0x0237
        L_0x0231:
            r7 = r3[r9]
            b.l.f.y.a r8 = b.l.f.w.f.b.c(r1, r7)
        L_0x0237:
            int r12 = r11 % r7
            int r12 = r11 - r12
            if (r5 == 0) goto L_0x0243
            int r14 = r8.f5810i
            int r15 = r7 << 6
            if (r14 > r15) goto L_0x0436
        L_0x0243:
            int r14 = r8.f5810i
            int r14 = r14 + r2
            if (r14 <= r12) goto L_0x024a
            goto L_0x0436
        L_0x024a:
            r4 = r5
            r3 = r7
            r1 = r8
            r5 = r9
            r0 = r11
        L_0x024f:
            b.l.f.y.a r0 = b.l.f.w.f.b.b(r1, r0, r3)
            int r1 = r1.f5810i
            int r1 = r1 / r3
            b.l.f.y.a r2 = new b.l.f.y.a
            r2.<init>()
            int r3 = r5 + -1
            if (r4 == 0) goto L_0x026c
            r7 = 2
            r2.c(r3, r7)
            int r1 = r1 + -1
            r3 = 6
            r2.c(r1, r3)
            r1 = 28
            goto L_0x0277
        L_0x026c:
            r7 = 5
            r2.c(r3, r7)
            int r1 = r1 + -1
            r2.c(r1, r6)
            r1 = 40
        L_0x0277:
            r3 = 4
            b.l.f.y.a r1 = b.l.f.w.f.b.b(r2, r1, r3)
            if (r4 == 0) goto L_0x027f
            goto L_0x0281
        L_0x027f:
            r6 = 14
        L_0x0281:
            int r2 = r5 << 2
            int r6 = r6 + r2
            int[] r2 = new int[r6]
            if (r4 == 0) goto L_0x0292
            r3 = 0
        L_0x0289:
            if (r3 >= r6) goto L_0x0290
            r2[r3] = r3
            int r3 = r3 + 1
            goto L_0x0289
        L_0x0290:
            r8 = r6
            goto L_0x02b7
        L_0x0292:
            int r3 = r6 + 1
            int r7 = r6 / 2
            int r8 = r7 + -1
            int r8 = r8 / 15
            int r8 = r8 * 2
            int r8 = r8 + r3
            int r3 = r8 / 2
            r9 = 0
        L_0x02a0:
            if (r9 >= r7) goto L_0x02b7
            int r10 = r9 / 15
            int r10 = r10 + r9
            int r11 = r7 - r9
            int r11 = r11 - r13
            int r12 = r3 - r10
            int r12 = r12 + -1
            r2[r11] = r12
            int r11 = r7 + r9
            int r10 = r10 + r3
            int r10 = r10 + r13
            r2[r11] = r10
            int r9 = r9 + 1
            goto L_0x02a0
        L_0x02b7:
            b.l.f.y.b r3 = new b.l.f.y.b
            r3.<init>(r8, r8)
            r7 = 0
            r9 = 0
        L_0x02be:
            if (r7 >= r5) goto L_0x0347
            int r10 = r5 - r7
            int r10 = r10 << 2
            if (r4 == 0) goto L_0x02c9
            r11 = 9
            goto L_0x02cb
        L_0x02c9:
            r11 = 12
        L_0x02cb:
            int r10 = r10 + r11
            r11 = 0
        L_0x02cd:
            if (r11 >= r10) goto L_0x0340
            int r12 = r11 << 1
            r13 = 2
            r14 = 0
        L_0x02d3:
            if (r14 >= r13) goto L_0x033d
            int r13 = r9 + r12
            int r13 = r13 + r14
            boolean r13 = r0.f(r13)
            if (r13 == 0) goto L_0x02ea
            int r13 = r7 << 1
            int r15 = r13 + r14
            r15 = r2[r15]
            int r13 = r13 + r11
            r13 = r2[r13]
            r3.g(r15, r13)
        L_0x02ea:
            int r13 = r10 << 1
            int r13 = r13 + r9
            int r13 = r13 + r12
            int r13 = r13 + r14
            boolean r13 = r0.f(r13)
            if (r13 == 0) goto L_0x0306
            int r13 = r7 << 1
            int r15 = r13 + r11
            r15 = r2[r15]
            int r16 = r6 + -1
            int r16 = r16 - r13
            int r16 = r16 - r14
            r13 = r2[r16]
            r3.g(r15, r13)
        L_0x0306:
            int r13 = r10 << 2
            int r13 = r13 + r9
            int r13 = r13 + r12
            int r13 = r13 + r14
            boolean r13 = r0.f(r13)
            if (r13 == 0) goto L_0x0320
            int r13 = r6 + -1
            int r15 = r7 << 1
            int r13 = r13 - r15
            int r15 = r13 - r14
            r15 = r2[r15]
            int r13 = r13 - r11
            r13 = r2[r13]
            r3.g(r15, r13)
        L_0x0320:
            int r13 = r10 * 6
            int r13 = r13 + r9
            int r13 = r13 + r12
            int r13 = r13 + r14
            boolean r13 = r0.f(r13)
            if (r13 == 0) goto L_0x0339
            int r13 = r6 + -1
            int r15 = r7 << 1
            int r13 = r13 - r15
            int r13 = r13 - r11
            r13 = r2[r13]
            int r15 = r15 + r14
            r15 = r2[r15]
            r3.g(r13, r15)
        L_0x0339:
            int r14 = r14 + 1
            r13 = 2
            goto L_0x02d3
        L_0x033d:
            int r11 = r11 + 1
            goto L_0x02cd
        L_0x0340:
            int r10 = r10 << 3
            int r9 = r9 + r10
            int r7 = r7 + 1
            goto L_0x02be
        L_0x0347:
            int r0 = r8 / 2
            r2 = 7
            r5 = 0
            if (r4 == 0) goto L_0x0387
        L_0x034d:
            if (r5 >= r2) goto L_0x03c6
            int r7 = r0 + -3
            int r7 = r7 + r5
            boolean r9 = r1.f(r5)
            if (r9 == 0) goto L_0x035d
            int r9 = r0 + -5
            r3.g(r7, r9)
        L_0x035d:
            int r9 = r5 + 7
            boolean r9 = r1.f(r9)
            if (r9 == 0) goto L_0x036a
            int r9 = r0 + 5
            r3.g(r9, r7)
        L_0x036a:
            int r9 = 20 - r5
            boolean r9 = r1.f(r9)
            if (r9 == 0) goto L_0x0377
            int r9 = r0 + 5
            r3.g(r7, r9)
        L_0x0377:
            int r9 = 27 - r5
            boolean r9 = r1.f(r9)
            if (r9 == 0) goto L_0x0384
            int r9 = r0 + -5
            r3.g(r9, r7)
        L_0x0384:
            int r5 = r5 + 1
            goto L_0x034d
        L_0x0387:
            r7 = 10
        L_0x0389:
            if (r5 >= r7) goto L_0x03c6
            int r9 = r0 + -5
            int r9 = r9 + r5
            int r10 = r5 / 5
            int r10 = r10 + r9
            boolean r9 = r1.f(r5)
            if (r9 == 0) goto L_0x039c
            int r9 = r0 + -7
            r3.g(r10, r9)
        L_0x039c:
            int r9 = r5 + 10
            boolean r9 = r1.f(r9)
            if (r9 == 0) goto L_0x03a9
            int r9 = r0 + 7
            r3.g(r9, r10)
        L_0x03a9:
            int r9 = 29 - r5
            boolean r9 = r1.f(r9)
            if (r9 == 0) goto L_0x03b6
            int r9 = r0 + 7
            r3.g(r10, r9)
        L_0x03b6:
            int r9 = 39 - r5
            boolean r9 = r1.f(r9)
            if (r9 == 0) goto L_0x03c3
            int r9 = r0 + -7
            r3.g(r9, r10)
        L_0x03c3:
            int r5 = r5 + 1
            goto L_0x0389
        L_0x03c6:
            if (r4 == 0) goto L_0x03cd
            r1 = 5
            b.l.f.w.f.b.a(r3, r0, r1)
            goto L_0x03f4
        L_0x03cd:
            b.l.f.w.f.b.a(r3, r0, r2)
            r1 = 0
            r2 = 0
        L_0x03d2:
            int r4 = r6 / 2
            int r4 = r4 + -1
            if (r1 >= r4) goto L_0x03f4
            r4 = r0 & 1
        L_0x03da:
            if (r4 >= r8) goto L_0x03ef
            int r5 = r0 - r2
            r3.g(r5, r4)
            int r7 = r0 + r2
            r3.g(r7, r4)
            r3.g(r4, r5)
            r3.g(r4, r7)
            int r4 = r4 + 2
            goto L_0x03da
        L_0x03ef:
            int r1 = r1 + 15
            int r2 = r2 + 16
            goto L_0x03d2
        L_0x03f4:
            int r0 = r3.f5811h
            int r1 = r3.f5812i
            r5 = r20
            int r2 = java.lang.Math.max(r5, r0)
            r9 = r21
            int r4 = java.lang.Math.max(r9, r1)
            int r5 = r2 / r0
            int r6 = r4 / r1
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r0 * r5
            int r6 = r2 - r6
            int r6 = r6 / 2
            int r7 = r1 * r5
            int r7 = r4 - r7
            int r7 = r7 / 2
            b.l.f.y.b r8 = new b.l.f.y.b
            r8.<init>(r2, r4)
            r2 = 0
        L_0x041e:
            if (r2 >= r1) goto L_0x0435
            r4 = 0
            r9 = r6
        L_0x0422:
            if (r4 >= r0) goto L_0x0431
            boolean r10 = r3.b(r4, r2)
            if (r10 == 0) goto L_0x042d
            r8.h(r9, r7, r5, r5)
        L_0x042d:
            int r4 = r4 + 1
            int r9 = r9 + r5
            goto L_0x0422
        L_0x0431:
            int r2 = r2 + 1
            int r7 = r7 + r5
            goto L_0x041e
        L_0x0435:
            return r8
        L_0x0436:
            r5 = r20
            r9 = r21
            int r0 = r0 + 1
            r11 = 0
            r12 = 32
            r5 = r11
            r9 = r12
            goto L_0x0213
        L_0x0443:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Data too large for an Aztec code"
            r0.<init>(r1)
            throw r0
        L_0x044b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r19)
            java.lang.String r2 = "Can only encode AZTEC, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.w.c.a(java.lang.String, b.l.f.a, int, int, java.util.Map):b.l.f.y.b");
    }
}
