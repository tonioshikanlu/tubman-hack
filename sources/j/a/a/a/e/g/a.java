package j.a.a.a.e.g;

import androidx.annotation.NonNull;

public class a<T> implements b<T> {
    public final Class<? extends T> a;

    public a(@NonNull Class<? extends T> cls) {
        this.a = cls;
    }

    @NonNull
    public T a() {
        return this.a.newInstance();
    }
}
