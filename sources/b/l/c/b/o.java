package b.l.c.b;

import java.util.Collection;
import java.util.Set;

public interface o<E> extends Collection<E> {

    public interface a<E> {
        int getCount();

        E m();
    }

    boolean F(E e2, int i2, int i3);

    int S(Object obj);

    boolean add(E e2);

    Set<E> c();

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    Set<a<E>> entrySet();

    int k(Object obj, int i2);

    int o(E e2, int i2);

    boolean remove(Object obj);

    int size();
}
