package b.a.a.i;

import b.e.a.a.a;
import com.appfoundry.previewer.model.Dimensions;
import e.x.c.i;

public final class b {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f308b;
    public final Dimensions c;
    public final Float d;

    public b(int i2, int i3, Dimensions dimensions, Float f) {
        i.e(dimensions, "margins");
        this.a = i2;
        this.f308b = i3;
        this.c = dimensions;
        this.d = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.f308b == bVar.f308b && i.a(this.c, bVar.c) && i.a(this.d, bVar.d);
    }

    public int hashCode() {
        int hashCode = (Integer.hashCode(this.f308b) + (Integer.hashCode(this.a) * 31)) * 31;
        Dimensions dimensions = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode + (dimensions != null ? dimensions.hashCode() : 0)) * 31;
        Float f = this.d;
        if (f != null) {
            i2 = f.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("CalculatedDimensions(width=");
        y.append(this.a);
        y.append(", height=");
        y.append(this.f308b);
        y.append(", margins=");
        y.append(this.c);
        y.append(", flexoMargins=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
