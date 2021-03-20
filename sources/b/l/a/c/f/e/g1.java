package b.l.a.c.f.e;

import java.util.Iterator;

public final class g1 implements Iterator<String> {

    /* renamed from: h  reason: collision with root package name */
    public final Iterator<String> f2998h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ h1 f2999i;

    public g1(h1 h1Var) {
        this.f2999i = h1Var;
        this.f2998h = h1Var.f3021h.iterator();
    }

    public final boolean hasNext() {
        return this.f2998h.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f2998h.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
