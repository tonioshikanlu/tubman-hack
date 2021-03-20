package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class e0 {
    public final String a;

    public e0(String str) {
        i.e(str, "phoneNumber");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e0) && i.a(this.a, ((e0) obj).a);
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
        return a.q(a.y("PhoneEvent(phoneNumber="), this.a, ")");
    }
}
