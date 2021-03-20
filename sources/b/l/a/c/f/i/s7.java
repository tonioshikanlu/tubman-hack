package b.l.a.c.f.i;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class s7 extends AbstractList<String> implements RandomAccess, c6 {

    /* renamed from: h  reason: collision with root package name */
    public final c6 f3729h;

    public s7(c6 c6Var) {
        this.f3729h = c6Var;
    }

    public final c6 f() {
        return this;
    }

    public final List<?> g() {
        return this.f3729h.g();
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((b6) this.f3729h).get(i2);
    }

    public final Iterator<String> iterator() {
        return new r7(this);
    }

    public final Object j(int i2) {
        return this.f3729h.j(i2);
    }

    public final ListIterator<String> listIterator(int i2) {
        return new q7(this, i2);
    }

    public final int size() {
        return this.f3729h.size();
    }

    public final void w(t4 t4Var) {
        throw new UnsupportedOperationException();
    }
}
