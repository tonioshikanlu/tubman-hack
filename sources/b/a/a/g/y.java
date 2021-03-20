package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class y {
    public final String a;

    public y(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof y) && i.a(this.a, ((y) obj).a);
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
        return a.q(a.y("OpenAudioEvent(url="), this.a, ")");
    }
}
