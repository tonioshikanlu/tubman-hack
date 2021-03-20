package b.l.d.q.f.g;

import b.e.a.a.a;
import b.l.d.q.f.i.v;
import java.util.Objects;

public final class b extends z {
    public final v a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5060b;

    public b(v vVar, String str) {
        Objects.requireNonNull(vVar, "Null report");
        this.a = vVar;
        Objects.requireNonNull(str, "Null sessionId");
        this.f5060b = str;
    }

    public v a() {
        return this.a;
    }

    public String b() {
        return this.f5060b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a.equals(zVar.a()) && this.f5060b.equals(zVar.b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f5060b.hashCode();
    }

    public String toString() {
        StringBuilder y = a.y("CrashlyticsReportWithSessionId{report=");
        y.append(this.a);
        y.append(", sessionId=");
        return a.q(y, this.f5060b, "}");
    }
}
