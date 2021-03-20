package b.a.a.i;

import b.e.a.a.a;
import e.x.c.i;

public final class c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f309b;

    public c(String str, String str2) {
        i.e(str, "appName");
        i.e(str2, "appUrl");
        this.a = str;
        this.f309b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.a, cVar.a) && i.a(this.f309b, cVar.f309b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f309b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("DebugApp(appName=");
        y.append(this.a);
        y.append(", appUrl=");
        return a.q(y, this.f309b, ")");
    }
}
