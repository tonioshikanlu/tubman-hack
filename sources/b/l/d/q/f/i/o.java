package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import b.l.d.q.f.i.v;

public final class o extends v.d.C0082d.a.b.c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5244b;
    public final long c;

    public o(String str, String str2, long j2, a aVar) {
        this.a = str;
        this.f5244b = str2;
        this.c = j2;
    }

    @NonNull
    public long a() {
        return this.c;
    }

    @NonNull
    public String b() {
        return this.f5244b;
    }

    @NonNull
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0082d.a.b.c)) {
            return false;
        }
        v.d.C0082d.a.b.c cVar = (v.d.C0082d.a.b.c) obj;
        return this.a.equals(cVar.c()) && this.f5244b.equals(cVar.b()) && this.c == cVar.a();
    }

    public int hashCode() {
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f5244b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Signal{name=");
        y.append(this.a);
        y.append(", code=");
        y.append(this.f5244b);
        y.append(", address=");
        y.append(this.c);
        y.append("}");
        return y.toString();
    }
}
