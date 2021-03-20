package b.l.a.c.f.i;

import b.e.a.a.a;
import java.io.Serializable;
import java.util.Arrays;

public final class w3<T> implements Serializable, t3 {

    /* renamed from: h  reason: collision with root package name */
    public final T f3796h;

    public w3(T t) {
        this.f3796h = t;
    }

    public final T a() {
        return this.f3796h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w3)) {
            return false;
        }
        T t = this.f3796h;
        T t2 = ((w3) obj).f3796h;
        return t == t2 || t.equals(t2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3796h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3796h);
        return a.r(new StringBuilder(valueOf.length() + 22), "Suppliers.ofInstance(", valueOf, ")");
    }
}
