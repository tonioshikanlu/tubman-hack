package e.a.a.a.y0.j.y;

import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.c.a.b;
import e.a.a.a.y0.f.d;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

public abstract class a implements i {
    public Collection<l0> a(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return i().a(dVar, bVar);
    }

    public h b(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return i().b(dVar, bVar);
    }

    public Collection<k> c(d dVar, l<? super d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        return i().c(dVar, lVar);
    }

    public Collection<f0> d(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return i().d(dVar, bVar);
    }

    public Set<d> e() {
        return i().e();
    }

    public Set<d> f() {
        return i().f();
    }

    public Set<d> g() {
        return i().g();
    }

    public final i h() {
        if (!(i() instanceof a)) {
            return i();
        }
        i i2 = i();
        Objects.requireNonNull(i2, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((a) i2).h();
    }

    public abstract i i();
}
