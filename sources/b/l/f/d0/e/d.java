package b.l.f.d0.e;

public final class d {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5665b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public int f5666e = -1;

    public d(int i2, int i3, int i4, int i5) {
        this.a = i2;
        this.f5665b = i3;
        this.c = i4;
        this.d = i5;
    }

    public boolean a() {
        int i2 = this.f5666e;
        return i2 != -1 && this.c == (i2 % 3) * 3;
    }

    public void b() {
        this.f5666e = (this.c / 3) + ((this.d / 30) * 3);
    }

    public String toString() {
        return this.f5666e + "|" + this.d;
    }
}
