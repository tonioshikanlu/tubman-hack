package b.a.a.g;

import b.e.a.a.a;

public final class u0 {
    public boolean a;

    public u0() {
        this.a = false;
    }

    public u0(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof u0) && this.a == ((u0) obj).a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.s(a.y("UpdateEvent(fromPush="), this.a, ")");
    }

    public u0(boolean z, int i2) {
        this.a = (i2 & 1) != 0 ? false : z;
    }
}
