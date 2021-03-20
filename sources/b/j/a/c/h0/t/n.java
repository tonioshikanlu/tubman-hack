package b.j.a.c.h0.t;

import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.h;
import b.j.a.c.i;
import b.j.a.c.x;
import b.j.a.c.y;
import java.util.EnumSet;
import java.util.Iterator;

public class n extends b<EnumSet<? extends Enum<?>>> {
    public n(n nVar, d dVar, f fVar, b.j.a.c.n<?> nVar2, Boolean bool) {
        super((b<?>) nVar, dVar, fVar, nVar2, bool);
    }

    public n(i iVar) {
        super((Class<?>) EnumSet.class, iVar, true, (f) null, (b.j.a.c.n<Object>) null);
    }

    public boolean d(y yVar, Object obj) {
        return ((EnumSet) obj).isEmpty();
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        EnumSet enumSet = (EnumSet) obj;
        int size = enumSet.size();
        if (size != 1 || ((this.f2086m != null || !yVar.K(x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.f2086m != Boolean.TRUE)) {
            fVar.M0(size);
            u(enumSet, fVar, yVar);
            fVar.q0();
            return;
        }
        u(enumSet, fVar, yVar);
    }

    public h q(f fVar) {
        return this;
    }

    public b v(d dVar, f fVar, b.j.a.c.n nVar, Boolean bool) {
        return new n(this, dVar, fVar, nVar, bool);
    }

    /* renamed from: w */
    public void u(EnumSet<? extends Enum<?>> enumSet, b.j.a.b.f fVar, y yVar) {
        b.j.a.c.n<Object> nVar = this.f2088o;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum enumR = (Enum) it.next();
            if (nVar == null) {
                nVar = yVar.A(enumR.getDeclaringClass(), this.f2084k);
            }
            nVar.f(enumR, fVar, yVar);
        }
    }
}
