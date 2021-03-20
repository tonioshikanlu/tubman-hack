package e.a.a.a.y0.j.t;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.x.b.l;
import e.x.c.i;
import java.util.List;

public final class b extends g<List<? extends g<?>>> {

    /* renamed from: b  reason: collision with root package name */
    public final l<w, d0> f9410b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(List<? extends g<?>> list, l<? super w, ? extends d0> lVar) {
        super(list);
        i.e(list, "value");
        i.e(lVar, "computeType");
        this.f9410b = lVar;
    }

    public d0 a(w wVar) {
        i.e(wVar, "module");
        d0 invoke = this.f9410b.invoke(wVar);
        if (!g.A(invoke)) {
            h d = invoke.W0().d();
            if (d == null || g.s(d) == null) {
            }
        }
        return invoke;
    }
}
