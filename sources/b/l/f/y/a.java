package b.l.f.y;

import java.util.Arrays;

public final class a implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public int[] f5809h;

    /* renamed from: i  reason: collision with root package name */
    public int f5810i;

    public a() {
        this.f5810i = 0;
        this.f5809h = new int[1];
    }

    public a(int i2) {
        this.f5810i = i2;
        this.f5809h = new int[((i2 + 31) / 32)];
    }

    public a(int[] iArr, int i2) {
        this.f5809h = iArr;
        this.f5810i = i2;
    }

    public void a(boolean z) {
        d(this.f5810i + 1);
        if (z) {
            int[] iArr = this.f5809h;
            int i2 = this.f5810i;
            int i3 = i2 / 32;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.f5810i++;
    }

    public void b(a aVar) {
        int i2 = aVar.f5810i;
        d(this.f5810i + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            a(aVar.f(i3));
        }
    }

    public void c(int i2, int i3) {
        if (i3 < 0 || i3 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        d(this.f5810i + i3);
        while (i3 > 0) {
            boolean z = true;
            if (((i2 >> (i3 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i3--;
        }
    }

    public Object clone() {
        return new a((int[]) this.f5809h.clone(), this.f5810i);
    }

    public final void d(int i2) {
        int[] iArr = this.f5809h;
        if (i2 > (iArr.length << 5)) {
            int[] iArr2 = new int[((i2 + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f5809h = iArr2;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5810i == aVar.f5810i && Arrays.equals(this.f5809h, aVar.f5809h);
    }

    public boolean f(int i2) {
        return ((1 << (i2 & 31)) & this.f5809h[i2 / 32]) != 0;
    }

    public int g(int i2) {
        int i3 = this.f5810i;
        if (i2 >= i3) {
            return i3;
        }
        int i4 = i2 / 32;
        int i5 = (-(1 << (i2 & 31))) & this.f5809h[i4];
        while (i5 == 0) {
            i4++;
            int[] iArr = this.f5809h;
            if (i4 == iArr.length) {
                return this.f5810i;
            }
            i5 = iArr[i4];
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i5) + (i4 << 5);
        int i6 = this.f5810i;
        return numberOfTrailingZeros > i6 ? i6 : numberOfTrailingZeros;
    }

    public int h(int i2) {
        int i3 = this.f5810i;
        if (i2 >= i3) {
            return i3;
        }
        int i4 = i2 / 32;
        int i5 = (-(1 << (i2 & 31))) & (~this.f5809h[i4]);
        while (i5 == 0) {
            i4++;
            int[] iArr = this.f5809h;
            if (i4 == iArr.length) {
                return this.f5810i;
            }
            i5 = ~iArr[i4];
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i5) + (i4 << 5);
        int i6 = this.f5810i;
        return numberOfTrailingZeros > i6 ? i6 : numberOfTrailingZeros;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5809h) + (this.f5810i * 31);
    }

    public int i() {
        return (this.f5810i + 7) / 8;
    }

    public boolean j(int i2, int i3, boolean z) {
        if (i3 < i2 || i2 < 0 || i3 > this.f5810i) {
            throw new IllegalArgumentException();
        } else if (i3 == i2) {
            return true;
        } else {
            int i4 = i3 - 1;
            int i5 = i2 / 32;
            int i6 = i4 / 32;
            int i7 = i5;
            while (i7 <= i6) {
                int i8 = 31;
                int i9 = i7 > i5 ? 0 : i2 & 31;
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i10 = (2 << i8) - (1 << i9);
                int i11 = this.f5809h[i7] & i10;
                if (!z) {
                    i10 = 0;
                }
                if (i11 != i10) {
                    return false;
                }
                i7++;
            }
            return true;
        }
    }

    public void k() {
        int[] iArr = new int[this.f5809h.length];
        int i2 = (this.f5810i - 1) / 32;
        int i3 = i2 + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            long j2 = (long) this.f5809h[i4];
            long j3 = ((j2 & 1431655765) << 1) | ((j2 >> 1) & 1431655765);
            long j4 = ((j3 & 858993459) << 2) | ((j3 >> 2) & 858993459);
            long j5 = ((j4 & 252645135) << 4) | ((j4 >> 4) & 252645135);
            long j6 = ((j5 & 16711935) << 8) | ((j5 >> 8) & 16711935);
            iArr[i2 - i4] = (int) (((j6 & 65535) << 16) | ((j6 >> 16) & 65535));
        }
        int i5 = this.f5810i;
        int i6 = i3 << 5;
        if (i5 != i6) {
            int i7 = i6 - i5;
            int i8 = iArr[0] >>> i7;
            for (int i9 = 1; i9 < i3; i9++) {
                int i10 = iArr[i9];
                iArr[i9 - 1] = i8 | (i10 << (32 - i7));
                i8 = i10 >>> i7;
            }
            iArr[i3 - 1] = i8;
        }
        this.f5809h = iArr;
    }

    public void l(int i2) {
        int[] iArr = this.f5809h;
        int i3 = i2 / 32;
        iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
    }

    public String toString() {
        int i2 = this.f5810i;
        StringBuilder sb = new StringBuilder((i2 / 8) + i2 + 1);
        for (int i3 = 0; i3 < this.f5810i; i3++) {
            if ((i3 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(f(i3) ? 'X' : '.');
        }
        return sb.toString();
    }
}
