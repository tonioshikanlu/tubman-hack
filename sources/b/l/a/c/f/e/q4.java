package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class q4 implements a2 {
    public final s2<a2> a;

    public q4(s2<a2> s2Var) {
        this.a = s2Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (q2 q2Var : this.a.a(copyOfRange)) {
                try {
                    return ((a2) q2Var.a).a(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e2) {
                    Logger logger = r4.a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e2.toString());
                    logger.logp(level, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", valueOf.length() != 0 ? "ciphertext prefix matches a key, but cannot decrypt: ".concat(valueOf) : new String("ciphertext prefix matches a key, but cannot decrypt: "));
                }
            }
        }
        for (q2 q2Var2 : this.a.a(z1.a)) {
            try {
                return ((a2) q2Var2.a).a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
