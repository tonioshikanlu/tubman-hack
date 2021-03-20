package o;

import e.t.g;
import e.x.c.i;

public final class u {
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f10489b;
    public int c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10490e;
    public u f;

    /* renamed from: g  reason: collision with root package name */
    public u f10491g;

    public u() {
        this.a = new byte[8192];
        this.f10490e = true;
        this.d = false;
    }

    public u(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        i.e(bArr, "data");
        this.a = bArr;
        this.f10489b = i2;
        this.c = i3;
        this.d = z;
        this.f10490e = z2;
    }

    public final u a() {
        u uVar = this.f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.f10491g;
        i.c(uVar2);
        uVar2.f = this.f;
        u uVar3 = this.f;
        i.c(uVar3);
        uVar3.f10491g = this.f10491g;
        this.f = null;
        this.f10491g = null;
        return uVar;
    }

    public final u b(u uVar) {
        i.e(uVar, "segment");
        uVar.f10491g = this;
        uVar.f = this.f;
        u uVar2 = this.f;
        i.c(uVar2);
        uVar2.f10491g = uVar;
        this.f = uVar;
        return uVar;
    }

    public final u c() {
        this.d = true;
        return new u(this.a, this.f10489b, this.c, true, false);
    }

    public final void d(u uVar, int i2) {
        i.e(uVar, "sink");
        if (uVar.f10490e) {
            int i3 = uVar.c;
            if (i3 + i2 > 8192) {
                if (!uVar.d) {
                    int i4 = uVar.f10489b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = uVar.a;
                        g.g(bArr, bArr, 0, i4, i3, 2);
                        uVar.c -= uVar.f10489b;
                        uVar.f10489b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = uVar.a;
            int i5 = uVar.c;
            int i6 = this.f10489b;
            g.f(bArr2, bArr3, i5, i6, i6 + i2);
            uVar.c += i2;
            this.f10489b += i2;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
