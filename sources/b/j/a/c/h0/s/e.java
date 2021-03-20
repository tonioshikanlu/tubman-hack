package b.j.a.c.h0.s;

import b.j.a.b.f;
import b.j.a.c.h0.c;
import b.j.a.c.j0.r;
import b.j.a.c.n;
import b.j.a.c.y;
import java.io.Serializable;
import java.util.Objects;

public final class e extends c implements Serializable {
    public final c C;
    public final Class<?> D;

    public e(c cVar, Class<?> cls) {
        super(cVar, cVar.f2037k);
        this.C = cVar;
        this.D = cls;
    }

    public void c(n<Object> nVar) {
        this.C.c(nVar);
    }

    public void f(n<Object> nVar) {
        this.C.f(nVar);
    }

    public c g(r rVar) {
        return new e(this.C.g(rVar), this.D);
    }

    public void i(Object obj, f fVar, y yVar) {
        Class<?> cls = yVar.f2321i;
        if (cls == null || this.D.isAssignableFrom(cls)) {
            this.C.i(obj, fVar, yVar);
            return;
        }
        n<Object> nVar = this.C.u;
        if (nVar != null) {
            nVar.f(null, fVar, yVar);
        } else {
            fVar.u0();
        }
    }

    public void k(Object obj, f fVar, y yVar) {
        Class<?> cls = yVar.f2321i;
        if (cls == null || this.D.isAssignableFrom(cls)) {
            this.C.k(obj, fVar, yVar);
            return;
        }
        Objects.requireNonNull(this.C);
        Objects.requireNonNull(fVar);
    }
}
