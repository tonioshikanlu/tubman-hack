package e.a.a.a.y0.m;

import b.e.a.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.i.c;
import e.a.a.a.y0.m.l1.f;
import e.x.c.i;
import java.util.Objects;

public final class y extends x implements o {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(k0 k0Var, k0 k0Var2) {
        super(k0Var, k0Var2);
        i.e(k0Var, "lowerBound");
        i.e(k0Var2, "upperBound");
    }

    public i1 a1(boolean z) {
        return e0.c(this.f9767i.a1(z), this.f9768j.a1(z));
    }

    public boolean c0() {
        return (this.f9767i.W0().d() instanceof r0) && i.a(this.f9767i.W0(), this.f9768j.W0());
    }

    public i1 c1(h hVar) {
        i.e(hVar, "newAnnotations");
        return e0.c(this.f9767i.e1(hVar), this.f9768j.e1(hVar));
    }

    public k0 d1() {
        return this.f9767i;
    }

    public String e1(c cVar, e.a.a.a.y0.i.i iVar) {
        i.e(cVar, "renderer");
        i.e(iVar, "options");
        if (!iVar.m()) {
            return cVar.t(cVar.w(this.f9767i), cVar.w(this.f9768j), e.a.a.a.y0.m.o1.c.D(this));
        }
        StringBuilder v = a.v('(');
        v.append(cVar.w(this.f9767i));
        v.append("..");
        v.append(cVar.w(this.f9768j));
        v.append(')');
        return v.toString();
    }

    /* renamed from: f1 */
    public x b1(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        d0 g2 = fVar.g(this.f9767i);
        Objects.requireNonNull(g2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 g3 = fVar.g(this.f9768j);
        Objects.requireNonNull(g3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new y((k0) g2, (k0) g3);
    }

    public d0 j0(d0 d0Var) {
        i1 i1Var;
        i.e(d0Var, "replacement");
        i1 Z0 = d0Var.Z0();
        if (Z0 instanceof x) {
            i1Var = Z0;
        } else if (Z0 instanceof k0) {
            k0 k0Var = (k0) Z0;
            i1Var = e0.c(k0Var, k0Var.a1(true));
        } else {
            throw new e.h();
        }
        return b.q.a.a.z1(i1Var, Z0);
    }
}
