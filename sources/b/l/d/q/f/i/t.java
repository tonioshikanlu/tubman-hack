package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import b.l.d.q.f.i.v;

public final class t extends v.d.e {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5254b;
    public final String c;
    public final boolean d;

    public t(int i2, String str, String str2, boolean z, a aVar) {
        this.a = i2;
        this.f5254b = str;
        this.c = str2;
        this.d = z;
    }

    @NonNull
    public String a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    @NonNull
    public String c() {
        return this.f5254b;
    }

    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.e)) {
            return false;
        }
        v.d.e eVar = (v.d.e) obj;
        return this.a == eVar.b() && this.f5254b.equals(eVar.c()) && this.c.equals(eVar.a()) && this.d == eVar.d();
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.f5254b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("OperatingSystem{platform=");
        y.append(this.a);
        y.append(", version=");
        y.append(this.f5254b);
        y.append(", buildVersion=");
        y.append(this.c);
        y.append(", jailbroken=");
        return b.e.a.a.a.s(y, this.d, "}");
    }
}
