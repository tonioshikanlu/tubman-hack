package b.l.a.c.f.e;

import java.security.KeyPairGenerator;
import java.security.Provider;

public final class kb implements mb<KeyPairGenerator> {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
