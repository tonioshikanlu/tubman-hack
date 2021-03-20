package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class y3 extends i2<t7> {
    public y3() {
        super(t7.class, new w3(x1.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final g9 b() {
        return g9.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ e0 c(um umVar) {
        return t7.u(umVar, fn.a());
    }

    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        t7 t7Var = (t7) e0Var;
        vb.b(t7Var.s(), 0);
        if (t7Var.t().l() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final g2<v7, t7> g() {
        return new x3(this, v7.class);
    }
}
