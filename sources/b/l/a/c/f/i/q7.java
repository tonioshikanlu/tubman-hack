package b.l.a.c.f.i;

import java.util.ListIterator;

public final class q7 implements ListIterator<String> {

    /* renamed from: h  reason: collision with root package name */
    public final ListIterator<String> f3705h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f3706i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s7 f3707j;

    public q7(s7 s7Var, int i2) {
        this.f3707j = s7Var;
        this.f3706i = i2;
        this.f3705h = s7Var.f3729h.listIterator(i2);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f3705h.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f3705h.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f3705h.next();
    }

    public final int nextIndex() {
        return this.f3705h.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f3705h.previous();
    }

    public final int previousIndex() {
        return this.f3705h.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
