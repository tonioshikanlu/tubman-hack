package b.l.f.w.f;

import b.l.f.y.a;
import b.l.f.y.l.d;

public final class b {
    public static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(b.l.f.y.b bVar, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = i2 - i4;
            int i6 = i5;
            while (true) {
                int i7 = i2 + i4;
                if (i6 > i7) {
                    break;
                }
                bVar.g(i6, i5);
                bVar.g(i6, i7);
                bVar.g(i5, i6);
                bVar.g(i7, i6);
                i6++;
            }
        }
        int i8 = i2 - i3;
        bVar.g(i8, i8);
        int i9 = i8 + 1;
        bVar.g(i9, i8);
        bVar.g(i8, i9);
        int i10 = i2 + i3;
        bVar.g(i10, i8);
        bVar.g(i10, i9);
        bVar.g(i10, i10 - 1);
    }

    public static a b(a aVar, int i2, int i3) {
        b.l.f.y.l.a aVar2;
        int i4 = aVar.f5810i / i3;
        if (i3 == 4) {
            aVar2 = b.l.f.y.l.a.f5845k;
        } else if (i3 == 6) {
            aVar2 = b.l.f.y.l.a.f5844j;
        } else if (i3 == 8) {
            aVar2 = b.l.f.y.l.a.f5848n;
        } else if (i3 == 10) {
            aVar2 = b.l.f.y.l.a.f5843i;
        } else if (i3 == 12) {
            aVar2 = b.l.f.y.l.a.f5842h;
        } else {
            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i3)));
        }
        d dVar = new d(aVar2);
        int i5 = i2 / i3;
        int[] iArr = new int[i5];
        int i6 = aVar.f5810i / i3;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                i8 |= aVar.f((i7 * i3) + i9) ? 1 << ((i3 - i9) - 1) : 0;
            }
            iArr[i7] = i8;
        }
        dVar.a(iArr, i5 - i4);
        a aVar3 = new a();
        aVar3.c(0, i2 % i3);
        for (int i10 = 0; i10 < i5; i10++) {
            aVar3.c(iArr[i10], i3);
        }
        return aVar3;
    }

    public static a c(a aVar, int i2) {
        a aVar2 = new a();
        int i3 = aVar.f5810i;
        int i4 = (1 << i2) - 2;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = i5 + i7;
                if (i8 >= i3 || aVar.f(i8)) {
                    i6 |= 1 << ((i2 - 1) - i7);
                }
            }
            int i9 = i6 & i4;
            if (i9 != i4) {
                if (i9 == 0) {
                    i9 = i6 | 1;
                } else {
                    aVar2.c(i6, i2);
                    i5 += i2;
                }
            }
            aVar2.c(i9, i2);
            i5--;
            i5 += i2;
        }
        return aVar2;
    }
}
