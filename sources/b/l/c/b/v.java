package b.l.c.b;

import java.io.Serializable;
import java.util.Objects;

public final class v extends w<Comparable> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final v f4894h = new v();

    public <S extends Comparable> w<S> a() {
        return y.f4898h;
    }

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
