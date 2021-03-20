package e.a.a.a.z0;

import java.util.Iterator;

public final class a<E> implements Iterable<E> {

    /* renamed from: k  reason: collision with root package name */
    public static final a<Object> f9835k = new a<>();

    /* renamed from: h  reason: collision with root package name */
    public final E f9836h;

    /* renamed from: i  reason: collision with root package name */
    public final a<E> f9837i;

    /* renamed from: j  reason: collision with root package name */
    public final int f9838j;

    /* renamed from: e.a.a.a.z0.a$a  reason: collision with other inner class name */
    public static class C0229a<E> implements Iterator<E> {

        /* renamed from: h  reason: collision with root package name */
        public a<E> f9839h;

        public C0229a(a<E> aVar) {
            this.f9839h = aVar;
        }

        public boolean hasNext() {
            return this.f9839h.f9838j > 0;
        }

        public E next() {
            a<E> aVar = this.f9839h;
            E e2 = aVar.f9836h;
            this.f9839h = aVar.f9837i;
            return e2;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public a() {
        this.f9838j = 0;
        this.f9836h = null;
        this.f9837i = null;
    }

    public a(E e2, a<E> aVar) {
        this.f9836h = e2;
        this.f9837i = aVar;
        this.f9838j = aVar.f9838j + 1;
    }

    public final a<E> d(Object obj) {
        if (this.f9838j == 0) {
            return this;
        }
        if (this.f9836h.equals(obj)) {
            return this.f9837i;
        }
        a<E> d = this.f9837i.d(obj);
        return d == this.f9837i ? this : new a<>(this.f9836h, d);
    }

    public final a<E> e(int i2) {
        if (i2 >= 0 && i2 <= this.f9838j) {
            return i2 == 0 ? this : this.f9837i.e(i2 - 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator<E> iterator() {
        return new C0229a(e(0));
    }
}
