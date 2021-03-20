package e.a.a.a.y0.k.b;

import e.a.a.a.y0.e.z.a;
import e.x.c.i;

public final class r<T extends a> {
    public final T a;

    /* renamed from: b  reason: collision with root package name */
    public final T f9595b;
    public final String c;
    public final e.a.a.a.y0.f.a d;

    public r(T t, T t2, String str, e.a.a.a.y0.f.a aVar) {
        i.e(t, "actualVersion");
        i.e(t2, "expectedVersion");
        i.e(str, "filePath");
        i.e(aVar, "classId");
        this.a = t;
        this.f9595b = t2;
        this.c = str;
        this.d = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return i.a(this.a, rVar.a) && i.a(this.f9595b, rVar.f9595b) && i.a(this.c, rVar.c) && i.a(this.d, rVar.d);
    }

    public int hashCode() {
        T t = this.a;
        int i2 = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.f9595b;
        int hashCode2 = (hashCode + (t2 != null ? t2.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        e.a.a.a.y0.f.a aVar = this.d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("IncompatibleVersionErrorData(actualVersion=");
        y.append(this.a);
        y.append(", expectedVersion=");
        y.append(this.f9595b);
        y.append(", filePath=");
        y.append(this.c);
        y.append(", classId=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
