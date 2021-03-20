package e.a.a.a.y0.j.s.a;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.n1.c;
import e.a.a.a.y0.m.r0;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.w;
import e.a.a.a.y0.m.y0;
import e.t.o;
import e.x.c.i;
import java.util.List;

public final class a extends k0 implements r0, c {

    /* renamed from: i  reason: collision with root package name */
    public final y0 f9404i;

    /* renamed from: j  reason: collision with root package name */
    public final b f9405j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9406k;

    /* renamed from: l  reason: collision with root package name */
    public final h f9407l;

    public a(y0 y0Var, b bVar, boolean z, h hVar) {
        i.e(y0Var, "typeProjection");
        i.e(bVar, "constructor");
        i.e(hVar, "annotations");
        this.f9404i = y0Var;
        this.f9405j = bVar;
        this.f9406k = z;
        this.f9407l = hVar;
    }

    public d0 P0() {
        j1 j1Var = j1.OUT_VARIANCE;
        d0 p2 = e.a.a.a.y0.m.o1.c.D(this).p();
        i.d(p2, "builtIns.nullableAnyType");
        if (this.f9404i.b() == j1Var) {
            p2 = this.f9404i.d();
        }
        i.d(p2, "if (typeProjection.proje…jection.type else default");
        return p2;
    }

    public boolean R0(d0 d0Var) {
        i.e(d0Var, "type");
        return this.f9405j == d0Var.W0();
    }

    public List<y0> V0() {
        return o.f7934h;
    }

    public v0 W0() {
        return this.f9405j;
    }

    public boolean X0() {
        return this.f9406k;
    }

    public i1 a1(boolean z) {
        if (z == this.f9406k) {
            return this;
        }
        return new a(this.f9404i, this.f9405j, z, this.f9407l);
    }

    public i1 c1(h hVar) {
        i.e(hVar, "newAnnotations");
        return new a(this.f9404i, this.f9405j, this.f9406k, hVar);
    }

    public k0 d1(boolean z) {
        if (z == this.f9406k) {
            return this;
        }
        return new a(this.f9404i, this.f9405j, z, this.f9407l);
    }

    public k0 e1(h hVar) {
        i.e(hVar, "newAnnotations");
        return new a(this.f9404i, this.f9405j, this.f9406k, hVar);
    }

    /* renamed from: f1 */
    public a b1(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        y0 a = this.f9404i.a(fVar);
        i.d(a, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(a, this.f9405j, this.f9406k, this.f9407l);
    }

    public h k() {
        return this.f9407l;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Captured(");
        y.append(this.f9404i);
        y.append(')');
        y.append(this.f9406k ? "?" : "");
        return y.toString();
    }

    public d0 w0() {
        j1 j1Var = j1.IN_VARIANCE;
        d0 o2 = e.a.a.a.y0.m.o1.c.D(this).o();
        i.d(o2, "builtIns.nothingType");
        if (this.f9404i.b() == j1Var) {
            o2 = this.f9404i.d();
        }
        i.d(o2, "if (typeProjection.proje…jection.type else default");
        return o2;
    }

    public e.a.a.a.y0.j.y.i z() {
        e.a.a.a.y0.j.y.i c = w.c("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        i.d(c, "ErrorUtils.createErrorSc…solution\", true\n        )");
        return c;
    }
}
