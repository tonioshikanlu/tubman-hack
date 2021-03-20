package b.l.a.a.e.e;

import androidx.annotation.Nullable;
import b.l.a.a.e.e.o;

public final class i extends o {
    public final o.b a;

    /* renamed from: b  reason: collision with root package name */
    public final o.a f2434b;

    public i(o.b bVar, o.a aVar, a aVar2) {
        this.a = bVar;
        this.f2434b = aVar;
    }

    @Nullable
    public o.a a() {
        return this.f2434b;
    }

    @Nullable
    public o.b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.a;
        if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
            o.a aVar = this.f2434b;
            o.a a2 = oVar.a();
            if (aVar == null) {
                if (a2 == null) {
                    return true;
                }
            } else if (aVar.equals(a2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.a;
        int i2 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        o.a aVar = this.f2434b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("NetworkConnectionInfo{networkType=");
        y.append(this.a);
        y.append(", mobileSubtype=");
        y.append(this.f2434b);
        y.append("}");
        return y.toString();
    }
}
