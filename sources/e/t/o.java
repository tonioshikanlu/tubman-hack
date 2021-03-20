package e.t;

import e.x.c.e;
import e.x.c.i;
import e.x.c.z.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class o implements List, Serializable, RandomAccess, a {

    /* renamed from: h  reason: collision with root package name */
    public static final o f7934h = new o();

    public /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            i.e((Void) obj, "element");
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        i.e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public Object get(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    public int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Void) {
            i.e((Void) obj, "element");
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return n.f7933h;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            i.e((Void) obj, "element");
        }
        return -1;
    }

    public ListIterator listIterator() {
        return n.f7933h;
    }

    public ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return n.f7933h;
        }
        throw new IndexOutOfBoundsException(b.e.a.a.a.g("Index: ", i2));
    }

    public /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(b.e.a.a.a.i("fromIndex: ", i2, ", toIndex: ", i3));
    }

    public Object[] toArray() {
        return e.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return e.b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
