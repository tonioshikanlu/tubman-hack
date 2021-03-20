package b.l.a.a.f.n;

import b.e.a.a.a;
import b.l.a.a.f.n.g;
import java.util.Objects;

public final class b extends g {
    public final g.a a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2492b;

    public b(g.a aVar, long j2) {
        Objects.requireNonNull(aVar, "Null status");
        this.a = aVar;
        this.f2492b = j2;
    }

    public long b() {
        return this.f2492b;
    }

    public g.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.c()) && this.f2492b == gVar.b();
    }

    public int hashCode() {
        long j2 = this.f2492b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder y = a.y("BackendResponse{status=");
        y.append(this.a);
        y.append(", nextRequestWaitMillis=");
        y.append(this.f2492b);
        y.append("}");
        return y.toString();
    }
}
