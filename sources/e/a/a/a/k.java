package e.a.a.a;

import e.a.a.a.z0.b;
import e.x.c.i;

public final class k {
    public static b<String, Object> a;

    static {
        b<Object, Object> bVar = b.c;
        if (bVar != null) {
            i.d(bVar, "HashPMap.empty<String, Any>()");
            a = bVar;
            return;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/pcollections/HashPMap", "empty"}));
    }
}
