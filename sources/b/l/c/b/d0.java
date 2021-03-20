package b.l.c.b;

import b.l.a.c.b.a;
import java.util.Iterator;
import java.util.NavigableSet;

public class d0<E> extends c0<E> implements NavigableSet<E> {
    public d0(b0<E> b0Var) {
        super(b0Var);
    }

    public E ceiling(E e2) {
        return a.a(this.f4840h.m(e2, f.CLOSED).E());
    }

    public Iterator<E> descendingIterator() {
        return ((c0) descendingSet()).iterator();
    }

    public NavigableSet<E> descendingSet() {
        return new d0(this.f4840h.t());
    }

    public E floor(E e2) {
        return a.a(this.f4840h.O(e2, f.CLOSED).A());
    }

    public NavigableSet<E> headSet(E e2, boolean z) {
        return new d0(this.f4840h.O(e2, f.d(z)));
    }

    public E higher(E e2) {
        return a.a(this.f4840h.m(e2, f.OPEN).E());
    }

    public E lower(E e2) {
        return a.a(this.f4840h.O(e2, f.OPEN).A());
    }

    public E pollFirst() {
        return a.a(this.f4840h.z());
    }

    public E pollLast() {
        return a.a(this.f4840h.r());
    }

    public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        return new d0(this.f4840h.Q(e2, f.d(z), e3, f.d(z2)));
    }

    public NavigableSet<E> tailSet(E e2, boolean z) {
        return new d0(this.f4840h.m(e2, f.d(z)));
    }
}
