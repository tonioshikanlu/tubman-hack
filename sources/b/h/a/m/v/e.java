package b.h.a.m.v;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import b.h.a.m.m;
import java.security.MessageDigest;

public final class e implements m {

    /* renamed from: b  reason: collision with root package name */
    public final m f670b;
    public final m c;

    public e(m mVar, m mVar2) {
        this.f670b = mVar;
        this.c = mVar2;
    }

    public void b(@NonNull MessageDigest messageDigest) {
        this.f670b.b(messageDigest);
        this.c.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f670b.equals(eVar.f670b) && this.c.equals(eVar.c);
    }

    public int hashCode() {
        return this.c.hashCode() + (this.f670b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder y = a.y("DataCacheKey{sourceKey=");
        y.append(this.f670b);
        y.append(", signature=");
        y.append(this.c);
        y.append('}');
        return y.toString();
    }
}
