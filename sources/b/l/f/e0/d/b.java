package b.l.f.e0.d;

import b.l.f.t;
import java.util.ArrayList;
import java.util.List;

public final class b {
    public final b.l.f.y.b a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f5734b = new ArrayList(5);
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5735e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5736g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f5737h;

    /* renamed from: i  reason: collision with root package name */
    public final t f5738i;

    public b(b.l.f.y.b bVar, int i2, int i3, int i4, int i5, float f2, t tVar) {
        this.a = bVar;
        this.c = i2;
        this.d = i3;
        this.f5735e = i4;
        this.f = i5;
        this.f5736g = f2;
        this.f5737h = new int[3];
        this.f5738i = tVar;
    }

    public static float a(int[] iArr, int i2) {
        return ((float) (i2 - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    public final boolean b(int[] iArr) {
        float f2 = this.f5736g;
        float f3 = f2 / 2.0f;
        for (int i2 = 0; i2 < 3; i2++) {
            if (Math.abs(f2 - ((float) iArr[i2])) >= f3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.f.e0.d.a c(int[] r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 0
            r1 = r13[r0]
            r2 = 1
            r3 = r13[r2]
            int r1 = r1 + r3
            r3 = 2
            r4 = r13[r3]
            int r1 = r1 + r4
            float r15 = a(r13, r15)
            int r4 = (int) r15
            r5 = r13[r2]
            int r5 = r5 * r3
            b.l.f.y.b r6 = r12.a
            int r7 = r6.f5812i
            int[] r8 = r12.f5737h
            r8[r0] = r0
            r8[r2] = r0
            r8[r3] = r0
            r9 = r14
        L_0x0020:
            if (r9 < 0) goto L_0x0034
            boolean r10 = r6.b(r4, r9)
            if (r10 == 0) goto L_0x0034
            r10 = r8[r2]
            if (r10 > r5) goto L_0x0034
            r10 = r8[r2]
            int r10 = r10 + r2
            r8[r2] = r10
            int r9 = r9 + -1
            goto L_0x0020
        L_0x0034:
            r10 = 2143289344(0x7fc00000, float:NaN)
            if (r9 < 0) goto L_0x00a9
            r11 = r8[r2]
            if (r11 <= r5) goto L_0x003e
            goto L_0x00a9
        L_0x003e:
            if (r9 < 0) goto L_0x0052
            boolean r11 = r6.b(r4, r9)
            if (r11 != 0) goto L_0x0052
            r11 = r8[r0]
            if (r11 > r5) goto L_0x0052
            r11 = r8[r0]
            int r11 = r11 + r2
            r8[r0] = r11
            int r9 = r9 + -1
            goto L_0x003e
        L_0x0052:
            r9 = r8[r0]
            if (r9 <= r5) goto L_0x0057
            goto L_0x00a9
        L_0x0057:
            int r14 = r14 + r2
        L_0x0058:
            if (r14 >= r7) goto L_0x006c
            boolean r9 = r6.b(r4, r14)
            if (r9 == 0) goto L_0x006c
            r9 = r8[r2]
            if (r9 > r5) goto L_0x006c
            r9 = r8[r2]
            int r9 = r9 + r2
            r8[r2] = r9
            int r14 = r14 + 1
            goto L_0x0058
        L_0x006c:
            if (r14 == r7) goto L_0x00a9
            r9 = r8[r2]
            if (r9 <= r5) goto L_0x0073
            goto L_0x00a9
        L_0x0073:
            if (r14 >= r7) goto L_0x0087
            boolean r9 = r6.b(r4, r14)
            if (r9 != 0) goto L_0x0087
            r9 = r8[r3]
            if (r9 > r5) goto L_0x0087
            r9 = r8[r3]
            int r9 = r9 + r2
            r8[r3] = r9
            int r14 = r14 + 1
            goto L_0x0073
        L_0x0087:
            r4 = r8[r3]
            if (r4 <= r5) goto L_0x008c
            goto L_0x00a9
        L_0x008c:
            r4 = r8[r0]
            r5 = r8[r2]
            int r4 = r4 + r5
            r5 = r8[r3]
            int r4 = r4 + r5
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            int r4 = r4 * 5
            int r1 = r1 * r3
            if (r4 < r1) goto L_0x009f
            goto L_0x00a9
        L_0x009f:
            boolean r1 = r12.b(r8)
            if (r1 == 0) goto L_0x00a9
            float r10 = a(r8, r14)
        L_0x00a9:
            boolean r14 = java.lang.Float.isNaN(r10)
            if (r14 != 0) goto L_0x0123
            r14 = r13[r0]
            r1 = r13[r2]
            int r14 = r14 + r1
            r13 = r13[r3]
            int r14 = r14 + r13
            float r13 = (float) r14
            r14 = 1077936128(0x40400000, float:3.0)
            float r13 = r13 / r14
            java.util.List<b.l.f.e0.d.a> r14 = r12.f5734b
            java.util.Iterator r14 = r14.iterator()
        L_0x00c1:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0112
            java.lang.Object r1 = r14.next()
            b.l.f.e0.d.a r1 = (b.l.f.e0.d.a) r1
            float r3 = r1.f5775b
            float r3 = r10 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x00fb
            float r3 = r1.a
            float r3 = r15 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x00fb
            float r3 = r1.c
            float r3 = r13 - r3
            float r3 = java.lang.Math.abs(r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f9
            float r4 = r1.c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x00fb
        L_0x00f9:
            r3 = r2
            goto L_0x00fc
        L_0x00fb:
            r3 = r0
        L_0x00fc:
            if (r3 == 0) goto L_0x00c1
            float r14 = r1.a
            float r14 = r14 + r15
            r15 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r15
            float r0 = r1.f5775b
            float r0 = r0 + r10
            float r0 = r0 / r15
            float r1 = r1.c
            float r1 = r1 + r13
            float r1 = r1 / r15
            b.l.f.e0.d.a r13 = new b.l.f.e0.d.a
            r13.<init>(r14, r0, r1)
            return r13
        L_0x0112:
            b.l.f.e0.d.a r14 = new b.l.f.e0.d.a
            r14.<init>(r15, r10, r13)
            java.util.List<b.l.f.e0.d.a> r13 = r12.f5734b
            r13.add(r14)
            b.l.f.t r13 = r12.f5738i
            if (r13 == 0) goto L_0x0123
            r13.a(r14)
        L_0x0123:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.e0.d.b.c(int[], int, int):b.l.f.e0.d.a");
    }
}
