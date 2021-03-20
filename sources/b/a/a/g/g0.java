package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class g0 {
    public final String a;

    public g0(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g0) && i.a(this.a, ((g0) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.q(a.y("PreviewAppEvent(appId="), this.a, ")");
    }
}
