package b.h.a.r;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import b.h.a.m.m;
import java.security.MessageDigest;
import java.util.Objects;

public final class b implements m {

    /* renamed from: b  reason: collision with root package name */
    public final Object f1002b;

    public b(@NonNull Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f1002b = obj;
    }

    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f1002b.toString().getBytes(m.a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f1002b.equals(((b) obj).f1002b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1002b.hashCode();
    }

    public String toString() {
        StringBuilder y = a.y("ObjectKey{object=");
        y.append(this.f1002b);
        y.append('}');
        return y.toString();
    }
}
