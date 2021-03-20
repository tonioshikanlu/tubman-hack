package b.l.f;

import b.l.f.x.a.g;

public class s {
    public final float a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5775b;

    public s(float f, float f2) {
        this.a = f;
        this.f5775b = f2;
    }

    public static float a(s sVar, s sVar2) {
        return g.l(sVar.a, sVar.f5775b, sVar2.a, sVar2.f5775b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.a == sVar.a && this.f5775b == sVar.f5775b;
        }
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f5775b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "(" + this.a + ',' + this.f5775b + ')';
    }
}
