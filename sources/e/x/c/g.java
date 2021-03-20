package e.x.c;

import e.a.d;
import e.a.h;
import e.x.a;
import e.x.c.b;

public class g extends b implements f, h {

    /* renamed from: o  reason: collision with root package name */
    public final int f7984o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7985p;

    public g(int i2) {
        this(i2, b.a.f7977h, (Class) null, (String) null, (String) null, 0);
    }

    public g(int i2, Object obj) {
        this(i2, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f7984o = i2;
        this.f7985p = i3 >> 1;
    }

    public d B() {
        d e2 = e();
        if (e2 != this) {
            return (h) e2;
        }
        throw new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (!i.a(u(), gVar.u()) || !getName().equals(gVar.getName()) || !D().equals(gVar.D()) || this.f7985p != gVar.f7985p || this.f7984o != gVar.f7984o || !i.a(this.f7972i, gVar.f7972i)) {
                return false;
            }
            return true;
        } else if (obj instanceof h) {
            return obj.equals(e());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.f7984o;
    }

    public int hashCode() {
        return D().hashCode() + ((getName().hashCode() + (u() == null ? 0 : u().hashCode() * 31)) * 31);
    }

    public d r() {
        return v.a.a(this);
    }

    public String toString() {
        d e2 = e();
        if (e2 != this) {
            return e2.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder y = b.e.a.a.a.y("function ");
        y.append(getName());
        y.append(" (Kotlin reflection is not available)");
        return y.toString();
    }
}
