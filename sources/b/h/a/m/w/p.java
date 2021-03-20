package b.h.a.m.w;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p {
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public final a f811b = new a();

    public static class a {
        public final Map<Class<?>, C0031a<?>> a = new HashMap();

        /* renamed from: b.h.a.m.w.p$a$a  reason: collision with other inner class name */
        public static class C0031a<Model> {
            public final List<n<Model, ?>> a;

            public C0031a(List<n<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public p(@NonNull Pools.Pool<List<Throwable>> pool) {
        r rVar = new r(pool);
        this.a = rVar;
    }
}
