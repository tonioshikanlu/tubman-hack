package b.j.a.b.u;

import b.j.a.b.w.g;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class a {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<C0047a> f1514b;
    public final int c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1515e;
    public int[] f;

    /* renamed from: g  reason: collision with root package name */
    public int f1516g;

    /* renamed from: h  reason: collision with root package name */
    public int f1517h;

    /* renamed from: i  reason: collision with root package name */
    public int f1518i;

    /* renamed from: j  reason: collision with root package name */
    public int f1519j;

    /* renamed from: k  reason: collision with root package name */
    public int f1520k;

    /* renamed from: l  reason: collision with root package name */
    public String[] f1521l;

    /* renamed from: m  reason: collision with root package name */
    public int f1522m;

    /* renamed from: n  reason: collision with root package name */
    public int f1523n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1524o;

    /* renamed from: b.j.a.b.u.a$a  reason: collision with other inner class name */
    public static final class C0047a {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1525b;
        public final int c;
        public final int[] d;

        /* renamed from: e  reason: collision with root package name */
        public final String[] f1526e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final int f1527g;

        public C0047a(int i2, int i3, int i4, int[] iArr, String[] strArr, int i5, int i6) {
            this.a = i2;
            this.f1525b = i3;
            this.c = i4;
            this.d = iArr;
            this.f1526e = strArr;
            this.f = i5;
            this.f1527g = i6;
        }

        public C0047a(a aVar) {
            this.a = aVar.f1516g;
            this.f1525b = aVar.f1520k;
            this.c = aVar.f1519j;
            this.d = aVar.f;
            this.f1526e = aVar.f1521l;
            this.f = aVar.f1522m;
            this.f1527g = aVar.f1523n;
        }

        public static C0047a a(int i2) {
            int i3 = i2 << 3;
            return new C0047a(i2, 0, a.b(i2), new int[i3], new String[(i2 << 1)], i3 - i2, i3);
        }
    }

    public a(int i2, boolean z, int i3, boolean z2) {
        this.a = null;
        this.c = i3;
        this.d = z;
        this.f1515e = z2;
        int i4 = 16;
        if (i2 >= 16) {
            if (((i2 - 1) & i2) != 0) {
                while (i4 < i2) {
                    i4 += i4;
                }
            }
            this.f1514b = new AtomicReference<>(C0047a.a(i2));
        }
        i2 = i4;
        this.f1514b = new AtomicReference<>(C0047a.a(i2));
    }

    public a(a aVar, boolean z, int i2, boolean z2, C0047a aVar2) {
        this.a = aVar;
        this.c = i2;
        this.d = z;
        this.f1515e = z2;
        this.f1514b = null;
        this.f1520k = aVar2.f1525b;
        int i3 = aVar2.a;
        this.f1516g = i3;
        int i4 = i3 << 2;
        this.f1517h = i4;
        this.f1518i = i4 + (i4 >> 1);
        this.f1519j = aVar2.c;
        this.f = aVar2.d;
        this.f1521l = aVar2.f1526e;
        this.f1522m = aVar2.f;
        this.f1523n = aVar2.f1527g;
        this.f1524o = true;
    }

    public static int b(int i2) {
        int i3 = i2 >> 2;
        if (i3 < 64) {
            return 4;
        }
        if (i3 <= 256) {
            return 5;
        }
        return i3 <= 1024 ? 6 : 7;
    }

    public final int a(int i2) {
        return (i2 & (this.f1516g - 1)) << 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(int r12) {
        /*
            r11 = this;
            int r0 = r11.f1516g
            int r1 = r0 + -1
            r1 = r1 & r12
            int r1 = r1 << 2
            int[] r2 = r11.f
            int r3 = r1 + 3
            r3 = r2[r3]
            if (r3 != 0) goto L_0x0010
            return r1
        L_0x0010:
            int r3 = r11.f1520k
            r4 = 1
            int r0 = r0 >> r4
            if (r3 <= r0) goto L_0x0037
            int r0 = r11.f1522m
            int r3 = r11.e()
            int r0 = r0 - r3
            int r0 = r0 >> 2
            int r3 = r11.f1520k
            int r5 = r3 + 1
            int r5 = r5 >> 7
            if (r0 > r5) goto L_0x0035
            double r5 = (double) r3
            int r0 = r11.f1516g
            double r7 = (double) r0
            r9 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r7 = r7 * r9
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
        L_0x0035:
            r0 = r4
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 == 0) goto L_0x003f
            int r12 = r11.d(r12)
            return r12
        L_0x003f:
            int r0 = r11.f1517h
            int r3 = r1 >> 3
            int r3 = r3 << 2
            int r0 = r0 + r3
            int r3 = r0 + 3
            r3 = r2[r3]
            if (r3 != 0) goto L_0x004d
            return r0
        L_0x004d:
            int r0 = r11.f1518i
            int r3 = r11.f1519j
            int r5 = r3 + 2
            int r1 = r1 >> r5
            int r1 = r1 << r3
            int r0 = r0 + r1
            int r1 = r4 << r3
            int r1 = r1 + r0
        L_0x0059:
            if (r0 >= r1) goto L_0x0065
            int r3 = r0 + 3
            r3 = r2[r3]
            if (r3 != 0) goto L_0x0062
            return r0
        L_0x0062:
            int r0 = r0 + 4
            goto L_0x0059
        L_0x0065:
            int r0 = r11.f1522m
            int r1 = r0 + 4
            r11.f1522m = r1
            int r2 = r11.f1516g
            int r3 = r2 << 3
            if (r1 < r3) goto L_0x00a9
            boolean r0 = r11.f1515e
            if (r0 == 0) goto L_0x00a4
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 > r0) goto L_0x007a
            goto L_0x00a4
        L_0x007a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Spill-over slots in symbol table with "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            int r1 = r11.f1520k
            r0.append(r1)
            java.lang.String r1 = " entries, hash area of "
            r0.append(r1)
            int r1 = r11.f1516g
            r0.append(r1)
            java.lang.String r1 = " slots is now full (all "
            r0.append(r1)
            int r1 = r11.f1516g
            int r1 = r1 >> 3
            java.lang.String r2 = " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"
            java.lang.String r0 = b.e.a.a.a.o(r0, r1, r2)
            r12.<init>(r0)
            throw r12
        L_0x00a4:
            int r12 = r11.d(r12)
            return r12
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.u.a.c(int):int");
    }

    public final int d(int i2) {
        this.f1524o = false;
        int[] iArr = this.f;
        String[] strArr = this.f1521l;
        int i3 = this.f1516g;
        int i4 = this.f1520k;
        int i5 = i3 + i3;
        int i6 = this.f1522m;
        if (i5 > 65536) {
            o(true);
        } else {
            this.f = new int[(iArr.length + (i3 << 3))];
            this.f1516g = i5;
            int i7 = i5 << 2;
            this.f1517h = i7;
            this.f1518i = i7 + (i7 >> 1);
            this.f1519j = b(i5);
            this.f1521l = new String[(strArr.length << 1)];
            o(false);
            int[] iArr2 = new int[16];
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9 += 4) {
                int i10 = iArr[i9 + 3];
                if (i10 != 0) {
                    i8++;
                    String str = strArr[i9 >> 2];
                    if (i10 == 1) {
                        iArr2[0] = iArr[i9];
                        g(str, iArr2, 1);
                    } else if (i10 == 2) {
                        iArr2[0] = iArr[i9];
                        iArr2[1] = iArr[i9 + 1];
                        g(str, iArr2, 2);
                    } else if (i10 != 3) {
                        if (i10 > iArr2.length) {
                            iArr2 = new int[i10];
                        }
                        System.arraycopy(iArr, iArr[i9 + 1], iArr2, 0, i10);
                        g(str, iArr2, i10);
                    } else {
                        iArr2[0] = iArr[i9];
                        iArr2[1] = iArr[i9 + 1];
                        iArr2[2] = iArr[i9 + 2];
                        g(str, iArr2, 3);
                    }
                }
            }
            if (i8 != i4) {
                throw new IllegalStateException(b.e.a.a.a.i("Failed rehash(): old count=", i4, ", copyCount=", i8));
            }
        }
        int i11 = (i2 & (this.f1516g - 1)) << 2;
        int[] iArr3 = this.f;
        if (iArr3[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.f1517h + ((i11 >> 3) << 2);
        if (iArr3[i12 + 3] == 0) {
            return i12;
        }
        int i13 = this.f1518i;
        int i14 = this.f1519j;
        int i15 = i13 + ((i11 >> (i14 + 2)) << i14);
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            if (iArr3[i15 + 3] == 0) {
                return i15;
            }
            i15 += 4;
        }
        int i17 = this.f1522m;
        this.f1522m = i17 + 4;
        return i17;
    }

    public final int e() {
        int i2 = this.f1516g;
        return (i2 << 3) - i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r8 = r3 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r7[r3] == r0[r9]) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r3 = r8 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r7[r8] == r0[r9]) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r8 = r3 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7[r3] == r0[r9]) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r9 = r8 + 1;
        r3 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r7[r8] == r0[r4]) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r8 = r9 + 1;
        r4 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r7[r9] == r0[r3]) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (r7[r8] == r0[r4]) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r3 = r8 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r7[r8] == r0[r9]) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(int[] r7, int r8, int r9) {
        /*
            r6 = this;
            int[] r0 = r6.f
            r1 = 0
            r2 = 1
            switch(r8) {
                case 4: goto L_0x003f;
                case 5: goto L_0x0031;
                case 6: goto L_0x0023;
                case 7: goto L_0x0015;
                case 8: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0069
        L_0x0009:
            r8 = r7[r1]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x0012
            return r1
        L_0x0012:
            r8 = r2
            r9 = r3
            goto L_0x0016
        L_0x0015:
            r8 = r1
        L_0x0016:
            int r3 = r8 + 1
            r8 = r7[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x0021
            return r1
        L_0x0021:
            r9 = r4
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            int r8 = r3 + 1
            r3 = r7[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L_0x002f
            return r1
        L_0x002f:
            r9 = r4
            goto L_0x0032
        L_0x0031:
            r8 = r1
        L_0x0032:
            int r3 = r8 + 1
            r8 = r7[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x003d
            return r1
        L_0x003d:
            r9 = r4
            goto L_0x0040
        L_0x003f:
            r3 = r1
        L_0x0040:
            int r8 = r3 + 1
            r3 = r7[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L_0x004b
            return r1
        L_0x004b:
            int r9 = r8 + 1
            r8 = r7[r8]
            int r3 = r4 + 1
            r4 = r0[r4]
            if (r8 == r4) goto L_0x0056
            return r1
        L_0x0056:
            int r8 = r9 + 1
            r9 = r7[r9]
            int r4 = r3 + 1
            r3 = r0[r3]
            if (r9 == r3) goto L_0x0061
            return r1
        L_0x0061:
            r7 = r7[r8]
            r8 = r0[r4]
            if (r7 == r8) goto L_0x0068
            return r1
        L_0x0068:
            return r2
        L_0x0069:
            r0 = r1
        L_0x006a:
            int r3 = r0 + 1
            r0 = r7[r0]
            int[] r4 = r6.f
            int r5 = r9 + 1
            r9 = r4[r9]
            if (r0 == r9) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            if (r3 < r8) goto L_0x007b
            r1 = r2
        L_0x007a:
            return r1
        L_0x007b:
            r0 = r3
            r9 = r5
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.u.a.f(int[], int, int):boolean");
    }

    public String g(String str, int[] iArr, int i2) {
        int i3;
        if (this.f1524o) {
            int[] iArr2 = this.f;
            this.f = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this.f1521l;
            this.f1521l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f1524o = false;
        }
        if (this.d) {
            str = g.f1569i.a(str);
        }
        if (i2 == 1) {
            int i4 = iArr[0] ^ this.c;
            int i5 = i4 + (i4 >>> 16);
            int i6 = i5 ^ (i5 << 3);
            i3 = c(i6 + (i6 >>> 12));
            int[] iArr3 = this.f;
            iArr3[i3] = iArr[0];
            iArr3[i3 + 3] = 1;
        } else if (i2 == 2) {
            i3 = c(h(iArr[0], iArr[1]));
            int[] iArr4 = this.f;
            iArr4[i3] = iArr[0];
            iArr4[i3 + 1] = iArr[1];
            iArr4[i3 + 3] = 2;
        } else if (i2 != 3) {
            int j2 = j(iArr, i2);
            i3 = c(j2);
            int[] iArr5 = this.f;
            iArr5[i3] = j2;
            int i7 = this.f1523n;
            int i8 = i7 + i2;
            if (i8 > iArr5.length) {
                int length = i8 - iArr5.length;
                int min = Math.min(4096, this.f1516g);
                this.f = Arrays.copyOf(this.f, Math.max(length, min) + this.f.length);
            }
            System.arraycopy(iArr, 0, this.f, i7, i2);
            this.f1523n += i2;
            int[] iArr6 = this.f;
            iArr6[i3 + 1] = i7;
            iArr6[i3 + 3] = i2;
        } else {
            i3 = c(i(iArr[0], iArr[1], iArr[2]));
            int[] iArr7 = this.f;
            iArr7[i3] = iArr[0];
            iArr7[i3 + 1] = iArr[1];
            iArr7[i3 + 2] = iArr[2];
            iArr7[i3 + 3] = 3;
        }
        this.f1521l[i3 >> 2] = str;
        this.f1520k++;
        return str;
    }

    public int h(int i2, int i3) {
        int i4 = i2 + (i2 >>> 15);
        int i5 = this.c ^ ((i3 * 33) + (i4 ^ (i4 >>> 9)));
        int i6 = i5 + (i5 >>> 16);
        int i7 = i6 ^ (i6 >>> 4);
        return i7 + (i7 << 3);
    }

    public int i(int i2, int i3, int i4) {
        int i5 = i2 ^ this.c;
        int i6 = (((i5 + (i5 >>> 9)) * 31) + i3) * 33;
        int i7 = (i6 + (i6 >>> 15)) ^ i4;
        int i8 = i7 + (i7 >>> 4);
        int i9 = i8 + (i8 >>> 15);
        return i9 ^ (i9 << 9);
    }

    public int j(int[] iArr, int i2) {
        if (i2 >= 4) {
            int i3 = iArr[0] ^ this.c;
            int i4 = i3 + (i3 >>> 9) + iArr[1];
            int i5 = ((i4 + (i4 >>> 15)) * 33) ^ iArr[2];
            int i6 = i5 + (i5 >>> 4);
            for (int i7 = 3; i7 < i2; i7++) {
                int i8 = iArr[i7];
                i6 += i8 ^ (i8 >> 21);
            }
            int i9 = i6 * 65599;
            int i10 = i9 + (i9 >>> 19);
            return (i10 << 5) ^ i10;
        }
        throw new IllegalArgumentException();
    }

    public String k(int i2) {
        int i3 = this.c ^ i2;
        int i4 = i3 + (i3 >>> 16);
        int i5 = i4 ^ (i4 << 3);
        int a2 = a(i5 + (i5 >>> 12));
        int[] iArr = this.f;
        int i6 = iArr[a2 + 3];
        if (i6 == 1) {
            if (iArr[a2] == i2) {
                return this.f1521l[a2 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this.f1517h + ((a2 >> 3) << 2);
        int i8 = iArr[i7 + 3];
        if (i8 == 1) {
            if (iArr[i7] == i2) {
                return this.f1521l[i7 >> 2];
            }
        } else if (i8 == 0) {
            return null;
        }
        int i9 = this.f1518i;
        int i10 = this.f1519j;
        int i11 = i9 + ((a2 >> (i10 + 2)) << i10);
        int i12 = (1 << i10) + i11;
        while (i11 < i12) {
            int i13 = iArr[i11 + 3];
            if (i2 == iArr[i11] && 1 == i13) {
                return this.f1521l[i11 >> 2];
            }
            if (i13 == 0) {
                return null;
            }
            i11 += 4;
        }
        for (int e2 = e(); e2 < this.f1522m; e2 += 4) {
            if (i2 == iArr[e2] && 1 == iArr[e2 + 3]) {
                return this.f1521l[e2 >> 2];
            }
        }
        return null;
    }

    public String l(int i2, int i3) {
        int a2 = a(h(i2, i3));
        int[] iArr = this.f;
        int i4 = iArr[a2 + 3];
        if (i4 == 2) {
            if (i2 == iArr[a2] && i3 == iArr[a2 + 1]) {
                return this.f1521l[a2 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.f1517h + ((a2 >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 2) {
            if (i2 == iArr[i5] && i3 == iArr[i5 + 1]) {
                return this.f1521l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this.f1518i;
        int i8 = this.f1519j;
        int i9 = i7 + ((a2 >> (i8 + 2)) << i8);
        int i10 = (1 << i8) + i9;
        while (i9 < i10) {
            int i11 = iArr[i9 + 3];
            if (i2 == iArr[i9] && i3 == iArr[i9 + 1] && 2 == i11) {
                return this.f1521l[i9 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        for (int e2 = e(); e2 < this.f1522m; e2 += 4) {
            if (i2 == iArr[e2] && i3 == iArr[e2 + 1] && 2 == iArr[e2 + 3]) {
                return this.f1521l[e2 >> 2];
            }
        }
        return null;
    }

    public String m(int i2, int i3, int i4) {
        int a2 = a(i(i2, i3, i4));
        int[] iArr = this.f;
        int i5 = iArr[a2 + 3];
        if (i5 == 3) {
            if (i2 == iArr[a2] && iArr[a2 + 1] == i3 && iArr[a2 + 2] == i4) {
                return this.f1521l[a2 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.f1517h + ((a2 >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 3) {
            if (i2 == iArr[i6] && iArr[i6 + 1] == i3 && iArr[i6 + 2] == i4) {
                return this.f1521l[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        int i8 = this.f1518i;
        int i9 = this.f1519j;
        int i10 = i8 + ((a2 >> (i9 + 2)) << i9);
        int i11 = (1 << i9) + i10;
        while (i10 < i11) {
            int i12 = iArr[i10 + 3];
            if (i2 == iArr[i10] && i3 == iArr[i10 + 1] && i4 == iArr[i10 + 2] && 3 == i12) {
                return this.f1521l[i10 >> 2];
            }
            if (i12 == 0) {
                return null;
            }
            i10 += 4;
        }
        for (int e2 = e(); e2 < this.f1522m; e2 += 4) {
            if (i2 == iArr[e2] && i3 == iArr[e2 + 1] && i4 == iArr[e2 + 2] && 3 == iArr[e2 + 3]) {
                return this.f1521l[e2 >> 2];
            }
        }
        return null;
    }

    public String n(int[] iArr, int i2) {
        if (i2 >= 4) {
            int j2 = j(iArr, i2);
            int a2 = a(j2);
            int[] iArr2 = this.f;
            int i3 = iArr2[a2 + 3];
            if (j2 == iArr2[a2] && i3 == i2 && f(iArr, i2, iArr2[a2 + 1])) {
                return this.f1521l[a2 >> 2];
            }
            if (i3 == 0) {
                return null;
            }
            int i4 = this.f1517h + ((a2 >> 3) << 2);
            int i5 = iArr2[i4 + 3];
            if (j2 == iArr2[i4] && i5 == i2 && f(iArr, i2, iArr2[i4 + 1])) {
                return this.f1521l[i4 >> 2];
            }
            int i6 = this.f1518i;
            int i7 = this.f1519j;
            int i8 = i6 + ((a2 >> (i7 + 2)) << i7);
            int[] iArr3 = this.f;
            int i9 = (1 << i7) + i8;
            while (i8 < i9) {
                int i10 = iArr3[i8 + 3];
                if (j2 == iArr3[i8] && i2 == i10 && f(iArr, i2, iArr3[i8 + 1])) {
                    return this.f1521l[i8 >> 2];
                }
                if (i10 == 0) {
                    return null;
                }
                i8 += 4;
            }
            for (int e2 = e(); e2 < this.f1522m; e2 += 4) {
                if (j2 == iArr3[e2] && i2 == iArr3[e2 + 3] && f(iArr, i2, iArr3[e2 + 1])) {
                    return this.f1521l[e2 >> 2];
                }
            }
            return null;
        } else if (i2 == 1) {
            return k(iArr[0]);
        } else {
            if (i2 != 2) {
                return i2 != 3 ? "" : m(iArr[0], iArr[1], iArr[2]);
            }
            return l(iArr[0], iArr[1]);
        }
    }

    public final void o(boolean z) {
        this.f1520k = 0;
        this.f1522m = e();
        this.f1523n = this.f1516g << 3;
        if (z) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.f1521l, (Object) null);
        }
    }

    public String toString() {
        int i2 = this.f1517h;
        int i3 = 0;
        for (int i4 = 3; i4 < i2; i4 += 4) {
            if (this.f[i4] != 0) {
                i3++;
            }
        }
        int i5 = this.f1518i;
        int i6 = 0;
        for (int i7 = this.f1517h + 3; i7 < i5; i7 += 4) {
            if (this.f[i7] != 0) {
                i6++;
            }
        }
        int i8 = this.f1518i + 3;
        int i9 = this.f1516g + i8;
        int i10 = 0;
        while (i8 < i9) {
            if (this.f[i8] != 0) {
                i10++;
            }
            i8 += 4;
        }
        int e2 = (this.f1522m - e()) >> 2;
        int i11 = this.f1516g << 3;
        int i12 = 0;
        for (int i13 = 3; i13 < i11; i13 += 4) {
            if (this.f[i13] != 0) {
                i12++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[]{a.class.getName(), Integer.valueOf(this.f1520k), Integer.valueOf(this.f1516g), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(e2), Integer.valueOf(i3 + i6 + i10 + e2), Integer.valueOf(i12)});
    }
}
