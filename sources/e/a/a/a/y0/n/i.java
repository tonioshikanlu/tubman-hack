package e.a.a.a.y0.n;

import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.j.v.b;
import e.a.a.a.y0.m.o1.c;
import java.util.List;

public final class i implements b {
    public static final i a = new i();

    public String a(s sVar) {
        e.x.c.i.e(sVar, "functionDescriptor");
        return c.J(this, sVar);
    }

    public boolean b(s sVar) {
        boolean z;
        e.x.c.i.e(sVar, "functionDescriptor");
        List<w0> n2 = sVar.n();
        e.x.c.i.d(n2, "functionDescriptor.valueParameters");
        if (!n2.isEmpty()) {
            for (w0 w0Var : n2) {
                e.x.c.i.d(w0Var, "it");
                if (b.a(w0Var) || w0Var.R() != null) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
