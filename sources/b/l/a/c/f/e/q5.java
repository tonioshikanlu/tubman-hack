package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class q5 extends g2<z8, w8> {
    public q5(r5 r5Var, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void a(e0 e0Var) {
        z8 z8Var = (z8) e0Var;
        if (z8Var.t() >= 16) {
            r5.i(z8Var.s());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public final /* bridge */ /* synthetic */ e0 b(um umVar) {
        return z8.u(umVar, fn.a());
    }

    public final Object c(e0 e0Var) {
        z8 z8Var = (z8) e0Var;
        v8 w = w8.w();
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        ((w8) w.f3215i).zzb = 0;
        c9 s = z8Var.s();
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        w8.A((w8) w.f3215i, s);
        byte[] a = ub.a(z8Var.t());
        um J = um.J(a, 0, a.length);
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        ((w8) w.f3215i).zzf = J;
        return (w8) w.c();
    }
}
