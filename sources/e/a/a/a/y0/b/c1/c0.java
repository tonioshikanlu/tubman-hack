package e.a.a.a.y0.b.c1;

import b.e.a.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.f.b;
import e.x.c.i;
import java.util.Objects;

public abstract class c0 extends n implements y {

    /* renamed from: l  reason: collision with root package name */
    public final b f8173l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(w wVar, b bVar) {
        super(wVar, h.a.a, bVar.h(), m0.a);
        i.e(wVar, "module");
        i.e(bVar, "fqName");
        Objects.requireNonNull(h.f7785e);
        this.f8173l = bVar;
    }

    public w b() {
        k b2 = super.b();
        Objects.requireNonNull(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (w) b2;
    }

    public final b e() {
        return this.f8173l;
    }

    public <R, D> R l0(m<R, D> mVar, D d) {
        i.e(mVar, "visitor");
        return mVar.m(this, d);
    }

    public String toString() {
        StringBuilder y = a.y("package ");
        y.append(this.f8173l);
        return y.toString();
    }

    public m0 w() {
        m0 m0Var = m0.a;
        i.d(m0Var, "SourceElement.NO_SOURCE");
        return m0Var;
    }
}
