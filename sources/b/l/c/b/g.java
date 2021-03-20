package b.l.c.b;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public final class g<T> extends w<T> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final Comparator<T> f4850h;

    public g(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f4850h = comparator;
    }

    public int compare(T t, T t2) {
        return this.f4850h.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f4850h.equals(((g) obj).f4850h);
        }
        return false;
    }

    public int hashCode() {
        return this.f4850h.hashCode();
    }

    public String toString() {
        return this.f4850h.toString();
    }
}
