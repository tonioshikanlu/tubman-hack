package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class e3 implements x1 {
    public final s2<x1> a;

    public /* synthetic */ e3(s2 s2Var) {
        this.a = s2Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (q2 q2Var : this.a.a(copyOfRange)) {
                try {
                    return ((x1) q2Var.a).b(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e2) {
                    Logger logger = f3.a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e2.toString());
                    logger.logp(level, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", valueOf.length() != 0 ? "ciphertext prefix matches a key, but cannot decrypt: ".concat(valueOf) : new String("ciphertext prefix matches a key, but cannot decrypt: "));
                }
            }
        }
        for (q2 q2Var2 : this.a.a(z1.a)) {
            try {
                return ((x1) q2Var2.a).b(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
