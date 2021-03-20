package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class k0 {
    public final String a;

    public k0(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k0) && i.a(this.a, ((k0) obj).a);
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
        return a.q(a.y("ScannedAppClickedEvent(appUrl="), this.a, ")");
    }
}
