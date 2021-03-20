package e.a.a.a.y0.d.a.e0;

import b.q.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.o;
import e.a.a.a.y0.m.o1.c;
import e.a.a.a.y0.m.r;
import e.a.a.a.y0.m.x;
import e.x.c.i;

public final class f extends r implements o {

    /* renamed from: i  reason: collision with root package name */
    public final k0 f8504i;

    public f(k0 k0Var) {
        i.e(k0Var, "delegate");
        this.f8504i = k0Var;
    }

    public boolean X0() {
        return false;
    }

    public boolean c0() {
        return true;
    }

    public k0 d1(boolean z) {
        return z ? this.f8504i.a1(true) : this;
    }

    public k0 e1(h hVar) {
        i.e(hVar, "newAnnotations");
        return new f(this.f8504i.e1(hVar));
    }

    public k0 f1() {
        return this.f8504i;
    }

    public r h1(k0 k0Var) {
        i.e(k0Var, "delegate");
        return new f(k0Var);
    }

    public final k0 i1(k0 k0Var) {
        k0 d1 = k0Var.a1(false);
        return !c.P(k0Var) ? d1 : new f(d1);
    }

    public d0 j0(d0 d0Var) {
        i.e(d0Var, "replacement");
        i1 Z0 = d0Var.Z0();
        if (!f1.g(Z0) && !c.P(Z0)) {
            return Z0;
        }
        if (Z0 instanceof k0) {
            return i1((k0) Z0);
        }
        if (Z0 instanceof x) {
            x xVar = (x) Z0;
            return a.u3(e0.c(i1(xVar.f9767i), i1(xVar.f9768j)), a.G0(Z0));
        }
        throw new IllegalStateException(("Incorrect type: " + Z0).toString());
    }

    /* renamed from: j1 */
    public f c1(h hVar) {
        i.e(hVar, "newAnnotations");
        return new f(this.f8504i.e1(hVar));
    }
}
