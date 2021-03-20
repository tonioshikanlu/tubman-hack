package b.j.a.c.g0;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.c.y;

public class e extends r {

    /* renamed from: i  reason: collision with root package name */
    public static final e f2005i = new e(true);

    /* renamed from: j  reason: collision with root package name */
    public static final e f2006j = new e(false);

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2007h;

    public e(boolean z) {
        this.f2007h = z;
    }

    public final void e(f fVar, y yVar) {
        fVar.o0(this.f2007h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof e)) {
            return this.f2007h == ((e) obj).f2007h;
        }
        return false;
    }

    public int hashCode() {
        return this.f2007h ? 3 : 1;
    }

    public String n() {
        return this.f2007h ? "true" : "false";
    }

    public l v() {
        return this.f2007h ? l.VALUE_TRUE : l.VALUE_FALSE;
    }
}
