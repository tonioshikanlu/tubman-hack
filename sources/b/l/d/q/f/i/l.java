package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import b.l.d.q.f.i.v;

public final class l extends v.d.C0082d.a.b {
    public final w<v.d.C0082d.a.b.C0086d> a;

    /* renamed from: b  reason: collision with root package name */
    public final v.d.C0082d.a.b.C0085b f5240b;
    public final v.d.C0082d.a.b.c c;
    public final w<v.d.C0082d.a.b.C0084a> d;

    public l(w wVar, v.d.C0082d.a.b.C0085b bVar, v.d.C0082d.a.b.c cVar, w wVar2, a aVar) {
        this.a = wVar;
        this.f5240b = bVar;
        this.c = cVar;
        this.d = wVar2;
    }

    @NonNull
    public w<v.d.C0082d.a.b.C0084a> a() {
        return this.d;
    }

    @NonNull
    public v.d.C0082d.a.b.C0085b b() {
        return this.f5240b;
    }

    @NonNull
    public v.d.C0082d.a.b.c c() {
        return this.c;
    }

    @NonNull
    public w<v.d.C0082d.a.b.C0086d> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0082d.a.b)) {
            return false;
        }
        v.d.C0082d.a.b bVar = (v.d.C0082d.a.b) obj;
        return this.a.equals(bVar.d()) && this.f5240b.equals(bVar.b()) && this.c.equals(bVar.c()) && this.d.equals(bVar.a());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f5240b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Execution{threads=");
        y.append(this.a);
        y.append(", exception=");
        y.append(this.f5240b);
        y.append(", signal=");
        y.append(this.c);
        y.append(", binaries=");
        y.append(this.d);
        y.append("}");
        return y.toString();
    }
}
