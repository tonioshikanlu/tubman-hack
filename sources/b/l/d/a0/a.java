package b.l.d.a0;

import java.util.Objects;

public final class a extends e {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4904b;

    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f4904b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.f4904b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a()) && this.f4904b.equals(eVar.b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4904b.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("LibraryVersion{libraryName=");
        y.append(this.a);
        y.append(", version=");
        return b.e.a.a.a.q(y, this.f4904b, "}");
    }
}
