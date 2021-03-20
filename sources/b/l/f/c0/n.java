package b.l.f.c0;

import b.l.f.m;
import b.l.f.y.a;

public final class n extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5643b = {6, 8, 10, 12, 14};
    public static final int[] c = {1, 1, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e  reason: collision with root package name */
    public static final int[][] f5644e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    public int a = -1;

    public static int i(int[] iArr) {
        int[][] iArr2 = f5644e;
        int length = iArr2.length;
        float f = 0.38f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float f2 = r.f(iArr, iArr2[i3], 0.5f);
            if (f2 < f) {
                i2 = i3;
                f = f2;
            } else if (f2 == f) {
                i2 = -1;
            }
        }
        if (i2 >= 0) {
            return i2 % 10;
        }
        throw m.f5759j;
    }

    public static int[] j(a aVar, int i2, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i3 = aVar.f5810i;
        int i4 = i2;
        boolean z = false;
        int i5 = 0;
        while (i2 < i3) {
            if (aVar.f(i2) != z) {
                iArr2[i5] = iArr2[i5] + 1;
            } else {
                if (i5 != length - 1) {
                    i5++;
                } else if (r.f(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i4, i2};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    int i6 = i5 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i6);
                    iArr2[i6] = 0;
                    iArr2[i5] = 0;
                    i5 = i6;
                }
                iArr2[i5] = 1;
                z = !z;
            }
            i2++;
        }
        throw m.f5759j;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r6 = j(r2, r8, r6[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.q d(int r19, b.l.f.y.a r20, java.util.Map<b.l.f.e, ?> r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            r0 = r21
            int r3 = r2.f5810i
            r4 = 0
            int r5 = r2.g(r4)
            if (r5 == r3) goto L_0x00fd
            int[] r3 = c
            int[] r3 = j(r2, r5, r3)
            r5 = 1
            r6 = r3[r5]
            r7 = r3[r4]
            int r6 = r6 - r7
            int r6 = r6 / 4
            r1.a = r6
            r6 = r3[r4]
            r1.k(r2, r6)
            int[][] r6 = d
            r20.k()
            int r7 = r2.f5810i     // Catch:{ all -> 0x00f8 }
            int r8 = r2.g(r4)     // Catch:{ all -> 0x00f8 }
            if (r8 == r7) goto L_0x00f5
            r7 = r6[r4]     // Catch:{ m -> 0x0038 }
            int[] r6 = j(r2, r8, r7)     // Catch:{ m -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r6 = r6[r5]     // Catch:{ all -> 0x00f8 }
            int[] r6 = j(r2, r8, r6)     // Catch:{ all -> 0x00f8 }
        L_0x003e:
            r7 = r6[r4]     // Catch:{ all -> 0x00f8 }
            r1.k(r2, r7)     // Catch:{ all -> 0x00f8 }
            r7 = r6[r4]     // Catch:{ all -> 0x00f8 }
            int r8 = r2.f5810i     // Catch:{ all -> 0x00f8 }
            r9 = r6[r5]     // Catch:{ all -> 0x00f8 }
            int r9 = r8 - r9
            r6[r4] = r9     // Catch:{ all -> 0x00f8 }
            int r8 = r8 - r7
            r6[r5] = r8     // Catch:{ all -> 0x00f8 }
            r20.k()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 20
            r7.<init>(r8)
            r8 = r3[r5]
            r9 = r6[r4]
            r10 = 10
            int[] r11 = new int[r10]
            r12 = 5
            int[] r13 = new int[r12]
            int[] r14 = new int[r12]
        L_0x0067:
            if (r8 >= r9) goto L_0x009c
            b.l.f.c0.r.g(r2, r8, r11)
            r15 = r4
        L_0x006d:
            if (r15 >= r12) goto L_0x007e
            int r16 = r15 * 2
            r17 = r11[r16]
            r13[r15] = r17
            int r16 = r16 + 1
            r16 = r11[r16]
            r14[r15] = r16
            int r15 = r15 + 1
            goto L_0x006d
        L_0x007e:
            int r15 = i(r13)
            int r15 = r15 + 48
            char r15 = (char) r15
            r7.append(r15)
            int r15 = i(r14)
            int r15 = r15 + 48
            char r15 = (char) r15
            r7.append(r15)
            r15 = r4
        L_0x0093:
            if (r15 >= r10) goto L_0x0067
            r16 = r11[r15]
            int r8 = r8 + r16
            int r15 = r15 + 1
            goto L_0x0093
        L_0x009c:
            java.lang.String r2 = r7.toString()
            r7 = 0
            if (r0 == 0) goto L_0x00ac
            b.l.f.e r8 = b.l.f.e.ALLOWED_LENGTHS
            java.lang.Object r0 = r0.get(r8)
            int[] r0 = (int[]) r0
            goto L_0x00ad
        L_0x00ac:
            r0 = r7
        L_0x00ad:
            if (r0 != 0) goto L_0x00b1
            int[] r0 = f5643b
        L_0x00b1:
            int r8 = r2.length()
            int r9 = r0.length
            r10 = r4
            r11 = r10
        L_0x00b8:
            if (r10 >= r9) goto L_0x00c6
            r12 = r0[r10]
            if (r8 != r12) goto L_0x00c0
            r0 = r5
            goto L_0x00c7
        L_0x00c0:
            if (r12 <= r11) goto L_0x00c3
            r11 = r12
        L_0x00c3:
            int r10 = r10 + 1
            goto L_0x00b8
        L_0x00c6:
            r0 = r4
        L_0x00c7:
            if (r0 != 0) goto L_0x00cc
            if (r8 <= r11) goto L_0x00cc
            r0 = r5
        L_0x00cc:
            if (r0 == 0) goto L_0x00f0
            b.l.f.q r0 = new b.l.f.q
            r8 = 2
            b.l.f.s[] r8 = new b.l.f.s[r8]
            b.l.f.s r9 = new b.l.f.s
            r3 = r3[r5]
            float r3 = (float) r3
            r10 = r19
            float r10 = (float) r10
            r9.<init>(r3, r10)
            r8[r4] = r9
            b.l.f.s r3 = new b.l.f.s
            r4 = r6[r4]
            float r4 = (float) r4
            r3.<init>(r4, r10)
            r8[r5] = r3
            b.l.f.a r3 = b.l.f.a.ITF
            r0.<init>(r2, r7, r8, r3)
            return r0
        L_0x00f0:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x00f5:
            b.l.f.m r0 = b.l.f.m.f5759j     // Catch:{ all -> 0x00f8 }
            throw r0     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            r20.k()
            throw r0
        L_0x00fd:
            b.l.f.m r0 = b.l.f.m.f5759j
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.n.d(int, b.l.f.y.a, java.util.Map):b.l.f.q");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(b.l.f.y.a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 10
            if (r0 >= r4) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r0 = r4
        L_0x0008:
            int r4 = r4 + -1
            if (r0 <= 0) goto L_0x0017
            if (r4 < 0) goto L_0x0017
            boolean r1 = r3.f(r4)
            if (r1 != 0) goto L_0x0017
            int r0 = r0 + -1
            goto L_0x0008
        L_0x0017:
            if (r0 != 0) goto L_0x001a
            return
        L_0x001a:
            b.l.f.m r3 = b.l.f.m.f5759j
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.n.k(b.l.f.y.a, int):void");
    }
}
