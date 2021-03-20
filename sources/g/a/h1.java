package g.a;

import e.a.a.a.y0.m.o1.c;
import g.a.a.m;

public abstract class h1 extends x {
    public abstract h1 o0();

    public final String p0() {
        h1 h1Var;
        x xVar = i0.a;
        h1 h1Var2 = m.f9916b;
        if (this == h1Var2) {
            return "Dispatchers.Main";
        }
        try {
            h1Var = h1Var2.o0();
        } catch (UnsupportedOperationException unused) {
            h1Var = null;
        }
        if (this == h1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String p0 = p0();
        if (p0 != null) {
            return p0;
        }
        return getClass().getSimpleName() + '@' + c.F(this);
    }
}
