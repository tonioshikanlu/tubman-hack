package e.a.a.a.y0.m.p1;

import e.x.c.i;

public final class a<T> {
    public final T a;

    /* renamed from: b  reason: collision with root package name */
    public final T f9746b;

    public a(T t, T t2) {
        this.a = t;
        this.f9746b = t2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.f9746b, aVar.f9746b);
    }

    public int hashCode() {
        T t = this.a;
        int i2 = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.f9746b;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("ApproximationBounds(lower=");
        y.append(this.a);
        y.append(", upper=");
        y.append(this.f9746b);
        y.append(")");
        return y.toString();
    }
}
