package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.e.j;
import e.a.a.a.y0.e.k;
import e.a.a.a.y0.e.x;
import e.x.c.i;

public final class z {
    public static final b.a a(j jVar) {
        int ordinal;
        b.a aVar = b.a.DECLARATION;
        return (jVar == null || (ordinal = jVar.ordinal()) == 0) ? aVar : ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? aVar : b.a.SYNTHESIZED : b.a.DELEGATION : b.a.FAKE_OVERRIDE;
    }

    public static final v b(k kVar) {
        int ordinal;
        v vVar = v.FINAL;
        return (kVar == null || (ordinal = kVar.ordinal()) == 0) ? vVar : ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? vVar : v.SEALED : v.ABSTRACT : v.OPEN;
    }

    public static final z0 c(x xVar) {
        z0 z0Var;
        if (xVar != null) {
            int ordinal = xVar.ordinal();
            if (ordinal == 0) {
                z0Var = y0.d;
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    z0Var = y0.c;
                } else if (ordinal == 3) {
                    z0Var = y0.f7850e;
                } else if (ordinal == 4) {
                    z0Var = y0.f7849b;
                } else if (ordinal == 5) {
                    z0Var = y0.f;
                }
            }
            i.d(z0Var, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
            return z0Var;
        }
        z0Var = y0.a;
        i.d(z0Var, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
        return z0Var;
    }
}
