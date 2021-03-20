package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class r5 extends i2<w8> {
    public r5() {
        super(w8.class, new p5(o2.class));
    }

    public static final void h(w8 w8Var) {
        vb.b(w8Var.s(), 0);
        if (w8Var.u().l() >= 16) {
            i(w8Var.t());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static void i(c9 c9Var) {
        if (c9Var.t() >= 10) {
            int ordinal = c9Var.s().ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (c9Var.t() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (c9Var.t() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (c9Var.t() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final g9 b() {
        return g9.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ e0 c(um umVar) {
        return w8.v(umVar, fn.a());
    }

    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        h((w8) e0Var);
    }

    public final g2<z8, w8> g() {
        return new q5(this, z8.class);
    }
}
