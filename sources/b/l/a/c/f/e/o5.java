package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class o5 extends i2<y5> {
    public o5() {
        super(y5.class, new m5(o2.class));
    }

    public static void h(c6 c6Var) {
        if (c6Var.s() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (c6Var.s() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final g9 b() {
        return g9.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ e0 c(um umVar) {
        return y5.v(umVar, fn.a());
    }

    public final void d(e0 e0Var) {
        y5 y5Var = (y5) e0Var;
        vb.b(y5Var.s(), 0);
        if (y5Var.t().l() == 32) {
            h(y5Var.u());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    public final g2<a6, y5> g() {
        return new n5(a6.class);
    }
}
