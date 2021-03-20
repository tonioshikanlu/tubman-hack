package b.l.f;

import androidx.exifinterface.media.ExifInterface;

public final class i extends j {
    public final j c;

    public i(j jVar) {
        super(jVar.a, jVar.f5757b);
        this.c = jVar;
    }

    public byte[] a() {
        byte[] a = this.c.a();
        int i2 = this.a * this.f5757b;
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) (255 - (a[i3] & ExifInterface.MARKER));
        }
        return bArr;
    }

    public byte[] b(int i2, byte[] bArr) {
        byte[] b2 = this.c.b(i2, bArr);
        int i3 = this.a;
        for (int i4 = 0; i4 < i3; i4++) {
            b2[i4] = (byte) (255 - (b2[i4] & ExifInterface.MARKER));
        }
        return b2;
    }

    public j c() {
        return this.c;
    }

    public boolean d() {
        return this.c.d();
    }

    public j e() {
        return new i(this.c.e());
    }
}
