package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public final class sa extends ThreadLocal<Cipher> {
    public final Object initialValue() {
        try {
            return gb.f3009e.a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
