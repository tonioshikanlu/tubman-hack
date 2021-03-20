package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class sb implements o2 {
    public final v5 a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3268b;

    public sb(v5 v5Var, int i2) {
        this.a = v5Var;
        this.f3268b = i2;
        if (i2 >= 10) {
            v5Var.a(new byte[0], i2);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        if (!a.q1(this.a.a(bArr2, this.f3268b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
