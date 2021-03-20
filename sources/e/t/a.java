package e.t;

import e.x.b.l;
import e.x.c.e;
import e.x.c.i;
import e.x.c.k;
import java.util.Collection;
import java.util.Iterator;

public abstract class a<E> implements Collection<E>, e.x.c.z.a {

    /* renamed from: e.t.a$a  reason: collision with other inner class name */
    public static final class C0142a extends k implements l<E, CharSequence> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a f7920h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0142a(a aVar) {
            super(1);
            this.f7920h = aVar;
        }

        public Object invoke(Object obj) {
            return obj == this.f7920h ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public boolean add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (i.a(a, obj)) {
                return true;
            }
        }
        return false;
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

    public abstract int d();

    public boolean isEmpty() {
        return d() == 0;
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

    public final /* bridge */ int size() {
        return d();
    }

    public Object[] toArray() {
        return e.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        i.e(tArr, "array");
        return e.b(this, tArr);
    }

    public String toString() {
        return g.x(this, ", ", "[", "]", 0, (CharSequence) null, new C0142a(this), 24);
    }
}
