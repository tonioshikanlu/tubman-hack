package b.l.a.a.f.q.i;

import java.util.Objects;

public final class g implements Object<d> {

    public static final class a {
        public static final g a = new g();
    }

    public Object get() {
        d dVar = d.a;
        Objects.requireNonNull(dVar, "Cannot return null from a non-@Nullable @Provides method");
        return dVar;
    }
}
