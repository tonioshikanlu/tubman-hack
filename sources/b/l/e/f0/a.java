package b.l.e.f0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public class a<T> {
    public final Class<? super T> a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f5519b;
    public final int c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a2 = b.l.e.e0.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f5519b = a2;
            this.a = b.l.e.e0.a.e(a2);
            this.c = a2.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.l.e.e0.a.c(this.f5519b, ((a) obj).f5519b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return b.l.e.e0.a.i(this.f5519b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a2 = b.l.e.e0.a.a(type);
        this.f5519b = a2;
        this.a = b.l.e.e0.a.e(a2);
        this.c = a2.hashCode();
    }
}
