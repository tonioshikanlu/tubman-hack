package b.j.a.c.g0;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.s.a;
import b.j.a.c.y;

public class q extends r {

    /* renamed from: i  reason: collision with root package name */
    public static final q f2021i = new q("");

    /* renamed from: h  reason: collision with root package name */
    public final String f2022h;

    public q(String str) {
        this.f2022h = str;
    }

    public final void e(f fVar, y yVar) {
        String str = this.f2022h;
        if (str == null) {
            fVar.u0();
        } else {
            fVar.Q0(str);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof q)) {
            return ((q) obj).f2022h.equals(this.f2022h);
        }
        return false;
    }

    public int hashCode() {
        return this.f2022h.hashCode();
    }

    public String n() {
        return this.f2022h;
    }

    public String toString() {
        int length = this.f2022h.length();
        StringBuilder sb = new StringBuilder(length + 2 + (length >> 4));
        String str = this.f2022h;
        sb.append('\"');
        a.a(sb, str);
        sb.append('\"');
        return sb.toString();
    }

    public l v() {
        return l.VALUE_STRING;
    }
}
