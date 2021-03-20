package e.t;

import e.x.c.z.a;
import java.util.Iterator;

public abstract class v implements Iterator<Long>, a {
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
