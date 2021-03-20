package b.l.a.c.f.i;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e7 implements Iterator<Object> {
    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
