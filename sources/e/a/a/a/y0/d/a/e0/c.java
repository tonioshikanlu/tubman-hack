package e.a.a.a.y0.d.a.e0;

import b.e.a.a.a;
import e.a.a.a.y0.b.a1.h;
import e.x.c.i;

public final class c<T> {
    public final T a;

    /* renamed from: b  reason: collision with root package name */
    public final h f8498b;

    public c(T t, h hVar) {
        this.a = t;
        this.f8498b = hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.a, cVar.a) && i.a(this.f8498b, cVar.f8498b);
    }

    public int hashCode() {
        T t = this.a;
        int i2 = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        h hVar = this.f8498b;
        if (hVar != null) {
            i2 = hVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("EnhancementResult(result=");
        y.append(this.a);
        y.append(", enhancementAnnotations=");
        y.append(this.f8498b);
        y.append(")");
        return y.toString();
    }
}
