package b.l.f.d0;

import androidx.appcompat.widget.ActivityChooserView;
import b.l.f.c;
import b.l.f.e;
import b.l.f.o;
import b.l.f.q;
import b.l.f.s;
import java.util.Map;

public final class b implements o {
    public static final q[] a = new q[0];

    public static int d(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return 0;
        }
        return (int) Math.abs(sVar.a - sVar2.a);
    }

    public static int e(s sVar, s sVar2) {
        return (sVar == null || sVar2 == null) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) Math.abs(sVar.a - sVar2.a);
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0579, code lost:
        if (r6[0] != r7) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0611, code lost:
        r3 = new b.l.f.q(r2.c, r2.a, r4, b.l.f.a.PDF_417);
        r3.b(b.l.f.r.ERROR_CORRECTION_LEVEL, r2.f5827e);
        r2 = (b.l.f.d0.c) r2.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0627, code lost:
        if (r2 == null) goto L_0x062e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x014d, code lost:
        if (r6.f5659e != r7.f5659e) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0629, code lost:
        r3.b(b.l.f.r.PDF417_EXTRA_METADATA, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x062e, code lost:
        r0.add(r3);
        r2 = 0;
        r5 = 2;
        r3 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x021e, code lost:
        if (r19 != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022b, code lost:
        if (r19 != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023f, code lost:
        if (r19 != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0244, code lost:
        r6 = r8.a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0667 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.q a(b.l.f.c r31, java.util.Map<b.l.f.e, ?> r32) {
        /*
            r30 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            b.l.f.y.b r1 = r31.a()
            r2 = 0
            java.util.List r3 = b.l.f.d0.f.a.a(r2, r1)
            r4 = r3
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            r5 = 2
            if (r4 == 0) goto L_0x006d
            b.l.f.y.b r3 = new b.l.f.y.b
            int r4 = r1.f5811h
            int r6 = r1.f5812i
            int r7 = r1.f5813j
            int[] r1 = r1.f5814k
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r3.<init>(r4, r6, r7, r1)
            b.l.f.y.a r1 = new b.l.f.y.a
            r1.<init>(r4)
            b.l.f.y.a r7 = new b.l.f.y.a
            r7.<init>(r4)
            r4 = r2
        L_0x0036:
            int r8 = r6 + 1
            int r8 = r8 / r5
            if (r4 >= r8) goto L_0x0064
            b.l.f.y.a r1 = r3.d(r4, r1)
            int r8 = r6 + -1
            int r8 = r8 - r4
            b.l.f.y.a r7 = r3.d(r8, r7)
            r1.k()
            r7.k()
            int[] r9 = r7.f5809h
            int[] r10 = r3.f5814k
            int r11 = r3.f5813j
            int r12 = r4 * r11
            java.lang.System.arraycopy(r9, r2, r10, r12, r11)
            int[] r9 = r1.f5809h
            int[] r10 = r3.f5814k
            int r11 = r3.f5813j
            int r8 = r8 * r11
            java.lang.System.arraycopy(r9, r2, r10, r8, r11)
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0064:
            java.util.List r1 = b.l.f.d0.f.a.a(r2, r3)
            r29 = r3
            r3 = r1
            r1 = r29
        L_0x006d:
            java.util.Iterator r3 = r3.iterator()
        L_0x0071:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x066a
            java.lang.Object r4 = r3.next()
            b.l.f.s[] r4 = (b.l.f.s[]) r4
            r6 = 4
            r12 = r4[r6]
            r7 = 5
            r9 = r4[r7]
            r14 = 6
            r13 = r4[r14]
            r15 = 7
            r11 = r4[r15]
            r8 = r4[r2]
            r10 = r4[r6]
            int r8 = e(r8, r10)
            r10 = r4[r14]
            r14 = r4[r5]
            int r10 = e(r10, r14)
            int r10 = r10 * 17
            int r10 = r10 / 18
            int r8 = java.lang.Math.min(r8, r10)
            r10 = 1
            r14 = r4[r10]
            r7 = r4[r7]
            int r7 = e(r14, r7)
            r14 = r4[r15]
            r16 = 3
            r15 = r4[r16]
            int r14 = e(r14, r15)
            int r14 = r14 * 17
            int r14 = r14 / 18
            int r7 = java.lang.Math.min(r7, r14)
            int r14 = java.lang.Math.min(r8, r7)
            r7 = r4[r2]
            r6 = r4[r6]
            int r6 = d(r7, r6)
            r7 = 6
            r8 = r4[r7]
            r5 = r4[r5]
            int r5 = d(r8, r5)
            int r5 = r5 * 17
            int r5 = r5 / 18
            int r5 = java.lang.Math.max(r6, r5)
            r6 = r4[r10]
            r7 = 5
            r7 = r4[r7]
            int r6 = d(r6, r7)
            r7 = 7
            r8 = r4[r7]
            r7 = r4[r16]
            int r7 = d(r8, r7)
            int r7 = r7 * 17
            int r7 = r7 / 18
            int r6 = java.lang.Math.max(r6, r7)
            int r5 = java.lang.Math.max(r5, r6)
            b.l.f.d0.e.k.a r6 = b.l.f.d0.e.j.a
            b.l.f.d0.e.c r15 = new b.l.f.d0.e.c
            r17 = 1
            r6 = r15
            r7 = r1
            r8 = r12
            r10 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r18 = 0
            r20 = r17
            r6 = r18
            r19 = r6
        L_0x010c:
            if (r12 == 0) goto L_0x0118
            r9 = 1
            r6 = r1
            r7 = r15
            r8 = r12
            r10 = r14
            r11 = r5
            b.l.f.d0.e.h r6 = b.l.f.d0.e.j.d(r6, r7, r8, r9, r10, r11)
        L_0x0118:
            r21 = r6
            if (r13 == 0) goto L_0x0126
            r9 = 0
            r6 = r1
            r7 = r15
            r8 = r13
            r10 = r14
            r11 = r5
            b.l.f.d0.e.h r19 = b.l.f.d0.e.j.d(r6, r7, r8, r9, r10, r11)
        L_0x0126:
            if (r21 != 0) goto L_0x012b
            if (r19 != 0) goto L_0x012b
            goto L_0x015b
        L_0x012b:
            if (r21 == 0) goto L_0x0150
            b.l.f.d0.e.a r6 = r21.c()
            if (r6 != 0) goto L_0x0134
            goto L_0x0150
        L_0x0134:
            if (r19 == 0) goto L_0x0159
            b.l.f.d0.e.a r7 = r19.c()
            if (r7 != 0) goto L_0x013d
            goto L_0x0159
        L_0x013d:
            int r8 = r6.a
            int r9 = r7.a
            if (r8 == r9) goto L_0x0159
            int r8 = r6.f5658b
            int r9 = r7.f5658b
            if (r8 == r9) goto L_0x0159
            int r8 = r6.f5659e
            int r7 = r7.f5659e
            if (r8 == r7) goto L_0x0159
            goto L_0x0152
        L_0x0150:
            if (r19 != 0) goto L_0x0155
        L_0x0152:
            r6 = r18
            goto L_0x0159
        L_0x0155:
            b.l.f.d0.e.a r6 = r19.c()
        L_0x0159:
            if (r6 != 0) goto L_0x0160
        L_0x015b:
            r28 = r3
            r3 = r18
            goto L_0x0196
        L_0x0160:
            b.l.f.d0.e.c r7 = b.l.f.d0.e.j.a(r21)
            b.l.f.d0.e.c r8 = b.l.f.d0.e.j.a(r19)
            if (r7 != 0) goto L_0x016e
            r28 = r3
            r7 = r8
            goto L_0x0191
        L_0x016e:
            if (r8 != 0) goto L_0x0173
            r28 = r3
            goto L_0x0191
        L_0x0173:
            b.l.f.d0.e.c r9 = new b.l.f.d0.e.c
            b.l.f.y.b r10 = r7.a
            b.l.f.s r11 = r7.f5660b
            b.l.f.s r7 = r7.c
            r28 = r3
            b.l.f.s r3 = r8.d
            b.l.f.s r8 = r8.f5661e
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r7
            r26 = r3
            r27 = r8
            r22.<init>(r23, r24, r25, r26, r27)
            r7 = r9
        L_0x0191:
            b.l.f.d0.e.f r3 = new b.l.f.d0.e.f
            r3.<init>(r6, r7)
        L_0x0196:
            if (r3 == 0) goto L_0x0667
            b.l.f.d0.e.c r6 = r3.c
            if (r20 == 0) goto L_0x01b3
            if (r6 == 0) goto L_0x01b3
            int r7 = r6.f5663h
            int r8 = r15.f5663h
            if (r7 < r8) goto L_0x01aa
            int r7 = r6.f5664i
            int r8 = r15.f5664i
            if (r7 <= r8) goto L_0x01b3
        L_0x01aa:
            r20 = r2
            r15 = r6
            r6 = r21
            r3 = r28
            goto L_0x010c
        L_0x01b3:
            r3.c = r15
            int r6 = r3.d
            int r13 = r6 + 1
            b.l.f.d0.e.g[] r6 = r3.f5675b
            r6[r2] = r21
            r6[r13] = r19
            if (r21 == 0) goto L_0x01c4
            r19 = r17
            goto L_0x01c6
        L_0x01c4:
            r19 = r2
        L_0x01c6:
            r12 = r17
        L_0x01c8:
            if (r12 > r13) goto L_0x0311
            if (r19 == 0) goto L_0x01ce
            r11 = r12
            goto L_0x01d1
        L_0x01ce:
            int r6 = r13 - r12
            r11 = r6
        L_0x01d1:
            b.l.f.d0.e.g[] r6 = r3.f5675b
            r6 = r6[r11]
            if (r6 != 0) goto L_0x0304
            if (r11 == 0) goto L_0x01e2
            if (r11 != r13) goto L_0x01dc
            goto L_0x01e2
        L_0x01dc:
            b.l.f.d0.e.g r2 = new b.l.f.d0.e.g
            r2.<init>(r15)
            goto L_0x01ec
        L_0x01e2:
            b.l.f.d0.e.h r6 = new b.l.f.d0.e.h
            if (r11 != 0) goto L_0x01e8
            r2 = r17
        L_0x01e8:
            r6.<init>(r15, r2)
            r2 = r6
        L_0x01ec:
            b.l.f.d0.e.g[] r6 = r3.f5675b
            r6[r11] = r2
            int r6 = r15.f5663h
            r7 = -1
            r10 = r7
            r9 = r14
            r14 = r6
        L_0x01f6:
            int r6 = r15.f5664i
            if (r14 > r6) goto L_0x02fd
            if (r19 == 0) goto L_0x01fe
            r6 = 1
            goto L_0x01ff
        L_0x01fe:
            r6 = -1
        L_0x01ff:
            int r7 = r11 - r6
            boolean r8 = b.l.f.d0.e.j.e(r3, r7)
            if (r8 == 0) goto L_0x0218
            b.l.f.d0.e.g[] r8 = r3.f5675b
            r8 = r8[r7]
            r17 = r9
            b.l.f.d0.e.d[] r9 = r8.f5676b
            b.l.f.d0.e.c r8 = r8.a
            int r8 = r8.f5663h
            int r8 = r14 - r8
            r8 = r9[r8]
            goto L_0x021c
        L_0x0218:
            r17 = r9
            r8 = r18
        L_0x021c:
            if (r8 == 0) goto L_0x0221
            if (r19 == 0) goto L_0x0244
            goto L_0x0241
        L_0x0221:
            b.l.f.d0.e.g[] r8 = r3.f5675b
            r8 = r8[r11]
            b.l.f.d0.e.d r8 = r8.a(r14)
            if (r8 == 0) goto L_0x022e
            if (r19 == 0) goto L_0x0241
            goto L_0x0244
        L_0x022e:
            boolean r9 = b.l.f.d0.e.j.e(r3, r7)
            if (r9 == 0) goto L_0x023d
            b.l.f.d0.e.g[] r8 = r3.f5675b
            r7 = r8[r7]
            b.l.f.d0.e.d r7 = r7.a(r14)
            r8 = r7
        L_0x023d:
            if (r8 == 0) goto L_0x0249
            if (r19 == 0) goto L_0x0244
        L_0x0241:
            int r6 = r8.f5665b
            goto L_0x0246
        L_0x0244:
            int r6 = r8.a
        L_0x0246:
            r22 = r11
            goto L_0x0293
        L_0x0249:
            r7 = 0
            r8 = r11
        L_0x024b:
            int r8 = r8 - r6
            boolean r9 = b.l.f.d0.e.j.e(r3, r8)
            if (r9 == 0) goto L_0x0286
            b.l.f.d0.e.g[] r9 = r3.f5675b
            r9 = r9[r8]
            b.l.f.d0.e.d[] r9 = r9.f5676b
            r20 = r8
            int r8 = r9.length
            r21 = 0
            r22 = r11
            r11 = r21
        L_0x0261:
            if (r11 >= r8) goto L_0x027f
            r21 = r8
            r8 = r9[r11]
            if (r8 == 0) goto L_0x027a
            if (r19 == 0) goto L_0x026e
            int r9 = r8.f5665b
            goto L_0x0270
        L_0x026e:
            int r9 = r8.a
        L_0x0270:
            int r6 = r6 * r7
            int r7 = r8.f5665b
            int r8 = r8.a
            int r6 = b.e.a.a.a.w(r7, r8, r6, r9)
            goto L_0x0293
        L_0x027a:
            int r11 = r11 + 1
            r8 = r21
            goto L_0x0261
        L_0x027f:
            int r7 = r7 + 1
            r8 = r20
            r11 = r22
            goto L_0x024b
        L_0x0286:
            r22 = r11
            if (r19 == 0) goto L_0x028f
            b.l.f.d0.e.c r6 = r3.c
            int r6 = r6.f
            goto L_0x0293
        L_0x028f:
            b.l.f.d0.e.c r6 = r3.c
            int r6 = r6.f5662g
        L_0x0293:
            if (r6 < 0) goto L_0x029d
            int r7 = r15.f5662g
            if (r6 <= r7) goto L_0x029a
            goto L_0x029d
        L_0x029a:
            r20 = r6
            goto L_0x02a2
        L_0x029d:
            r6 = -1
            if (r10 == r6) goto L_0x02e6
            r20 = r10
        L_0x02a2:
            int r7 = r15.f
            int r8 = r15.f5662g
            r6 = r1
            r11 = r17
            r9 = r19
            r17 = r10
            r10 = r20
            r21 = r22
            r22 = r11
            r11 = r14
            r23 = r12
            r12 = r22
            r24 = r13
            r13 = r5
            b.l.f.d0.e.d r6 = b.l.f.d0.e.j.c(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x02e3
            b.l.f.d0.e.d[] r7 = r2.f5676b
            b.l.f.d0.e.c r8 = r2.a
            int r8 = r8.f5663h
            int r8 = r14 - r8
            r7[r8] = r6
            int r7 = r6.f5665b
            int r8 = r6.a
            int r7 = r7 - r8
            r8 = r22
            int r7 = java.lang.Math.min(r8, r7)
            int r8 = r6.f5665b
            int r6 = r6.a
            int r8 = r8 - r6
            int r5 = java.lang.Math.max(r5, r8)
            r9 = r7
            r10 = r20
            goto L_0x02f3
        L_0x02e3:
            r8 = r22
            goto L_0x02f0
        L_0x02e6:
            r23 = r12
            r24 = r13
            r8 = r17
            r21 = r22
            r17 = r10
        L_0x02f0:
            r9 = r8
            r10 = r17
        L_0x02f3:
            int r14 = r14 + 1
            r11 = r21
            r12 = r23
            r13 = r24
            goto L_0x01f6
        L_0x02fd:
            r8 = r9
            r23 = r12
            r24 = r13
            r14 = r8
            goto L_0x0308
        L_0x0304:
            r23 = r12
            r24 = r13
        L_0x0308:
            int r12 = r23 + 1
            r2 = 0
            r17 = 1
            r13 = r24
            goto L_0x01c8
        L_0x0311:
            b.l.f.d0.e.a r2 = r3.a
            int r2 = r2.f5659e
            int r5 = r3.d
            r6 = 2
            int r5 = r5 + r6
            int[] r6 = new int[r6]
            r7 = 1
            r6[r7] = r5
            r5 = 0
            r6[r5] = r2
            java.lang.Class<b.l.f.d0.e.b> r2 = b.l.f.d0.e.b.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r6)
            b.l.f.d0.e.b[][] r2 = (b.l.f.d0.e.b[][]) r2
        L_0x0329:
            int r6 = r2.length
            if (r5 >= r6) goto L_0x0341
            r6 = 0
        L_0x032d:
            r7 = r2[r5]
            int r7 = r7.length
            if (r6 >= r7) goto L_0x033e
            r7 = r2[r5]
            b.l.f.d0.e.b r8 = new b.l.f.d0.e.b
            r8.<init>()
            r7[r6] = r8
            int r6 = r6 + 1
            goto L_0x032d
        L_0x033e:
            int r5 = r5 + 1
            goto L_0x0329
        L_0x0341:
            b.l.f.d0.e.g[] r5 = r3.f5675b
            r6 = 0
            r5 = r5[r6]
            r3.a(r5)
            b.l.f.d0.e.g[] r5 = r3.f5675b
            int r7 = r3.d
            r8 = 1
            int r7 = r7 + r8
            r5 = r5[r7]
            r3.a(r5)
            r5 = 928(0x3a0, float:1.3E-42)
        L_0x0356:
            b.l.f.d0.e.g[] r7 = r3.f5675b
            r9 = r7[r6]
            if (r9 == 0) goto L_0x03ab
            int r9 = r3.d
            int r9 = r9 + r8
            r8 = r7[r9]
            if (r8 != 0) goto L_0x0364
            goto L_0x03ab
        L_0x0364:
            r6 = r7[r6]
            b.l.f.d0.e.d[] r6 = r6.f5676b
            r7 = r7[r9]
            b.l.f.d0.e.d[] r7 = r7.f5676b
            r8 = 0
        L_0x036d:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x03ab
            r9 = r6[r8]
            if (r9 == 0) goto L_0x03a8
            r9 = r7[r8]
            if (r9 == 0) goto L_0x03a8
            r9 = r6[r8]
            int r9 = r9.f5666e
            r10 = r7[r8]
            int r10 = r10.f5666e
            if (r9 != r10) goto L_0x03a8
            r9 = 1
        L_0x0383:
            int r10 = r3.d
            if (r9 > r10) goto L_0x03a8
            b.l.f.d0.e.g[] r10 = r3.f5675b
            r10 = r10[r9]
            b.l.f.d0.e.d[] r10 = r10.f5676b
            r10 = r10[r8]
            if (r10 == 0) goto L_0x03a5
            r11 = r6[r8]
            int r11 = r11.f5666e
            r10.f5666e = r11
            boolean r10 = r10.a()
            if (r10 != 0) goto L_0x03a5
            b.l.f.d0.e.g[] r10 = r3.f5675b
            r10 = r10[r9]
            b.l.f.d0.e.d[] r10 = r10.f5676b
            r10[r8] = r18
        L_0x03a5:
            int r9 = r9 + 1
            goto L_0x0383
        L_0x03a8:
            int r8 = r8 + 1
            goto L_0x036d
        L_0x03ab:
            b.l.f.d0.e.g[] r6 = r3.f5675b
            r7 = 0
            r8 = r6[r7]
            if (r8 != 0) goto L_0x03b3
            goto L_0x03ec
        L_0x03b3:
            r6 = r6[r7]
            b.l.f.d0.e.d[] r6 = r6.f5676b
            r7 = 0
            r8 = 0
        L_0x03b9:
            int r9 = r6.length
            if (r7 >= r9) goto L_0x03eb
            r9 = r6[r7]
            if (r9 == 0) goto L_0x03e8
            r9 = r6[r7]
            int r9 = r9.f5666e
            r10 = 0
            r11 = 1
        L_0x03c6:
            int r12 = r3.d
            int r12 = r12 + 1
            if (r11 >= r12) goto L_0x03e8
            r12 = 2
            if (r10 >= r12) goto L_0x03e8
            b.l.f.d0.e.g[] r12 = r3.f5675b
            r12 = r12[r11]
            b.l.f.d0.e.d[] r12 = r12.f5676b
            r12 = r12[r7]
            if (r12 == 0) goto L_0x03e5
            int r10 = b.l.f.d0.e.f.b(r9, r10, r12)
            boolean r12 = r12.a()
            if (r12 != 0) goto L_0x03e5
            int r8 = r8 + 1
        L_0x03e5:
            int r11 = r11 + 1
            goto L_0x03c6
        L_0x03e8:
            int r7 = r7 + 1
            goto L_0x03b9
        L_0x03eb:
            r7 = r8
        L_0x03ec:
            b.l.f.d0.e.g[] r6 = r3.f5675b
            int r8 = r3.d
            int r8 = r8 + 1
            r9 = r6[r8]
            if (r9 != 0) goto L_0x03f8
            r6 = 0
            goto L_0x0430
        L_0x03f8:
            r6 = r6[r8]
            b.l.f.d0.e.d[] r6 = r6.f5676b
            r8 = 0
            r9 = 0
        L_0x03fe:
            int r10 = r6.length
            if (r8 >= r10) goto L_0x042f
            r10 = r6[r8]
            if (r10 == 0) goto L_0x042c
            r10 = r6[r8]
            int r10 = r10.f5666e
            int r11 = r3.d
            int r11 = r11 + 1
            r12 = 0
        L_0x040e:
            if (r11 <= 0) goto L_0x042c
            r13 = 2
            if (r12 >= r13) goto L_0x042c
            b.l.f.d0.e.g[] r13 = r3.f5675b
            r13 = r13[r11]
            b.l.f.d0.e.d[] r13 = r13.f5676b
            r13 = r13[r8]
            if (r13 == 0) goto L_0x0429
            int r12 = b.l.f.d0.e.f.b(r10, r12, r13)
            boolean r13 = r13.a()
            if (r13 != 0) goto L_0x0429
            int r9 = r9 + 1
        L_0x0429:
            int r11 = r11 + -1
            goto L_0x040e
        L_0x042c:
            int r8 = r8 + 1
            goto L_0x03fe
        L_0x042f:
            r6 = r9
        L_0x0430:
            int r7 = r7 + r6
            if (r7 != 0) goto L_0x043a
            r6 = 0
            r17 = 7
            r19 = 6
            goto L_0x0517
        L_0x043a:
            r6 = 1
        L_0x043b:
            int r8 = r3.d
            int r8 = r8 + 1
            if (r6 >= r8) goto L_0x0512
            b.l.f.d0.e.g[] r8 = r3.f5675b
            r8 = r8[r6]
            b.l.f.d0.e.d[] r8 = r8.f5676b
            r9 = 0
        L_0x0448:
            int r10 = r8.length
            if (r9 >= r10) goto L_0x050a
            r10 = r8[r9]
            if (r10 == 0) goto L_0x0502
            r10 = r8[r9]
            boolean r10 = r10.a()
            if (r10 != 0) goto L_0x0502
            r10 = r8[r9]
            b.l.f.d0.e.g[] r11 = r3.f5675b
            int r12 = r6 + -1
            r12 = r11[r12]
            b.l.f.d0.e.d[] r12 = r12.f5676b
            int r13 = r6 + 1
            r14 = r11[r13]
            if (r14 == 0) goto L_0x046c
            r11 = r11[r13]
            b.l.f.d0.e.d[] r11 = r11.f5676b
            goto L_0x046d
        L_0x046c:
            r11 = r12
        L_0x046d:
            r13 = 14
            b.l.f.d0.e.d[] r14 = new b.l.f.d0.e.d[r13]
            r15 = r12[r9]
            r17 = 2
            r14[r17] = r15
            r15 = r11[r9]
            r14[r16] = r15
            if (r9 <= 0) goto L_0x0491
            int r15 = r9 + -1
            r17 = r8[r15]
            r19 = 0
            r14[r19] = r17
            r17 = r12[r15]
            r19 = 4
            r14[r19] = r17
            r15 = r11[r15]
            r17 = 5
            r14[r17] = r15
        L_0x0491:
            r15 = 1
            if (r9 <= r15) goto L_0x04a8
            r15 = 8
            int r17 = r9 + -2
            r19 = r8[r17]
            r14[r15] = r19
            r15 = 10
            r19 = r12[r17]
            r14[r15] = r19
            r15 = 11
            r17 = r11[r17]
            r14[r15] = r17
        L_0x04a8:
            int r15 = r8.length
            int r15 = r15 + -1
            if (r9 >= r15) goto L_0x04c2
            int r15 = r9 + 1
            r17 = r8[r15]
            r19 = 1
            r14[r19] = r17
            r17 = r12[r15]
            r19 = 6
            r14[r19] = r17
            r15 = r11[r15]
            r17 = 7
            r14[r17] = r15
            goto L_0x04c6
        L_0x04c2:
            r17 = 7
            r19 = 6
        L_0x04c6:
            int r15 = r8.length
            int r15 = r15 + -2
            if (r9 >= r15) goto L_0x04df
            r15 = 9
            int r20 = r9 + 2
            r21 = r8[r20]
            r14[r15] = r21
            r15 = 12
            r12 = r12[r20]
            r14[r15] = r12
            r12 = 13
            r11 = r11[r20]
            r14[r12] = r11
        L_0x04df:
            r11 = 0
        L_0x04e0:
            if (r11 >= r13) goto L_0x0506
            r12 = r14[r11]
            if (r12 != 0) goto L_0x04e7
            goto L_0x04f9
        L_0x04e7:
            boolean r13 = r12.a()
            if (r13 == 0) goto L_0x04f9
            int r13 = r12.c
            int r15 = r10.c
            if (r13 != r15) goto L_0x04f9
            int r12 = r12.f5666e
            r10.f5666e = r12
            r12 = 1
            goto L_0x04fa
        L_0x04f9:
            r12 = 0
        L_0x04fa:
            if (r12 == 0) goto L_0x04fd
            goto L_0x0506
        L_0x04fd:
            int r11 = r11 + 1
            r13 = 14
            goto L_0x04e0
        L_0x0502:
            r17 = 7
            r19 = 6
        L_0x0506:
            int r9 = r9 + 1
            goto L_0x0448
        L_0x050a:
            r17 = 7
            r19 = 6
            int r6 = r6 + 1
            goto L_0x043b
        L_0x0512:
            r17 = 7
            r19 = 6
            r6 = r7
        L_0x0517:
            if (r6 <= 0) goto L_0x0525
            if (r6 < r5) goto L_0x051c
            goto L_0x0525
        L_0x051c:
            r5 = 0
            r8 = 1
            r29 = r6
            r6 = r5
            r5 = r29
            goto L_0x0356
        L_0x0525:
            b.l.f.d0.e.g[] r5 = r3.f5675b
            int r6 = r5.length
            r7 = 0
            r8 = 0
        L_0x052a:
            if (r7 >= r6) goto L_0x0552
            r9 = r5[r7]
            if (r9 == 0) goto L_0x054d
            b.l.f.d0.e.d[] r9 = r9.f5676b
            int r10 = r9.length
            r11 = 0
        L_0x0534:
            if (r11 >= r10) goto L_0x054d
            r12 = r9[r11]
            if (r12 == 0) goto L_0x054a
            int r13 = r12.f5666e
            if (r13 < 0) goto L_0x054a
            int r14 = r2.length
            if (r13 >= r14) goto L_0x054a
            r13 = r2[r13]
            r13 = r13[r8]
            int r12 = r12.d
            r13.b(r12)
        L_0x054a:
            int r11 = r11 + 1
            goto L_0x0534
        L_0x054d:
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L_0x052a
        L_0x0552:
            r5 = 0
            r5 = r2[r5]
            r6 = 1
            r5 = r5[r6]
            int[] r6 = r5.a()
            int r7 = r3.d
            b.l.f.d0.e.a r8 = r3.a
            int r9 = r8.f5659e
            int r7 = r7 * r9
            int r8 = r8.f5658b
            r9 = 2
            int r8 = r9 << r8
            int r7 = r7 - r8
            int r8 = r6.length
            if (r8 != 0) goto L_0x0576
            if (r7 <= 0) goto L_0x0573
            r6 = 928(0x3a0, float:1.3E-42)
            if (r7 > r6) goto L_0x0573
            goto L_0x057b
        L_0x0573:
            b.l.f.m r0 = b.l.f.m.f5759j
            throw r0
        L_0x0576:
            r8 = 0
            r6 = r6[r8]
            if (r6 == r7) goto L_0x057e
        L_0x057b:
            r5.b(r7)
        L_0x057e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            b.l.f.d0.e.a r6 = r3.a
            int r6 = r6.f5659e
            int r7 = r3.d
            int r6 = r6 * r7
            int[] r6 = new int[r6]
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
        L_0x0597:
            b.l.f.d0.e.a r11 = r3.a
            int r11 = r11.f5659e
            if (r10 >= r11) goto L_0x05d4
            r11 = 0
        L_0x059e:
            int r12 = r3.d
            if (r11 >= r12) goto L_0x05d1
            r12 = r2[r10]
            int r13 = r11 + 1
            r12 = r12[r13]
            int[] r12 = r12.a()
            int r14 = r3.d
            int r14 = r14 * r10
            int r14 = r14 + r11
            int r11 = r12.length
            if (r11 != 0) goto L_0x05bb
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r5.add(r11)
            goto L_0x05cf
        L_0x05bb:
            int r11 = r12.length
            r15 = 1
            if (r11 != r15) goto L_0x05c5
            r11 = 0
            r11 = r12[r11]
            r6[r14] = r11
            goto L_0x05cf
        L_0x05c5:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r8.add(r11)
            r7.add(r12)
        L_0x05cf:
            r11 = r13
            goto L_0x059e
        L_0x05d1:
            int r10 = r10 + 1
            goto L_0x0597
        L_0x05d4:
            int r2 = r7.size()
            int[][] r10 = new int[r2][]
            r11 = 0
        L_0x05db:
            if (r11 >= r2) goto L_0x05e8
            java.lang.Object r12 = r7.get(r11)
            int[] r12 = (int[]) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x05db
        L_0x05e8:
            b.l.f.d0.e.a r2 = r3.a
            int r2 = r2.f5658b
            int[] r3 = b.l.f.d0.a.b(r5)
            int[] r5 = b.l.f.d0.a.b(r8)
            int r7 = r5.length
            int[] r8 = new int[r7]
            r11 = 100
        L_0x05f9:
            int r12 = r11 + -1
            if (r11 <= 0) goto L_0x0662
            r11 = 0
        L_0x05fe:
            if (r11 >= r7) goto L_0x060d
            r13 = r5[r11]
            r14 = r10[r11]
            r15 = r8[r11]
            r14 = r14[r15]
            r6[r13] = r14
            int r11 = r11 + 1
            goto L_0x05fe
        L_0x060d:
            b.l.f.y.e r2 = b.l.f.d0.e.j.b(r6, r2, r3)     // Catch:{ d -> 0x0637 }
            b.l.f.q r3 = new b.l.f.q
            java.lang.String r5 = r2.c
            byte[] r6 = r2.a
            b.l.f.a r7 = b.l.f.a.PDF_417
            r3.<init>(r5, r6, r4, r7)
            b.l.f.r r4 = b.l.f.r.ERROR_CORRECTION_LEVEL
            java.lang.String r5 = r2.f5827e
            r3.b(r4, r5)
            java.lang.Object r2 = r2.f
            b.l.f.d0.c r2 = (b.l.f.d0.c) r2
            if (r2 == 0) goto L_0x062e
            b.l.f.r r4 = b.l.f.r.PDF417_EXTRA_METADATA
            r3.b(r4, r2)
        L_0x062e:
            r0.add(r3)
            r2 = 0
            r5 = r9
            r3 = r28
            goto L_0x0071
        L_0x0637:
            if (r7 == 0) goto L_0x065d
            r11 = 0
        L_0x063a:
            if (r11 >= r7) goto L_0x065b
            r13 = r8[r11]
            r14 = r10[r11]
            int r14 = r14.length
            int r14 = r14 + -1
            if (r13 >= r14) goto L_0x064c
            r13 = r8[r11]
            int r13 = r13 + 1
            r8[r11] = r13
            goto L_0x065b
        L_0x064c:
            r13 = 0
            r8[r11] = r13
            int r13 = r7 + -1
            if (r11 == r13) goto L_0x0656
            int r11 = r11 + 1
            goto L_0x063a
        L_0x0656:
            b.l.f.d r0 = b.l.f.d.a()
            throw r0
        L_0x065b:
            r11 = r12
            goto L_0x05f9
        L_0x065d:
            b.l.f.d r0 = b.l.f.d.a()
            throw r0
        L_0x0662:
            b.l.f.d r0 = b.l.f.d.a()
            throw r0
        L_0x0667:
            b.l.f.m r0 = b.l.f.m.f5759j
            throw r0
        L_0x066a:
            b.l.f.q[] r1 = a
            java.lang.Object[] r0 = r0.toArray(r1)
            b.l.f.q[] r0 = (b.l.f.q[]) r0
            int r1 = r0.length
            if (r1 == 0) goto L_0x067d
            r1 = 0
            r2 = r0[r1]
            if (r2 == 0) goto L_0x067d
            r0 = r0[r1]
            return r0
        L_0x067d:
            b.l.f.m r0 = b.l.f.m.f5759j
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.d0.b.a(b.l.f.c, java.util.Map):b.l.f.q");
    }

    public q b(c cVar) {
        return a(cVar, (Map<e, ?>) null);
    }

    public void c() {
    }
}
