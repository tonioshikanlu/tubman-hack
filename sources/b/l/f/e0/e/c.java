package b.l.f.e0.e;

import b.l.f.e0.c.f;
import b.l.f.e0.c.j;
import b.l.f.v;

public final class c {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static j a(int i2, f fVar) {
        for (int i3 = 1; i3 <= 40; i3++) {
            j d = j.d(i3);
            if (c(i2, d, fVar)) {
                return d;
            }
        }
        throw new v("Data too big");
    }

    public static int b(int i2) {
        int[] iArr = a;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public static boolean c(int i2, j jVar, f fVar) {
        int i3 = jVar.d;
        j.b bVar = jVar.c[fVar.ordinal()];
        return i3 - (bVar.a() * bVar.a) >= (i2 + 7) / 8;
    }
}
