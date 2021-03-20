package b.h.a.m.w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.m;
import b.h.a.m.p;
import b.h.a.m.u.d;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public interface n<Model, Data> {

    public static class a<Data> {
        public final m a;

        /* renamed from: b  reason: collision with root package name */
        public final List<m> f810b;
        public final d<Data> c;

        public a(@NonNull m mVar, @NonNull d<Data> dVar) {
            List<m> emptyList = Collections.emptyList();
            Objects.requireNonNull(mVar, "Argument must not be null");
            this.a = mVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.f810b = emptyList;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.c = dVar;
        }
    }

    @Nullable
    a<Data> a(@NonNull Model model, int i2, int i3, @NonNull p pVar);

    boolean b(@NonNull Model model);
}
