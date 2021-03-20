package e.a.a.a.y0.o;

import b.e.a.a.a;
import e.x.c.i;

public final class j {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9818b;

    public j(String str, int i2) {
        i.e(str, "number");
        this.a = str;
        this.f9818b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.a, jVar.a) && this.f9818b == jVar.f9818b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f9818b;
    }

    public String toString() {
        StringBuilder y = a.y("NumberWithRadix(number=");
        y.append(this.a);
        y.append(", radix=");
        return a.o(y, this.f9818b, ")");
    }
}
