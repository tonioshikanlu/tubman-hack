package b.j.a.c.h0.s;

import b.j.a.a.r;
import b.j.a.b.f;
import b.j.a.b.s.i;
import b.j.a.c.h0.c;
import b.j.a.c.j0.r;
import b.j.a.c.n;
import b.j.a.c.y;
import java.io.Serializable;
import java.lang.reflect.Method;

public class r extends c implements Serializable {
    public final b.j.a.c.j0.r C;

    public r(c cVar, b.j.a.c.j0.r rVar) {
        super(cVar, cVar.f2037k);
        this.C = rVar;
    }

    public r(r rVar, b.j.a.c.j0.r rVar2, i iVar) {
        super((c) rVar, iVar);
        this.C = rVar2;
    }

    public n<Object> a(l lVar, Class<?> cls, y yVar) {
        b.j.a.c.i iVar = this.f2041o;
        n<Object> z = iVar != null ? yVar.z(yVar.d(iVar, cls), this) : yVar.A(cls, this);
        b.j.a.c.j0.r rVar = this.C;
        if (z.e() && (z instanceof s)) {
            rVar = new r.a(rVar, ((s) z).s);
        }
        n<Object> h2 = z.h(rVar);
        this.w = this.w.b(cls, h2);
        return h2;
    }

    public void f(n<Object> nVar) {
        if (nVar != null) {
            b.j.a.c.j0.r rVar = this.C;
            if (nVar.e() && (nVar instanceof s)) {
                rVar = new r.a(rVar, ((s) nVar).s);
            }
            nVar = nVar.h(rVar);
        }
        super.f(nVar);
    }

    public c g(b.j.a.c.j0.r rVar) {
        return new r(this, new r.a(rVar, this.C), new i(rVar.a(this.f2037k.f1484h)));
    }

    public void k(Object obj, f fVar, y yVar) {
        Method method = this.r;
        Object invoke = method == null ? this.s.get(obj) : method.invoke(obj, (Object[]) null);
        if (invoke != null) {
            n<Object> nVar = this.t;
            if (nVar == null) {
                Class<?> cls = invoke.getClass();
                l lVar = this.w;
                n<Object> c = lVar.c(cls);
                nVar = c == null ? a(lVar, cls, yVar) : c;
            }
            Object obj2 = this.y;
            if (obj2 != null) {
                if (r.a.NON_EMPTY == obj2) {
                    if (nVar.d(yVar, invoke)) {
                        return;
                    }
                } else if (obj2.equals(invoke)) {
                    return;
                }
            }
            if (invoke == obj) {
                b(yVar, nVar);
            }
            if (!nVar.e()) {
                fVar.s0(this.f2037k);
            }
            b.j.a.c.f0.f fVar2 = this.v;
            if (fVar2 == null) {
                nVar.f(invoke, fVar, yVar);
            } else {
                nVar.g(invoke, fVar, yVar, fVar2);
            }
        }
    }
}
