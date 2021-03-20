package b.l.a.c.f.i;

import b.e.a.a.a;
import java.io.Serializable;
import java.util.Objects;

public final class u3<T> implements Serializable, t3 {

    /* renamed from: h  reason: collision with root package name */
    public final t3<T> f3771h;

    /* renamed from: i  reason: collision with root package name */
    public volatile transient boolean f3772i;

    /* renamed from: j  reason: collision with root package name */
    public transient T f3773j;

    public u3(t3<T> t3Var) {
        Objects.requireNonNull(t3Var);
        this.f3771h = t3Var;
    }

    public final T a() {
        if (!this.f3772i) {
            synchronized (this) {
                if (!this.f3772i) {
                    T a = this.f3771h.a();
                    this.f3773j = a;
                    this.f3772i = true;
                    return a;
                }
            }
        }
        return this.f3773j;
    }

    public final String toString() {
        Object obj;
        if (this.f3772i) {
            String valueOf = String.valueOf(this.f3773j);
            obj = a.r(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f3771h;
        }
        String valueOf2 = String.valueOf(obj);
        return a.r(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }
}
