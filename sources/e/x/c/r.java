package e.x.c;

import e.a.d;
import e.a.l;
import e.x.a;

public abstract class r extends b implements l {
    public r() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) != 1 ? false : true);
    }

    /* renamed from: E */
    public l B() {
        d e2 = e();
        if (e2 != this) {
            return (l) e2;
        }
        throw new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (!u().equals(rVar.u()) || !getName().equals(rVar.getName()) || !D().equals(rVar.D()) || !i.a(this.f7972i, rVar.f7972i)) {
                return false;
            }
            return true;
        } else if (obj instanceof l) {
            return obj.equals(e());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return D().hashCode() + ((hashCode + (u().hashCode() * 31)) * 31);
    }

    public String toString() {
        d e2 = e();
        if (e2 != this) {
            return e2.toString();
        }
        StringBuilder y = b.e.a.a.a.y("property ");
        y.append(getName());
        y.append(" (Kotlin reflection is not available)");
        return y.toString();
    }
}
