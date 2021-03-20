package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class n0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f243b;

    public n0(String str, String str2) {
        this.a = str;
        this.f243b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return i.a(this.a, n0Var.a) && i.a(this.f243b, n0Var.f243b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f243b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("ShowQrEvent(appUrl=");
        y.append(this.a);
        y.append(", appName=");
        return a.q(y, this.f243b, ")");
    }
}
