package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.c1.b;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.l1.f;
import e.x.b.l;

public class a implements l<f, k0> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b.a f8154h;

    public a(b.a aVar) {
        this.f8154h = aVar;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        h e2 = fVar.e(b.this);
        if (e2 == null) {
            return (k0) b.this.f8164i.e();
        }
        if (e2 instanceof q0) {
            return e0.b((q0) e2, f1.f(e2.p().g()));
        }
        return e2 instanceof v ? f1.p(e2.p().a(fVar), ((v) e2).e0(fVar), this) : e2.s();
    }
}
