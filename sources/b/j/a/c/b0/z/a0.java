package b.j.a.c.b0.z;

import b.j.a.b.i;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.j;
import java.io.Serializable;
import java.util.Collection;

public final class a0 extends j<Object> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final c f1806h;

    /* renamed from: i  reason: collision with root package name */
    public final j<Object> f1807i;

    public a0(c cVar, j<?> jVar) {
        this.f1806h = cVar;
        this.f1807i = jVar;
    }

    public Object c(g gVar) {
        return this.f1807i.c(gVar);
    }

    public Object d(i iVar, g gVar) {
        return this.f1807i.f(iVar, gVar, this.f1806h);
    }

    public Object e(i iVar, g gVar, Object obj) {
        return this.f1807i.e(iVar, gVar, obj);
    }

    public Object f(i iVar, g gVar, c cVar) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    public Object i(g gVar) {
        return this.f1807i.i(gVar);
    }

    public Collection<Object> j() {
        return this.f1807i.j();
    }

    public Class<?> l() {
        return this.f1807i.l();
    }

    public Boolean n(f fVar) {
        return this.f1807i.n(fVar);
    }
}
