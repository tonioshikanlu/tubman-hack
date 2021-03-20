package e.a.a.a.y0.d.a;

import b.e.a.a.a;
import e.a.a.a.y0.f.d;
import e.x.c.i;

public final class v {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8593b;

    public v(d dVar, String str) {
        i.e(dVar, "name");
        i.e(str, "signature");
        this.a = dVar;
        this.f8593b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return i.a(this.a, vVar.a) && i.a(this.f8593b, vVar.f8593b);
    }

    public int hashCode() {
        d dVar = this.a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        String str = this.f8593b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("NameAndSignature(name=");
        y.append(this.a);
        y.append(", signature=");
        return a.q(y, this.f8593b, ")");
    }
}
