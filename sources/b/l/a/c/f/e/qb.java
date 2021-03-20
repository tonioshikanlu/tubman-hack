package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

public final class qb extends ThreadLocal<Mac> {
    public final /* synthetic */ rb a;

    public qb(rb rbVar) {
        this.a = rbVar;
    }

    public final Object initialValue() {
        try {
            Mac a2 = gb.f.a(this.a.f3248b);
            a2.init(this.a.c);
            return a2;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
