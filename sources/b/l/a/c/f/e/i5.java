package b.l.a.c.f.e;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

public final class i5 {
    public KeyStore a = null;

    public i5() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.a = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        } catch (IOException | GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
