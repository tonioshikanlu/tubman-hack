package b.l.f.w.f;

import java.util.Objects;

public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final f f5792e = new f(g.f5794b, 0, 0, 0);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5793b;
    public final int c;
    public final int d;

    public f(g gVar, int i2, int i3, int i4) {
        this.f5793b = gVar;
        this.a = i2;
        this.c = i3;
        this.d = i4;
    }

    public static int b(f fVar) {
        int i2 = fVar.c;
        if (i2 > 62) {
            return 21;
        }
        if (i2 > 31) {
            return 20;
        }
        return i2 > 0 ? 10 : 0;
    }

    public f a(int i2) {
        g gVar = this.f5793b;
        int i3 = this.a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int i5 = d.c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            Objects.requireNonNull(gVar);
            e eVar = new e(gVar, i6, i7);
            i4 += i7;
            i3 = 0;
            gVar = eVar;
        }
        int i8 = this.c;
        int i9 = (i8 == 0 || i8 == 31) ? 18 : i8 == 62 ? 9 : 8;
        int i10 = i8 + 1;
        f fVar = new f(gVar, i3, i10, i4 + i9);
        return i10 == 2078 ? fVar.c(i2 + 1) : fVar;
    }

    public f c(int i2) {
        int i3 = this.c;
        if (i3 == 0) {
            return this;
        }
        g gVar = this.f5793b;
        Objects.requireNonNull(gVar);
        return new f(new a(gVar, i2 - i3, i3), this.a, 0, this.d);
    }

    public boolean d(f fVar) {
        int i2 = this.d + (d.c[this.a][fVar.a] >> 16);
        int i3 = this.c;
        int i4 = fVar.c;
        if (i3 < i4) {
            i2 += b(fVar) - b(this);
        } else if (i3 > i4 && i4 > 0) {
            i2 += 10;
        }
        return i2 <= fVar.d;
    }

    public f e(int i2, int i3) {
        int i4 = this.d;
        g gVar = this.f5793b;
        int i5 = this.a;
        if (i2 != i5) {
            int i6 = d.c[i5][i2];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            Objects.requireNonNull(gVar);
            i4 += i8;
            gVar = new e(gVar, i7, i8);
        }
        int i9 = i2 == 2 ? 4 : 5;
        Objects.requireNonNull(gVar);
        return new f(new e(gVar, i3, i9), i2, 0, i4 + i9);
    }

    public f f(int i2, int i3) {
        g gVar = this.f5793b;
        int i4 = this.a;
        int i5 = i4 == 2 ? 4 : 5;
        int i6 = d.f5791e[i4][i2];
        Objects.requireNonNull(gVar);
        return new f(new e(new e(gVar, i6, i5), i3, 5), this.a, 0, this.d + i5 + 5);
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{d.f5790b[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c)});
    }
}
