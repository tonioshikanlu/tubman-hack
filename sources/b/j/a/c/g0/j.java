package b.j.a.c.g0;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.s.g;
import b.j.a.c.y;

public class j extends n {

    /* renamed from: i  reason: collision with root package name */
    public static final j[] f2013i = new j[12];

    /* renamed from: h  reason: collision with root package name */
    public final int f2014h;

    static {
        for (int i2 = 0; i2 < 12; i2++) {
            f2013i[i2] = new j(i2 - 1);
        }
    }

    public j(int i2) {
        this.f2014h = i2;
    }

    public final void e(f fVar, y yVar) {
        fVar.x0(this.f2014h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof j)) {
            return ((j) obj).f2014h == this.f2014h;
        }
        return false;
    }

    public int hashCode() {
        return this.f2014h;
    }

    public String n() {
        return g.m(this.f2014h);
    }

    public l v() {
        return l.VALUE_NUMBER_INT;
    }
}
