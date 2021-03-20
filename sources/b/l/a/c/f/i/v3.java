package b.l.a.c.f.i;

import b.e.a.a.a;
import java.util.Objects;

public final class v3<T> implements t3<T> {

    /* renamed from: h  reason: collision with root package name */
    public volatile t3<T> f3780h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f3781i;

    /* renamed from: j  reason: collision with root package name */
    public T f3782j;

    public v3(t3<T> t3Var) {
        Objects.requireNonNull(t3Var);
        this.f3780h = t3Var;
    }

    public final T a() {
        if (!this.f3781i) {
            synchronized (this) {
                if (!this.f3781i) {
                    T a = this.f3780h.a();
                    this.f3782j = a;
                    this.f3781i = true;
                    this.f3780h = null;
                    return a;
                }
            }
        }
        return this.f3782j;
    }

    public final String toString() {
        Object obj = this.f3780h;
        if (obj == null) {
            String valueOf = String.valueOf(this.f3782j);
            obj = a.r(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return a.r(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }
}
