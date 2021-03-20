package e.a.a.a.y0.n;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.a.j;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.j.v.b;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.l1.d;
import e.a.a.a.y0.m.o1.c;
import e.a.a.a.y0.m.p0;
import e.a.a.a.y0.m.v0;
import e.x.c.i;
import java.util.List;
import java.util.Objects;

public final class f implements b {
    public static final f a = new f();

    public String a(s sVar) {
        i.e(sVar, "functionDescriptor");
        return c.J(this, sVar);
    }

    public boolean b(s sVar) {
        k0 k0Var;
        i.e(sVar, "functionDescriptor");
        w0 w0Var = sVar.n().get(1);
        j.b bVar = j.f7679e;
        i.d(w0Var, "secondParameter");
        w k2 = b.k(w0Var);
        Objects.requireNonNull(bVar);
        i.e(k2, "module");
        a aVar = g.f7647k.Y;
        i.d(aVar, "KotlinBuiltIns.FQ_NAMES.kProperty");
        e l0 = b.q.a.a.l0(k2, aVar);
        if (l0 != null) {
            Objects.requireNonNull(h.f7785e);
            h hVar = h.a.a;
            v0 p2 = l0.p();
            i.d(p2, "kPropertyClass.typeConstructor");
            List<r0> g2 = p2.g();
            i.d(g2, "kPropertyClass.typeConstructor.parameters");
            Object O = e.t.g.O(g2);
            i.d(O, "kPropertyClass.typeConstructor.parameters.single()");
            k0Var = e0.e(hVar, l0, b.q.a.a.l2(new p0((r0) O)));
        } else {
            k0Var = null;
        }
        if (k0Var == null) {
            return false;
        }
        d0 d = w0Var.d();
        i.d(d, "secondParameter.type");
        i.e(d, "$this$makeNotNullable");
        d0 i2 = f1.i(d);
        i.d(i2, "TypeUtils.makeNotNullable(this)");
        i.e(k0Var, "$this$isSubtypeOf");
        i.e(i2, "superType");
        return d.a.d(k0Var, i2);
    }

    public String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
