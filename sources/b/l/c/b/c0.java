package b.l.c.b;

import b.l.c.b.o;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public class c0<E> extends r<E> implements SortedSet<E> {

    /* renamed from: h  reason: collision with root package name */
    public final b0<E> f4840h;

    public c0(b0<E> b0Var) {
        this.f4840h = b0Var;
    }

    public Comparator<? super E> comparator() {
        return this.f4840h.comparator();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [b.l.c.b.b0<E>, b.l.c.b.o] */
    public o d() {
        return this.f4840h;
    }

    public E first() {
        o.a<E> E = this.f4840h.E();
        if (E != null) {
            return E.m();
        }
        throw new NoSuchElementException();
    }

    public SortedSet<E> headSet(E e2) {
        return this.f4840h.O(e2, f.OPEN).c();
    }

    public Iterator<E> iterator() {
        return new p(this.f4840h.entrySet().iterator());
    }

    public E last() {
        o.a<E> A = this.f4840h.A();
        if (A != null) {
            return A.m();
        }
        throw new NoSuchElementException();
    }

    public SortedSet<E> subSet(E e2, E e3) {
        return this.f4840h.Q(e2, f.CLOSED, e3, f.OPEN).c();
    }

    public SortedSet<E> tailSet(E e2) {
        return this.f4840h.m(e2, f.CLOSED).c();
    }
}
