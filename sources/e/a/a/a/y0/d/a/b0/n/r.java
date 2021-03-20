package e.a.a.a.y0.d.a.b0.n;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.o.b;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;
import java.util.Set;

public final class r extends b<e, e.r> {
    public final /* synthetic */ e a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f8455b;
    public final /* synthetic */ l c;

    public r(e eVar, Set set, l lVar) {
        this.a = eVar;
        this.f8455b = set;
        this.c = lVar;
    }

    public Object a() {
        return e.r.a;
    }

    public boolean c(Object obj) {
        e eVar = (e) obj;
        i.e(eVar, "current");
        if (eVar == this.a) {
            return true;
        }
        e.a.a.a.y0.j.y.i y0 = eVar.y0();
        i.d(y0, "current.staticScope");
        if (!(y0 instanceof s)) {
            return true;
        }
        this.f8455b.addAll((Collection) this.c.invoke(y0));
        return false;
    }
}
