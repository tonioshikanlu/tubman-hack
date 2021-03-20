package b.l.a.c.i.b;

import java.util.Iterator;

public final class p implements Iterator<String> {

    /* renamed from: h  reason: collision with root package name */
    public final Iterator<String> f4205h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q f4206i;

    public p(q qVar) {
        this.f4206i = qVar;
        this.f4205h = qVar.f4228h.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return this.f4205h.next();
    }

    public final boolean hasNext() {
        return this.f4205h.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
