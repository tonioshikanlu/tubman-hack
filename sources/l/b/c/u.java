package l.b.c;

import b.e.a.a.a;
import java.util.Arrays;

public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static final u f8151b = new u((byte) 0);
    public final byte a;

    public u(byte b2) {
        this.a = b2;
    }

    public boolean a() {
        return (this.a & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return this.a == ((u) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new byte[]{this.a});
    }

    public String toString() {
        StringBuilder y = a.y("TraceOptions{sampled=");
        y.append(a());
        y.append("}");
        return y.toString();
    }
}
