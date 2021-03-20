package e.a.a.a.y0.j.s.a;

import b.q.a.a;
import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.l1.j;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.y0;
import e.t.o;
import e.x.c.i;
import java.util.Collection;
import java.util.List;

public final class c implements b {
    public j a;

    /* renamed from: b  reason: collision with root package name */
    public final y0 f9408b;

    public c(y0 y0Var) {
        i.e(y0Var, "projection");
        this.f9408b = y0Var;
        j1 b2 = y0Var.b();
        j1 j1Var = j1.INVARIANT;
    }

    public v0 a(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        y0 a2 = this.f9408b.a(fVar);
        i.d(a2, "projection.refine(kotlinTypeRefiner)");
        return new c(a2);
    }

    public boolean b() {
        return false;
    }

    public y0 c() {
        return this.f9408b;
    }

    public /* bridge */ /* synthetic */ h d() {
        return null;
    }

    public List<r0> g() {
        return o.f7934h;
    }

    public Collection<d0> h() {
        Object d = this.f9408b.b() == j1.OUT_VARIANCE ? this.f9408b.d() : v().p();
        i.d(d, "if (projection.projectio… builtIns.nullableAnyType");
        return a.l2(d);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("CapturedTypeConstructor(");
        y.append(this.f9408b);
        y.append(')');
        return y.toString();
    }

    public g v() {
        g v = this.f9408b.d().W0().v();
        i.d(v, "projection.type.constructor.builtIns");
        return v;
    }
}
