package b.l.f.c0;

import b.l.f.m;
import b.l.f.y.a;

public final class i extends y {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f5639j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i  reason: collision with root package name */
    public final int[] f5640i = new int[4];

    public int m(a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f5640i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i2 = aVar.f5810i;
        int i3 = iArr[1];
        int i4 = 0;
        for (int i5 = 0; i5 < 6 && i3 < i2; i5++) {
            int k2 = y.k(aVar, iArr2, i3, y.f5654h);
            sb.append((char) ((k2 % 10) + 48));
            for (int i6 : iArr2) {
                i3 += i6;
            }
            if (k2 >= 10) {
                i4 |= 1 << (5 - i5);
            }
        }
        for (int i7 = 0; i7 < 10; i7++) {
            if (i4 == f5639j[i7]) {
                sb.insert(0, (char) (i7 + 48));
                int[] iArr3 = y.f5652e;
                int i8 = y.o(aVar, i3, true, iArr3, new int[iArr3.length])[1];
                for (int i9 = 0; i9 < 6 && i8 < i2; i9++) {
                    sb.append((char) (y.k(aVar, iArr2, i8, y.f5653g) + 48));
                    for (int i10 : iArr2) {
                        i8 += i10;
                    }
                }
                return i8;
            }
        }
        throw m.f5759j;
    }

    public b.l.f.a q() {
        return b.l.f.a.EAN_13;
    }
}
