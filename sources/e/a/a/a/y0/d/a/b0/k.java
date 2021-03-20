package e.a.a.a.y0.d.a.b0;

import e.a.a.a.y0.d.a.a;
import e.a.a.a.y0.d.a.e0.h;
import e.x.c.i;
import java.util.Collection;

public final class k {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final Collection<a.C0170a> f8371b;

    public k(h hVar, Collection<? extends a.C0170a> collection) {
        i.e(hVar, "nullabilityQualifier");
        i.e(collection, "qualifierApplicabilityTypes");
        this.a = hVar;
        this.f8371b = collection;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.a, kVar.a) && i.a(this.f8371b, kVar.f8371b);
    }

    public int hashCode() {
        h hVar = this.a;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        Collection<a.C0170a> collection = this.f8371b;
        if (collection != null) {
            i2 = collection.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("NullabilityQualifierWithApplicability(nullabilityQualifier=");
        y.append(this.a);
        y.append(", qualifierApplicabilityTypes=");
        y.append(this.f8371b);
        y.append(")");
        return y.toString();
    }
}
