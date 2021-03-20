package b.j.a.b.t;

import androidx.exifinterface.media.ExifInterface;
import b.j.a.b.e;
import b.j.a.b.f;
import b.j.a.b.m;
import b.j.a.b.n;
import b.j.a.b.o;
import b.j.a.b.s.a;
import b.j.a.b.s.b;
import b.j.a.b.s.g;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class i extends c {
    public static final char[] A = ((char[]) a.a.clone());
    public final Writer t;
    public char u;
    public char[] v;
    public int w;
    public int x;
    public int y;
    public char[] z;

    public i(b bVar, int i2, m mVar, Writer writer, char c) {
        super(bVar, i2, mVar);
        this.t = writer;
        bVar.a(bVar.f1471i);
        char[] b2 = bVar.d.b(1, 0);
        bVar.f1471i = b2;
        this.v = b2;
        this.y = b2.length;
        this.u = c;
        if (c != '\"') {
            this.f1504o = a.b(c);
        }
    }

    public void A0(BigDecimal bigDecimal) {
        W0("write a number");
        if (bigDecimal == null) {
            j1();
            return;
        }
        boolean z2 = this.f1449k;
        String U0 = U0(bigDecimal);
        if (z2) {
            k1(U0);
        } else {
            H0(U0);
        }
    }

    public void B0(BigInteger bigInteger) {
        W0("write a number");
        if (bigInteger == null) {
            j1();
            return;
        }
        boolean z2 = this.f1449k;
        String bigInteger2 = bigInteger.toString();
        if (z2) {
            k1(bigInteger2);
        } else {
            H0(bigInteger2);
        }
    }

    public void C0(short s) {
        W0("write a number");
        if (this.f1449k) {
            if (this.x + 8 >= this.y) {
                d1();
            }
            char[] cArr = this.v;
            int i2 = this.x;
            int i3 = i2 + 1;
            this.x = i3;
            cArr[i2] = this.u;
            int j2 = g.j(s, cArr, i3);
            this.x = j2;
            char[] cArr2 = this.v;
            this.x = j2 + 1;
            cArr2[j2] = this.u;
            return;
        }
        if (this.x + 6 >= this.y) {
            d1();
        }
        this.x = g.j(s, this.v, this.x);
    }

    public void F0(char c) {
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i2 = this.x;
        this.x = i2 + 1;
        cArr[i2] = c;
    }

    public void G0(o oVar) {
        int e2 = oVar.e(this.v, this.x);
        if (e2 < 0) {
            H0(oVar.getValue());
        } else {
            this.x += e2;
        }
    }

    public void H0(String str) {
        int length = str.length();
        int i2 = this.y - this.x;
        if (i2 == 0) {
            d1();
            i2 = this.y - this.x;
        }
        if (i2 >= length) {
            str.getChars(0, length, this.v, this.x);
            this.x += length;
            return;
        }
        int i3 = this.y;
        int i4 = this.x;
        int i5 = i3 - i4;
        str.getChars(0, i5, this.v, i4);
        this.x += i5;
        d1();
        int length2 = str.length() - i5;
        while (true) {
            int i6 = this.y;
            if (length2 > i6) {
                int i7 = i5 + i6;
                str.getChars(i5, i7, this.v, 0);
                this.w = 0;
                this.x = i6;
                d1();
                length2 -= i6;
                i5 = i7;
            } else {
                str.getChars(i5, i5 + length2, this.v, 0);
                this.w = 0;
                this.x = length2;
                return;
            }
        }
    }

    public void I0(char[] cArr, int i2, int i3) {
        if (i3 < 32) {
            if (i3 > this.y - this.x) {
                d1();
            }
            System.arraycopy(cArr, i2, this.v, this.x, i3);
            this.x += i3;
            return;
        }
        d1();
        this.t.write(cArr, i2, i3);
    }

    public void L0() {
        W0("start an array");
        this.f1450l = this.f1450l.j();
        n nVar = this.f1399h;
        if (nVar != null) {
            nVar.k(this);
            return;
        }
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i2 = this.x;
        this.x = i2 + 1;
        cArr[i2] = '[';
    }

    public void M0(int i2) {
        W0("start an array");
        this.f1450l = this.f1450l.j();
        n nVar = this.f1399h;
        if (nVar != null) {
            nVar.k(this);
            return;
        }
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i3 = this.x;
        this.x = i3 + 1;
        cArr[i3] = '[';
    }

    public void N0() {
        W0("start an object");
        this.f1450l = this.f1450l.k();
        n nVar = this.f1399h;
        if (nVar != null) {
            nVar.a(this);
            return;
        }
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i2 = this.x;
        this.x = i2 + 1;
        cArr[i2] = '{';
    }

    public void O0(Object obj) {
        W0("start an object");
        this.f1450l = this.f1450l.l(obj);
        n nVar = this.f1399h;
        if (nVar != null) {
            nVar.a(this);
            return;
        }
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i2 = this.x;
        this.x = i2 + 1;
        cArr[i2] = '{';
    }

    public void P0(o oVar) {
        W0("write a string");
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i2 = this.x;
        int i3 = i2 + 1;
        this.x = i3;
        cArr[i2] = this.u;
        int c = oVar.c(cArr, i3);
        if (c < 0) {
            char[] a = oVar.a();
            int length = a.length;
            if (length < 32) {
                if (length > this.y - this.x) {
                    d1();
                }
                System.arraycopy(a, 0, this.v, this.x, length);
                this.x += length;
            } else {
                d1();
                this.t.write(a, 0, length);
            }
            if (this.x >= this.y) {
                d1();
            }
            char[] cArr2 = this.v;
            int i4 = this.x;
            this.x = i4 + 1;
            cArr2[i4] = this.u;
            return;
        }
        int i5 = this.x + c;
        this.x = i5;
        if (i5 >= this.y) {
            d1();
        }
        char[] cArr3 = this.v;
        int i6 = this.x;
        this.x = i6 + 1;
        cArr3[i6] = this.u;
    }

    public void Q0(String str) {
        W0("write a string");
        if (str == null) {
            j1();
            return;
        }
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i2 = this.x;
        this.x = i2 + 1;
        cArr[i2] = this.u;
        l1(str);
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr2 = this.v;
        int i3 = this.x;
        this.x = i3 + 1;
        cArr2[i3] = this.u;
    }

    public void R0(char[] cArr, int i2, int i3) {
        char c;
        W0("write a string");
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr2 = this.v;
        int i4 = this.x;
        this.x = i4 + 1;
        cArr2[i4] = this.u;
        int i5 = this.f1505p;
        int i6 = i3 + i2;
        if (i5 != 0) {
            int[] iArr = this.f1504o;
            int min = Math.min(iArr.length, i5 + 1);
            int i7 = 0;
            while (i2 < i6) {
                int i8 = i2;
                while (true) {
                    c = cArr[i8];
                    if (c >= min) {
                        if (c > i5) {
                            i7 = -1;
                            break;
                        }
                    } else {
                        i7 = iArr[c];
                        if (i7 != 0) {
                            break;
                        }
                    }
                    i8++;
                    if (i8 >= i6) {
                        break;
                    }
                }
                int i9 = i8 - i2;
                if (i9 < 32) {
                    if (this.x + i9 > this.y) {
                        d1();
                    }
                    if (i9 > 0) {
                        System.arraycopy(cArr, i2, this.v, this.x, i9);
                        this.x += i9;
                    }
                } else {
                    d1();
                    this.t.write(cArr, i2, i9);
                }
                if (i8 >= i6) {
                    break;
                }
                i2 = i8 + 1;
                c1(c, i7);
            }
        } else {
            int[] iArr2 = this.f1504o;
            int length = iArr2.length;
            while (i2 < i6) {
                int i10 = i2;
                do {
                    char c2 = cArr[i10];
                    if ((c2 < length && iArr2[c2] != 0) || (i10 = i10 + 1) >= i6) {
                        int i11 = i10 - i2;
                    }
                    char c22 = cArr[i10];
                    break;
                } while ((i10 = i10 + 1) >= i6);
                int i112 = i10 - i2;
                if (i112 < 32) {
                    if (this.x + i112 > this.y) {
                        d1();
                    }
                    if (i112 > 0) {
                        System.arraycopy(cArr, i2, this.v, this.x, i112);
                        this.x += i112;
                    }
                } else {
                    d1();
                    this.t.write(cArr, i2, i112);
                }
                if (i10 >= i6) {
                    break;
                }
                i2 = i10 + 1;
                char c3 = cArr[i10];
                c1(c3, iArr2[c3]);
            }
        }
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr3 = this.v;
        int i12 = this.x;
        this.x = i12 + 1;
        cArr3[i12] = this.u;
    }

    public final void W0(String str) {
        char c;
        int p2 = this.f1450l.p();
        if (this.f1399h != null) {
            Z0(str, p2);
            return;
        }
        if (p2 == 1) {
            c = ',';
        } else if (p2 == 2) {
            c = ':';
        } else if (p2 == 3) {
            o oVar = this.f1506q;
            if (oVar != null) {
                H0(oVar.getValue());
                return;
            }
            return;
        } else if (p2 == 5) {
            Y0(str);
            throw null;
        } else {
            return;
        }
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i2 = this.x;
        this.x = i2 + 1;
        cArr[i2] = c;
    }

    public final char[] b1() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this.z = cArr;
        return cArr;
    }

    public final void c1(char c, int i2) {
        int i3;
        if (i2 >= 0) {
            if (this.x + 2 > this.y) {
                d1();
            }
            char[] cArr = this.v;
            int i4 = this.x;
            int i5 = i4 + 1;
            this.x = i5;
            cArr[i4] = '\\';
            this.x = i5 + 1;
            cArr[i5] = (char) i2;
        } else if (i2 != -2) {
            if (this.x + 5 >= this.y) {
                d1();
            }
            int i6 = this.x;
            char[] cArr2 = this.v;
            int i7 = i6 + 1;
            cArr2[i6] = '\\';
            int i8 = i7 + 1;
            cArr2[i7] = 'u';
            if (c > 255) {
                int i9 = 255 & (c >> 8);
                int i10 = i8 + 1;
                char[] cArr3 = A;
                cArr2[i8] = cArr3[i9 >> 4];
                i3 = i10 + 1;
                cArr2[i10] = cArr3[i9 & 15];
                c = (char) (c & 255);
            } else {
                int i11 = i8 + 1;
                cArr2[i8] = '0';
                i3 = i11 + 1;
                cArr2[i11] = '0';
            }
            int i12 = i3 + 1;
            char[] cArr4 = A;
            cArr2[i3] = cArr4[c >> 4];
            cArr2[i12] = cArr4[c & 15];
            this.x = i12 + 1;
        } else {
            throw null;
        }
    }

    public void close() {
        if (this.v != null && X0(f.a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                e eVar = this.f1450l;
                if (!eVar.d()) {
                    if (!eVar.e()) {
                        break;
                    }
                    r0();
                } else {
                    q0();
                }
            }
        }
        d1();
        this.w = 0;
        this.x = 0;
        if (this.t != null) {
            if (this.f1503n.c || X0(f.a.AUTO_CLOSE_TARGET)) {
                this.t.close();
            } else if (X0(f.a.FLUSH_PASSED_TO_STREAM)) {
                this.t.flush();
            }
        }
        char[] cArr = this.v;
        if (cArr != null) {
            this.v = null;
            b bVar = this.f1503n;
            Objects.requireNonNull(bVar);
            bVar.c(cArr, bVar.f1471i);
            bVar.f1471i = null;
            bVar.d.f1548b.set(1, cArr);
        }
    }

    public void d1() {
        int i2 = this.x;
        int i3 = this.w;
        int i4 = i2 - i3;
        if (i4 > 0) {
            this.w = 0;
            this.x = 0;
            this.t.write(this.v, i3, i4);
        }
    }

    public final int e1(char[] cArr, int i2, int i3, char c, int i4) {
        int i5;
        if (i4 >= 0) {
            if (i2 <= 1 || i2 >= i3) {
                char[] cArr2 = this.z;
                if (cArr2 == null) {
                    cArr2 = b1();
                }
                cArr2[1] = (char) i4;
                this.t.write(cArr2, 0, 2);
                return i2;
            }
            int i6 = i2 - 2;
            cArr[i6] = '\\';
            cArr[i6 + 1] = (char) i4;
            return i6;
        } else if (i4 == -2) {
            throw null;
        } else if (i2 <= 5 || i2 >= i3) {
            char[] cArr3 = this.z;
            if (cArr3 == null) {
                cArr3 = b1();
            }
            this.w = this.x;
            if (c > 255) {
                int i7 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr4 = A;
                cArr3[10] = cArr4[i7 >> 4];
                cArr3[11] = cArr4[i7 & 15];
                cArr3[12] = cArr4[c2 >> 4];
                cArr3[13] = cArr4[c2 & 15];
                this.t.write(cArr3, 8, 6);
                return i2;
            }
            char[] cArr5 = A;
            cArr3[6] = cArr5[c >> 4];
            cArr3[7] = cArr5[c & 15];
            this.t.write(cArr3, 2, 6);
            return i2;
        } else {
            int i8 = i2 - 6;
            int i9 = i8 + 1;
            cArr[i8] = '\\';
            int i10 = i9 + 1;
            cArr[i9] = 'u';
            if (c > 255) {
                int i11 = (c >> 8) & 255;
                int i12 = i10 + 1;
                char[] cArr6 = A;
                cArr[i10] = cArr6[i11 >> 4];
                i5 = i12 + 1;
                cArr[i12] = cArr6[i11 & 15];
                c = (char) (c & 255);
            } else {
                int i13 = i10 + 1;
                cArr[i10] = '0';
                i5 = i13 + 1;
                cArr[i13] = '0';
            }
            int i14 = i5 + 1;
            char[] cArr7 = A;
            cArr[i5] = cArr7[c >> 4];
            cArr[i14] = cArr7[c & 15];
            return i14 - 5;
        }
    }

    public final void f1(char c, int i2) {
        int i3;
        if (i2 >= 0) {
            int i4 = this.x;
            if (i4 >= 2) {
                int i5 = i4 - 2;
                this.w = i5;
                char[] cArr = this.v;
                cArr[i5] = '\\';
                cArr[i5 + 1] = (char) i2;
                return;
            }
            char[] cArr2 = this.z;
            if (cArr2 == null) {
                cArr2 = b1();
            }
            this.w = this.x;
            cArr2[1] = (char) i2;
            this.t.write(cArr2, 0, 2);
        } else if (i2 != -2) {
            int i6 = this.x;
            if (i6 >= 6) {
                char[] cArr3 = this.v;
                int i7 = i6 - 6;
                this.w = i7;
                cArr3[i7] = '\\';
                int i8 = i7 + 1;
                cArr3[i8] = 'u';
                if (c > 255) {
                    int i9 = (c >> 8) & 255;
                    int i10 = i8 + 1;
                    char[] cArr4 = A;
                    cArr3[i10] = cArr4[i9 >> 4];
                    i3 = i10 + 1;
                    cArr3[i3] = cArr4[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr3[i11] = '0';
                    i3 = i11 + 1;
                    cArr3[i3] = '0';
                }
                int i12 = i3 + 1;
                char[] cArr5 = A;
                cArr3[i12] = cArr5[c >> 4];
                cArr3[i12 + 1] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this.z;
            if (cArr6 == null) {
                cArr6 = b1();
            }
            this.w = this.x;
            if (c > 255) {
                int i13 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr7 = A;
                cArr6[10] = cArr7[i13 >> 4];
                cArr6[11] = cArr7[i13 & 15];
                cArr6[12] = cArr7[c2 >> 4];
                cArr6[13] = cArr7[c2 & 15];
                this.t.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = A;
            cArr6[6] = cArr8[c >> 4];
            cArr6[7] = cArr8[c & 15];
            this.t.write(cArr6, 2, 6);
        } else {
            throw null;
        }
    }

    public void flush() {
        d1();
        if (this.t != null && X0(f.a.FLUSH_PASSED_TO_STREAM)) {
            this.t.flush();
        }
    }

    public final int g1(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        while (i2 < i3) {
            bArr[i5] = bArr[i2];
            i5++;
            i2++;
        }
        int min = Math.min(i4, bArr.length);
        do {
            int i6 = min - i5;
            if (i6 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i5, i6);
            if (read < 0) {
                return i5;
            }
            i5 += read;
        } while (i5 < 3);
        return i5;
    }

    public final int h1(b.j.a.b.a aVar, InputStream inputStream, byte[] bArr) {
        int i2 = this.y - 6;
        int i3 = 2;
        int i4 = aVar.f1371n >> 2;
        int i5 = -3;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i6 > i5) {
                i7 = g1(inputStream, bArr, i6, i7, bArr.length);
                if (i7 < 3) {
                    break;
                }
                i5 = i7 - 3;
                i6 = 0;
            }
            if (this.x > i2) {
                d1();
            }
            int i9 = i6 + 1;
            int i10 = i9 + 1;
            i6 = i10 + 1;
            i8 += 3;
            int h2 = aVar.h((((bArr[i9] & ExifInterface.MARKER) | (bArr[i6] << 8)) << 8) | (bArr[i10] & ExifInterface.MARKER), this.v, this.x);
            this.x = h2;
            i4--;
            if (i4 <= 0) {
                char[] cArr = this.v;
                int i11 = h2 + 1;
                this.x = i11;
                cArr[h2] = '\\';
                this.x = i11 + 1;
                cArr[i11] = 'n';
                i4 = aVar.f1371n >> 2;
            }
        }
        if (i7 <= 0) {
            return i8;
        }
        if (this.x > i2) {
            d1();
        }
        int i12 = bArr[0] << 16;
        if (1 < i7) {
            i12 |= (bArr[1] & ExifInterface.MARKER) << 8;
        } else {
            i3 = 1;
        }
        int i13 = i8 + i3;
        this.x = aVar.j(i12, i3, this.v, this.x);
        return i13;
    }

    public final int i1(b.j.a.b.a aVar, InputStream inputStream, byte[] bArr, int i2) {
        int g1;
        int i3 = this.y - 6;
        int i4 = 2;
        int i5 = aVar.f1371n >> 2;
        int i6 = -3;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i2 <= 2) {
                break;
            }
            if (i7 > i6) {
                i8 = g1(inputStream, bArr, i7, i8, i2);
                if (i8 < 3) {
                    i7 = 0;
                    break;
                }
                i6 = i8 - 3;
                i7 = 0;
            }
            if (this.x > i3) {
                d1();
            }
            int i9 = i7 + 1;
            int i10 = i9 + 1;
            i7 = i10 + 1;
            i2 -= 3;
            int h2 = aVar.h((((bArr[i9] & ExifInterface.MARKER) | (bArr[i7] << 8)) << 8) | (bArr[i10] & ExifInterface.MARKER), this.v, this.x);
            this.x = h2;
            i5--;
            if (i5 <= 0) {
                char[] cArr = this.v;
                int i11 = h2 + 1;
                this.x = i11;
                cArr[h2] = '\\';
                this.x = i11 + 1;
                cArr[i11] = 'n';
                i5 = aVar.f1371n >> 2;
            }
        }
        if (i2 <= 0 || (g1 = g1(inputStream, bArr, i7, i8, i2)) <= 0) {
            return i2;
        }
        if (this.x > i3) {
            d1();
        }
        int i12 = bArr[0] << 16;
        if (1 < g1) {
            i12 |= (bArr[1] & ExifInterface.MARKER) << 8;
        } else {
            i4 = 1;
        }
        this.x = aVar.j(i12, i4, this.v, this.x);
        return i2 - i4;
    }

    public final void j1() {
        if (this.x + 4 >= this.y) {
            d1();
        }
        int i2 = this.x;
        char[] cArr = this.v;
        cArr[i2] = 'n';
        int i3 = i2 + 1;
        cArr[i3] = 'u';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        int i5 = i4 + 1;
        cArr[i5] = 'l';
        this.x = i5 + 1;
    }

    public int k0(b.j.a.b.a aVar, InputStream inputStream, int i2) {
        W0("write a binary value");
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i3 = this.x;
        this.x = i3 + 1;
        cArr[i3] = this.u;
        byte[] d = this.f1503n.d();
        if (i2 < 0) {
            try {
                i2 = h1(aVar, inputStream, d);
            } catch (Throwable th) {
                this.f1503n.e(d);
                throw th;
            }
        } else {
            int i1 = i1(aVar, inputStream, d, i2);
            if (i1 > 0) {
                throw new e("Too few bytes available: missing " + i1 + " bytes (out of " + i2 + ")", this);
            }
        }
        this.f1503n.e(d);
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr2 = this.v;
        int i4 = this.x;
        this.x = i4 + 1;
        cArr2[i4] = this.u;
        return i2;
    }

    public final void k1(String str) {
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i2 = this.x;
        this.x = i2 + 1;
        cArr[i2] = this.u;
        H0(str);
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr2 = this.v;
        int i3 = this.x;
        this.x = i3 + 1;
        cArr2[i3] = this.u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010a, code lost:
        r5 = r6.w;
        r4 = r4 - r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010d, code lost:
        if (r4 <= 0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010f, code lost:
        r6.t.write(r3, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0114, code lost:
        r3 = r6.v;
        r4 = r6.x;
        r6.x = r4 + 1;
        r3 = r3[r4];
        f1(r3, r0[r3]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x012a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l1(java.lang.String r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            int r0 = r19.length()
            int r1 = r6.y
            r8 = -1
            r9 = 0
            if (r0 <= r1) goto L_0x00a6
            r18.d1()
            int r10 = r19.length()
            r0 = r9
        L_0x0016:
            int r1 = r6.y
            int r2 = r0 + r1
            if (r2 <= r10) goto L_0x001e
            int r1 = r10 - r0
        L_0x001e:
            r11 = r1
            int r12 = r0 + r11
            char[] r1 = r6.v
            r7.getChars(r0, r12, r1, r9)
            int r13 = r6.f1505p
            if (r13 == 0) goto L_0x006e
            int[] r14 = r6.f1504o
            int r0 = r14.length
            int r1 = r13 + 1
            int r15 = java.lang.Math.min(r0, r1)
            r0 = r9
            r1 = r0
            r2 = r1
        L_0x0036:
            if (r0 >= r11) goto L_0x00a0
        L_0x0038:
            char[] r3 = r6.v
            char r4 = r3[r0]
            if (r4 >= r15) goto L_0x0043
            r2 = r14[r4]
            if (r2 == 0) goto L_0x0048
            goto L_0x004c
        L_0x0043:
            if (r4 <= r13) goto L_0x0048
            r16 = r8
            goto L_0x004e
        L_0x0048:
            int r0 = r0 + 1
            if (r0 < r11) goto L_0x0038
        L_0x004c:
            r16 = r2
        L_0x004e:
            int r2 = r0 - r1
            if (r2 <= 0) goto L_0x005a
            java.io.Writer r5 = r6.t
            r5.write(r3, r1, r2)
            if (r0 < r11) goto L_0x005a
            goto L_0x00a0
        L_0x005a:
            int r17 = r0 + 1
            char[] r1 = r6.v
            r0 = r18
            r2 = r17
            r3 = r11
            r5 = r16
            int r1 = r0.e1(r1, r2, r3, r4, r5)
            r2 = r16
            r0 = r17
            goto L_0x0036
        L_0x006e:
            int[] r13 = r6.f1504o
            int r14 = r13.length
            r0 = r9
            r1 = r0
        L_0x0073:
            if (r0 >= r11) goto L_0x00a0
        L_0x0075:
            char[] r2 = r6.v
            char r4 = r2[r0]
            if (r4 >= r14) goto L_0x0080
            r3 = r13[r4]
            if (r3 == 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            int r0 = r0 + 1
            if (r0 < r11) goto L_0x0075
        L_0x0084:
            int r3 = r0 - r1
            if (r3 <= 0) goto L_0x0090
            java.io.Writer r5 = r6.t
            r5.write(r2, r1, r3)
            if (r0 < r11) goto L_0x0090
            goto L_0x00a0
        L_0x0090:
            int r15 = r0 + 1
            char[] r1 = r6.v
            r5 = r13[r4]
            r0 = r18
            r2 = r15
            r3 = r11
            int r1 = r0.e1(r1, r2, r3, r4, r5)
            r0 = r15
            goto L_0x0073
        L_0x00a0:
            if (r12 < r10) goto L_0x00a3
            return
        L_0x00a3:
            r0 = r12
            goto L_0x0016
        L_0x00a6:
            int r2 = r6.x
            int r2 = r2 + r0
            if (r2 <= r1) goto L_0x00ae
            r18.d1()
        L_0x00ae:
            char[] r1 = r6.v
            int r2 = r6.x
            r7.getChars(r9, r0, r1, r2)
            int r1 = r6.f1505p
            if (r1 == 0) goto L_0x00f4
            int r2 = r6.x
            int r2 = r2 + r0
            int[] r0 = r6.f1504o
            int r3 = r0.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
        L_0x00c5:
            int r4 = r6.x
            if (r4 >= r2) goto L_0x012a
        L_0x00c9:
            char[] r4 = r6.v
            int r5 = r6.x
            char r7 = r4[r5]
            if (r7 >= r3) goto L_0x00d6
            r9 = r0[r7]
            if (r9 == 0) goto L_0x00ed
            goto L_0x00d9
        L_0x00d6:
            if (r7 <= r1) goto L_0x00ed
            r9 = r8
        L_0x00d9:
            int r10 = r6.w
            int r5 = r5 - r10
            if (r5 <= 0) goto L_0x00e3
            java.io.Writer r11 = r6.t
            r11.write(r4, r10, r5)
        L_0x00e3:
            int r4 = r6.x
            int r4 = r4 + 1
            r6.x = r4
            r6.f1(r7, r9)
            goto L_0x00c5
        L_0x00ed:
            int r5 = r5 + 1
            r6.x = r5
            if (r5 < r2) goto L_0x00c9
            goto L_0x012a
        L_0x00f4:
            int r1 = r6.x
            int r1 = r1 + r0
            int[] r0 = r6.f1504o
            int r2 = r0.length
        L_0x00fa:
            int r3 = r6.x
            if (r3 >= r1) goto L_0x012a
        L_0x00fe:
            char[] r3 = r6.v
            int r4 = r6.x
            char r5 = r3[r4]
            if (r5 >= r2) goto L_0x0124
            r5 = r0[r5]
            if (r5 == 0) goto L_0x0124
            int r5 = r6.w
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x0114
            java.io.Writer r7 = r6.t
            r7.write(r3, r5, r4)
        L_0x0114:
            char[] r3 = r6.v
            int r4 = r6.x
            int r5 = r4 + 1
            r6.x = r5
            char r3 = r3[r4]
            r4 = r0[r3]
            r6.f1(r3, r4)
            goto L_0x00fa
        L_0x0124:
            int r4 = r4 + 1
            r6.x = r4
            if (r4 < r1) goto L_0x00fe
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.i.l1(java.lang.String):void");
    }

    public void m0(b.j.a.b.a aVar, byte[] bArr, int i2, int i3) {
        W0("write a binary value");
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr = this.v;
        int i4 = this.x;
        this.x = i4 + 1;
        cArr[i4] = this.u;
        int i5 = i3 + i2;
        int i6 = i5 - 3;
        int i7 = this.y - 6;
        int i8 = aVar.f1371n >> 2;
        while (i2 <= i6) {
            if (this.x > i7) {
                d1();
            }
            int i9 = i2 + 1;
            int i10 = i9 + 1;
            int i11 = i10 + 1;
            int h2 = aVar.h((((bArr[i2] << 8) | (bArr[i9] & ExifInterface.MARKER)) << 8) | (bArr[i10] & ExifInterface.MARKER), this.v, this.x);
            this.x = h2;
            i8--;
            if (i8 <= 0) {
                char[] cArr2 = this.v;
                int i12 = h2 + 1;
                this.x = i12;
                cArr2[h2] = '\\';
                this.x = i12 + 1;
                cArr2[i12] = 'n';
                i8 = aVar.f1371n >> 2;
            }
            i2 = i11;
        }
        int i13 = i5 - i2;
        if (i13 > 0) {
            if (this.x > i7) {
                d1();
            }
            int i14 = i2 + 1;
            int i15 = bArr[i2] << 16;
            if (i13 == 2) {
                i15 |= (bArr[i14] & ExifInterface.MARKER) << 8;
            }
            this.x = aVar.j(i15, i13, this.v, this.x);
        }
        if (this.x >= this.y) {
            d1();
        }
        char[] cArr3 = this.v;
        int i16 = this.x;
        this.x = i16 + 1;
        cArr3[i16] = this.u;
    }

    public void o0(boolean z2) {
        int i2;
        W0("write a boolean value");
        if (this.x + 5 >= this.y) {
            d1();
        }
        int i3 = this.x;
        char[] cArr = this.v;
        if (z2) {
            cArr[i3] = 't';
            int i4 = i3 + 1;
            cArr[i4] = 'r';
            int i5 = i4 + 1;
            cArr[i5] = 'u';
            i2 = i5 + 1;
            cArr[i2] = 'e';
        } else {
            cArr[i3] = 'f';
            int i6 = i3 + 1;
            cArr[i6] = 'a';
            int i7 = i6 + 1;
            cArr[i7] = 'l';
            int i8 = i7 + 1;
            cArr[i8] = 's';
            i2 = i8 + 1;
            cArr[i2] = 'e';
        }
        this.x = i2 + 1;
    }

    public void q0() {
        if (this.f1450l.d()) {
            n nVar = this.f1399h;
            if (nVar != null) {
                nVar.f(this, this.f1450l.f1435b + 1);
            } else {
                if (this.x >= this.y) {
                    d1();
                }
                char[] cArr = this.v;
                int i2 = this.x;
                this.x = i2 + 1;
                cArr[i2] = ']';
            }
            this.f1450l = this.f1450l.i();
            return;
        }
        StringBuilder y2 = b.e.a.a.a.y("Current context not Array but ");
        y2.append(this.f1450l.h());
        throw new e(y2.toString(), this);
    }

    public void r0() {
        if (this.f1450l.e()) {
            n nVar = this.f1399h;
            if (nVar != null) {
                nVar.j(this, this.f1450l.f1435b + 1);
            } else {
                if (this.x >= this.y) {
                    d1();
                }
                char[] cArr = this.v;
                int i2 = this.x;
                this.x = i2 + 1;
                cArr[i2] = '}';
            }
            this.f1450l = this.f1450l.i();
            return;
        }
        StringBuilder y2 = b.e.a.a.a.y("Current context not Object but ");
        y2.append(this.f1450l.h());
        throw new e(y2.toString(), this);
    }

    public void s0(o oVar) {
        int o2 = this.f1450l.o(oVar.getValue());
        if (o2 != 4) {
            boolean z2 = o2 == 1;
            n nVar = this.f1399h;
            if (nVar != null) {
                if (z2) {
                    nVar.e(this);
                } else {
                    nVar.g(this);
                }
                char[] a = oVar.a();
                if (this.r) {
                    I0(a, 0, a.length);
                    return;
                }
                if (this.x >= this.y) {
                    d1();
                }
                char[] cArr = this.v;
                int i2 = this.x;
                this.x = i2 + 1;
                cArr[i2] = this.u;
                I0(a, 0, a.length);
                if (this.x >= this.y) {
                    d1();
                }
                char[] cArr2 = this.v;
                int i3 = this.x;
                this.x = i3 + 1;
                cArr2[i3] = this.u;
                return;
            }
            if (this.x + 1 >= this.y) {
                d1();
            }
            if (z2) {
                char[] cArr3 = this.v;
                int i4 = this.x;
                this.x = i4 + 1;
                cArr3[i4] = ',';
            }
            if (this.r) {
                char[] a2 = oVar.a();
                I0(a2, 0, a2.length);
                return;
            }
            char[] cArr4 = this.v;
            int i5 = this.x;
            int i6 = i5 + 1;
            this.x = i6;
            cArr4[i5] = this.u;
            int c = oVar.c(cArr4, i6);
            if (c < 0) {
                char[] a3 = oVar.a();
                I0(a3, 0, a3.length);
                if (this.x >= this.y) {
                    d1();
                }
                char[] cArr5 = this.v;
                int i7 = this.x;
                this.x = i7 + 1;
                cArr5[i7] = this.u;
                return;
            }
            int i8 = this.x + c;
            this.x = i8;
            if (i8 >= this.y) {
                d1();
            }
            char[] cArr6 = this.v;
            int i9 = this.x;
            this.x = i9 + 1;
            cArr6[i9] = this.u;
            return;
        }
        throw new e("Can not write a field name, expecting a value", this);
    }

    public void t0(String str) {
        int o2 = this.f1450l.o(str);
        if (o2 != 4) {
            boolean z2 = o2 == 1;
            n nVar = this.f1399h;
            if (nVar != null) {
                if (z2) {
                    nVar.e(this);
                } else {
                    nVar.g(this);
                }
                if (this.r) {
                    l1(str);
                    return;
                }
                if (this.x >= this.y) {
                    d1();
                }
                char[] cArr = this.v;
                int i2 = this.x;
                this.x = i2 + 1;
                cArr[i2] = this.u;
                l1(str);
                if (this.x >= this.y) {
                    d1();
                }
                char[] cArr2 = this.v;
                int i3 = this.x;
                this.x = i3 + 1;
                cArr2[i3] = this.u;
                return;
            }
            if (this.x + 1 >= this.y) {
                d1();
            }
            if (z2) {
                char[] cArr3 = this.v;
                int i4 = this.x;
                this.x = i4 + 1;
                cArr3[i4] = ',';
            }
            if (this.r) {
                l1(str);
                return;
            }
            char[] cArr4 = this.v;
            int i5 = this.x;
            this.x = i5 + 1;
            cArr4[i5] = this.u;
            l1(str);
            if (this.x >= this.y) {
                d1();
            }
            char[] cArr5 = this.v;
            int i6 = this.x;
            this.x = i6 + 1;
            cArr5[i6] = this.u;
            return;
        }
        throw new e("Can not write a field name, expecting a value", this);
    }

    public void u0() {
        W0("write a null");
        j1();
    }

    public void v0(double d) {
        if (this.f1449k || (g.g(d) && X0(f.a.QUOTE_NON_NUMERIC_NUMBERS))) {
            Q0(String.valueOf(d));
            return;
        }
        W0("write a number");
        H0(String.valueOf(d));
    }

    public void w0(float f) {
        if (this.f1449k || (g.h(f) && X0(f.a.QUOTE_NON_NUMERIC_NUMBERS))) {
            Q0(String.valueOf(f));
            return;
        }
        W0("write a number");
        H0(String.valueOf(f));
    }

    public void x0(int i2) {
        W0("write a number");
        if (this.f1449k) {
            if (this.x + 13 >= this.y) {
                d1();
            }
            char[] cArr = this.v;
            int i3 = this.x;
            int i4 = i3 + 1;
            this.x = i4;
            cArr[i3] = this.u;
            int j2 = g.j(i2, cArr, i4);
            this.x = j2;
            char[] cArr2 = this.v;
            this.x = j2 + 1;
            cArr2[j2] = this.u;
            return;
        }
        if (this.x + 11 >= this.y) {
            d1();
        }
        this.x = g.j(i2, this.v, this.x);
    }

    public void y0(long j2) {
        W0("write a number");
        if (this.f1449k) {
            if (this.x + 23 >= this.y) {
                d1();
            }
            char[] cArr = this.v;
            int i2 = this.x;
            int i3 = i2 + 1;
            this.x = i3;
            cArr[i2] = this.u;
            int l2 = g.l(j2, cArr, i3);
            this.x = l2;
            char[] cArr2 = this.v;
            this.x = l2 + 1;
            cArr2[l2] = this.u;
            return;
        }
        if (this.x + 21 >= this.y) {
            d1();
        }
        this.x = g.l(j2, this.v, this.x);
    }

    public void z0(String str) {
        W0("write a number");
        if (this.f1449k) {
            k1(str);
        } else {
            H0(str);
        }
    }
}
