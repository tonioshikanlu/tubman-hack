package b.l.c.b;

import b.l.c.b.o;
import java.util.Iterator;
import java.util.Objects;

public abstract class e0<F, T> implements Iterator<T> {

    /* renamed from: h  reason: collision with root package name */
    public final Iterator<? extends F> f4844h;

    public e0(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f4844h = it;
    }

    public final boolean hasNext() {
        return this.f4844h.hasNext();
    }

    public final T next() {
        return ((o.a) this.f4844h.next()).m();
    }

    public final void remove() {
        this.f4844h.remove();
    }
}
