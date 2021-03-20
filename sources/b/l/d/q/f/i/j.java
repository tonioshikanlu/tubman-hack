package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class j extends v.d.C0082d {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5236b;
    public final v.d.C0082d.a c;
    public final v.d.C0082d.b d;

    /* renamed from: e  reason: collision with root package name */
    public final v.d.C0082d.c f5237e;

    public j(long j2, String str, v.d.C0082d.a aVar, v.d.C0082d.b bVar, v.d.C0082d.c cVar, a aVar2) {
        this.a = j2;
        this.f5236b = str;
        this.c = aVar;
        this.d = bVar;
        this.f5237e = cVar;
    }

    @NonNull
    public v.d.C0082d.a a() {
        return this.c;
    }

    @NonNull
    public v.d.C0082d.b b() {
        return this.d;
    }

    @Nullable
    public v.d.C0082d.c c() {
        return this.f5237e;
    }

    public long d() {
        return this.a;
    }

    @NonNull
    public String e() {
        return this.f5236b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0082d)) {
            return false;
        }
        v.d.C0082d dVar = (v.d.C0082d) obj;
        if (this.a == dVar.d() && this.f5236b.equals(dVar.e()) && this.c.equals(dVar.a()) && this.d.equals(dVar.b())) {
            v.d.C0082d.c cVar = this.f5237e;
            v.d.C0082d.c c2 = dVar.c();
            if (cVar == null) {
                if (c2 == null) {
                    return true;
                }
            } else if (cVar.equals(c2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f5236b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        v.d.C0082d.c cVar = this.f5237e;
        return hashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Event{timestamp=");
        y.append(this.a);
        y.append(", type=");
        y.append(this.f5236b);
        y.append(", app=");
        y.append(this.c);
        y.append(", device=");
        y.append(this.d);
        y.append(", log=");
        y.append(this.f5237e);
        y.append("}");
        return y.toString();
    }
}
