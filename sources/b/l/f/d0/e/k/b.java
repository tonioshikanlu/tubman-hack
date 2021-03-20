package b.l.f.d0.e.k;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f5677e = new b(929, 3);
    public final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5678b;
    public final c c;
    public final c d;

    public b(int i2, int i3) {
        this.a = new int[i2];
        this.f5678b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.a[i5] = i4;
            i4 = (i4 * i3) % i2;
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f5678b[this.a[i6]] = i6;
        }
        this.c = new c(this, new int[]{0});
        this.d = new c(this, new int[]{1});
    }

    public int a(int i2, int i3) {
        return (i2 + i3) % 929;
    }

    public c b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.c;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new c(this, iArr);
        }
    }

    public int c(int i2) {
        if (i2 != 0) {
            return this.a[(929 - this.f5678b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    public int d(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.f5678b;
        return iArr[(iArr2[i2] + iArr2[i3]) % 928];
    }

    public int e(int i2, int i3) {
        return ((i2 + 929) - i3) % 929;
    }
}
