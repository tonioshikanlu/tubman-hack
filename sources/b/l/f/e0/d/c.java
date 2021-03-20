package b.l.f.e0.d;

import b.l.f.m;
import b.l.f.s;
import b.l.f.t;
import b.l.f.x.a.g;
import b.l.f.y.b;

public class c {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public t f5739b;

    public c(b bVar) {
        this.a = bVar;
    }

    public final float a(s sVar, s sVar2) {
        float d = d((int) sVar.a, (int) sVar.f5775b, (int) sVar2.a, (int) sVar2.f5775b);
        float d2 = d((int) sVar2.a, (int) sVar2.f5775b, (int) sVar.a, (int) sVar.f5775b);
        if (Float.isNaN(d)) {
            return d2 / 7.0f;
        }
        return Float.isNaN(d2) ? d / 7.0f : (d + d2) / 14.0f;
    }

    public final a b(float f, int i2, int i3, float f2) {
        a c;
        a c2;
        int i4 = (int) (f2 * f);
        int max = Math.max(0, i2 - i4);
        int min = Math.min(this.a.f5811h - 1, i2 + i4) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i3 - i4);
            int min2 = Math.min(this.a.f5812i - 1, i3 + i4) - max2;
            if (((float) min2) >= f3) {
                b bVar = new b(this.a, max, max2, min, min2, f, this.f5739b);
                int i5 = bVar.c;
                int i6 = bVar.f;
                int i7 = bVar.f5735e + i5;
                int i8 = (i6 / 2) + bVar.d;
                int[] iArr = new int[3];
                for (int i9 = 0; i9 < i6; i9++) {
                    int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i11 = i5;
                    while (i11 < i7 && !bVar.a.b(i11, i10)) {
                        i11++;
                    }
                    int i12 = 0;
                    while (i11 < i7) {
                        if (!bVar.a.b(i11, i10)) {
                            if (i12 == 1) {
                                i12++;
                            }
                            iArr[i12] = iArr[i12] + 1;
                        } else if (i12 == 1) {
                            iArr[1] = iArr[1] + 1;
                        } else if (i12 != 2) {
                            i12++;
                            iArr[i12] = iArr[i12] + 1;
                        } else if (bVar.b(iArr) && (c2 = bVar.c(iArr, i10, i11)) != null) {
                            return c2;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = 1;
                            iArr[2] = 0;
                            i12 = 1;
                        }
                        i11++;
                    }
                    if (bVar.b(iArr) && (c = bVar.c(iArr, i10, i7)) != null) {
                        return c;
                    }
                }
                if (!bVar.f5734b.isEmpty()) {
                    return bVar.f5734b.get(0);
                }
                throw m.f5759j;
            }
            throw m.f5759j;
        }
        throw m.f5759j;
    }

    public final float c(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        c cVar;
        boolean z2;
        boolean z3 = true;
        boolean z4 = Math.abs(i5 - i3) > Math.abs(i4 - i2);
        if (z4) {
            i8 = i2;
            i9 = i3;
            i6 = i4;
            i7 = i5;
        } else {
            i9 = i2;
            i8 = i3;
            i7 = i4;
            i6 = i5;
        }
        int abs = Math.abs(i7 - i9);
        int abs2 = Math.abs(i6 - i8);
        int i12 = 2;
        int i13 = (-abs) / 2;
        int i14 = -1;
        int i15 = i9 < i7 ? 1 : -1;
        if (i8 < i6) {
            i14 = 1;
        }
        int i16 = i7 + i15;
        int i17 = i9;
        int i18 = i8;
        int i19 = 0;
        while (true) {
            if (i17 == i16) {
                i10 = i16;
                i11 = i12;
                break;
            }
            int i20 = z4 ? i18 : i17;
            int i21 = z4 ? i17 : i18;
            if (i19 == z3) {
                z = z4;
                z2 = z3;
                i10 = i16;
                cVar = this;
            } else {
                cVar = this;
                z = z4;
                i10 = i16;
                z2 = false;
            }
            if (z2 == cVar.a.b(i20, i21)) {
                if (i19 == 2) {
                    return g.m(i17, i18, i9, i8);
                }
                i19++;
            }
            i13 += abs2;
            if (i13 > 0) {
                if (i18 == i6) {
                    i11 = 2;
                    break;
                }
                i18 += i14;
                i13 -= abs;
            }
            i17 += i15;
            i16 = i10;
            z4 = z;
            z3 = true;
            i12 = 2;
        }
        if (i19 == i11) {
            return g.m(i10, i6, i9, i8);
        }
        return Float.NaN;
    }

    public final float d(int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        float c = c(i2, i3, i4, i5);
        int i6 = i2 - (i4 - i2);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i2) / ((float) (i2 - i6));
            i6 = 0;
        } else {
            int i8 = this.a.f5811h;
            if (i6 >= i8) {
                int i9 = i8 - 1;
                f = ((float) ((i8 - 1) - i2)) / ((float) (i6 - i2));
                i6 = i9;
            } else {
                f = 1.0f;
            }
        }
        float f3 = (float) i3;
        int i10 = (int) (f3 - (((float) (i5 - i3)) * f));
        if (i10 < 0) {
            f2 = f3 / ((float) (i3 - i10));
        } else {
            int i11 = this.a.f5812i;
            if (i10 >= i11) {
                f2 = ((float) ((i11 - 1) - i3)) / ((float) (i10 - i3));
                i7 = i11 - 1;
            } else {
                i7 = i10;
                f2 = 1.0f;
            }
        }
        return (c(i2, i3, (int) ((((float) (i6 - i2)) * f2) + ((float) i2)), i7) + c) - 1.0f;
    }
}
