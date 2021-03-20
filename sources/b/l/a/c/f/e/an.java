package b.l.a.c.f.e;

import java.io.OutputStream;

public final class an extends bn {
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2853e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f2854g;

    /* renamed from: h  reason: collision with root package name */
    public final OutputStream f2855h;

    public an(OutputStream outputStream, int i2) {
        super((xm) null);
        if (i2 >= 0) {
            int max = Math.max(i2, 20);
            this.d = new byte[max];
            this.f2853e = max;
            this.f2855h = outputStream;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void A(long j2) {
        D(8);
        I(j2);
    }

    public final void D(int i2) {
        if (this.f2853e - this.f < i2) {
            E();
        }
    }

    public final void E() {
        this.f2855h.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void F(int i2) {
        if (bn.c) {
            long j2 = (long) this.f;
            while ((i2 & -128) != 0) {
                byte[] bArr = this.d;
                int i3 = this.f;
                this.f = i3 + 1;
                n1.s(bArr, (long) i3, (byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i4 = this.f;
            this.f = i4 + 1;
            n1.s(bArr2, (long) i4, (byte) i2);
            this.f2854g += (int) (((long) this.f) - j2);
            return;
        }
        while ((i2 & -128) != 0) {
            byte[] bArr3 = this.d;
            int i5 = this.f;
            this.f = i5 + 1;
            bArr3[i5] = (byte) ((i2 & 127) | 128);
            this.f2854g++;
            i2 >>>= 7;
        }
        byte[] bArr4 = this.d;
        int i6 = this.f;
        this.f = i6 + 1;
        bArr4[i6] = (byte) i2;
        this.f2854g++;
    }

    public final void G(long j2) {
        if (bn.c) {
            long j3 = (long) this.f;
            while ((j2 & -128) != 0) {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                n1.s(bArr, (long) i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i3 = this.f;
            this.f = i3 + 1;
            n1.s(bArr2, (long) i3, (byte) ((int) j2));
            this.f2854g += (int) (((long) this.f) - j3);
            return;
        }
        while ((j2 & -128) != 0) {
            byte[] bArr3 = this.d;
            int i4 = this.f;
            this.f = i4 + 1;
            bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
            this.f2854g++;
            j2 >>>= 7;
        }
        byte[] bArr4 = this.d;
        int i5 = this.f;
        this.f = i5 + 1;
        bArr4[i5] = (byte) ((int) j2);
        this.f2854g++;
    }

    public final void H(int i2) {
        byte[] bArr = this.d;
        int i3 = this.f;
        int i4 = i3 + 1;
        this.f = i4;
        bArr[i3] = (byte) (i2 & 255);
        int i5 = i4 + 1;
        this.f = i5;
        bArr[i4] = (byte) ((i2 >> 8) & 255);
        int i6 = i5 + 1;
        this.f = i6;
        bArr[i5] = (byte) ((i2 >> 16) & 255);
        this.f = i6 + 1;
        bArr[i6] = (byte) ((i2 >> 24) & 255);
        this.f2854g += 4;
    }

    public final void I(long j2) {
        byte[] bArr = this.d;
        int i2 = this.f;
        int i3 = i2 + 1;
        this.f = i3;
        bArr[i2] = (byte) ((int) (j2 & 255));
        int i4 = i3 + 1;
        this.f = i4;
        bArr[i3] = (byte) ((int) ((j2 >> 8) & 255));
        int i5 = i4 + 1;
        this.f = i5;
        bArr[i4] = (byte) ((int) ((j2 >> 16) & 255));
        int i6 = i5 + 1;
        this.f = i6;
        bArr[i5] = (byte) ((int) (255 & (j2 >> 24)));
        int i7 = i6 + 1;
        this.f = i7;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
        int i8 = i7 + 1;
        this.f = i8;
        bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
        int i9 = i8 + 1;
        this.f = i9;
        bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
        this.f = i9 + 1;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        this.f2854g += 8;
    }

    public final void J(byte[] bArr, int i2, int i3) {
        int i4 = this.f2853e;
        int i5 = this.f;
        int i6 = i4 - i5;
        if (i6 >= i3) {
            System.arraycopy(bArr, 0, this.d, i5, i3);
            this.f += i3;
        } else {
            System.arraycopy(bArr, 0, this.d, i5, i6);
            i3 -= i6;
            this.f = this.f2853e;
            this.f2854g += i6;
            E();
            if (i3 <= this.f2853e) {
                System.arraycopy(bArr, i6, this.d, 0, i3);
                this.f = i3;
            } else {
                this.f2855h.write(bArr, i6, i3);
            }
        }
        this.f2854g += i3;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        J(bArr, 0, i3);
    }

    public final void k(int i2, int i3) {
        x((i2 << 3) | i3);
    }

    public final void l(int i2, int i3) {
        D(20);
        F(i2 << 3);
        if (i3 >= 0) {
            F(i3);
        } else {
            G((long) i3);
        }
    }

    public final void m(int i2, int i3) {
        D(20);
        F(i2 << 3);
        F(i3);
    }

    public final void n(int i2, int i3) {
        D(14);
        F((i2 << 3) | 5);
        H(i3);
    }

    public final void o(int i2, long j2) {
        D(20);
        F(i2 << 3);
        G(j2);
    }

    public final int p() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void q(int i2, long j2) {
        D(18);
        F((i2 << 3) | 1);
        I(j2);
    }

    public final void r(int i2, boolean z) {
        D(11);
        F(i2 << 3);
        byte[] bArr = this.d;
        int i3 = this.f;
        this.f = i3 + 1;
        bArr[i3] = z ? (byte) 1 : 0;
        this.f2854g++;
    }

    public final void s(int i2, String str) {
        int i3;
        int i4;
        x((i2 << 3) | 2);
        try {
            int length = str.length() * 3;
            int b2 = bn.b(length);
            int i5 = b2 + length;
            int i6 = this.f2853e;
            if (i5 > i6) {
                byte[] bArr = new byte[length];
                int c = s1.c(str, bArr, 0, length);
                x(c);
                J(bArr, 0, c);
                return;
            }
            if (i5 > i6 - this.f) {
                E();
            }
            int b3 = bn.b(str.length());
            i3 = this.f;
            if (b3 == b2) {
                int i7 = i3 + b3;
                this.f = i7;
                int c2 = s1.c(str, this.d, i7, this.f2853e - i7);
                this.f = i3;
                i4 = (c2 - i3) - b3;
                F(i4);
                this.f = c2;
            } else {
                i4 = s1.b(str);
                F(i4);
                this.f = s1.c(str, this.d, this.f, i4);
            }
            this.f2854g += i4;
        } catch (q1 e2) {
            this.f2854g -= this.f - i3;
            this.f = i3;
            throw e2;
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new zm(e3);
        } catch (q1 e4) {
            i(str, e4);
        }
    }

    public final void t(int i2, um umVar) {
        x((i2 << 3) | 2);
        x(umVar.l());
        umVar.y(this);
    }

    public final void u(int i2, e0 e0Var, o0 o0Var) {
        x((i2 << 3) | 2);
        gm gmVar = (gm) e0Var;
        int b2 = gmVar.b();
        if (b2 == -1) {
            b2 = o0Var.c(gmVar);
            gmVar.c(b2);
        }
        x(b2);
        o0Var.h(e0Var, this.a);
    }

    public final void v(byte b2) {
        if (this.f == this.f2853e) {
            E();
        }
        byte[] bArr = this.d;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = b2;
        this.f2854g++;
    }

    public final void w(int i2) {
        if (i2 >= 0) {
            D(5);
            F(i2);
            return;
        }
        z((long) i2);
    }

    public final void x(int i2) {
        D(5);
        F(i2);
    }

    public final void y(int i2) {
        D(4);
        H(i2);
    }

    public final void z(long j2) {
        D(10);
        G(j2);
    }
}
