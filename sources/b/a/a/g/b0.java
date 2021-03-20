package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class b0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f239b;

    public b0(String str, String str2) {
        i.e(str, "url");
        this.a = str;
        this.f239b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return i.a(this.a, b0Var.a) && i.a(this.f239b, b0Var.f239b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f239b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("OpenUrlEvent(url=");
        y.append(this.a);
        y.append(", href=");
        return a.q(y, this.f239b, ")");
    }
}
