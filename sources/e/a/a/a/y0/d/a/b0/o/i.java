package e.a.a.a.y0.d.a.b0.o;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.d.a.z.k;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.m.a1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.o1.c;
import e.a.a.a.y0.m.p0;
import e.a.a.a.y0.m.y0;
import e.t.g;
import e.x.b.a;
import java.util.List;
import java.util.Objects;

public final class i {
    public static final b a = new b("java.lang.Class");

    public static final d0 a(r0 r0Var, r0 r0Var2, a<? extends d0> aVar) {
        e.x.c.i.e(r0Var, "$this$getErasedUpperBound");
        e.x.c.i.e(aVar, "defaultValue");
        if (r0Var == r0Var2) {
            return (d0) aVar.e();
        }
        List<d0> upperBounds = r0Var.getUpperBounds();
        e.x.c.i.d(upperBounds, "upperBounds");
        d0 d0Var = (d0) g.o(upperBounds);
        if (d0Var.W0().d() instanceof e) {
            e.x.c.i.d(d0Var, "firstUpperBound");
            return c.Z(d0Var);
        }
        if (r0Var2 != null) {
            r0Var = r0Var2;
        }
        h d = d0Var.W0().d();
        while (true) {
            Objects.requireNonNull(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            r0 r0Var3 = (r0) d;
            if (!(!e.x.c.i.a(r0Var3, r0Var))) {
                return (d0) aVar.e();
            }
            List<d0> upperBounds2 = r0Var3.getUpperBounds();
            e.x.c.i.d(upperBounds2, "current.upperBounds");
            d0 d0Var2 = (d0) g.o(upperBounds2);
            if (d0Var2.W0().d() instanceof e) {
                e.x.c.i.d(d0Var2, "nextUpperBound");
                return c.Z(d0Var2);
            }
            d = d0Var2.W0().d();
        }
    }

    public static final y0 b(r0 r0Var, a aVar) {
        e.x.c.i.e(r0Var, "typeParameter");
        e.x.c.i.e(aVar, "attr");
        return aVar.a == k.SUPERTYPE ? new a1(b.q.a.a.Y2(r0Var)) : new p0(r0Var);
    }

    public static a c(k kVar, boolean z, r0 r0Var, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            r0Var = null;
        }
        e.x.c.i.e(kVar, "$this$toAttributes");
        return new a(kVar, (b) null, z2, r0Var, 2);
    }
}
