package b.j.a.c.b0.z;

import b.j.a.b.l;
import b.j.a.c.b0.r;
import b.j.a.c.b0.u;
import b.j.a.c.e0.f;
import b.j.a.c.e0.h;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.j0.b;
import b.j.a.c.p;
import b.j.a.c.t;
import java.lang.reflect.Field;

public final class i extends u {
    public final f w;
    public final transient Field x;
    public final boolean y;

    public i(i iVar, j<?> jVar, r rVar) {
        super(iVar, jVar, rVar);
        this.w = iVar.w;
        this.x = iVar.x;
        this.y = p.a(rVar);
    }

    public i(i iVar, t tVar) {
        super(iVar, tVar);
        this.w = iVar.w;
        this.x = iVar.x;
        this.y = iVar.y;
    }

    public i(b.j.a.c.e0.r rVar, b.j.a.c.i iVar, c cVar, b bVar, f fVar) {
        super(rVar, iVar, cVar, bVar);
        this.w = fVar;
        this.x = fVar.f1903j;
        this.y = p.a(this.f1802q);
    }

    public void B(Object obj, Object obj2) {
        try {
            this.x.set(obj, obj2);
        } catch (Exception e2) {
            a((b.j.a.b.i) null, e2, obj2);
            throw null;
        }
    }

    public Object D(Object obj, Object obj2) {
        try {
            this.x.set(obj, obj2);
            return obj;
        } catch (Exception e2) {
            a((b.j.a.b.i) null, e2, obj2);
            throw null;
        }
    }

    public u G(t tVar) {
        return new i(this, tVar);
    }

    public u H(r rVar) {
        return new i(this, this.f1800o, rVar);
    }

    public u J(j<?> jVar) {
        return this.f1800o == jVar ? this : new i(this, jVar, this.f1802q);
    }

    public h e() {
        return this.w;
    }

    public void f(b.j.a.b.i iVar, g gVar, Object obj) {
        Object obj2;
        if (!iVar.L0(l.VALUE_NULL)) {
            c cVar = this.f1801p;
            if (cVar == null) {
                obj2 = this.f1800o.d(iVar, gVar);
                if (obj2 == null) {
                    if (this.y) {
                        return;
                    }
                }
            } else {
                obj2 = this.f1800o.f(iVar, gVar, cVar);
            }
            this.x.set(obj, obj2);
        } else if (this.y) {
            return;
        }
        obj2 = this.f1802q.c(gVar);
        try {
            this.x.set(obj, obj2);
        } catch (Exception e2) {
            a(iVar, e2, obj2);
            throw null;
        }
    }

    public Object g(b.j.a.b.i iVar, g gVar, Object obj) {
        Object obj2;
        if (!iVar.L0(l.VALUE_NULL)) {
            c cVar = this.f1801p;
            if (cVar == null) {
                obj2 = this.f1800o.d(iVar, gVar);
                if (obj2 == null) {
                    if (this.y) {
                        return obj;
                    }
                }
            } else {
                obj2 = this.f1800o.f(iVar, gVar, cVar);
            }
            this.x.set(obj, obj2);
            return obj;
        } else if (this.y) {
            return obj;
        }
        obj2 = this.f1802q.c(gVar);
        try {
            this.x.set(obj, obj2);
            return obj;
        } catch (Exception e2) {
            a(iVar, e2, obj2);
            throw null;
        }
    }

    public void k(b.j.a.c.f fVar) {
        b.j.a.c.j0.g.e(this.x, fVar.o(p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }
}
