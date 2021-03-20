package b.l.a.c.f.e;

public final class ym extends bn {
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3426e;
    public int f;

    public ym(byte[] bArr, int i2, int i3) {
        super((xm) null);
        int length = bArr.length;
        if (((length - i3) | i3) >= 0) {
            this.d = bArr;
            this.f = 0;
            this.f3426e = i3;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i3)}));
    }

    public final void A(long j2) {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i3 + 1;
            this.f = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i4 + 1;
            this.f = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i5 + 1;
            this.f = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e2) {
            throw new zm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3426e), 1}), e2);
        }
    }

    public final void a(byte[] bArr, int i2, int i3) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i3);
            this.f += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3426e), Integer.valueOf(i3)}), e2);
        }
    }

    public final void k(int i2, int i3) {
        x((i2 << 3) | i3);
    }

    public final void l(int i2, int i3) {
        x(i2 << 3);
        if (i3 >= 0) {
            x(i3);
        } else {
            z((long) i3);
        }
    }

    public final void m(int i2, int i3) {
        x(i2 << 3);
        x(i3);
    }

    public final void n(int i2, int i3) {
        x((i2 << 3) | 5);
        y(i3);
    }

    public final void o(int i2, long j2) {
        x(i2 << 3);
        z(j2);
    }

    public final int p() {
        return this.f3426e - this.f;
    }

    public final void q(int i2, long j2) {
        x((i2 << 3) | 1);
        A(j2);
    }

    public final void r(int i2, boolean z) {
        x(i2 << 3);
        v(z ? (byte) 1 : 0);
    }

    public final void s(int i2, String str) {
        int c;
        x((i2 << 3) | 2);
        int i3 = this.f;
        try {
            int b2 = bn.b(str.length() * 3);
            int b3 = bn.b(str.length());
            if (b3 == b2) {
                int i4 = i3 + b3;
                this.f = i4;
                c = s1.c(str, this.d, i4, this.f3426e - i4);
                this.f = i3;
                x((c - i3) - b3);
            } else {
                x(s1.b(str));
                byte[] bArr = this.d;
                int i5 = this.f;
                c = s1.c(str, bArr, i5, this.f3426e - i5);
            }
            this.f = c;
        } catch (q1 e2) {
            this.f = i3;
            i(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zm(e3);
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
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3426e), 1}), e2);
        }
    }

    public final void w(int i2) {
        if (i2 >= 0) {
            x(i2);
        } else {
            z((long) i2);
        }
    }

    public final void x(int i2) {
        if (bn.c && !im.a()) {
            int i3 = this.f3426e;
            int i4 = this.f;
            if (i3 - i4 >= 5) {
                if ((i2 & -128) == 0) {
                    byte[] bArr = this.d;
                    this.f = i4 + 1;
                    n1.s(bArr, (long) i4, (byte) i2);
                    return;
                }
                byte[] bArr2 = this.d;
                this.f = i4 + 1;
                n1.s(bArr2, (long) i4, (byte) (i2 | 128));
                int i5 = i2 >>> 7;
                if ((i5 & -128) == 0) {
                    byte[] bArr3 = this.d;
                    int i6 = this.f;
                    this.f = i6 + 1;
                    n1.s(bArr3, (long) i6, (byte) i5);
                    return;
                }
                byte[] bArr4 = this.d;
                int i7 = this.f;
                this.f = i7 + 1;
                n1.s(bArr4, (long) i7, (byte) (i5 | 128));
                int i8 = i5 >>> 7;
                if ((i8 & -128) == 0) {
                    byte[] bArr5 = this.d;
                    int i9 = this.f;
                    this.f = i9 + 1;
                    n1.s(bArr5, (long) i9, (byte) i8);
                    return;
                }
                byte[] bArr6 = this.d;
                int i10 = this.f;
                this.f = i10 + 1;
                n1.s(bArr6, (long) i10, (byte) (i8 | 128));
                int i11 = i8 >>> 7;
                if ((i11 & -128) == 0) {
                    byte[] bArr7 = this.d;
                    int i12 = this.f;
                    this.f = i12 + 1;
                    n1.s(bArr7, (long) i12, (byte) i11);
                    return;
                }
                byte[] bArr8 = this.d;
                int i13 = this.f;
                this.f = i13 + 1;
                n1.s(bArr8, (long) i13, (byte) (i11 | 128));
                byte[] bArr9 = this.d;
                int i14 = this.f;
                this.f = i14 + 1;
                n1.s(bArr9, (long) i14, (byte) (i11 >>> 7));
                return;
            }
        }
        while ((i2 & -128) != 0) {
            byte[] bArr10 = this.d;
            int i15 = this.f;
            this.f = i15 + 1;
            bArr10[i15] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
        }
        try {
            byte[] bArr11 = this.d;
            int i16 = this.f;
            this.f = i16 + 1;
            bArr11[i16] = (byte) i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3426e), 1}), e2);
        }
    }

    public final void y(int i2) {
        try {
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
        } catch (IndexOutOfBoundsException e2) {
            throw new zm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3426e), 1}), e2);
        }
    }

    public final void z(long j2) {
        if (!bn.c || this.f3426e - this.f < 10) {
            while ((j2 & -128) != 0) {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
            try {
                byte[] bArr2 = this.d;
                int i3 = this.f;
                this.f = i3 + 1;
                bArr2[i3] = (byte) ((int) j2);
            } catch (IndexOutOfBoundsException e2) {
                throw new zm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3426e), 1}), e2);
            }
        } else {
            while ((j2 & -128) != 0) {
                byte[] bArr3 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                n1.s(bArr3, (long) i4, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr4 = this.d;
            int i5 = this.f;
            this.f = i5 + 1;
            n1.s(bArr4, (long) i5, (byte) ((int) j2));
        }
    }
}
