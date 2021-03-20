package b.l.a.c.f.e;

import java.util.Arrays;

public final class d1 {
    public static final d1 f = new d1(0, new int[0], new Object[0], false);
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2903b;
    public Object[] c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2904e;

    public d1() {
        this(0, new int[8], new Object[8], true);
    }

    public d1(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i2;
        this.f2903b = iArr;
        this.c = objArr;
        this.f2904e = z;
    }

    public static d1 a() {
        return new d1(0, new int[8], new Object[8], true);
    }

    public final int b() {
        int i2;
        int i3;
        int i4;
        int i5 = this.d;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.a; i7++) {
            int i8 = this.f2903b[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 == 1) {
                    ((Long) this.c[i7]).longValue();
                    i4 = bn.B(i9) + 8;
                } else if (i10 == 2) {
                    int B = bn.B(i9);
                    int l2 = ((um) this.c[i7]).l();
                    i6 = bn.b(l2) + l2 + B + i6;
                } else if (i10 == 3) {
                    int B2 = bn.B(i9);
                    i3 = B2 + B2;
                    i2 = ((d1) this.c[i7]).b();
                } else if (i10 == 5) {
                    ((Integer) this.c[i7]).intValue();
                    i4 = bn.B(i9) + 4;
                } else {
                    int i11 = l.f3117h;
                    throw new IllegalStateException(new k());
                }
                i6 = i4 + i6;
            } else {
                long longValue = ((Long) this.c[i7]).longValue();
                i3 = bn.B(i9);
                i2 = bn.c(longValue);
            }
            i6 = i2 + i3 + i6;
        }
        this.d = i6;
        return i6;
    }

    public final void c(int i2, Object obj) {
        if (this.f2904e) {
            int i3 = this.a;
            int[] iArr = this.f2903b;
            if (i3 == iArr.length) {
                int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
                this.f2903b = Arrays.copyOf(iArr, i4);
                this.c = Arrays.copyOf(this.c, i4);
            }
            int[] iArr2 = this.f2903b;
            int i5 = this.a;
            iArr2[i5] = i2;
            this.c[i5] = obj;
            this.a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(cn cnVar) {
        if (this.a != 0) {
            for (int i2 = 0; i2 < this.a; i2++) {
                int i3 = this.f2903b[i2];
                Object obj = this.c[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    cnVar.a.o(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    cnVar.a.q(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    cnVar.a.t(i4, (um) obj);
                } else if (i5 == 3) {
                    cnVar.a.k(i4, 3);
                    ((d1) obj).d(cnVar);
                    cnVar.a.k(i4, 4);
                } else if (i5 == 5) {
                    cnVar.a.n(i4, ((Integer) obj).intValue());
                } else {
                    int i6 = l.f3117h;
                    throw new RuntimeException(new k());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        int i2 = this.a;
        if (i2 == d1Var.a) {
            int[] iArr = this.f2903b;
            int[] iArr2 = d1Var.f2903b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = d1Var.c;
                    int i4 = this.a;
                    int i5 = 0;
                    while (i5 < i4) {
                        if (objArr[i5].equals(objArr2[i5])) {
                            i5++;
                        }
                    }
                    return true;
                } else if (iArr[i3] != iArr2[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f2903b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.c;
        int i8 = this.a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
