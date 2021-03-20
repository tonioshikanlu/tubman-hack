package e.t;

import e.x.c.e;
import e.x.c.i;
import e.x.c.z.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class d<T> implements Collection<T>, a {

    /* renamed from: h  reason: collision with root package name */
    public final T[] f7927h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7928i;

    public d(T[] tArr, boolean z) {
        i.e(tArr, "values");
        this.f7927h = tArr;
        this.f7928i = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return b.q.a.a.K(this.f7927h, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f7927h.length == 0;
    }

    public Iterator<T> iterator() {
        return b.q.a.a.c2(this.f7927h);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f7927h.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f7927h;
        boolean z = this.f7928i;
        Class<Object[]> cls = Object[].class;
        i.e(tArr, "$this$copyToArrayOfAny");
        if (!z || !i.a(tArr.getClass(), cls)) {
            tArr = Arrays.copyOf(tArr, tArr.length, cls);
        }
        i.d(tArr, "if (isVarargs && this.ja… Array<Any?>::class.java)");
        return tArr;
    }

    public <T> T[] toArray(T[] tArr) {
        return e.b(this, tArr);
    }
}
