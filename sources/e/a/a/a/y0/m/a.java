package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.m.l1.f;
import e.x.c.i;
import java.util.Objects;

public final class a extends r {

    /* renamed from: i  reason: collision with root package name */
    public final k0 f9643i;

    /* renamed from: j  reason: collision with root package name */
    public final k0 f9644j;

    public a(k0 k0Var, k0 k0Var2) {
        i.e(k0Var, "delegate");
        i.e(k0Var2, "abbreviation");
        this.f9643i = k0Var;
        this.f9644j = k0Var2;
    }

    public k0 d1(boolean z) {
        return new a(this.f9643i.a1(z), this.f9644j.a1(z));
    }

    public k0 e1(h hVar) {
        i.e(hVar, "newAnnotations");
        return new a(this.f9643i.e1(hVar), this.f9644j);
    }

    public k0 f1() {
        return this.f9643i;
    }

    public r h1(k0 k0Var) {
        i.e(k0Var, "delegate");
        return new a(k0Var, this.f9644j);
    }

    /* renamed from: i1 */
    public a a1(boolean z) {
        return new a(this.f9643i.a1(z), this.f9644j.a1(z));
    }

    /* renamed from: j1 */
    public a g1(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        d0 g2 = fVar.g(this.f9643i);
        Objects.requireNonNull(g2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 g3 = fVar.g(this.f9644j);
        Objects.requireNonNull(g3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a((k0) g2, (k0) g3);
    }

    /* renamed from: k1 */
    public a c1(h hVar) {
        i.e(hVar, "newAnnotations");
        return new a(this.f9643i.e1(hVar), this.f9644j);
    }
}
