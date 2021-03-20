package b.l.a.c.f.i;

import b.e.a.a.a;
import java.util.Map;

public final class h7 implements Map.Entry, Comparable<h7> {

    /* renamed from: h  reason: collision with root package name */
    public final Comparable f3589h;

    /* renamed from: i  reason: collision with root package name */
    public Object f3590i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k7 f3591j;

    public h7(k7 k7Var, Comparable comparable, Object obj) {
        this.f3591j = k7Var;
        this.f3589h = comparable;
        this.f3590i = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f3589h.compareTo(((h7) obj).f3589h);
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
        Comparable comparable = this.f3589h;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f3590i;
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
        return this.f3589h;
    }

    public final Object getValue() {
        return this.f3590i;
    }

    public final int hashCode() {
        Comparable comparable = this.f3589h;
        int i2 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3590i;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode ^ i2;
    }

    public final Object setValue(Object obj) {
        k7 k7Var = this.f3591j;
        int i2 = k7.f3633n;
        k7Var.g();
        Object obj2 = this.f3590i;
        this.f3590i = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3589h);
        String valueOf2 = String.valueOf(this.f3590i);
        return a.r(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
