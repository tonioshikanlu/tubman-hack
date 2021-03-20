package b.j.a.c.f0;

import java.io.Serializable;

public final class a implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f1973h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1974i;

    /* renamed from: j  reason: collision with root package name */
    public String f1975j;

    public a(Class<?> cls, String str) {
        this.f1973h = cls;
        this.f1974i = cls.getName().hashCode();
        this.f1975j = (str == null || str.length() == 0) ? null : str;
    }

    public boolean a() {
        return this.f1975j != null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == a.class) {
            return this.f1973h == ((a) obj).f1973h;
        }
        return false;
    }

    public int hashCode() {
        return this.f1974i;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("[NamedType, class ");
        b.e.a.a.a.I(this.f1973h, y, ", name: ");
        return b.e.a.a.a.q(y, this.f1975j == null ? "null" : b.e.a.a.a.q(b.e.a.a.a.y("'"), this.f1975j, "'"), "]");
    }
}
