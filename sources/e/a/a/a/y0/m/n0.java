package e.a.a.a.y0.m;

import b.q.a.a;
import e.x.c.i;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class n0 {
    public static final i1 a(i1 i1Var) {
        i.e(i1Var, "$this$makeDefinitelyNotNullOrNotNull");
        i1 i1 = p.i1(i1Var);
        if (i1 == null) {
            i1 = b(i1Var);
        }
        return i1 != null ? i1 : i1Var.a1(false);
    }

    public static final k0 b(d0 d0Var) {
        b0 b0Var;
        v0 W0 = d0Var.W0();
        if (!(W0 instanceof b0)) {
            W0 = null;
        }
        b0 b0Var2 = (b0) W0;
        if (b0Var2 != null) {
            LinkedHashSet<d0> linkedHashSet = b0Var2.f9648b;
            ArrayList arrayList = new ArrayList(a.C(linkedHashSet, 10));
            boolean z = false;
            for (d0 next : linkedHashSet) {
                if (f1.g(next)) {
                    z = true;
                    next = a(next.Z0());
                }
                arrayList.add(next);
            }
            if (!z) {
                b0Var = null;
            } else {
                d0 d0Var2 = b0Var2.a;
                if (d0Var2 == null) {
                    d0Var2 = null;
                } else if (f1.g(d0Var2)) {
                    d0Var2 = a(d0Var2.Z0());
                }
                i.e(arrayList, "typesToIntersect");
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                b0Var = new b0(linkedHashSet2);
                b0Var.a = d0Var2;
            }
            if (b0Var != null) {
                return b0Var.e();
            }
        }
        return null;
    }

    public static final k0 c(k0 k0Var, k0 k0Var2) {
        i.e(k0Var, "$this$withAbbreviation");
        i.e(k0Var2, "abbreviatedType");
        return a.I1(k0Var) ? k0Var : new a(k0Var, k0Var2);
    }
}
