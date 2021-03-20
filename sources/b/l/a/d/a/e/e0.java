package b.l.a.d.a.e;

import java.util.Objects;

public final class e0<T> implements f0, c0 {
    public static final Object c = new Object();
    public volatile f0<T> a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f4659b = c;

    public e0(f0<T> f0Var) {
        this.a = f0Var;
    }

    public static <P extends f0<T>, T> c0<T> b(P p2) {
        if (p2 instanceof c0) {
            return (c0) p2;
        }
        Objects.requireNonNull(p2);
        return new e0(p2);
    }

    public final T a() {
        T t = this.f4659b;
        T t2 = c;
        if (t == t2) {
            synchronized (this) {
                t = this.f4659b;
                if (t == t2) {
                    t = this.a.a();
                    T t3 = this.f4659b;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f4659b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
