package e.a.a.a.y0.m;

import b.q.a.a;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.g;
import e.a.a.a.y0.m.l1.b;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.l1.h;
import e.a.a.a.y0.m.n1.d;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class p extends r implements o, d {

    /* renamed from: i  reason: collision with root package name */
    public final k0 f9743i;

    public p(k0 k0Var) {
        this.f9743i = k0Var;
    }

    public p(k0 k0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9743i = k0Var;
    }

    public static final p i1(i1 i1Var) {
        i.e(i1Var, "type");
        if (i1Var instanceof p) {
            return (p) i1Var;
        }
        i.e(i1Var, "$this$canHaveUndefinedNullability");
        i1Var.W0();
        boolean z = false;
        if ((i1Var.W0().d() instanceof r0) || (i1Var instanceof h)) {
            i.e(i1Var, "type");
            if (!c.a(new b(false, true, false, (f) null, 12), a.o2(i1Var), g.a.b.a)) {
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        if (i1Var instanceof x) {
            x xVar = (x) i1Var;
            i.a(xVar.f9767i.W0(), xVar.f9768j.W0());
        }
        return new p(a.o2(i1Var), (DefaultConstructorMarker) null);
    }

    public boolean X0() {
        return false;
    }

    public boolean c0() {
        this.f9743i.W0();
        return this.f9743i.W0().d() instanceof r0;
    }

    public k0 d1(boolean z) {
        return z ? this.f9743i.a1(z) : this;
    }

    public k0 e1(e.a.a.a.y0.b.a1.h hVar) {
        i.e(hVar, "newAnnotations");
        return new p(this.f9743i.e1(hVar));
    }

    public k0 f1() {
        return this.f9743i;
    }

    public r h1(k0 k0Var) {
        i.e(k0Var, "delegate");
        return new p(k0Var);
    }

    public d0 j0(d0 d0Var) {
        i.e(d0Var, "replacement");
        return n0.a(d0Var.Z0());
    }

    /* renamed from: j1 */
    public p c1(e.a.a.a.y0.b.a1.h hVar) {
        i.e(hVar, "newAnnotations");
        return new p(this.f9743i.e1(hVar));
    }

    public String toString() {
        return this.f9743i + "!!";
    }
}
