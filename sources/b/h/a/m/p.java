package b.h.a.m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import b.e.a.a.a;
import b.h.a.m.o;
import b.h.a.s.b;
import java.security.MessageDigest;

public final class p implements m {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap<o<?>, Object> f586b = new b();

    public void b(@NonNull MessageDigest messageDigest) {
        for (int i2 = 0; i2 < this.f586b.size(); i2++) {
            o keyAt = this.f586b.keyAt(i2);
            Object valueAt = this.f586b.valueAt(i2);
            o.b<T> bVar = keyAt.f585b;
            if (keyAt.d == null) {
                keyAt.d = keyAt.c.getBytes(m.a);
            }
            bVar.a(keyAt.d, valueAt, messageDigest);
        }
    }

    @Nullable
    public <T> T c(@NonNull o<T> oVar) {
        return this.f586b.containsKey(oVar) ? this.f586b.get(oVar) : oVar.a;
    }

    public void d(@NonNull p pVar) {
        this.f586b.putAll(pVar.f586b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f586b.equals(((p) obj).f586b);
        }
        return false;
    }

    public int hashCode() {
        return this.f586b.hashCode();
    }

    public String toString() {
        StringBuilder y = a.y("Options{values=");
        y.append(this.f586b);
        y.append('}');
        return y.toString();
    }
}
