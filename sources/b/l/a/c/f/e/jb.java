package b.l.a.c.f.e;

import java.security.KeyFactory;
import java.security.Provider;

public final class jb implements mb<KeyFactory> {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
