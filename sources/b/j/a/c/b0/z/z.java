package b.j.a.c.b0.z;

import b.e.a.a.a;
import b.j.a.b.l;
import b.j.a.c.b0.r;
import b.j.a.c.b0.u;
import b.j.a.c.e0.h;
import b.j.a.c.e0.i;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.j0.b;
import b.j.a.c.k;
import b.j.a.c.p;
import b.j.a.c.t;
import java.io.Closeable;
import java.lang.reflect.Method;

public final class z extends u {
    public final i w;
    public final Method x;

    public z(z zVar, j<?> jVar, r rVar) {
        super(zVar, jVar, rVar);
        this.w = zVar.w;
        this.x = zVar.x;
    }

    public z(z zVar, t tVar) {
        super(zVar, tVar);
        this.w = zVar.w;
        this.x = zVar.x;
    }

    public z(b.j.a.c.e0.r rVar, b.j.a.c.i iVar, c cVar, b bVar, i iVar2) {
        super(rVar, iVar, cVar, bVar);
        this.w = iVar2;
        this.x = iVar2.f1913k;
    }

    public final void B(Object obj, Object obj2) {
        throw new UnsupportedOperationException(a.q(a.y("Should never call `set()` on setterless property ('"), this.f1796k.f2305h, "')"));
    }

    public Object D(Object obj, Object obj2) {
        B(obj, obj2);
        throw null;
    }

    public u G(t tVar) {
        return new z(this, tVar);
    }

    public u H(r rVar) {
        return new z(this, this.f1800o, rVar);
    }

    public u J(j<?> jVar) {
        return this.f1800o == jVar ? this : new z(this, jVar, this.f1802q);
    }

    public h e() {
        return this.w;
    }

    public final void f(b.j.a.b.i iVar, g gVar, Object obj) {
        if (iVar.g0() != l.VALUE_NULL) {
            if (this.f1801p == null) {
                try {
                    Object invoke = this.x.invoke(obj, (Object[]) null);
                    if (invoke != null) {
                        this.f1800o.e(iVar, gVar, invoke);
                        return;
                    }
                    gVar.l(this.f1797l, String.format("Problem deserializing 'setterless' property '%s': get method returned null", new Object[]{this.f1796k.f2305h}));
                    throw null;
                } catch (Exception e2) {
                    b.j.a.c.j0.g.D(e2);
                    b.j.a.c.j0.g.E(e2);
                    Throwable r = b.j.a.c.j0.g.r(e2);
                    throw new k((Closeable) iVar, b.j.a.c.j0.g.i(r), r);
                }
            } else {
                gVar.l(this.f1797l, String.format("Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet", new Object[]{this.f1796k.f2305h}));
                throw null;
            }
        }
    }

    public Object g(b.j.a.b.i iVar, g gVar, Object obj) {
        f(iVar, gVar, obj);
        return obj;
    }

    public void k(f fVar) {
        this.w.g(fVar.o(p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }
}
