package b.l.f.z.e;

import b.l.f.f;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

public class j {

    /* renamed from: i  reason: collision with root package name */
    public static j[] f5882i = {new j(false, 3, 5, 8, 8, 1), new j(false, 5, 7, 10, 10, 1), new j(true, 5, 7, 16, 6, 1), new j(false, 8, 10, 12, 12, 1), new j(true, 10, 11, 14, 6, 2), new j(false, 12, 12, 14, 14, 1), new j(true, 16, 14, 24, 10, 1), new j(false, 18, 14, 16, 16, 1), new j(false, 22, 18, 18, 18, 1), new j(true, 22, 18, 16, 10, 2), new j(false, 30, 20, 20, 20, 1), new j(true, 32, 24, 16, 14, 2), new j(false, 36, 24, 22, 22, 1), new j(false, 44, 28, 24, 24, 1), new j(true, 49, 28, 22, 14, 2), new j(false, 62, 36, 14, 14, 4), new j(false, 86, 42, 16, 16, 4), new j(false, 114, 48, 18, 18, 4), new j(false, 144, 56, 20, 20, 4), new j(false, 174, 68, 22, 22, 4), new j(false, 204, 84, 24, 24, 4, 102, 42), new j(false, 280, 112, 14, 14, 16, 140, 56), new j(false, 368, 144, 16, 16, 16, 92, 36), new j(false, 456, 192, 18, 18, 16, 114, 48), new j(false, 576, 224, 20, 20, 16, 144, 56), new j(false, 696, 272, 22, 22, 16, 174, 68), new j(false, 816, 336, 24, 24, 16, 136, 56), new j(false, 1050, 408, 18, 18, 36, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 68), new j(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5883b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5884e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5885g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5886h;

    public j(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    public j(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = z;
        this.f5883b = i2;
        this.c = i3;
        this.d = i4;
        this.f5884e = i5;
        this.f = i6;
        this.f5885g = i7;
        this.f5886h = i8;
    }

    public static j i(int i2, k kVar, f fVar, f fVar2, boolean z) {
        for (j jVar : f5882i) {
            if ((kVar != k.FORCE_SQUARE || !jVar.a) && ((kVar != k.FORCE_RECTANGLE || jVar.a) && ((fVar == null || (jVar.g() >= 0 && jVar.f() >= 0)) && ((fVar2 == null || (jVar.g() <= 0 && jVar.f() <= 0)) && i2 <= jVar.f5883b)))) {
                return jVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
    }

    public int a(int i2) {
        return this.f5885g;
    }

    public final int b() {
        int i2 = this.f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (!(i2 == 2 || i2 == 4)) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    public int c() {
        return this.f5883b / this.f5885g;
    }

    public final int d() {
        return h() * this.f5884e;
    }

    public final int e() {
        return b() * this.d;
    }

    public final int f() {
        return d() + (h() << 1);
    }

    public final int g() {
        return e() + (b() << 1);
    }

    public final int h() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.d);
        sb.append('x');
        sb.append(this.f5884e);
        sb.append(", symbol size ");
        sb.append(g());
        sb.append('x');
        sb.append(f());
        sb.append(", symbol data size ");
        sb.append(e());
        sb.append('x');
        sb.append(d());
        sb.append(", codewords ");
        sb.append(this.f5883b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }
}
