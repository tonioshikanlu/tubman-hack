package b.l.c.b;

import b.l.c.b.o;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public abstract class c<E> extends AbstractCollection<E> implements o<E> {

    /* renamed from: h  reason: collision with root package name */
    public transient Set<E> f4836h;

    /* renamed from: i  reason: collision with root package name */
    public transient Set<o.a<E>> f4837i;

    public class a extends r<E> {
        public a() {
        }

        public o<E> d() {
            return c.this;
        }

        public Iterator<E> iterator() {
            return c.this.l();
        }
    }

    public class b extends s<E> {
        public b() {
        }

        public o<E> d() {
            return c.this;
        }

        public Iterator<o.a<E>> iterator() {
            return c.this.n();
        }

        public int size() {
            return c.this.e();
        }
    }

    public final boolean add(E e2) {
        o(e2, 1);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        Objects.requireNonNull(collection);
        boolean z = false;
        if (collection instanceof o) {
            o oVar = (o) collection;
            if (oVar instanceof b) {
                if (((b) oVar).isEmpty()) {
                    return false;
                }
                throw null;
            } else if (oVar.isEmpty()) {
                return false;
            } else {
                for (o.a aVar : oVar.entrySet()) {
                    o(aVar.m(), aVar.getCount());
                }
                return true;
            }
        } else if (collection.isEmpty()) {
            return false;
        } else {
            Iterator<? extends E> it = collection.iterator();
            Objects.requireNonNull(it);
            while (it.hasNext()) {
                add(it.next());
                z |= true;
            }
            return z;
        }
    }

    public Set<E> c() {
        Set<E> set = this.f4836h;
        if (set != null) {
            return set;
        }
        Set<E> d = d();
        this.f4836h = d;
        return d;
    }

    public boolean contains(Object obj) {
        return S(obj) > 0;
    }

    public Set<E> d() {
        return new a();
    }

    public abstract int e();

    public Set<o.a<E>> entrySet() {
        Set<o.a<E>> set = this.f4837i;
        if (set != null) {
            return set;
        }
        b bVar = new b();
        this.f4837i = bVar;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (size() == oVar.size() && entrySet().size() == oVar.entrySet().size()) {
                for (o.a aVar : oVar.entrySet()) {
                    if (S(aVar.m()) != aVar.getCount()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public abstract int k(Object obj, int i2);

    public abstract Iterator<E> l();

    public abstract Iterator<o.a<E>> n();

    public abstract int o(E e2, int i2);

    public final boolean remove(Object obj) {
        return k(obj, 1) > 0;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof o) {
            collection = ((o) collection).c();
        }
        return c().removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof o) {
            collection = ((o) collection).c();
        }
        return c().retainAll(collection);
    }

    public final String toString() {
        return entrySet().toString();
    }
}
