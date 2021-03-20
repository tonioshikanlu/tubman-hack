package b.l.a.c.f.e;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class h1 extends AbstractList<String> implements RandomAccess, p {

    /* renamed from: h  reason: collision with root package name */
    public final p f3021h;

    public h1(p pVar) {
        this.f3021h = pVar;
    }

    public final p f() {
        return this;
    }

    public final List<?> g() {
        return this.f3021h.g();
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((o) this.f3021h).get(i2);
    }

    public final Iterator<String> iterator() {
        return new g1(this);
    }

    public final Object j(int i2) {
        return this.f3021h.j(i2);
    }

    public final ListIterator<String> listIterator(int i2) {
        return new f1(this, i2);
    }

    public final void q(um umVar) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f3021h.size();
    }
}
