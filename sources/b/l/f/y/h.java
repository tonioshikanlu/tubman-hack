package b.l.f.y;

import b.l.f.b;
import b.l.f.j;
import b.l.f.m;

public final class h extends b {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f5831e = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public byte[] f5832b = f5831e;
    public final int[] c = new int[32];
    public b d;

    public h(j jVar) {
        super(jVar);
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (iArr[i5] > i2) {
                i2 = iArr[i5];
                i4 = i5;
            }
            if (iArr[i5] > i3) {
                i3 = iArr[i5];
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i4;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i4 <= i6) {
            int i11 = i4;
            i4 = i6;
            i6 = i11;
        }
        if (i4 - i6 > length / 16) {
            int i12 = i4 - 1;
            int i13 = -1;
            int i14 = i12;
            while (i12 > i6) {
                int i15 = i12 - i6;
                int i16 = (i3 - iArr[i12]) * (i4 - i12) * i15 * i15;
                if (i16 > i13) {
                    i14 = i12;
                    i13 = i16;
                }
                i12--;
            }
            return i14 << 3;
        }
        throw m.f5759j;
    }

    public final void b(int i2) {
        if (this.f5832b.length < i2) {
            this.f5832b = new byte[i2];
        }
        for (int i3 = 0; i3 < 32; i3++) {
            this.c[i3] = 0;
        }
    }
}
