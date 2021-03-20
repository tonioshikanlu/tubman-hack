package e.a.a.a.y0.j.t;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.x.c.i;
import java.util.Objects;

public final class j extends g<Double> {
    public j(double d) {
        super(Double.valueOf(d));
    }

    public d0 a(w wVar) {
        i.e(wVar, "module");
        g v = wVar.v();
        Objects.requireNonNull(v);
        k0 u = v.u(e.a.a.a.y0.a.i.DOUBLE);
        if (u != null) {
            i.d(u, "module.builtIns.doubleType");
            return u;
        }
        g.a(63);
        throw null;
    }

    public String toString() {
        return ((Number) this.a).doubleValue() + ".toDouble()";
    }
}
