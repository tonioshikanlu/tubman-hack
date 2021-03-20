package b.l.f.z.e;

import java.util.Arrays;

public class e {
    public final CharSequence a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5875b;
    public final int c;
    public final byte[] d;

    public e(CharSequence charSequence, int i2, int i3) {
        this.a = charSequence;
        this.c = i2;
        this.f5875b = i3;
        byte[] bArr = new byte[(i2 * i3)];
        this.d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (i2 < 0) {
            int i6 = this.f5875b;
            i2 += i6;
            i3 += 4 - ((i6 + 4) % 8);
        }
        if (i3 < 0) {
            int i7 = this.c;
            i3 += i7;
            i2 += 4 - ((i7 + 4) % 8);
        }
        boolean z = true;
        if ((this.a.charAt(i4) & (1 << (8 - i5))) == 0) {
            z = false;
        }
        c(i3, i2, z);
    }

    public final boolean b(int i2, int i3) {
        return this.d[(i3 * this.c) + i2] < 0;
    }

    public final void c(int i2, int i3, boolean z) {
        this.d[(i3 * this.c) + i2] = z ? (byte) 1 : 0;
    }

    public final void d(int i2, int i3, int i4) {
        int i5 = i2 - 2;
        int i6 = i3 - 2;
        a(i5, i6, i4, 1);
        int i7 = i3 - 1;
        a(i5, i7, i4, 2);
        int i8 = i2 - 1;
        a(i8, i6, i4, 3);
        a(i8, i7, i4, 4);
        a(i8, i3, i4, 5);
        a(i2, i6, i4, 6);
        a(i2, i7, i4, 7);
        a(i2, i3, i4, 8);
    }
}
