package b.l.a.c.f.e;

import java.security.Provider;
import javax.crypto.KeyAgreement;

public final class ib implements mb<KeyAgreement> {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
