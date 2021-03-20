package b.l.a.c.f.i;

import java.util.logging.Level;

public final class w4 extends y4 {
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3797e;
    public int f;

    public w4(byte[] bArr, int i2, int i3) {
        super((v4) null);
        int length = bArr.length;
        if (((length - i3) | i3) >= 0) {
            this.d = bArr;
            this.f = 0;
            this.f3797e = i3;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i3)}));
    }

    public final void d(int i2, int i3) {
        o((i2 << 3) | i3);
    }

    public final void e(int i2, int i3) {
        o(i2 << 3);
        if (i3 >= 0) {
            o(i3);
        } else {
            q((long) i3);
        }
    }

    public final void f(int i2, int i3) {
        o(i2 << 3);
        o(i3);
    }

    public final void g(int i2, int i3) {
        o((i2 << 3) | 5);
        p(i3);
    }

    public final void h(int i2, long j2) {
        o(i2 << 3);
        q(j2);
    }

    public final void i(int i2, long j2) {
        o((i2 << 3) | 1);
        r(j2);
    }

    public final void j(int i2, boolean z) {
        o(i2 << 3);
        m(z ? (byte) 1 : 0);
    }

    public final void k(int i2, String str) {
        int c;
        o((i2 << 3) | 2);
        int i3 = this.f;
        try {
            int u = y4.u(str.length() * 3);
            int u2 = y4.u(str.length());
            if (u2 == u) {
                int i4 = i3 + u2;
                this.f = i4;
                c = d8.a.c(str, this.d, i4, this.f3797e - i4);
                this.f = i3;
                o((c - i3) - u2);
            } else {
                o(d8.b(str));
                byte[] bArr = this.d;
                int i5 = this.f;
                c = d8.a.c(str, bArr, i5, this.f3797e - i5);
            }
            this.f = c;
        } catch (b8 e2) {
            this.f = i3;
            y4.f3813b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e2);
            byte[] bytes = str.getBytes(w5.a);
            try {
                int length = bytes.length;
                o(length);
                y(bytes, 0, length);
            } catch (IndexOutOfBoundsException e3) {
                throw new x4(e3);
            } catch (x4 e4) {
                throw e4;
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new x4(e5);
        }
    }

    public final void l(int i2, t4 t4Var) {
        o((i2 << 3) | 2);
        o(t4Var.l());
        t4Var.v(this);
    }

    public final void m(byte b2) {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new x4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3797e), 1}), e2);
        }
    }

    public final void n(int i2) {
        if (i2 >= 0) {
            o(i2);
        } else {
            q((long) i2);
        }
    }

    public final void o(int i2) {
        if (y4.c && !i4.a()) {
            int i3 = this.f3797e;
            int i4 = this.f;
            if (i3 - i4 >= 5) {
                if ((i2 & -128) == 0) {
                    byte[] bArr = this.d;
                    this.f = i4 + 1;
                    y7.s(bArr, (long) i4, (byte) i2);
                    return;
                }
                byte[] bArr2 = this.d;
                this.f = i4 + 1;
                y7.s(bArr2, (long) i4, (byte) (i2 | 128));
                int i5 = i2 >>> 7;
                if ((i5 & -128) == 0) {
                    byte[] bArr3 = this.d;
                    int i6 = this.f;
                    this.f = i6 + 1;
                    y7.s(bArr3, (long) i6, (byte) i5);
                    return;
                }
                byte[] bArr4 = this.d;
                int i7 = this.f;
                this.f = i7 + 1;
                y7.s(bArr4, (long) i7, (byte) (i5 | 128));
                int i8 = i5 >>> 7;
                if ((i8 & -128) == 0) {
                    byte[] bArr5 = this.d;
                    int i9 = this.f;
                    this.f = i9 + 1;
                    y7.s(bArr5, (long) i9, (byte) i8);
                    return;
                }
                byte[] bArr6 = this.d;
                int i10 = this.f;
                this.f = i10 + 1;
                y7.s(bArr6, (long) i10, (byte) (i8 | 128));
                int i11 = i8 >>> 7;
                if ((i11 & -128) == 0) {
                    byte[] bArr7 = this.d;
                    int i12 = this.f;
                    this.f = i12 + 1;
                    y7.s(bArr7, (long) i12, (byte) i11);
                    return;
                }
                byte[] bArr8 = this.d;
                int i13 = this.f;
                this.f = i13 + 1;
                y7.s(bArr8, (long) i13, (byte) (i11 | 128));
                byte[] bArr9 = this.d;
                int i14 = this.f;
                this.f = i14 + 1;
                y7.s(bArr9, (long) i14, (byte) (i11 >>> 7));
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
            throw new x4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3797e), 1}), e2);
        }
    }

    public final void p(int i2) {
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
            throw new x4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3797e), 1}), e2);
        }
    }

    public final void q(long j2) {
        if (!y4.c || this.f3797e - this.f < 10) {
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
                throw new x4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3797e), 1}), e2);
            }
        } else {
            while ((j2 & -128) != 0) {
                byte[] bArr3 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                y7.s(bArr3, (long) i4, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr4 = this.d;
            int i5 = this.f;
            this.f = i5 + 1;
            y7.s(bArr4, (long) i5, (byte) ((int) j2));
        }
    }

    public final void r(long j2) {
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
            throw new x4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3797e), 1}), e2);
        }
    }

    public final void x(byte[] bArr, int i2, int i3) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i3);
            this.f += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new x4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.f3797e), Integer.valueOf(i3)}), e2);
        }
    }

    public final void y(byte[] bArr, int i2, int i3) {
        x(bArr, 0, i3);
    }

    public final int z() {
        return this.f3797e - this.f;
    }
}
