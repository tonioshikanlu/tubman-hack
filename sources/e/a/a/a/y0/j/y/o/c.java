package e.a.a.a.y0.j.y.o;

import b.e.a.a.a;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.x.c.i;

public class c implements d, f {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9471b;

    public c(e eVar, c cVar) {
        i.e(eVar, "classDescriptor");
        this.f9471b = eVar;
        this.a = eVar;
    }

    public d0 d() {
        k0 s = this.f9471b.s();
        i.d(s, "classDescriptor.defaultType");
        return s;
    }

    public boolean equals(Object obj) {
        e eVar = this.f9471b;
        e eVar2 = null;
        if (!(obj instanceof c)) {
            obj = null;
        }
        c cVar = (c) obj;
        if (cVar != null) {
            eVar2 = cVar.f9471b;
        }
        return i.a(eVar, eVar2);
    }

    public int hashCode() {
        return this.f9471b.hashCode();
    }

    public final e o() {
        return this.f9471b;
    }

    public String toString() {
        StringBuilder y = a.y("Class{");
        k0 s = this.f9471b.s();
        i.d(s, "classDescriptor.defaultType");
        y.append(s);
        y.append('}');
        return y.toString();
    }
}
