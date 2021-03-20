package e.t;

import e.x.c.i;
import e.x.c.z.a;
import java.util.Iterator;

public final class s<T> implements Iterable<r<? extends T>>, a {

    /* renamed from: h  reason: collision with root package name */
    public final e.x.b.a<Iterator<T>> f7938h;

    public s(e.x.b.a<? extends Iterator<? extends T>> aVar) {
        i.e(aVar, "iteratorFactory");
        this.f7938h = aVar;
    }

    public Iterator<r<T>> iterator() {
        return new t(this.f7938h.e());
    }
}
