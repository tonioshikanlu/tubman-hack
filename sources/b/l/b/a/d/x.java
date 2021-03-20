package b.l.b.a.d;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class x implements Iterable<T> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f4828h;

    public class a implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        public final int f4829h;

        /* renamed from: i  reason: collision with root package name */
        public int f4830i = 0;

        public a() {
            this.f4829h = Array.getLength(x.this.f4828h);
        }

        public boolean hasNext() {
            return this.f4830i < this.f4829h;
        }

        public T next() {
            if (hasNext()) {
                Object obj = x.this.f4828h;
                int i2 = this.f4830i;
                this.f4830i = i2 + 1;
                return Array.get(obj, i2);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public x(Object obj) {
        this.f4828h = obj;
    }

    public Iterator<T> iterator() {
        return new a();
    }
}
