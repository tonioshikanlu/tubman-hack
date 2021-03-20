package b.l.f.a0.a;

import b.e.a.a.a;

public final class b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5582b;
    public final byte[] c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5583e;
    public final String f;

    public b() {
        this.a = null;
        this.f5582b = null;
        this.c = null;
        this.d = null;
        this.f5583e = null;
        this.f = null;
    }

    public b(String str, String str2, byte[] bArr, Integer num, String str3, String str4) {
        this.a = str;
        this.f5582b = str2;
        this.c = bArr;
        this.d = num;
        this.f5583e = str3;
        this.f = str4;
    }

    public String toString() {
        byte[] bArr = this.c;
        int length = bArr == null ? 0 : bArr.length;
        StringBuilder y = a.y("Format: ");
        y.append(this.f5582b);
        y.append(10);
        y.append("Contents: ");
        y.append(this.a);
        y.append(10);
        y.append("Raw bytes: (");
        y.append(length);
        y.append(" bytes)\nOrientation: ");
        y.append(this.d);
        y.append(10);
        y.append("EC level: ");
        y.append(this.f5583e);
        y.append(10);
        y.append("Barcode image: ");
        return a.p(y, this.f, 10);
    }
}
