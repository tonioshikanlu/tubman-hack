package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class m {
    public final String a;

    public m(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && i.a(this.a, ((m) obj).a);
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
        return a.q(a.y("FirebaseRegisterEvent(pageId="), this.a, ")");
    }
}
