package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class t5 implements o2 {
    public final s2<o2> a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3302b = {0};

    public /* synthetic */ t5(s2 s2Var) {
        this.a = s2Var;
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (q2 next : this.a.a(copyOf)) {
                try {
                    if (next.d.equals(ia.LEGACY)) {
                        ((o2) next.a).a(copyOfRange, a.O1(bArr2, this.f3302b));
                        return;
                    }
                    ((o2) next.a).a(copyOfRange, bArr2);
                    return;
                } catch (GeneralSecurityException e2) {
                    Logger logger = u5.a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e2);
                    logger.logp(level, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", b.e.a.a.a.q(new StringBuilder(valueOf.length() + 45), "tag prefix matches a key, but cannot verify: ", valueOf));
                }
            }
            for (q2 q2Var : this.a.a(z1.a)) {
                try {
                    ((o2) q2Var.a).a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
