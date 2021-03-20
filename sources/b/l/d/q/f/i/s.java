package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import b.l.d.q.f.i.v;

public final class s extends v.d.C0082d.c {
    public final String a;

    public s(String str, a aVar) {
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
        if (obj instanceof v.d.C0082d.c) {
            return this.a.equals(((v.d.C0082d.c) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return b.e.a.a.a.q(b.e.a.a.a.y("Log{content="), this.a, "}");
    }
}
