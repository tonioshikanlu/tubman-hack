package l.b.c;

import java.util.Collections;
import java.util.List;

public abstract class w {

    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final w f8152b = w.a(Collections.emptyList());
        public final w a;

        public b(w wVar, a aVar) {
            b.q.a.a.x(wVar, "parent");
            this.a = wVar;
        }
    }

    public static w a(List list) {
        if (list.size() <= 32) {
            return new f(Collections.unmodifiableList(list));
        }
        throw new IllegalStateException("Invalid size");
    }

    public abstract List<Object> b();
}
