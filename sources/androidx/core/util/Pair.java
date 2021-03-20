package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;

public class Pair<F, S> {
    @Nullable
    public final F first;
    @Nullable
    public final S second;

    public Pair(@Nullable F f, @Nullable S s) {
        this.first = f;
        this.second = s;
    }

    @NonNull
    public static <A, B> Pair<A, B> create(@Nullable A a, @Nullable B b2) {
        return new Pair<>(a, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f = this.first;
        int i2 = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.second;
        if (s != null) {
            i2 = s.hashCode();
        }
        return hashCode ^ i2;
    }

    @NonNull
    public String toString() {
        StringBuilder y = a.y("Pair{");
        y.append(String.valueOf(this.first));
        y.append(" ");
        y.append(String.valueOf(this.second));
        y.append("}");
        return y.toString();
    }
}
