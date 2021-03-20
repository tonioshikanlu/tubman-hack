package b.l.c.b;

import java.io.Serializable;

public final class z<T> extends w<T> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final w<? super T> f4899h;

    public z(w<? super T> wVar) {
        this.f4899h = wVar;
    }

    public <S extends T> w<S> a() {
        return this.f4899h;
    }

    public int compare(T t, T t2) {
        return this.f4899h.compare(t2, t);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return this.f4899h.equals(((z) obj).f4899h);
        }
        return false;
    }

    public int hashCode() {
        return -this.f4899h.hashCode();
    }

    public String toString() {
        return this.f4899h + ".reverse()";
    }
}
