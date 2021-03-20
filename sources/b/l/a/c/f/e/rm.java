package b.l.a.c.f.e;

import java.nio.charset.Charset;
import java.util.Objects;

public class rm extends um {

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f3265k;

    public rm(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f3265k = bArr;
    }

    public final String D(Charset charset) {
        return new String(this.f3265k, 0, l(), charset);
    }

    public final boolean G() {
        return s1.a(this.f3265k, 0, l());
    }

    public final int H(int i2, int i3, int i4) {
        byte[] bArr = this.f3265k;
        Charset charset = j.a;
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public final vm I() {
        byte[] bArr = this.f3265k;
        int l2 = l();
        vm vmVar = new vm(bArr, l2);
        try {
            vmVar.j(l2);
            return vmVar;
        } catch (l e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int R() {
        return 0;
    }

    public byte d(int i2) {
        return this.f3265k[i2];
    }

    public byte e(int i2) {
        return this.f3265k[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof um) || l() != ((um) obj).l()) {
            return false;
        }
        if (l() == 0) {
            return true;
        }
        if (!(obj instanceof rm)) {
            return obj.equals(this);
        }
        rm rmVar = (rm) obj;
        int i2 = this.f3346h;
        int i3 = rmVar.f3346h;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int l2 = l();
        if (l2 > rmVar.l()) {
            int l3 = l();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(l2);
            sb.append(l3);
            throw new IllegalArgumentException(sb.toString());
        } else if (l2 <= rmVar.l()) {
            byte[] bArr = this.f3265k;
            byte[] bArr2 = rmVar.f3265k;
            rmVar.R();
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
            int l4 = rmVar.l();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(0);
            sb2.append(", ");
            sb2.append(l2);
            sb2.append(", ");
            sb2.append(l4);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int l() {
        return this.f3265k.length;
    }

    public void n(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f3265k, 0, bArr, 0, i4);
    }

    public final um v(int i2, int i3) {
        int N = um.N(0, i3, l());
        return N == 0 ? um.f3344i : new pm(this.f3265k, N);
    }

    public final void y(lm lmVar) {
        lmVar.a(this.f3265k, 0, l());
    }
}
