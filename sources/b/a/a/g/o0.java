package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class o0 {
    public final String a;

    public o0(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof o0) && i.a(this.a, ((o0) obj).a);
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
        return a.q(a.y("SubmitEvent(pageId="), this.a, ")");
    }
}
