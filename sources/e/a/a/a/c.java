package e.a.a.a;

import e.a.a.a.y0.b.b0;
import e.a.a.a.y0.b.c1.e0;
import e.a.a.a.y0.b.c1.p0;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.g0;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.j;
import e.a.a.a.y0.b.m;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.y;
import e.r;
import e.x.c.i;

public class c extends c<g<?>, r> implements m {
    public final n a;

    public c(n nVar) {
        i.e(nVar, "container");
        this.a = nVar;
    }

    public /* bridge */ /* synthetic */ Object a(e eVar, Object obj) {
        return null;
    }

    public Object b(g0 g0Var, Object obj) {
        return c(g0Var, obj);
    }

    public Object c(s sVar, Object obj) {
        i.e(sVar, "descriptor");
        i.e((r) obj, "data");
        return new b(this.a, sVar);
    }

    public /* bridge */ /* synthetic */ Object d(b0 b0Var, Object obj) {
        return null;
    }

    public Object e(j jVar, Object obj) {
        return c(jVar, obj);
    }

    public Object f(h0 h0Var, Object obj) {
        return c(h0Var, obj);
    }

    public /* bridge */ /* synthetic */ Object g(w wVar, Object obj) {
        return null;
    }

    public /* bridge */ /* synthetic */ Object h(w0 w0Var, Object obj) {
        return null;
    }

    public Object i(f0 f0Var, Object obj) {
        i.e(f0Var, "descriptor");
        i.e((r) obj, "data");
        e0 e0Var = (e0) f0Var;
        int i2 = 0;
        int i3 = e0Var.z != null ? 1 : 0;
        if (e0Var.A != null) {
            i2 = 1;
        }
        int i4 = i3 + i2;
        if (((p0) f0Var).f8238m) {
            if (i4 == 0) {
                return new r(this.a, f0Var);
            }
            if (i4 == 1) {
                return new t(this.a, f0Var);
            }
            if (i4 == 2) {
                return new u(this.a, f0Var);
            }
        } else if (i4 == 0) {
            return new x(this.a, f0Var);
        } else {
            if (i4 == 1) {
                return new a0(this.a, f0Var);
            }
            if (i4 == 2) {
                return new b0(this.a, f0Var);
            }
        }
        throw new l0("Unsupported property: " + f0Var);
    }

    public /* bridge */ /* synthetic */ Object j(q0 q0Var, Object obj) {
        return null;
    }

    public /* bridge */ /* synthetic */ Object k(i0 i0Var, Object obj) {
        return null;
    }

    public /* bridge */ /* synthetic */ Object l(r0 r0Var, Object obj) {
        return null;
    }

    public /* bridge */ /* synthetic */ Object m(y yVar, Object obj) {
        return null;
    }
}
