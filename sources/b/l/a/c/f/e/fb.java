package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class fb implements x1 {
    public final nb a;

    /* renamed from: b  reason: collision with root package name */
    public final o2 f2958b;
    public final int c;

    public fb(nb nbVar, o2 o2Var, int i2) {
        this.a = nbVar;
        this.f2958b = o2Var;
        this.c = i2;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = this.c;
        if (length >= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.c, length);
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f2958b.a(copyOfRange2, a.O1(bArr2, copyOfRange, copyOf));
            return this.a.a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
