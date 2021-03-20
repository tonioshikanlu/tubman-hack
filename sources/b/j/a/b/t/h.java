package b.j.a.b.t;

import androidx.exifinterface.media.ExifInterface;
import androidx.media.AudioAttributesCompat;
import b.j.a.b.g;
import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.b.m;
import b.j.a.b.q.b;
import b.j.a.b.q.c;
import b.j.a.b.s.a;
import b.j.a.b.u.a;
import b.j.a.b.w.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class h extends b {
    public static final int c0 = i.a.ALLOW_TRAILING_COMMA.f1426i;
    public static final int d0 = i.a.ALLOW_NUMERIC_LEADING_ZEROS.f1426i;
    public static final int e0 = i.a.ALLOW_NON_NUMERIC_NUMBERS.f1426i;
    public static final int f0 = i.a.ALLOW_MISSING_VALUES.f1426i;
    public static final int g0 = i.a.ALLOW_SINGLE_QUOTES.f1426i;
    public static final int h0 = i.a.ALLOW_UNQUOTED_FIELD_NAMES.f1426i;
    public static final int i0 = i.a.ALLOW_COMMENTS.f1426i;
    public static final int j0 = i.a.ALLOW_YAML_COMMENTS.f1426i;
    public static final int[] k0 = a.d;
    public static final int[] l0 = a.c;
    public m R;
    public final b.j.a.b.u.a S;
    public int[] T = new int[16];
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public InputStream Z;
    public byte[] a0;
    public boolean b0;

    public h(b.j.a.b.s.b bVar, int i2, InputStream inputStream, m mVar, b.j.a.b.u.a aVar, byte[] bArr, int i3, int i4, int i5, boolean z) {
        super(bVar, i2);
        this.Z = inputStream;
        this.R = mVar;
        this.S = aVar;
        this.a0 = bArr;
        this.u = i3;
        this.v = i4;
        this.y = i3 - i5;
        this.w = (long) ((-i3) + i5);
        this.b0 = z;
    }

    public static final int j2(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | (-1 << (i3 << 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r0 != 8) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0() {
        /*
            r3 = this;
            b.j.a.b.l r0 = r3.f1459i
            r1 = 0
            if (r0 == 0) goto L_0x0022
            int r0 = r0.f1441k
            r2 = 6
            if (r0 == r2) goto L_0x0012
            r2 = 7
            if (r0 == r2) goto L_0x001b
            r2 = 8
            if (r0 == r2) goto L_0x001b
            goto L_0x0022
        L_0x0012:
            boolean r0 = r3.U
            if (r0 == 0) goto L_0x001b
            r3.U = r1
            r3.W1()
        L_0x001b:
            b.j.a.b.w.k r0 = r3.E
            int r0 = r0.o()
            return r0
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.h.A0():int");
    }

    public final void A2() {
        int[] iArr = a.f1463g;
        while (true) {
            if (this.u < this.v || a2()) {
                byte[] bArr = this.a0;
                int i2 = this.u;
                int i3 = i2 + 1;
                this.u = i3;
                byte b2 = bArr[i2] & ExifInterface.MARKER;
                int i4 = iArr[b2];
                if (i4 != 0) {
                    if (i4 == 2) {
                        C2();
                    } else if (i4 == 3) {
                        D2();
                    } else if (i4 == 4) {
                        E2();
                    } else if (i4 == 10) {
                        this.x++;
                        this.y = i3;
                        return;
                    } else if (i4 == 13) {
                        w2();
                        return;
                    } else if (i4 != 42 && i4 < 0) {
                        q2(b2);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    public g B0() {
        if (this.f1459i == l.FIELD_NAME) {
            return new g(y1(), this.w + ((long) (this.W - 1)), -1, this.X, this.Y);
        }
        return new g(y1(), this.z - 1, -1, this.A, this.B);
    }

    public void B2() {
        this.U = false;
        int[] iArr = k0;
        byte[] bArr = this.a0;
        while (true) {
            int i2 = this.u;
            int i3 = this.v;
            if (i2 >= i3) {
                b2();
                i2 = this.u;
                i3 = this.v;
            }
            while (true) {
                if (i2 >= i3) {
                    this.u = i2;
                    break;
                }
                int i4 = i2 + 1;
                byte b2 = bArr[i2] & ExifInterface.MARKER;
                if (iArr[b2] != 0) {
                    this.u = i4;
                    if (b2 != 34) {
                        int i5 = iArr[b2];
                        if (i5 == 1) {
                            w1();
                        } else if (i5 == 2) {
                            C2();
                        } else if (i5 == 3) {
                            D2();
                        } else if (i5 == 4) {
                            E2();
                        } else if (b2 < 32) {
                            F1(b2, "string value");
                        } else {
                            q2(b2);
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    i2 = i4;
                }
            }
        }
    }

    public final void C2() {
        if (this.u >= this.v) {
            b2();
        }
        byte[] bArr = this.a0;
        int i2 = this.u;
        int i3 = i2 + 1;
        this.u = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            t2(b2 & ExifInterface.MARKER, i3);
            throw null;
        }
    }

    public int D0() {
        l lVar = this.f1459i;
        if (lVar != l.VALUE_NUMBER_INT && lVar != l.VALUE_NUMBER_FLOAT) {
            return super.E0(0);
        }
        int i2 = this.J;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return B1();
            }
            if ((i2 & 1) == 0) {
                H1();
            }
        }
        return this.K;
    }

    public void D1() {
        byte[] bArr;
        super.D1();
        b.j.a.b.u.a aVar = this.S;
        b.j.a.b.u.a aVar2 = aVar.a;
        if (aVar2 != null && (!aVar.f1524o)) {
            a.C0047a aVar3 = new a.C0047a(aVar);
            int i2 = aVar3.f1525b;
            a.C0047a aVar4 = aVar2.f1514b.get();
            if (i2 != aVar4.f1525b) {
                if (i2 > 6000) {
                    aVar3 = a.C0047a.a(64);
                }
                aVar2.f1514b.compareAndSet(aVar4, aVar3);
            }
            aVar.f1524o = true;
        }
        if (this.b0 && (bArr = this.a0) != null) {
            this.a0 = c.f1451j;
            this.s.f(bArr);
        }
    }

    public final void D2() {
        if (this.u >= this.v) {
            b2();
        }
        byte[] bArr = this.a0;
        int i2 = this.u;
        int i3 = i2 + 1;
        this.u = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) == 128) {
            if (i3 >= this.v) {
                b2();
            }
            byte[] bArr2 = this.a0;
            int i4 = this.u;
            int i5 = i4 + 1;
            this.u = i5;
            byte b3 = bArr2[i4];
            if ((b3 & 192) != 128) {
                t2(b3 & ExifInterface.MARKER, i5);
                throw null;
            }
            return;
        }
        t2(b2 & ExifInterface.MARKER, i3);
        throw null;
    }

    public int E0(int i2) {
        l lVar = this.f1459i;
        if (lVar != l.VALUE_NUMBER_INT && lVar != l.VALUE_NUMBER_FLOAT) {
            return super.E0(i2);
        }
        int i3 = this.J;
        if ((i3 & 1) == 0) {
            if (i3 == 0) {
                return B1();
            }
            if ((i3 & 1) == 0) {
                H1();
            }
        }
        return this.K;
    }

    public final void E2() {
        if (this.u >= this.v) {
            b2();
        }
        byte[] bArr = this.a0;
        int i2 = this.u;
        int i3 = i2 + 1;
        this.u = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) == 128) {
            if (i3 >= this.v) {
                b2();
            }
            byte[] bArr2 = this.a0;
            int i4 = this.u;
            int i5 = i4 + 1;
            this.u = i5;
            byte b3 = bArr2[i4];
            if ((b3 & 192) == 128) {
                if (i5 >= this.v) {
                    b2();
                }
                byte[] bArr3 = this.a0;
                int i6 = this.u;
                int i7 = i6 + 1;
                this.u = i7;
                byte b4 = bArr3[i6];
                if ((b4 & 192) != 128) {
                    t2(b4 & ExifInterface.MARKER, i7);
                    throw null;
                }
                return;
            }
            t2(b3 & ExifInterface.MARKER, i5);
            throw null;
        }
        t2(b2 & ExifInterface.MARKER, i3);
        throw null;
    }

    public final int F2() {
        while (true) {
            int i2 = this.u;
            if (i2 >= this.v) {
                return G2();
            }
            byte[] bArr = this.a0;
            int i3 = i2 + 1;
            this.u = i3;
            byte b2 = bArr[i2] & ExifInterface.MARKER;
            if (b2 > 32) {
                if (b2 != 47 && b2 != 35) {
                    return b2;
                }
                this.u = i3 - 1;
                return G2();
            } else if (b2 != 32) {
                if (b2 == 10) {
                    this.x++;
                    this.y = i3;
                } else if (b2 == 13) {
                    w2();
                } else if (b2 != 9) {
                    m1(b2);
                    throw null;
                }
            }
        }
    }

    public final int G2() {
        byte b2;
        while (true) {
            if (this.u < this.v || a2()) {
                byte[] bArr = this.a0;
                int i2 = this.u;
                int i3 = i2 + 1;
                this.u = i3;
                b2 = bArr[i2] & ExifInterface.MARKER;
                if (b2 > 32) {
                    if (b2 == 47) {
                        z2();
                    } else if (b2 != 35 || !J2()) {
                        return b2;
                    }
                } else if (b2 == 32) {
                    continue;
                } else if (b2 == 10) {
                    this.x++;
                    this.y = i3;
                } else if (b2 == 13) {
                    w2();
                } else if (b2 != 9) {
                    m1(b2);
                    throw null;
                }
            } else {
                StringBuilder y = b.e.a.a.a.y("Unexpected end-of-input within/between ");
                y.append(this.C.h());
                y.append(" entries");
                throw new b.j.a.b.h(this, y.toString());
            }
        }
        return b2;
    }

    public String H0() {
        l lVar = this.f1459i;
        if (lVar != l.VALUE_STRING) {
            return lVar == l.FIELD_NAME ? e0() : super.I0((String) null);
        }
        if (!this.U) {
            return this.E.h();
        }
        this.U = false;
        return V1();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089 A[SYNTHETIC] */
    public final int H2() {
        /*
            r10 = this;
            int r0 = r10.u
            int r1 = r10.v
            if (r0 < r1) goto L_0x0011
            boolean r0 = r10.a2()
            if (r0 != 0) goto L_0x0011
            r10.d1()
            r0 = -1
            return r0
        L_0x0011:
            byte[] r0 = r10.a0
            int r1 = r10.u
            int r2 = r1 + 1
            r10.u = r2
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 35
            r3 = 47
            r4 = 32
            if (r0 <= r4) goto L_0x0034
            if (r0 == r3) goto L_0x002b
            if (r0 != r1) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            return r0
        L_0x002b:
            int r2 = r2 + -1
            r10.u = r2
        L_0x002f:
            int r0 = r10.I2()
            return r0
        L_0x0034:
            r5 = 0
            r6 = 9
            r7 = 13
            r8 = 10
            if (r0 == r4) goto L_0x0055
            if (r0 != r8) goto L_0x0048
            int r0 = r10.x
            int r0 = r0 + 1
            r10.x = r0
            r10.y = r2
            goto L_0x0055
        L_0x0048:
            if (r0 != r7) goto L_0x004e
        L_0x004a:
            r10.w2()
            goto L_0x0055
        L_0x004e:
            if (r0 != r6) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            r10.m1(r0)
            throw r5
        L_0x0055:
            int r0 = r10.u
            int r2 = r10.v
            if (r0 >= r2) goto L_0x0089
            byte[] r2 = r10.a0
            int r9 = r0 + 1
            r10.u = r9
            byte r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 <= r4) goto L_0x0072
            if (r0 == r3) goto L_0x006d
            if (r0 != r1) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            return r0
        L_0x006d:
            int r9 = r9 + -1
            r10.u = r9
            goto L_0x002f
        L_0x0072:
            if (r0 == r4) goto L_0x0055
            if (r0 != r8) goto L_0x007f
            int r0 = r10.x
            int r0 = r0 + 1
            r10.x = r0
            r10.y = r9
            goto L_0x0055
        L_0x007f:
            if (r0 != r7) goto L_0x0082
            goto L_0x004a
        L_0x0082:
            if (r0 != r6) goto L_0x0085
            goto L_0x0055
        L_0x0085:
            r10.m1(r0)
            throw r5
        L_0x0089:
            int r0 = r10.I2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.h.H2():int");
    }

    public String I0(String str) {
        l lVar = this.f1459i;
        if (lVar != l.VALUE_STRING) {
            return lVar == l.FIELD_NAME ? e0() : super.I0(str);
        }
        if (!this.U) {
            return this.E.h();
        }
        this.U = false;
        return V1();
    }

    public final int I2() {
        byte b2;
        while (true) {
            if (this.u < this.v || a2()) {
                byte[] bArr = this.a0;
                int i2 = this.u;
                int i3 = i2 + 1;
                this.u = i3;
                b2 = bArr[i2] & ExifInterface.MARKER;
                if (b2 > 32) {
                    if (b2 == 47) {
                        z2();
                    } else if (b2 != 35 || !J2()) {
                        return b2;
                    }
                } else if (b2 == 32) {
                    continue;
                } else if (b2 == 10) {
                    this.x++;
                    this.y = i3;
                } else if (b2 == 13) {
                    w2();
                } else if (b2 != 9) {
                    m1(b2);
                    throw null;
                }
            } else {
                d1();
                return -1;
            }
        }
        return b2;
    }

    public final boolean J2() {
        if ((this.f1416h & j0) == 0) {
            return false;
        }
        A2();
        return true;
    }

    public final void K2() {
        this.A = this.x;
        int i2 = this.u;
        this.z = this.w + ((long) i2);
        this.B = i2 - this.y;
    }

    public final int L2() {
        if (this.u >= this.v && !a2()) {
            return 48;
        }
        byte[] bArr = this.a0;
        int i2 = this.u;
        byte b2 = bArr[i2] & ExifInterface.MARKER;
        if (b2 < 48 || b2 > 57) {
            return 48;
        }
        if ((this.f1416h & d0) != 0) {
            this.u = i2 + 1;
            if (b2 == 48) {
                do {
                    if (this.u >= this.v && !a2()) {
                        break;
                    }
                    byte[] bArr2 = this.a0;
                    int i3 = this.u;
                    b2 = bArr2[i3] & ExifInterface.MARKER;
                    if (b2 < 48 || b2 > 57) {
                        return 48;
                    }
                    this.u = i3 + 1;
                } while (b2 == 48);
            }
            return b2;
        }
        throw new b.j.a.b.h(this, b.e.a.a.a.m("Invalid numeric value: ", "Leading zeroes not allowed"));
    }

    public final void M1(String str, int i2, int i3) {
        if (Character.isJavaIdentifierPart((char) Q1(i3))) {
            u2(str.substring(0, i2));
            throw null;
        }
    }

    public final void M2(int i2) {
        int i3 = this.u + 1;
        this.u = i3;
        if (i2 == 9) {
            return;
        }
        if (i2 == 10) {
            this.x++;
            this.y = i3;
        } else if (i2 == 13) {
            w2();
        } else if (i2 != 32) {
            l1(i2, "Expected space separating root-level values");
            throw null;
        }
    }

    public byte[] N(b.j.a.b.a aVar) {
        l lVar = this.f1459i;
        if (lVar == l.VALUE_STRING || (lVar == l.VALUE_EMBEDDED_OBJECT && this.I != null)) {
            if (this.U) {
                try {
                    this.I = P1(aVar);
                    this.U = false;
                } catch (IllegalArgumentException e2) {
                    throw new b.j.a.b.h(this, "Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e2.getMessage());
                }
            } else if (this.I == null) {
                b.j.a.b.w.c x1 = x1();
                b1(x0(), x1, aVar);
                this.I = x1.N();
            }
            return this.I;
        }
        StringBuilder y = b.e.a.a.a.y("Current token (");
        y.append(this.f1459i);
        y.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        throw new b.j.a.b.h(this, y.toString());
    }

    public final void N1() {
        K2();
        if (this.C.d()) {
            this.C = this.C.i();
        } else {
            E1(93, '}');
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String N2(int[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            b.j.a.b.w.k r8 = r0.E
            char[] r8 = r8.i()
            r10 = 0
            r11 = 0
        L_0x0025:
            if (r10 >= r4) goto L_0x00fe
            int r12 = r10 >> 2
            r12 = r1[r12]
            r13 = r10 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r10 = r10 + 1
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00eb
            r13 = r12 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r6 = 1
            if (r13 != r14) goto L_0x0044
            r12 = r12 & 31
            r13 = r6
            goto L_0x0057
        L_0x0044:
            r13 = r12 & 240(0xf0, float:3.36E-43)
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 != r14) goto L_0x004e
            r12 = r12 & 15
            r13 = 2
            goto L_0x0057
        L_0x004e:
            r13 = r12 & 248(0xf8, float:3.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
            if (r13 != r14) goto L_0x00e6
            r12 = r12 & 7
            r13 = r7
        L_0x0057:
            int r14 = r10 + r13
            if (r14 > r4) goto L_0x00dd
            int r14 = r10 >> 2
            r14 = r1[r14]
            r16 = r10 & 3
            int r16 = 3 - r16
            int r16 = r16 << 3
            int r14 = r14 >> r16
            int r10 = r10 + 1
            r15 = r14 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r15 != r5) goto L_0x00d8
            int r12 = r12 << 6
            r14 = r14 & 63
            r12 = r12 | r14
            if (r13 <= r6) goto L_0x00b4
            int r6 = r10 >> 2
            r6 = r1[r6]
            r14 = r10 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r6 = r6 >> r14
            int r10 = r10 + 1
            r14 = r6 & 192(0xc0, float:2.69E-43)
            if (r14 != r5) goto L_0x00af
            int r12 = r12 << 6
            r6 = r6 & 63
            r6 = r6 | r12
            r12 = 2
            if (r13 <= r12) goto L_0x00ac
            int r12 = r10 >> 2
            r12 = r1[r12]
            r14 = r10 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r12 = r12 >> r14
            int r10 = r10 + 1
            r14 = r12 & 192(0xc0, float:2.69E-43)
            if (r14 != r5) goto L_0x00a5
            int r5 = r6 << 6
            r6 = r12 & 63
            r5 = r5 | r6
            r12 = r5
            goto L_0x00b4
        L_0x00a5:
            r1 = r12 & 255(0xff, float:3.57E-43)
            r0.s2(r1)
            r5 = 0
            throw r5
        L_0x00ac:
            r5 = r12
            r12 = r6
            goto L_0x00b5
        L_0x00af:
            r5 = 0
            r0.s2(r6)
            throw r5
        L_0x00b4:
            r5 = 2
        L_0x00b5:
            if (r13 <= r5) goto L_0x00eb
            r5 = 65536(0x10000, float:9.18355E-41)
            int r12 = r12 - r5
            int r5 = r8.length
            if (r11 < r5) goto L_0x00c4
            b.j.a.b.w.k r5 = r0.E
            char[] r5 = r5.k()
            r8 = r5
        L_0x00c4:
            int r5 = r11 + 1
            r6 = 55296(0xd800, float:7.7486E-41)
            int r13 = r12 >> 10
            int r13 = r13 + r6
            char r6 = (char) r13
            r8[r11] = r6
            r6 = 56320(0xdc00, float:7.8921E-41)
            r11 = r12 & 1023(0x3ff, float:1.434E-42)
            r12 = r11 | r6
            r11 = r5
            goto L_0x00eb
        L_0x00d8:
            r0.s2(r14)
            r1 = 0
            throw r1
        L_0x00dd:
            r1 = 0
            b.j.a.b.l r2 = b.j.a.b.l.FIELD_NAME
            java.lang.String r3 = " in field name"
            r0.j1(r3, r2)
            throw r1
        L_0x00e6:
            r1 = 0
            r0.r2(r12)
            throw r1
        L_0x00eb:
            int r5 = r8.length
            if (r11 < r5) goto L_0x00f5
            b.j.a.b.w.k r5 = r0.E
            char[] r5 = r5.k()
            r8 = r5
        L_0x00f5:
            int r5 = r11 + 1
            char r6 = (char) r12
            r8[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0025
        L_0x00fe:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r8, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x010b
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x010b:
            b.j.a.b.u.a r3 = r0.S
            java.lang.String r1 = r3.g(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.h.N2(int[], int, int):java.lang.String");
    }

    public final void O1() {
        K2();
        if (this.C.e()) {
            this.C = this.C.i();
        } else {
            E1(125, ']');
            throw null;
        }
    }

    public final String O2(int i2, int i3) {
        int j2 = j2(i2, i3);
        String k2 = this.S.k(j2);
        if (k2 != null) {
            return k2;
        }
        int[] iArr = this.T;
        iArr[0] = j2;
        return N2(iArr, 1, i3);
    }

    public final byte[] P1(b.j.a.b.a aVar) {
        b.j.a.b.w.c x1 = x1();
        while (true) {
            if (this.u >= this.v) {
                b2();
            }
            byte[] bArr = this.a0;
            int i2 = this.u;
            this.u = i2 + 1;
            byte b2 = bArr[i2] & ExifInterface.MARKER;
            if (b2 > 32) {
                int e2 = aVar.e(b2);
                if (e2 < 0) {
                    if (b2 == 34) {
                        return x1.N();
                    }
                    e2 = v1(aVar, b2, 0);
                    if (e2 < 0) {
                        continue;
                    }
                }
                if (this.u >= this.v) {
                    b2();
                }
                byte[] bArr2 = this.a0;
                int i3 = this.u;
                this.u = i3 + 1;
                byte b3 = bArr2[i3] & ExifInterface.MARKER;
                int e3 = aVar.e(b3);
                if (e3 < 0) {
                    e3 = v1(aVar, b3, 1);
                }
                int i4 = (e2 << 6) | e3;
                if (this.u >= this.v) {
                    b2();
                }
                byte[] bArr3 = this.a0;
                int i5 = this.u;
                this.u = i5 + 1;
                byte b4 = bArr3[i5] & ExifInterface.MARKER;
                int e4 = aVar.e(b4);
                if (e4 < 0) {
                    if (e4 != -2) {
                        if (b4 == 34) {
                            x1.e(i4 >> 4);
                            if (!aVar.f1369l) {
                                return x1.N();
                            }
                            this.u--;
                            z1(aVar);
                            throw null;
                        }
                        e4 = v1(aVar, b4, 2);
                    }
                    if (e4 == -2) {
                        if (this.u >= this.v) {
                            b2();
                        }
                        byte[] bArr4 = this.a0;
                        int i6 = this.u;
                        this.u = i6 + 1;
                        byte b5 = bArr4[i6] & ExifInterface.MARKER;
                        if (aVar.m(b5) || v1(aVar, b5, 3) == -2) {
                            x1.e(i4 >> 4);
                        } else {
                            StringBuilder y = b.e.a.a.a.y("expected padding character '");
                            y.append(aVar.f1370m);
                            y.append("'");
                            throw J1(aVar, b5, 3, y.toString());
                        }
                    }
                }
                int i7 = (i4 << 6) | e4;
                if (this.u >= this.v) {
                    b2();
                }
                byte[] bArr5 = this.a0;
                int i8 = this.u;
                this.u = i8 + 1;
                byte b6 = bArr5[i8] & ExifInterface.MARKER;
                int e5 = aVar.e(b6);
                if (e5 < 0) {
                    if (e5 != -2) {
                        if (b6 == 34) {
                            x1.z(i7 >> 2);
                            if (!aVar.f1369l) {
                                return x1.N();
                            }
                            this.u--;
                            z1(aVar);
                            throw null;
                        }
                        e5 = v1(aVar, b6, 3);
                    }
                    if (e5 == -2) {
                        x1.z(i7 >> 2);
                    }
                }
                x1.q((i7 << 6) | e5);
            }
        }
    }

    public final String P2(int i2, int i3, int i4) {
        int j2 = j2(i3, i4);
        String l2 = this.S.l(i2, j2);
        if (l2 != null) {
            return l2;
        }
        int[] iArr = this.T;
        iArr[0] = i2;
        iArr[1] = j2;
        return N2(iArr, 2, i4);
    }

    public int Q1(int i2) {
        int i3;
        char c;
        int i4 = i2 & 255;
        if (i4 <= 127) {
            return i4;
        }
        if ((i4 & 224) == 192) {
            i3 = i4 & 31;
            c = 1;
        } else if ((i4 & 240) == 224) {
            i3 = i4 & 15;
            c = 2;
        } else if ((i4 & 248) == 240) {
            i3 = i4 & 7;
            c = 3;
        } else {
            r2(i4 & 255);
            throw null;
        }
        int S2 = S2();
        if ((S2 & 192) == 128) {
            int i5 = (i3 << 6) | (S2 & 63);
            if (c <= 1) {
                return i5;
            }
            int S22 = S2();
            if ((S22 & 192) == 128) {
                int i6 = (i5 << 6) | (S22 & 63);
                if (c <= 2) {
                    return i6;
                }
                int S23 = S2();
                if ((S23 & 192) == 128) {
                    return (i6 << 6) | (S23 & 63);
                }
                s2(S23 & 255);
                throw null;
            }
            s2(S22 & 255);
            throw null;
        }
        s2(S2 & 255);
        throw null;
    }

    public final String Q2(int i2, int i3, int i4, int i5) {
        int j2 = j2(i4, i5);
        String m2 = this.S.m(i2, i3, j2);
        if (m2 != null) {
            return m2;
        }
        int[] iArr = this.T;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = j2(j2, i5);
        return N2(iArr, 3, i5);
    }

    public String R0() {
        l lVar;
        l lVar2;
        this.J = 0;
        l lVar3 = this.f1459i;
        l lVar4 = l.FIELD_NAME;
        if (lVar3 == lVar4) {
            h2();
            return null;
        }
        if (this.U) {
            B2();
        }
        int H2 = H2();
        if (H2 < 0) {
            close();
            this.f1459i = null;
            return null;
        }
        this.I = null;
        if (H2 == 93) {
            N1();
            this.f1459i = l.END_ARRAY;
            return null;
        } else if (H2 == 125) {
            O1();
            this.f1459i = l.END_OBJECT;
            return null;
        } else {
            if (this.C.l()) {
                if (H2 == 44) {
                    H2 = F2();
                    if ((this.f1416h & c0) != 0 && (H2 == 93 || H2 == 125)) {
                        if (H2 == 125) {
                            O1();
                            lVar2 = l.END_OBJECT;
                        } else {
                            N1();
                            lVar2 = l.END_ARRAY;
                        }
                        this.f1459i = lVar2;
                        return null;
                    }
                } else {
                    StringBuilder y = b.e.a.a.a.y("was expecting comma to separate ");
                    y.append(this.C.h());
                    y.append(" entries");
                    l1(H2, y.toString());
                    throw null;
                }
            }
            if (!this.C.e()) {
                K2();
                i2(H2);
                return null;
            }
            this.X = this.x;
            int i2 = this.u;
            this.W = i2;
            this.Y = i2 - this.y;
            String l2 = l2(H2);
            this.C.n(l2);
            this.f1459i = lVar4;
            int x2 = x2();
            K2();
            if (x2 == 34) {
                this.U = true;
                this.D = l.VALUE_STRING;
                return l2;
            }
            if (x2 == 45) {
                lVar = m2();
            } else if (x2 == 91) {
                lVar = l.START_ARRAY;
            } else if (x2 == 102) {
                c2();
                lVar = l.VALUE_FALSE;
            } else if (x2 == 110) {
                d2();
                lVar = l.VALUE_NULL;
            } else if (x2 == 116) {
                g2();
                lVar = l.VALUE_TRUE;
            } else if (x2 != 123) {
                switch (x2) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        lVar = o2(x2);
                        break;
                    default:
                        lVar = Z1(x2);
                        break;
                }
            } else {
                lVar = l.START_OBJECT;
            }
            this.D = lVar;
            return l2;
        }
    }

    public final int R1(int i2) {
        if (this.u >= this.v) {
            b2();
        }
        byte[] bArr = this.a0;
        int i3 = this.u;
        int i4 = i3 + 1;
        this.u = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) == 128) {
            return ((i2 & 31) << 6) | (b2 & 63);
        }
        t2(b2 & ExifInterface.MARKER, i4);
        throw null;
    }

    public final String R2(int[] iArr, int i2, int i3, int i4) {
        if (i2 >= iArr.length) {
            iArr = b.I1(iArr, iArr.length);
            this.T = iArr;
        }
        int i5 = i2 + 1;
        iArr[i2] = j2(i3, i4);
        String n2 = this.S.n(iArr, i5);
        return n2 == null ? N2(iArr, i5, i4) : n2;
    }

    public m S() {
        return this.R;
    }

    public String S0() {
        d k2;
        if (this.f1459i == l.FIELD_NAME) {
            this.G = false;
            l lVar = this.D;
            this.D = null;
            this.f1459i = lVar;
            if (lVar != l.VALUE_STRING) {
                if (lVar == l.START_ARRAY) {
                    k2 = this.C.j(this.A, this.B);
                } else {
                    if (lVar == l.START_OBJECT) {
                        k2 = this.C.k(this.A, this.B);
                    }
                    return null;
                }
                this.C = k2;
                return null;
            } else if (!this.U) {
                return this.E.h();
            } else {
                this.U = false;
                return V1();
            }
        } else if (T0() == l.VALUE_STRING) {
            return x0();
        } else {
            return null;
        }
    }

    public final int S1(int i2) {
        if (this.u >= this.v) {
            b2();
        }
        int i3 = i2 & 15;
        byte[] bArr = this.a0;
        int i4 = this.u;
        int i5 = i4 + 1;
        this.u = i5;
        byte b2 = bArr[i4];
        if ((b2 & 192) == 128) {
            byte b3 = (i3 << 6) | (b2 & 63);
            if (i5 >= this.v) {
                b2();
            }
            byte[] bArr2 = this.a0;
            int i6 = this.u;
            int i7 = i6 + 1;
            this.u = i7;
            byte b4 = bArr2[i6];
            if ((b4 & 192) == 128) {
                return (b3 << 6) | (b4 & 63);
            }
            t2(b4 & ExifInterface.MARKER, i7);
            throw null;
        }
        t2(b2 & ExifInterface.MARKER, i5);
        throw null;
    }

    public final int S2() {
        if (this.u >= this.v) {
            b2();
        }
        byte[] bArr = this.a0;
        int i2 = this.u;
        this.u = i2 + 1;
        return bArr[i2] & ExifInterface.MARKER;
    }

    public l T0() {
        l lVar;
        l lVar2;
        l lVar3 = this.f1459i;
        l lVar4 = l.FIELD_NAME;
        if (lVar3 == lVar4) {
            return h2();
        }
        this.J = 0;
        if (this.U) {
            B2();
        }
        int H2 = H2();
        if (H2 < 0) {
            close();
            this.f1459i = null;
            return null;
        }
        this.I = null;
        if (H2 == 93) {
            N1();
            l lVar5 = l.END_ARRAY;
            this.f1459i = lVar5;
            return lVar5;
        } else if (H2 == 125) {
            O1();
            l lVar6 = l.END_OBJECT;
            this.f1459i = lVar6;
            return lVar6;
        } else {
            if (this.C.l()) {
                if (H2 == 44) {
                    H2 = F2();
                    if ((this.f1416h & c0) != 0 && (H2 == 93 || H2 == 125)) {
                        if (H2 == 125) {
                            O1();
                            lVar2 = l.END_OBJECT;
                        } else {
                            N1();
                            lVar2 = l.END_ARRAY;
                        }
                        this.f1459i = lVar2;
                        return lVar2;
                    }
                } else {
                    StringBuilder y = b.e.a.a.a.y("was expecting comma to separate ");
                    y.append(this.C.h());
                    y.append(" entries");
                    l1(H2, y.toString());
                    throw null;
                }
            }
            if (!this.C.e()) {
                K2();
                return i2(H2);
            }
            this.X = this.x;
            int i2 = this.u;
            this.W = i2;
            this.Y = i2 - this.y;
            this.C.n(l2(H2));
            this.f1459i = lVar4;
            int x2 = x2();
            K2();
            if (x2 == 34) {
                this.U = true;
                this.D = l.VALUE_STRING;
                return this.f1459i;
            }
            if (x2 == 45) {
                lVar = m2();
            } else if (x2 == 91) {
                lVar = l.START_ARRAY;
            } else if (x2 == 102) {
                c2();
                lVar = l.VALUE_FALSE;
            } else if (x2 == 110) {
                d2();
                lVar = l.VALUE_NULL;
            } else if (x2 == 116) {
                g2();
                lVar = l.VALUE_TRUE;
            } else if (x2 != 123) {
                switch (x2) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        lVar = o2(x2);
                        break;
                    default:
                        lVar = Z1(x2);
                        break;
                }
            } else {
                lVar = l.START_OBJECT;
            }
            this.D = lVar;
            return this.f1459i;
        }
    }

    public final int T1(int i2) {
        int i3 = i2 & 15;
        byte[] bArr = this.a0;
        int i4 = this.u;
        int i5 = i4 + 1;
        this.u = i5;
        byte b2 = bArr[i4];
        if ((b2 & 192) == 128) {
            byte b3 = (i3 << 6) | (b2 & 63);
            int i6 = i5 + 1;
            this.u = i6;
            byte b4 = bArr[i5];
            if ((b4 & 192) == 128) {
                return (b3 << 6) | (b4 & 63);
            }
            t2(b4 & ExifInterface.MARKER, i6);
            throw null;
        }
        t2(b2 & ExifInterface.MARKER, i5);
        throw null;
    }

    public final String T2(int[] iArr, int i2, int i3, int i4, int i5) {
        int[] iArr2 = l0;
        while (true) {
            if (iArr2[i4] != 0) {
                if (i4 == 34) {
                    if (r10 > 0) {
                        if (i2 >= iArr.length) {
                            iArr = b.I1(iArr, iArr.length);
                            this.T = iArr;
                        }
                        iArr[i2] = j2(r8, r10);
                        i2++;
                    }
                    String n2 = this.S.n(iArr, i2);
                    return n2 == null ? N2(iArr, i2, r10) : n2;
                }
                if (i4 != 92) {
                    F1(i4, "name");
                } else {
                    i4 = w1();
                }
                if (i4 > 127) {
                    int i6 = 0;
                    if (r10 >= 4) {
                        if (i2 >= iArr.length) {
                            iArr = b.I1(iArr, iArr.length);
                            this.T = iArr;
                        }
                        iArr[i2] = r8;
                        i2++;
                        r8 = 0;
                        r10 = 0;
                    }
                    int i7 = r8 << 8;
                    if (i4 < 2048) {
                        r8 = i7 | (i4 >> 6) | 192;
                        r10++;
                    } else {
                        int i8 = i7 | (i4 >> 12) | 224;
                        int i9 = r10 + 1;
                        if (i9 >= 4) {
                            if (i2 >= iArr.length) {
                                iArr = b.I1(iArr, iArr.length);
                                this.T = iArr;
                            }
                            iArr[i2] = i8;
                            i2++;
                            i9 = 0;
                        } else {
                            i6 = i8;
                        }
                        r8 = (i6 << 8) | ((i4 >> 6) & 63) | 128;
                        r10 = i9 + 1;
                    }
                    i4 = (i4 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i5 = r10 + 1;
                i3 = (r8 << 8) | i4;
            } else {
                if (i2 >= iArr.length) {
                    iArr = b.I1(iArr, iArr.length);
                    this.T = iArr;
                }
                iArr[i2] = r8;
                i3 = i4;
                i2++;
                i5 = 1;
            }
            if (this.u < this.v || a2()) {
                byte[] bArr = this.a0;
                int i10 = this.u;
                this.u = i10 + 1;
                i4 = bArr[i10] & ExifInterface.MARKER;
            } else {
                j1(" in field name", l.FIELD_NAME);
                throw null;
            }
        }
    }

    public final int U1(int i2) {
        if (this.u >= this.v) {
            b2();
        }
        byte[] bArr = this.a0;
        int i3 = this.u;
        int i4 = i3 + 1;
        this.u = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) == 128) {
            byte b3 = ((i2 & 7) << 6) | (b2 & 63);
            if (i4 >= this.v) {
                b2();
            }
            byte[] bArr2 = this.a0;
            int i5 = this.u;
            int i6 = i5 + 1;
            this.u = i6;
            byte b4 = bArr2[i5];
            if ((b4 & 192) == 128) {
                byte b5 = (b3 << 6) | (b4 & 63);
                if (i6 >= this.v) {
                    b2();
                }
                byte[] bArr3 = this.a0;
                int i7 = this.u;
                int i8 = i7 + 1;
                this.u = i8;
                byte b6 = bArr3[i7];
                if ((b6 & 192) == 128) {
                    return ((b5 << 6) | (b6 & 63)) - 65536;
                }
                t2(b6 & ExifInterface.MARKER, i8);
                throw null;
            }
            t2(b4 & ExifInterface.MARKER, i6);
            throw null;
        }
        t2(b2 & ExifInterface.MARKER, i4);
        throw null;
    }

    public final String U2(int i2, int i3, int i4) {
        return T2(this.T, 0, i2, i3, i4);
    }

    public String V1() {
        int i2 = this.u;
        if (i2 >= this.v) {
            b2();
            i2 = this.u;
        }
        char[] i3 = this.E.i();
        int[] iArr = k0;
        int min = Math.min(this.v, i3.length + i2);
        byte[] bArr = this.a0;
        int i4 = 0;
        while (true) {
            if (i2 >= min) {
                break;
            }
            byte b2 = bArr[i2] & ExifInterface.MARKER;
            if (iArr[b2] == 0) {
                i2++;
                i3[i4] = (char) b2;
                i4++;
            } else if (b2 == 34) {
                this.u = i2 + 1;
                k kVar = this.E;
                kVar.f1581i = i4;
                if (kVar.f1579g > 0) {
                    return kVar.h();
                }
                String str = i4 == 0 ? "" : new String(kVar.f1580h, 0, i4);
                kVar.f1582j = str;
                return str;
            }
        }
        this.u = i2;
        X1(i3, i4);
        return this.E.h();
    }

    public final String V2(int i2, int i3, int i4, int i5) {
        int[] iArr = this.T;
        iArr[0] = i2;
        return T2(iArr, 1, i3, i4, i5);
    }

    public int W0(b.j.a.b.a aVar, OutputStream outputStream) {
        if (!this.U || this.f1459i != l.VALUE_STRING) {
            byte[] N = N(aVar);
            outputStream.write(N);
            return N.length;
        }
        byte[] d = this.s.d();
        try {
            return p2(aVar, outputStream, d);
        } finally {
            this.s.e(d);
        }
    }

    public void W1() {
        int i2 = this.u;
        if (i2 >= this.v) {
            b2();
            i2 = this.u;
        }
        int i3 = 0;
        char[] i4 = this.E.i();
        int[] iArr = k0;
        int min = Math.min(this.v, i4.length + i2);
        byte[] bArr = this.a0;
        while (true) {
            if (i2 >= min) {
                break;
            }
            byte b2 = bArr[i2] & ExifInterface.MARKER;
            if (iArr[b2] == 0) {
                i2++;
                i4[i3] = (char) b2;
                i3++;
            } else if (b2 == 34) {
                this.u = i2 + 1;
                this.E.f1581i = i3;
                return;
            }
        }
        this.u = i2;
        X1(i4, i3);
    }

    public final String W2(int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.T;
        iArr[0] = i2;
        iArr[1] = i3;
        return T2(iArr, 2, i4, i5, i6);
    }

    public final void X1(char[] cArr, int i2) {
        int[] iArr = k0;
        byte[] bArr = this.a0;
        while (true) {
            int i3 = this.u;
            if (i3 >= this.v) {
                b2();
                i3 = this.u;
            }
            int i4 = 0;
            if (i2 >= cArr.length) {
                cArr = this.E.l();
                i2 = 0;
            }
            int min = Math.min(this.v, (cArr.length - i2) + i3);
            while (true) {
                if (i3 >= min) {
                    this.u = i3;
                    break;
                }
                int i5 = i3 + 1;
                int i6 = bArr[i3] & ExifInterface.MARKER;
                if (iArr[i6] != 0) {
                    this.u = i5;
                    if (i6 == 34) {
                        this.E.f1581i = i2;
                        return;
                    }
                    int i7 = iArr[i6];
                    if (i7 == 1) {
                        i6 = w1();
                    } else if (i7 == 2) {
                        i6 = R1(i6);
                    } else if (i7 == 3) {
                        i6 = this.v - i5 >= 2 ? T1(i6) : S1(i6);
                    } else if (i7 == 4) {
                        int U1 = U1(i6);
                        int i8 = i2 + 1;
                        cArr[i2] = (char) (55296 | (U1 >> 10));
                        if (i8 >= cArr.length) {
                            cArr = this.E.l();
                            i2 = 0;
                        } else {
                            i2 = i8;
                        }
                        i6 = (U1 & AudioAttributesCompat.FLAG_ALL) | 56320;
                    } else if (i6 < 32) {
                        F1(i6, "string value");
                    } else {
                        q2(i6);
                        throw null;
                    }
                    if (i2 >= cArr.length) {
                        cArr = this.E.l();
                    } else {
                        i4 = i2;
                    }
                    i2 = i4 + 1;
                    cArr[i4] = (char) i6;
                } else {
                    cArr[i2] = (char) i6;
                    i3 = i5;
                    i2++;
                }
            }
        }
    }

    public g Y() {
        return new g(y1(), this.w + ((long) this.u), -1, this.x, (this.u - this.y) + 1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public b.j.a.b.l Y1(
/*
Method generation error in method: b.j.a.b.t.h.Y1(int, boolean):b.j.a.b.l, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r13 != 44) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r12.C.d() == false) goto L_0x0152;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.b.l Z1(int r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 39
            r2 = 0
            r3 = 1
            if (r13 == r1) goto L_0x009a
            r1 = 73
            if (r13 == r1) goto L_0x007f
            r1 = 78
            if (r13 == r1) goto L_0x0064
            r1 = 93
            if (r13 == r1) goto L_0x0045
            r1 = 125(0x7d, float:1.75E-43)
            if (r13 == r1) goto L_0x005e
            r1 = 43
            if (r13 == r1) goto L_0x0021
            r0 = 44
            if (r13 == r0) goto L_0x004f
            goto L_0x0152
        L_0x0021:
            int r13 = r12.u
            int r1 = r12.v
            if (r13 < r1) goto L_0x0034
            boolean r13 = r12.a2()
            if (r13 == 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            b.j.a.b.l r13 = b.j.a.b.l.VALUE_NUMBER_INT
            r12.k1(r13)
            throw r2
        L_0x0034:
            byte[] r13 = r12.a0
            int r1 = r12.u
            int r2 = r1 + 1
            r12.u = r2
            byte r13 = r13[r1]
            r13 = r13 & 255(0xff, float:3.57E-43)
            b.j.a.b.l r13 = r12.Y1(r13, r0)
            return r13
        L_0x0045:
            b.j.a.b.t.d r0 = r12.C
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x004f
            goto L_0x0152
        L_0x004f:
            int r0 = r12.f1416h
            int r1 = f0
            r0 = r0 & r1
            if (r0 == 0) goto L_0x005e
            int r13 = r12.u
            int r13 = r13 - r3
            r12.u = r13
            b.j.a.b.l r13 = b.j.a.b.l.VALUE_NULL
            return r13
        L_0x005e:
            java.lang.String r0 = "expected a value"
            r12.l1(r13, r0)
            throw r2
        L_0x0064:
            java.lang.String r13 = "NaN"
            r12.e2(r13, r3)
            int r0 = r12.f1416h
            int r1 = e0
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0077
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            b.j.a.b.l r13 = r12.K1(r13, r0)
            return r13
        L_0x0077:
            b.j.a.b.h r13 = new b.j.a.b.h
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r13.<init>(r12, r0)
            throw r13
        L_0x007f:
            java.lang.String r13 = "Infinity"
            r12.e2(r13, r3)
            int r0 = r12.f1416h
            int r1 = e0
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0092
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            b.j.a.b.l r13 = r12.K1(r13, r0)
            return r13
        L_0x0092:
            b.j.a.b.h r13 = new b.j.a.b.h
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r13.<init>(r12, r0)
            throw r13
        L_0x009a:
            int r4 = r12.f1416h
            int r5 = g0
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0152
            b.j.a.b.w.k r13 = r12.E
            char[] r13 = r13.i()
            int[] r4 = k0
            byte[] r5 = r12.a0
            r6 = r0
        L_0x00ac:
            int r7 = r12.u
            int r8 = r12.v
            if (r7 < r8) goto L_0x00b5
            r12.b2()
        L_0x00b5:
            int r7 = r13.length
            if (r6 < r7) goto L_0x00bf
            b.j.a.b.w.k r13 = r12.E
            char[] r13 = r13.l()
            r6 = r0
        L_0x00bf:
            int r7 = r12.v
            int r8 = r12.u
            int r9 = r13.length
            int r9 = r9 - r6
            int r9 = r9 + r8
            if (r9 >= r7) goto L_0x00c9
            r7 = r9
        L_0x00c9:
            int r8 = r12.u
            if (r8 >= r7) goto L_0x00ac
            int r9 = r8 + 1
            r12.u = r9
            byte r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 == r1) goto L_0x00e3
            r10 = r4[r8]
            if (r10 == 0) goto L_0x00dc
            goto L_0x00e3
        L_0x00dc:
            int r9 = r6 + 1
            char r8 = (char) r8
            r13[r6] = r8
            r6 = r9
            goto L_0x00c9
        L_0x00e3:
            if (r8 != r1) goto L_0x00ec
            b.j.a.b.w.k r13 = r12.E
            r13.f1581i = r6
            b.j.a.b.l r13 = b.j.a.b.l.VALUE_STRING
            return r13
        L_0x00ec:
            r7 = r4[r8]
            if (r7 == r3) goto L_0x013c
            r10 = 2
            if (r7 == r10) goto L_0x0137
            r11 = 3
            if (r7 == r11) goto L_0x0128
            r9 = 4
            if (r7 == r9) goto L_0x0106
            r13 = 32
            if (r8 >= r13) goto L_0x0102
            java.lang.String r13 = "string value"
            r12.F1(r8, r13)
        L_0x0102:
            r12.q2(r8)
            throw r2
        L_0x0106:
            int r7 = r12.U1(r8)
            int r8 = r6 + 1
            r9 = 55296(0xd800, float:7.7486E-41)
            int r10 = r7 >> 10
            r9 = r9 | r10
            char r9 = (char) r9
            r13[r6] = r9
            int r6 = r13.length
            if (r8 < r6) goto L_0x0120
            b.j.a.b.w.k r13 = r12.E
            char[] r13 = r13.l()
            r6 = r0
            goto L_0x0121
        L_0x0120:
            r6 = r8
        L_0x0121:
            r8 = 56320(0xdc00, float:7.8921E-41)
            r7 = r7 & 1023(0x3ff, float:1.434E-42)
            r7 = r7 | r8
            goto L_0x0140
        L_0x0128:
            int r7 = r12.v
            int r7 = r7 - r9
            if (r7 < r10) goto L_0x0132
            int r7 = r12.T1(r8)
            goto L_0x0140
        L_0x0132:
            int r7 = r12.S1(r8)
            goto L_0x0140
        L_0x0137:
            int r7 = r12.R1(r8)
            goto L_0x0140
        L_0x013c:
            char r7 = r12.w1()
        L_0x0140:
            int r8 = r13.length
            if (r6 < r8) goto L_0x014a
            b.j.a.b.w.k r13 = r12.E
            char[] r13 = r13.l()
            r6 = r0
        L_0x014a:
            int r8 = r6 + 1
            char r7 = (char) r7
            r13[r6] = r7
            r6 = r8
            goto L_0x00ac
        L_0x0152:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r13)
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            char r13 = (char) r13
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = r12.G1()
            r12.v2(r13, r0)
            throw r2
        L_0x016e:
            java.lang.String r0 = "expected a valid value "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r1 = r12.G1()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.l1(r13, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.h.Z1(int):b.j.a.b.l");
    }

    public final boolean a2() {
        byte[] bArr;
        int length;
        int i2 = this.v;
        InputStream inputStream = this.Z;
        if (inputStream == null || (length = bArr.length) == 0) {
            return false;
        }
        int read = inputStream.read((bArr = this.a0), 0, length);
        if (read > 0) {
            this.u = 0;
            this.v = read;
            this.w += (long) read;
            this.y -= read;
            this.W -= i2;
            return true;
        }
        t1();
        if (read == 0) {
            throw new IOException(b.e.a.a.a.o(b.e.a.a.a.y("InputStream.read() returned 0 characters when trying to read "), this.a0.length, " bytes"));
        }
        return false;
    }

    public void b2() {
        if (!a2()) {
            i1();
            throw null;
        }
    }

    public final void c2() {
        byte b2;
        int i2 = this.u;
        if (i2 + 4 < this.v) {
            byte[] bArr = this.a0;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 115) {
                        int i6 = i5 + 1;
                        if (bArr[i5] == 101 && ((b2 = bArr[i6] & ExifInterface.MARKER) < 48 || b2 == 93 || b2 == 125)) {
                            this.u = i6;
                            return;
                        }
                    }
                }
            }
        }
        f2("false", 1);
    }

    public final void d2() {
        byte b2;
        int i2 = this.u;
        if (i2 + 3 < this.v) {
            byte[] bArr = this.a0;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 108 && ((b2 = bArr[i5] & ExifInterface.MARKER) < 48 || b2 == 93 || b2 == 125)) {
                        this.u = i5;
                        return;
                    }
                }
            }
        }
        f2("null", 1);
    }

    public final void e2(String str, int i2) {
        int length = str.length();
        if (this.u + length >= this.v) {
            f2(str, i2);
            return;
        }
        while (this.a0[this.u] == str.charAt(i2)) {
            int i3 = this.u + 1;
            this.u = i3;
            i2++;
            if (i2 >= length) {
                byte b2 = this.a0[i3] & ExifInterface.MARKER;
                if (b2 >= 48 && b2 != 93 && b2 != 125) {
                    M1(str, i2, b2);
                    return;
                }
                return;
            }
        }
        u2(str.substring(0, i2));
        throw null;
    }

    public final void f2(String str, int i2) {
        int i3;
        byte b2;
        int length = str.length();
        do {
            if ((this.u < this.v || a2()) && this.a0[this.u] == str.charAt(i2)) {
                i3 = this.u + 1;
                this.u = i3;
                i2++;
            } else {
                u2(str.substring(0, i2));
                throw null;
            }
        } while (i2 < length);
        if ((i3 < this.v || a2()) && (b2 = this.a0[this.u] & ExifInterface.MARKER) >= 48 && b2 != 93 && b2 != 125) {
            M1(str, i2, b2);
        }
    }

    public final void g2() {
        byte b2;
        int i2 = this.u;
        if (i2 + 3 < this.v) {
            byte[] bArr = this.a0;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i3 + 1;
                if (bArr[i3] == 117) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 101 && ((b2 = bArr[i5] & ExifInterface.MARKER) < 48 || b2 == 93 || b2 == 125)) {
                        this.u = i5;
                        return;
                    }
                }
            }
        }
        f2("true", 1);
    }

    public final l h2() {
        d k2;
        this.G = false;
        l lVar = this.D;
        this.D = null;
        if (lVar == l.START_ARRAY) {
            k2 = this.C.j(this.A, this.B);
        } else {
            if (lVar == l.START_OBJECT) {
                k2 = this.C.k(this.A, this.B);
            }
            this.f1459i = lVar;
            return lVar;
        }
        this.C = k2;
        this.f1459i = lVar;
        return lVar;
    }

    public final l i2(int i2) {
        l m2;
        if (i2 == 34) {
            this.U = true;
            m2 = l.VALUE_STRING;
        } else if (i2 == 45) {
            m2 = m2();
        } else if (i2 == 91) {
            this.C = this.C.j(this.A, this.B);
            m2 = l.START_ARRAY;
        } else if (i2 == 102) {
            c2();
            m2 = l.VALUE_FALSE;
        } else if (i2 == 110) {
            d2();
            m2 = l.VALUE_NULL;
        } else if (i2 == 116) {
            g2();
            m2 = l.VALUE_TRUE;
        } else if (i2 != 123) {
            switch (i2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    m2 = o2(i2);
                    break;
                default:
                    m2 = Z1(i2);
                    break;
            }
        } else {
            this.C = this.C.k(this.A, this.B);
            m2 = l.START_OBJECT;
        }
        this.f1459i = m2;
        return m2;
    }

    public final l k2(char[] cArr, int i2, int i3, boolean z, int i4) {
        boolean z2;
        if (i3 == 46) {
            if (i2 >= cArr.length) {
                cArr = this.E.l();
                i2 = 0;
            }
            cArr[i2] = (char) i3;
            i2++;
            int i5 = 0;
            while (true) {
                if (this.u >= this.v && !a2()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.a0;
                int i6 = this.u;
                this.u = i6 + 1;
                i3 = bArr[i6] & ExifInterface.MARKER;
                if (i3 < 48 || i3 > 57) {
                    z2 = false;
                } else {
                    i5++;
                    if (i2 >= cArr.length) {
                        cArr = this.E.l();
                        i2 = 0;
                    }
                    cArr[i2] = (char) i3;
                    i2++;
                }
            }
            z2 = false;
            if (i5 == 0) {
                r1(i3, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            z2 = false;
        }
        if (r12 == 101 || r12 == 69) {
            if (i2 >= cArr.length) {
                cArr = this.E.l();
                i2 = 0;
            }
            int i7 = i2 + 1;
            cArr[i2] = (char) r12;
            if (this.u >= this.v) {
                b2();
            }
            byte[] bArr2 = this.a0;
            int i8 = this.u;
            this.u = i8 + 1;
            byte b2 = bArr2[i8] & ExifInterface.MARKER;
            if (b2 == 45 || b2 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.E.l();
                    i7 = 0;
                }
                int i9 = i7 + 1;
                cArr[i7] = (char) b2;
                if (this.u >= this.v) {
                    b2();
                }
                byte[] bArr3 = this.a0;
                int i10 = this.u;
                this.u = i10 + 1;
                b2 = bArr3[i10] & ExifInterface.MARKER;
                i7 = i9;
            }
            r12 = b2;
            int i11 = 0;
            while (true) {
                if (r12 < 48 || r12 > 57) {
                    break;
                }
                i11++;
                if (i7 >= cArr.length) {
                    cArr = this.E.l();
                    i7 = 0;
                }
                int i12 = i7 + 1;
                cArr[i7] = (char) r12;
                if (this.u >= this.v && !a2()) {
                    z2 = true;
                    i7 = i12;
                    break;
                }
                byte[] bArr4 = this.a0;
                int i13 = this.u;
                this.u = i13 + 1;
                r12 = bArr4[i13] & ExifInterface.MARKER;
                i7 = i12;
            }
            if (i11 != 0) {
                i2 = i7;
            } else {
                r1(r12, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.u--;
            if (this.C.f()) {
                M2(r12);
            }
        }
        this.E.f1581i = i2;
        this.P = z;
        this.Q = i4;
        this.J = 0;
        return l.VALUE_NUMBER_FLOAT;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String l2(int r18) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r4 = 4
            r5 = 34
            r7 = 1
            if (r0 == r5) goto L_0x018e
            java.lang.String r8 = " in field name"
            r9 = 39
            if (r0 != r9) goto L_0x010c
            int r10 = r6.f1416h
            int r11 = g0
            r10 = r10 & r11
            if (r10 == 0) goto L_0x010c
            int r0 = r6.u
            int r10 = r6.v
            if (r0 < r10) goto L_0x0030
            boolean r0 = r17.a2()
            if (r0 == 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            b.j.a.b.l r0 = b.j.a.b.l.FIELD_NAME
            java.lang.String r1 = ": was expecting closing ''' for field name"
            r6.j1(r1, r0)
            throw r3
        L_0x0030:
            byte[] r0 = r6.a0
            int r10 = r6.u
            int r11 = r10 + 1
            r6.u = r11
            byte r0 = r0[r10]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r9) goto L_0x0040
            goto L_0x0177
        L_0x0040:
            int[] r1 = r6.T
            int[] r10 = l0
            r11 = r2
            r12 = r11
            r13 = r12
        L_0x0047:
            if (r0 != r9) goto L_0x0070
            if (r11 <= 0) goto L_0x005f
            int r0 = r1.length
            if (r12 < r0) goto L_0x0056
            int r0 = r1.length
            int[] r0 = b.j.a.b.q.b.I1(r1, r0)
            r6.T = r0
            r1 = r0
        L_0x0056:
            int r0 = r12 + 1
            int r2 = j2(r13, r11)
            r1[r12] = r2
            r12 = r0
        L_0x005f:
            b.j.a.b.u.a r0 = r6.S
            java.lang.String r0 = r0.n(r1, r12)
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = r6.N2(r1, r12, r11)
            goto L_0x0177
        L_0x006d:
            r1 = r0
            goto L_0x0177
        L_0x0070:
            r14 = r10[r0]
            if (r14 == 0) goto L_0x00d1
            if (r0 == r5) goto L_0x00d1
            r14 = 92
            if (r0 == r14) goto L_0x0080
            java.lang.String r14 = "name"
            r6.F1(r0, r14)
            goto L_0x0084
        L_0x0080:
            char r0 = r17.w1()
        L_0x0084:
            r14 = 127(0x7f, float:1.78E-43)
            if (r0 <= r14) goto L_0x00d1
            if (r11 < r4) goto L_0x009b
            int r11 = r1.length
            if (r12 < r11) goto L_0x0094
            int r11 = r1.length
            int[] r1 = b.j.a.b.q.b.I1(r1, r11)
            r6.T = r1
        L_0x0094:
            int r11 = r12 + 1
            r1[r12] = r13
            r13 = r2
            r12 = r11
            r11 = r13
        L_0x009b:
            r14 = 2048(0x800, float:2.87E-42)
            int r13 = r13 << 8
            if (r0 >= r14) goto L_0x00a9
            int r14 = r0 >> 6
            r14 = r14 | 192(0xc0, float:2.69E-43)
            r13 = r13 | r14
            int r11 = r11 + 1
            goto L_0x00cd
        L_0x00a9:
            int r14 = r0 >> 12
            r14 = r14 | 224(0xe0, float:3.14E-43)
            r13 = r13 | r14
            int r11 = r11 + 1
            if (r11 < r4) goto L_0x00c3
            int r11 = r1.length
            if (r12 < r11) goto L_0x00bc
            int r11 = r1.length
            int[] r1 = b.j.a.b.q.b.I1(r1, r11)
            r6.T = r1
        L_0x00bc:
            int r11 = r12 + 1
            r1[r12] = r13
            r13 = r2
            r12 = r11
            r11 = r13
        L_0x00c3:
            int r13 = r13 << 8
            int r14 = r0 >> 6
            r14 = r14 & 63
            r14 = r14 | 128(0x80, float:1.794E-43)
            r13 = r13 | r14
            int r11 = r11 + r7
        L_0x00cd:
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x00d1:
            if (r11 >= r4) goto L_0x00da
            int r11 = r11 + 1
            int r13 = r13 << 8
            r0 = r0 | r13
            r13 = r0
            goto L_0x00eb
        L_0x00da:
            int r11 = r1.length
            if (r12 < r11) goto L_0x00e4
            int r11 = r1.length
            int[] r1 = b.j.a.b.q.b.I1(r1, r11)
            r6.T = r1
        L_0x00e4:
            int r11 = r12 + 1
            r1[r12] = r13
            r13 = r0
            r12 = r11
            r11 = r7
        L_0x00eb:
            int r0 = r6.u
            int r14 = r6.v
            if (r0 < r14) goto L_0x00fe
            boolean r0 = r17.a2()
            if (r0 == 0) goto L_0x00f8
            goto L_0x00fe
        L_0x00f8:
            b.j.a.b.l r0 = b.j.a.b.l.FIELD_NAME
            r6.j1(r8, r0)
            throw r3
        L_0x00fe:
            byte[] r0 = r6.a0
            int r14 = r6.u
            int r15 = r14 + 1
            r6.u = r15
            byte r0 = r0[r14]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L_0x0047
        L_0x010c:
            int r1 = r6.f1416h
            int r5 = h0
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0183
            int[] r1 = b.j.a.b.s.a.f
            r5 = r1[r0]
            if (r5 != 0) goto L_0x017d
            int[] r5 = r6.T
            r9 = r2
            r10 = r5
            r5 = r9
        L_0x011e:
            if (r2 >= r4) goto L_0x0127
            int r2 = r2 + 1
            int r9 = r9 << 8
            r0 = r0 | r9
            r9 = r0
            goto L_0x0138
        L_0x0127:
            int r2 = r10.length
            if (r5 < r2) goto L_0x0131
            int r2 = r10.length
            int[] r10 = b.j.a.b.q.b.I1(r10, r2)
            r6.T = r10
        L_0x0131:
            int r2 = r5 + 1
            r10[r5] = r9
            r9 = r0
            r5 = r2
            r2 = r7
        L_0x0138:
            int r0 = r6.u
            int r11 = r6.v
            if (r0 < r11) goto L_0x014b
            boolean r0 = r17.a2()
            if (r0 == 0) goto L_0x0145
            goto L_0x014b
        L_0x0145:
            b.j.a.b.l r0 = b.j.a.b.l.FIELD_NAME
            r6.j1(r8, r0)
            throw r3
        L_0x014b:
            byte[] r0 = r6.a0
            int r11 = r6.u
            byte r0 = r0[r11]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r12 = r1[r0]
            if (r12 == 0) goto L_0x0178
            if (r2 <= 0) goto L_0x0169
            int r0 = r10.length
            if (r5 < r0) goto L_0x0164
            int r0 = r10.length
            int[] r0 = b.j.a.b.q.b.I1(r10, r0)
            r6.T = r0
            r10 = r0
        L_0x0164:
            int r0 = r5 + 1
            r10[r5] = r9
            r5 = r0
        L_0x0169:
            b.j.a.b.u.a r0 = r6.S
            java.lang.String r0 = r0.n(r10, r5)
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = r6.N2(r10, r5, r2)
            goto L_0x006d
        L_0x0177:
            return r1
        L_0x0178:
            int r11 = r11 + 1
            r6.u = r11
            goto L_0x011e
        L_0x017d:
            java.lang.String r1 = "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"
            r6.l1(r0, r1)
            throw r3
        L_0x0183:
            int r0 = r17.Q1(r18)
            char r0 = (char) r0
            java.lang.String r1 = "was expecting double-quote to start field name"
            r6.l1(r0, r1)
            throw r3
        L_0x018e:
            int r0 = r6.u
            int r8 = r0 + 13
            int r9 = r6.v
            if (r8 <= r9) goto L_0x01c2
            if (r0 < r9) goto L_0x01a7
            boolean r0 = r17.a2()
            if (r0 == 0) goto L_0x019f
            goto L_0x01a7
        L_0x019f:
            b.j.a.b.l r0 = b.j.a.b.l.FIELD_NAME
            java.lang.String r1 = ": was expecting closing '\"' for name"
            r6.j1(r1, r0)
            throw r3
        L_0x01a7:
            byte[] r0 = r6.a0
            int r2 = r6.u
            int r3 = r2 + 1
            r6.u = r3
            byte r0 = r0[r2]
            r4 = r0 & 255(0xff, float:3.57E-43)
            if (r4 != r5) goto L_0x01b6
            goto L_0x01c1
        L_0x01b6:
            int[] r1 = r6.T
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r17
            java.lang.String r1 = r0.T2(r1, r2, r3, r4, r5)
        L_0x01c1:
            return r1
        L_0x01c2:
            byte[] r3 = r6.a0
            int[] r8 = l0
            int r9 = r0 + 1
            r6.u = r9
            byte r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10 = r8[r0]
            if (r10 != 0) goto L_0x03e7
            int r1 = r9 + 1
            r6.u = r1
            byte r9 = r3[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = r8[r9]
            if (r10 != 0) goto L_0x03db
            int r0 = r0 << 8
            r0 = r0 | r9
            int r9 = r1 + 1
            r6.u = r9
            byte r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r10 = r8[r1]
            r11 = 2
            if (r10 != 0) goto L_0x03cf
            int r0 = r0 << 8
            r0 = r0 | r1
            int r1 = r9 + 1
            r6.u = r1
            byte r9 = r3[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = r8[r9]
            r12 = 3
            if (r10 != 0) goto L_0x03c3
            int r0 = r0 << 8
            r9 = r9 | r0
            int r0 = r1 + 1
            r6.u = r0
            byte r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r10 = r8[r1]
            if (r10 != 0) goto L_0x03b7
            r6.V = r9
            int r10 = r0 + 1
            r6.u = r10
            byte r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r13 = r8[r0]
            if (r13 == 0) goto L_0x0229
            if (r0 != r5) goto L_0x0223
            java.lang.String r0 = r6.P2(r9, r1, r7)
            goto L_0x03b6
        L_0x0223:
            java.lang.String r0 = r6.V2(r9, r1, r0, r7)
            goto L_0x03b6
        L_0x0229:
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r10 + 1
            r6.u = r1
            byte r10 = r3[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r13 = r8[r10]
            if (r13 == 0) goto L_0x0246
            if (r10 != r5) goto L_0x0240
            java.lang.String r0 = r6.P2(r9, r0, r11)
            goto L_0x03b6
        L_0x0240:
            java.lang.String r0 = r6.V2(r9, r0, r10, r11)
            goto L_0x03b6
        L_0x0246:
            int r0 = r0 << 8
            r0 = r0 | r10
            int r10 = r1 + 1
            r6.u = r10
            byte r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r8[r1]
            if (r13 == 0) goto L_0x0263
            if (r1 != r5) goto L_0x025d
            java.lang.String r0 = r6.P2(r9, r0, r12)
            goto L_0x03b6
        L_0x025d:
            java.lang.String r0 = r6.V2(r9, r0, r1, r12)
            goto L_0x03b6
        L_0x0263:
            int r0 = r0 << 8
            r13 = r1 | r0
            int r0 = r10 + 1
            r6.u = r0
            byte r1 = r3[r10]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r10 = r8[r1]
            if (r10 == 0) goto L_0x0281
            if (r1 != r5) goto L_0x027b
            java.lang.String r0 = r6.P2(r9, r13, r4)
            goto L_0x03b6
        L_0x027b:
            java.lang.String r0 = r6.V2(r9, r13, r1, r4)
            goto L_0x03b6
        L_0x0281:
            int r10 = r0 + 1
            r6.u = r10
            byte r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r14 = r8[r0]
            if (r14 == 0) goto L_0x0295
            if (r0 != r5) goto L_0x02cb
            java.lang.String r0 = r6.Q2(r9, r13, r1, r7)
            goto L_0x03b6
        L_0x0295:
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r10 + 1
            r6.u = r1
            byte r10 = r3[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r14 = r8[r10]
            if (r14 == 0) goto L_0x02ae
            if (r10 != r5) goto L_0x02ac
            java.lang.String r0 = r6.Q2(r9, r13, r0, r11)
            goto L_0x03b6
        L_0x02ac:
            r4 = r11
            goto L_0x02e6
        L_0x02ae:
            int r0 = r0 << 8
            r0 = r0 | r10
            int r10 = r1 + 1
            r6.u = r10
            byte r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r14 = r8[r1]
            if (r14 == 0) goto L_0x02cf
            if (r1 != r5) goto L_0x02c5
            java.lang.String r0 = r6.Q2(r9, r13, r0, r12)
            goto L_0x03b6
        L_0x02c5:
            r7 = r12
            r16 = r1
            r1 = r0
            r0 = r16
        L_0x02cb:
            r4 = r0
            r3 = r1
            r5 = r7
            goto L_0x02e9
        L_0x02cf:
            int r0 = r0 << 8
            r0 = r0 | r1
            int r1 = r10 + 1
            r6.u = r1
            byte r1 = r3[r10]
            r10 = r1 & 255(0xff, float:3.57E-43)
            r1 = r8[r10]
            if (r1 == 0) goto L_0x02f3
            if (r10 != r5) goto L_0x02e6
            java.lang.String r0 = r6.Q2(r9, r13, r0, r4)
            goto L_0x03b6
        L_0x02e6:
            r3 = r0
            r5 = r4
            r4 = r10
        L_0x02e9:
            r0 = r17
            r1 = r9
            r2 = r13
            java.lang.String r0 = r0.W2(r1, r2, r3, r4, r5)
            goto L_0x03b6
        L_0x02f3:
            int[] r1 = r6.T
            r1[r2] = r9
            r1[r7] = r13
            r1[r11] = r0
            r2 = r12
        L_0x02fc:
            int r0 = r6.u
            int r1 = r0 + 4
            int r9 = r6.v
            if (r1 > r9) goto L_0x03ab
            int r1 = r0 + 1
            r6.u = r1
            byte r0 = r3[r0]
            r9 = r0 & 255(0xff, float:3.57E-43)
            r0 = r8[r9]
            if (r0 == 0) goto L_0x0327
            if (r9 != r5) goto L_0x031a
            int[] r0 = r6.T
            java.lang.String r0 = r6.R2(r0, r2, r10, r7)
            goto L_0x03b6
        L_0x031a:
            int[] r1 = r6.T
            r5 = 1
            r0 = r17
            r3 = r10
            r4 = r9
            java.lang.String r0 = r0.T2(r1, r2, r3, r4, r5)
            goto L_0x03b6
        L_0x0327:
            int r0 = r10 << 8
            r9 = r9 | r0
            int r0 = r1 + 1
            r6.u = r0
            byte r1 = r3[r1]
            r10 = r1 & 255(0xff, float:3.57E-43)
            r1 = r8[r10]
            if (r1 == 0) goto L_0x034d
            if (r10 != r5) goto L_0x0340
            int[] r0 = r6.T
            java.lang.String r0 = r6.R2(r0, r2, r9, r11)
            goto L_0x03b6
        L_0x0340:
            int[] r1 = r6.T
            r5 = 2
            r0 = r17
            r3 = r9
            r4 = r10
            java.lang.String r0 = r0.T2(r1, r2, r3, r4, r5)
            goto L_0x03b6
        L_0x034d:
            int r1 = r9 << 8
            r9 = r1 | r10
            int r1 = r0 + 1
            r6.u = r1
            byte r0 = r3[r0]
            r10 = r0 & 255(0xff, float:3.57E-43)
            r0 = r8[r10]
            if (r0 == 0) goto L_0x0372
            if (r10 != r5) goto L_0x0366
            int[] r0 = r6.T
            java.lang.String r0 = r6.R2(r0, r2, r9, r12)
            goto L_0x03b6
        L_0x0366:
            int[] r1 = r6.T
            r5 = 3
            r0 = r17
            r3 = r9
            r4 = r10
            java.lang.String r0 = r0.T2(r1, r2, r3, r4, r5)
            goto L_0x03b6
        L_0x0372:
            int r0 = r9 << 8
            r9 = r0 | r10
            int r0 = r1 + 1
            r6.u = r0
            byte r0 = r3[r1]
            r10 = r0 & 255(0xff, float:3.57E-43)
            r0 = r8[r10]
            if (r0 == 0) goto L_0x0397
            if (r10 != r5) goto L_0x038b
            int[] r0 = r6.T
            java.lang.String r0 = r6.R2(r0, r2, r9, r4)
            goto L_0x03b6
        L_0x038b:
            int[] r1 = r6.T
            r5 = 4
            r0 = r17
            r3 = r9
            r4 = r10
            java.lang.String r0 = r0.T2(r1, r2, r3, r4, r5)
            goto L_0x03b6
        L_0x0397:
            int[] r0 = r6.T
            int r1 = r0.length
            if (r2 < r1) goto L_0x03a2
            int[] r0 = b.j.a.b.q.b.I1(r0, r2)
            r6.T = r0
        L_0x03a2:
            int[] r0 = r6.T
            int r1 = r2 + 1
            r0[r2] = r9
            r2 = r1
            goto L_0x02fc
        L_0x03ab:
            int[] r1 = r6.T
            r3 = 0
            r5 = 0
            r0 = r17
            r4 = r10
            java.lang.String r0 = r0.T2(r1, r2, r3, r4, r5)
        L_0x03b6:
            return r0
        L_0x03b7:
            if (r1 != r5) goto L_0x03be
            java.lang.String r0 = r6.O2(r9, r4)
            return r0
        L_0x03be:
            java.lang.String r0 = r6.U2(r9, r1, r4)
            return r0
        L_0x03c3:
            if (r9 != r5) goto L_0x03ca
            java.lang.String r0 = r6.O2(r0, r12)
            return r0
        L_0x03ca:
            java.lang.String r0 = r6.U2(r0, r9, r12)
            return r0
        L_0x03cf:
            if (r1 != r5) goto L_0x03d6
            java.lang.String r0 = r6.O2(r0, r11)
            return r0
        L_0x03d6:
            java.lang.String r0 = r6.U2(r0, r1, r11)
            return r0
        L_0x03db:
            if (r9 != r5) goto L_0x03e2
            java.lang.String r0 = r6.O2(r0, r7)
            return r0
        L_0x03e2:
            java.lang.String r0 = r6.U2(r0, r9, r7)
            return r0
        L_0x03e7:
            if (r0 != r5) goto L_0x03ea
            return r1
        L_0x03ea:
            java.lang.String r0 = r6.U2(r2, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.h.l2(int):java.lang.String");
    }

    public l m2() {
        int i2;
        byte b2;
        char[] i3 = this.E.i();
        i3[0] = '-';
        if (this.u >= this.v) {
            b2();
        }
        byte[] bArr = this.a0;
        int i4 = this.u;
        this.u = i4 + 1;
        int i5 = bArr[i4] & ExifInterface.MARKER;
        if (i5 <= 48) {
            if (i5 != 48) {
                return Y1(i5, true);
            }
            i5 = L2();
        } else if (i5 > 57) {
            return Y1(i5, true);
        }
        int i6 = 2;
        i3[1] = (char) i5;
        int min = Math.min(this.v, (this.u + i3.length) - 2);
        int i7 = 1;
        while (true) {
            int i8 = this.u;
            if (i8 >= min) {
                return n2(i3, i6, true, i7);
            }
            byte[] bArr2 = this.a0;
            i2 = i8 + 1;
            this.u = i2;
            b2 = bArr2[i8] & ExifInterface.MARKER;
            if (b2 >= 48 && b2 <= 57) {
                i7++;
                i3[i6] = (char) b2;
                i6++;
            }
        }
        if (b2 == 46 || b2 == 101 || b2 == 69) {
            return k2(i3, i6, b2, true, i7);
        }
        this.u = i2 - 1;
        this.E.f1581i = i6;
        if (this.C.f()) {
            M2(b2);
        }
        return L1(true, i7);
    }

    public final l n2(char[] cArr, int i2, boolean z, int i3) {
        int i4;
        byte b2;
        char[] cArr2 = cArr;
        int i5 = i2;
        int i6 = i3;
        while (true) {
            if (this.u < this.v || a2()) {
                byte[] bArr = this.a0;
                int i7 = this.u;
                i4 = i7 + 1;
                this.u = i4;
                b2 = bArr[i7] & ExifInterface.MARKER;
                if (b2 <= 57 && b2 >= 48) {
                    if (i5 >= cArr2.length) {
                        cArr2 = this.E.l();
                        i5 = 0;
                    }
                    cArr2[i5] = (char) b2;
                    i6++;
                    i5++;
                }
            } else {
                this.E.f1581i = i5;
                this.P = z;
                this.Q = i6;
                this.J = 0;
                return l.VALUE_NUMBER_INT;
            }
        }
        if (b2 == 46 || b2 == 101 || b2 == 69) {
            return k2(cArr2, i5, b2, z, i6);
        }
        this.u = i4 - 1;
        this.E.f1581i = i5;
        if (this.C.f()) {
            M2(this.a0[this.u] & ExifInterface.MARKER);
        }
        this.P = z;
        this.Q = i6;
        this.J = 0;
        return l.VALUE_NUMBER_INT;
    }

    public l o2(int i2) {
        int i3;
        byte b2;
        char[] i4 = this.E.i();
        if (i2 == 48) {
            i2 = L2();
        }
        i4[0] = (char) i2;
        int min = Math.min(this.v, (this.u + i4.length) - 1);
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = this.u;
            if (i7 >= min) {
                return n2(i4, i5, false, i6);
            }
            byte[] bArr = this.a0;
            i3 = i7 + 1;
            this.u = i3;
            b2 = bArr[i7] & ExifInterface.MARKER;
            if (b2 >= 48 && b2 <= 57) {
                i6++;
                i4[i5] = (char) b2;
                i5++;
            }
        }
        if (b2 == 46 || b2 == 101 || b2 == 69) {
            return k2(i4, i5, b2, false, i6);
        }
        this.u = i3 - 1;
        this.E.f1581i = i5;
        if (this.C.f()) {
            M2(b2);
        }
        return L1(false, i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0120, code lost:
        r6 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int p2(b.j.a.b.a r18, java.io.OutputStream r19, byte[] r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r3.length
            r5 = 3
            int r4 = r4 - r5
            r6 = 0
            r7 = r6
            r8 = r7
        L_0x000e:
            int r9 = r0.u
            int r10 = r0.v
            if (r9 < r10) goto L_0x0017
            r17.b2()
        L_0x0017:
            byte[] r9 = r0.a0
            int r10 = r0.u
            int r11 = r10 + 1
            r0.u = r11
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 32
            if (r9 <= r10) goto L_0x000e
            int r10 = r1.e(r9)
            r11 = 34
            if (r10 >= 0) goto L_0x003a
            if (r9 != r11) goto L_0x0033
            goto L_0x0121
        L_0x0033:
            int r10 = r0.v1(r1, r9, r6)
            if (r10 >= 0) goto L_0x003a
            goto L_0x000e
        L_0x003a:
            if (r7 <= r4) goto L_0x0041
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
            goto L_0x0042
        L_0x0041:
            r6 = r7
        L_0x0042:
            int r7 = r0.u
            int r9 = r0.v
            if (r7 < r9) goto L_0x004b
            r17.b2()
        L_0x004b:
            byte[] r7 = r0.a0
            int r9 = r0.u
            int r12 = r9 + 1
            r0.u = r12
            byte r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r9 = r1.e(r7)
            r12 = 1
            if (r9 >= 0) goto L_0x0062
            int r9 = r0.v1(r1, r7, r12)
        L_0x0062:
            int r7 = r10 << 6
            r7 = r7 | r9
            int r9 = r0.u
            int r10 = r0.v
            if (r9 < r10) goto L_0x006e
            r17.b2()
        L_0x006e:
            byte[] r9 = r0.a0
            int r10 = r0.u
            int r13 = r10 + 1
            r0.u = r13
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r1.e(r9)
            r13 = -2
            r14 = 0
            r15 = 2
            if (r10 >= 0) goto L_0x00eb
            if (r10 == r13) goto L_0x00a3
            if (r9 != r11) goto L_0x009e
            int r4 = r7 >> 4
            int r5 = r6 + 1
            byte r4 = (byte) r4
            r3[r6] = r4
            boolean r4 = r1.f1369l
            if (r4 != 0) goto L_0x0095
            r7 = r5
            goto L_0x0120
        L_0x0095:
            int r2 = r0.u
            int r2 = r2 - r12
            r0.u = r2
            r17.z1(r18)
            throw r14
        L_0x009e:
            int r9 = r0.v1(r1, r9, r15)
            r10 = r9
        L_0x00a3:
            if (r10 != r13) goto L_0x00eb
            int r9 = r0.u
            int r10 = r0.v
            if (r9 < r10) goto L_0x00ae
            r17.b2()
        L_0x00ae:
            byte[] r9 = r0.a0
            int r10 = r0.u
            int r11 = r10 + 1
            r0.u = r11
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            boolean r10 = r1.m(r9)
            if (r10 != 0) goto L_0x00e0
            int r10 = r0.v1(r1, r9, r5)
            if (r10 != r13) goto L_0x00c7
            goto L_0x00e0
        L_0x00c7:
            java.lang.String r2 = "expected padding character '"
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            char r3 = r1.f1370m
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r1 = r0.J1(r1, r9, r5, r2)
            throw r1
        L_0x00e0:
            int r7 = r7 >> 4
            int r9 = r6 + 1
            byte r7 = (byte) r7
            r3[r6] = r7
            r6 = 0
            r7 = r9
            goto L_0x000e
        L_0x00eb:
            int r5 = r7 << 6
            r5 = r5 | r10
            int r7 = r0.u
            int r9 = r0.v
            if (r7 < r9) goto L_0x00f7
            r17.b2()
        L_0x00f7:
            byte[] r7 = r0.a0
            int r9 = r0.u
            int r10 = r9 + 1
            r0.u = r10
            byte r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r9 = r1.e(r7)
            if (r9 >= 0) goto L_0x0159
            if (r9 == r13) goto L_0x013f
            if (r7 != r11) goto L_0x0133
            int r4 = r5 >> 2
            int r5 = r6 + 1
            int r7 = r4 >> 8
            byte r7 = (byte) r7
            r3[r6] = r7
            int r6 = r5 + 1
            byte r4 = (byte) r4
            r3[r5] = r4
            boolean r4 = r1.f1369l
            if (r4 != 0) goto L_0x012a
            r7 = r6
        L_0x0120:
            r6 = 0
        L_0x0121:
            r0.U = r6
            if (r7 <= 0) goto L_0x0129
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
        L_0x0129:
            return r8
        L_0x012a:
            int r2 = r0.u
            int r2 = r2 - r12
            r0.u = r2
            r17.z1(r18)
            throw r14
        L_0x0133:
            r9 = 0
            r10 = 3
            int r7 = r0.v1(r1, r7, r10)
            r16 = r9
            r9 = r7
            r7 = r16
            goto L_0x0141
        L_0x013f:
            r7 = 0
            r10 = 3
        L_0x0141:
            if (r9 != r13) goto L_0x015b
            int r5 = r5 >> 2
            int r9 = r6 + 1
            int r11 = r5 >> 8
            byte r11 = (byte) r11
            r3[r6] = r11
            int r6 = r9 + 1
            byte r5 = (byte) r5
            r3[r9] = r5
            r5 = r10
            r16 = r7
            r7 = r6
            r6 = r16
            goto L_0x000e
        L_0x0159:
            r7 = 0
            r10 = 3
        L_0x015b:
            int r5 = r5 << 6
            r5 = r5 | r9
            int r9 = r6 + 1
            int r11 = r5 >> 16
            byte r11 = (byte) r11
            r3[r6] = r11
            int r6 = r9 + 1
            int r11 = r5 >> 8
            byte r11 = (byte) r11
            r3[r9] = r11
            int r9 = r6 + 1
            byte r5 = (byte) r5
            r3[r6] = r5
            r6 = r7
            r7 = r9
            r5 = r10
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.h.p2(b.j.a.b.a, java.io.OutputStream, byte[]):int");
    }

    public void q2(int i2) {
        if (i2 < 32) {
            m1(i2);
            throw null;
        } else {
            r2(i2);
            throw null;
        }
    }

    public void r2(int i2) {
        StringBuilder y = b.e.a.a.a.y("Invalid UTF-8 start byte 0x");
        y.append(Integer.toHexString(i2));
        throw new b.j.a.b.h(this, y.toString());
    }

    public void s2(int i2) {
        StringBuilder y = b.e.a.a.a.y("Invalid UTF-8 middle byte 0x");
        y.append(Integer.toHexString(i2));
        throw new b.j.a.b.h(this, y.toString());
    }

    public void t1() {
        if (this.Z != null) {
            if (this.s.c || N0(i.a.AUTO_CLOSE_SOURCE)) {
                this.Z.close();
            }
            this.Z = null;
        }
    }

    public void t2(int i2, int i3) {
        this.u = i3;
        s2(i2);
        throw null;
    }

    public void u2(String str) {
        v2(str, G1());
        throw null;
    }

    public void v2(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.u >= this.v && !a2()) {
                break;
            }
            byte[] bArr = this.a0;
            int i2 = this.u;
            this.u = i2 + 1;
            char Q1 = (char) Q1(bArr[i2]);
            if (!Character.isJavaIdentifierPart(Q1)) {
                break;
            }
            sb.append(Q1);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        h1("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    public char w1() {
        if (this.u < this.v || a2()) {
            byte[] bArr = this.a0;
            int i2 = this.u;
            this.u = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 == 34 || b2 == 47 || b2 == 92) {
                return (char) b2;
            }
            if (b2 == 98) {
                return 8;
            }
            if (b2 == 102) {
                return 12;
            }
            if (b2 == 110) {
                return 10;
            }
            if (b2 == 114) {
                return 13;
            }
            if (b2 == 116) {
                return 9;
            }
            if (b2 != 117) {
                char Q1 = (char) Q1(b2);
                A1(Q1);
                return Q1;
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < 4) {
                if (this.u < this.v || a2()) {
                    byte[] bArr2 = this.a0;
                    int i5 = this.u;
                    this.u = i5 + 1;
                    byte b3 = bArr2[i5];
                    int[] iArr = b.j.a.b.s.a.f1465i;
                    byte b4 = b3 & ExifInterface.MARKER;
                    int i6 = iArr[b4];
                    if (i6 >= 0) {
                        i4 = (i4 << 4) | i6;
                        i3++;
                    } else {
                        l1(b4, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    j1(" in character escape sequence", l.VALUE_STRING);
                    throw null;
                }
            }
            return (char) i4;
        }
        j1(" in character escape sequence", l.VALUE_STRING);
        throw null;
    }

    public final void w2() {
        if (this.u < this.v || a2()) {
            byte[] bArr = this.a0;
            int i2 = this.u;
            if (bArr[i2] == 10) {
                this.u = i2 + 1;
            }
        }
        this.x++;
        this.y = this.u;
    }

    public String x0() {
        l lVar = this.f1459i;
        if (lVar == l.VALUE_STRING) {
            if (!this.U) {
                return this.E.h();
            }
            this.U = false;
            return V1();
        } else if (lVar == null) {
            return null;
        } else {
            int i2 = lVar.f1441k;
            if (i2 == 5) {
                return this.C.f;
            }
            if (i2 == 6 || i2 == 7 || i2 == 8) {
                return this.E.h();
            }
            return lVar.f1438h;
        }
    }

    public final int x2() {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4 = this.u;
        if (i4 + 4 >= this.v) {
            return y2(false);
        }
        byte[] bArr = this.a0;
        byte b4 = bArr[i4];
        if (b4 == 58) {
            i2 = i4 + 1;
            this.u = i2;
            b2 = bArr[i2];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    i3 = i2 + 1;
                    this.u = i3;
                    b3 = bArr[i3];
                    if (b3 > 32) {
                        if (b3 == 47 || b3 == 35) {
                            return y2(true);
                        }
                        this.u = i3 + 1;
                        return b3;
                    }
                }
                return y2(true);
            } else if (b2 == 47 || b2 == 35) {
                return y2(true);
            }
        } else {
            if (b4 == 32 || b4 == 9) {
                int i5 = i4 + 1;
                this.u = i5;
                b4 = bArr[i5];
            }
            if (b4 != 58) {
                return y2(false);
            }
            i2 = this.u + 1;
            this.u = i2;
            b2 = bArr[i2];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    i3 = i2 + 1;
                    this.u = i3;
                    b3 = bArr[i3];
                    if (b3 > 32) {
                        if (b3 == 47 || b3 == 35) {
                            return y2(true);
                        }
                        this.u = i3 + 1;
                        return b3;
                    }
                }
                return y2(true);
            } else if (b2 == 47 || b2 == 35) {
                return y2(true);
            }
        }
        this.u = i2 + 1;
        return b2;
    }

    public char[] y0() {
        l lVar = this.f1459i;
        if (lVar == null) {
            return null;
        }
        int i2 = lVar.f1441k;
        if (i2 != 5) {
            if (i2 != 6) {
                if (!(i2 == 7 || i2 == 8)) {
                    return lVar.f1439i;
                }
            } else if (this.U) {
                this.U = false;
                W1();
            }
            return this.E.n();
        }
        if (!this.G) {
            String str = this.C.f;
            int length = str.length();
            char[] cArr = this.F;
            if (cArr == null) {
                b.j.a.b.s.b bVar = this.s;
                bVar.a(bVar.f1472j);
                char[] b2 = bVar.d.b(3, length);
                bVar.f1472j = b2;
                this.F = b2;
            } else if (cArr.length < length) {
                this.F = new char[length];
            }
            str.getChars(0, length, this.F, 0);
            this.G = true;
        }
        return this.F;
    }

    public final int y2(boolean z) {
        while (true) {
            if (this.u < this.v || a2()) {
                byte[] bArr = this.a0;
                int i2 = this.u;
                int i3 = i2 + 1;
                this.u = i3;
                byte b2 = bArr[i2] & ExifInterface.MARKER;
                if (b2 > 32) {
                    if (b2 == 47) {
                        z2();
                    } else if (b2 != 35 || !J2()) {
                        if (z) {
                            return b2;
                        }
                        if (b2 == 58) {
                            z = true;
                        } else {
                            l1(b2, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (b2 == 32) {
                    continue;
                } else if (b2 == 10) {
                    this.x++;
                    this.y = i3;
                } else if (b2 == 13) {
                    w2();
                } else if (b2 != 9) {
                    m1(b2);
                    throw null;
                }
            } else {
                StringBuilder y = b.e.a.a.a.y(" within/between ");
                y.append(this.C.h());
                y.append(" entries");
                j1(y.toString(), (l) null);
                throw null;
            }
        }
    }

    public int z0() {
        l lVar = this.f1459i;
        if (lVar == null) {
            return 0;
        }
        int i2 = lVar.f1441k;
        if (i2 == 5) {
            return this.C.f.length();
        }
        if (i2 != 6) {
            if (!(i2 == 7 || i2 == 8)) {
                return lVar.f1439i.length;
            }
        } else if (this.U) {
            this.U = false;
            W1();
        }
        return this.E.s();
    }

    public final void z2() {
        if ((this.f1416h & i0) == 0) {
            l1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this.u < this.v || a2()) {
            byte[] bArr = this.a0;
            int i2 = this.u;
            this.u = i2 + 1;
            byte b2 = bArr[i2] & ExifInterface.MARKER;
            if (b2 == 47) {
                A2();
            } else if (b2 == 42) {
                int[] iArr = b.j.a.b.s.a.f1463g;
                while (true) {
                    if (this.u >= this.v && !a2()) {
                        break;
                    }
                    byte[] bArr2 = this.a0;
                    int i3 = this.u;
                    int i4 = i3 + 1;
                    this.u = i4;
                    byte b3 = bArr2[i3] & ExifInterface.MARKER;
                    int i5 = iArr[b3];
                    if (i5 != 0) {
                        if (i5 == 2) {
                            C2();
                        } else if (i5 == 3) {
                            D2();
                        } else if (i5 == 4) {
                            E2();
                        } else if (i5 == 10) {
                            this.x++;
                            this.y = i4;
                        } else if (i5 == 13) {
                            w2();
                        } else if (i5 == 42) {
                            if (i4 >= this.v && !a2()) {
                                break;
                            }
                            byte[] bArr3 = this.a0;
                            int i6 = this.u;
                            if (bArr3[i6] == 47) {
                                this.u = i6 + 1;
                                return;
                            }
                        } else {
                            q2(b3);
                            throw null;
                        }
                    }
                }
                j1(" in a comment", (l) null);
                throw null;
            } else {
                l1(b2, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            j1(" in a comment", (l) null);
            throw null;
        }
    }
}
