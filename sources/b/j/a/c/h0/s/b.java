package b.j.a.c.h0.s;

import b.e.a.a.a;
import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.c.h0.c;
import b.j.a.c.h0.t.d;
import b.j.a.c.j0.r;
import b.j.a.c.k;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import java.io.Closeable;
import java.util.Set;

public class b extends d {
    public final d s;

    public b(d dVar) {
        super(dVar, (j) null, dVar.f2095n);
        this.s = dVar;
    }

    public b(d dVar, j jVar, Object obj) {
        super(dVar, jVar, obj);
        this.s = dVar;
    }

    public b(d dVar, Set<String> set) {
        super(dVar, set);
        this.s = dVar;
    }

    public final void A(Object obj, f fVar, y yVar) {
        String str = "[anySetter]";
        c[] cVarArr = this.f2093l;
        if (cVarArr == null || yVar.f2321i == null) {
            cVarArr = this.f2092k;
        }
        try {
            for (c cVar : cVarArr) {
                if (cVar == null) {
                    fVar.u0();
                } else {
                    cVar.i(obj, fVar, yVar);
                }
            }
        } catch (Exception e2) {
            if (0 != cVarArr.length) {
                str = cVarArr[0].f2037k.f1484h;
            }
            o(yVar, e2, obj, str);
            throw null;
        } catch (StackOverflowError e3) {
            k kVar = new k((Closeable) fVar, "Infinite recursion (StackOverflowError)", (Throwable) e3);
            if (0 != cVarArr.length) {
                str = cVarArr[0].f2037k.f1484h;
            }
            kVar.e(new k.a(obj, str));
            throw kVar;
        }
    }

    public boolean e() {
        return false;
    }

    public final void f(Object obj, f fVar, y yVar) {
        if (yVar.K(x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
            c[] cVarArr = this.f2093l;
            if (cVarArr == null || yVar.f2321i == null) {
                cVarArr = this.f2092k;
            }
            boolean z = true;
            if (cVarArr.length != 1) {
                z = false;
            }
            if (z) {
                A(obj, fVar, yVar);
                return;
            }
        }
        fVar.L0();
        fVar.Y(obj);
        A(obj, fVar, yVar);
        fVar.q0();
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        if (this.f2097p != null) {
            q(obj, fVar, yVar, fVar2);
            return;
        }
        fVar.Y(obj);
        b.j.a.b.v.b t = t(fVar2, obj, l.START_ARRAY);
        fVar2.e(fVar, t);
        A(obj, fVar, yVar);
        fVar2.f(fVar, t);
    }

    public n<Object> h(r rVar) {
        return this.s.h(rVar);
    }

    public String toString() {
        return a.d(this.f2137h, a.y("BeanAsArraySerializer for "));
    }

    public d u() {
        return this;
    }

    public d x(Object obj) {
        return new b(this, this.f2097p, obj);
    }

    public d y(Set set) {
        return new b(this, set);
    }

    public d z(j jVar) {
        return this.s.z(jVar);
    }
}
