package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class i4 extends i2<na> {
    public i4() {
        super(na.class, new g4(x1.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final g9 b() {
        return g9.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ e0 c(um umVar) {
        return na.u(umVar, fn.a());
    }

    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        na naVar = (na) e0Var;
        vb.b(naVar.s(), 0);
        if (naVar.t().l() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final g2<pa, na> g() {
        return new h4(this, pa.class);
    }
}
