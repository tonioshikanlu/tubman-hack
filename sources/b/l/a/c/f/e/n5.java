package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class n5 extends g2<a6, y5> {
    public n5(Class cls) {
        super(cls);
    }

    public final void a(e0 e0Var) {
        a6 a6Var = (a6) e0Var;
        o5.h(a6Var.t());
        if (a6Var.s() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final /* bridge */ /* synthetic */ e0 b(um umVar) {
        return a6.u(umVar, fn.a());
    }

    public final Object c(e0 e0Var) {
        a6 a6Var = (a6) e0Var;
        x5 w = y5.w();
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        ((y5) w.f3215i).zzb = 0;
        byte[] a = ub.a(a6Var.s());
        um J = um.J(a, 0, a.length);
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        ((y5) w.f3215i).zze = J;
        c6 t = a6Var.t();
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        y5.A((y5) w.f3215i, t);
        return (y5) w.c();
    }
}
