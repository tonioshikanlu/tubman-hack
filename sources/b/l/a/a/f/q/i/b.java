package b.l.a.a.f.q.i;

import b.e.a.a.a;
import b.l.a.a.f.e;
import b.l.a.a.f.h;
import java.util.Objects;

public final class b extends h {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2545b;
    public final e c;

    public b(long j2, h hVar, e eVar) {
        this.a = j2;
        Objects.requireNonNull(hVar, "Null transportContext");
        this.f2545b = hVar;
        Objects.requireNonNull(eVar, "Null event");
        this.c = eVar;
    }

    public e a() {
        return this.c;
    }

    public long b() {
        return this.a;
    }

    public h c() {
        return this.f2545b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.b() && this.f2545b.equals(hVar.c()) && this.c.equals(hVar.a());
    }

    public int hashCode() {
        long j2 = this.a;
        return ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f2545b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder y = a.y("PersistedEvent{id=");
        y.append(this.a);
        y.append(", transportContext=");
        y.append(this.f2545b);
        y.append(", event=");
        y.append(this.c);
        y.append("}");
        return y.toString();
    }
}
