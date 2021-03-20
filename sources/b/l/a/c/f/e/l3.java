package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class l3 extends i2<l6> {
    public l3() {
        super(l6.class, new j3(nb.class));
    }

    public static final void h(l6 l6Var) {
        vb.b(l6Var.s(), 0);
        vb.a(l6Var.u().l());
        i(l6Var.t());
    }

    public static final void i(r6 r6Var) {
        if (r6Var.s() < 12 || r6Var.s() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final g9 b() {
        return g9.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ e0 c(um umVar) {
        return l6.v(umVar, fn.a());
    }

    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        h((l6) e0Var);
    }

    public final g2<o6, l6> g() {
        return new k3(this, o6.class);
    }
}
