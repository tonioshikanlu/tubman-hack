package b.l.f.c0.c0;

import b.l.f.m;
import b.l.f.q;
import b.l.f.s;
import b.l.f.t;
import b.l.f.y.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f5597i = {1, 10, 34, 70, 126};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f5598j = {4, 20, 48, 81};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f5599k = {0, 161, 961, 2015, 2715};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f5600l = {0, 336, 1036, 1516};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f5601m = {8, 6, 4, 3, 1};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f5602n = {2, 4, 6, 8};

    /* renamed from: o  reason: collision with root package name */
    public static final int[][] f5603o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g  reason: collision with root package name */
    public final List<d> f5604g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<d> f5605h = new ArrayList();

    public static void m(Collection<d> collection, d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (next.a == dVar.a) {
                    next.d++;
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    public void c() {
        this.f5604g.clear();
        this.f5605h.clear();
    }

    public q d(int i2, a aVar, Map<b.l.f.e, ?> map) {
        m(this.f5604g, o(aVar, false, i2, map));
        aVar.k();
        m(this.f5605h, o(aVar, true, i2, map));
        aVar.k();
        for (d next : this.f5604g) {
            if (next.d > 1) {
                for (d next2 : this.f5605h) {
                    if (next2.d > 1) {
                        int i3 = ((next2.f5595b * 16) + next.f5595b) % 79;
                        int i4 = (next.c.a * 9) + next2.c.a;
                        if (i4 > 72) {
                            i4--;
                        }
                        if (i4 > 8) {
                            i4--;
                        }
                        if (i3 == i4) {
                            String valueOf = String.valueOf((((long) next.a) * 4537077) + ((long) next2.a));
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(valueOf);
                            int i5 = 0;
                            for (int i6 = 0; i6 < 13; i6++) {
                                int charAt = sb.charAt(i6) - '0';
                                if ((i6 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i5 += charAt;
                            }
                            int i7 = 10 - (i5 % 10);
                            if (i7 == 10) {
                                i7 = 0;
                            }
                            sb.append(i7);
                            s[] sVarArr = next.c.c;
                            s[] sVarArr2 = next2.c.c;
                            return new q(sb.toString(), (byte[]) null, new s[]{sVarArr[0], sVarArr[1], sVarArr2[0], sVarArr2[1]}, b.l.f.a.RSS_14);
                        }
                    }
                }
                continue;
            }
        }
        throw m.f5759j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        if (r4 < 4) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r4 < 4) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r15 = false;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r14 = false;
        r15 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.f.c0.c0.b n(b.l.f.y.a r18, b.l.f.c0.c0.c r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int[] r4 = r0.f5593b
            r5 = 0
            r6 = r5
        L_0x000c:
            int r7 = r4.length
            if (r6 >= r7) goto L_0x0014
            r4[r6] = r5
            int r6 = r6 + 1
            goto L_0x000c
        L_0x0014:
            r6 = 1
            if (r3 == 0) goto L_0x001f
            int[] r2 = r2.f5596b
            r2 = r2[r5]
            b.l.f.c0.r.h(r1, r2, r4)
            goto L_0x0039
        L_0x001f:
            int[] r2 = r2.f5596b
            r2 = r2[r6]
            int r2 = r2 + r6
            b.l.f.c0.r.g(r1, r2, r4)
            int r1 = r4.length
            int r1 = r1 - r6
            r2 = r5
        L_0x002a:
            if (r2 >= r1) goto L_0x0039
            r7 = r4[r2]
            r8 = r4[r1]
            r4[r2] = r8
            r4[r1] = r7
            int r2 = r2 + 1
            int r1 = r1 + -1
            goto L_0x002a
        L_0x0039:
            if (r3 == 0) goto L_0x003e
            r1 = 16
            goto L_0x0040
        L_0x003e:
            r1 = 15
        L_0x0040:
            int r2 = b.l.f.x.a.g.o0(r4)
            float r2 = (float) r2
            float r7 = (float) r1
            float r2 = r2 / r7
            int[] r7 = r0.f5594e
            int[] r8 = r0.f
            float[] r9 = r0.c
            float[] r10 = r0.d
            r11 = r5
        L_0x0050:
            int r12 = r4.length
            if (r11 >= r12) goto L_0x007a
            r12 = r4[r11]
            float r12 = (float) r12
            float r12 = r12 / r2
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r12
            int r13 = (int) r13
            r14 = 8
            if (r13 > 0) goto L_0x0061
            r13 = r6
            goto L_0x0064
        L_0x0061:
            if (r13 <= r14) goto L_0x0064
            r13 = r14
        L_0x0064:
            int r14 = r11 / 2
            r15 = r11 & 1
            if (r15 != 0) goto L_0x0071
            r7[r14] = r13
            float r13 = (float) r13
            float r12 = r12 - r13
            r9[r14] = r12
            goto L_0x0077
        L_0x0071:
            r8[r14] = r13
            float r13 = (float) r13
            float r12 = r12 - r13
            r10[r14] = r12
        L_0x0077:
            int r11 = r11 + 1
            goto L_0x0050
        L_0x007a:
            int[] r2 = r0.f5594e
            int r2 = b.l.f.x.a.g.o0(r2)
            int[] r4 = r0.f
            int r4 = b.l.f.x.a.g.o0(r4)
            r9 = 12
            r10 = 4
            r11 = 10
            if (r3 == 0) goto L_0x009e
            if (r2 <= r9) goto L_0x0092
            r13 = r5
            r12 = r6
            goto L_0x0098
        L_0x0092:
            r12 = r5
            if (r2 >= r10) goto L_0x0097
            r13 = r6
            goto L_0x0098
        L_0x0097:
            r13 = r12
        L_0x0098:
            if (r4 <= r9) goto L_0x009b
            goto L_0x00af
        L_0x009b:
            if (r4 >= r10) goto L_0x00b7
            goto L_0x00b4
        L_0x009e:
            r12 = 11
            if (r2 <= r12) goto L_0x00a5
            r13 = r5
            r12 = r6
            goto L_0x00ad
        L_0x00a5:
            r12 = 5
            if (r2 >= r12) goto L_0x00ab
            r12 = r5
            r13 = r6
            goto L_0x00ad
        L_0x00ab:
            r12 = r5
            r13 = r12
        L_0x00ad:
            if (r4 <= r11) goto L_0x00b2
        L_0x00af:
            r14 = r5
            r15 = r6
            goto L_0x00b9
        L_0x00b2:
            if (r4 >= r10) goto L_0x00b7
        L_0x00b4:
            r15 = r5
            r14 = r6
            goto L_0x00b9
        L_0x00b7:
            r14 = r5
            r15 = r14
        L_0x00b9:
            int r16 = r2 + r4
            int r1 = r16 - r1
            r11 = r2 & 1
            if (r11 != r3) goto L_0x00c3
            r11 = r6
            goto L_0x00c4
        L_0x00c3:
            r11 = r5
        L_0x00c4:
            r5 = r4 & 1
            if (r5 != r6) goto L_0x00ca
            r5 = r6
            goto L_0x00cb
        L_0x00ca:
            r5 = 0
        L_0x00cb:
            r10 = -1
            if (r1 == r10) goto L_0x00fa
            if (r1 == 0) goto L_0x00e5
            if (r1 != r6) goto L_0x00e2
            if (r11 == 0) goto L_0x00db
            if (r5 != 0) goto L_0x00d8
            r12 = r6
            goto L_0x0106
        L_0x00d8:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00db:
            if (r5 == 0) goto L_0x00df
            r15 = r6
            goto L_0x0106
        L_0x00df:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00e2:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00e5:
            if (r11 == 0) goto L_0x00f4
            if (r5 == 0) goto L_0x00f1
            if (r2 >= r4) goto L_0x00ee
            r13 = r6
            r15 = r13
            goto L_0x0106
        L_0x00ee:
            r12 = r6
            r14 = r12
            goto L_0x0106
        L_0x00f1:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00f4:
            if (r5 != 0) goto L_0x00f7
            goto L_0x0106
        L_0x00f7:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x00fa:
            if (r11 == 0) goto L_0x0103
            if (r5 != 0) goto L_0x0100
            r13 = r6
            goto L_0x0106
        L_0x0100:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x0103:
            if (r5 == 0) goto L_0x01be
            r14 = r6
        L_0x0106:
            if (r13 == 0) goto L_0x0115
            if (r12 != 0) goto L_0x0112
            int[] r1 = r0.f5594e
            float[] r2 = r0.c
            b.l.f.c0.c0.a.j(r1, r2)
            goto L_0x0115
        L_0x0112:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x0115:
            if (r12 == 0) goto L_0x011e
            int[] r1 = r0.f5594e
            float[] r2 = r0.c
            b.l.f.c0.c0.a.i(r1, r2)
        L_0x011e:
            if (r14 == 0) goto L_0x012d
            if (r15 != 0) goto L_0x012a
            int[] r1 = r0.f
            float[] r2 = r0.c
            b.l.f.c0.c0.a.j(r1, r2)
            goto L_0x012d
        L_0x012a:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x012d:
            if (r15 == 0) goto L_0x0136
            int[] r1 = r0.f
            float[] r2 = r0.d
            b.l.f.c0.c0.a.i(r1, r2)
        L_0x0136:
            int r1 = r7.length
            int r1 = r1 - r6
            r2 = 0
            r4 = 0
        L_0x013a:
            if (r1 < 0) goto L_0x0147
            int r2 = r2 * 9
            r5 = r7[r1]
            int r2 = r2 + r5
            r5 = r7[r1]
            int r4 = r4 + r5
            int r1 = r1 + -1
            goto L_0x013a
        L_0x0147:
            int r1 = r8.length
            int r1 = r1 - r6
            r5 = 0
            r10 = 0
        L_0x014b:
            if (r1 < 0) goto L_0x0158
            int r5 = r5 * 9
            r11 = r8[r1]
            int r5 = r5 + r11
            r11 = r8[r1]
            int r10 = r10 + r11
            int r1 = r1 + -1
            goto L_0x014b
        L_0x0158:
            int r5 = r5 * 3
            int r5 = r5 + r2
            if (r3 == 0) goto L_0x018c
            r1 = r4 & 1
            if (r1 != 0) goto L_0x0189
            if (r4 > r9) goto L_0x0189
            r1 = 4
            if (r4 < r1) goto L_0x0189
            int r9 = r9 - r4
            int r9 = r9 / 2
            int[] r1 = f5601m
            r1 = r1[r9]
            int r2 = 9 - r1
            r3 = 0
            int r1 = b.l.f.x.a.g.z(r7, r1, r3)
            int r2 = b.l.f.x.a.g.z(r8, r2, r6)
            int[] r3 = f5597i
            r3 = r3[r9]
            int[] r4 = f5599k
            r4 = r4[r9]
            b.l.f.c0.c0.b r6 = new b.l.f.c0.c0.b
            int r1 = r1 * r3
            int r1 = r1 + r2
            int r1 = r1 + r4
            r6.<init>(r1, r5)
            return r6
        L_0x0189:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x018c:
            r1 = r10 & 1
            if (r1 != 0) goto L_0x01bb
            r1 = 10
            if (r10 > r1) goto L_0x01bb
            r2 = 4
            if (r10 < r2) goto L_0x01bb
            int r11 = 10 - r10
            int r11 = r11 / 2
            int[] r1 = f5602n
            r1 = r1[r11]
            int r2 = 9 - r1
            int r1 = b.l.f.x.a.g.z(r7, r1, r6)
            r3 = 0
            int r2 = b.l.f.x.a.g.z(r8, r2, r3)
            int[] r3 = f5598j
            r3 = r3[r11]
            int[] r4 = f5600l
            r4 = r4[r11]
            b.l.f.c0.c0.b r6 = new b.l.f.c0.c0.b
            int r2 = r2 * r3
            int r2 = r2 + r1
            int r2 = r2 + r4
            r6.<init>(r2, r5)
            return r6
        L_0x01bb:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        L_0x01be:
            b.l.f.m r1 = b.l.f.m.f5759j
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.c0.e.n(b.l.f.y.a, b.l.f.c0.c0.c, boolean):b.l.f.c0.c0.b");
    }

    public final d o(a aVar, boolean z, int i2, Map<b.l.f.e, ?> map) {
        try {
            int[] p2 = p(aVar, z);
            c q2 = q(aVar, i2, z, p2);
            t tVar = map == null ? null : (t) map.get(b.l.f.e.NEED_RESULT_POINT_CALLBACK);
            if (tVar != null) {
                float f = ((float) (p2[0] + p2[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.f5810i - 1)) - f;
                }
                tVar.a(new s(f, (float) i2));
            }
            b n2 = n(aVar, q2, true);
            b n3 = n(aVar, q2, false);
            return new d((n2.a * 1597) + n3.a, (n3.f5595b * 4) + n2.f5595b, q2);
        } catch (m unused) {
            return null;
        }
    }

    public final int[] p(a aVar, boolean z) {
        int[] iArr = this.a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i2 = aVar.f5810i;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            z2 = !aVar.f(i3);
            if (z == z2) {
                break;
            }
            i3++;
        }
        int i4 = 0;
        int i5 = i3;
        while (i3 < i2) {
            if (aVar.f(i3) != z2) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else if (a.k(iArr)) {
                    return new int[]{i5, i3};
                } else {
                    i5 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z2 = !z2;
            }
            i3++;
        }
        throw m.f5759j;
    }

    public final c q(a aVar, int i2, boolean z, int[] iArr) {
        int i3;
        int i4;
        boolean f = aVar.f(iArr[0]);
        int i5 = iArr[0] - 1;
        while (i5 >= 0 && f != aVar.f(i5)) {
            i5--;
        }
        int i6 = i5 + 1;
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = iArr[0] - i6;
        int l2 = a.l(iArr2, f5603o);
        int i7 = iArr[1];
        if (z) {
            int i8 = aVar.f5810i;
            i3 = (i8 - 1) - i7;
            i4 = (i8 - 1) - i6;
        } else {
            i3 = i7;
            i4 = i6;
        }
        return new c(l2, new int[]{i6, iArr[1]}, i4, i3, i2);
    }
}
