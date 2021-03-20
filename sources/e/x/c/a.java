package e.x.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T> implements Iterator<T>, e.x.c.z.a {

    /* renamed from: h  reason: collision with root package name */
    public int f7968h;

    /* renamed from: i  reason: collision with root package name */
    public final T[] f7969i;

    public a(T[] tArr) {
        i.e(tArr, "array");
        this.f7969i = tArr;
    }

    public boolean hasNext() {
        return this.f7968h < this.f7969i.length;
    }

    public T next() {
        try {
            T[] tArr = this.f7969i;
            int i2 = this.f7968h;
            this.f7968h = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f7968h--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
