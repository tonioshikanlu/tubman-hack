package b.l.a.c.f.e;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public final class h5 implements x1 {

    /* renamed from: b  reason: collision with root package name */
    public static final String f3022b = "h5";
    public final SecretKey a;

    public h5(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.a = secretKey;
        if (secretKey == null) {
            String valueOf = String.valueOf(str);
            throw new InvalidKeyException(valueOf.length() != 0 ? "Keystore cannot load the key with ID: ".concat(valueOf) : new String("Keystore cannot load the key with ID: "));
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w(f3022b, "encountered a potentially transient KeyStore error, will wait and retry", e2);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return c(bArr, bArr2);
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w(f3022b, "encountered a potentially transient KeyStore error, will wait and retry", e2);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return d(bArr, bArr2);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.a, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
