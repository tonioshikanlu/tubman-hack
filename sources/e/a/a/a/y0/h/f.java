package e.a.a.a.y0.h;

import e.a.a.a.y0.h.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class f {

    /* renamed from: b  reason: collision with root package name */
    public static final f f9233b = new f(true);
    public final Map<a, h.f<?, ?>> a;

    public static final class a {
        public final Object a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9234b;

        public a(Object obj, int i2) {
            this.a = obj;
            this.f9234b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.f9234b == aVar.f9234b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.f9234b;
        }
    }

    public f() {
        this.a = new HashMap();
    }

    public f(boolean z) {
        this.a = Collections.emptyMap();
    }

    public final void a(h.f<?, ?> fVar) {
        this.a.put(new a(fVar.a, fVar.d.f9242i), fVar);
    }
}
