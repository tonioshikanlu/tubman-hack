package b.l.f;

import androidx.exifinterface.media.ExifInterface;

public abstract class j {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5757b;

    public j(int i2, int i3) {
        this.a = i2;
        this.f5757b = i3;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i2, byte[] bArr);

    public j c() {
        return new i(this);
    }

    public boolean d() {
        return false;
    }

    public j e() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i2 = this.a;
        byte[] bArr = new byte[i2];
        StringBuilder sb = new StringBuilder((i2 + 1) * this.f5757b);
        for (int i3 = 0; i3 < this.f5757b; i3++) {
            bArr = b(i3, bArr);
            for (int i4 = 0; i4 < this.a; i4++) {
                byte b2 = bArr[i4] & ExifInterface.MARKER;
                sb.append(b2 < 64 ? '#' : b2 < 128 ? '+' : b2 < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
