package e.t;

import e.x.c.i;
import e.x.c.z.a;
import java.util.Iterator;

public final class t<T> implements Iterator<r<? extends T>>, a {

    /* renamed from: h  reason: collision with root package name */
    public int f7939h;

    /* renamed from: i  reason: collision with root package name */
    public final Iterator<T> f7940i;

    public t(Iterator<? extends T> it) {
        i.e(it, "iterator");
        this.f7940i = it;
    }

    public final boolean hasNext() {
        return this.f7940i.hasNext();
    }

    public Object next() {
        int i2 = this.f7939h;
        this.f7939h = i2 + 1;
        if (i2 >= 0) {
            return new r(i2, this.f7940i.next());
        }
        g.S();
        throw null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
