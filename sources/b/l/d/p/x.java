package b.l.d.p;

import b.l.d.w.b;

public class x<T> implements b<T> {
    public static final Object c = new Object();
    public volatile Object a = c;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f5051b;

    public x(b<T> bVar) {
        this.f5051b = bVar;
    }

    public T get() {
        T t = this.a;
        T t2 = c;
        if (t == t2) {
            synchronized (this) {
                t = this.a;
                if (t == t2) {
                    t = this.f5051b.get();
                    this.a = t;
                    this.f5051b = null;
                }
            }
        }
        return t;
    }
}
