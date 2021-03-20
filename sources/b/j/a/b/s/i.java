package b.j.a.b.s;

import b.j.a.b.o;
import java.io.Serializable;

public class i implements o, Serializable {

    /* renamed from: l  reason: collision with root package name */
    public static final d f1483l = d.c;

    /* renamed from: h  reason: collision with root package name */
    public final String f1484h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f1485i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f1486j;

    /* renamed from: k  reason: collision with root package name */
    public char[] f1487k;

    public i(String str) {
        if (str != null) {
            this.f1484h = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    public final char[] a() {
        char[] cArr = this.f1487k;
        if (cArr != null) {
            return cArr;
        }
        char[] d = f1483l.d(this.f1484h);
        this.f1487k = d;
        return d;
    }

    public final byte[] b() {
        byte[] bArr = this.f1485i;
        if (bArr != null) {
            return bArr;
        }
        byte[] e2 = f1483l.e(this.f1484h);
        this.f1485i = e2;
        return e2;
    }

    public int c(char[] cArr, int i2) {
        char[] cArr2 = this.f1487k;
        if (cArr2 == null) {
            cArr2 = f1483l.d(this.f1484h);
            this.f1487k = cArr2;
        }
        int length = cArr2.length;
        if (i2 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArr2, 0, cArr, i2, length);
        return length;
    }

    public int d(byte[] bArr, int i2) {
        byte[] bArr2 = this.f1485i;
        if (bArr2 == null) {
            bArr2 = f1483l.e(this.f1484h);
            this.f1485i = bArr2;
        }
        int length = bArr2.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i2, length);
        return length;
    }

    public int e(char[] cArr, int i2) {
        String str = this.f1484h;
        int length = str.length();
        if (i2 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i2);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != i.class) {
            return false;
        }
        return this.f1484h.equals(((i) obj).f1484h);
    }

    public final byte[] f() {
        byte[] bArr = this.f1486j;
        if (bArr != null) {
            return bArr;
        }
        byte[] c = f1483l.c(this.f1484h);
        this.f1486j = c;
        return c;
    }

    public int g(byte[] bArr, int i2) {
        byte[] bArr2 = this.f1486j;
        if (bArr2 == null) {
            bArr2 = f1483l.c(this.f1484h);
            this.f1486j = bArr2;
        }
        int length = bArr2.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i2, length);
        return length;
    }

    public final String getValue() {
        return this.f1484h;
    }

    public final int hashCode() {
        return this.f1484h.hashCode();
    }

    public final String toString() {
        return this.f1484h;
    }
}
