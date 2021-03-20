package b.l.a.d.a.b;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class g1 {
    public byte[] a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public int f4544b;
    public long c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public int f4545e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f4546g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4547h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public String f4548i;

    public g1() {
        c();
    }

    public final int a(byte[] bArr, int i2, int i3) {
        int d2 = d(30, bArr, i2, i3);
        if (d2 == -1) {
            return -1;
        }
        if (this.c == -1) {
            long b2 = e1.b(this.a, 0);
            this.c = b2;
            if (b2 == 67324752) {
                this.f4547h = false;
                this.d = e1.b(this.a, 18);
                this.f4546g = e1.c(this.a, 8);
                this.f4545e = e1.c(this.a, 26);
                int c2 = this.f4545e + 30 + e1.c(this.a, 28);
                this.f = c2;
                int length = this.a.length;
                if (length < c2) {
                    do {
                        length += length;
                    } while (length < c2);
                    this.a = Arrays.copyOf(this.a, length);
                }
            } else {
                this.f4547h = true;
            }
        }
        int d3 = d(this.f, bArr, i2 + d2, i3 - d2);
        if (d3 == -1) {
            return -1;
        }
        int i4 = d2 + d3;
        if (!this.f4547h && this.f4548i == null) {
            this.f4548i = new String(this.a, 30, this.f4545e);
        }
        return i4;
    }

    public final y1 b() {
        int i2 = this.f4544b;
        int i3 = this.f;
        if (i2 < i3) {
            return new y1(this.f4548i, this.d, this.f4546g, true, this.f4547h, Arrays.copyOf(this.a, i2));
        }
        y1 y1Var = new y1(this.f4548i, this.d, this.f4546g, false, this.f4547h, Arrays.copyOf(this.a, i3));
        c();
        return y1Var;
    }

    public final void c() {
        this.f4544b = 0;
        this.f4545e = -1;
        this.c = -1;
        this.f4547h = false;
        this.f = 30;
        this.d = -1;
        this.f4546g = -1;
        this.f4548i = null;
    }

    public final int d(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.f4544b;
        if (i5 >= i2) {
            return 0;
        }
        int min = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.a, this.f4544b, min);
        int i6 = this.f4544b + min;
        this.f4544b = i6;
        if (i6 < i2) {
            return -1;
        }
        return min;
    }
}
