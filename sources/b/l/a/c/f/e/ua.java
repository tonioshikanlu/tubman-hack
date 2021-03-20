package b.l.a.c.f.e;

import androidx.exifinterface.media.ExifInterface;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ua implements x1 {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f3328e = new sa();
    public static final ThreadLocal<Cipher> f = new ta();
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3329b;
    public final SecretKeySpec c;
    public final int d;

    public ua(byte[] bArr, int i2) {
        if (i2 == 12 || i2 == 16) {
            this.d = i2;
            vb.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.c = secretKeySpec;
            Cipher cipher = f3328e.get();
            cipher.init(1, secretKeySpec);
            byte[] d2 = d(cipher.doFinal(new byte[16]));
            this.a = d2;
            this.f3329b = d(d2);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        int i3 = 0;
        while (i3 < 15) {
            byte b2 = bArr[i3];
            int i4 = i3 + 1;
            bArr2[i3] = (byte) (((b2 + b2) ^ ((bArr[i4] & ExifInterface.MARKER) >>> 7)) & 255);
            i3 = i4;
        }
        byte b3 = bArr[15];
        int i5 = b3 + b3;
        if ((bArr[0] & 128) != 0) {
            i2 = 135;
        }
        bArr2[15] = (byte) (i5 ^ i2);
        return bArr2;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = (length - this.d) - 16;
        if (i2 >= 0) {
            Cipher cipher = f3328e.get();
            cipher.init(1, this.c);
            Cipher cipher2 = cipher;
            byte[] e2 = e(cipher2, 0, bArr, 0, this.d);
            byte[] e3 = e(cipher2, 1, bArr2, 0, bArr2.length);
            byte[] e4 = e(cipher, 2, bArr, this.d, i2);
            int i3 = length - 16;
            byte b2 = 0;
            for (int i4 = 0; i4 < 16; i4++) {
                b2 = (byte) (b2 | (((bArr[i3 + i4] ^ e3[i4]) ^ e2[i4]) ^ e4[i4]));
            }
            if (b2 == 0) {
                Cipher cipher3 = f.get();
                cipher3.init(1, this.c, new IvParameterSpec(e2));
                return cipher3.doFinal(bArr, this.d, i2);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] e(Cipher cipher, int i2, byte[] bArr, int i3, int i4) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i2;
        if (i4 == 0) {
            return cipher.doFinal(c(bArr3, this.a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i5 = 0;
        int i6 = 0;
        while (i4 - i6 > 16) {
            for (int i7 = 0; i7 < 16; i7++) {
                doFinal[i7] = (byte) (doFinal[i7] ^ bArr[(i3 + i6) + i7]);
            }
            doFinal = cipher.doFinal(doFinal);
            i6 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i6 + i3, i3 + i4);
        if (copyOfRange.length == 16) {
            bArr2 = c(copyOfRange, this.a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f3329b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i5 >= length) {
                    break;
                }
                copyOf[i5] = (byte) (copyOf[i5] ^ copyOfRange[i5]);
                i5++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(c(doFinal, bArr2));
    }
}
