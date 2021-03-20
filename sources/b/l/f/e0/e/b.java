package b.l.f.e0.e;

import java.lang.reflect.Array;

public final class b {
    public final byte[][] a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5744b;
    public final int c;

    public b(int i2, int i3) {
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i3;
        this.a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f5744b = i2;
        this.c = i3;
    }

    public byte a(int i2, int i3) {
        return this.a[i3][i2];
    }

    public void b(int i2, int i3, int i4) {
        this.a[i3][i2] = (byte) i4;
    }

    public void c(int i2, int i3, boolean z) {
        this.a[i3][i2] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f5744b * 2 * this.c) + 2);
        for (int i2 = 0; i2 < this.c; i2++) {
            byte[] bArr = this.a[i2];
            for (int i3 = 0; i3 < this.f5744b; i3++) {
                byte b2 = bArr[i3];
                sb.append(b2 != 0 ? b2 != 1 ? "  " : " 1" : " 0");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
