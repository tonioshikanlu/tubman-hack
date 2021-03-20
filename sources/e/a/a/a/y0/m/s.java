package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.x.c.i;

public abstract class s extends r {

    /* renamed from: i  reason: collision with root package name */
    public final k0 f9752i;

    public s(k0 k0Var) {
        i.e(k0Var, "delegate");
        this.f9752i = k0Var;
    }

    public i1 c1(h hVar) {
        i.e(hVar, "newAnnotations");
        return hVar != k() ? new m(this, hVar) : this;
    }

    public k0 d1(boolean z) {
        if (z == X0()) {
            return this;
        }
        return this.f9752i.a1(z).e1(k());
    }

    public k0 e1(h hVar) {
        i.e(hVar, "newAnnotations");
        return hVar != k() ? new m(this, hVar) : this;
    }

    public k0 f1() {
        return this.f9752i;
    }
}
