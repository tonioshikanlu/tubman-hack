package b.l.a.c.f.i;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c5 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile c5 f3508b;
    public static volatile c5 c;
    public static final c5 d = new c5(true);
    public final Map<b5, o5<?, ?>> a;

    public c5() {
        this.a = new HashMap();
    }

    public c5(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static c5 a() {
        c5 c5Var = f3508b;
        if (c5Var == null) {
            synchronized (c5.class) {
                c5Var = f3508b;
                if (c5Var == null) {
                    c5Var = d;
                    f3508b = c5Var;
                }
            }
        }
        return c5Var;
    }
}
