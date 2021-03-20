package b.l.f.d0.f;

import b.l.f.s;
import b.l.f.y.b;
import java.util.Arrays;

public final class a {
    public static final int[] a = {0, 4, 1, 5};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5680b = {6, 2, 7, 3};
    public static final int[] c = {8, 1, 1, 1, 1, 1, 1, 3};
    public static final int[] d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r12 == 0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r1 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if (r1.hasNext() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        r2 = (b.l.f.s[]) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r2[1] == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r10 = (int) java.lang.Math.max((float) r10, r2[1].f5775b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r2[3] == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r10 = java.lang.Math.max(r10, (int) r2[3].f5775b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<b.l.f.s[]> a(boolean r17, b.l.f.y.b r18) {
        /*
            r6 = r18
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 1
            r9 = 0
            r10 = r9
            r11 = r10
        L_0x000b:
            r12 = r11
        L_0x000c:
            int r13 = r6.f5812i
            if (r10 >= r13) goto L_0x00bb
            int r14 = r6.f5811h
            r0 = 8
            b.l.f.s[] r15 = new b.l.f.s[r0]
            int[] r5 = c
            r0 = r18
            r1 = r13
            r2 = r14
            r3 = r10
            r4 = r11
            b.l.f.s[] r0 = c(r0, r1, r2, r3, r4, r5)
            int[] r1 = a
            r2 = r9
        L_0x0025:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0031
            r3 = r1[r2]
            r4 = r0[r2]
            r15[r3] = r4
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0031:
            r16 = 4
            r0 = r15[r16]
            if (r0 == 0) goto L_0x0044
            r0 = r15[r16]
            float r0 = r0.a
            int r0 = (int) r0
            r1 = r15[r16]
            float r1 = r1.f5775b
            int r1 = (int) r1
            r4 = r0
            r3 = r1
            goto L_0x0046
        L_0x0044:
            r3 = r10
            r4 = r11
        L_0x0046:
            int[] r5 = d
            r0 = r18
            r1 = r13
            r2 = r14
            b.l.f.s[] r0 = c(r0, r1, r2, r3, r4, r5)
            int[] r1 = f5680b
            r2 = r9
        L_0x0053:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x005f
            r3 = r1[r2]
            r4 = r0[r2]
            r15[r3] = r4
            int r2 = r2 + 1
            goto L_0x0053
        L_0x005f:
            r0 = r15[r9]
            if (r0 != 0) goto L_0x009c
            r0 = 3
            r1 = r15[r0]
            if (r1 != 0) goto L_0x009c
            if (r12 == 0) goto L_0x00bb
            java.util.Iterator r1 = r7.iterator()
        L_0x006e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r1.next()
            b.l.f.s[] r2 = (b.l.f.s[]) r2
            r3 = r2[r8]
            if (r3 == 0) goto L_0x0088
            float r3 = (float) r10
            r4 = r2[r8]
            float r4 = r4.f5775b
            float r3 = java.lang.Math.max(r3, r4)
            int r10 = (int) r3
        L_0x0088:
            r3 = r2[r0]
            if (r3 == 0) goto L_0x006e
            r2 = r2[r0]
            float r2 = r2.f5775b
            int r2 = (int) r2
            int r2 = java.lang.Math.max(r10, r2)
            r10 = r2
            goto L_0x006e
        L_0x0097:
            int r10 = r10 + 5
            r11 = r9
            goto L_0x000b
        L_0x009c:
            r7.add(r15)
            if (r17 == 0) goto L_0x00bb
            r0 = 2
            r1 = r15[r0]
            if (r1 == 0) goto L_0x00ae
            r1 = r15[r0]
            float r1 = r1.a
            int r11 = (int) r1
            r0 = r15[r0]
            goto L_0x00b5
        L_0x00ae:
            r0 = r15[r16]
            float r0 = r0.a
            int r11 = (int) r0
            r0 = r15[r16]
        L_0x00b5:
            float r0 = r0.f5775b
            int r10 = (int) r0
            r12 = r8
            goto L_0x000c
        L_0x00bb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.d0.f.a.a(boolean, b.l.f.y.b):java.util.List");
    }

    public static int[] b(b bVar, int i2, int i3, int i4, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (bVar.b(i2, i3) && i2 > 0) {
            int i6 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i2--;
            i5 = i6;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i7 = 0;
        int i8 = i2;
        while (i2 < i4) {
            if (bVar.b(i2, i3) != z2) {
                iArr2[i7] = iArr2[i7] + 1;
            } else {
                if (i7 != length - 1) {
                    i7++;
                } else if (d(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i8, i2};
                } else {
                    i8 += iArr2[0] + iArr2[1];
                    int i9 = i7 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i7] = 0;
                    i7 = i9;
                }
                iArr2[i7] = 1;
                z2 = !z2;
            }
            i2++;
        }
        if (i7 != length - 1 || d(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i8, i2 - 1};
    }

    public static s[] c(b bVar, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        s[] sVarArr = new s[4];
        int[] iArr2 = new int[iArr.length];
        int i10 = i4;
        while (true) {
            if (i10 >= i9) {
                z = false;
                break;
            }
            int[] b2 = b(bVar, i5, i10, i3, false, iArr, iArr2);
            if (b2 != null) {
                int i11 = i10;
                int[] iArr3 = b2;
                int i12 = i11;
                while (true) {
                    if (i12 <= 0) {
                        i8 = i12;
                        break;
                    }
                    int i13 = i12 - 1;
                    int[] b3 = b(bVar, i5, i13, i3, false, iArr, iArr2);
                    if (b3 == null) {
                        i8 = i13 + 1;
                        break;
                    }
                    iArr3 = b3;
                    i12 = i13;
                }
                float f = (float) i8;
                sVarArr[0] = new s((float) iArr3[0], f);
                sVarArr[1] = new s((float) iArr3[1], f);
                z = true;
                i10 = i8;
            } else {
                i10 += 5;
            }
        }
        int i14 = i10 + 1;
        if (z) {
            int[] iArr4 = {(int) sVarArr[0].a, (int) sVarArr[1].a};
            int i15 = i14;
            int i16 = 0;
            while (true) {
                if (i15 >= i9) {
                    i6 = i16;
                    i7 = i15;
                    break;
                }
                i6 = i16;
                i7 = i15;
                int[] b4 = b(bVar, iArr4[0], i15, i3, false, iArr, iArr2);
                if (b4 == null || Math.abs(iArr4[0] - b4[0]) >= 5 || Math.abs(iArr4[1] - b4[1]) >= 5) {
                    if (i6 > 25) {
                        break;
                    }
                    i16 = i6 + 1;
                } else {
                    iArr4 = b4;
                    i16 = 0;
                }
                i15 = i7 + 1;
            }
            i14 = i7 - (i6 + 1);
            float f2 = (float) i14;
            sVarArr[2] = new s((float) iArr4[0], f2);
            sVarArr[3] = new s((float) iArr4[1], f2);
        }
        if (i14 - i10 < 10) {
            Arrays.fill(sVarArr, (Object) null);
        }
        return sVarArr;
    }

    public static float d(int[] iArr, int[] iArr2, float f) {
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
}
