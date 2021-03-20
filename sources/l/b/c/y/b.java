package l.b.c.y;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class b {

    /* renamed from: l.b.c.y.b$b  reason: collision with other inner class name */
    public static final class C0163b extends b {
        public final Set<String> a = new HashSet();

        static {
            Map emptyMap = Collections.emptyMap();
            Map emptyMap2 = Collections.emptyMap();
            b.q.a.a.x(emptyMap, "numbersOfLatencySampledSpans");
            Map unmodifiableMap = Collections.unmodifiableMap(new HashMap(emptyMap));
            b.q.a.a.x(emptyMap2, "numbersOfErrorSampledSpans");
            Map unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(emptyMap2));
            Objects.requireNonNull(unmodifiableMap, "Null numbersOfLatencySampledSpans");
            Objects.requireNonNull(unmodifiableMap2, "Null numbersOfErrorSampledSpans");
        }

        public C0163b() {
        }

        public C0163b(a aVar) {
        }
    }
}
