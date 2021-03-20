package b.l.c.b;

import b.l.c.b.n;
import java.util.NoSuchElementException;

public abstract class a<E> extends i0<E> {

    /* renamed from: h  reason: collision with root package name */
    public final int f4834h;

    /* renamed from: i  reason: collision with root package name */
    public int f4835i;

    public a(int i2, int i3) {
        if (i3 < 0 || i3 > i2) {
            throw new IndexOutOfBoundsException(b.l.a.c.b.a.f(i3, i2, "index"));
        }
        this.f4834h = i2;
        this.f4835i = i3;
    }

    public final boolean hasNext() {
        return this.f4835i < this.f4834h;
    }

    public final boolean hasPrevious() {
        return this.f4835i > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i2 = this.f4835i;
            this.f4835i = i2 + 1;
            return ((n.a) this).f4882j.get(i2);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f4835i;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i2 = this.f4835i - 1;
            this.f4835i = i2;
            return ((n.a) this).f4882j.get(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f4835i - 1;
    }
}
