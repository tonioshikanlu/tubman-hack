package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class v0 {
    public final String a;

    public v0(String str) {
        i.e(str, "url");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof v0) && i.a(this.a, ((v0) obj).a);
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
        return a.q(a.y("VideoEvent(url="), this.a, ")");
    }
}
