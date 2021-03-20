package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class v {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f250b;
    public final Boolean c;

    public v(String str, String str2, Boolean bool, int i2) {
        Boolean bool2 = null;
        str2 = (i2 & 2) != 0 ? null : str2;
        bool2 = (i2 & 4) != 0 ? Boolean.FALSE : bool2;
        i.e(str, "pageId");
        this.a = str;
        this.f250b = str2;
        this.c = bool2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return i.a(this.a, vVar.a) && i.a(this.f250b, vVar.f250b) && i.a(this.c, vVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f250b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("NavigationEvent(pageId=");
        y.append(this.a);
        y.append(", hrefRemote=");
        y.append(this.f250b);
        y.append(", fromBackendResponseGoToAction=");
        y.append(this.c);
        y.append(")");
        return y.toString();
    }
}
