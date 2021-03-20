package b.j.a.b.s;

import b.j.a.b.c;
import b.j.a.b.w.a;

public class b {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public c f1467b;
    public final boolean c;
    public final a d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f1468e;
    public byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f1469g;

    /* renamed from: h  reason: collision with root package name */
    public char[] f1470h;

    /* renamed from: i  reason: collision with root package name */
    public char[] f1471i;

    /* renamed from: j  reason: collision with root package name */
    public char[] f1472j;

    public b(a aVar, Object obj, boolean z) {
        this.d = aVar;
        this.a = obj;
        this.c = z;
    }

    public final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public byte[] d() {
        a(this.f1469g);
        byte[] a2 = this.d.a(3);
        this.f1469g = a2;
        return a2;
    }

    public void e(byte[] bArr) {
        b(bArr, this.f1469g);
        this.f1469g = null;
        this.d.a.set(3, bArr);
    }

    public void f(byte[] bArr) {
        b(bArr, this.f1468e);
        this.f1468e = null;
        this.d.a.set(0, bArr);
    }
}
