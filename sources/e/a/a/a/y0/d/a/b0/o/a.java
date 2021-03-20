package e.a.a.a.y0.d.a.b0.o;

import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.d.a.z.k;
import e.x.c.i;

public final class a {
    public final k a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8456b;
    public final boolean c;
    public final r0 d;

    public a(k kVar, b bVar, boolean z, r0 r0Var) {
        i.e(kVar, "howThisTypeIsUsed");
        i.e(bVar, "flexibility");
        this.a = kVar;
        this.f8456b = bVar;
        this.c = z;
        this.d = r0Var;
    }

    public a(k kVar, b bVar, boolean z, r0 r0Var, int i2) {
        b bVar2 = (i2 & 2) != 0 ? b.INFLEXIBLE : null;
        z = (i2 & 4) != 0 ? false : z;
        r0Var = (i2 & 8) != 0 ? null : r0Var;
        i.e(kVar, "howThisTypeIsUsed");
        i.e(bVar2, "flexibility");
        this.a = kVar;
        this.f8456b = bVar2;
        this.c = z;
        this.d = r0Var;
    }

    public final a a(b bVar) {
        i.e(bVar, "flexibility");
        k kVar = this.a;
        boolean z = this.c;
        r0 r0Var = this.d;
        i.e(kVar, "howThisTypeIsUsed");
        i.e(bVar, "flexibility");
        return new a(kVar, bVar, z, r0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.f8456b, aVar.f8456b) && this.c == aVar.c && i.a(this.d, aVar.d);
    }

    public int hashCode() {
        k kVar = this.a;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        b bVar = this.f8456b;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = (hashCode2 + (z ? 1 : 0)) * 31;
        r0 r0Var = this.d;
        if (r0Var != null) {
            i2 = r0Var.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("JavaTypeAttributes(howThisTypeIsUsed=");
        y.append(this.a);
        y.append(", flexibility=");
        y.append(this.f8456b);
        y.append(", isForAnnotationParameter=");
        y.append(this.c);
        y.append(", upperBoundOfTypeParameter=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
