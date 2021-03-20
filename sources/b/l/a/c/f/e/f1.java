package b.l.a.c.f.e;

import java.util.ListIterator;

public final class f1 implements ListIterator<String> {

    /* renamed from: h  reason: collision with root package name */
    public final ListIterator<String> f2953h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f2954i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h1 f2955j;

    public f1(h1 h1Var, int i2) {
        this.f2955j = h1Var;
        this.f2954i = i2;
        this.f2953h = h1Var.f3021h.listIterator(i2);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f2953h.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f2953h.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f2953h.next();
    }

    public final int nextIndex() {
        return this.f2953h.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f2953h.previous();
    }

    public final int previousIndex() {
        return this.f2953h.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
