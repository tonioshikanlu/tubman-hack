package e.a.a.a.y0.m;

import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.r0;
import e.x.c.i;
import java.util.List;
import java.util.Objects;

public final class q0 extends x0 {
    public final /* synthetic */ List c;

    public q0(List list) {
        this.c = list;
    }

    public y0 h(v0 v0Var) {
        i.e(v0Var, "key");
        if (!this.c.contains(v0Var)) {
            return null;
        }
        h d = v0Var.d();
        Objects.requireNonNull(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return f1.n((r0) d);
    }
}
