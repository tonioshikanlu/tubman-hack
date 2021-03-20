package e;

import b.e.a.a.a;
import e.x.c.i;
import java.io.Serializable;

public final class j<A, B> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final A f7906h;

    /* renamed from: i  reason: collision with root package name */
    public final B f7907i;

    public j(A a, B b2) {
        this.f7906h = a;
        this.f7907i = b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.f7906h, jVar.f7906h) && i.a(this.f7907i, jVar.f7907i);
    }

    public int hashCode() {
        A a = this.f7906h;
        int i2 = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b2 = this.f7907i;
        if (b2 != null) {
            i2 = b2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder v = a.v('(');
        v.append(this.f7906h);
        v.append(", ");
        v.append(this.f7907i);
        v.append(')');
        return v.toString();
    }
}
