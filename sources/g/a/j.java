package g.a;

import b.e.a.a.a;
import e.r;
import e.v.d;
import g.a.a.f;

public final class j extends a1<y0> {

    /* renamed from: l  reason: collision with root package name */
    public final h<?> f9956l;

    public j(y0 y0Var, h<?> hVar) {
        super(y0Var);
        this.f9956l = hVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return r.a;
    }

    public void n(Throwable th) {
        h<?> hVar = this.f9956l;
        Throwable n2 = hVar.n(this.f9930k);
        boolean z = false;
        if (hVar.f9954j == 2) {
            d<T> dVar = hVar.f9953l;
            if (!(dVar instanceof f)) {
                dVar = null;
            }
            f fVar = (f) dVar;
            if (fVar != null) {
                z = fVar.k(n2);
            }
        }
        if (!z) {
            hVar.k(n2);
            hVar.l();
        }
    }

    public String toString() {
        StringBuilder y = a.y("ChildContinuation[");
        y.append(this.f9956l);
        y.append(']');
        return y.toString();
    }
}
