package b.l.a.c.f.e;

import java.security.SecureRandom;

public final class ub {
    public static final ThreadLocal<SecureRandom> a = new tb();

    public static byte[] a(int i2) {
        byte[] bArr = new byte[i2];
        a.get().nextBytes(bArr);
        return bArr;
    }
}
