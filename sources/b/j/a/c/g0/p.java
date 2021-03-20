package b.j.a.c.g0;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.c.d;
import b.j.a.c.j0.v;
import b.j.a.c.m;
import b.j.a.c.y;

public class p extends r {

    /* renamed from: h  reason: collision with root package name */
    public final Object f2020h;

    public p(Object obj) {
        this.f2020h = obj;
    }

    public final void e(f fVar, y yVar) {
        Object obj = this.f2020h;
        if (obj == null) {
            yVar.t(fVar);
        } else if (obj instanceof m) {
            ((m) obj).e(fVar, yVar);
        } else if (obj != null) {
            yVar.x(obj.getClass(), true, (d) null).f(obj, fVar, yVar);
        } else if (yVar.s) {
            fVar.u0();
        } else {
            yVar.f2327o.f(null, fVar, yVar);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        Object obj2 = this.f2020h;
        Object obj3 = ((p) obj).f2020h;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public int hashCode() {
        return this.f2020h.hashCode();
    }

    public String n() {
        Object obj = this.f2020h;
        return obj == null ? "null" : obj.toString();
    }

    public String toString() {
        Object obj = this.f2020h;
        if (obj instanceof byte[]) {
            return String.format("(binary value of %d bytes)", new Object[]{Integer.valueOf(((byte[]) obj).length)});
        } else if (!(obj instanceof v)) {
            return String.valueOf(obj);
        } else {
            return String.format("(raw value '%s')", new Object[]{((v) obj).toString()});
        }
    }

    public l v() {
        return l.VALUE_EMBEDDED_OBJECT;
    }
}
