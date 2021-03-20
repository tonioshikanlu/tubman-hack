package b.j.a.c.j0;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class d<T> implements Iterator<T>, Iterable<T> {

    /* renamed from: h  reason: collision with root package name */
    public final T[] f2208h;

    /* renamed from: i  reason: collision with root package name */
    public int f2209i = 0;

    public d(T[] tArr) {
        this.f2208h = tArr;
    }

    public boolean hasNext() {
        return this.f2209i < this.f2208h.length;
    }

    public Iterator<T> iterator() {
        return this;
    }

    public T next() {
        int i2 = this.f2209i;
        T[] tArr = this.f2208h;
        if (i2 < tArr.length) {
            this.f2209i = i2 + 1;
            return tArr[i2];
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
