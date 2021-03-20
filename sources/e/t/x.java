package e.t;

import b.e.a.a.a;
import e.a0.d;
import e.x.c.i;
import e.x.c.z.b;
import java.util.List;

public final class x<T> extends x<T> implements List, b {

    /* renamed from: h  reason: collision with root package name */
    public final List<T> f7941h;

    public x(List<T> list) {
        i.e(list, "delegate");
        this.f7941h = list;
    }

    public void add(int i2, T t) {
        List<T> list = this.f7941h;
        int size = size();
        if (i2 < 0 || size < i2) {
            StringBuilder z = a.z("Position index ", i2, " must be in range [");
            z.append(new d(0, size()));
            z.append("].");
            throw new IndexOutOfBoundsException(z.toString());
        }
        list.add(size() - i2, t);
    }

    public void clear() {
        this.f7941h.clear();
    }

    public T get(int i2) {
        return this.f7941h.get(g.a(this, i2));
    }

    public final Object remove(int i2) {
        return this.f7941h.remove(g.a(this, i2));
    }

    public T set(int i2, T t) {
        return this.f7941h.set(g.a(this, i2), t);
    }

    public final int size() {
        return this.f7941h.size();
    }
}
