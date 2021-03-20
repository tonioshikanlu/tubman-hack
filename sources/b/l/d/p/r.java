package b.l.d.p;

import b.e.a.a.a;
import java.util.Objects;

public final class r {
    public final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5046b;
    public final int c;

    public r(Class<?> cls, int i2, int i3) {
        Objects.requireNonNull(cls, "Null dependency anInterface.");
        this.a = cls;
        this.f5046b = i2;
        this.c = i3;
    }

    public boolean a() {
        return this.f5046b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && this.f5046b == rVar.f5046b && this.c == rVar.c;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f5046b) * 1000003) ^ this.c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i2 = this.f5046b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i3 = this.c;
        if (i3 == 0) {
            str = "direct";
        } else if (i3 == 1) {
            str = "provider";
        } else if (i3 == 2) {
            str = "deferred";
        } else {
            throw new AssertionError(a.g("Unsupported injection: ", i3));
        }
        return a.q(sb, str, "}");
    }
}
