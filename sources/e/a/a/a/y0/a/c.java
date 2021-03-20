package e.a.a.a.y0.a;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.b;
import e.x.c.i;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class c {
    public static final LinkedHashSet<a> a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f7640b = null;

    static {
        Set<i> set = i.t;
        i.d(set, "PrimitiveType.NUMBER_TYPES");
        ArrayList arrayList = new ArrayList(b.q.a.a.C(set, 10));
        for (i t : set) {
            arrayList.add(g.t(t));
        }
        g.d dVar = g.f7647k;
        List<b> J = e.t.g.J(e.t.g.J(e.t.g.J(arrayList, dVar.f.i()), dVar.f7656h.i()), dVar.f7665q.i());
        LinkedHashSet<a> linkedHashSet = new LinkedHashSet<>();
        for (b l2 : J) {
            linkedHashSet.add(a.l(l2));
        }
        a = linkedHashSet;
    }

    public static final boolean a(e eVar) {
        i.e(eVar, "classDescriptor");
        if (e.a.a.a.y0.j.g.p(eVar)) {
            LinkedHashSet<a> linkedHashSet = a;
            a g2 = e.a.a.a.y0.j.v.b.g(eVar);
            if (e.t.g.e(linkedHashSet, g2 != null ? g2.g() : null)) {
                return true;
            }
        }
        return false;
    }
}
