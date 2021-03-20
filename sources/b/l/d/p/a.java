package b.l.d.p;

import b.l.d.w.b;
import java.util.Set;

public abstract class a implements e {
    public <T> T a(Class<T> cls) {
        b<T> c = c(cls);
        if (c == null) {
            return null;
        }
        return c.get();
    }

    public <T> Set<T> b(Class<T> cls) {
        return d(cls).get();
    }
}
