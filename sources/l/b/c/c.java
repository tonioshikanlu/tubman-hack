package l.b.c;

public final class c extends l {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8110b;
    public final r c;

    public c(boolean z, r rVar, a aVar) {
        this.f8110b = z;
        this.c = rVar;
    }

    public boolean a() {
        return this.f8110b;
    }

    public r b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f8110b == lVar.a()) {
            r rVar = this.c;
            r b2 = lVar.b();
            if (rVar == null) {
                if (b2 == null) {
                    return true;
                }
            } else if (rVar.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = ((this.f8110b ? 1231 : 1237) ^ 1000003) * 1000003;
        r rVar = this.c;
        return i2 ^ (rVar == null ? 0 : rVar.hashCode());
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("EndSpanOptions{sampleToLocalSpanStore=");
        y.append(this.f8110b);
        y.append(", status=");
        y.append(this.c);
        y.append("}");
        return y.toString();
    }
}
