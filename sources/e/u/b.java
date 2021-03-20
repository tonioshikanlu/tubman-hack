package e.u;

import e.x.c.i;
import java.util.Comparator;

public final class b implements Comparator<Comparable<? super Object>> {

    /* renamed from: h  reason: collision with root package name */
    public static final b f7943h = new b();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        i.e(comparable, "a");
        i.e(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return a.f7942h;
    }
}
