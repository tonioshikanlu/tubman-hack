package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class n3 extends g2<x6, u6> {
    public n3(p3 p3Var, Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ void a(e0 e0Var) {
        x6 x6Var = (x6) e0Var;
        vb.a(x6Var.t());
        if (x6Var.s().s() != 12 && x6Var.s().s() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final /* bridge */ /* synthetic */ e0 b(um umVar) {
        return x6.u(umVar, fn.a());
    }

    public final Object c(e0 e0Var) {
        x6 x6Var = (x6) e0Var;
        t6 w = u6.w();
        byte[] a = ub.a(x6Var.t());
        um J = um.J(a, 0, a.length);
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        ((u6) w.f3215i).zzf = J;
        a7 s = x6Var.s();
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        u6.z((u6) w.f3215i, s);
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        ((u6) w.f3215i).zzb = 0;
        return (u6) w.c();
    }
}
