package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ra implements nb {
    public static final ThreadLocal<Cipher> d = new qa();
    public final SecretKeySpec a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3247b;
    public final int c;

    public ra(byte[] bArr, int i2) {
        vb.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = d.get().getBlockSize();
        this.c = blockSize;
        if (i2 < 12 || i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f3247b = i2;
    }

    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.f3247b;
        if (length >= i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            int i3 = this.f3247b;
            int i4 = length - i3;
            byte[] bArr3 = new byte[i4];
            Cipher cipher = d.get();
            byte[] bArr4 = new byte[this.c];
            System.arraycopy(bArr2, 0, bArr4, 0, this.f3247b);
            cipher.init(2, this.a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i3, i4, bArr3, 0) == i4) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
