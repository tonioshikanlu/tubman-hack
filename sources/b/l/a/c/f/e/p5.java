package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

public final class p5 extends h2<o2, w8> {
    public p5(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        w8 w8Var = (w8) obj;
        t8 s = w8Var.t().s();
        SecretKeySpec secretKeySpec = new SecretKeySpec(w8Var.u().L(), "HMAC");
        int t = w8Var.t().t();
        int ordinal = s.ordinal();
        if (ordinal == 1) {
            return new sb(new rb("HMACSHA1", secretKeySpec), t);
        }
        if (ordinal == 3) {
            return new sb(new rb("HMACSHA256", secretKeySpec), t);
        }
        if (ordinal == 4) {
            return new sb(new rb("HMACSHA512", secretKeySpec), t);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
