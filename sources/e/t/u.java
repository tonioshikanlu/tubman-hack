package e.t;

import e.x.c.z.a;
import java.util.Iterator;

public abstract class u implements Iterator<Integer>, a {
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
