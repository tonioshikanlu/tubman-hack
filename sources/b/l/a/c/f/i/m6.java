package b.l.a.c.f.i;

import java.util.Iterator;
import java.util.Map;

public final class m6 {
    public static final int a(int i2, Object obj, Object obj2) {
        l6 l6Var = (l6) obj;
        k6 k6Var = (k6) obj2;
        if (l6Var.isEmpty()) {
            return 0;
        }
        Iterator it = l6Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        l6 l6Var = (l6) obj;
        l6 l6Var2 = (l6) obj2;
        if (!l6Var2.isEmpty()) {
            if (!l6Var.f3645h) {
                l6Var = l6Var.isEmpty() ? new l6() : new l6(l6Var);
            }
            l6Var.b();
            if (!l6Var2.isEmpty()) {
                l6Var.putAll(l6Var2);
            }
        }
        return l6Var;
    }
}
