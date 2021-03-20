package b.l.a.c.f.e;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class c4 implements x1 {
    public static final byte[] c = new byte[0];
    public final l9 a;

    /* renamed from: b  reason: collision with root package name */
    public final x1 f2877b;

    public c4(l9 l9Var, x1 x1Var) {
        this.a = l9Var;
        this.f2877b = x1Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = wrap.getInt();
            if (i2 <= 0 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i2];
            wrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((x1) a3.f(this.a.s(), this.f2877b.b(bArr3, c), x1.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e2) {
            throw new GeneralSecurityException("invalid ciphertext", e2);
        }
    }
}
