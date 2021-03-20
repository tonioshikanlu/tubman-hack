package e.t;

import b.e.a.a.a;
import e.x.c.i;

public final class r<T> {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final T f7937b;

    public r(int i2, T t) {
        this.a = i2;
        this.f7937b = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && i.a(this.f7937b, rVar.f7937b);
    }

    public int hashCode() {
        int i2 = this.a * 31;
        T t = this.f7937b;
        return i2 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = a.y("IndexedValue(index=");
        y.append(this.a);
        y.append(", value=");
        y.append(this.f7937b);
        y.append(")");
        return y.toString();
    }
}
