package b.h.a.m.u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.f;

public interface d<T> {

    public interface a<T> {
        void c(@NonNull Exception exc);

        void d(@Nullable T t);
    }

    @NonNull
    Class<T> a();

    void b();

    void cancel();

    @NonNull
    b.h.a.m.a e();

    void f(@NonNull f fVar, @NonNull a<? super T> aVar);
}
