package b.j.a.c.g0;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.s.g;
import b.j.a.c.y;

public class i extends n {

    /* renamed from: h  reason: collision with root package name */
    public final float f2012h;

    public i(float f) {
        this.f2012h = f;
    }

    public final void e(f fVar, y yVar) {
        fVar.w0(this.f2012h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        return Float.compare(this.f2012h, ((i) obj).f2012h) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f2012h);
    }

    public String n() {
        float f = this.f2012h;
        String str = g.a;
        return Float.toString(f);
    }

    public l v() {
        return l.VALUE_NUMBER_FLOAT;
    }
}
