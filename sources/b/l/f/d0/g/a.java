package b.l.f.d0.g;

import java.lang.reflect.Array;

public final class a {
    public final b[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f5681b;
    public final int c;
    public final int d;

    public a(int i2, int i3) {
        b[] bVarArr = new b[i2];
        this.a = bVarArr;
        int length = bVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.a[i4] = new b(((i3 + 4) * 17) + 1);
        }
        this.d = i3 * 17;
        this.c = i2;
        this.f5681b = -1;
    }

    public b a() {
        return this.a[this.f5681b];
    }

    public byte[][] b(int i2, int i3) {
        int[] iArr = new int[2];
        iArr[1] = this.d * i2;
        iArr[0] = this.c * i3;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i4 = this.c * i3;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (i4 - i5) - 1;
            b bVar = this.a[i5 / i3];
            int length = bVar.a.length * i2;
            byte[] bArr2 = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                bArr2[i7] = bVar.a[i7 / i2];
            }
            bArr[i6] = bArr2;
        }
        return bArr;
    }
}
