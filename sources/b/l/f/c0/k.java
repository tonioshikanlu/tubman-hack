package b.l.f.c0;

import b.l.f.y.a;

public final class k extends y {

    /* renamed from: i  reason: collision with root package name */
    public final int[] f5641i = new int[4];

    public int m(a aVar, int[] iArr, StringBuilder sb) {
        int[][] iArr2 = y.f5653g;
        int[] iArr3 = this.f5641i;
        iArr3[0] = 0;
        iArr3[1] = 0;
        iArr3[2] = 0;
        iArr3[3] = 0;
        int i2 = aVar.f5810i;
        int i3 = iArr[1];
        for (int i4 = 0; i4 < 4 && i3 < i2; i4++) {
            sb.append((char) (y.k(aVar, iArr3, i3, iArr2) + 48));
            for (int i5 : iArr3) {
                i3 += i5;
            }
        }
        int[] iArr4 = y.f5652e;
        int i6 = y.o(aVar, i3, true, iArr4, new int[iArr4.length])[1];
        for (int i7 = 0; i7 < 4 && i6 < i2; i7++) {
            sb.append((char) (y.k(aVar, iArr3, i6, iArr2) + 48));
            for (int i8 : iArr3) {
                i6 += i8;
            }
        }
        return i6;
    }

    public b.l.f.a q() {
        return b.l.f.a.EAN_8;
    }
}
