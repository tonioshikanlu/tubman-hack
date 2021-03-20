package e.a.a.a.y0.m;

import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.x.c.i;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class t0 {
    public final t0 a;

    /* renamed from: b  reason: collision with root package name */
    public final q0 f9755b;
    public final List<y0> c;
    public final Map<r0, y0> d;

    public t0(t0 t0Var, q0 q0Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = t0Var;
        this.f9755b = q0Var;
        this.c = list;
        this.d = map;
    }

    public final boolean a(q0 q0Var) {
        i.e(q0Var, "descriptor");
        if (!i.a(this.f9755b, q0Var)) {
            t0 t0Var = this.a;
            return t0Var != null ? t0Var.a(q0Var) : false;
        }
    }
}
