package b.l.a.a.e.e;

import b.e.a.a.a;

public final class h extends n {
    public final long a;

    public h(long j2) {
        this.a = j2;
    }

    public long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.a == ((n) obj).b();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        return ((int) (j2 ^ (j2 >>> 32))) ^ 1000003;
    }

    public String toString() {
        StringBuilder y = a.y("LogResponse{nextRequestWaitMillis=");
        y.append(this.a);
        y.append("}");
        return y.toString();
    }
}
