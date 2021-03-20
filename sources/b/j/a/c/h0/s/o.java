package b.j.a.c.h0.s;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.d;
import b.j.a.c.h0.t.j0;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.util.Collection;

@a
public class o extends j0<Collection<String>> {

    /* renamed from: k  reason: collision with root package name */
    public static final o f2077k = new o();

    public o() {
        super(Collection.class);
    }

    public o(o oVar, Boolean bool) {
        super(oVar, bool);
    }

    public void f(Object obj, f fVar, y yVar) {
        Collection collection = (Collection) obj;
        fVar.Y(collection);
        int size = collection.size();
        if (size != 1 || ((this.f2116j != null || !yVar.K(x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.f2116j != Boolean.TRUE)) {
            fVar.M0(size);
            r(collection, fVar, yVar);
            fVar.q0();
            return;
        }
        r(collection, fVar, yVar);
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        Collection collection = (Collection) obj;
        fVar.Y(collection);
        b e2 = fVar2.e(fVar, fVar2.d(collection, l.START_ARRAY));
        r(collection, fVar, yVar);
        fVar2.f(fVar, e2);
    }

    public n<?> q(d dVar, Boolean bool) {
        return new o(this, bool);
    }

    public final void r(Collection<String> collection, f fVar, y yVar) {
        int i2 = 0;
        try {
            for (String next : collection) {
                if (next == null) {
                    yVar.t(fVar);
                } else {
                    fVar.Q0(next);
                }
                i2++;
            }
        } catch (Exception e2) {
            n(yVar, e2, collection, 0);
            throw null;
        }
    }
}
