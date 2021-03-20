package b.l.a.c.f.i;

import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Objects;

public class r4 extends t4 {

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f3710k;

    public r4(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f3710k = bArr;
    }

    public final boolean D() {
        return d8.a(this.f3710k, 0, l());
    }

    public final int G(int i2, int i3, int i4) {
        byte[] bArr = this.f3710k;
        Charset charset = w5.a;
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public int J() {
        return 0;
    }

    public byte d(int i2) {
        return this.f3710k[i2];
    }

    public byte e(int i2) {
        return this.f3710k[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t4) || l() != ((t4) obj).l()) {
            return false;
        }
        if (l() == 0) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return obj.equals(this);
        }
        r4 r4Var = (r4) obj;
        int i2 = this.f3761h;
        int i3 = r4Var.f3761h;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int l2 = l();
        if (l2 > r4Var.l()) {
            int l3 = l();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(l2);
            sb.append(l3);
            throw new IllegalArgumentException(sb.toString());
        } else if (l2 <= r4Var.l()) {
            byte[] bArr = this.f3710k;
            byte[] bArr2 = r4Var.f3710k;
            r4Var.J();
            int i4 = 0;
            int i5 = 0;
            while (i4 < l2) {
                if (bArr[i4] != bArr2[i5]) {
                    return false;
                }
                i4++;
                i5++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(a.R(59, "Ran off end of other: 0, ", l2, ", ", r4Var.l()));
        }
    }

    public int l() {
        return this.f3710k.length;
    }

    public final t4 n(int i2, int i3) {
        int I = t4.I(0, i3, l());
        return I == 0 ? t4.f3759i : new p4(this.f3710k, I);
    }

    public final void v(l4 l4Var) {
        ((w4) l4Var).x(this.f3710k, 0, l());
    }

    public final String y(Charset charset) {
        return new String(this.f3710k, 0, l(), charset);
    }
}
