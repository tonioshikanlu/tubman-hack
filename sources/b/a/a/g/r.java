package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class r {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f248b;

    public r(String str, String str2) {
        i.e(str2, "provider");
        this.a = str;
        this.f248b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return i.a(this.a, rVar.a) && i.a(this.f248b, rVar.f248b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f248b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("LoginWithProviderEvent(pageId=");
        y.append(this.a);
        y.append(", provider=");
        return a.q(y, this.f248b, ")");
    }
}
