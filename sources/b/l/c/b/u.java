package b.l.c.b;

import b.l.a.c.b.a;
import b.l.c.b.o;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class u<E> implements Iterator<E> {

    /* renamed from: h  reason: collision with root package name */
    public final o<E> f4888h;

    /* renamed from: i  reason: collision with root package name */
    public final Iterator<o.a<E>> f4889i;

    /* renamed from: j  reason: collision with root package name */
    public o.a<E> f4890j;

    /* renamed from: k  reason: collision with root package name */
    public int f4891k;

    /* renamed from: l  reason: collision with root package name */
    public int f4892l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4893m;

    public u(o<E> oVar, Iterator<o.a<E>> it) {
        this.f4888h = oVar;
        this.f4889i = it;
    }

    public boolean hasNext() {
        return this.f4891k > 0 || this.f4889i.hasNext();
    }

    public E next() {
        if (hasNext()) {
            if (this.f4891k == 0) {
                o.a<E> next = this.f4889i.next();
                this.f4890j = next;
                int count = next.getCount();
                this.f4891k = count;
                this.f4892l = count;
            }
            this.f4891k--;
            this.f4893m = true;
            return this.f4890j.m();
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        a.E(this.f4893m);
        if (this.f4892l == 1) {
            this.f4889i.remove();
        } else {
            this.f4888h.remove(this.f4890j.m());
        }
        this.f4892l--;
        this.f4893m = false;
    }
}
