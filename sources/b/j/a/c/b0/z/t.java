package b.j.a.c.b0.z;

import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.c.b0.r;
import b.j.a.c.b0.u;
import b.j.a.c.e0.h;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.s;

public final class t extends u {
    public final r w;

    public t(r rVar, s sVar) {
        super(rVar.f1843i, rVar.f1842h, sVar, rVar.f1846l);
        this.w = rVar;
    }

    public t(t tVar, j<?> jVar, r rVar) {
        super(tVar, jVar, rVar);
        this.w = tVar.w;
    }

    public t(t tVar, b.j.a.c.t tVar2) {
        super(tVar, tVar2);
        this.w = tVar.w;
    }

    public void B(Object obj, Object obj2) {
        D(obj, obj2);
    }

    public Object D(Object obj, Object obj2) {
        u uVar = this.w.f1847m;
        if (uVar != null) {
            return uVar.D(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    public u G(b.j.a.c.t tVar) {
        return new t(this, tVar);
    }

    public u H(r rVar) {
        return new t(this, this.f1800o, rVar);
    }

    public u J(j<?> jVar) {
        return this.f1800o == jVar ? this : new t(this, jVar, this.f1802q);
    }

    public h e() {
        return null;
    }

    public void f(i iVar, g gVar, Object obj) {
        g(iVar, gVar, obj);
    }

    public Object g(i iVar, g gVar, Object obj) {
        if (iVar.L0(l.VALUE_NULL)) {
            return null;
        }
        Object d = this.f1800o.d(iVar, gVar);
        r rVar = this.w;
        gVar.v(d, rVar.f1844j, rVar.f1845k).b(obj);
        u uVar = this.w.f1847m;
        return uVar != null ? uVar.D(obj, d) : obj;
    }
}
