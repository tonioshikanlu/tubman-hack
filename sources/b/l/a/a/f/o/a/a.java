package b.l.a.a.f.o.a;

public final class a<T> implements m.a.a<T> {
    public static final Object c = new Object();
    public volatile m.a.a<T> a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f2503b = c;

    public a(m.a.a<T> aVar) {
        this.a = aVar;
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f2503b;
        T t2 = c;
        if (t == t2) {
            synchronized (this) {
                t = this.f2503b;
                if (t == t2) {
                    t = this.a.get();
                    a(this.f2503b, t);
                    this.f2503b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
