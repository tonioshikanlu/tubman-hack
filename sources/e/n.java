package e;

import b.e.a.a.a;
import e.x.c.i;
import java.io.Serializable;

public final class n<A, B, C> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final A f7915h;

    /* renamed from: i  reason: collision with root package name */
    public final B f7916i;

    /* renamed from: j  reason: collision with root package name */
    public final C f7917j;

    public n(A a, B b2, C c) {
        this.f7915h = a;
        this.f7916i = b2;
        this.f7917j = c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return i.a(this.f7915h, nVar.f7915h) && i.a(this.f7916i, nVar.f7916i) && i.a(this.f7917j, nVar.f7917j);
    }

    public int hashCode() {
        A a = this.f7915h;
        int i2 = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b2 = this.f7916i;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c = this.f7917j;
        if (c != null) {
            i2 = c.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder v = a.v('(');
        v.append(this.f7915h);
        v.append(", ");
        v.append(this.f7916i);
        v.append(", ");
        v.append(this.f7917j);
        v.append(')');
        return v.toString();
    }
}
