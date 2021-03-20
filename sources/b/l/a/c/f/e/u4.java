package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.security.GeneralSecurityException;

public final class u4 extends v2<i8, l8> {
    public u4() {
        super(i8.class, new s4(b2.class));
    }

    public static final void h(i8 i8Var) {
        if (i8Var.u().l() != 0) {
            vb.b(i8Var.s(), 0);
            a.i1(i8Var.t().t());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final g9 b() {
        return g9.ASYMMETRIC_PRIVATE;
    }

    public final /* bridge */ /* synthetic */ e0 c(um umVar) {
        return i8.v(umVar, fn.a());
    }

    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        h((i8) e0Var);
    }

    public final g2<c8, i8> g() {
        return new t4(this, c8.class);
    }
}
