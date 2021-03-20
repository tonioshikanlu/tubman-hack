package b.l.a.a.e.e;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import java.util.List;
import java.util.Objects;

public final class d extends j {
    public final List<m> a;

    public d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.a = list;
    }

    @NonNull
    public List<m> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.a.equals(((j) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder y = a.y("BatchedLogRequest{logRequests=");
        y.append(this.a);
        y.append("}");
        return y.toString();
    }
}
