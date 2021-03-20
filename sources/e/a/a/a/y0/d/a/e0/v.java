package e.a.a.a.y0.d.a.e0;

import b.e.a.a.a;
import e.a.a.a.y0.m.d0;
import e.x.c.i;

public final class v {
    public final d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final d f8563b;

    public v(d0 d0Var, d dVar) {
        i.e(d0Var, "type");
        this.a = d0Var;
        this.f8563b = dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return i.a(this.a, vVar.a) && i.a(this.f8563b, vVar.f8563b);
    }

    public int hashCode() {
        d0 d0Var = this.a;
        int i2 = 0;
        int hashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
        d dVar = this.f8563b;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("TypeAndDefaultQualifiers(type=");
        y.append(this.a);
        y.append(", defaultQualifiers=");
        y.append(this.f8563b);
        y.append(")");
        return y.toString();
    }
}
