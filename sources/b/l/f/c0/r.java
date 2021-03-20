package b.l.f.c0;

import b.l.f.c;
import b.l.f.e;
import b.l.f.j;
import b.l.f.m;
import b.l.f.o;
import b.l.f.q;
import b.l.f.s;
import b.l.f.y.a;
import b.l.f.y.h;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public abstract class r implements o {
    public static float f(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i2 += iArr[i4];
            i3 += iArr2[i4];
        }
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i2;
        float f3 = f2 / ((float) i3);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            float f6 = ((float) iArr2[i5]) * f3;
            float f7 = (float) i6;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void g(a aVar, int i2, int[] iArr) {
        int length = iArr.length;
        int i3 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i4 = aVar.f5810i;
        if (i2 < i4) {
            boolean z = !aVar.f(i2);
            while (i2 < i4) {
                if (aVar.f(i2) == z) {
                    i3++;
                    if (i3 == length) {
                        break;
                    }
                    iArr[i3] = 1;
                    z = !z;
                } else {
                    iArr[i3] = iArr[i3] + 1;
                }
                i2++;
            }
            if (i3 == length) {
                return;
            }
            if (i3 != length - 1 || i2 != i4) {
                throw m.f5759j;
            }
            return;
        }
        throw m.f5759j;
    }

    public static void h(a aVar, int i2, int[] iArr) {
        int length = iArr.length;
        boolean f = aVar.f(i2);
        while (i2 > 0 && length >= 0) {
            i2--;
            if (aVar.f(i2) != f) {
                length--;
                f = !f;
            }
        }
        if (length < 0) {
            g(aVar, i2 + 1, iArr);
            return;
        }
        throw m.f5759j;
    }

    public q a(c cVar, Map<e, ?> map) {
        b.l.f.r rVar = b.l.f.r.ORIENTATION;
        try {
            return e(cVar, map);
        } catch (m e2) {
            if (!(map != null && map.containsKey(e.TRY_HARDER)) || !cVar.a.a.d()) {
                throw e2;
            }
            j e3 = cVar.a.a.e();
            Objects.requireNonNull((h) cVar.a);
            c cVar2 = new c(new h(e3));
            q e4 = e(cVar2, map);
            Map<b.l.f.r, Object> map2 = e4.f5764e;
            int i2 = 270;
            if (map2 != null && map2.containsKey(rVar)) {
                i2 = (((Integer) map2.get(rVar)).intValue() + 270) % 360;
            }
            e4.b(rVar, Integer.valueOf(i2));
            s[] sVarArr = e4.c;
            if (sVarArr != null) {
                int i3 = cVar2.a.a.f5757b;
                for (int i4 = 0; i4 < sVarArr.length; i4++) {
                    sVarArr[i4] = new s((((float) i3) - sVarArr[i4].f5775b) - 1.0f, sVarArr[i4].a);
                }
            }
            return e4;
        }
    }

    public q b(c cVar) {
        return a(cVar, (Map<e, ?>) null);
    }

    public void c() {
    }

    public abstract q d(int i2, a aVar, Map<e, ?> map);

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c A[Catch:{ p -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00bf A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.f.q e(b.l.f.c r20, java.util.Map<b.l.f.e, ?> r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            b.l.f.b r2 = r0.a
            b.l.f.j r2 = r2.a
            int r3 = r2.a
            int r2 = r2.f5757b
            b.l.f.y.a r4 = new b.l.f.y.a
            r4.<init>(r3)
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x001f
            b.l.f.e r7 = b.l.f.e.TRY_HARDER
            boolean r7 = r1.containsKey(r7)
            if (r7 == 0) goto L_0x001f
            r7 = r5
            goto L_0x0020
        L_0x001f:
            r7 = r6
        L_0x0020:
            if (r7 == 0) goto L_0x0025
            r8 = 8
            goto L_0x0026
        L_0x0025:
            r8 = 5
        L_0x0026:
            int r8 = r2 >> r8
            int r8 = java.lang.Math.max(r5, r8)
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = 15
        L_0x0032:
            int r9 = r2 / 2
            r10 = r6
        L_0x0035:
            if (r10 >= r7) goto L_0x00dc
            int r11 = r10 + 1
            int r12 = r11 / 2
            r10 = r10 & 1
            if (r10 != 0) goto L_0x0041
            r10 = r5
            goto L_0x0042
        L_0x0041:
            r10 = r6
        L_0x0042:
            if (r10 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            int r12 = -r12
        L_0x0046:
            int r12 = r12 * r8
            int r12 = r12 + r9
            if (r12 < 0) goto L_0x00dc
            if (r12 >= r2) goto L_0x00dc
            b.l.f.y.a r4 = r0.b(r12, r4)     // Catch:{ m -> 0x00cf }
            r10 = r6
        L_0x0051:
            r13 = 2
            if (r10 >= r13) goto L_0x00cf
            if (r10 != r5) goto L_0x0074
            r4.k()
            if (r1 == 0) goto L_0x0074
            b.l.f.e r13 = b.l.f.e.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r1.containsKey(r13)
            if (r14 == 0) goto L_0x0074
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<b.l.f.e> r15 = b.l.f.e.class
            r14.<init>(r15)
            r14.putAll(r1)
            r14.remove(r13)
            r13 = r19
            r1 = r14
            goto L_0x0076
        L_0x0074:
            r13 = r19
        L_0x0076:
            b.l.f.q r14 = r13.d(r12, r4, r1)     // Catch:{ p -> 0x00c0 }
            if (r10 != r5) goto L_0x00bf
            b.l.f.r r15 = b.l.f.r.ORIENTATION     // Catch:{ p -> 0x00c0 }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ p -> 0x00b9 }
            r14.b(r15, r5)     // Catch:{ p -> 0x00b9 }
            b.l.f.s[] r5 = r14.c     // Catch:{ p -> 0x00b9 }
            if (r5 == 0) goto L_0x00bf
            b.l.f.s r15 = new b.l.f.s     // Catch:{ p -> 0x00b9 }
            float r0 = (float) r3
            r16 = r1
            r1 = r5[r6]     // Catch:{ p -> 0x00bb }
            float r1 = r1.a     // Catch:{ p -> 0x00bb }
            float r1 = r0 - r1
            r17 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r17
            r18 = r2
            r2 = r5[r6]     // Catch:{ p -> 0x00bd }
            float r2 = r2.f5775b     // Catch:{ p -> 0x00bd }
            r15.<init>(r1, r2)     // Catch:{ p -> 0x00bd }
            r5[r6] = r15     // Catch:{ p -> 0x00bd }
            b.l.f.s r1 = new b.l.f.s     // Catch:{ p -> 0x00bd }
            r2 = 1
            r15 = r5[r2]     // Catch:{ p -> 0x00c5 }
            float r15 = r15.a     // Catch:{ p -> 0x00c5 }
            float r0 = r0 - r15
            float r0 = r0 - r17
            r15 = r5[r2]     // Catch:{ p -> 0x00c5 }
            float r15 = r15.f5775b     // Catch:{ p -> 0x00c5 }
            r1.<init>(r0, r15)     // Catch:{ p -> 0x00c5 }
            r5[r2] = r1     // Catch:{ p -> 0x00c5 }
            goto L_0x00bf
        L_0x00b9:
            r16 = r1
        L_0x00bb:
            r18 = r2
        L_0x00bd:
            r2 = 1
            goto L_0x00c5
        L_0x00bf:
            return r14
        L_0x00c0:
            r16 = r1
            r18 = r2
            r2 = r5
        L_0x00c5:
            int r10 = r10 + 1
            r0 = r20
            r5 = r2
            r1 = r16
            r2 = r18
            goto L_0x0051
        L_0x00cf:
            r13 = r19
            r18 = r2
            r2 = r5
            r0 = r20
            r5 = r2
            r10 = r11
            r2 = r18
            goto L_0x0035
        L_0x00dc:
            r13 = r19
            b.l.f.m r0 = b.l.f.m.f5759j
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.r.e(b.l.f.c, java.util.Map):b.l.f.q");
    }
}
