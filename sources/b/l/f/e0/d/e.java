package b.l.f.e0.d;

import b.l.f.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class e {
    public static final b f = new b((a) null);
    public final b.l.f.y.b a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f5740b = new ArrayList();
    public boolean c;
    public final int[] d = new int[5];

    /* renamed from: e  reason: collision with root package name */
    public final t f5741e;

    public static final class b implements Serializable, Comparator<d> {
        public b(a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            return Float.compare(((d) obj).c, ((d) obj2).c);
        }
    }

    public e(b.l.f.y.b bVar, t tVar) {
        this.a = bVar;
        this.f5741e = tVar;
    }

    public static float a(int[] iArr, int i2) {
        return ((float) ((i2 - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    public static boolean c(int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int i4 = iArr[i3];
            if (i4 == 0) {
                return false;
            }
            i2 += i4;
        }
        if (i2 < 7) {
            return false;
        }
        float f2 = ((float) i2) / 7.0f;
        float f3 = f2 / 2.0f;
        return Math.abs(f2 - ((float) iArr[0])) < f3 && Math.abs(f2 - ((float) iArr[1])) < f3 && Math.abs((f2 * 3.0f) - ((float) iArr[2])) < 3.0f * f3 && Math.abs(f2 - ((float) iArr[3])) < f3 && Math.abs(f2 - ((float) iArr[4])) < f3;
    }

    public static double h(d dVar, d dVar2) {
        double d2 = (double) (dVar.a - dVar2.a);
        double d3 = (double) (dVar.f5775b - dVar2.f5775b);
        return (d3 * d3) + (d2 * d2);
    }

    public final void b(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = 0;
        }
    }

    public final int[] d() {
        b(this.d);
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x033f A[LOOP:19: B:179:0x02dd->B:193:0x033f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x031e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(int[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r5 = r1[r4]
            int r3 = r3 + r5
            r5 = 2
            r6 = r1[r5]
            int r3 = r3 + r6
            r6 = 3
            r7 = r1[r6]
            int r3 = r3 + r7
            r7 = 4
            r8 = r1[r7]
            int r3 = r3 + r8
            r8 = r20
            float r8 = a(r1, r8)
            int r8 = (int) r8
            r9 = r1[r5]
            b.l.f.y.b r10 = r0.a
            int r11 = r10.f5812i
            int[] r12 = r17.d()
            r13 = r19
        L_0x002a:
            if (r13 < 0) goto L_0x003a
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x003a
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + -1
            goto L_0x002a
        L_0x003a:
            r15 = 5
            if (r13 >= 0) goto L_0x003f
            goto L_0x00e2
        L_0x003f:
            if (r13 < 0) goto L_0x0053
            boolean r16 = r10.b(r8, r13)
            if (r16 != 0) goto L_0x0053
            r14 = r12[r4]
            if (r14 > r9) goto L_0x0053
            r14 = r12[r4]
            int r14 = r14 + r4
            r12[r4] = r14
            int r13 = r13 + -1
            goto L_0x003f
        L_0x0053:
            if (r13 < 0) goto L_0x00e2
            r14 = r12[r4]
            if (r14 <= r9) goto L_0x005b
            goto L_0x00e2
        L_0x005b:
            if (r13 < 0) goto L_0x006f
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x006f
            r14 = r12[r2]
            if (r14 > r9) goto L_0x006f
            r14 = r12[r2]
            int r14 = r14 + r4
            r12[r2] = r14
            int r13 = r13 + -1
            goto L_0x005b
        L_0x006f:
            r13 = r12[r2]
            if (r13 <= r9) goto L_0x0075
            goto L_0x00e2
        L_0x0075:
            int r13 = r19 + 1
        L_0x0077:
            if (r13 >= r11) goto L_0x0087
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x0087
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + 1
            goto L_0x0077
        L_0x0087:
            if (r13 != r11) goto L_0x008a
            goto L_0x00e2
        L_0x008a:
            if (r13 >= r11) goto L_0x009e
            boolean r14 = r10.b(r8, r13)
            if (r14 != 0) goto L_0x009e
            r14 = r12[r6]
            if (r14 >= r9) goto L_0x009e
            r14 = r12[r6]
            int r14 = r14 + r4
            r12[r6] = r14
            int r13 = r13 + 1
            goto L_0x008a
        L_0x009e:
            if (r13 == r11) goto L_0x00e2
            r14 = r12[r6]
            if (r14 < r9) goto L_0x00a5
            goto L_0x00e2
        L_0x00a5:
            if (r13 >= r11) goto L_0x00b9
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x00b9
            r14 = r12[r7]
            if (r14 >= r9) goto L_0x00b9
            r14 = r12[r7]
            int r14 = r14 + r4
            r12[r7] = r14
            int r13 = r13 + 1
            goto L_0x00a5
        L_0x00b9:
            r10 = r12[r7]
            if (r10 < r9) goto L_0x00be
            goto L_0x00e2
        L_0x00be:
            r9 = r12[r2]
            r10 = r12[r4]
            int r9 = r9 + r10
            r10 = r12[r5]
            int r9 = r9 + r10
            r10 = r12[r6]
            int r9 = r9 + r10
            r10 = r12[r7]
            int r9 = r9 + r10
            int r9 = r9 - r3
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 * r15
            int r10 = r3 * 2
            if (r9 < r10) goto L_0x00d7
            goto L_0x00e2
        L_0x00d7:
            boolean r9 = c(r12)
            if (r9 == 0) goto L_0x00e2
            float r9 = a(r12, r13)
            goto L_0x00e4
        L_0x00e2:
            r9 = 2143289344(0x7fc00000, float:NaN)
        L_0x00e4:
            boolean r10 = java.lang.Float.isNaN(r9)
            if (r10 != 0) goto L_0x0357
            int r10 = (int) r9
            r1 = r1[r5]
            b.l.f.y.b r11 = r0.a
            int r12 = r11.f5811h
            int[] r13 = r17.d()
            r14 = r8
        L_0x00f6:
            if (r14 < 0) goto L_0x0107
            boolean r16 = r11.b(r14, r10)
            if (r16 == 0) goto L_0x0107
            r16 = r13[r5]
            int r16 = r16 + 1
            r13[r5] = r16
            int r14 = r14 + -1
            goto L_0x00f6
        L_0x0107:
            if (r14 >= 0) goto L_0x010b
            goto L_0x01ad
        L_0x010b:
            if (r14 < 0) goto L_0x0120
            boolean r16 = r11.b(r14, r10)
            if (r16 != 0) goto L_0x0120
            r15 = r13[r4]
            if (r15 > r1) goto L_0x0120
            r15 = r13[r4]
            int r15 = r15 + r4
            r13[r4] = r15
            int r14 = r14 + -1
            r15 = 5
            goto L_0x010b
        L_0x0120:
            if (r14 < 0) goto L_0x01ad
            r15 = r13[r4]
            if (r15 <= r1) goto L_0x0128
            goto L_0x01ad
        L_0x0128:
            if (r14 < 0) goto L_0x013c
            boolean r15 = r11.b(r14, r10)
            if (r15 == 0) goto L_0x013c
            r15 = r13[r2]
            if (r15 > r1) goto L_0x013c
            r15 = r13[r2]
            int r15 = r15 + r4
            r13[r2] = r15
            int r14 = r14 + -1
            goto L_0x0128
        L_0x013c:
            r14 = r13[r2]
            if (r14 <= r1) goto L_0x0142
            goto L_0x01ad
        L_0x0142:
            int r8 = r8 + r4
        L_0x0143:
            if (r8 >= r12) goto L_0x0153
            boolean r14 = r11.b(r8, r10)
            if (r14 == 0) goto L_0x0153
            r14 = r13[r5]
            int r14 = r14 + r4
            r13[r5] = r14
            int r8 = r8 + 1
            goto L_0x0143
        L_0x0153:
            if (r8 != r12) goto L_0x0156
            goto L_0x01ad
        L_0x0156:
            if (r8 >= r12) goto L_0x016a
            boolean r14 = r11.b(r8, r10)
            if (r14 != 0) goto L_0x016a
            r14 = r13[r6]
            if (r14 >= r1) goto L_0x016a
            r14 = r13[r6]
            int r14 = r14 + r4
            r13[r6] = r14
            int r8 = r8 + 1
            goto L_0x0156
        L_0x016a:
            if (r8 == r12) goto L_0x01ad
            r14 = r13[r6]
            if (r14 < r1) goto L_0x0171
            goto L_0x01ad
        L_0x0171:
            if (r8 >= r12) goto L_0x0185
            boolean r14 = r11.b(r8, r10)
            if (r14 == 0) goto L_0x0185
            r14 = r13[r7]
            if (r14 >= r1) goto L_0x0185
            r14 = r13[r7]
            int r14 = r14 + r4
            r13[r7] = r14
            int r8 = r8 + 1
            goto L_0x0171
        L_0x0185:
            r11 = r13[r7]
            if (r11 < r1) goto L_0x018a
            goto L_0x01ad
        L_0x018a:
            r1 = r13[r2]
            r11 = r13[r4]
            int r1 = r1 + r11
            r11 = r13[r5]
            int r1 = r1 + r11
            r11 = r13[r6]
            int r1 = r1 + r11
            r11 = r13[r7]
            int r1 = r1 + r11
            int r1 = r1 - r3
            int r1 = java.lang.Math.abs(r1)
            r11 = 5
            int r1 = r1 * r11
            if (r1 < r3) goto L_0x01a2
            goto L_0x01ad
        L_0x01a2:
            boolean r1 = c(r13)
            if (r1 == 0) goto L_0x01ad
            float r14 = a(r13, r8)
            goto L_0x01af
        L_0x01ad:
            r14 = 2143289344(0x7fc00000, float:NaN)
        L_0x01af:
            boolean r1 = java.lang.Float.isNaN(r14)
            if (r1 != 0) goto L_0x0357
            int r1 = (int) r14
            int[] r8 = r17.d()
            r11 = r2
        L_0x01bb:
            if (r10 < r11) goto L_0x01d3
            if (r1 < r11) goto L_0x01d3
            b.l.f.y.b r12 = r0.a
            int r13 = r1 - r11
            int r15 = r10 - r11
            boolean r12 = r12.b(r13, r15)
            if (r12 == 0) goto L_0x01d3
            r12 = r8[r5]
            int r12 = r12 + r4
            r8[r5] = r12
            int r11 = r11 + 1
            goto L_0x01bb
        L_0x01d3:
            r12 = r8[r5]
            if (r12 != 0) goto L_0x01d8
            goto L_0x0211
        L_0x01d8:
            if (r10 < r11) goto L_0x01f0
            if (r1 < r11) goto L_0x01f0
            b.l.f.y.b r12 = r0.a
            int r15 = r1 - r11
            int r13 = r10 - r11
            boolean r12 = r12.b(r15, r13)
            if (r12 != 0) goto L_0x01f0
            r12 = r8[r4]
            int r12 = r12 + r4
            r8[r4] = r12
            int r11 = r11 + 1
            goto L_0x01d8
        L_0x01f0:
            r12 = r8[r4]
            if (r12 != 0) goto L_0x01f5
            goto L_0x0211
        L_0x01f5:
            if (r10 < r11) goto L_0x020d
            if (r1 < r11) goto L_0x020d
            b.l.f.y.b r12 = r0.a
            int r13 = r1 - r11
            int r15 = r10 - r11
            boolean r12 = r12.b(r13, r15)
            if (r12 == 0) goto L_0x020d
            r12 = r8[r2]
            int r12 = r12 + r4
            r8[r2] = r12
            int r11 = r11 + 1
            goto L_0x01f5
        L_0x020d:
            r11 = r8[r2]
            if (r11 != 0) goto L_0x0214
        L_0x0211:
            r7 = r2
            goto L_0x02d6
        L_0x0214:
            b.l.f.y.b r11 = r0.a
            int r12 = r11.f5812i
            int r11 = r11.f5811h
            r13 = r4
        L_0x021b:
            int r15 = r10 + r13
            if (r15 >= r12) goto L_0x0235
            int r2 = r1 + r13
            if (r2 >= r11) goto L_0x0235
            b.l.f.y.b r7 = r0.a
            boolean r2 = r7.b(r2, r15)
            if (r2 == 0) goto L_0x0235
            r2 = r8[r5]
            int r2 = r2 + r4
            r8[r5] = r2
            int r13 = r13 + 1
            r2 = 0
            r7 = 4
            goto L_0x021b
        L_0x0235:
            int r2 = r10 + r13
            if (r2 >= r12) goto L_0x024d
            int r7 = r1 + r13
            if (r7 >= r11) goto L_0x024d
            b.l.f.y.b r15 = r0.a
            boolean r2 = r15.b(r7, r2)
            if (r2 != 0) goto L_0x024d
            r2 = r8[r6]
            int r2 = r2 + r4
            r8[r6] = r2
            int r13 = r13 + 1
            goto L_0x0235
        L_0x024d:
            r2 = r8[r6]
            if (r2 != 0) goto L_0x0253
            goto L_0x02d5
        L_0x0253:
            int r2 = r10 + r13
            if (r2 >= r12) goto L_0x026c
            int r7 = r1 + r13
            if (r7 >= r11) goto L_0x026c
            b.l.f.y.b r15 = r0.a
            boolean r2 = r15.b(r7, r2)
            if (r2 == 0) goto L_0x026c
            r2 = 4
            r7 = r8[r2]
            int r7 = r7 + r4
            r8[r2] = r7
            int r13 = r13 + 1
            goto L_0x0253
        L_0x026c:
            r2 = 4
            r1 = r8[r2]
            if (r1 != 0) goto L_0x0272
            goto L_0x02d5
        L_0x0272:
            r1 = 0
            r2 = 0
            r7 = 5
        L_0x0275:
            if (r1 >= r7) goto L_0x0280
            r10 = r8[r1]
            if (r10 != 0) goto L_0x027c
            goto L_0x02d5
        L_0x027c:
            int r2 = r2 + r10
            int r1 = r1 + 1
            goto L_0x0275
        L_0x0280:
            r1 = 7
            if (r2 >= r1) goto L_0x0284
            goto L_0x02d5
        L_0x0284:
            float r1 = (float) r2
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r2 = 1068146622(0x3faa9fbe, float:1.333)
            float r2 = r1 / r2
            r7 = 0
            r10 = r8[r7]
            float r7 = (float) r10
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x02d5
            r7 = r8[r4]
            float r7 = (float) r7
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x02d5
            r7 = 1077936128(0x40400000, float:3.0)
            float r10 = r1 * r7
            r5 = r8[r5]
            float r5 = (float) r5
            float r10 = r10 - r5
            float r5 = java.lang.Math.abs(r10)
            float r7 = r7 * r2
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x02d5
            r5 = r8[r6]
            float r5 = (float) r5
            float r5 = r1 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x02d5
            r5 = 4
            r5 = r8[r5]
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d5
            r7 = r4
            goto L_0x02d6
        L_0x02d5:
            r7 = 0
        L_0x02d6:
            if (r7 == 0) goto L_0x0357
            float r1 = (float) r3
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r7 = 0
        L_0x02dd:
            java.util.List<b.l.f.e0.d.d> r2 = r0.f5740b
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x0342
            java.util.List<b.l.f.e0.d.d> r2 = r0.f5740b
            java.lang.Object r2 = r2.get(r7)
            b.l.f.e0.d.d r2 = (b.l.f.e0.d.d) r2
            float r3 = r2.f5775b
            float r3 = r9 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x031b
            float r3 = r2.a
            float r3 = r14 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x031b
            float r3 = r2.c
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0319
            float r5 = r2.c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x031b
        L_0x0319:
            r3 = r4
            goto L_0x031c
        L_0x031b:
            r3 = 0
        L_0x031c:
            if (r3 == 0) goto L_0x033f
            java.util.List<b.l.f.e0.d.d> r3 = r0.f5740b
            int r5 = r2.d
            int r6 = r5 + 1
            float r5 = (float) r5
            float r8 = r2.a
            float r8 = r8 * r5
            float r8 = r8 + r14
            float r10 = (float) r6
            float r8 = r8 / r10
            float r11 = r2.f5775b
            float r11 = r11 * r5
            float r11 = r11 + r9
            float r11 = r11 / r10
            float r2 = r2.c
            float r5 = r5 * r2
            float r5 = r5 + r1
            float r5 = r5 / r10
            b.l.f.e0.d.d r2 = new b.l.f.e0.d.d
            r2.<init>(r8, r11, r5, r6)
            r3.set(r7, r2)
            r2 = r4
            goto L_0x0343
        L_0x033f:
            int r7 = r7 + 1
            goto L_0x02dd
        L_0x0342:
            r2 = 0
        L_0x0343:
            if (r2 != 0) goto L_0x0356
            b.l.f.e0.d.d r2 = new b.l.f.e0.d.d
            r2.<init>(r14, r9, r1)
            java.util.List<b.l.f.e0.d.d> r1 = r0.f5740b
            r1.add(r2)
            b.l.f.t r1 = r0.f5741e
            if (r1 == 0) goto L_0x0356
            r1.a(r2)
        L_0x0356:
            return r4
        L_0x0357:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.e0.d.e.e(int[], int, int):boolean");
    }

    public final boolean f() {
        int size = this.f5740b.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        for (d next : this.f5740b) {
            if (next.d >= 2) {
                i2++;
                f3 += next.c;
            }
        }
        if (i2 < 3) {
            return false;
        }
        float f4 = f3 / ((float) size);
        for (d dVar : this.f5740b) {
            f2 += Math.abs(dVar.c - f4);
        }
        if (f2 <= f3 * 0.05f) {
            return true;
        }
        return false;
    }

    public final void g(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
