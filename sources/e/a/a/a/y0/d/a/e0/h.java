package e.a.a.a.y0.d.a.e0;

import b.e.a.a.a;
import e.x.c.i;
import java.util.Objects;

public final class h {
    public final g a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8509b;

    public h(g gVar, boolean z) {
        i.e(gVar, "qualifier");
        this.a = gVar;
        this.f8509b = z;
    }

    public static h a(h hVar, g gVar, boolean z, int i2) {
        g gVar2 = (i2 & 1) != 0 ? hVar.a : null;
        if ((i2 & 2) != 0) {
            z = hVar.f8509b;
        }
        Objects.requireNonNull(hVar);
        i.e(gVar2, "qualifier");
        return new h(gVar2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i.a(this.a, hVar.a) && this.f8509b == hVar.f8509b;
    }

    public int hashCode() {
        g gVar = this.a;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        boolean z = this.f8509b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder y = a.y("NullabilityQualifierWithMigrationStatus(qualifier=");
        y.append(this.a);
        y.append(", isForWarningOnly=");
        return a.s(y, this.f8509b, ")");
    }
}
