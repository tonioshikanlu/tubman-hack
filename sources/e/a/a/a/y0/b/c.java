package e.a.a.a.y0.b;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.v0;
import e.x.c.i;
import java.util.List;

public final class c implements r0 {

    /* renamed from: h  reason: collision with root package name */
    public final r0 f7815h;

    /* renamed from: i  reason: collision with root package name */
    public final k f7816i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7817j;

    public c(r0 r0Var, k kVar, int i2) {
        i.e(r0Var, "originalDescriptor");
        i.e(kVar, "declarationDescriptor");
        this.f7815h = r0Var;
        this.f7816i = kVar;
        this.f7817j = i2;
    }

    public m M() {
        return this.f7815h.M();
    }

    public boolean Y() {
        return true;
    }

    public boolean Z() {
        return this.f7815h.Z();
    }

    public r0 a() {
        r0 a = this.f7815h.a();
        i.d(a, "originalDescriptor.original");
        return a;
    }

    public k b() {
        return this.f7816i;
    }

    public d getName() {
        return this.f7815h.getName();
    }

    public List<d0> getUpperBounds() {
        return this.f7815h.getUpperBounds();
    }

    public int h() {
        return this.f7815h.h() + this.f7817j;
    }

    public h k() {
        return this.f7815h.k();
    }

    public <R, D> R l0(m<R, D> mVar, D d) {
        return this.f7815h.l0(mVar, d);
    }

    public v0 p() {
        return this.f7815h.p();
    }

    public k0 s() {
        return this.f7815h.s();
    }

    public String toString() {
        return this.f7815h + "[inner-copy]";
    }

    public j1 u() {
        return this.f7815h.u();
    }

    public m0 w() {
        return this.f7815h.w();
    }
}
