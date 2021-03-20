package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class u {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Float f249b;
    public final Float c;
    public final Float d;

    public u(String str, Float f, Float f2, Float f3) {
        this.a = str;
        this.f249b = f;
        this.c = f2;
        this.d = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return i.a(this.a, uVar.a) && i.a(this.f249b, uVar.f249b) && i.a(this.c, uVar.c) && i.a(this.d, uVar.d);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Float f = this.f249b;
        int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.c;
        int hashCode3 = (hashCode2 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.d;
        if (f3 != null) {
            i2 = f3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("MapsEvent(place=");
        y.append(this.a);
        y.append(", latitude=");
        y.append(this.f249b);
        y.append(", longitude=");
        y.append(this.c);
        y.append(", zoom=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
