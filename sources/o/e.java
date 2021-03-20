package o;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import e.a.a.a.y0.m.o1.c;
import e.t.g;
import e.x.c.i;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import o.b0.b;

public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: h  reason: collision with root package name */
    public u f10452h;

    /* renamed from: i  reason: collision with root package name */
    public long f10453i;

    public static final class a extends InputStream {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e f10454h;

        public a(e eVar) {
            this.f10454h = eVar;
        }

        public int available() {
            return (int) Math.min(this.f10454h.f10453i, (long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }

        public void close() {
        }

        public int read() {
            e eVar = this.f10454h;
            if (eVar.f10453i > 0) {
                return eVar.readByte() & ExifInterface.MARKER;
            }
            return -1;
        }

        public int read(byte[] bArr, int i2, int i3) {
            i.e(bArr, "sink");
            return this.f10454h.read(bArr, i2, i3);
        }

        public String toString() {
            return this.f10454h + ".inputStream()";
        }
    }

    public byte[] A() {
        return G(this.f10453i);
    }

    public e A0(int i2) {
        long j2;
        long j3;
        String str;
        if (i2 < 128) {
            u0(i2);
        } else {
            if (i2 < 2048) {
                u q0 = q0(2);
                byte[] bArr = q0.a;
                int i3 = q0.c;
                bArr[i3] = (byte) ((i2 >> 6) | 192);
                bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
                q0.c = i3 + 2;
                j3 = this.f10453i;
                j2 = 2;
            } else if (55296 <= i2 && 57343 >= i2) {
                u0(63);
            } else if (i2 < 65536) {
                u q02 = q0(3);
                byte[] bArr2 = q02.a;
                int i4 = q02.c;
                bArr2[i4] = (byte) ((i2 >> 12) | 224);
                bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
                bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
                q02.c = i4 + 3;
                j3 = this.f10453i;
                j2 = 3;
            } else if (i2 <= 1114111) {
                u q03 = q0(4);
                byte[] bArr3 = q03.a;
                int i5 = q03.c;
                bArr3[i5] = (byte) ((i2 >> 18) | 240);
                bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
                bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
                bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
                q03.c = i5 + 4;
                j3 = this.f10453i;
                j2 = 4;
            } else {
                StringBuilder y = b.e.a.a.a.y("Unexpected code point: 0x");
                if (i2 != 0) {
                    char[] cArr = b.a;
                    int i6 = 0;
                    char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
                    while (i6 < 8 && cArr2[i6] == '0') {
                        i6++;
                    }
                    str = new String(cArr2, i6, 8 - i6);
                } else {
                    str = "0";
                }
                y.append(str);
                throw new IllegalArgumentException(y.toString());
            }
            this.f10453i = j3 + j2;
        }
        return this;
    }

    public long C(h hVar) {
        i.e(hVar, "bytes");
        return S(hVar, 0);
    }

    public boolean D() {
        return this.f10453i == 0;
    }

    public /* bridge */ /* synthetic */ f E(int i2) {
        u0(i2);
        return this;
    }

    public byte[] G(long j2) {
        int i2 = 0;
        if (!(j2 >= 0 && j2 <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED))) {
            throw new IllegalArgumentException(b.e.a.a.a.j("byteCount: ", j2).toString());
        } else if (this.f10453i >= j2) {
            int i3 = (int) j2;
            byte[] bArr = new byte[i3];
            i.e(bArr, "sink");
            while (i2 < i3) {
                int read = read(bArr, i2, i3 - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public /* bridge */ /* synthetic */ f K(byte[] bArr) {
        s0(bArr);
        return this;
    }

    public /* bridge */ /* synthetic */ f M(h hVar) {
        r0(hVar);
        return this;
    }

    public final byte N(long j2) {
        c.p(this.f10453i, j2, 1);
        u uVar = this.f10452h;
        if (uVar != null) {
            long j3 = this.f10453i;
            if (j3 - j2 < j2) {
                while (j3 > j2) {
                    uVar = uVar.f10491g;
                    i.c(uVar);
                    j3 -= (long) (uVar.c - uVar.f10489b);
                }
                i.c(uVar);
                return uVar.a[(int) ((((long) uVar.f10489b) + j2) - j3)];
            }
            long j4 = 0;
            while (true) {
                long j5 = ((long) (uVar.c - uVar.f10489b)) + j4;
                if (j5 > j2) {
                    i.c(uVar);
                    return uVar.a[(int) ((((long) uVar.f10489b) + j2) - j4)];
                }
                uVar = uVar.f;
                i.c(uVar);
                j4 = j5;
            }
        } else {
            i.c((Object) null);
            return null.a[(int) ((((long) null.f10489b) + j2) - -1)];
        }
    }

    public long O(byte b2, long j2, long j3) {
        u uVar;
        long j4 = 0;
        if (0 <= j2 && j3 >= j2) {
            long j5 = this.f10453i;
            if (j3 > j5) {
                j3 = j5;
            }
            if (!(j2 == j3 || (uVar = this.f10452h) == null)) {
                if (j5 - j2 < j2) {
                    while (j5 > j2) {
                        uVar = uVar.f10491g;
                        i.c(uVar);
                        j5 -= (long) (uVar.c - uVar.f10489b);
                    }
                    while (j5 < j3) {
                        byte[] bArr = uVar.a;
                        int min = (int) Math.min((long) uVar.c, (((long) uVar.f10489b) + j3) - j5);
                        for (int i2 = (int) ((((long) uVar.f10489b) + j2) - j5); i2 < min; i2++) {
                            if (bArr[i2] == b2) {
                                return ((long) (i2 - uVar.f10489b)) + j5;
                            }
                        }
                        j5 += (long) (uVar.c - uVar.f10489b);
                        uVar = uVar.f;
                        i.c(uVar);
                        j2 = j5;
                    }
                } else {
                    while (true) {
                        long j6 = ((long) (uVar.c - uVar.f10489b)) + j4;
                        if (j6 > j2) {
                            break;
                        }
                        uVar = uVar.f;
                        i.c(uVar);
                        j4 = j6;
                    }
                    while (j4 < j3) {
                        byte[] bArr2 = uVar.a;
                        int min2 = (int) Math.min((long) uVar.c, (((long) uVar.f10489b) + j3) - j4);
                        for (int i3 = (int) ((((long) uVar.f10489b) + j2) - j4); i3 < min2; i3++) {
                            if (bArr2[i3] == b2) {
                                return ((long) (i3 - uVar.f10489b)) + j4;
                            }
                        }
                        j4 += (long) (uVar.c - uVar.f10489b);
                        uVar = uVar.f;
                        i.c(uVar);
                        j2 = j4;
                    }
                }
            }
            return -1;
        }
        StringBuilder y = b.e.a.a.a.y("size=");
        y.append(this.f10453i);
        y.append(" fromIndex=");
        y.append(j2);
        y.append(" toIndex=");
        y.append(j3);
        throw new IllegalArgumentException(y.toString().toString());
    }

    public long P(h hVar) {
        i.e(hVar, "targetBytes");
        return Y(hVar, 0);
    }

    public f Q() {
        return this;
    }

    public long S(h hVar, long j2) {
        long j3 = j2;
        i.e(hVar, "bytes");
        if (hVar.l() > 0) {
            long j4 = 0;
            if (j3 >= 0) {
                u uVar = this.f10452h;
                if (uVar != null) {
                    long j5 = this.f10453i;
                    if (j5 - j3 < j3) {
                        while (j5 > j3) {
                            uVar = uVar.f10491g;
                            i.c(uVar);
                            j5 -= (long) (uVar.c - uVar.f10489b);
                        }
                        byte[] n2 = hVar.n();
                        byte b2 = n2[0];
                        int l2 = hVar.l();
                        long j6 = (this.f10453i - ((long) l2)) + 1;
                        long j7 = j5;
                        while (j7 < j6) {
                            byte[] bArr = uVar.a;
                            long j8 = j6;
                            int min = (int) Math.min((long) uVar.c, (((long) uVar.f10489b) + j6) - j7);
                            for (int i2 = (int) ((((long) uVar.f10489b) + j3) - j7); i2 < min; i2++) {
                                if (bArr[i2] == b2 && o.b0.a.a(uVar, i2 + 1, n2, 1, l2)) {
                                    return ((long) (i2 - uVar.f10489b)) + j7;
                                }
                            }
                            j7 += (long) (uVar.c - uVar.f10489b);
                            uVar = uVar.f;
                            i.c(uVar);
                            j3 = j7;
                            j6 = j8;
                        }
                    } else {
                        while (true) {
                            long j9 = ((long) (uVar.c - uVar.f10489b)) + j4;
                            if (j9 > j3) {
                                break;
                            }
                            uVar = uVar.f;
                            i.c(uVar);
                            j4 = j9;
                        }
                        byte[] n3 = hVar.n();
                        byte b3 = n3[0];
                        int l3 = hVar.l();
                        long j10 = (this.f10453i - ((long) l3)) + 1;
                        while (j4 < j10) {
                            byte[] bArr2 = uVar.a;
                            long j11 = j10;
                            int min2 = (int) Math.min((long) uVar.c, (((long) uVar.f10489b) + j10) - j4);
                            for (int i3 = (int) ((((long) uVar.f10489b) + j3) - j4); i3 < min2; i3++) {
                                if (bArr2[i3] == b3 && o.b0.a.a(uVar, i3 + 1, n3, 1, l3)) {
                                    return ((long) (i3 - uVar.f10489b)) + j4;
                                }
                            }
                            j4 += (long) (uVar.c - uVar.f10489b);
                            uVar = uVar.f;
                            i.c(uVar);
                            j3 = j4;
                            j10 = j11;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(b.e.a.a.a.j("fromIndex < 0: ", j3).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public long T(e eVar, long j2) {
        i.e(eVar, "sink");
        if (j2 >= 0) {
            long j3 = this.f10453i;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            eVar.j(this, j2);
            return j2;
        }
        throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j2).toString());
    }

    public String U(long j2) {
        if (j2 >= 0) {
            long j3 = RecyclerView.FOREVER_NS;
            if (j2 != RecyclerView.FOREVER_NS) {
                j3 = j2 + 1;
            }
            byte b2 = (byte) 10;
            long O = O(b2, 0, j3);
            if (O != -1) {
                return o.b0.a.b(this, O);
            }
            if (j3 < this.f10453i && N(j3 - 1) == ((byte) 13) && N(j3) == b2) {
                return o.b0.a.b(this, j3);
            }
            e eVar = new e();
            z(eVar, 0, Math.min((long) 32, this.f10453i));
            StringBuilder y = b.e.a.a.a.y("\\n not found: limit=");
            y.append(Math.min(this.f10453i, j2));
            y.append(" content=");
            y.append(eVar.e0().m());
            y.append(8230);
            throw new EOFException(y.toString());
        }
        throw new IllegalArgumentException(b.e.a.a.a.j("limit < 0: ", j2).toString());
    }

    public long V(x xVar) {
        i.e(xVar, "sink");
        long j2 = this.f10453i;
        if (j2 > 0) {
            ((r) xVar).j(this, j2);
        }
        return j2;
    }

    public long Y(h hVar, long j2) {
        int i2;
        int i3;
        i.e(hVar, "targetBytes");
        long j3 = 0;
        if (j2 >= 0) {
            u uVar = this.f10452h;
            if (uVar == null) {
                return -1;
            }
            long j4 = this.f10453i;
            if (j4 - j2 < j2) {
                while (j4 > j2) {
                    uVar = uVar.f10491g;
                    i.c(uVar);
                    j4 -= (long) (uVar.c - uVar.f10489b);
                }
                if (hVar.l() == 2) {
                    byte r = hVar.r(0);
                    byte r2 = hVar.r(1);
                    while (j4 < this.f10453i) {
                        byte[] bArr = uVar.a;
                        i3 = (int) ((((long) uVar.f10489b) + j2) - j4);
                        int i4 = uVar.c;
                        while (i3 < i4) {
                            byte b2 = bArr[i3];
                            if (!(b2 == r || b2 == r2)) {
                                i3++;
                            }
                        }
                        j4 += (long) (uVar.c - uVar.f10489b);
                        uVar = uVar.f;
                        i.c(uVar);
                        j2 = j4;
                    }
                    return -1;
                }
                byte[] n2 = hVar.n();
                while (j4 < this.f10453i) {
                    byte[] bArr2 = uVar.a;
                    int i5 = (int) ((((long) uVar.f10489b) + j2) - j4);
                    int i6 = uVar.c;
                    while (i3 < i6) {
                        byte b3 = bArr2[i3];
                        int length = n2.length;
                        int i7 = 0;
                        while (i7 < length) {
                            if (b3 != n2[i7]) {
                                i7++;
                            }
                        }
                        i5 = i3 + 1;
                    }
                    j4 += (long) (uVar.c - uVar.f10489b);
                    uVar = uVar.f;
                    i.c(uVar);
                    j2 = j4;
                }
                return -1;
                return ((long) (i3 - uVar.f10489b)) + j4;
            }
            while (true) {
                long j5 = ((long) (uVar.c - uVar.f10489b)) + j3;
                if (j5 > j2) {
                    break;
                }
                uVar = uVar.f;
                i.c(uVar);
                j3 = j5;
            }
            if (hVar.l() == 2) {
                byte r3 = hVar.r(0);
                byte r4 = hVar.r(1);
                while (j3 < this.f10453i) {
                    byte[] bArr3 = uVar.a;
                    i2 = (int) ((((long) uVar.f10489b) + j2) - j3);
                    int i8 = uVar.c;
                    while (i2 < i8) {
                        byte b4 = bArr3[i2];
                        if (!(b4 == r3 || b4 == r4)) {
                            i2++;
                        }
                    }
                    j3 += (long) (uVar.c - uVar.f10489b);
                    uVar = uVar.f;
                    i.c(uVar);
                    j2 = j3;
                }
                return -1;
            }
            byte[] n3 = hVar.n();
            while (j3 < this.f10453i) {
                byte[] bArr4 = uVar.a;
                int i9 = (int) ((((long) uVar.f10489b) + j2) - j3);
                int i10 = uVar.c;
                while (i2 < i10) {
                    byte b5 = bArr4[i2];
                    int length2 = n3.length;
                    int i11 = 0;
                    while (i11 < length2) {
                        if (b5 != n3[i11]) {
                            i11++;
                        }
                    }
                    i9 = i2 + 1;
                }
                j3 += (long) (uVar.c - uVar.f10489b);
                uVar = uVar.f;
                i.c(uVar);
                j2 = j3;
            }
            return -1;
            return ((long) (i2 - uVar.f10489b)) + j3;
        }
        throw new IllegalArgumentException(b.e.a.a.a.j("fromIndex < 0: ", j2).toString());
    }

    public e a() {
        return this;
    }

    /* renamed from: b */
    public e clone() {
        e eVar = new e();
        if (this.f10453i != 0) {
            u uVar = this.f10452h;
            i.c(uVar);
            u c = uVar.c();
            eVar.f10452h = c;
            c.f10491g = c;
            c.f = c;
            for (u uVar2 = uVar.f; uVar2 != uVar; uVar2 = uVar2.f) {
                u uVar3 = c.f10491g;
                i.c(uVar3);
                i.c(uVar2);
                uVar3.b(uVar2.c());
            }
            eVar.f10453i = this.f10453i;
        }
        return eVar;
    }

    public void c0(long j2) {
        if (this.f10453i < j2) {
            throw new EOFException();
        }
    }

    public void close() {
    }

    public e d() {
        return this;
    }

    public /* bridge */ /* synthetic */ f d0(String str) {
        y0(str);
        return this;
    }

    public h e0() {
        return p(this.f10453i);
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = r3
            goto L_0x0078
        L_0x000b:
            boolean r4 = r1 instanceof o.e
            if (r4 != 0) goto L_0x0011
            goto L_0x0078
        L_0x0011:
            long r4 = r0.f10453i
            o.e r1 = (o.e) r1
            long r6 = r1.f10453i
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x001c
            goto L_0x0078
        L_0x001c:
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            o.u r4 = r0.f10452h
            e.x.c.i.c(r4)
            o.u r1 = r1.f10452h
            e.x.c.i.c(r1)
            int r5 = r4.f10489b
            int r8 = r1.f10489b
            r9 = r6
        L_0x0032:
            long r11 = r0.f10453i
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0008
            int r11 = r4.c
            int r11 = r11 - r5
            int r12 = r1.c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            byte[] r15 = r4.a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0044
        L_0x0060:
            int r13 = r4.c
            if (r5 != r13) goto L_0x006b
            o.u r4 = r4.f
            e.x.c.i.c(r4)
            int r5 = r4.f10489b
        L_0x006b:
            int r13 = r1.c
            if (r8 != r13) goto L_0x0076
            o.u r1 = r1.f
            e.x.c.i.c(r1)
            int r8 = r1.f10489b
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.equals(java.lang.Object):boolean");
    }

    public a0 f() {
        return a0.d;
    }

    public void flush() {
    }

    public short g0() {
        short readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public /* bridge */ /* synthetic */ f h(byte[] bArr, int i2, int i3) {
        t0(bArr, i2, i3);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r8 != r9) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        r14.f10452h = r6.a();
        o.v.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r6.f10489b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r1 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0077 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long h0() {
        /*
            r14 = this;
            long r0 = r14.f10453i
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            o.u r6 = r14.f10452h
            e.x.c.i.c(r6)
            byte[] r7 = r6.a
            int r8 = r6.f10489b
            int r9 = r6.c
        L_0x0016:
            if (r8 >= r9) goto L_0x008e
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0027
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0027
            int r11 = r10 - r11
            goto L_0x0040
        L_0x0027:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0032
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0073
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0073
        L_0x003c:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x0040:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0050
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0050:
            o.e r0 = new o.e
            r0.<init>()
            o.e r0 = r0.o(r4)
            r0.u0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            java.lang.String r0 = r0.m0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0073:
            if (r0 == 0) goto L_0x0077
            r1 = 1
            goto L_0x008e
        L_0x0077:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            java.lang.String r2 = e.a.a.a.y0.m.o1.c.q0(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            if (r8 != r9) goto L_0x009a
            o.u r7 = r6.a()
            r14.f10452h = r7
            o.v.a(r6)
            goto L_0x009c
        L_0x009a:
            r6.f10489b = r8
        L_0x009c:
            if (r1 != 0) goto L_0x00a2
            o.u r6 = r14.f10452h
            if (r6 != 0) goto L_0x000b
        L_0x00a2:
            long r1 = r14.f10453i
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f10453i = r1
            return r4
        L_0x00a9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.h0():long");
    }

    public int hashCode() {
        u uVar = this.f10452h;
        if (uVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = uVar.c;
            for (int i4 = uVar.f10489b; i4 < i3; i4++) {
                i2 = (i2 * 31) + uVar.a[i4];
            }
            uVar = uVar.f;
            i.c(uVar);
        } while (uVar != this.f10452h);
        return i2;
    }

    public String i0(Charset charset) {
        i.e(charset, "charset");
        return k0(this.f10453i, charset);
    }

    public boolean isOpen() {
        return true;
    }

    public void j(e eVar, long j2) {
        int i2;
        u uVar;
        u uVar2;
        i.e(eVar, "source");
        if (eVar != this) {
            c.p(eVar.f10453i, 0, j2);
            while (j2 > 0) {
                u uVar3 = eVar.f10452h;
                i.c(uVar3);
                int i3 = uVar3.c;
                u uVar4 = eVar.f10452h;
                i.c(uVar4);
                if (j2 < ((long) (i3 - uVar4.f10489b))) {
                    u uVar5 = this.f10452h;
                    if (uVar5 != null) {
                        i.c(uVar5);
                        uVar = uVar5.f10491g;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null && uVar.f10490e) {
                        if ((((long) uVar.c) + j2) - ((long) (uVar.d ? 0 : uVar.f10489b)) <= ((long) 8192)) {
                            u uVar6 = eVar.f10452h;
                            i.c(uVar6);
                            uVar6.d(uVar, (int) j2);
                            eVar.f10453i -= j2;
                            this.f10453i += j2;
                            return;
                        }
                    }
                    u uVar7 = eVar.f10452h;
                    i.c(uVar7);
                    int i4 = (int) j2;
                    if (i4 > 0 && i4 <= uVar7.c - uVar7.f10489b) {
                        if (i4 >= 1024) {
                            uVar2 = uVar7.c();
                        } else {
                            uVar2 = v.b();
                            byte[] bArr = uVar7.a;
                            byte[] bArr2 = uVar2.a;
                            int i5 = uVar7.f10489b;
                            g.g(bArr, bArr2, 0, i5, i5 + i4, 2);
                        }
                        uVar2.c = uVar2.f10489b + i4;
                        uVar7.f10489b += i4;
                        u uVar8 = uVar7.f10491g;
                        i.c(uVar8);
                        uVar8.b(uVar2);
                        eVar.f10452h = uVar2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                u uVar9 = eVar.f10452h;
                i.c(uVar9);
                long j3 = (long) (uVar9.c - uVar9.f10489b);
                eVar.f10452h = uVar9.a();
                u uVar10 = this.f10452h;
                if (uVar10 == null) {
                    this.f10452h = uVar9;
                    uVar9.f10491g = uVar9;
                    uVar9.f = uVar9;
                } else {
                    i.c(uVar10);
                    u uVar11 = uVar10.f10491g;
                    i.c(uVar11);
                    uVar11.b(uVar9);
                    u uVar12 = uVar9.f10491g;
                    if (uVar12 != uVar9) {
                        i.c(uVar12);
                        if (uVar12.f10490e) {
                            int i6 = uVar9.c - uVar9.f10489b;
                            u uVar13 = uVar9.f10491g;
                            i.c(uVar13);
                            int i7 = 8192 - uVar13.c;
                            u uVar14 = uVar9.f10491g;
                            i.c(uVar14);
                            if (uVar14.d) {
                                i2 = 0;
                            } else {
                                u uVar15 = uVar9.f10491g;
                                i.c(uVar15);
                                i2 = uVar15.f10489b;
                            }
                            if (i6 <= i7 + i2) {
                                u uVar16 = uVar9.f10491g;
                                i.c(uVar16);
                                uVar9.d(uVar16, i6);
                                uVar9.a();
                                v.a(uVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                eVar.f10453i -= j3;
                this.f10453i += j3;
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public InputStream j0() {
        return new a(this);
    }

    public String k0(long j2, Charset charset) {
        i.e(charset, "charset");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (!(i2 >= 0 && j2 <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED))) {
            throw new IllegalArgumentException(b.e.a.a.a.j("byteCount: ", j2).toString());
        } else if (this.f10453i < j2) {
            throw new EOFException();
        } else if (i2 == 0) {
            return "";
        } else {
            u uVar = this.f10452h;
            i.c(uVar);
            int i3 = uVar.f10489b;
            if (((long) i3) + j2 > ((long) uVar.c)) {
                return new String(G(j2), charset);
            }
            int i4 = (int) j2;
            String str = new String(uVar.a, i3, i4, charset);
            int i5 = uVar.f10489b + i4;
            uVar.f10489b = i5;
            this.f10453i -= j2;
            if (i5 == uVar.c) {
                this.f10452h = uVar.a();
                v.a(uVar);
            }
            return str;
        }
    }

    public int l0(q qVar) {
        i.e(qVar, "options");
        int c = o.b0.a.c(this, qVar, false);
        if (c == -1) {
            return -1;
        }
        skip((long) qVar.f10478h[c].l());
        return c;
    }

    public /* bridge */ /* synthetic */ f m(String str, int i2, int i3) {
        z0(str, i2, i3);
        return this;
    }

    public String m0() {
        return k0(this.f10453i, e.c0.a.a);
    }

    public long n(z zVar) {
        i.e(zVar, "source");
        long j2 = 0;
        while (true) {
            long T = zVar.T(this, (long) 8192);
            if (T == -1) {
                return j2;
            }
            j2 += T;
        }
    }

    public String n0(long j2) {
        return k0(j2, e.c0.a.a);
    }

    public int o0() {
        byte b2;
        int i2;
        byte b3;
        if (this.f10453i != 0) {
            byte N = N(0);
            int i3 = 1;
            if ((N & 128) == 0) {
                b3 = N & Byte.MAX_VALUE;
                b2 = 0;
                i2 = 1;
            } else if ((N & 224) == 192) {
                b3 = N & 31;
                i2 = 2;
                b2 = 128;
            } else if ((N & 240) == 224) {
                b3 = N & 15;
                i2 = 3;
                b2 = 2048;
            } else if ((N & 248) == 240) {
                b3 = N & 7;
                i2 = 4;
                b2 = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j2 = (long) i2;
            if (this.f10453i >= j2) {
                while (i3 < i2) {
                    long j3 = (long) i3;
                    byte N2 = N(j3);
                    if ((N2 & 192) == 128) {
                        b3 = (b3 << 6) | (N2 & 63);
                        i3++;
                    } else {
                        skip(j3);
                        return 65533;
                    }
                }
                skip(j2);
                if (b3 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b3 && 57343 >= b3) || b3 < b2) {
                    return 65533;
                }
                return b3;
            }
            StringBuilder z = b.e.a.a.a.z("size < ", i2, ": ");
            z.append(this.f10453i);
            z.append(" (to read code point prefixed 0x");
            z.append(c.q0(N));
            z.append(')');
            throw new EOFException(z.toString());
        }
        throw new EOFException();
    }

    public h p(long j2) {
        if (!(j2 >= 0 && j2 <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED))) {
            throw new IllegalArgumentException(b.e.a.a.a.j("byteCount: ", j2).toString());
        } else if (this.f10453i < j2) {
            throw new EOFException();
        } else if (j2 < ((long) 4096)) {
            return new h(G(j2));
        } else {
            h p0 = p0((int) j2);
            skip(j2);
            return p0;
        }
    }

    public final h p0(int i2) {
        if (i2 == 0) {
            return h.f10455k;
        }
        c.p(this.f10453i, 0, (long) i2);
        u uVar = this.f10452h;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            i.c(uVar);
            int i6 = uVar.c;
            int i7 = uVar.f10489b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                uVar = uVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[(i5 * 2)];
        u uVar2 = this.f10452h;
        int i8 = 0;
        while (i3 < i2) {
            i.c(uVar2);
            bArr[i8] = uVar2.a;
            i3 += uVar2.c - uVar2.f10489b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = uVar2.f10489b;
            uVar2.d = true;
            i8++;
            uVar2 = uVar2.f;
        }
        return new w(bArr, iArr);
    }

    public final long q() {
        long j2 = this.f10453i;
        if (j2 == 0) {
            return 0;
        }
        u uVar = this.f10452h;
        i.c(uVar);
        u uVar2 = uVar.f10491g;
        i.c(uVar2);
        int i2 = uVar2.c;
        if (i2 < 8192 && uVar2.f10490e) {
            j2 -= (long) (i2 - uVar2.f10489b);
        }
        return j2;
    }

    public final u q0(int i2) {
        boolean z = true;
        if (i2 < 1 || i2 > 8192) {
            z = false;
        }
        if (z) {
            u uVar = this.f10452h;
            if (uVar == null) {
                u b2 = v.b();
                this.f10452h = b2;
                b2.f10491g = b2;
                b2.f = b2;
                return b2;
            }
            i.c(uVar);
            u uVar2 = uVar.f10491g;
            i.c(uVar2);
            if (uVar2.c + i2 <= 8192 && uVar2.f10490e) {
                return uVar2;
            }
            u b3 = v.b();
            uVar2.b(b3);
            return b3;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public /* bridge */ /* synthetic */ f r(int i2) {
        x0(i2);
        return this;
    }

    public e r0(h hVar) {
        i.e(hVar, "byteString");
        hVar.z(this, 0, hVar.l());
        return this;
    }

    public int read(ByteBuffer byteBuffer) {
        i.e(byteBuffer, "sink");
        u uVar = this.f10452h;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.c - uVar.f10489b);
        byteBuffer.put(uVar.a, uVar.f10489b, min);
        int i2 = uVar.f10489b + min;
        uVar.f10489b = i2;
        this.f10453i -= (long) min;
        if (i2 == uVar.c) {
            this.f10452h = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    public int read(byte[] bArr, int i2, int i3) {
        i.e(bArr, "sink");
        c.p((long) bArr.length, (long) i2, (long) i3);
        u uVar = this.f10452h;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i3, uVar.c - uVar.f10489b);
        byte[] bArr2 = uVar.a;
        int i4 = uVar.f10489b;
        g.f(bArr2, bArr, i2, i4, i4 + min);
        int i5 = uVar.f10489b + min;
        uVar.f10489b = i5;
        this.f10453i -= (long) min;
        if (i5 != uVar.c) {
            return min;
        }
        this.f10452h = uVar.a();
        v.a(uVar);
        return min;
    }

    public byte readByte() {
        if (this.f10453i != 0) {
            u uVar = this.f10452h;
            i.c(uVar);
            int i2 = uVar.f10489b;
            int i3 = uVar.c;
            int i4 = i2 + 1;
            byte b2 = uVar.a[i2];
            this.f10453i--;
            if (i4 == i3) {
                this.f10452h = uVar.a();
                v.a(uVar);
            } else {
                uVar.f10489b = i4;
            }
            return b2;
        }
        throw new EOFException();
    }

    public int readInt() {
        if (this.f10453i >= 4) {
            u uVar = this.f10452h;
            i.c(uVar);
            int i2 = uVar.f10489b;
            int i3 = uVar.c;
            if (((long) (i3 - i2)) < 4) {
                return ((readByte() & ExifInterface.MARKER) << 24) | ((readByte() & ExifInterface.MARKER) << 16) | ((readByte() & ExifInterface.MARKER) << 8) | (readByte() & ExifInterface.MARKER);
            }
            byte[] bArr = uVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b2 = ((bArr[i2] & ExifInterface.MARKER) << 24) | ((bArr[i4] & ExifInterface.MARKER) << 16);
            int i6 = i5 + 1;
            byte b3 = b2 | ((bArr[i5] & ExifInterface.MARKER) << 8);
            int i7 = i6 + 1;
            byte b4 = b3 | (bArr[i6] & ExifInterface.MARKER);
            this.f10453i -= 4;
            if (i7 == i3) {
                this.f10452h = uVar.a();
                v.a(uVar);
            } else {
                uVar.f10489b = i7;
            }
            return b4;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (this.f10453i >= 2) {
            u uVar = this.f10452h;
            i.c(uVar);
            int i2 = uVar.f10489b;
            int i3 = uVar.c;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & ExifInterface.MARKER) << 8) | (readByte() & ExifInterface.MARKER));
            }
            byte[] bArr = uVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b2 = ((bArr[i2] & ExifInterface.MARKER) << 8) | (bArr[i4] & ExifInterface.MARKER);
            this.f10453i -= 2;
            if (i5 == i3) {
                this.f10452h = uVar.a();
                v.a(uVar);
            } else {
                uVar.f10489b = i5;
            }
            return (short) b2;
        }
        throw new EOFException();
    }

    public e s0(byte[] bArr) {
        i.e(bArr, "source");
        t0(bArr, 0, bArr.length);
        return this;
    }

    public void skip(long j2) {
        while (j2 > 0) {
            u uVar = this.f10452h;
            if (uVar != null) {
                int min = (int) Math.min(j2, (long) (uVar.c - uVar.f10489b));
                long j3 = (long) min;
                this.f10453i -= j3;
                j2 -= j3;
                int i2 = uVar.f10489b + min;
                uVar.f10489b = i2;
                if (i2 == uVar.c) {
                    this.f10452h = uVar.a();
                    v.a(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public boolean t(long j2) {
        return this.f10453i >= j2;
    }

    public e t0(byte[] bArr, int i2, int i3) {
        i.e(bArr, "source");
        long j2 = (long) i3;
        c.p((long) bArr.length, (long) i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            u q0 = q0(1);
            int min = Math.min(i4 - i2, 8192 - q0.c);
            int i5 = i2 + min;
            g.f(bArr, q0.a, q0.c, i2, i5);
            q0.c += min;
            i2 = i5;
        }
        this.f10453i += j2;
        return this;
    }

    public String toString() {
        long j2 = this.f10453i;
        if (j2 <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            return p0((int) j2).toString();
        }
        StringBuilder y = b.e.a.a.a.y("size > Int.MAX_VALUE: ");
        y.append(this.f10453i);
        throw new IllegalStateException(y.toString().toString());
    }

    public e u0(int i2) {
        u q0 = q0(1);
        byte[] bArr = q0.a;
        int i3 = q0.c;
        q0.c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f10453i++;
        return this;
    }

    public /* bridge */ /* synthetic */ f v(int i2) {
        w0(i2);
        return this;
    }

    /* renamed from: v0 */
    public e o(long j2) {
        if (j2 == 0) {
            u0(48);
        } else {
            long j3 = (j2 >>> 1) | j2;
            long j4 = j3 | (j3 >>> 2);
            long j5 = j4 | (j4 >>> 4);
            long j6 = j5 | (j5 >>> 8);
            long j7 = j6 | (j6 >>> 16);
            long j8 = j7 | (j7 >>> 32);
            long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
            long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
            long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
            long j12 = j11 + (j11 >>> 8);
            long j13 = j12 + (j12 >>> 16);
            int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            u q0 = q0(i2);
            byte[] bArr = q0.a;
            int i3 = q0.c;
            for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
                bArr[i4] = o.b0.a.a[(int) (15 & j2)];
                j2 >>>= 4;
            }
            q0.c += i2;
            this.f10453i += (long) i2;
        }
        return this;
    }

    public e w0(int i2) {
        u q0 = q0(4);
        byte[] bArr = q0.a;
        int i3 = q0.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        q0.c = i6 + 1;
        this.f10453i += 4;
        return this;
    }

    public int write(ByteBuffer byteBuffer) {
        i.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            u q0 = q0(1);
            int min = Math.min(i2, 8192 - q0.c);
            byteBuffer.get(q0.a, q0.c, min);
            i2 -= min;
            q0.c += min;
        }
        this.f10453i += (long) remaining;
        return remaining;
    }

    public e x0(int i2) {
        u q0 = q0(2);
        byte[] bArr = q0.a;
        int i3 = q0.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        q0.c = i4 + 1;
        this.f10453i += 2;
        return this;
    }

    public String y() {
        return U(RecyclerView.FOREVER_NS);
    }

    public e y0(String str) {
        i.e(str, "string");
        z0(str, 0, str.length());
        return this;
    }

    public final e z(e eVar, long j2, long j3) {
        i.e(eVar, "out");
        c.p(this.f10453i, j2, j3);
        if (j3 != 0) {
            eVar.f10453i += j3;
            u uVar = this.f10452h;
            while (true) {
                i.c(uVar);
                int i2 = uVar.c;
                int i3 = uVar.f10489b;
                if (j2 < ((long) (i2 - i3))) {
                    break;
                }
                j2 -= (long) (i2 - i3);
                uVar = uVar.f;
            }
            while (j3 > 0) {
                i.c(uVar);
                u c = uVar.c();
                int i4 = c.f10489b + ((int) j2);
                c.f10489b = i4;
                c.c = Math.min(i4 + ((int) j3), c.c);
                u uVar2 = eVar.f10452h;
                if (uVar2 == null) {
                    c.f10491g = c;
                    c.f = c;
                    eVar.f10452h = c;
                } else {
                    i.c(uVar2);
                    u uVar3 = uVar2.f10491g;
                    i.c(uVar3);
                    uVar3.b(c);
                }
                j3 -= (long) (c.c - c.f10489b);
                uVar = uVar.f;
                j2 = 0;
            }
        }
        return this;
    }

    public e z0(String str, int i2, int i3) {
        long j2;
        long j3;
        char charAt;
        i.e(str, "string");
        if (i2 >= 0) {
            if (i3 >= i2) {
                if (i3 <= str.length()) {
                    while (i2 < i3) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 < 128) {
                            u q0 = q0(1);
                            byte[] bArr = q0.a;
                            int i4 = q0.c - i2;
                            int min = Math.min(i3, 8192 - i4);
                            int i5 = i2 + 1;
                            bArr[i2 + i4] = (byte) charAt2;
                            while (true) {
                                i2 = i5;
                                if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                                    int i6 = q0.c;
                                    int i7 = (i4 + i2) - i6;
                                    q0.c = i6 + i7;
                                    this.f10453i += (long) i7;
                                } else {
                                    i5 = i2 + 1;
                                    bArr[i2 + i4] = (byte) charAt;
                                }
                            }
                            int i62 = q0.c;
                            int i72 = (i4 + i2) - i62;
                            q0.c = i62 + i72;
                            this.f10453i += (long) i72;
                        } else {
                            if (charAt2 < 2048) {
                                u q02 = q0(2);
                                byte[] bArr2 = q02.a;
                                int i8 = q02.c;
                                bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                                q02.c = i8 + 2;
                                j2 = this.f10453i;
                                j3 = 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                u q03 = q0(3);
                                byte[] bArr3 = q03.a;
                                int i9 = q03.c;
                                bArr3[i9] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                                q03.c = i9 + 3;
                                j2 = this.f10453i;
                                j3 = 3;
                            } else {
                                int i10 = i2 + 1;
                                char charAt3 = i10 < i3 ? str.charAt(i10) : 0;
                                if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    u0(63);
                                    i2 = i10;
                                } else {
                                    int i11 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    u q04 = q0(4);
                                    byte[] bArr4 = q04.a;
                                    int i12 = q04.c;
                                    bArr4[i12] = (byte) ((i11 >> 18) | 240);
                                    bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                                    bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                                    bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                                    q04.c = i12 + 4;
                                    this.f10453i += 4;
                                    i2 += 2;
                                }
                            }
                            this.f10453i = j2 + j3;
                            i2++;
                        }
                    }
                    return this;
                }
                StringBuilder z = b.e.a.a.a.z("endIndex > string.length: ", i3, " > ");
                z.append(str.length());
                throw new IllegalArgumentException(z.toString().toString());
            }
            throw new IllegalArgumentException(b.e.a.a.a.i("endIndex < beginIndex: ", i3, " < ", i2).toString());
        }
        throw new IllegalArgumentException(b.e.a.a.a.g("beginIndex < 0: ", i2).toString());
    }
}
