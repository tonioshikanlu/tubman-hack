package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class k {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f242b;

    public k(String str, String str2) {
        i.e(str, "query");
        i.e(str2, "pageId");
        this.a = str;
        this.f242b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.a, kVar.a) && i.a(this.f242b, kVar.f242b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f242b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("FilterEvent(query=");
        y.append(this.a);
        y.append(", pageId=");
        return a.q(y, this.f242b, ")");
    }
}
