package b.l.d.s;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import java.util.Collections;
import java.util.Map;

public final class d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f5289b;

    public d(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.f5289b = map;
    }

    @NonNull
    public static d a(@NonNull String str) {
        return new d(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.f5289b.equals(dVar.f5289b);
    }

    public int hashCode() {
        return this.f5289b.hashCode() + (this.a.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder y = a.y("FieldDescriptor{name=");
        y.append(this.a);
        y.append(", properties=");
        y.append(this.f5289b.values());
        y.append("}");
        return y.toString();
    }
}
