package b.l.f;

import java.util.Objects;

public final class f {
    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        Objects.requireNonNull((f) obj);
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "0x0";
    }
}
