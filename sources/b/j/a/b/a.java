package b.j.a.b;

import androidx.exifinterface.media.ExifInterface;
import b.j.a.b.w.c;
import java.io.Serializable;
import java.util.Arrays;

public final class a implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final transient int[] f1365h;

    /* renamed from: i  reason: collision with root package name */
    public final transient char[] f1366i;

    /* renamed from: j  reason: collision with root package name */
    public final transient byte[] f1367j;

    /* renamed from: k  reason: collision with root package name */
    public final String f1368k;

    /* renamed from: l  reason: collision with root package name */
    public final transient boolean f1369l;

    /* renamed from: m  reason: collision with root package name */
    public final transient char f1370m;

    /* renamed from: n  reason: collision with root package name */
    public final transient int f1371n;

    public a(a aVar, String str, boolean z, char c, int i2) {
        int[] iArr = new int[128];
        this.f1365h = iArr;
        char[] cArr = new char[64];
        this.f1366i = cArr;
        byte[] bArr = new byte[64];
        this.f1367j = bArr;
        this.f1368k = str;
        byte[] bArr2 = aVar.f1367j;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = aVar.f1366i;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = aVar.f1365h;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f1369l = z;
        this.f1370m = c;
        this.f1371n = i2;
    }

    public a(String str, String str2, boolean z, char c, int i2) {
        int[] iArr = new int[128];
        this.f1365h = iArr;
        char[] cArr = new char[64];
        this.f1366i = cArr;
        this.f1367j = new byte[64];
        this.f1368k = str;
        this.f1369l = z;
        this.f1370m = c;
        this.f1371n = i2;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, cArr, 0);
            Arrays.fill(iArr, -1);
            for (int i3 = 0; i3 < length; i3++) {
                char c2 = this.f1366i[i3];
                this.f1367j[i3] = (byte) c2;
                this.f1365h[c2] = i3;
            }
            if (z) {
                this.f1365h[c] = -2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(b.e.a.a.a.h("Base64Alphabet length must be exactly 64 (was ", length, ")"));
    }

    public void a() {
        throw new IllegalArgumentException(k());
    }

    public void b(char c, int i2, String str) {
        String str2;
        StringBuilder sb;
        String str3;
        if (c <= ' ') {
            StringBuilder y = b.e.a.a.a.y("Illegal white space character (code 0x");
            y.append(Integer.toHexString(c));
            y.append(") as character #");
            y.append(i2 + 1);
            y.append(" of 4-char base64 unit: can only used between units");
            str2 = y.toString();
        } else {
            if (c == this.f1370m) {
                StringBuilder y2 = b.e.a.a.a.y("Unexpected padding character ('");
                y2.append(this.f1370m);
                y2.append("') as character #");
                y2.append(i2 + 1);
                y2.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
                str2 = y2.toString();
            } else {
                if (!Character.isDefined(c) || Character.isISOControl(c)) {
                    sb = new StringBuilder();
                    str3 = "Illegal character (code 0x";
                } else {
                    sb = new StringBuilder();
                    sb.append("Illegal character '");
                    sb.append(c);
                    str3 = "' (code 0x";
                }
                sb.append(str3);
                sb.append(Integer.toHexString(c));
                sb.append(") in base64 content");
                str2 = sb.toString();
            }
        }
        if (str != null) {
            str2 = b.e.a.a.a.n(str2, ": ", str);
        }
        throw new IllegalArgumentException(str2);
    }

    public void c(String str, c cVar) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt > ' ') {
                int d = d(charAt);
                if (d < 0) {
                    b(charAt, 0, (String) null);
                    throw null;
                } else if (i3 < length) {
                    int i4 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    int d2 = d(charAt2);
                    if (d2 >= 0) {
                        int i5 = (d << 6) | d2;
                        if (i4 < length) {
                            int i6 = i4 + 1;
                            char charAt3 = str.charAt(i4);
                            int d3 = d(charAt3);
                            if (d3 >= 0) {
                                int i7 = (i5 << 6) | d3;
                                if (i6 < length) {
                                    i3 = i6 + 1;
                                    char charAt4 = str.charAt(i6);
                                    int d4 = d(charAt4);
                                    if (d4 >= 0) {
                                        cVar.q((i7 << 6) | d4);
                                    } else if (d4 == -2) {
                                        cVar.z(i7 >> 2);
                                    } else {
                                        b(charAt4, 3, (String) null);
                                        throw null;
                                    }
                                } else if (!this.f1369l) {
                                    cVar.z(i7 >> 2);
                                    return;
                                } else {
                                    a();
                                    throw null;
                                }
                            } else if (d3 != -2) {
                                b(charAt3, 2, (String) null);
                                throw null;
                            } else if (i6 < length) {
                                i2 = i6 + 1;
                                char charAt5 = str.charAt(i6);
                                if (l(charAt5)) {
                                    cVar.e(i5 >> 4);
                                } else {
                                    StringBuilder y = b.e.a.a.a.y("expected padding character '");
                                    y.append(this.f1370m);
                                    y.append("'");
                                    b(charAt5, 3, y.toString());
                                    throw null;
                                }
                            } else {
                                a();
                                throw null;
                            }
                        } else if (!this.f1369l) {
                            cVar.e(i5 >> 4);
                            return;
                        } else {
                            a();
                            throw null;
                        }
                    } else {
                        b(charAt2, 1, (String) null);
                        throw null;
                    }
                } else {
                    a();
                    throw null;
                }
            }
            i2 = i3;
        }
    }

    public int d(char c) {
        if (c <= 127) {
            return this.f1365h[c];
        }
        return -1;
    }

    public int e(int i2) {
        if (i2 <= 127) {
            return this.f1365h[i2];
        }
        return -1;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public String f(byte[] bArr, boolean z) {
        char c;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append('\"');
        }
        int i2 = this.f1371n >> 2;
        int i3 = 0;
        int i4 = length - 3;
        while (i3 <= i4) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            byte b2 = (((bArr[i3] << 8) | (bArr[i5] & ExifInterface.MARKER)) << 8) | (bArr[i6] & ExifInterface.MARKER);
            sb.append(this.f1366i[(b2 >> 18) & 63]);
            sb.append(this.f1366i[(b2 >> 12) & 63]);
            sb.append(this.f1366i[(b2 >> 6) & 63]);
            sb.append(this.f1366i[b2 & 63]);
            i2--;
            if (i2 <= 0) {
                sb.append('\\');
                sb.append('n');
                i2 = this.f1371n >> 2;
            }
            i3 = i7;
        }
        int i8 = length - i3;
        if (i8 > 0) {
            int i9 = i3 + 1;
            int i10 = bArr[i3] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & ExifInterface.MARKER) << 8;
            }
            sb.append(this.f1366i[(i10 >> 18) & 63]);
            sb.append(this.f1366i[(i10 >> 12) & 63]);
            if (this.f1369l) {
                sb.append(i8 == 2 ? this.f1366i[(i10 >> 6) & 63] : this.f1370m);
                c = this.f1370m;
            } else if (i8 == 2) {
                c = this.f1366i[(i10 >> 6) & 63];
            }
            sb.append(c);
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public int g(int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this.f1367j;
        bArr[i3] = bArr2[(i2 >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i2 >> 12) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[(i2 >> 6) & 63];
        int i7 = i6 + 1;
        bArr[i6] = bArr2[i2 & 63];
        return i7;
    }

    public int h(int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this.f1366i;
        cArr[i3] = cArr2[(i2 >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i2 >> 12) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[(i2 >> 6) & 63];
        int i7 = i6 + 1;
        cArr[i6] = cArr2[i2 & 63];
        return i7;
    }

    public int hashCode() {
        return this.f1368k.hashCode();
    }

    public int i(int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4 + 1;
        byte[] bArr2 = this.f1367j;
        bArr[i4] = bArr2[(i2 >> 18) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[(i2 >> 12) & 63];
        if (this.f1369l) {
            byte b2 = (byte) this.f1370m;
            int i7 = i6 + 1;
            bArr[i6] = i3 == 2 ? bArr2[(i2 >> 6) & 63] : b2;
            int i8 = i7 + 1;
            bArr[i7] = b2;
            return i8;
        } else if (i3 != 2) {
            return i6;
        } else {
            bArr[i6] = bArr2[(i2 >> 6) & 63];
            return i6 + 1;
        }
    }

    public int j(int i2, int i3, char[] cArr, int i4) {
        int i5 = i4 + 1;
        char[] cArr2 = this.f1366i;
        cArr[i4] = cArr2[(i2 >> 18) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[(i2 >> 12) & 63];
        if (this.f1369l) {
            int i7 = i6 + 1;
            cArr[i6] = i3 == 2 ? cArr2[(i2 >> 6) & 63] : this.f1370m;
            int i8 = i7 + 1;
            cArr[i7] = this.f1370m;
            return i8;
        } else if (i3 != 2) {
            return i6;
        } else {
            cArr[i6] = cArr2[(i2 >> 6) & 63];
            return i6 + 1;
        }
    }

    public String k() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end", new Object[]{this.f1368k, Character.valueOf(this.f1370m)});
    }

    public boolean l(char c) {
        return c == this.f1370m;
    }

    public boolean m(int i2) {
        return i2 == this.f1370m;
    }

    public String toString() {
        return this.f1368k;
    }
}
