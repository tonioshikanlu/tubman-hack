package e.u;

import e.x.c.i;
import java.util.Comparator;

public final class a implements Comparator<Comparable<? super Object>> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f7942h = new a();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        i.e(comparable, "a");
        i.e(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return b.f7943h;
    }
}
