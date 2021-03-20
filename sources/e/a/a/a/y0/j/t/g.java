package e.a.a.a.y0.j.t;

import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.x.c.i;

public abstract class g<T> {
    public final T a;

    public g(T t) {
        this.a = t;
    }

    public abstract d0 a(w wVar);

    public T b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object b2 = b();
            Object obj2 = null;
            if (!(obj instanceof g)) {
                obj = null;
            }
            g gVar = (g) obj;
            if (gVar != null) {
                obj2 = gVar.b();
            }
            return i.a(b2, obj2);
        }
    }

    public int hashCode() {
        Object b2 = b();
        if (b2 != null) {
            return b2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
