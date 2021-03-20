package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.m.l1.f;
import e.x.c.i;
import java.util.List;
import java.util.Objects;

public abstract class r extends k0 {
    public List<y0> V0() {
        return f1().V0();
    }

    public v0 W0() {
        return f1().W0();
    }

    public boolean X0() {
        return f1().X0();
    }

    public abstract k0 f1();

    /* renamed from: g1 */
    public k0 b1(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        d0 g2 = fVar.g(f1());
        Objects.requireNonNull(g2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return h1((k0) g2);
    }

    public abstract r h1(k0 k0Var);

    public h k() {
        return f1().k();
    }

    public e.a.a.a.y0.j.y.i z() {
        return f1().z();
    }
}
