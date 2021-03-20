package g.a;

import b.e.a.a.a;
import e.r;
import e.x.b.l;
import e.x.c.i;

public final class s {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, r> f9981b;

    public s(Object obj, l<? super Throwable, r> lVar) {
        this.a = obj;
        this.f9981b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return i.a(this.a, sVar.a) && i.a(this.f9981b, sVar.f9981b);
    }

    public int hashCode() {
        Object obj = this.a;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        l<Throwable, r> lVar = this.f9981b;
        if (lVar != null) {
            i2 = lVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("CompletedWithCancellation(result=");
        y.append(this.a);
        y.append(", onCancellation=");
        y.append(this.f9981b);
        y.append(")");
        return y.toString();
    }
}
