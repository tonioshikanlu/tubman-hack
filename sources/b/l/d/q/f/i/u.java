package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import b.l.d.q.f.i.v;

public final class u extends v.d.f {
    public final String a;

    public u(String str, a aVar) {
        this.a = str;
    }

    @NonNull
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v.d.f) {
            return this.a.equals(((v.d.f) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return b.e.a.a.a.q(b.e.a.a.a.y("User{identifier="), this.a, "}");
    }
}
