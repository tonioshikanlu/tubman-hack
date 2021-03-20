package o;

import e.a.a.a.y0.m.o1.c;
import e.t.g;
import e.x.c.i;
import java.security.MessageDigest;

public final class w extends h {

    /* renamed from: m  reason: collision with root package name */
    public final transient byte[][] f10493m;

    /* renamed from: n  reason: collision with root package name */
    public final transient int[] f10494n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(byte[][] bArr, int[] iArr) {
        super(h.f10455k.f10459j);
        i.e(bArr, "segments");
        i.e(iArr, "directory");
        this.f10493m = bArr;
        this.f10494n = iArr;
    }

    public final h A() {
        return new h(x());
    }

    public String d() {
        return A().d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.l() == l() && u(0, hVar, 0, l())) {
                return true;
            }
        }
        return false;
    }

    public h h(String str) {
        i.e(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = this.f10493m.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f10494n;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            instance.update(this.f10493m[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = instance.digest();
        i.d(digest, "digest.digest()");
        return new h(digest);
    }

    public int hashCode() {
        int i2 = this.f10457h;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f10493m.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f10494n;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr = this.f10493m[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f10457h = i4;
        return i4;
    }

    public int l() {
        return this.f10494n[this.f10493m.length - 1];
    }

    public String m() {
        return A().m();
    }

    public byte[] n() {
        return x();
    }

    public byte r(int i2) {
        int i3;
        c.p((long) this.f10494n[this.f10493m.length - 1], (long) i2, 1);
        int c0 = c.c0(this, i2);
        if (c0 == 0) {
            i3 = 0;
        } else {
            i3 = this.f10494n[c0 - 1];
        }
        int[] iArr = this.f10494n;
        byte[][] bArr = this.f10493m;
        return bArr[c0][(i2 - i3) + iArr[bArr.length + c0]];
    }

    public String toString() {
        return A().toString();
    }

    public boolean u(int i2, h hVar, int i3, int i4) {
        int i5;
        i.e(hVar, "other");
        if (i2 < 0 || i2 > l() - i4) {
            return false;
        }
        int i6 = i4 + i2;
        int c0 = c.c0(this, i2);
        while (i2 < i6) {
            if (c0 == 0) {
                i5 = 0;
            } else {
                i5 = this.f10494n[c0 - 1];
            }
            int[] iArr = this.f10494n;
            int i7 = iArr[this.f10493m.length + c0];
            int min = Math.min(i6, (iArr[c0] - i5) + i5) - i2;
            if (!hVar.v(i3, this.f10493m[c0], (i2 - i5) + i7, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            c0++;
        }
        return true;
    }

    public boolean v(int i2, byte[] bArr, int i3, int i4) {
        int i5;
        i.e(bArr, "other");
        if (i2 < 0 || i2 > l() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i6 = i4 + i2;
        int c0 = c.c0(this, i2);
        while (i2 < i6) {
            if (c0 == 0) {
                i5 = 0;
            } else {
                i5 = this.f10494n[c0 - 1];
            }
            int[] iArr = this.f10494n;
            int i7 = iArr[this.f10493m.length + c0];
            int min = Math.min(i6, (iArr[c0] - i5) + i5) - i2;
            if (!c.h(this.f10493m[c0], (i2 - i5) + i7, bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            c0++;
        }
        return true;
    }

    public h w() {
        return A().w();
    }

    public byte[] x() {
        byte[] bArr = new byte[l()];
        int length = this.f10493m.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f10494n;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            g.f(this.f10493m[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    public void z(e eVar, int i2, int i3) {
        int i4;
        i.e(eVar, "buffer");
        int i5 = i3 + i2;
        int c0 = c.c0(this, i2);
        while (i2 < i5) {
            if (c0 == 0) {
                i4 = 0;
            } else {
                i4 = this.f10494n[c0 - 1];
            }
            int[] iArr = this.f10494n;
            int i6 = iArr[this.f10493m.length + c0];
            int min = Math.min(i5, (iArr[c0] - i4) + i4) - i2;
            int i7 = (i2 - i4) + i6;
            u uVar = new u(this.f10493m[c0], i7, i7 + min, true, false);
            u uVar2 = eVar.f10452h;
            if (uVar2 == null) {
                uVar.f10491g = uVar;
                uVar.f = uVar;
                eVar.f10452h = uVar;
            } else {
                i.c(uVar2);
                u uVar3 = uVar2.f10491g;
                i.c(uVar3);
                uVar3.b(uVar);
            }
            i2 += min;
            c0++;
        }
        eVar.f10453i += (long) l();
    }
}
