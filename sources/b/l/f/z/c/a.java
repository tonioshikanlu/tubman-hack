package b.l.f.z.c;

import b.l.f.h;
import b.l.f.y.b;

public final class a {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5856b;
    public final e c;

    public a(b bVar) {
        int i2;
        b bVar2 = bVar;
        int i3 = bVar2.f5812i;
        if (i3 < 8 || i3 > 144 || (i3 & 1) != 0) {
            throw h.a();
        }
        int i4 = bVar2.f5811h;
        e[] eVarArr = e.f5868h;
        if ((i3 & 1) == 0 && (i4 & 1) == 0) {
            for (e eVar : e.f5868h) {
                int i5 = eVar.f5869b;
                if (i5 == i3 && (i2 = eVar.c) == i4) {
                    this.c = eVar;
                    if (bVar2.f5812i == i5) {
                        int i6 = eVar.d;
                        int i7 = eVar.f5870e;
                        int i8 = i5 / i6;
                        int i9 = i2 / i7;
                        b bVar3 = new b(i9 * i7, i8 * i6);
                        for (int i10 = 0; i10 < i8; i10++) {
                            int i11 = i10 * i6;
                            for (int i12 = 0; i12 < i9; i12++) {
                                int i13 = i12 * i7;
                                for (int i14 = 0; i14 < i6; i14++) {
                                    int i15 = ((i6 + 2) * i10) + 1 + i14;
                                    int i16 = i11 + i14;
                                    for (int i17 = 0; i17 < i7; i17++) {
                                        if (bVar2.b(((i7 + 2) * i12) + 1 + i17, i15)) {
                                            bVar3.g(i13 + i17, i16);
                                        }
                                    }
                                }
                            }
                        }
                        this.a = bVar3;
                        this.f5856b = new b(bVar3.f5811h, bVar3.f5812i);
                        return;
                    }
                    throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                }
            }
            throw h.a();
        }
        throw h.a();
    }

    public final boolean a(int i2, int i3, int i4, int i5) {
        if (i2 < 0) {
            i2 += i4;
            i3 += 4 - ((i4 + 4) & 7);
        }
        if (i3 < 0) {
            i3 += i5;
            i2 += 4 - ((i5 + 4) & 7);
        }
        this.f5856b.g(i3, i2);
        return this.a.b(i3, i2);
    }

    public final int b(int i2, int i3, int i4, int i5) {
        int i6 = i2 - 2;
        int i7 = i3 - 2;
        int i8 = (a(i6, i7, i4, i5) ? 1 : 0) << true;
        int i9 = i3 - 1;
        if (a(i6, i9, i4, i5)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        int i11 = i2 - 1;
        if (a(i11, i7, i4, i5)) {
            i10 |= 1;
        }
        int i12 = i10 << 1;
        if (a(i11, i9, i4, i5)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (a(i11, i3, i4, i5)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (a(i2, i7, i4, i5)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (a(i2, i9, i4, i5)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        return a(i2, i3, i4, i5) ? i16 | 1 : i16;
    }
}
