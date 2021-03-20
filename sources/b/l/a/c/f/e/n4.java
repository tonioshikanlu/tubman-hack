package b.l.a.c.f.e;

import java.security.InvalidKeyException;

public final class n4 extends i2<o7> {
    public n4() {
        super(o7.class, new l4(a2.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final g9 b() {
        return g9.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ e0 c(um umVar) {
        return o7.u(umVar, fn.a());
    }

    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        o7 o7Var = (o7) e0Var;
        vb.b(o7Var.s(), 0);
        if (o7Var.t().l() != 64) {
            int l2 = o7Var.t().l();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(l2);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(sb.toString());
        }
    }

    public final g2<q7, o7> g() {
        return new m4(this, q7.class);
    }
}
