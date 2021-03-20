package b.l.f.y.l;

import java.util.Objects;

public final class c {
    public final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    public void a(int[] iArr, int i2) {
        int[] iArr2;
        b bVar = new b(this.a, iArr);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        boolean z = true;
        for (int i4 = 0; i4 < i2; i4++) {
            a aVar = this.a;
            int b2 = bVar.b(aVar.a[aVar.f5852g + i4]);
            iArr3[(i2 - 1) - i4] = b2;
            if (b2 != 0) {
                z = false;
            }
        }
        if (!z) {
            b bVar2 = new b(this.a, iArr3);
            b a2 = this.a.a(i2, 1);
            if (a2.d() < bVar2.d()) {
                b bVar3 = a2;
                a2 = bVar2;
                bVar2 = bVar3;
            }
            a aVar2 = this.a;
            b bVar4 = aVar2.c;
            b bVar5 = aVar2.d;
            b bVar6 = bVar4;
            while (bVar2.d() >= i2 / 2) {
                if (!bVar2.e()) {
                    b bVar7 = this.a.c;
                    int b3 = this.a.b(bVar2.c(bVar2.d()));
                    while (a2.d() >= bVar2.d() && !a2.e()) {
                        int d = a2.d() - bVar2.d();
                        int c = this.a.c(a2.c(a2.d()), b3);
                        bVar7 = bVar7.a(this.a.a(d, c));
                        a2 = a2.a(bVar2.h(d, c));
                    }
                    b a3 = bVar7.g(bVar5).a(bVar6);
                    if (a2.d() < bVar2.d()) {
                        b bVar8 = a2;
                        a2 = bVar2;
                        bVar2 = bVar8;
                        b bVar9 = bVar5;
                        bVar5 = a3;
                        bVar6 = bVar9;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                    }
                } else {
                    throw new e("r_{i-1} was zero");
                }
            }
            int c2 = bVar5.c(0);
            if (c2 != 0) {
                int b4 = this.a.b(c2);
                b[] bVarArr = {bVar5.f(b4), bVar2.f(b4)};
                b bVar10 = bVarArr[0];
                b bVar11 = bVarArr[1];
                int d2 = bVar10.d();
                if (d2 == 1) {
                    iArr2 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr4 = new int[d2];
                    int i5 = 0;
                    for (int i6 = 1; i6 < this.a.f5851e && i5 < d2; i6++) {
                        if (bVar10.b(i6) == 0) {
                            iArr4[i5] = this.a.b(i6);
                            i5++;
                        }
                    }
                    if (i5 == d2) {
                        iArr2 = iArr4;
                    } else {
                        throw new e("Error locator degree does not match number of roots");
                    }
                }
                int length = iArr2.length;
                int[] iArr5 = new int[length];
                for (int i7 = 0; i7 < length; i7++) {
                    int b5 = this.a.b(iArr2[i7]);
                    int i8 = 1;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i7 != i9) {
                            int c3 = this.a.c(iArr2[i9], b5);
                            i8 = this.a.c(i8, (c3 & 1) == 0 ? c3 | 1 : c3 & -2);
                        }
                    }
                    iArr5[i7] = this.a.c(bVar11.b(b5), this.a.b(i8));
                    a aVar3 = this.a;
                    if (aVar3.f5852g != 0) {
                        iArr5[i7] = aVar3.c(iArr5[i7], b5);
                    }
                }
                while (i3 < iArr2.length) {
                    int length2 = iArr.length - 1;
                    a aVar4 = this.a;
                    int i10 = iArr2[i3];
                    Objects.requireNonNull(aVar4);
                    if (i10 != 0) {
                        int i11 = length2 - aVar4.f5850b[i10];
                        if (i11 >= 0) {
                            iArr[i11] = iArr[i11] ^ iArr5[i3];
                            i3++;
                        } else {
                            throw new e("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return;
            }
            throw new e("sigmaTilde(0) was zero");
        }
    }
}
