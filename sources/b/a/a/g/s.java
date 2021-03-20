package b.a.a.g;

import b.e.a.a.a;

public final class s {
    public final boolean a;

    public s() {
        this(false, 1);
    }

    public s(boolean z) {
        this.a = z;
    }

    public s(boolean z, int i2) {
        this.a = (i2 & 1) != 0 ? false : z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof s) && this.a == ((s) obj).a;
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
        return a.s(a.y("LogoutEvent(hard="), this.a, ")");
    }
}
