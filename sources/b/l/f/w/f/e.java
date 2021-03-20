package b.l.f.w.f;

import b.l.f.y.a;

public final class e extends g {
    public final short c;
    public final short d;

    public e(g gVar, int i2, int i3) {
        super(gVar);
        this.c = (short) i2;
        this.d = (short) i3;
    }

    public void a(a aVar, byte[] bArr) {
        aVar.c(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        short s2 = this.d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.d)).substring(1) + '>';
    }
}
