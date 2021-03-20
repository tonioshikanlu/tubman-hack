package b.l.a.a.e.e;

import androidx.annotation.Nullable;
import b.l.a.a.e.e.k;

public final class e extends k {
    public final k.a a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2424b;

    public e(k.a aVar, a aVar2, a aVar3) {
        this.a = aVar;
        this.f2424b = aVar2;
    }

    @Nullable
    public a a() {
        return this.f2424b;
    }

    @Nullable
    public k.a b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.a aVar = this.a;
        if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
            a aVar2 = this.f2424b;
            a a2 = kVar.a();
            if (aVar2 == null) {
                if (a2 == null) {
                    return true;
                }
            } else if (aVar2.equals(a2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.a aVar = this.a;
        int i2 = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.f2424b;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("ClientInfo{clientType=");
        y.append(this.a);
        y.append(", androidClientInfo=");
        y.append(this.f2424b);
        y.append("}");
        return y.toString();
    }
}
