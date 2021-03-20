package b.l.c.b;

import b.l.a.c.b.a;
import b.l.c.b.o;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;

public abstract class b<E> extends c<E> implements Serializable {
    public final boolean F(E e2, int i2, int i3) {
        a.w(i2, "oldCount");
        a.w(i3, "newCount");
        throw null;
    }

    public final int S(Object obj) {
        throw null;
    }

    public final void clear() {
        throw null;
    }

    public final int e() {
        throw null;
    }

    public final Iterator<E> iterator() {
        return new u(this, entrySet().iterator());
    }

    public final int k(Object obj, int i2) {
        if (i2 != 0) {
            a.m(i2 > 0, "occurrences cannot be negative: %s", i2);
            throw null;
        }
        throw null;
    }

    public final Iterator<E> l() {
        Objects.requireNonNull(this);
        throw null;
    }

    public final Iterator<o.a<E>> n() {
        Objects.requireNonNull(this);
        throw null;
    }

    public final int o(E e2, int i2) {
        if (i2 != 0) {
            a.m(i2 > 0, "occurrences cannot be negative: %s", i2);
            throw null;
        }
        throw null;
    }

    public final int size() {
        return a.x0(0);
    }
}
