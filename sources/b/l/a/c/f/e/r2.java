package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.util.Arrays;

public final class r2 implements Comparable<r2> {

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f3246h;

    public /* synthetic */ r2(byte[] bArr) {
        this.f3246h = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        r2 r2Var = (r2) obj;
        int length = this.f3246h.length;
        int length2 = r2Var.f3246h.length;
        if (length != length2) {
            return length - length2;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f3246h;
            if (i2 >= bArr.length) {
                return 0;
            }
            byte b2 = bArr[i2];
            byte b3 = r2Var.f3246h[i2];
            if (b2 != b3) {
                return b2 - b3;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r2)) {
            return false;
        }
        return Arrays.equals(this.f3246h, ((r2) obj).f3246h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3246h);
    }

    public final String toString() {
        return a.d1(this.f3246h);
    }
}
