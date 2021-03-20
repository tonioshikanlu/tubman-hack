package b.j.a.c.g0;

import b.j.a.b.f;
import b.j.a.b.s.g;
import b.j.a.c.y;

public class l extends n {

    /* renamed from: h  reason: collision with root package name */
    public final long f2017h;

    public l(long j2) {
        this.f2017h = j2;
    }

    public final void e(f fVar, y yVar) {
        fVar.y0(this.f2017h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof l)) {
            return ((l) obj).f2017h == this.f2017h;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f2017h;
        return ((int) (j2 >> 32)) ^ ((int) j2);
    }

    public String n() {
        long j2 = this.f2017h;
        String str = g.a;
        return (j2 > 2147483647L || j2 < -2147483648L) ? Long.toString(j2) : g.m((int) j2);
    }

    public b.j.a.b.l v() {
        return b.j.a.b.l.VALUE_NUMBER_INT;
    }
}
