package b.l.a.c.f.e;

import b.e.a.a.a;
import java.util.Map;

public final class v0 implements Map.Entry, Comparable<v0> {

    /* renamed from: h  reason: collision with root package name */
    public final Comparable f3347h;

    /* renamed from: i  reason: collision with root package name */
    public Object f3348i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z0 f3349j;

    public v0(z0 z0Var, Comparable comparable, Object obj) {
        this.f3349j = z0Var;
        this.f3347h = comparable;
        this.f3348i = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f3347h.compareTo(((v0) obj).f3347h);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f3347h;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f3348i;
            Object value = entry.getValue();
            if (obj2 == null) {
                z = value == null;
            } else {
                z = obj2.equals(value);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f3347h;
    }

    public final Object getValue() {
        return this.f3348i;
    }

    public final int hashCode() {
        Comparable comparable = this.f3347h;
        int i2 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3348i;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode ^ i2;
    }

    public final Object setValue(Object obj) {
        z0 z0Var = this.f3349j;
        int i2 = z0.f3429n;
        z0Var.g();
        Object obj2 = this.f3348i;
        this.f3348i = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3347h);
        String valueOf2 = String.valueOf(this.f3348i);
        return a.r(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
