package e.a.a.a.y0.j.t;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.x.c.i;
import java.util.Objects;

public final class u extends r<Long> {
    public u(long j2) {
        super(Long.valueOf(j2));
    }

    public d0 a(w wVar) {
        i.e(wVar, "module");
        g v = wVar.v();
        Objects.requireNonNull(v);
        k0 u = v.u(e.a.a.a.y0.a.i.LONG);
        if (u != null) {
            i.d(u, "module.builtIns.longType");
            return u;
        }
        g.a(61);
        throw null;
    }

    public String toString() {
        return ((Number) this.a).longValue() + ".toLong()";
    }
}
