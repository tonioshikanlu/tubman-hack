package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class p3 extends i2<u6> {
    public p3() {
        super(u6.class, new m3(x1.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final g9 b() {
        return g9.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ e0 c(um umVar) {
        return u6.v(umVar, fn.a());
    }

    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        u6 u6Var = (u6) e0Var;
        vb.b(u6Var.s(), 0);
        vb.a(u6Var.u().l());
        if (u6Var.t().s() != 12 && u6Var.t().s() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final g2<x6, u6> g() {
        return new n3(this, x6.class);
    }
}
