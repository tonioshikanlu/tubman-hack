package b.j.a.c.g0;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.s.g;
import b.j.a.c.y;

public class h extends n {

    /* renamed from: h  reason: collision with root package name */
    public final double f2011h;

    public h(double d) {
        this.f2011h = d;
    }

    public final void e(f fVar, y yVar) {
        fVar.v0(this.f2011h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        return Double.compare(this.f2011h, ((h) obj).f2011h) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2011h);
        return ((int) (doubleToLongBits >> 32)) ^ ((int) doubleToLongBits);
    }

    public String n() {
        double d = this.f2011h;
        String str = g.a;
        return Double.toString(d);
    }

    public l v() {
        return l.VALUE_NUMBER_FLOAT;
    }
}
