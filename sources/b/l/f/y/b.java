package b.l.f.y;

import java.util.Arrays;

public final class b implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public final int f5811h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5812i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5813j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f5814k;

    public b(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f5811h = i2;
        this.f5812i = i3;
        int i4 = (i2 + 31) / 32;
        this.f5813j = i4;
        this.f5814k = new int[(i4 * i3)];
    }

    public b(int i2, int i3, int i4, int[] iArr) {
        this.f5811h = i2;
        this.f5812i = i3;
        this.f5813j = i4;
        this.f5814k = iArr;
    }

    public void a(int i2, int i3) {
        int i4 = (i2 / 32) + (i3 * this.f5813j);
        int[] iArr = this.f5814k;
        iArr[i4] = (1 << (i2 & 31)) ^ iArr[i4];
    }

    public boolean b(int i2, int i3) {
        return ((this.f5814k[(i2 / 32) + (i3 * this.f5813j)] >>> (i2 & 31)) & 1) != 0;
    }

    public int[] c() {
        int length = this.f5814k.length - 1;
        while (length >= 0 && this.f5814k[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i2 = this.f5813j;
        int i3 = length / i2;
        int i4 = (length % i2) << 5;
        int i5 = 31;
        while ((this.f5814k[length] >>> i5) == 0) {
            i5--;
        }
        return new int[]{i4 + i5, i3};
    }

    public Object clone() {
        return new b(this.f5811h, this.f5812i, this.f5813j, (int[]) this.f5814k.clone());
    }

    public a d(int i2, a aVar) {
        int i3 = aVar.f5810i;
        int i4 = this.f5811h;
        if (i3 < i4) {
            aVar = new a(i4);
        } else {
            int length = aVar.f5809h.length;
            for (int i5 = 0; i5 < length; i5++) {
                aVar.f5809h[i5] = 0;
            }
        }
        int i6 = i2 * this.f5813j;
        for (int i7 = 0; i7 < this.f5813j; i7++) {
            aVar.f5809h[(i7 << 5) / 32] = this.f5814k[i6 + i7];
        }
        return aVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5811h == bVar.f5811h && this.f5812i == bVar.f5812i && this.f5813j == bVar.f5813j && Arrays.equals(this.f5814k, bVar.f5814k);
    }

    public int[] f() {
        int[] iArr;
        int i2 = 0;
        while (true) {
            iArr = this.f5814k;
            if (i2 < iArr.length && iArr[i2] == 0) {
                i2++;
            }
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.f5813j;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) << 5;
        int i6 = iArr[i2];
        int i7 = 0;
        while ((i6 << (31 - i7)) == 0) {
            i7++;
        }
        return new int[]{i5 + i7, i4};
    }

    public void g(int i2, int i3) {
        int i4 = (i2 / 32) + (i3 * this.f5813j);
        int[] iArr = this.f5814k;
        iArr[i4] = (1 << (i2 & 31)) | iArr[i4];
    }

    public void h(int i2, int i3, int i4, int i5) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i5 <= 0 || i4 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i6 = i4 + i2;
            int i7 = i5 + i3;
            if (i7 > this.f5812i || i6 > this.f5811h) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i3 < i7) {
                int i8 = this.f5813j * i3;
                for (int i9 = i2; i9 < i6; i9++) {
                    int[] iArr = this.f5814k;
                    int i10 = (i9 / 32) + i8;
                    iArr[i10] = iArr[i10] | (1 << (i9 & 31));
                }
                i3++;
            }
        }
    }

    public int hashCode() {
        int i2 = this.f5811h;
        return Arrays.hashCode(this.f5814k) + (((((((i2 * 31) + i2) * 31) + this.f5812i) * 31) + this.f5813j) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f5811h + 1) * this.f5812i);
        for (int i2 = 0; i2 < this.f5812i; i2++) {
            for (int i3 = 0; i3 < this.f5811h; i3++) {
                sb.append(b(i3, i2) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
