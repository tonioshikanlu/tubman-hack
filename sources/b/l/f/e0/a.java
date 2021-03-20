package b.l.f.e0;

import b.l.f.c;
import b.l.f.e0.c.e;
import b.l.f.o;
import b.l.f.q;
import b.l.f.s;
import java.util.Map;

public class a implements o {

    /* renamed from: b  reason: collision with root package name */
    public static final s[] f5700b = new s[0];
    public final e a = new e();

    /* JADX WARNING: Removed duplicated region for block: B:194:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x041d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.f.q a(b.l.f.c r30, java.util.Map<b.l.f.e, ?> r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 5
            r4 = 0
            r5 = 3
            r6 = 1
            if (r1 == 0) goto L_0x00e0
            b.l.f.e r7 = b.l.f.e.PURE_BARCODE
            boolean r7 = r1.containsKey(r7)
            if (r7 == 0) goto L_0x00e0
            b.l.f.y.b r5 = r30.a()
            int[] r7 = r5.f()
            int[] r8 = r5.c()
            if (r7 == 0) goto L_0x00dd
            if (r8 == 0) goto L_0x00dd
            int r9 = r5.f5812i
            int r10 = r5.f5811h
            r11 = r7[r4]
            r12 = r7[r6]
            r14 = r4
            r13 = r6
        L_0x002e:
            if (r11 >= r10) goto L_0x0043
            if (r12 >= r9) goto L_0x0043
            boolean r15 = r5.b(r11, r12)
            if (r13 == r15) goto L_0x003e
            int r14 = r14 + 1
            if (r14 == r3) goto L_0x0043
            r13 = r13 ^ 1
        L_0x003e:
            int r11 = r11 + 1
            int r12 = r12 + 1
            goto L_0x002e
        L_0x0043:
            if (r11 == r10) goto L_0x00da
            if (r12 == r9) goto L_0x00da
            r3 = r7[r4]
            int r11 = r11 - r3
            float r3 = (float) r11
            r9 = 1088421888(0x40e00000, float:7.0)
            float r3 = r3 / r9
            r9 = r7[r6]
            r10 = r8[r6]
            r7 = r7[r4]
            r8 = r8[r4]
            if (r7 >= r8) goto L_0x00d7
            if (r9 >= r10) goto L_0x00d7
            int r11 = r10 - r9
            int r12 = r8 - r7
            if (r11 == r12) goto L_0x006a
            int r8 = r7 + r11
            int r12 = r5.f5811h
            if (r8 >= r12) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x006a:
            int r12 = r8 - r7
            int r12 = r12 + r6
            float r12 = (float) r12
            float r12 = r12 / r3
            int r12 = java.lang.Math.round(r12)
            int r11 = r11 + r6
            float r11 = (float) r11
            float r11 = r11 / r3
            int r11 = java.lang.Math.round(r11)
            if (r12 <= 0) goto L_0x00d4
            if (r11 <= 0) goto L_0x00d4
            if (r11 != r12) goto L_0x00d1
            float r2 = r3 / r2
            int r2 = (int) r2
            int r9 = r9 + r2
            int r7 = r7 + r2
            int r13 = r12 + -1
            float r13 = (float) r13
            float r13 = r13 * r3
            int r13 = (int) r13
            int r13 = r13 + r7
            int r13 = r13 - r8
            if (r13 <= 0) goto L_0x0095
            if (r13 > r2) goto L_0x0092
            int r7 = r7 - r13
            goto L_0x0095
        L_0x0092:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x0095:
            int r8 = r11 + -1
            float r8 = (float) r8
            float r8 = r8 * r3
            int r8 = (int) r8
            int r8 = r8 + r9
            int r8 = r8 - r10
            if (r8 <= 0) goto L_0x00a5
            if (r8 > r2) goto L_0x00a2
            int r9 = r9 - r8
            goto L_0x00a5
        L_0x00a2:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00a5:
            b.l.f.y.b r2 = new b.l.f.y.b
            r2.<init>(r12, r11)
            r8 = r4
        L_0x00ab:
            if (r8 >= r11) goto L_0x00c7
            float r10 = (float) r8
            float r10 = r10 * r3
            int r10 = (int) r10
            int r10 = r10 + r9
            r13 = r4
        L_0x00b2:
            if (r13 >= r12) goto L_0x00c4
            float r14 = (float) r13
            float r14 = r14 * r3
            int r14 = (int) r14
            int r14 = r14 + r7
            boolean r14 = r5.b(r14, r10)
            if (r14 == 0) goto L_0x00c1
            r2.g(r13, r8)
        L_0x00c1:
            int r13 = r13 + 1
            goto L_0x00b2
        L_0x00c4:
            int r8 = r8 + 1
            goto L_0x00ab
        L_0x00c7:
            b.l.f.e0.c.e r3 = r0.a
            b.l.f.y.e r1 = r3.a(r2, r1)
            b.l.f.s[] r2 = f5700b
            goto L_0x0435
        L_0x00d1:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00d4:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00d7:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00da:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00dd:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00e0:
            b.l.f.e0.d.c r2 = new b.l.f.e0.d.c
            b.l.f.y.b r7 = r30.a()
            r2.<init>(r7)
            if (r1 != 0) goto L_0x00ed
            r7 = 0
            goto L_0x00f5
        L_0x00ed:
            b.l.f.e r7 = b.l.f.e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r7 = r1.get(r7)
            b.l.f.t r7 = (b.l.f.t) r7
        L_0x00f5:
            r2.f5739b = r7
            b.l.f.e0.d.e r8 = new b.l.f.e0.d.e
            b.l.f.y.b r9 = r2.a
            r8.<init>(r9, r7)
            if (r1 == 0) goto L_0x010a
            b.l.f.e r7 = b.l.f.e.TRY_HARDER
            boolean r7 = r1.containsKey(r7)
            if (r7 == 0) goto L_0x010a
            r7 = r6
            goto L_0x010b
        L_0x010a:
            r7 = r4
        L_0x010b:
            b.l.f.y.b r9 = r8.a
            int r10 = r9.f5812i
            int r9 = r9.f5811h
            int r11 = r10 * 3
            int r11 = r11 / 388
            if (r11 < r5) goto L_0x011b
            if (r7 == 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r5 = r11
        L_0x011b:
            int[] r3 = new int[r3]
            int r7 = r5 + -1
            r11 = r7
            r7 = r5
            r5 = r4
        L_0x0122:
            r12 = 4
            if (r11 >= r10) goto L_0x01e6
            if (r4 != 0) goto L_0x01e6
            r8.b(r3)
            r13 = r12
            r12 = r11
            r11 = r7
            r7 = r5
        L_0x012e:
            if (r5 >= r9) goto L_0x01c7
            b.l.f.y.b r14 = r8.a
            boolean r14 = r14.b(r5, r12)
            if (r14 == 0) goto L_0x0145
            r13 = r7 & 1
            if (r13 != r6) goto L_0x013e
            int r7 = r7 + 1
        L_0x013e:
            r13 = r3[r7]
            int r13 = r13 + r6
            r3[r7] = r13
            goto L_0x01c3
        L_0x0145:
            r14 = r7 & 1
            if (r14 != 0) goto L_0x01be
            if (r7 != r13) goto L_0x01b6
            boolean r7 = b.l.f.e0.d.e.c(r3)
            if (r7 == 0) goto L_0x01b1
            boolean r7 = r8.e(r3, r12, r5)
            if (r7 == 0) goto L_0x01b1
            boolean r7 = r8.c
            if (r7 == 0) goto L_0x0160
            boolean r4 = r8.f()
            goto L_0x01ab
        L_0x0160:
            java.util.List<b.l.f.e0.d.d> r7 = r8.f5740b
            int r7 = r7.size()
            if (r7 > r6) goto L_0x0169
            goto L_0x019e
        L_0x0169:
            java.util.List<b.l.f.e0.d.d> r7 = r8.f5740b
            java.util.Iterator r7 = r7.iterator()
            r11 = 0
        L_0x0170:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x019e
            java.lang.Object r13 = r7.next()
            b.l.f.e0.d.d r13 = (b.l.f.e0.d.d) r13
            int r14 = r13.d
            r15 = 2
            if (r14 < r15) goto L_0x0170
            if (r11 != 0) goto L_0x0185
            r11 = r13
            goto L_0x0170
        L_0x0185:
            r8.c = r6
            float r7 = r11.a
            float r14 = r13.a
            float r7 = r7 - r14
            float r7 = java.lang.Math.abs(r7)
            float r11 = r11.f5775b
            float r13 = r13.f5775b
            float r11 = r11 - r13
            float r11 = java.lang.Math.abs(r11)
            float r7 = r7 - r11
            int r7 = (int) r7
            r11 = 2
            int r7 = r7 / r11
            goto L_0x01a0
        L_0x019e:
            r11 = 2
            r7 = 0
        L_0x01a0:
            r13 = r3[r11]
            if (r7 <= r13) goto L_0x01ab
            r5 = r3[r11]
            int r7 = r7 - r5
            int r7 = r7 - r11
            int r12 = r12 + r7
            int r5 = r9 + -1
        L_0x01ab:
            r8.b(r3)
            r7 = 0
            r11 = 2
            goto L_0x01c3
        L_0x01b1:
            r8.g(r3)
            r7 = 3
            goto L_0x01c3
        L_0x01b6:
            int r7 = r7 + 1
            r13 = r3[r7]
            int r13 = r13 + r6
            r3[r7] = r13
            goto L_0x01c3
        L_0x01be:
            r13 = r3[r7]
            int r13 = r13 + r6
            r3[r7] = r13
        L_0x01c3:
            int r5 = r5 + r6
            r13 = 4
            goto L_0x012e
        L_0x01c7:
            boolean r5 = b.l.f.e0.d.e.c(r3)
            if (r5 == 0) goto L_0x01e0
            boolean r5 = r8.e(r3, r12, r9)
            if (r5 == 0) goto L_0x01e0
            r5 = 0
            r5 = r3[r5]
            boolean r7 = r8.c
            if (r7 == 0) goto L_0x01de
            boolean r4 = r8.f()
        L_0x01de:
            r7 = r5
            goto L_0x01e1
        L_0x01e0:
            r7 = r11
        L_0x01e1:
            int r11 = r12 + r7
            r5 = 0
            goto L_0x0122
        L_0x01e6:
            java.util.List<b.l.f.e0.d.d> r3 = r8.f5740b
            int r3 = r3.size()
            r4 = 3
            if (r3 < r4) goto L_0x04a2
            java.util.List<b.l.f.e0.d.d> r3 = r8.f5740b
            b.l.f.e0.d.e$b r5 = b.l.f.e0.d.e.f
            r3.sort(r5)
            double[] r3 = new double[r4]
            b.l.f.e0.d.d[] r4 = new b.l.f.e0.d.d[r4]
            r5 = 0
            r9 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0200:
            java.util.List<b.l.f.e0.d.d> r7 = r8.f5740b
            int r7 = r7.size()
            int r7 = r7 + -2
            if (r5 >= r7) goto L_0x02a0
            java.util.List<b.l.f.e0.d.d> r7 = r8.f5740b
            java.lang.Object r7 = r7.get(r5)
            b.l.f.e0.d.d r7 = (b.l.f.e0.d.d) r7
            float r11 = r7.c
            int r5 = r5 + 1
            r12 = r5
        L_0x0217:
            java.util.List<b.l.f.e0.d.d> r13 = r8.f5740b
            int r13 = r13.size()
            int r13 = r13 - r6
            if (r12 >= r13) goto L_0x029c
            java.util.List<b.l.f.e0.d.d> r13 = r8.f5740b
            java.lang.Object r13 = r13.get(r12)
            b.l.f.e0.d.d r13 = (b.l.f.e0.d.d) r13
            double r14 = b.l.f.e0.d.e.h(r7, r13)
            int r12 = r12 + 1
            r30 = r5
            r16 = r6
            r5 = r12
        L_0x0233:
            java.util.List<b.l.f.e0.d.d> r6 = r8.f5740b
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0296
            java.util.List<b.l.f.e0.d.d> r6 = r8.f5740b
            java.lang.Object r6 = r6.get(r5)
            b.l.f.e0.d.d r6 = (b.l.f.e0.d.d) r6
            r17 = r8
            float r8 = r6.c
            r16 = 1068708659(0x3fb33333, float:1.4)
            float r16 = r16 * r11
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x028f
            r8 = 0
            r3[r8] = r14
            double r18 = b.l.f.e0.d.e.h(r13, r6)
            r8 = 1
            r3[r8] = r18
            double r18 = b.l.f.e0.d.e.h(r7, r6)
            r16 = 2
            r3[r16] = r18
            java.util.Arrays.sort(r3)
            r18 = r3[r16]
            r20 = r3[r8]
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r20 = r20 * r22
            double r18 = r18 - r20
            double r18 = java.lang.Math.abs(r18)
            r20 = r3[r16]
            r8 = 0
            r24 = r3[r8]
            double r24 = r24 * r22
            double r20 = r20 - r24
            double r20 = java.lang.Math.abs(r20)
            double r20 = r20 + r18
            int r18 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r18 >= 0) goto L_0x028f
            r4[r8] = r7
            r8 = 1
            r4[r8] = r13
            r4[r16] = r6
            r9 = r20
        L_0x028f:
            int r5 = r5 + 1
            r16 = 1
            r8 = r17
            goto L_0x0233
        L_0x0296:
            r5 = r30
            r6 = r16
            goto L_0x0217
        L_0x029c:
            r30 = r5
            goto L_0x0200
        L_0x02a0:
            r5 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x049f
            r3 = 0
            r5 = r4[r3]
            r6 = 1
            r7 = r4[r6]
            float r5 = b.l.f.s.a(r5, r7)
            r7 = r4[r6]
            r8 = 2
            r9 = r4[r8]
            float r7 = b.l.f.s.a(r7, r9)
            r9 = r4[r3]
            r10 = r4[r8]
            float r9 = b.l.f.s.a(r9, r10)
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 < 0) goto L_0x02d3
            int r10 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r10 < 0) goto L_0x02d3
            r3 = r4[r3]
            r5 = r4[r6]
            r6 = r4[r8]
            goto L_0x02ed
        L_0x02d3:
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x02e2
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x02e2
            r5 = r4[r6]
            r3 = r4[r3]
            r6 = r4[r8]
            goto L_0x02e8
        L_0x02e2:
            r5 = r4[r8]
            r3 = r4[r3]
            r6 = r4[r6]
        L_0x02e8:
            r28 = r5
            r5 = r3
            r3 = r28
        L_0x02ed:
            float r7 = r3.a
            float r8 = r3.f5775b
            float r9 = r6.a
            float r9 = r9 - r7
            float r10 = r5.f5775b
            float r10 = r10 - r8
            float r10 = r10 * r9
            float r9 = r6.f5775b
            float r9 = r9 - r8
            float r8 = r5.a
            float r8 = r8 - r7
            float r8 = r8 * r9
            float r10 = r10 - r8
            r7 = 0
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x030c
            r7 = 0
            r28 = r6
            r6 = r5
            r5 = r28
            goto L_0x030d
        L_0x030c:
            r7 = 0
        L_0x030d:
            r4[r7] = r5
            r5 = 1
            r4[r5] = r3
            r3 = 2
            r4[r3] = r6
            b.l.f.e0.d.f r3 = new b.l.f.e0.d.f
            r3.<init>(r4)
            b.l.f.e0.d.d r4 = r3.f5742b
            b.l.f.e0.d.d r5 = r3.c
            b.l.f.e0.d.d r3 = r3.a
            float r6 = r2.a(r4, r5)
            float r7 = r2.a(r4, r3)
            float r7 = r7 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x049c
            float r8 = r4.a
            float r9 = r4.f5775b
            float r10 = r5.a
            float r11 = r5.f5775b
            float r8 = b.l.f.x.a.g.l(r8, r9, r10, r11)
            float r8 = r8 / r7
            int r8 = b.l.f.x.a.g.g0(r8)
            float r9 = r4.a
            float r10 = r4.f5775b
            float r11 = r3.a
            float r12 = r3.f5775b
            float r9 = b.l.f.x.a.g.l(r9, r10, r11, r12)
            float r9 = r9 / r7
            int r9 = b.l.f.x.a.g.g0(r9)
            int r9 = r9 + r8
            r8 = 2
            int r9 = r9 / r8
            int r9 = r9 + 7
            r10 = r9 & 3
            if (r10 == 0) goto L_0x0369
            if (r10 == r8) goto L_0x0366
            r8 = 3
            if (r10 == r8) goto L_0x0363
            goto L_0x036b
        L_0x0363:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x0366:
            int r9 = r9 + -1
            goto L_0x036b
        L_0x0369:
            int r9 = r9 + 1
        L_0x036b:
            int[] r8 = b.l.f.e0.c.j.f5730e
            int r8 = r9 % 4
            r10 = 1
            if (r8 != r10) goto L_0x0497
            int r8 = r9 + -17
            int r8 = r8 / 4
            b.l.f.e0.c.j r8 = b.l.f.e0.c.j.d(r8)     // Catch:{ IllegalArgumentException -> 0x0492 }
            int r10 = r8.c()
            int r10 = r10 + -7
            int[] r8 = r8.f5731b
            int r8 = r8.length
            r11 = 1077936128(0x40400000, float:3.0)
            if (r8 <= 0) goto L_0x03b3
            float r8 = r5.a
            float r12 = r4.a
            float r8 = r8 - r12
            float r13 = r3.a
            float r8 = r8 + r13
            float r13 = r5.f5775b
            float r14 = r4.f5775b
            float r13 = r13 - r14
            float r15 = r3.f5775b
            float r13 = r13 + r15
            float r10 = (float) r10
            float r10 = r11 / r10
            float r6 = r6 - r10
            float r8 = b.e.a.a.a.a(r8, r12, r6, r12)
            int r8 = (int) r8
            float r6 = b.e.a.a.a.a(r13, r14, r6, r14)
            int r6 = (int) r6
            r10 = 4
        L_0x03a6:
            r12 = 16
            if (r10 > r12) goto L_0x03b3
            float r12 = (float) r10
            b.l.f.e0.d.a r6 = r2.b(r7, r8, r6, r12)     // Catch:{ m -> 0x03b0 }
            goto L_0x03b4
        L_0x03b0:
            int r10 = r10 << 1
            goto L_0x03a6
        L_0x03b3:
            r6 = 0
        L_0x03b4:
            float r7 = (float) r9
            r8 = 1080033280(0x40600000, float:3.5)
            float r19 = r7 - r8
            if (r6 == 0) goto L_0x03c8
            float r7 = r6.a
            float r8 = r6.f5775b
            float r10 = r19 - r11
            r24 = r7
            r25 = r8
            r17 = r10
            goto L_0x03de
        L_0x03c8:
            float r7 = r5.a
            float r8 = r4.a
            float r7 = r7 - r8
            float r8 = r3.a
            float r7 = r7 + r8
            float r8 = r5.f5775b
            float r10 = r4.f5775b
            float r8 = r8 - r10
            float r10 = r3.f5775b
            float r8 = r8 + r10
            r24 = r7
            r25 = r8
            r17 = r19
        L_0x03de:
            r12 = 1080033280(0x40600000, float:3.5)
            r13 = 1080033280(0x40600000, float:3.5)
            r18 = 1080033280(0x40600000, float:3.5)
            float r7 = r4.a
            float r8 = r4.f5775b
            float r10 = r5.a
            float r11 = r5.f5775b
            float r14 = r3.a
            float r15 = r3.f5775b
            r26 = r14
            r14 = r19
            r27 = r15
            r15 = 1080033280(0x40600000, float:3.5)
            r16 = r17
            r20 = r7
            r21 = r8
            r22 = r10
            r23 = r11
            b.l.f.y.i r7 = b.l.f.y.i.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            b.l.f.y.b r2 = r2.a
            b.l.f.y.f r8 = b.l.f.y.f.a
            b.l.f.y.b r2 = r8.a(r2, r9, r9, r7)
            r7 = 3
            if (r6 != 0) goto L_0x041d
            b.l.f.s[] r6 = new b.l.f.s[r7]
            r7 = 0
            r6[r7] = r3
            r3 = 1
            r6[r3] = r4
            r4 = 2
            r6[r4] = r5
            goto L_0x042d
        L_0x041d:
            r8 = 4
            r9 = 0
            r10 = 1
            r11 = 2
            b.l.f.s[] r8 = new b.l.f.s[r8]
            r8[r9] = r3
            r8[r10] = r4
            r8[r11] = r5
            r8[r7] = r6
            r6 = r8
            r3 = r10
        L_0x042d:
            b.l.f.e0.c.e r4 = r0.a
            b.l.f.y.e r1 = r4.a(r2, r1)
            r2 = r6
            r6 = r3
        L_0x0435:
            java.lang.Object r3 = r1.f
            boolean r4 = r3 instanceof b.l.f.e0.c.i
            if (r4 == 0) goto L_0x0451
            b.l.f.e0.c.i r3 = (b.l.f.e0.c.i) r3
            boolean r3 = r3.a
            if (r3 == 0) goto L_0x0451
            int r3 = r2.length
            r4 = 3
            if (r3 >= r4) goto L_0x0446
            goto L_0x0451
        L_0x0446:
            r3 = 0
            r4 = r2[r3]
            r5 = 2
            r7 = r2[r5]
            r2[r3] = r7
            r2[r5] = r4
            goto L_0x0452
        L_0x0451:
            r3 = 0
        L_0x0452:
            b.l.f.q r4 = new b.l.f.q
            java.lang.String r5 = r1.c
            byte[] r7 = r1.a
            b.l.f.a r8 = b.l.f.a.QR_CODE
            r4.<init>(r5, r7, r2, r8)
            java.util.List<byte[]> r2 = r1.d
            if (r2 == 0) goto L_0x0466
            b.l.f.r r5 = b.l.f.r.BYTE_SEGMENTS
            r4.b(r5, r2)
        L_0x0466:
            java.lang.String r2 = r1.f5827e
            if (r2 == 0) goto L_0x046f
            b.l.f.r r5 = b.l.f.r.ERROR_CORRECTION_LEVEL
            r4.b(r5, r2)
        L_0x046f:
            int r2 = r1.f5828g
            if (r2 < 0) goto L_0x0478
            int r2 = r1.f5829h
            if (r2 < 0) goto L_0x0478
            goto L_0x0479
        L_0x0478:
            r6 = r3
        L_0x0479:
            if (r6 == 0) goto L_0x0491
            b.l.f.r r2 = b.l.f.r.STRUCTURED_APPEND_SEQUENCE
            int r3 = r1.f5829h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.b(r2, r3)
            b.l.f.r r2 = b.l.f.r.STRUCTURED_APPEND_PARITY
            int r1 = r1.f5828g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.b(r2, r1)
        L_0x0491:
            return r4
        L_0x0492:
            b.l.f.h r1 = b.l.f.h.a()
            throw r1
        L_0x0497:
            b.l.f.h r1 = b.l.f.h.a()
            throw r1
        L_0x049c:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x049f:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x04a2:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.e0.a.a(b.l.f.c, java.util.Map):b.l.f.q");
    }

    public q b(c cVar) {
        return a(cVar, (Map<b.l.f.e, ?>) null);
    }

    public void c() {
    }
}
