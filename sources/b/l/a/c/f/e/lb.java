package b.l.a.c.f.e;

import java.security.Provider;
import javax.crypto.Mac;

public final class lb implements mb<Mac> {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
