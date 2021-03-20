package b.h.a.m.x.h;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class f {
    public final List<a<?, ?>> a = new ArrayList();

    public static final class a<Z, R> {
        public final Class<Z> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f931b;
        public final e<Z, R> c;

        public a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
            this.a = cls;
            this.f931b = cls2;
            this.c = eVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f931b);
        }
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> a2 : this.a) {
            if (a2.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
