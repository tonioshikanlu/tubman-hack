package e.a.a.a.y0.m;

import b.q.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.m.l1.f;
import e.x.c.i;
import java.util.Objects;

public final class m0 extends r implements g1 {

    /* renamed from: i  reason: collision with root package name */
    public final k0 f9731i;

    /* renamed from: j  reason: collision with root package name */
    public final d0 f9732j;

    public m0(k0 k0Var, d0 d0Var) {
        i.e(k0Var, "delegate");
        i.e(d0Var, "enhancement");
        this.f9731i = k0Var;
        this.f9732j = d0Var;
    }

    public i1 K0() {
        return this.f9731i;
    }

    public k0 d1(boolean z) {
        return (k0) a.u3(this.f9731i.a1(z), this.f9732j.Z0().a1(z));
    }

    public d0 e0() {
        return this.f9732j;
    }

    /* renamed from: e1 */
    public k0 c1(h hVar) {
        i.e(hVar, "newAnnotations");
        return (k0) a.u3(this.f9731i.c1(hVar), this.f9732j);
    }

    public k0 f1() {
        return this.f9731i;
    }

    public r h1(k0 k0Var) {
        i.e(k0Var, "delegate");
        return new m0(k0Var, this.f9732j);
    }

    /* renamed from: i1 */
    public m0 g1(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        d0 g2 = fVar.g(this.f9731i);
        Objects.requireNonNull(g2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new m0((k0) g2, fVar.g(this.f9732j));
    }
}
