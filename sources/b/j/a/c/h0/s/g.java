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
import java.util.List;

@a
public final class g extends j0<List<String>> {

    /* renamed from: k  reason: collision with root package name */
    public static final g f2053k = new g();

    public g() {
        super(List.class);
    }

    public g(g gVar, Boolean bool) {
        super(gVar, bool);
    }

    public void f(Object obj, f fVar, y yVar) {
        List list = (List) obj;
        int size = list.size();
        if (size != 1 || ((this.f2116j != null || !yVar.K(x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.f2116j != Boolean.TRUE)) {
            fVar.M0(size);
            r(list, fVar, yVar, size);
            fVar.q0();
            return;
        }
        r(list, fVar, yVar, 1);
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        List list = (List) obj;
        b e2 = fVar2.e(fVar, fVar2.d(list, l.START_ARRAY));
        r(list, fVar, yVar, list.size());
        fVar2.f(fVar, e2);
    }

    public n<?> q(d dVar, Boolean bool) {
        return new g(this, bool);
    }

    public final void r(List<String> list, f fVar, y yVar, int i2) {
        fVar.Y(list);
        int i3 = 0;
        while (i3 < i2) {
            try {
                String str = list.get(i3);
                if (str == null) {
                    yVar.t(fVar);
                } else {
                    fVar.Q0(str);
                }
                i3++;
            } catch (Exception e2) {
                n(yVar, e2, list, i3);
                throw null;
            }
        }
    }
}
