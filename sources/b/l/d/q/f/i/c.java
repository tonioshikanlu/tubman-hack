package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import b.l.d.q.f.i.v;

public final class c extends v.b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5206b;

    public c(String str, String str2, a aVar) {
        this.a = str;
        this.f5206b = str2;
    }

    @NonNull
    public String a() {
        return this.a;
    }

    @NonNull
    public String b() {
        return this.f5206b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.b)) {
            return false;
        }
        v.b bVar = (v.b) obj;
        return this.a.equals(bVar.a()) && this.f5206b.equals(bVar.b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f5206b.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("CustomAttribute{key=");
        y.append(this.a);
        y.append(", value=");
        return b.e.a.a.a.q(y, this.f5206b, "}");
    }
}
