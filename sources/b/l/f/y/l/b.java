package b.l.f.y.l;

import java.util.Objects;

public final class b {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5853b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f5853b = iArr;
                return;
            }
            int i2 = 1;
            while (i2 < length && iArr[i2] == 0) {
                i2++;
            }
            if (i2 == length) {
                this.f5853b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i2)];
            this.f5853b = iArr2;
            System.arraycopy(iArr, i2, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public b a(b bVar) {
        if (!this.a.equals(bVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (e()) {
            return bVar;
        } else {
            if (bVar.e()) {
                return this;
            }
            int[] iArr = this.f5853b;
            int[] iArr2 = bVar.f5853b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i2 = length; i2 < iArr.length; i2++) {
                iArr4[i2] = iArr2[i2 - length] ^ iArr[i2];
            }
            return new b(this.a, iArr4);
        }
    }

    public int b(int i2) {
        if (i2 == 0) {
            return c(0);
        }
        if (i2 == 1) {
            int i3 = 0;
            for (int i4 : this.f5853b) {
                a aVar = a.f5842h;
                i3 ^= i4;
            }
            return i3;
        }
        int[] iArr = this.f5853b;
        int i5 = iArr[0];
        int length = iArr.length;
        for (int i6 = 1; i6 < length; i6++) {
            i5 = this.a.c(i2, i5) ^ this.f5853b[i6];
        }
        return i5;
    }

    public int c(int i2) {
        int[] iArr = this.f5853b;
        return iArr[(iArr.length - 1) - i2];
    }

    public int d() {
        return this.f5853b.length - 1;
    }

    public boolean e() {
        return this.f5853b[0] == 0;
    }

    public b f(int i2) {
        if (i2 == 0) {
            return this.a.c;
        }
        if (i2 == 1) {
            return this;
        }
        int length = this.f5853b.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.a.c(this.f5853b[i3], i2);
        }
        return new b(this.a, iArr);
    }

    public b g(b bVar) {
        if (!this.a.equals(bVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (e() || bVar.e()) {
            return this.a.c;
        } else {
            int[] iArr = this.f5853b;
            int length = iArr.length;
            int[] iArr2 = bVar.f5853b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArr[i2];
                for (int i4 = 0; i4 < length2; i4++) {
                    int i5 = i2 + i4;
                    iArr3[i5] = iArr3[i5] ^ this.a.c(i3, iArr2[i4]);
                }
            }
            return new b(this.a, iArr3);
        }
    }

    public b h(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.a.c;
        } else {
            int length = this.f5853b.length;
            int[] iArr = new int[(i2 + length)];
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = this.a.c(this.f5853b[i4], i3);
            }
            return new b(this.a, iArr);
        }
    }

    public String toString() {
        char c;
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() * 8);
        int d = d();
        while (d >= 0) {
            int c2 = c(d);
            if (c2 != 0) {
                if (c2 < 0) {
                    sb.append(d == d() ? "-" : " - ");
                    c2 = -c2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c2 != 1) {
                    a aVar = this.a;
                    Objects.requireNonNull(aVar);
                    if (c2 != 0) {
                        int i2 = aVar.f5850b[c2];
                        if (i2 == 0) {
                            c = '1';
                        } else if (i2 == 1) {
                            c = 'a';
                        } else {
                            sb.append("a^");
                            sb.append(i2);
                        }
                        sb.append(c);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
            d--;
        }
        return sb.toString();
    }
}
