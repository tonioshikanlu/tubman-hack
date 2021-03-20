package e.a.a.a.y0.m;

import b.q.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.i.c;
import e.a.a.a.y0.m.l1.f;
import e.x.c.i;
import java.util.Objects;

public final class z extends x implements g1 {

    /* renamed from: k  reason: collision with root package name */
    public final x f9770k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f9771l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(x xVar, d0 d0Var) {
        super(xVar.f9767i, xVar.f9768j);
        i.e(xVar, "origin");
        i.e(d0Var, "enhancement");
        this.f9770k = xVar;
        this.f9771l = d0Var;
    }

    public i1 K0() {
        return this.f9770k;
    }

    public i1 a1(boolean z) {
        return a.u3(this.f9770k.a1(z), this.f9771l.Z0().a1(z));
    }

    public i1 c1(h hVar) {
        i.e(hVar, "newAnnotations");
        return a.u3(this.f9770k.c1(hVar), this.f9771l);
    }

    public k0 d1() {
        return this.f9770k.d1();
    }

    public d0 e0() {
        return this.f9771l;
    }

    public String e1(c cVar, e.a.a.a.y0.i.i iVar) {
        i.e(cVar, "renderer");
        i.e(iVar, "options");
        if (iVar.k()) {
            return cVar.w(this.f9771l);
        }
        return this.f9770k.e1(cVar, iVar);
    }

    /* renamed from: f1 */
    public z b1(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        d0 g2 = fVar.g(this.f9770k);
        Objects.requireNonNull(g2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new z((x) g2, fVar.g(this.f9771l));
    }
}
