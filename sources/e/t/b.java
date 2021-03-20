package e.t;

import e.x.c.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public abstract class b<E> extends a<E> implements List<E>, e.x.c.z.a {

    public class a implements Iterator<E>, e.x.c.z.a {

        /* renamed from: h  reason: collision with root package name */
        public int f7921h;

        public a() {
        }

        public boolean hasNext() {
            return this.f7921h < b.this.d();
        }

        public E next() {
            if (hasNext()) {
                b bVar = b.this;
                int i2 = this.f7921h;
                this.f7921h = i2 + 1;
                return bVar.get(i2);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: e.t.b$b  reason: collision with other inner class name */
    public class C0143b extends b<E>.defpackage.a implements ListIterator<E>, e.x.c.z.a {
        public C0143b(int i2) {
            super();
            int d = b.this.d();
            if (i2 < 0 || i2 > d) {
                throw new IndexOutOfBoundsException(b.e.a.a.a.i("index: ", i2, ", size: ", d));
            }
            this.f7921h = i2;
        }

        public void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return this.f7921h > 0;
        }

        public int nextIndex() {
            return this.f7921h;
        }

        public E previous() {
            if (hasPrevious()) {
                b bVar = b.this;
                int i2 = this.f7921h - 1;
                this.f7921h = i2;
                return bVar.get(i2);
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f7921h - 1;
        }

        public void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c<E> extends b<E> implements RandomAccess {

        /* renamed from: h  reason: collision with root package name */
        public int f7924h;

        /* renamed from: i  reason: collision with root package name */
        public final b<E> f7925i;

        /* renamed from: j  reason: collision with root package name */
        public final int f7926j;

        public c(b<? extends E> bVar, int i2, int i3) {
            i.e(bVar, "list");
            this.f7925i = bVar;
            this.f7926j = i2;
            int d = bVar.d();
            if (i2 < 0 || i3 > d) {
                StringBuilder A = b.e.a.a.a.A("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
                A.append(d);
                throw new IndexOutOfBoundsException(A.toString());
            } else if (i2 <= i3) {
                this.f7924h = i3 - i2;
            } else {
                throw new IllegalArgumentException(b.e.a.a.a.i("fromIndex: ", i2, " > toIndex: ", i3));
            }
        }

        public int d() {
            return this.f7924h;
        }

        public E get(int i2) {
            int i3 = this.f7924h;
            if (i2 >= 0 && i2 < i3) {
                return this.f7925i.get(this.f7926j + i2);
            }
            throw new IndexOutOfBoundsException(b.e.a.a.a.i("index: ", i2, ", size: ", i3));
        }
    }

    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        i.e(this, "c");
        i.e(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            for (Object a2 : this) {
                if (!i.a(a2, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i2);

    public int hashCode() {
        i.e(this, "c");
        Iterator it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = (i2 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i2;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (i.a(it.next(), obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new a();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (i.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C0143b(0);
    }

    public ListIterator<E> listIterator(int i2) {
        return new C0143b(i2);
    }

    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i2, int i3) {
        return new c(this, i2, i3);
    }
}
