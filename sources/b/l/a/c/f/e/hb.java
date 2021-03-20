package b.l.a.c.f.e;

import java.security.Provider;
import javax.crypto.Cipher;

public final class hb implements mb<Cipher> {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
