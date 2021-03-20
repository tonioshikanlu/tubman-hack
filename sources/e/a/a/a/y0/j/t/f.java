package e.a.a.a.y0.j.t;

import e.a.a.a.y0.f.a;
import e.x.c.i;

public final class f {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9411b;

    public f(a aVar, int i2) {
        i.e(aVar, "classId");
        this.a = aVar;
        this.f9411b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && this.f9411b == fVar.f9411b;
    }

    public int hashCode() {
        a aVar = this.a;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.f9411b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f9411b;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.a);
        int i4 = this.f9411b;
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
