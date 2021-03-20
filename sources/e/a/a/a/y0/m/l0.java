package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.w;
import e.x.b.l;
import java.util.List;
import java.util.Objects;

public final class l0 extends k0 {

    /* renamed from: i  reason: collision with root package name */
    public final v0 f9693i;

    /* renamed from: j  reason: collision with root package name */
    public final List<y0> f9694j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9695k;

    /* renamed from: l  reason: collision with root package name */
    public final i f9696l;

    /* renamed from: m  reason: collision with root package name */
    public final l<f, k0> f9697m;

    public l0(v0 v0Var, List<? extends y0> list, boolean z, i iVar, l<? super f, ? extends k0> lVar) {
        e.x.c.i.e(v0Var, "constructor");
        e.x.c.i.e(list, "arguments");
        e.x.c.i.e(iVar, "memberScope");
        e.x.c.i.e(lVar, "refinedTypeFactory");
        this.f9693i = v0Var;
        this.f9694j = list;
        this.f9695k = z;
        this.f9696l = iVar;
        this.f9697m = lVar;
        if (iVar instanceof w.d) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + iVar + 10 + v0Var);
        }
    }

    public List<y0> V0() {
        return this.f9694j;
    }

    public v0 W0() {
        return this.f9693i;
    }

    public boolean X0() {
        return this.f9695k;
    }

    public d0 Y0(f fVar) {
        e.x.c.i.e(fVar, "kotlinTypeRefiner");
        k0 invoke = this.f9697m.invoke(fVar);
        return invoke != null ? invoke : this;
    }

    public i1 b1(f fVar) {
        e.x.c.i.e(fVar, "kotlinTypeRefiner");
        k0 invoke = this.f9697m.invoke(fVar);
        return invoke != null ? invoke : this;
    }

    public k0 d1(boolean z) {
        if (z == this.f9695k) {
            return this;
        }
        return z ? new i0(this) : new h0(this);
    }

    /* renamed from: e1 */
    public k0 c1(h hVar) {
        e.x.c.i.e(hVar, "newAnnotations");
        return hVar.isEmpty() ? this : new m(this, hVar);
    }

    public h k() {
        Objects.requireNonNull(h.f7785e);
        return h.a.a;
    }

    public i z() {
        return this.f9696l;
    }
}
