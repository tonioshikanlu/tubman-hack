package e.a.a.a.y0.h;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class d {
    public final byte[] a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9225b;
    public int c = 0;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9226e = 0;
    public final InputStream f;

    /* renamed from: g  reason: collision with root package name */
    public int f9227g;

    /* renamed from: h  reason: collision with root package name */
    public int f9228h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f9229i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* renamed from: j  reason: collision with root package name */
    public int f9230j;

    public d(InputStream inputStream) {
        this.f = inputStream;
        this.f9225b = false;
    }

    public void a(int i2) {
        if (this.f9227g != i2) {
            throw new j("Protocol message end-group tag did not match expected tag.");
        }
    }

    public int b() {
        int i2 = this.f9229i;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.f9228h + this.f9226e);
    }

    public void c(int i2) {
        this.f9229i = i2;
        p();
    }

    public int d(int i2) {
        if (i2 >= 0) {
            int i3 = this.f9228h + this.f9226e + i2;
            int i4 = this.f9229i;
            if (i3 <= i4) {
                this.f9229i = i3;
                p();
                return i4;
            }
            throw j.d();
        }
        throw j.a();
    }

    public boolean e() {
        return m() != 0;
    }

    public c f() {
        int l2 = l();
        int i2 = this.c;
        int i3 = this.f9226e;
        if (l2 > i2 - i3 || l2 <= 0) {
            return l2 == 0 ? c.f9218h : new o(i(l2));
        }
        byte[] bArr = this.a;
        c cVar = c.f9218h;
        byte[] bArr2 = new byte[l2];
        System.arraycopy(bArr, i3, bArr2, 0, l2);
        o oVar = new o(bArr2);
        this.f9226e += l2;
        return oVar;
    }

    public int g() {
        return l();
    }

    public <T extends p> T h(r<T> rVar, f fVar) {
        int l2 = l();
        if (this.f9230j < 64) {
            int d2 = d(l2);
            this.f9230j++;
            T t = (p) rVar.a(this, fVar);
            a(0);
            this.f9230j--;
            this.f9229i = d2;
            p();
            return t;
        }
        throw j.b();
    }

    public final byte[] i(int i2) {
        if (i2 > 0) {
            int i3 = this.f9228h;
            int i4 = this.f9226e;
            int i5 = i3 + i4 + i2;
            int i6 = this.f9229i;
            if (i5 > i6) {
                s((i6 - i3) - i4);
                throw j.d();
            } else if (i2 < 4096) {
                byte[] bArr = new byte[i2];
                int i7 = this.c - i4;
                System.arraycopy(this.a, i4, bArr, 0, i7);
                int i8 = this.c;
                this.f9226e = i8;
                int i9 = i2 - i7;
                if (i8 - i8 >= i9 || t(i9)) {
                    System.arraycopy(this.a, 0, bArr, i7, i9);
                    this.f9226e = i9;
                    return bArr;
                }
                throw j.d();
            } else {
                int i10 = this.c;
                this.f9228h = i3 + i10;
                this.f9226e = 0;
                this.c = 0;
                int i11 = i10 - i4;
                int i12 = i2 - i11;
                ArrayList arrayList = new ArrayList();
                while (i12 > 0) {
                    int min = Math.min(i12, 4096);
                    byte[] bArr2 = new byte[min];
                    int i13 = 0;
                    while (i13 < min) {
                        InputStream inputStream = this.f;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i13, min - i13);
                        if (read != -1) {
                            this.f9228h += read;
                            i13 += read;
                        } else {
                            throw j.d();
                        }
                    }
                    i12 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(this.a, i4, bArr3, 0, i11);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byte[] bArr4 = (byte[]) it.next();
                    System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
                    i11 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i2 == 0) {
            return i.a;
        } else {
            throw j.a();
        }
    }

    public int j() {
        int i2 = this.f9226e;
        if (this.c - i2 < 4) {
            q(4);
            i2 = this.f9226e;
        }
        byte[] bArr = this.a;
        this.f9226e = i2 + 4;
        return ((bArr[i2 + 3] & ExifInterface.MARKER) << 24) | (bArr[i2] & ExifInterface.MARKER) | ((bArr[i2 + 1] & ExifInterface.MARKER) << 8) | ((bArr[i2 + 2] & ExifInterface.MARKER) << 16);
    }

    public long k() {
        int i2 = this.f9226e;
        if (this.c - i2 < 8) {
            q(8);
            i2 = this.f9226e;
        }
        byte[] bArr = this.a;
        this.f9226e = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int l() {
        /*
            r9 = this;
            int r0 = r9.f9226e
            int r1 = r9.c
            if (r1 != r0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            byte[] r2 = r9.a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.f9226e = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L_0x0082
        L_0x002d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003d:
            r1 = r3
            goto L_0x0082
        L_0x003f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0082
        L_0x007c:
            long r0 = r9.n()
            int r0 = (int) r0
            return r0
        L_0x0082:
            r9.f9226e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.h.d.l():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m() {
        /*
            r9 = this;
            int r0 = r9.f9226e
            int r1 = r9.c
            if (r1 != r0) goto L_0x0008
            goto L_0x00b8
        L_0x0008:
            byte[] r2 = r9.a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r9.f9226e = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b8
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x002b:
            long r2 = r3 ^ r5
            goto L_0x00bf
        L_0x002f:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0042
            r1 = 16256(0x3f80, double:8.0315E-320)
        L_0x003d:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bf
        L_0x0042:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x002b
        L_0x0052:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x003d
        L_0x0063:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x002b
        L_0x0076:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003d
        L_0x0089:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x002b
        L_0x009c:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bd
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00b8:
            long r0 = r9.n()
            return r0
        L_0x00bd:
            r1 = r0
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r9.f9226e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.h.d.m():long");
    }

    public long n() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f9226e == this.c) {
                q(1);
            }
            byte[] bArr = this.a;
            int i3 = this.f9226e;
            this.f9226e = i3 + 1;
            byte b2 = bArr[i3];
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i2;
            if ((b2 & 128) == 0) {
                return j2;
            }
        }
        throw new j("CodedInputStream encountered a malformed varint.");
    }

    public int o() {
        boolean z = true;
        if (this.f9226e != this.c || t(1)) {
            z = false;
        }
        if (z) {
            this.f9227g = 0;
            return 0;
        }
        int l2 = l();
        this.f9227g = l2;
        if ((l2 >>> 3) != 0) {
            return l2;
        }
        throw new j("Protocol message contained an invalid tag (zero).");
    }

    public final void p() {
        int i2 = this.c + this.d;
        this.c = i2;
        int i3 = this.f9228h + i2;
        int i4 = this.f9229i;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.d = i5;
            this.c = i2 - i5;
            return;
        }
        this.d = 0;
    }

    public final void q(int i2) {
        if (!t(i2)) {
            throw j.d();
        }
    }

    public boolean r(int i2, e eVar) {
        int o2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            long m2 = m();
            eVar.y(i2);
            eVar.z(m2);
            return true;
        } else if (i3 == 1) {
            long k2 = k();
            eVar.y(i2);
            eVar.x(k2);
            return true;
        } else if (i3 == 2) {
            c f2 = f();
            eVar.y(i2);
            eVar.m(f2);
            return true;
        } else if (i3 == 3) {
            eVar.y(i2);
            do {
                o2 = o();
                if (o2 == 0 || !r(o2, eVar)) {
                    int i4 = ((i2 >>> 3) << 3) | 4;
                    a(i4);
                    eVar.y(i4);
                }
                o2 = o();
                break;
            } while (!r(o2, eVar));
            int i42 = ((i2 >>> 3) << 3) | 4;
            a(i42);
            eVar.y(i42);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                int j2 = j();
                eVar.y(i2);
                eVar.w(j2);
                return true;
            }
            throw new j("Protocol message tag had invalid wire type.");
        }
    }

    public void s(int i2) {
        int i3 = this.c;
        int i4 = this.f9226e;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.f9226e = i4 + i2;
        } else if (i2 >= 0) {
            int i5 = this.f9228h;
            int i6 = i5 + i4 + i2;
            int i7 = this.f9229i;
            if (i6 <= i7) {
                int i8 = i3 - i4;
                this.f9226e = i3;
                while (true) {
                    q(1);
                    int i9 = i2 - i8;
                    int i10 = this.c;
                    if (i9 > i10) {
                        i8 += i10;
                        this.f9226e = i10;
                    } else {
                        this.f9226e = i9;
                        return;
                    }
                }
            } else {
                s((i7 - i5) - i4);
                throw j.d();
            }
        } else {
            throw j.a();
        }
    }

    public final boolean t(int i2) {
        int i3 = this.f9226e;
        int i4 = i3 + i2;
        int i5 = this.c;
        if (i4 > i5) {
            if (this.f9228h + i3 + i2 <= this.f9229i && this.f != null) {
                if (i3 > 0) {
                    if (i5 > i3) {
                        byte[] bArr = this.a;
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.f9228h += i3;
                    this.c -= i3;
                    this.f9226e = 0;
                }
                InputStream inputStream = this.f;
                byte[] bArr2 = this.a;
                int i6 = this.c;
                int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                if (read == 0 || read < -1 || read > this.a.length) {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read > 0) {
                    this.c += read;
                    if ((this.f9228h + i2) - 67108864 <= 0) {
                        p();
                        if (this.c >= i2) {
                            return true;
                        }
                        return t(i2);
                    }
                    throw new j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i2);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }
}
