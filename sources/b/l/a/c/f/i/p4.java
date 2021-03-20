package b.l.a.c.f.i;

import b.e.a.a.a;

public final class p4 extends r4 {

    /* renamed from: l  reason: collision with root package name */
    public final int f3679l;

    public p4(byte[] bArr, int i2) {
        super(bArr);
        t4.I(0, i2, bArr.length);
        this.f3679l = i2;
    }

    public final int J() {
        return 0;
    }

    public final byte d(int i2) {
        int i3 = this.f3679l;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f3710k[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.Q(22, "Index < 0: ", i2));
        }
        throw new ArrayIndexOutOfBoundsException(a.R(40, "Index > length: ", i2, ", ", i3));
    }

    public final byte e(int i2) {
        return this.f3710k[i2];
    }

    public final int l() {
        return this.f3679l;
    }
}
