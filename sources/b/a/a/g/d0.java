package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class d0 {
    public final String a;

    public d0(String str) {
        i.e(str, "url");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d0) && i.a(this.a, ((d0) obj).a);
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
        return a.q(a.y("PdfEvent(url="), this.a, ")");
    }
}
