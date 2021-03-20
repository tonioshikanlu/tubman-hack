package b.l.a.c.f.e;

import b.e.a.a.a;

public final class pm extends rm {

    /* renamed from: l  reason: collision with root package name */
    public final int f3239l;

    public pm(byte[] bArr, int i2) {
        super(bArr);
        um.N(0, i2, bArr.length);
        this.f3239l = i2;
    }

    public final int R() {
        return 0;
    }

    public final byte d(int i2) {
        int i3 = this.f3239l;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f3265k[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.Q(22, "Index < 0: ", i2));
        }
        throw new ArrayIndexOutOfBoundsException(a.R(40, "Index > length: ", i2, ", ", i3));
    }

    public final byte e(int i2) {
        return this.f3265k[i2];
    }

    public final int l() {
        return this.f3239l;
    }

    public final void n(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f3265k, 0, bArr, 0, i4);
    }
}
