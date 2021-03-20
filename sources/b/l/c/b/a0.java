package b.l.c.b;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public abstract class a0<E> extends AbstractSet<E> {
    public boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof o) {
            collection = ((o) collection).c();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= size()) {
            for (Object remove : collection) {
                z |= remove(remove);
            }
        } else {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
