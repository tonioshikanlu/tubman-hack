package b.g.a.e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class d {
    public Map<String, Object> a;

    public d(Map<String, Object> map) {
        if (map != null) {
            this.a = new HashMap(map);
            return;
        }
        throw new IllegalArgumentException("Must provide non-null parameters");
    }

    public static d b() {
        return new d(new HashMap());
    }

    public Map<String, Object> a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }
}
