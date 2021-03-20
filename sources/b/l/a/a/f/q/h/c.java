package b.l.a.a.f.q.h;

import b.l.a.a.f.q.h.f;
import java.util.Set;

public final class c extends f.a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2516b;
    public final Set<f.b> c;

    public static final class b extends f.a.C0056a {
        public Long a;

        /* renamed from: b  reason: collision with root package name */
        public Long f2517b;
        public Set<f.b> c;

        public f.a a() {
            String str = this.a == null ? " delta" : "";
            if (this.f2517b == null) {
                str = b.e.a.a.a.m(str, " maxAllowedDelay");
            }
            if (this.c == null) {
                str = b.e.a.a.a.m(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.a.longValue(), this.f2517b.longValue(), this.c, (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }

        public f.a.C0056a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public f.a.C0056a c(long j2) {
            this.f2517b = Long.valueOf(j2);
            return this;
        }
    }

    public c(long j2, long j3, Set set, a aVar) {
        this.a = j2;
        this.f2516b = j3;
        this.c = set;
    }

    public long b() {
        return this.a;
    }

    public Set<f.b> c() {
        return this.c;
    }

    public long d() {
        return this.f2516b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.a)) {
            return false;
        }
        f.a aVar = (f.a) obj;
        return this.a == aVar.b() && this.f2516b == aVar.d() && this.c.equals(aVar.c());
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f2516b;
        return ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("ConfigValue{delta=");
        y.append(this.a);
        y.append(", maxAllowedDelay=");
        y.append(this.f2516b);
        y.append(", flags=");
        y.append(this.c);
        y.append("}");
        return y.toString();
    }
}
