package b.l.a.c.f.i;

import java.util.Iterator;

public final class r7 implements Iterator<String> {

    /* renamed from: h  reason: collision with root package name */
    public final Iterator<String> f3711h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ s7 f3712i;

    public r7(s7 s7Var) {
        this.f3712i = s7Var;
        this.f3711h = s7Var.f3729h.iterator();
    }

    public final boolean hasNext() {
        return this.f3711h.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f3711h.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
