package b.l.a.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

public final class a {
    public final String a;

    public a(@NonNull String str) {
        Objects.requireNonNull(str, "name is null");
        this.a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.a.equals(((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return b.e.a.a.a.q(b.e.a.a.a.y("Encoding{name=\""), this.a, "\"}");
    }
}
