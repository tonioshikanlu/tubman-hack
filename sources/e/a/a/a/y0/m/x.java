package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.i.c;
import e.a.a.a.y0.m.n1.f;
import e.x.c.i;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class x extends i1 implements r0, f {

    /* renamed from: i  reason: collision with root package name */
    public final k0 f9767i;

    /* renamed from: j  reason: collision with root package name */
    public final k0 f9768j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(k0 k0Var, k0 k0Var2) {
        super((DefaultConstructorMarker) null);
        i.e(k0Var, "lowerBound");
        i.e(k0Var2, "upperBound");
        this.f9767i = k0Var;
        this.f9768j = k0Var2;
    }

    public d0 P0() {
        return this.f9767i;
    }

    public boolean R0(d0 d0Var) {
        i.e(d0Var, "type");
        return false;
    }

    public List<y0> V0() {
        return d1().V0();
    }

    public v0 W0() {
        return d1().W0();
    }

    public boolean X0() {
        return d1().X0();
    }

    public abstract k0 d1();

    public abstract String e1(c cVar, e.a.a.a.y0.i.i iVar);

    public h k() {
        return d1().k();
    }

    public String toString() {
        return c.f9317b.w(this);
    }

    public d0 w0() {
        return this.f9768j;
    }

    public e.a.a.a.y0.j.y.i z() {
        return d1().z();
    }
}
