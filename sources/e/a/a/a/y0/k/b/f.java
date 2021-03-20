package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.e.z.a;
import e.a.a.a.y0.e.z.c;
import e.x.c.i;

public final class f {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final e.a.a.a.y0.e.c f9504b;
    public final a c;
    public final m0 d;

    public f(c cVar, e.a.a.a.y0.e.c cVar2, a aVar, m0 m0Var) {
        i.e(cVar, "nameResolver");
        i.e(cVar2, "classProto");
        i.e(aVar, "metadataVersion");
        i.e(m0Var, "sourceElement");
        this.a = cVar;
        this.f9504b = cVar2;
        this.c = aVar;
        this.d = m0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && i.a(this.f9504b, fVar.f9504b) && i.a(this.c, fVar.c) && i.a(this.d, fVar.d);
    }

    public int hashCode() {
        c cVar = this.a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        e.a.a.a.y0.e.c cVar2 = this.f9504b;
        int hashCode2 = (hashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        m0 m0Var = this.d;
        if (m0Var != null) {
            i2 = m0Var.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("ClassData(nameResolver=");
        y.append(this.a);
        y.append(", classProto=");
        y.append(this.f9504b);
        y.append(", metadataVersion=");
        y.append(this.c);
        y.append(", sourceElement=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
