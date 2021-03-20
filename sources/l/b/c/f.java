package l.b.c;

import b.e.a.a.a;
import java.util.List;
import java.util.Objects;

public final class f extends w {
    public final List<Object> a;

    public f(List<Object> list) {
        Objects.requireNonNull(list, "Null entries");
        this.a = list;
    }

    public List<Object> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.a.equals(((w) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder y = a.y("Tracestate{entries=");
        y.append(this.a);
        y.append("}");
        return y.toString();
    }
}
