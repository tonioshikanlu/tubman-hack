package b.l.f.d0.e.k;

public final class c {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5679b;

    public c(b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f5679b = iArr;
                return;
            }
            int i2 = 1;
            while (i2 < length && iArr[i2] == 0) {
                i2++;
            }
            if (i2 == length) {
                this.f5679b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i2)];
            this.f5679b = iArr2;
            System.arraycopy(iArr, i2, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public c a(c cVar) {
        if (!this.a.equals(cVar.a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (e()) {
            return cVar;
        } else {
            if (cVar.e()) {
                return this;
            }
            int[] iArr = this.f5679b;
            int[] iArr2 = cVar.f5679b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i2 = length; i2 < iArr.length; i2++) {
                iArr4[i2] = this.a.a(iArr2[i2 - length], iArr[i2]);
            }
            return new c(this.a, iArr4);
        }
    }

    public int b(int i2) {
        if (i2 == 0) {
            return c(0);
        }
        if (i2 == 1) {
            int i3 = 0;
            for (int a2 : this.f5679b) {
                i3 = this.a.a(i3, a2);
            }
            return i3;
        }
        int[] iArr = this.f5679b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            b bVar = this.a;
            i4 = bVar.a(bVar.d(i2, i4), this.f5679b[i5]);
        }
        return i4;
    }

    public int c(int i2) {
        int[] iArr = this.f5679b;
        return iArr[(iArr.length - 1) - i2];
    }

    public int d() {
        return this.f5679b.length - 1;
    }

    public boolean e() {
        return this.f5679b[0] == 0;
    }

    public c f(int i2) {
        if (i2 == 0) {
            return this.a.c;
        }
        if (i2 == 1) {
            return this;
        }
        int length = this.f5679b.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.a.d(this.f5679b[i3], i2);
        }
        return new c(this.a, iArr);
    }

    public c g(c cVar) {
        if (!this.a.equals(cVar.a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (e() || cVar.e()) {
            return this.a.c;
        } else {
            int[] iArr = this.f5679b;
            int length = iArr.length;
            int[] iArr2 = cVar.f5679b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArr[i2];
                for (int i4 = 0; i4 < length2; i4++) {
                    int i5 = i2 + i4;
                    b bVar = this.a;
                    iArr3[i5] = bVar.a(iArr3[i5], bVar.d(i3, iArr2[i4]));
                }
            }
            return new c(this.a, iArr3);
        }
    }

    public c h() {
        int length = this.f5679b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.a.e(0, this.f5679b[i2]);
        }
        return new c(this.a, iArr);
    }

    public c i(c cVar) {
        if (this.a.equals(cVar.a)) {
            return cVar.e() ? this : a(cVar.h());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int d = d(); d >= 0; d--) {
            int c = c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    sb.append(c);
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
        }
        return sb.toString();
    }
}
