package b.l.a.c.f.e;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;

public final class vm {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public wm f3363b;
    public final byte[] c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f3364e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f3365g;

    /* renamed from: h  reason: collision with root package name */
    public int f3366h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    public /* synthetic */ vm(byte[] bArr, int i2) {
        this.c = bArr;
        this.d = i2;
        this.f = 0;
    }

    public static int n(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long o(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public final int a() {
        if (k()) {
            this.f3365g = 0;
            return 0;
        }
        int e2 = e();
        this.f3365g = e2;
        if ((e2 >>> 3) != 0) {
            return e2;
        }
        throw l.d();
    }

    public final void b(int i2) {
        if (this.f3365g != i2) {
            throw l.e();
        }
    }

    public final boolean c(int i2) {
        int a2;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.d - this.f >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.c;
                    int i5 = this.f;
                    this.f = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw l.c();
            }
            while (i4 < 10) {
                if (l() < 0) {
                    i4++;
                }
            }
            throw l.c();
            return true;
        } else if (i3 == 1) {
            m(8);
            return true;
        } else if (i3 == 2) {
            m(e());
            return true;
        } else if (i3 == 3) {
            do {
                a2 = a();
                if (a2 == 0 || !c(a2)) {
                    b(((i2 >>> 3) << 3) | 4);
                }
                a2 = a();
                break;
            } while (!c(a2));
            b(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                m(4);
                return true;
            }
            int i6 = l.f3117h;
            throw new k();
        }
    }

    public final boolean d() {
        return f() != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r5 = this;
            int r0 = r5.f
            int r1 = r5.d
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.c
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f = r1
            return r0
        L_0x006c:
            long r0 = r5.g()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.vm.e():int");
    }

    public final long f() {
        long j2;
        long j3;
        long j4;
        long j5;
        byte b2;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            byte[] bArr = this.c;
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                this.f = i4;
                return (long) b3;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                byte b4 = b3 ^ (bArr[i4] << 7);
                if (b4 < 0) {
                    b2 = b4 ^ Byte.MIN_VALUE;
                } else {
                    int i6 = i5 + 1;
                    byte b5 = b4 ^ (bArr[i5] << 14);
                    if (b5 >= 0) {
                        j3 = (long) (b5 ^ 16256);
                    } else {
                        i5 = i6 + 1;
                        byte b6 = b5 ^ (bArr[i6] << 21);
                        if (b6 < 0) {
                            b2 = b6 ^ -2080896;
                        } else {
                            i6 = i5 + 1;
                            long j6 = (((long) bArr[i5]) << 28) ^ ((long) b6);
                            if (j6 >= 0) {
                                j5 = 266354560;
                            } else {
                                int i7 = i6 + 1;
                                long j7 = j6 ^ (((long) bArr[i6]) << 35);
                                if (j7 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i6 = i7 + 1;
                                    j6 = j7 ^ (((long) bArr[i7]) << 42);
                                    if (j6 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i7 = i6 + 1;
                                        j7 = j6 ^ (((long) bArr[i6]) << 49);
                                        if (j7 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i7 + 1;
                                            j3 = (j7 ^ (((long) bArr[i7]) << 56)) ^ 71499008037633920L;
                                            if (j3 < 0) {
                                                i7 = i6 + 1;
                                                if (((long) bArr[i6]) >= 0) {
                                                    j2 = j3;
                                                    i5 = i7;
                                                    this.f = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j4 ^ j7;
                                i5 = i7;
                                this.f = i5;
                                return j2;
                            }
                            j3 = j6 ^ j5;
                        }
                    }
                    i5 = i6;
                    j2 = j3;
                    this.f = i5;
                    return j2;
                }
                j2 = (long) b2;
                this.f = i5;
                return j2;
            }
        }
        return g();
    }

    public final long g() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte l2 = l();
            j2 |= ((long) (l2 & Byte.MAX_VALUE)) << i2;
            if ((l2 & 128) == 0) {
                return j2;
            }
        }
        throw l.c();
    }

    public final int h() {
        int i2 = this.f;
        if (this.d - i2 >= 4) {
            byte[] bArr = this.c;
            this.f = i2 + 4;
            return ((bArr[i2 + 3] & ExifInterface.MARKER) << 24) | (bArr[i2] & ExifInterface.MARKER) | ((bArr[i2 + 1] & ExifInterface.MARKER) << 8) | ((bArr[i2 + 2] & ExifInterface.MARKER) << 16);
        }
        throw l.a();
    }

    public final long i() {
        int i2 = this.f;
        if (this.d - i2 >= 8) {
            byte[] bArr = this.c;
            this.f = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw l.a();
    }

    public final int j(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.f;
            int i4 = this.f3366h;
            if (i3 <= i4) {
                this.f3366h = i3;
                p();
                return i4;
            }
            throw l.a();
        }
        throw l.b();
    }

    public final boolean k() {
        return this.f == this.d;
    }

    public final byte l() {
        int i2 = this.f;
        if (i2 != this.d) {
            byte[] bArr = this.c;
            this.f = i2 + 1;
            return bArr[i2];
        }
        throw l.a();
    }

    public final void m(int i2) {
        if (i2 >= 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (i2 <= i3 - i4) {
                this.f = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw l.b();
        }
        throw l.a();
    }

    public final void p() {
        int i2 = this.d + this.f3364e;
        this.d = i2;
        int i3 = this.f3366h;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f3364e = i4;
            this.d = i2 - i4;
            return;
        }
        this.f3364e = 0;
    }
}
