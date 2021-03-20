package l.b.c;

import l.b.c.a;

public final class b extends a.C0161a {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a.C0161a) {
            return this.a.equals(((a.C0161a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return b.e.a.a.a.q(b.e.a.a.a.y("AttributeValueString{stringValue="), this.a, "}");
    }
}
