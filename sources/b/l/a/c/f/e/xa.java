package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class xa implements a2 {
    public static final Collection<Integer> c = Arrays.asList(new Integer[]{64});
    public static final byte[] d = new byte[16];
    public final ob a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3396b;

    public xa(byte[] bArr) {
        Collection<Integer> collection = c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i2 = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i2);
            this.f3396b = Arrays.copyOfRange(bArr, i2, length);
            this.a = new ob(copyOfRange);
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("invalid key size: ");
        sb.append(length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length >= 16) {
            Cipher a2 = gb.f3009e.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr4 = (byte[]) copyOfRange.clone();
            bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
            bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
            a2.init(2, new SecretKeySpec(this.f3396b, "AES"), new IvParameterSpec(bArr4));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = a2.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && a.o1()) {
                doFinal = new byte[0];
            }
            byte[][] bArr5 = {bArr2, doFinal};
            byte[] a3 = this.a.a(d, 16);
            for (char c2 = 0; c2 <= 0; c2 = 1) {
                byte[] bArr6 = bArr5[0];
                if (bArr6 == null) {
                    bArr6 = new byte[0];
                }
                a3 = a.k2(a.r1(a3), this.a.a(bArr6, 16));
            }
            byte[] bArr7 = bArr5[1];
            int length2 = bArr7.length;
            if (length2 >= 16) {
                int length3 = a3.length;
                if (length2 >= length3) {
                    int i2 = length2 - length3;
                    bArr3 = Arrays.copyOf(bArr7, length2);
                    for (int i3 = 0; i3 < a3.length; i3++) {
                        int i4 = i2 + i3;
                        bArr3[i4] = (byte) (bArr3[i4] ^ a3[i3]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = a.k2(a.N1(bArr7), a.r1(a3));
            }
            if (a.q1(copyOfRange, this.a.a(bArr3, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
