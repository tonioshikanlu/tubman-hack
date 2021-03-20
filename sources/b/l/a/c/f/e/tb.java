package b.l.a.c.f.e;

import java.security.SecureRandom;

public final class tb extends ThreadLocal<SecureRandom> {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
