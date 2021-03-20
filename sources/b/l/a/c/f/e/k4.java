package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class k4 implements x1 {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f3102b = new j4();
    public final SecretKey a;

    public k4(byte[] bArr) {
        vb.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } catch (ClassNotFoundException unused) {
                if (a.o1()) {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal<Cipher> threadLocal = f3102b;
            threadLocal.get().init(2, this.a, algorithmParameterSpec);
            if (bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
