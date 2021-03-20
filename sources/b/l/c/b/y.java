package b.l.c.b;

import java.io.Serializable;
import java.util.Objects;

public final class y extends w<Comparable> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final y f4898h = new y();

    public <S extends Comparable> w<S> a() {
        return v.f4894h;
    }

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
