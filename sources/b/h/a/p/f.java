package b.h.a.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.s;
import java.util.ArrayList;
import java.util.List;

public class f {
    public final List<a<?>> a = new ArrayList();

    public static final class a<T> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final s<T> f959b;

        public a(@NonNull Class<T> cls, @NonNull s<T> sVar) {
            this.a = cls;
            this.f959b = sVar;
        }
    }

    @Nullable
    public synchronized <Z> s<Z> a(@NonNull Class<Z> cls) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.a.get(i2);
            if (aVar.a.isAssignableFrom(cls)) {
                return aVar.f959b;
            }
        }
        return null;
    }
}
