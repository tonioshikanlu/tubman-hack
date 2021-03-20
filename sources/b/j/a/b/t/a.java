package b.j.a.b.t;

import b.j.a.b.s.b;
import java.io.CharConversionException;
import java.io.InputStream;

public final class a {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final InputStream f1498b;
    public final byte[] c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f1499e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1500g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f1501h;

    public a(b bVar, InputStream inputStream) {
        this.a = bVar;
        this.f1498b = inputStream;
        bVar.a(bVar.f1468e);
        byte[] a2 = bVar.d.a(0);
        bVar.f1468e = a2;
        this.c = a2;
        this.d = 0;
        this.f1499e = 0;
        this.f = true;
    }

    public final boolean a(int i2) {
        if ((65280 & i2) == 0) {
            this.f1500g = true;
        } else if ((i2 & 255) != 0) {
            return false;
        } else {
            this.f1500g = false;
        }
        this.f1501h = 2;
        return true;
    }

    public boolean b(int i2) {
        int i3;
        int i4 = this.f1499e - this.d;
        while (i4 < i2) {
            InputStream inputStream = this.f1498b;
            if (inputStream == null) {
                i3 = -1;
            } else {
                byte[] bArr = this.c;
                int i5 = this.f1499e;
                i3 = inputStream.read(bArr, i5, bArr.length - i5);
            }
            if (i3 < 1) {
                return false;
            }
            this.f1499e += i3;
            i4 += i3;
        }
        return true;
    }

    public final void c(String str) {
        throw new CharConversionException(b.e.a.a.a.n("Unsupported UCS-4 endianness (", str, ") detected"));
    }
}
