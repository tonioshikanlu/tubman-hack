package e.a.a.a.y0.m;

import b.e.a.a.a;
import e.a.a.a.y0.m.g;
import e.a.a.a.y0.m.l1.b;
import e.a.a.a.y0.m.n1.h;
import e.x.b.l;
import e.x.c.i;
import java.util.ArrayDeque;
import java.util.Set;

public final class c {
    public static final boolean a(g gVar, h hVar, g.a aVar) {
        g.a.c cVar = g.a.c.a;
        i.e(gVar, "$this$hasNotNullSupertype");
        i.e(hVar, "type");
        i.e(aVar, "supertypesPolicy");
        if (!((gVar.K(hVar) && !((b) gVar).f(hVar)) || gVar.L(hVar))) {
            gVar.J();
            ArrayDeque<h> arrayDeque = gVar.c;
            i.c(arrayDeque);
            Set<h> set = gVar.d;
            i.c(set);
            arrayDeque.push(hVar);
            while (!arrayDeque.isEmpty()) {
                if (set.size() <= 1000) {
                    h pop = arrayDeque.pop();
                    i.d(pop, "current");
                    if (set.add(pop)) {
                        b bVar = (b) gVar;
                        g.a.c cVar2 = bVar.f(pop) ? cVar : aVar;
                        if (!(!i.a(cVar2, cVar))) {
                            cVar2 = null;
                        }
                        if (cVar2 != null) {
                            for (e.a.a.a.y0.m.n1.g a : bVar.e0(bVar.d(pop))) {
                                h a2 = cVar2.a(gVar, a);
                                if ((gVar.K(a2) && !bVar.f(a2)) || gVar.L(a2)) {
                                    gVar.E();
                                } else {
                                    arrayDeque.add(a2);
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                } else {
                    StringBuilder D = a.D("Too many supertypes for type: ", hVar, ". Supertypes = ");
                    D.append(e.t.g.x(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63));
                    throw new IllegalStateException(D.toString().toString());
                }
            }
            gVar.E();
            return false;
        }
        return true;
    }
}
