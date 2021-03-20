package b.l.f;

public final class n extends j {
    public final byte[] c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5760e;

    public n(byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        super(i6, i7);
        if (i4 + i6 > i2 || i5 + i7 > i3) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = bArr;
        this.d = i2;
        this.f5760e = i3;
        if (z) {
            int i8 = (i5 * i2) + i4;
            int i9 = 0;
            while (i9 < i7) {
                int i10 = (i6 / 2) + i8;
                int i11 = (i8 + i6) - 1;
                int i12 = i8;
                while (i12 < i10) {
                    byte b2 = bArr[i12];
                    bArr[i12] = bArr[i11];
                    bArr[i11] = b2;
                    i12++;
                    i11--;
                }
                i9++;
                i8 += this.d;
            }
        }
    }

    public byte[] a() {
        int i2 = this.a;
        int i3 = this.f5757b;
        int i4 = this.d;
        if (i2 == i4 && i3 == this.f5760e) {
            return this.c;
        }
        int i5 = i2 * i3;
        byte[] bArr = new byte[i5];
        int i6 = (0 * i4) + 0;
        if (i2 == i4) {
            System.arraycopy(this.c, i6, bArr, 0, i5);
            return bArr;
        }
        for (int i7 = 0; i7 < i3; i7++) {
            System.arraycopy(this.c, i6, bArr, i7 * i2, i2);
            i6 += this.d;
        }
        return bArr;
    }

    public byte[] b(int i2, byte[] bArr) {
        if (i2 < 0 || i2 >= this.f5757b) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i2)));
        }
        int i3 = this.a;
        if (bArr == null || bArr.length < i3) {
            bArr = new byte[i3];
        }
        System.arraycopy(this.c, ((i2 + 0) * this.d) + 0, bArr, 0, i3);
        return bArr;
    }
}
