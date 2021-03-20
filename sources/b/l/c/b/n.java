package b.l.c.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class n<E> extends m<E> implements List<E>, RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    public static final i0<Object> f4881i = new a(x.f4895l, 0);

    public static class a<E> extends a<E> {

        /* renamed from: j  reason: collision with root package name */
        public final n<E> f4882j;

        public a(n<E> nVar, int i2) {
            super(nVar.size(), i2);
            this.f4882j = nVar;
        }
    }

    public class b extends n<E> {

        /* renamed from: j  reason: collision with root package name */
        public final transient int f4883j;

        /* renamed from: k  reason: collision with root package name */
        public final transient int f4884k;

        public b(int i2, int i3) {
            this.f4883j = i2;
            this.f4884k = i3;
        }

        /* renamed from: G */
        public n<E> subList(int i2, int i3) {
            b.l.a.c.b.a.D(i2, i3, this.f4884k);
            n nVar = n.this;
            int i4 = this.f4883j;
            return nVar.subList(i2 + i4, i3 + i4);
        }

        public Object[] e() {
            return n.this.e();
        }

        public E get(int i2) {
            b.l.a.c.b.a.s(i2, this.f4884k);
            return n.this.get(i2 + this.f4883j);
        }

        public Iterator iterator() {
            return listIterator();
        }

        public int l() {
            return n.this.n() + this.f4883j + this.f4884k;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return listIterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return listIterator(i2);
        }

        public int n() {
            return n.this.n() + this.f4883j;
        }

        public int size() {
            return this.f4884k;
        }
    }

    public static <E> n<E> D(E e2) {
        int i2 = 0;
        Object[] objArr = {e2};
        while (i2 < 1) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException(b.e.a.a.a.g("at index ", i2));
            }
        }
        return new x(objArr, 1);
    }

    /* renamed from: G */
    public n<E> subList(int i2, int i3) {
        b.l.a.c.b.a.D(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return x.f4895l;
        }
        return new b(i2, i4);
    }

    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public int d(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i2 = 0;
                    while (i2 < size) {
                        if (b.l.a.c.b.a.U(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object U : this) {
                    if (it.hasNext()) {
                        if (!b.l.a.c.b.a.U(U, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~(get(i3).hashCode() + (i2 * 31)));
        }
        return i2;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public i0<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: y */
    public i0<E> listIterator(int i2) {
        int size = size();
        if (i2 >= 0 && i2 <= size) {
            return isEmpty() ? f4881i : new a(this, i2);
        }
        throw new IndexOutOfBoundsException(b.l.a.c.b.a.f(i2, size, "index"));
    }
}
