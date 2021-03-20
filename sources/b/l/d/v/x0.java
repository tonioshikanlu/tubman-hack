package b.l.d.v;

import java.security.KeyPair;
import java.util.Arrays;

public final class x0 {
    public final KeyPair a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5349b;

    public x0(KeyPair keyPair, long j2) {
        this.a = keyPair;
        this.f5349b = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f5349b == x0Var.f5349b && this.a.getPublic().equals(x0Var.a.getPublic()) && this.a.getPrivate().equals(x0Var.a.getPrivate());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.f5349b)});
    }
}
