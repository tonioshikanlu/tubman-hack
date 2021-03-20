package e.a.a.a.y0.j.t;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.x.c.i;
import java.util.Objects;

public final class w extends r<Short> {
    public w(short s) {
        super(Short.valueOf(s));
    }

    public d0 a(e.a.a.a.y0.b.w wVar) {
        i.e(wVar, "module");
        g v = wVar.v();
        Objects.requireNonNull(v);
        k0 u = v.u(e.a.a.a.y0.a.i.SHORT);
        if (u != null) {
            i.d(u, "module.builtIns.shortType");
            return u;
        }
        g.a(59);
        throw null;
    }

    public String toString() {
        return ((Number) this.a).shortValue() + ".toShort()";
    }
}
