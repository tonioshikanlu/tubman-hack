package b.l.a.c.f.i;

import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class p3 {
    @GuardedBy("SharedPreferencesLoader.class")
    public static final Map<String, p3> a = new ArrayMap();

    public static synchronized void a() {
        synchronized (p3.class) {
            Map<String, p3> map = a;
            Iterator<p3> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                Objects.requireNonNull(it.next());
                throw null;
            }
        }
    }
}
