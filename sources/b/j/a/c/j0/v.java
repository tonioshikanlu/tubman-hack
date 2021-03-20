package b.j.a.c.j0;

import b.j.a.b.f;
import b.j.a.b.o;
import b.j.a.c.m;
import b.j.a.c.y;

public class v implements m {

    /* renamed from: h  reason: collision with root package name */
    public Object f2238h;

    public v(String str) {
        this.f2238h = str;
    }

    public void d(f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        Object obj = this.f2238h;
        if (obj instanceof m) {
            ((m) obj).d(fVar, yVar, fVar2);
        } else if (obj instanceof o) {
            e(fVar, yVar);
        }
    }

    public void e(f fVar, y yVar) {
        Object obj = this.f2238h;
        if (obj instanceof m) {
            ((m) obj).e(fVar, yVar);
        } else if (obj instanceof o) {
            fVar.J0((o) obj);
        } else {
            fVar.K0(String.valueOf(obj));
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        Object obj2 = this.f2238h;
        Object obj3 = ((v) obj).f2238h;
        if (obj2 == obj3) {
            return true;
        }
        return obj2 != null && obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f2238h;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return String.format("[RawValue of type %s]", new Object[]{g.f(this.f2238h)});
    }
}
