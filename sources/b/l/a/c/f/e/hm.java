package b.l.a.c.f.e;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class hm<E> extends AbstractList<E> implements i<E> {

    /* renamed from: h  reason: collision with root package name */
    public boolean f3050h = true;

    public final boolean a() {
        return this.f3050h;
    }

    public boolean add(E e2) {
        d();
        return super.add(e2);
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        d();
        return super.addAll(i2, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        d();
        return super.addAll(collection);
    }

    public final void b() {
        this.f3050h = false;
    }

    public void clear() {
        d();
        super.clear();
    }

    public final void d() {
        if (!this.f3050h) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public abstract E remove(int i2);

    public final boolean remove(Object obj) {
        d();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        d();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        d();
        return super.retainAll(collection);
    }
}
