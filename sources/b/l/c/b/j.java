package b.l.c.b;

import java.util.Collection;

public abstract class j<E> extends j implements Collection<E> {
    public boolean add(E e2) {
        return ((c) ((i) this).d()).add(e2);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return ((c) ((i) this).d()).addAll(collection);
    }

    public void clear() {
        ((g0) ((i) this).d()).clear();
    }

    public boolean contains(Object obj) {
        return ((c) ((i) this).d()).contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return ((i) this).d().containsAll(collection);
    }

    public boolean isEmpty() {
        return ((c) ((i) this).d()).isEmpty();
    }

    public boolean remove(Object obj) {
        return ((c) ((i) this).d()).remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return ((c) ((i) this).d()).removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return ((c) ((i) this).d()).retainAll(collection);
    }

    public int size() {
        return ((g0) ((i) this).d()).size();
    }
}
