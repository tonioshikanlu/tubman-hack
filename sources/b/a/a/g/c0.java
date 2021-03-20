package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class c0 {
    public final String a;

    public c0(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c0) && i.a(this.a, ((c0) obj).a);
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
        return a.q(a.y("PauseEvent(containerId="), this.a, ")");
    }
}
