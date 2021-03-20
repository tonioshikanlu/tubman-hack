package e.t;

import e.x.c.z.a;
import java.util.Iterator;

public abstract class k implements Iterator<Boolean>, a {
    public final Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }

    public abstract boolean nextBoolean();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
