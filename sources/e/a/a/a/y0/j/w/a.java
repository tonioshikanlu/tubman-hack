package e.a.a.a.y0.j.w;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.l;
import e.a.a.a.y0.c.a.d;
import e.a.a.a.y0.d.a.b0.g;
import e.a.a.a.y0.d.a.b0.n.j;
import e.a.a.a.y0.d.a.d0.a0;
import e.a.a.a.y0.d.a.z.g;
import e.a.a.a.y0.f.b;
import e.x.c.i;
import java.util.Objects;

public final class a {
    public final g a;

    /* renamed from: b  reason: collision with root package name */
    public final e.a.a.a.y0.d.a.z.g f9425b;

    public a(g gVar, e.a.a.a.y0.d.a.z.g gVar2) {
        i.e(gVar, "packageFragmentProvider");
        i.e(gVar2, "javaResolverCache");
        this.a = gVar;
        this.f9425b = gVar2;
    }

    public final e a(e.a.a.a.y0.d.a.d0.g gVar) {
        i.e(gVar, "javaClass");
        b e2 = gVar.e();
        l lVar = null;
        if (e2 == null || gVar.G() != a0.SOURCE) {
            e.a.a.a.y0.d.a.d0.g p2 = gVar.p();
            if (p2 != null) {
                e a2 = a(p2);
                e.a.a.a.y0.j.y.i v0 = a2 != null ? a2.v0() : null;
                l b2 = v0 != null ? v0.b(gVar.getName(), d.FROM_JAVA_LOADER) : null;
                if (b2 instanceof e) {
                    lVar = b2;
                }
                return (e) lVar;
            } else if (e2 == null) {
                return null;
            } else {
                g gVar2 = this.a;
                b e3 = e2.e();
                i.d(e3, "fqName.parent()");
                e.a.a.a.y0.d.a.b0.n.i iVar = (e.a.a.a.y0.d.a.b0.n.i) e.t.g.q(gVar2.a(e3));
                if (iVar == null) {
                    return null;
                }
                i.e(gVar, "jClass");
                j jVar = iVar.f8409o.f8375b;
                Objects.requireNonNull(jVar);
                i.e(gVar, "javaClass");
                return jVar.u(gVar.getName(), gVar);
            }
        } else {
            Objects.requireNonNull((g.a) this.f9425b);
            return null;
        }
    }
}
