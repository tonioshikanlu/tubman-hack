package b.l.f.b0.b;

import androidx.exifinterface.media.ExifInterface;
import b.l.f.d;
import b.l.f.y.l.a;
import b.l.f.y.l.e;

public final class c {
    public final b.l.f.y.l.c a = new b.l.f.y.l.c(a.f5849o);

    public final void a(byte[] bArr, int i2, int i3, int i4, int i5) {
        int i6 = i3 + i4;
        int i7 = i5 == 0 ? 1 : 2;
        int[] iArr = new int[(i6 / i7)];
        for (int i8 = 0; i8 < i6; i8++) {
            if (i5 == 0 || i8 % 2 == i5 - 1) {
                iArr[i8 / i7] = bArr[i8 + i2] & ExifInterface.MARKER;
            }
        }
        try {
            this.a.a(iArr, i4 / i7);
            for (int i9 = 0; i9 < i3; i9++) {
                if (i5 == 0 || i9 % 2 == i5 - 1) {
                    bArr[i9 + i2] = (byte) iArr[i9 / i7];
                }
            }
        } catch (e unused) {
            throw d.a();
        }
    }
}
