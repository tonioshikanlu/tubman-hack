package b.l.a.c.f.e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class fn {

    /* renamed from: b  reason: collision with root package name */
    public static volatile fn f2984b;
    public static final fn c = new fn(true);
    public final Map<en, d<?, ?>> a;

    public fn() {
        this.a = new HashMap();
    }

    public fn(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static fn a() {
        fn fnVar = f2984b;
        if (fnVar == null) {
            synchronized (fn.class) {
                fnVar = f2984b;
                if (fnVar == null) {
                    fnVar = c;
                    f2984b = fnVar;
                }
            }
        }
        return fnVar;
    }
}
