package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class g {
    public final String a;

    public g(String str) {
        i.e(str, "url");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && i.a(this.a, ((g) obj).a);
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
        return a.q(a.y("DownloadEvent(url="), this.a, ")");
    }
}
