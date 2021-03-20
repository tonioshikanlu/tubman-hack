package e.a.a.a.y0.d.b;

import e.a.a.a.y0.d.a.b0.o.k;
import e.a.a.a.y0.e.a0.a;
import e.a.a.a.y0.k.b.q;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.w;
import e.x.c.i;

public final class f implements q {
    public static final f a = new f();

    public d0 a(e.a.a.a.y0.e.q qVar, String str, k0 k0Var, k0 k0Var2) {
        i.e(qVar, "proto");
        i.e(str, "flexibleId");
        i.e(k0Var, "lowerBound");
        i.e(k0Var2, "upperBound");
        if (!(!i.a(str, "kotlin.jvm.PlatformType"))) {
            return qVar.m(a.f8684g) ? new k(k0Var, k0Var2) : e0.c(k0Var, k0Var2);
        }
        k0 d = w.d("Error java flexible type with id: " + str + ". (" + k0Var + ".." + k0Var2 + ')');
        i.d(d, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
        return d;
    }
}
