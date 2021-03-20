package b.j.a.c.a0;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

public abstract class e {

    public static class a extends e implements Serializable {

        /* renamed from: j  reason: collision with root package name */
        public static final a f1598j = new a(Collections.emptyMap());

        /* renamed from: k  reason: collision with root package name */
        public static final Object f1599k = new Object();

        /* renamed from: h  reason: collision with root package name */
        public final Map<?, ?> f1600h;

        /* renamed from: i  reason: collision with root package name */
        public transient Map<Object, Object> f1601i;

        public a(Map<?, ?> map) {
            this.f1600h = map;
            this.f1601i = null;
        }

        public a(Map<?, ?> map, Map<Object, Object> map2) {
            this.f1600h = map;
            this.f1601i = map2;
        }
    }
}
