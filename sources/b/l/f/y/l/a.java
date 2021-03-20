package b.l.f.y.l;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f5842h = new a(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f5843i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f5844j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f5845k = new a(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f5846l = new a(285, 256, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final a f5847m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f5848n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f5849o;
    public final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5850b;
    public final b c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5851e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5852g;

    static {
        a aVar = new a(67, 64, 1);
        f5844j = aVar;
        a aVar2 = new a(301, 256, 1);
        f5847m = aVar2;
        f5848n = aVar2;
        f5849o = aVar;
    }

    public a(int i2, int i3, int i4) {
        this.f = i2;
        this.f5851e = i3;
        this.f5852g = i4;
        this.a = new int[i3];
        this.f5850b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.f5850b[this.a[i7]] = i7;
        }
        this.c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public b a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.c;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new b(this, iArr);
        }
    }

    public int b(int i2) {
        if (i2 != 0) {
            return this.a[(this.f5851e - this.f5850b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    public int c(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.f5850b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.f5851e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + this.f5851e + ')';
    }
}
