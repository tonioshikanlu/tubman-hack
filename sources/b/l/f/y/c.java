package b.l.f.y;

import androidx.exifinterface.media.ExifInterface;

public final class c {
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f5815b;
    public int c;

    public c(byte[] bArr) {
        this.a = bArr;
    }

    public int a() {
        return ((this.a.length - this.f5815b) * 8) - this.c;
    }

    public int b(int i2) {
        if (i2 <= 0 || i2 > 32 || i2 > a()) {
            throw new IllegalArgumentException(String.valueOf(i2));
        }
        int i3 = this.c;
        byte b2 = 0;
        if (i3 > 0) {
            int i4 = 8 - i3;
            int i5 = i2 < i4 ? i2 : i4;
            int i6 = i4 - i5;
            byte[] bArr = this.a;
            int i7 = this.f5815b;
            int i8 = (((255 >> (8 - i5)) << i6) & bArr[i7]) >> i6;
            i2 -= i5;
            int i9 = i3 + i5;
            this.c = i9;
            if (i9 == 8) {
                this.c = 0;
                this.f5815b = i7 + 1;
            }
            b2 = i8;
        }
        if (i2 <= 0) {
            return b2;
        }
        while (i2 >= 8) {
            int i10 = b2 << 8;
            byte[] bArr2 = this.a;
            int i11 = this.f5815b;
            b2 = (bArr2[i11] & ExifInterface.MARKER) | i10;
            this.f5815b = i11 + 1;
            i2 -= 8;
        }
        if (i2 <= 0) {
            return b2;
        }
        int i12 = 8 - i2;
        int i13 = (b2 << i2) | ((((255 >> i12) << i12) & this.a[this.f5815b]) >> i12);
        this.c += i2;
        return i13;
    }
}
