package b.l.e;

import b.l.e.e0.s;
import java.util.Map;
import java.util.Set;

public final class t extends q {
    public final s<String, q> a = new s<>();

    public Set<Map.Entry<String, q>> entrySet() {
        return this.a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof t) && ((t) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public q s(String str) {
        s.e<String, q> c = this.a.c(str);
        return (q) (c != null ? c.f5457n : null);
    }

    public boolean v(String str) {
        return this.a.c(str) != null;
    }
}
