package b.l.a.c.f.i;

import java.util.Arrays;

public final class o7 {
    public static final o7 f = new o7(0, new int[0], new Object[0], false);
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f3675b;
    public Object[] c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3676e;

    public o7() {
        this(0, new int[8], new Object[8], true);
    }

    public o7(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i2;
        this.f3675b = iArr;
        this.c = objArr;
        this.f3676e = z;
    }

    public static o7 a() {
        return new o7(0, new int[8], new Object[8], true);
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
            int i8 = this.f3675b[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 == 1) {
                    ((Long) this.c[i7]).longValue();
                    i4 = y4.u(i9 << 3) + 8;
                } else if (i10 == 2) {
                    int u = y4.u(i9 << 3);
                    int l2 = ((t4) this.c[i7]).l();
                    i6 = y4.u(l2) + l2 + u + i6;
                } else if (i10 == 3) {
                    int s = y4.s(i9);
                    i3 = s + s;
                    i2 = ((o7) this.c[i7]).b();
                } else if (i10 == 5) {
                    ((Integer) this.c[i7]).intValue();
                    i4 = y4.u(i9 << 3) + 4;
                } else {
                    int i11 = y5.f3814h;
                    throw new IllegalStateException(new x5());
                }
                i6 = i4 + i6;
            } else {
                long longValue = ((Long) this.c[i7]).longValue();
                i3 = y4.u(i9 << 3);
                i2 = y4.v(longValue);
            }
            i6 = i2 + i3 + i6;
        }
        this.d = i6;
        return i6;
    }

    public final void c(int i2, Object obj) {
        if (this.f3676e) {
            int i3 = this.a;
            int[] iArr = this.f3675b;
            if (i3 == iArr.length) {
                int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
                this.f3675b = Arrays.copyOf(iArr, i4);
                this.c = Arrays.copyOf(this.c, i4);
            }
            int[] iArr2 = this.f3675b;
            int i5 = this.a;
            iArr2[i5] = i2;
            this.c[i5] = obj;
            this.a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(z4 z4Var) {
        if (this.a != 0) {
            for (int i2 = 0; i2 < this.a; i2++) {
                int i3 = this.f3675b[i2];
                Object obj = this.c[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    z4Var.a.h(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    z4Var.a.i(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    z4Var.a.l(i4, (t4) obj);
                } else if (i5 == 3) {
                    z4Var.a.d(i4, 3);
                    ((o7) obj).d(z4Var);
                    z4Var.a.d(i4, 4);
                } else if (i5 == 5) {
                    z4Var.a.g(i4, ((Integer) obj).intValue());
                } else {
                    int i6 = y5.f3814h;
                    throw new RuntimeException(new x5());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        int i2 = this.a;
        if (i2 == o7Var.a) {
            int[] iArr = this.f3675b;
            int[] iArr2 = o7Var.f3675b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = o7Var.c;
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
        int[] iArr = this.f3675b;
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
