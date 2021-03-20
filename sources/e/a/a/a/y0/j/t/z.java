package e.a.a.a.y0.j.t;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.x.c.i;

public final class z extends c0<Integer> {
    public z(int i2) {
        super(Integer.valueOf(i2));
    }

    public d0 a(w wVar) {
        k0 s;
        i.e(wVar, "module");
        a aVar = g.f7647k.f0;
        i.d(aVar, "KotlinBuiltIns.FQ_NAMES.uInt");
        e l0 = b.q.a.a.l0(wVar, aVar);
        if (l0 != null && (s = l0.s()) != null) {
            return s;
        }
        k0 d = e.a.a.a.y0.m.w.d("Unsigned type UInt not found");
        i.d(d, "ErrorUtils.createErrorTy…ned type UInt not found\")");
        return d;
    }

    public String toString() {
        return ((Number) this.a).intValue() + ".toUInt()";
    }
}
