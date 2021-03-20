package b.p.b.a0.j;

public final class t {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f6593b;
    public int c;
    public final int[] d = new int[10];

    public int a(int i2) {
        boolean z = true;
        int i3 = 1 << i2;
        int i4 = (this.c & i3) != 0 ? 2 : 0;
        if ((i3 & this.f6593b) == 0) {
            z = false;
        }
        return z ? i4 | 1 : i4;
    }

    public int b(int i2) {
        return (this.a & 128) != 0 ? this.d[7] : i2;
    }

    public boolean c(int i2) {
        return ((1 << i2) & this.a) != 0;
    }

    public t d(int i2, int i3, int i4) {
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            return this;
        }
        int i5 = 1 << i2;
        this.a |= i5;
        this.f6593b = (i3 & 1) != 0 ? this.f6593b | i5 : this.f6593b & (~i5);
        this.c = (i3 & 2) != 0 ? this.c | i5 : this.c & (~i5);
        iArr[i2] = i4;
        return this;
    }
}
