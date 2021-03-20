package e.b0;

import e.x.c.i;
import java.util.Iterator;

public final class b<T> implements h<T>, c<T> {
    public final h<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9846b;

    public static final class a implements Iterator<T>, e.x.c.z.a {

        /* renamed from: h  reason: collision with root package name */
        public final Iterator<T> f9847h;

        /* renamed from: i  reason: collision with root package name */
        public int f9848i;

        public a(b bVar) {
            this.f9847h = bVar.a.iterator();
            this.f9848i = bVar.f9846b;
        }

        public final void a() {
            while (this.f9848i > 0 && this.f9847h.hasNext()) {
                this.f9847h.next();
                this.f9848i--;
            }
        }

        public boolean hasNext() {
            a();
            return this.f9847h.hasNext();
        }

        public T next() {
            a();
            return this.f9847h.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(h<? extends T> hVar, int i2) {
        i.e(hVar, "sequence");
        this.a = hVar;
        this.f9846b = i2;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
        }
    }

    public h<T> a(int i2) {
        int i3 = this.f9846b + i2;
        return i3 < 0 ? new b(this, i2) : new b(this.a, i3);
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
