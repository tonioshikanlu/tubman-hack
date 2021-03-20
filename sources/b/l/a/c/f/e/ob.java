package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class ob implements v5 {
    public final SecretKey a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3201b;
    public final byte[] c;

    public ob(byte[] bArr) {
        vb.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        Cipher a2 = gb.f3009e.a("AES/ECB/NoPadding");
        a2.init(1, secretKeySpec);
        byte[] r1 = a.r1(a2.doFinal(new byte[16]));
        this.f3201b = r1;
        this.c = a.r1(r1);
    }

    public final byte[] a(byte[] bArr, int i2) {
        if (i2 <= 16) {
            Cipher a2 = gb.f3009e.a("AES/ECB/NoPadding");
            a2.init(1, this.a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            byte[] X1 = max * 16 == length ? a.X1(bArr, (max - 1) * 16, this.f3201b, 0, 16) : a.k2(a.N1(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.c);
            byte[] bArr2 = new byte[16];
            for (int i3 = 0; i3 < max - 1; i3++) {
                bArr2 = a2.doFinal(a.X1(bArr2, 0, bArr, i3 * 16, 16));
            }
            return Arrays.copyOf(a2.doFinal(a.k2(X1, bArr2)), i2);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
