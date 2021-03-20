package b.j.a.c.h0.s;

import b.e.a.a.a;
import b.j.a.b.f;
import b.j.a.c.h0.c;
import b.j.a.c.h0.t.d;
import b.j.a.c.j0.r;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import java.io.Serializable;
import java.util.Set;

public class s extends d implements Serializable {
    public final r s;

    public s(s sVar, j jVar) {
        super(sVar, jVar, sVar.f2095n);
        this.s = sVar.s;
    }

    public s(s sVar, j jVar, Object obj) {
        super(sVar, jVar, obj);
        this.s = sVar.s;
    }

    public s(s sVar, Set<String> set) {
        super((d) sVar, set);
        this.s = sVar.s;
    }

    public s(d dVar, r rVar) {
        super(dVar, rVar);
        this.s = rVar;
    }

    public boolean e() {
        return true;
    }

    public final void f(Object obj, f fVar, y yVar) {
        fVar.Y(obj);
        if (this.f2097p != null) {
            r(obj, fVar, yVar, false);
            return;
        }
        Object obj2 = this.f2095n;
        if (obj2 != null) {
            if (this.f2093l != null) {
                Class<?> cls = yVar.f2321i;
            }
            m(yVar, obj2, obj);
            throw null;
        }
        w(obj, fVar, yVar);
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        if (yVar.K(x.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            yVar.m(this.f2137h, "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        fVar.Y(obj);
        if (this.f2097p != null) {
            q(obj, fVar, yVar, fVar2);
            return;
        }
        Object obj2 = this.f2095n;
        if (obj2 != null) {
            c[] cVarArr = this.f2093l;
            m(yVar, obj2, obj);
            throw null;
        }
        w(obj, fVar, yVar);
    }

    public n<Object> h(r rVar) {
        return new s((d) this, rVar);
    }

    public String toString() {
        return a.d(this.f2137h, a.y("UnwrappingBeanSerializer for "));
    }

    public d u() {
        return this;
    }

    public d x(Object obj) {
        return new s(this, this.f2097p, obj);
    }

    public d y(Set<String> set) {
        return new s(this, set);
    }

    public d z(j jVar) {
        return new s(this, jVar);
    }
}
