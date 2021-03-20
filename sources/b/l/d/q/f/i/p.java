package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import b.l.d.q.f.i.v;

public final class p extends v.d.C0082d.a.b.C0086d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5245b;
    public final w<v.d.C0082d.a.b.C0086d.C0087a> c;

    public p(String str, int i2, w wVar, a aVar) {
        this.a = str;
        this.f5245b = i2;
        this.c = wVar;
    }

    @NonNull
    public w<v.d.C0082d.a.b.C0086d.C0087a> a() {
        return this.c;
    }

    public int b() {
        return this.f5245b;
    }

    @NonNull
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0082d.a.b.C0086d)) {
            return false;
        }
        v.d.C0082d.a.b.C0086d dVar = (v.d.C0082d.a.b.C0086d) obj;
        return this.a.equals(dVar.c()) && this.f5245b == dVar.b() && this.c.equals(dVar.a());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f5245b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Thread{name=");
        y.append(this.a);
        y.append(", importance=");
        y.append(this.f5245b);
        y.append(", frames=");
        y.append(this.c);
        y.append("}");
        return y.toString();
    }
}
