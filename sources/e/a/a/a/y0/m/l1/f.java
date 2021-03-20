package e.a.a.a.y0.m.l1;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.j0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.v0;
import e.x.c.i;
import java.util.Collection;

public abstract class f {

    public static final class a extends f {
        public static final a a = new a();

        public e a(e.a.a.a.y0.f.a aVar) {
            i.e(aVar, "classId");
            return null;
        }

        public <S extends e.a.a.a.y0.j.y.i> S b(e eVar, e.x.b.a<? extends S> aVar) {
            i.e(eVar, "classDescriptor");
            i.e(aVar, "compute");
            return (e.a.a.a.y0.j.y.i) ((j0.b) aVar).e();
        }

        public boolean c(w wVar) {
            i.e(wVar, "moduleDescriptor");
            return false;
        }

        public boolean d(v0 v0Var) {
            i.e(v0Var, "typeConstructor");
            return false;
        }

        public h e(k kVar) {
            i.e(kVar, "descriptor");
            return null;
        }

        public Collection<d0> f(e eVar) {
            i.e(eVar, "classDescriptor");
            v0 p2 = eVar.p();
            i.d(p2, "classDescriptor.typeConstructor");
            Collection<d0> h2 = p2.h();
            i.d(h2, "classDescriptor.typeConstructor.supertypes");
            return h2;
        }

        public d0 g(d0 d0Var) {
            i.e(d0Var, "type");
            return d0Var;
        }
    }

    public abstract e a(e.a.a.a.y0.f.a aVar);

    public abstract <S extends e.a.a.a.y0.j.y.i> S b(e eVar, e.x.b.a<? extends S> aVar);

    public abstract boolean c(w wVar);

    public abstract boolean d(v0 v0Var);

    public abstract h e(k kVar);

    public abstract Collection<d0> f(e eVar);

    public abstract d0 g(d0 d0Var);
}
