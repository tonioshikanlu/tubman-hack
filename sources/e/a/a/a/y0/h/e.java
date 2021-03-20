package e.a.a.a.y0.h;

import java.io.IOException;
import java.io.OutputStream;

public final class e {
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9231b;
    public int c;
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final OutputStream f9232e;

    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public e(OutputStream outputStream, byte[] bArr) {
        this.f9232e = outputStream;
        this.a = bArr;
        this.c = 0;
        this.f9231b = bArr.length;
    }

    public static int a(c cVar) {
        return cVar.size() + g(cVar.size());
    }

    public static int b(int i2, int i3) {
        return i(i2) + d(i3);
    }

    public static int c(int i2, int i3) {
        return d(i3) + i(i2);
    }

    public static int d(int i2) {
        if (i2 >= 0) {
            return g(i2);
        }
        return 10;
    }

    public static int e(int i2, p pVar) {
        int i3 = i(i2);
        int a2 = pVar.a();
        return i3 + g(a2) + a2;
    }

    public static int f(p pVar) {
        int a2 = pVar.a();
        return g(a2) + a2;
    }

    public static int g(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public static int h(long j2) {
        if ((-128 & j2) == 0) {
            return 1;
        }
        if ((-16384 & j2) == 0) {
            return 2;
        }
        if ((-2097152 & j2) == 0) {
            return 3;
        }
        if ((-268435456 & j2) == 0) {
            return 4;
        }
        if ((-34359738368L & j2) == 0) {
            return 5;
        }
        if ((-4398046511104L & j2) == 0) {
            return 6;
        }
        if ((-562949953421312L & j2) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int i(int i2) {
        return g((i2 << 3) | 0);
    }

    public static e k(OutputStream outputStream, int i2) {
        return new e(outputStream, new byte[i2]);
    }

    public void A(int i2, int i3) {
        y((i2 << 3) | i3);
    }

    public void j() {
        if (this.f9232e != null) {
            l();
        }
    }

    public final void l() {
        OutputStream outputStream = this.f9232e;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new a();
    }

    public void m(c cVar) {
        y(cVar.size());
        u(cVar);
    }

    public void n(int i2, int i3) {
        y((i2 << 3) | 0);
        if (i3 >= 0) {
            y(i3);
        } else {
            z((long) i3);
        }
    }

    public void o(int i2) {
        if (i2 >= 0) {
            y(i2);
        } else {
            z((long) i2);
        }
    }

    public void p(int i2, int i3) {
        y((i2 << 3) | 0);
        if (i3 >= 0) {
            y(i3);
        } else {
            z((long) i3);
        }
    }

    public void q(int i2) {
        if (i2 >= 0) {
            y(i2);
        } else {
            z((long) i2);
        }
    }

    public void r(int i2, p pVar) {
        y((i2 << 3) | 2);
        y(pVar.a());
        pVar.d(this);
    }

    public void s(p pVar) {
        y(pVar.a());
        pVar.d(this);
    }

    public void t(int i2) {
        byte b2 = (byte) i2;
        if (this.c == this.f9231b) {
            l();
        }
        byte[] bArr = this.a;
        int i3 = this.c;
        this.c = i3 + 1;
        bArr[i3] = b2;
        this.d++;
    }

    public void u(c cVar) {
        int size = cVar.size();
        int i2 = this.f9231b;
        int i3 = this.c;
        int i4 = i2 - i3;
        if (i4 >= size) {
            cVar.n(this.a, 0, i3, size);
            this.c += size;
        } else {
            cVar.n(this.a, 0, i3, i4);
            int i5 = i4 + 0;
            size -= i4;
            this.c = this.f9231b;
            this.d += i4;
            l();
            if (size <= this.f9231b) {
                cVar.n(this.a, i5, 0, size);
                this.c = size;
            } else {
                OutputStream outputStream = this.f9232e;
                if (i5 < 0) {
                    throw new IndexOutOfBoundsException(b.e.a.a.a.Q(30, "Source offset < 0: ", i5));
                } else if (size >= 0) {
                    int i6 = i5 + size;
                    if (i6 > cVar.size()) {
                        throw new IndexOutOfBoundsException(b.e.a.a.a.Q(39, "Source end offset exceeded: ", i6));
                    } else if (size > 0) {
                        cVar.L(outputStream, i5, size);
                    }
                } else {
                    throw new IndexOutOfBoundsException(b.e.a.a.a.Q(23, "Length < 0: ", size));
                }
            }
        }
        this.d += size;
    }

    public void v(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.f9231b;
        int i3 = this.c;
        int i4 = i2 - i3;
        if (i4 >= length) {
            System.arraycopy(bArr, 0, this.a, i3, length);
            this.c += length;
        } else {
            System.arraycopy(bArr, 0, this.a, i3, i4);
            int i5 = i4 + 0;
            length -= i4;
            this.c = this.f9231b;
            this.d += i4;
            l();
            if (length <= this.f9231b) {
                System.arraycopy(bArr, i5, this.a, 0, length);
                this.c = length;
            } else {
                this.f9232e.write(bArr, i5, length);
            }
        }
        this.d += length;
    }

    public void w(int i2) {
        t(i2 & 255);
        t((i2 >> 8) & 255);
        t((i2 >> 16) & 255);
        t((i2 >> 24) & 255);
    }

    public void x(long j2) {
        t(((int) j2) & 255);
        t(((int) (j2 >> 8)) & 255);
        t(((int) (j2 >> 16)) & 255);
        t(((int) (j2 >> 24)) & 255);
        t(((int) (j2 >> 32)) & 255);
        t(((int) (j2 >> 40)) & 255);
        t(((int) (j2 >> 48)) & 255);
        t(((int) (j2 >> 56)) & 255);
    }

    public void y(int i2) {
        while ((i2 & -128) != 0) {
            t((i2 & 127) | 128);
            i2 >>>= 7;
        }
        t(i2);
    }

    public void z(long j2) {
        while ((-128 & j2) != 0) {
            t((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        t((int) j2);
    }
}
