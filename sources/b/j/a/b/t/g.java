package b.j.a.b.t;

import androidx.exifinterface.media.ExifInterface;
import b.j.a.b.e;
import b.j.a.b.f;
import b.j.a.b.m;
import b.j.a.b.n;
import b.j.a.b.o;
import b.j.a.b.s.a;
import b.j.a.b.s.b;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class g extends c {
    public static final byte[] C = ((byte[]) a.f1461b.clone());
    public static final byte[] D = {110, 117, 108, 108};
    public static final byte[] E = {116, 114, 117, 101};
    public static final byte[] F = {102, 97, 108, 115, 101};
    public final int A;
    public boolean B;
    public final OutputStream t;
    public byte u;
    public byte[] v;
    public int w;
    public final int x;
    public final int y;
    public char[] z;

    public g(b bVar, int i2, m mVar, OutputStream outputStream, char c) {
        super(bVar, i2, mVar);
        this.t = outputStream;
        this.u = (byte) c;
        if (c != '\"') {
            this.f1504o = a.b(c);
        }
        this.B = true;
        bVar.a(bVar.f);
        byte[] a = bVar.d.a(1);
        bVar.f = a;
        this.v = a;
        int length = a.length;
        this.x = length;
        this.y = length >> 3;
        bVar.a(bVar.f1471i);
        char[] b2 = bVar.d.b(1, 0);
        bVar.f1471i = b2;
        this.z = b2;
        this.A = b2.length;
        if (X0(f.a.ESCAPE_NON_ASCII)) {
            a1(127);
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
        if (this.w + 6 >= this.x) {
            b1();
        }
        if (this.f1449k) {
            if (this.w + 8 >= this.x) {
                b1();
            }
            byte[] bArr = this.v;
            int i2 = this.w;
            int i3 = i2 + 1;
            this.w = i3;
            bArr[i2] = this.u;
            int i4 = b.j.a.b.s.g.i(s, bArr, i3);
            this.w = i4;
            byte[] bArr2 = this.v;
            this.w = i4 + 1;
            bArr2[i4] = this.u;
            return;
        }
        this.w = b.j.a.b.s.g.i(s, this.v, this.w);
    }

    public void F0(char c) {
        if (this.w + 3 >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        if (c <= 127) {
            int i2 = this.w;
            this.w = i2 + 1;
            bArr[i2] = (byte) c;
        } else if (c < 2048) {
            int i3 = this.w;
            int i4 = i3 + 1;
            this.w = i4;
            bArr[i3] = (byte) ((c >> 6) | 192);
            this.w = i4 + 1;
            bArr[i4] = (byte) ((c & '?') | 128);
        } else {
            d1(c, (char[]) null, 0, 0);
        }
    }

    public void G0(o oVar) {
        int g2 = oVar.g(this.v, this.w);
        if (g2 < 0) {
            h1(oVar.f());
        } else {
            this.w += g2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r7 = r6 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H0(java.lang.String r14) {
        /*
            r13 = this;
            int r0 = r14.length()
            char[] r1 = r13.z
            int r2 = r1.length
            r3 = 0
            if (r0 > r2) goto L_0x0012
            r14.getChars(r3, r0, r1, r3)
            r13.I0(r1, r3, r0)
            goto L_0x0098
        L_0x0012:
            int r2 = r1.length
            if (r0 > r2) goto L_0x001f
            int r2 = r3 + r0
            r14.getChars(r3, r2, r1, r3)
            r13.I0(r1, r3, r0)
            goto L_0x0098
        L_0x001f:
            int r4 = r13.x
            int r5 = r4 >> 2
            int r4 = r4 >> 4
            int r5 = r5 + r4
            int r2 = java.lang.Math.min(r2, r5)
            int r4 = r2 * 3
            r5 = r3
        L_0x002d:
            if (r0 <= 0) goto L_0x0098
            int r6 = java.lang.Math.min(r2, r0)
            int r7 = r5 + r6
            r14.getChars(r5, r7, r1, r3)
            int r7 = r13.w
            int r7 = r7 + r4
            int r8 = r13.x
            if (r7 <= r8) goto L_0x0042
            r13.b1()
        L_0x0042:
            r7 = 1
            if (r6 <= r7) goto L_0x0054
            int r7 = r6 + -1
            char r8 = r1[r7]
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r9) goto L_0x0054
            r9 = 56319(0xdbff, float:7.892E-41)
            if (r8 > r9) goto L_0x0054
            r6 = r7
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 >= r6) goto L_0x0095
        L_0x0057:
            char r8 = r1[r7]
            r9 = 127(0x7f, float:1.78E-43)
            if (r8 <= r9) goto L_0x0086
            int r8 = r7 + 1
            char r7 = r1[r7]
            r9 = 2048(0x800, float:2.87E-42)
            if (r7 >= r9) goto L_0x0081
            byte[] r9 = r13.v
            int r10 = r13.w
            int r11 = r10 + 1
            r13.w = r11
            int r12 = r7 >> 6
            r12 = r12 | 192(0xc0, float:2.69E-43)
            byte r12 = (byte) r12
            r9[r10] = r12
            int r10 = r11 + 1
            r13.w = r10
            r7 = r7 & 63
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7
            r9[r11] = r7
            r7 = r8
            goto L_0x0055
        L_0x0081:
            int r7 = r13.d1(r7, r1, r8, r6)
            goto L_0x0055
        L_0x0086:
            byte[] r9 = r13.v
            int r10 = r13.w
            int r11 = r10 + 1
            r13.w = r11
            byte r8 = (byte) r8
            r9[r10] = r8
            int r7 = r7 + 1
            if (r7 < r6) goto L_0x0057
        L_0x0095:
            int r5 = r5 + r6
            int r0 = r0 - r6
            goto L_0x002d
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.g.H0(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r1 = r10 + 1;
        r10 = r9[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r10 >= 2048) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r5 = r8.w;
        r6 = r5 + 1;
        r8.w = r6;
        r0[r5] = (byte) ((r10 >> 6) | 192);
        r8.w = r6 + 1;
        r0[r6] = (byte) ((r10 & '?') | 128);
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r10 = d1(r10, r9, r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r0 = r10 + 1;
        r10 = r9[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r10 >= 2048) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r1 = r8.v;
        r2 = r8.w;
        r5 = r2 + 1;
        r8.w = r5;
        r1[r2] = (byte) ((r10 >> 6) | 192);
        r8.w = r5 + 1;
        r1[r5] = (byte) ((r10 & '?') | 128);
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        r10 = d1(r10, r9, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if ((r8.w + 3) < r8.x) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        b1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I0(char[] r9, int r10, int r11) {
        /*
            r8 = this;
            int r0 = r11 + r11
            int r0 = r0 + r11
            int r1 = r8.w
            int r1 = r1 + r0
            int r2 = r8.x
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 128(0x80, float:1.794E-43)
            if (r1 <= r2) goto L_0x0060
            if (r2 >= r0) goto L_0x005d
            byte[] r0 = r8.v
            int r11 = r11 + r10
        L_0x0013:
            if (r10 >= r11) goto L_0x005c
        L_0x0015:
            char r1 = r9[r10]
            if (r1 < r4) goto L_0x0048
            int r1 = r8.w
            int r1 = r1 + 3
            int r5 = r8.x
            if (r1 < r5) goto L_0x0024
            r8.b1()
        L_0x0024:
            int r1 = r10 + 1
            char r10 = r9[r10]
            if (r10 >= r3) goto L_0x0043
            int r5 = r8.w
            int r6 = r5 + 1
            r8.w = r6
            int r7 = r10 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r0[r5] = r7
            int r5 = r6 + 1
            r8.w = r5
            r10 = r10 & 63
            r10 = r10 | r4
            byte r10 = (byte) r10
            r0[r6] = r10
            r10 = r1
            goto L_0x0013
        L_0x0043:
            int r10 = r8.d1(r10, r9, r1, r11)
            goto L_0x0013
        L_0x0048:
            int r5 = r8.w
            if (r5 < r2) goto L_0x004f
            r8.b1()
        L_0x004f:
            int r5 = r8.w
            int r6 = r5 + 1
            r8.w = r6
            byte r1 = (byte) r1
            r0[r5] = r1
            int r10 = r10 + 1
            if (r10 < r11) goto L_0x0015
        L_0x005c:
            return
        L_0x005d:
            r8.b1()
        L_0x0060:
            int r11 = r11 + r10
        L_0x0061:
            if (r10 >= r11) goto L_0x009e
        L_0x0063:
            char r0 = r9[r10]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x008f
            int r0 = r10 + 1
            char r10 = r9[r10]
            if (r10 >= r3) goto L_0x008a
            byte[] r1 = r8.v
            int r2 = r8.w
            int r5 = r2 + 1
            r8.w = r5
            int r6 = r10 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            int r2 = r5 + 1
            r8.w = r2
            r10 = r10 & 63
            r10 = r10 | r4
            byte r10 = (byte) r10
            r1[r5] = r10
            r10 = r0
            goto L_0x0061
        L_0x008a:
            int r10 = r8.d1(r10, r9, r0, r11)
            goto L_0x0061
        L_0x008f:
            byte[] r1 = r8.v
            int r2 = r8.w
            int r5 = r2 + 1
            r8.w = r5
            byte r0 = (byte) r0
            r1[r2] = r0
            int r10 = r10 + 1
            if (r10 < r11) goto L_0x0063
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.g.I0(char[], int, int):void");
    }

    public void J0(o oVar) {
        W0("write a raw (unencoded) value");
        int g2 = oVar.g(this.v, this.w);
        if (g2 < 0) {
            h1(oVar.f());
        } else {
            this.w += g2;
        }
    }

    public final void L0() {
        W0("start an array");
        this.f1450l = this.f1450l.j();
        n nVar = this.f1399h;
        if (nVar != null) {
            nVar.k(this);
            return;
        }
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i2 = this.w;
        this.w = i2 + 1;
        bArr[i2] = 91;
    }

    public void M0(int i2) {
        W0("start an array");
        this.f1450l = this.f1450l.j();
        n nVar = this.f1399h;
        if (nVar != null) {
            nVar.k(this);
            return;
        }
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i3 = this.w;
        this.w = i3 + 1;
        bArr[i3] = 91;
    }

    public final void N0() {
        W0("start an object");
        this.f1450l = this.f1450l.k();
        n nVar = this.f1399h;
        if (nVar != null) {
            nVar.a(this);
            return;
        }
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i2 = this.w;
        this.w = i2 + 1;
        bArr[i2] = 123;
    }

    public void O0(Object obj) {
        W0("start an object");
        this.f1450l = this.f1450l.l(obj);
        n nVar = this.f1399h;
        if (nVar != null) {
            nVar.a(this);
            return;
        }
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i2 = this.w;
        this.w = i2 + 1;
        bArr[i2] = 123;
    }

    public final void P0(o oVar) {
        W0("write a string");
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i2 = this.w;
        int i3 = i2 + 1;
        this.w = i3;
        bArr[i2] = this.u;
        int d = oVar.d(bArr, i3);
        if (d < 0) {
            h1(oVar.b());
        } else {
            this.w += d;
        }
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr2 = this.v;
        int i4 = this.w;
        this.w = i4 + 1;
        bArr2[i4] = this.u;
    }

    public void Q0(String str) {
        W0("write a string");
        if (str == null) {
            j1();
            return;
        }
        int length = str.length();
        if (length > this.y) {
            n1(str, true);
            return;
        }
        if (this.w + length >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i2 = this.w;
        this.w = i2 + 1;
        bArr[i2] = this.u;
        l1(str, 0, length);
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr2 = this.v;
        int i3 = this.w;
        this.w = i3 + 1;
        bArr2[i3] = this.u;
    }

    public void R0(char[] cArr, int i2, int i3) {
        W0("write a string");
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i4 = this.w;
        int i5 = i4 + 1;
        this.w = i5;
        bArr[i4] = this.u;
        if (i3 <= this.y) {
            if (i5 + i3 > this.x) {
                b1();
            }
            m1(cArr, i2, i3);
        } else {
            o1(cArr, i2, i3);
        }
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr2 = this.v;
        int i6 = this.w;
        this.w = i6 + 1;
        bArr2[i6] = this.u;
    }

    public final void W0(String str) {
        byte b2;
        int p2 = this.f1450l.p();
        if (this.f1399h != null) {
            Z0(str, p2);
            return;
        }
        if (p2 == 1) {
            b2 = 44;
        } else if (p2 == 2) {
            b2 = 58;
        } else if (p2 == 3) {
            o oVar = this.f1506q;
            if (oVar != null) {
                byte[] f = oVar.f();
                if (f.length > 0) {
                    h1(f);
                    return;
                }
                return;
            }
            return;
        } else if (p2 == 5) {
            Y0(str);
            throw null;
        } else {
            return;
        }
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i2 = this.w;
        this.w = i2 + 1;
        bArr[i2] = b2;
    }

    public final void b1() {
        int i2 = this.w;
        if (i2 > 0) {
            this.w = 0;
            this.t.write(this.v, 0, i2);
        }
    }

    public final int c1(int i2, int i3) {
        byte[] bArr = this.v;
        if (i2 < 55296 || i2 > 57343) {
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i2 >> 12) | 224);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((i2 >> 6) & 63) | 128);
            bArr[i5] = (byte) ((i2 & 63) | 128);
            return i5 + 1;
        }
        int i6 = i3 + 1;
        bArr[i3] = 92;
        int i7 = i6 + 1;
        bArr[i6] = 117;
        int i8 = i7 + 1;
        byte[] bArr2 = C;
        bArr[i7] = bArr2[(i2 >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i2 >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i2 >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i2 & 15];
        return i11;
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
        b1();
        this.w = 0;
        if (this.t != null) {
            if (this.f1503n.c || X0(f.a.AUTO_CLOSE_TARGET)) {
                this.t.close();
            } else if (X0(f.a.FLUSH_PASSED_TO_STREAM)) {
                this.t.flush();
            }
        }
        byte[] bArr = this.v;
        if (bArr != null && this.B) {
            this.v = null;
            b bVar = this.f1503n;
            Objects.requireNonNull(bVar);
            bVar.b(bArr, bVar.f);
            bVar.f = null;
            bVar.d.a.set(1, bArr);
        }
        char[] cArr = this.z;
        if (cArr != null) {
            this.z = null;
            b bVar2 = this.f1503n;
            Objects.requireNonNull(bVar2);
            bVar2.c(cArr, bVar2.f1471i);
            bVar2.f1471i = null;
            bVar2.d.f1548b.set(1, cArr);
        }
    }

    public final int d1(int i2, char[] cArr, int i3, int i4) {
        if (i2 < 55296 || i2 > 57343) {
            byte[] bArr = this.v;
            int i5 = this.w;
            int i6 = i5 + 1;
            this.w = i6;
            bArr[i5] = (byte) ((i2 >> 12) | 224);
            int i7 = i6 + 1;
            this.w = i7;
            bArr[i6] = (byte) (((i2 >> 6) & 63) | 128);
            this.w = i7 + 1;
            bArr[i7] = (byte) ((i2 & 63) | 128);
            return i3;
        } else if (i3 >= i4 || cArr == null) {
            throw new e(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[]{Integer.valueOf(i2)}), this);
        } else {
            char c = cArr[i3];
            if (c < 56320 || c > 57343) {
                StringBuilder y2 = b.e.a.a.a.y("Incomplete surrogate pair: first char 0x");
                y2.append(Integer.toHexString(i2));
                y2.append(", second 0x");
                y2.append(Integer.toHexString(c));
                throw new e(y2.toString(), this);
            }
            int i8 = (c - 56320) + ((i2 - 55296) << 10) + 65536;
            if (this.w + 4 > this.x) {
                b1();
            }
            byte[] bArr2 = this.v;
            int i9 = this.w;
            int i10 = i9 + 1;
            this.w = i10;
            bArr2[i9] = (byte) ((i8 >> 18) | 240);
            int i11 = i10 + 1;
            this.w = i11;
            bArr2[i10] = (byte) (((i8 >> 12) & 63) | 128);
            int i12 = i11 + 1;
            this.w = i12;
            bArr2[i11] = (byte) (((i8 >> 6) & 63) | 128);
            this.w = i12 + 1;
            bArr2[i12] = (byte) ((i8 & 63) | 128);
            return i3 + 1;
        }
    }

    public final int e1(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) {
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

    public final int f1(b.j.a.b.a aVar, InputStream inputStream, byte[] bArr) {
        int i2 = this.x - 6;
        int i3 = 2;
        int i4 = aVar.f1371n >> 2;
        int i5 = -3;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i6 > i5) {
                i7 = e1(inputStream, bArr, i6, i7, bArr.length);
                if (i7 < 3) {
                    break;
                }
                i5 = i7 - 3;
                i6 = 0;
            }
            if (this.w > i2) {
                b1();
            }
            int i9 = i6 + 1;
            int i10 = i9 + 1;
            i6 = i10 + 1;
            i8 += 3;
            int g2 = aVar.g((((bArr[i9] & ExifInterface.MARKER) | (bArr[i6] << 8)) << 8) | (bArr[i10] & ExifInterface.MARKER), this.v, this.w);
            this.w = g2;
            i4--;
            if (i4 <= 0) {
                byte[] bArr2 = this.v;
                int i11 = g2 + 1;
                this.w = i11;
                bArr2[g2] = 92;
                this.w = i11 + 1;
                bArr2[i11] = 110;
                i4 = aVar.f1371n >> 2;
            }
        }
        if (i7 <= 0) {
            return i8;
        }
        if (this.w > i2) {
            b1();
        }
        int i12 = bArr[0] << 16;
        if (1 < i7) {
            i12 |= (bArr[1] & ExifInterface.MARKER) << 8;
        } else {
            i3 = 1;
        }
        int i13 = i8 + i3;
        this.w = aVar.i(i12, i3, this.v, this.w);
        return i13;
    }

    public void flush() {
        b1();
        if (this.t != null && X0(f.a.FLUSH_PASSED_TO_STREAM)) {
            this.t.flush();
        }
    }

    public final int g1(b.j.a.b.a aVar, InputStream inputStream, byte[] bArr, int i2) {
        int e1;
        int i3 = this.x - 6;
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
                i8 = e1(inputStream, bArr, i7, i8, i2);
                if (i8 < 3) {
                    i7 = 0;
                    break;
                }
                i6 = i8 - 3;
                i7 = 0;
            }
            if (this.w > i3) {
                b1();
            }
            int i9 = i7 + 1;
            int i10 = i9 + 1;
            i7 = i10 + 1;
            i2 -= 3;
            int g2 = aVar.g((((bArr[i9] & ExifInterface.MARKER) | (bArr[i7] << 8)) << 8) | (bArr[i10] & ExifInterface.MARKER), this.v, this.w);
            this.w = g2;
            i5--;
            if (i5 <= 0) {
                byte[] bArr2 = this.v;
                int i11 = g2 + 1;
                this.w = i11;
                bArr2[g2] = 92;
                this.w = i11 + 1;
                bArr2[i11] = 110;
                i5 = aVar.f1371n >> 2;
            }
        }
        if (i2 <= 0 || (e1 = e1(inputStream, bArr, i7, i8, i2)) <= 0) {
            return i2;
        }
        if (this.w > i3) {
            b1();
        }
        int i12 = bArr[0] << 16;
        if (1 < e1) {
            i12 |= (bArr[1] & ExifInterface.MARKER) << 8;
        } else {
            i4 = 1;
        }
        this.w = aVar.i(i12, i4, this.v, this.w);
        return i2 - i4;
    }

    public final void h1(byte[] bArr) {
        int length = bArr.length;
        if (this.w + length > this.x) {
            b1();
            if (length > 512) {
                this.t.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.v, this.w, length);
        this.w += length;
    }

    public final int i1(int i2, int i3) {
        int i4;
        byte[] bArr = this.v;
        int i5 = i3 + 1;
        bArr[i3] = 92;
        int i6 = i5 + 1;
        bArr[i5] = 117;
        if (i2 > 255) {
            int i7 = 255 & (i2 >> 8);
            int i8 = i6 + 1;
            byte[] bArr2 = C;
            bArr[i6] = bArr2[i7 >> 4];
            i4 = i8 + 1;
            bArr[i8] = bArr2[i7 & 15];
            i2 &= 255;
        } else {
            int i9 = i6 + 1;
            bArr[i6] = 48;
            i4 = i9 + 1;
            bArr[i9] = 48;
        }
        int i10 = i4 + 1;
        byte[] bArr3 = C;
        bArr[i4] = bArr3[i2 >> 4];
        int i11 = i10 + 1;
        bArr[i10] = bArr3[i2 & 15];
        return i11;
    }

    public final void j1() {
        if (this.w + 4 >= this.x) {
            b1();
        }
        System.arraycopy(D, 0, this.v, this.w, 4);
        this.w += 4;
    }

    public int k0(b.j.a.b.a aVar, InputStream inputStream, int i2) {
        W0("write a binary value");
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i3 = this.w;
        this.w = i3 + 1;
        bArr[i3] = this.u;
        byte[] d = this.f1503n.d();
        if (i2 < 0) {
            try {
                i2 = f1(aVar, inputStream, d);
            } catch (Throwable th) {
                this.f1503n.e(d);
                throw th;
            }
        } else {
            int g1 = g1(aVar, inputStream, d, i2);
            if (g1 > 0) {
                throw new e("Too few bytes available: missing " + g1 + " bytes (out of " + i2 + ")", this);
            }
        }
        this.f1503n.e(d);
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr2 = this.v;
        int i4 = this.w;
        this.w = i4 + 1;
        bArr2[i4] = this.u;
        return i2;
    }

    public final void k1(String str) {
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr = this.v;
        int i2 = this.w;
        this.w = i2 + 1;
        bArr[i2] = this.u;
        H0(str);
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr2 = this.v;
        int i3 = this.w;
        this.w = i3 + 1;
        bArr2[i3] = this.u;
    }

    public final void l1(String str, int i2, int i3) {
        int i4;
        int i5;
        char charAt;
        int i6 = i3 + i2;
        int i7 = this.w;
        byte[] bArr = this.v;
        int[] iArr = this.f1504o;
        while (r12 < i6 && (charAt = str.charAt(r12)) <= 127 && iArr[charAt] == 0) {
            bArr[i7] = (byte) charAt;
            i2 = r12 + 1;
            i7++;
        }
        this.w = i7;
        if (r12 >= i6) {
            return;
        }
        if (this.f1505p == 0) {
            if (b.e.a.a.a.w(i6, r12, 6, i7) > this.x) {
                b1();
            }
            int i8 = this.w;
            byte[] bArr2 = this.v;
            int[] iArr2 = this.f1504o;
            while (r12 < i6) {
                int i9 = r12 + 1;
                char charAt2 = str.charAt(r12);
                if (charAt2 <= 127) {
                    if (iArr2[charAt2] == 0) {
                        bArr2[i8] = (byte) charAt2;
                        r12 = i9;
                        i8++;
                    } else {
                        int i10 = iArr2[charAt2];
                        if (i10 > 0) {
                            int i11 = i8 + 1;
                            bArr2[i8] = 92;
                            i8 = i11 + 1;
                            bArr2[i11] = (byte) i10;
                            r12 = i9;
                        } else {
                            i5 = i1(charAt2, i8);
                        }
                    }
                } else if (charAt2 <= 2047) {
                    int i12 = i8 + 1;
                    bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                    i8 = i12 + 1;
                    bArr2[i12] = (byte) ((charAt2 & '?') | 128);
                    r12 = i9;
                } else {
                    i5 = c1(charAt2, i8);
                }
                i8 = i5;
                r12 = i9;
            }
            this.w = i8;
            return;
        }
        if (b.e.a.a.a.w(i6, r12, 6, i7) > this.x) {
            b1();
        }
        int i13 = this.w;
        byte[] bArr3 = this.v;
        int[] iArr3 = this.f1504o;
        int i14 = this.f1505p;
        while (r12 < i6) {
            int i15 = r12 + 1;
            char charAt3 = str.charAt(r12);
            if (charAt3 <= 127) {
                if (iArr3[charAt3] == 0) {
                    bArr3[i13] = (byte) charAt3;
                    r12 = i15;
                    i13++;
                } else {
                    int i16 = iArr3[charAt3];
                    if (i16 > 0) {
                        int i17 = i13 + 1;
                        bArr3[i13] = 92;
                        i13 = i17 + 1;
                        bArr3[i17] = (byte) i16;
                        r12 = i15;
                    }
                }
            } else if (charAt3 <= i14) {
                if (charAt3 <= 2047) {
                    int i18 = i13 + 1;
                    bArr3[i13] = (byte) ((charAt3 >> 6) | 192);
                    i13 = i18 + 1;
                    bArr3[i18] = (byte) ((charAt3 & '?') | 128);
                    r12 = i15;
                } else {
                    i4 = c1(charAt3, i13);
                    i13 = i4;
                    r12 = i15;
                }
            }
            i4 = i1(charAt3, i13);
            i13 = i4;
            r12 = i15;
        }
        this.w = i13;
    }

    public void m0(b.j.a.b.a aVar, byte[] bArr, int i2, int i3) {
        W0("write a binary value");
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr2 = this.v;
        int i4 = this.w;
        this.w = i4 + 1;
        bArr2[i4] = this.u;
        int i5 = i3 + i2;
        int i6 = i5 - 3;
        int i7 = this.x - 6;
        int i8 = aVar.f1371n >> 2;
        while (i2 <= i6) {
            if (this.w > i7) {
                b1();
            }
            int i9 = i2 + 1;
            int i10 = i9 + 1;
            int i11 = i10 + 1;
            int g2 = aVar.g((((bArr[i2] << 8) | (bArr[i9] & ExifInterface.MARKER)) << 8) | (bArr[i10] & ExifInterface.MARKER), this.v, this.w);
            this.w = g2;
            i8--;
            if (i8 <= 0) {
                byte[] bArr3 = this.v;
                int i12 = g2 + 1;
                this.w = i12;
                bArr3[g2] = 92;
                this.w = i12 + 1;
                bArr3[i12] = 110;
                i8 = aVar.f1371n >> 2;
            }
            i2 = i11;
        }
        int i13 = i5 - i2;
        if (i13 > 0) {
            if (this.w > i7) {
                b1();
            }
            int i14 = i2 + 1;
            int i15 = bArr[i2] << 16;
            if (i13 == 2) {
                i15 |= (bArr[i14] & ExifInterface.MARKER) << 8;
            }
            this.w = aVar.i(i15, i13, this.v, this.w);
        }
        if (this.w >= this.x) {
            b1();
        }
        byte[] bArr4 = this.v;
        int i16 = this.w;
        this.w = i16 + 1;
        bArr4[i16] = this.u;
    }

    public final void m1(char[] cArr, int i2, int i3) {
        int i4;
        int i5;
        char c;
        int i6 = i3 + i2;
        int i7 = this.w;
        byte[] bArr = this.v;
        int[] iArr = this.f1504o;
        while (r12 < i6 && (c = cArr[r12]) <= 127 && iArr[c] == 0) {
            bArr[i7] = (byte) c;
            i2 = r12 + 1;
            i7++;
        }
        this.w = i7;
        if (r12 >= i6) {
            return;
        }
        if (this.f1505p == 0) {
            if (b.e.a.a.a.w(i6, r12, 6, i7) > this.x) {
                b1();
            }
            int i8 = this.w;
            byte[] bArr2 = this.v;
            int[] iArr2 = this.f1504o;
            while (r12 < i6) {
                int i9 = r12 + 1;
                char c2 = cArr[r12];
                if (c2 <= 127) {
                    if (iArr2[c2] == 0) {
                        bArr2[i8] = (byte) c2;
                        r12 = i9;
                        i8++;
                    } else {
                        int i10 = iArr2[c2];
                        if (i10 > 0) {
                            int i11 = i8 + 1;
                            bArr2[i8] = 92;
                            i8 = i11 + 1;
                            bArr2[i11] = (byte) i10;
                            r12 = i9;
                        } else {
                            i5 = i1(c2, i8);
                        }
                    }
                } else if (c2 <= 2047) {
                    int i12 = i8 + 1;
                    bArr2[i8] = (byte) ((c2 >> 6) | 192);
                    i8 = i12 + 1;
                    bArr2[i12] = (byte) ((c2 & '?') | 128);
                    r12 = i9;
                } else {
                    i5 = c1(c2, i8);
                }
                i8 = i5;
                r12 = i9;
            }
            this.w = i8;
            return;
        }
        if (b.e.a.a.a.w(i6, r12, 6, i7) > this.x) {
            b1();
        }
        int i13 = this.w;
        byte[] bArr3 = this.v;
        int[] iArr3 = this.f1504o;
        int i14 = this.f1505p;
        while (r12 < i6) {
            int i15 = r12 + 1;
            char c3 = cArr[r12];
            if (c3 <= 127) {
                if (iArr3[c3] == 0) {
                    bArr3[i13] = (byte) c3;
                    r12 = i15;
                    i13++;
                } else {
                    int i16 = iArr3[c3];
                    if (i16 > 0) {
                        int i17 = i13 + 1;
                        bArr3[i13] = 92;
                        i13 = i17 + 1;
                        bArr3[i17] = (byte) i16;
                        r12 = i15;
                    }
                }
            } else if (c3 <= i14) {
                if (c3 <= 2047) {
                    int i18 = i13 + 1;
                    bArr3[i13] = (byte) ((c3 >> 6) | 192);
                    i13 = i18 + 1;
                    bArr3[i18] = (byte) ((c3 & '?') | 128);
                    r12 = i15;
                } else {
                    i4 = c1(c3, i13);
                    i13 = i4;
                    r12 = i15;
                }
            }
            i4 = i1(c3, i13);
            i13 = i4;
            r12 = i15;
        }
        this.w = i13;
    }

    public final void n1(String str, boolean z2) {
        if (z2) {
            if (this.w >= this.x) {
                b1();
            }
            byte[] bArr = this.v;
            int i2 = this.w;
            this.w = i2 + 1;
            bArr[i2] = this.u;
        }
        int length = str.length();
        int i3 = 0;
        while (length > 0) {
            int min = Math.min(this.y, length);
            if (this.w + min > this.x) {
                b1();
            }
            l1(str, i3, min);
            i3 += min;
            length -= min;
        }
        if (z2) {
            if (this.w >= this.x) {
                b1();
            }
            byte[] bArr2 = this.v;
            int i4 = this.w;
            this.w = i4 + 1;
            bArr2[i4] = this.u;
        }
    }

    public void o0(boolean z2) {
        W0("write a boolean value");
        if (this.w + 5 >= this.x) {
            b1();
        }
        byte[] bArr = z2 ? E : F;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.v, this.w, length);
        this.w += length;
    }

    public final void o1(char[] cArr, int i2, int i3) {
        do {
            int min = Math.min(this.y, i3);
            if (this.w + min > this.x) {
                b1();
            }
            m1(cArr, i2, min);
            i2 += min;
            i3 -= min;
        } while (i3 > 0);
    }

    public final void q0() {
        if (this.f1450l.d()) {
            n nVar = this.f1399h;
            if (nVar != null) {
                nVar.f(this, this.f1450l.f1435b + 1);
            } else {
                if (this.w >= this.x) {
                    b1();
                }
                byte[] bArr = this.v;
                int i2 = this.w;
                this.w = i2 + 1;
                bArr[i2] = 93;
            }
            this.f1450l = this.f1450l.i();
            return;
        }
        StringBuilder y2 = b.e.a.a.a.y("Current context not Array but ");
        y2.append(this.f1450l.h());
        throw new e(y2.toString(), this);
    }

    public final void r0() {
        if (this.f1450l.e()) {
            n nVar = this.f1399h;
            if (nVar != null) {
                nVar.j(this, this.f1450l.f1435b + 1);
            } else {
                if (this.w >= this.x) {
                    b1();
                }
                byte[] bArr = this.v;
                int i2 = this.w;
                this.w = i2 + 1;
                bArr[i2] = 125;
            }
            this.f1450l = this.f1450l.i();
            return;
        }
        StringBuilder y2 = b.e.a.a.a.y("Current context not Object but ");
        y2.append(this.f1450l.h());
        throw new e(y2.toString(), this);
    }

    public void s0(o oVar) {
        if (this.f1399h != null) {
            int o2 = this.f1450l.o(oVar.getValue());
            if (o2 != 4) {
                if (o2 == 1) {
                    this.f1399h.e(this);
                } else {
                    this.f1399h.g(this);
                }
                boolean z2 = !this.r;
                if (z2) {
                    if (this.w >= this.x) {
                        b1();
                    }
                    byte[] bArr = this.v;
                    int i2 = this.w;
                    this.w = i2 + 1;
                    bArr[i2] = this.u;
                }
                int d = oVar.d(this.v, this.w);
                if (d < 0) {
                    h1(oVar.b());
                } else {
                    this.w += d;
                }
                if (z2) {
                    if (this.w >= this.x) {
                        b1();
                    }
                    byte[] bArr2 = this.v;
                    int i3 = this.w;
                    this.w = i3 + 1;
                    bArr2[i3] = this.u;
                    return;
                }
                return;
            }
            throw new e("Can not write a field name, expecting a value", this);
        }
        int o3 = this.f1450l.o(oVar.getValue());
        if (o3 != 4) {
            if (o3 == 1) {
                if (this.w >= this.x) {
                    b1();
                }
                byte[] bArr3 = this.v;
                int i4 = this.w;
                this.w = i4 + 1;
                bArr3[i4] = 44;
            }
            if (this.r) {
                int d2 = oVar.d(this.v, this.w);
                if (d2 < 0) {
                    h1(oVar.b());
                } else {
                    this.w += d2;
                }
            } else {
                if (this.w >= this.x) {
                    b1();
                }
                byte[] bArr4 = this.v;
                int i5 = this.w;
                int i6 = i5 + 1;
                this.w = i6;
                bArr4[i5] = this.u;
                int d3 = oVar.d(bArr4, i6);
                if (d3 < 0) {
                    h1(oVar.b());
                } else {
                    this.w += d3;
                }
                if (this.w >= this.x) {
                    b1();
                }
                byte[] bArr5 = this.v;
                int i7 = this.w;
                this.w = i7 + 1;
                bArr5[i7] = this.u;
            }
        } else {
            throw new e("Can not write a field name, expecting a value", this);
        }
    }

    public void t0(String str) {
        int i2 = 0;
        if (this.f1399h != null) {
            int o2 = this.f1450l.o(str);
            if (o2 != 4) {
                if (o2 == 1) {
                    this.f1399h.e(this);
                } else {
                    this.f1399h.g(this);
                }
                if (this.r) {
                    n1(str, false);
                    return;
                }
                int length = str.length();
                if (length > this.A) {
                    n1(str, true);
                    return;
                }
                if (this.w >= this.x) {
                    b1();
                }
                byte[] bArr = this.v;
                int i3 = this.w;
                this.w = i3 + 1;
                bArr[i3] = this.u;
                str.getChars(0, length, this.z, 0);
                if (length <= this.y) {
                    if (this.w + length > this.x) {
                        b1();
                    }
                    m1(this.z, 0, length);
                } else {
                    o1(this.z, 0, length);
                }
                if (this.w >= this.x) {
                    b1();
                }
                byte[] bArr2 = this.v;
                int i4 = this.w;
                this.w = i4 + 1;
                bArr2[i4] = this.u;
                return;
            }
            throw new e("Can not write a field name, expecting a value", this);
        }
        int o3 = this.f1450l.o(str);
        if (o3 != 4) {
            if (o3 == 1) {
                if (this.w >= this.x) {
                    b1();
                }
                byte[] bArr3 = this.v;
                int i5 = this.w;
                this.w = i5 + 1;
                bArr3[i5] = 44;
            }
            if (this.r) {
                n1(str, false);
                return;
            }
            int length2 = str.length();
            if (length2 > this.A) {
                n1(str, true);
                return;
            }
            if (this.w >= this.x) {
                b1();
            }
            byte[] bArr4 = this.v;
            int i6 = this.w;
            int i7 = i6 + 1;
            this.w = i7;
            bArr4[i6] = this.u;
            if (length2 <= this.y) {
                if (i7 + length2 > this.x) {
                    b1();
                }
                l1(str, 0, length2);
            } else {
                do {
                    int min = Math.min(this.y, length2);
                    if (this.w + min > this.x) {
                        b1();
                    }
                    l1(str, i2, min);
                    i2 += min;
                    length2 -= min;
                } while (length2 > 0);
            }
            if (this.w >= this.x) {
                b1();
            }
            byte[] bArr5 = this.v;
            int i8 = this.w;
            this.w = i8 + 1;
            bArr5[i8] = this.u;
            return;
        }
        throw new e("Can not write a field name, expecting a value", this);
    }

    public void u0() {
        W0("write a null");
        j1();
    }

    public void v0(double d) {
        if (this.f1449k || (b.j.a.b.s.g.g(d) && f.a.QUOTE_NON_NUMERIC_NUMBERS.e(this.f1448j))) {
            Q0(String.valueOf(d));
            return;
        }
        W0("write a number");
        H0(String.valueOf(d));
    }

    public void w0(float f) {
        if (this.f1449k || (b.j.a.b.s.g.h(f) && f.a.QUOTE_NON_NUMERIC_NUMBERS.e(this.f1448j))) {
            Q0(String.valueOf(f));
            return;
        }
        W0("write a number");
        H0(String.valueOf(f));
    }

    public void x0(int i2) {
        W0("write a number");
        if (this.w + 11 >= this.x) {
            b1();
        }
        if (this.f1449k) {
            if (this.w + 13 >= this.x) {
                b1();
            }
            byte[] bArr = this.v;
            int i3 = this.w;
            int i4 = i3 + 1;
            this.w = i4;
            bArr[i3] = this.u;
            int i5 = b.j.a.b.s.g.i(i2, bArr, i4);
            this.w = i5;
            byte[] bArr2 = this.v;
            this.w = i5 + 1;
            bArr2[i5] = this.u;
            return;
        }
        this.w = b.j.a.b.s.g.i(i2, this.v, this.w);
    }

    public void y0(long j2) {
        W0("write a number");
        if (this.f1449k) {
            if (this.w + 23 >= this.x) {
                b1();
            }
            byte[] bArr = this.v;
            int i2 = this.w;
            int i3 = i2 + 1;
            this.w = i3;
            bArr[i2] = this.u;
            int k2 = b.j.a.b.s.g.k(j2, bArr, i3);
            this.w = k2;
            byte[] bArr2 = this.v;
            this.w = k2 + 1;
            bArr2[k2] = this.u;
            return;
        }
        if (this.w + 21 >= this.x) {
            b1();
        }
        this.w = b.j.a.b.s.g.k(j2, this.v, this.w);
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
