package e.a.a.a.y0.a;

import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.f1;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public final class n {
    public static final Set<d> a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<a, a> f7689b = new HashMap<>();
    public static final HashMap<a, a> c = new HashMap<>();
    public static final Set<d> d;

    /* renamed from: e  reason: collision with root package name */
    public static final n f7690e = new n();

    static {
        m[] values = m.values();
        ArrayList arrayList = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(values[i2].f7686h);
        }
        a = g.d0(arrayList);
        m[] values2 = m.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i3 = 0; i3 < 4; i3++) {
            linkedHashSet.add(values2[i3].f7687i.j());
        }
        d = linkedHashSet;
        m[] values3 = m.values();
        for (int i4 = 0; i4 < 4; i4++) {
            m mVar = values3[i4];
            f7689b.put(mVar.f7687i, mVar.f7688j);
            c.put(mVar.f7688j, mVar.f7687i);
        }
    }

    public static final boolean a(d0 d0Var) {
        h d2;
        i.e(d0Var, "type");
        if (f1.q(d0Var) || (d2 = d0Var.W0().d()) == null) {
            return false;
        }
        i.d(d2, "type.constructor.declara…escriptor ?: return false");
        i.e(d2, "descriptor");
        k b2 = d2.b();
        return (b2 instanceof y) && i.a(((y) b2).e(), g.f) && a.contains(d2.getName());
    }
}
