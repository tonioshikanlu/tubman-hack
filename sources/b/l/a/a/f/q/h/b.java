package b.l.a.a.f.q.h;

import b.l.a.a.f.q.h.f;
import b.l.a.a.f.s.a;
import java.util.Map;
import java.util.Objects;

public final class b extends f {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<b.l.a.a.b, f.a> f2515b;

    public b(a aVar, Map<b.l.a.a.b, f.a> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f2515b = map;
    }

    public a a() {
        return this.a;
    }

    public Map<b.l.a.a.b, f.a> c() {
        return this.f2515b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a()) && this.f2515b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f2515b.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("SchedulerConfig{clock=");
        y.append(this.a);
        y.append(", values=");
        y.append(this.f2515b);
        y.append("}");
        return y.toString();
    }
}
