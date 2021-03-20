package b.h.a.m.u;

import androidx.annotation.NonNull;
import b.h.a.m.u.e;
import java.util.HashMap;
import java.util.Map;

public class f {

    /* renamed from: b  reason: collision with root package name */
    public static final e.a<?> f597b = new a();
    public final Map<Class<?>, e.a<?>> a = new HashMap();

    public class a implements e.a<Object> {
        @NonNull
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @NonNull
        public e<Object> b(@NonNull Object obj) {
            return new b(obj);
        }
    }

    public static final class b implements e<Object> {
        public final Object a;

        public b(@NonNull Object obj) {
            this.a = obj;
        }

        @NonNull
        public Object a() {
            return this.a;
        }

        public void b() {
        }
    }
}
