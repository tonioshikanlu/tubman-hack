package b.l.c.b;

import b.l.c.b.g0;
import b.l.c.b.o;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;

public abstract class e<E> extends c<E> implements b0<E> {

    /* renamed from: j  reason: collision with root package name */
    public final Comparator<? super E> f4842j;

    /* renamed from: k  reason: collision with root package name */
    public transient b0<E> f4843k;

    public e() {
        this.f4842j = v.f4894h;
    }

    public o.a<E> A() {
        h0 h0Var = new h0((g0) this);
        if (h0Var.hasNext()) {
            return (o.a) h0Var.next();
        }
        return null;
    }

    public o.a<E> E() {
        g0.a aVar = new g0.a();
        if (aVar.hasNext()) {
            return (o.a) aVar.next();
        }
        return null;
    }

    public b0<E> Q(E e2, f fVar, E e3, f fVar2) {
        Objects.requireNonNull(fVar);
        Objects.requireNonNull(fVar2);
        return ((g0) ((g0) this).m(e2, fVar)).O(e3, fVar2);
    }

    public NavigableSet<E> c() {
        return (NavigableSet) super.c();
    }

    public Comparator<? super E> comparator() {
        return this.f4842j;
    }

    public Set d() {
        return new d0(this);
    }

    public o.a<E> r() {
        h0 h0Var = new h0((g0) this);
        if (!h0Var.hasNext()) {
            return null;
        }
        o.a aVar = (o.a) h0Var.next();
        t tVar = new t(aVar.m(), aVar.getCount());
        h0Var.remove();
        return tVar;
    }

    public b0<E> t() {
        b0<E> b0Var = this.f4843k;
        if (b0Var != null) {
            return b0Var;
        }
        d dVar = new d(this);
        this.f4843k = dVar;
        return dVar;
    }

    public o.a<E> z() {
        g0.a aVar = new g0.a();
        if (!aVar.hasNext()) {
            return null;
        }
        o.a aVar2 = (o.a) aVar.next();
        t tVar = new t(aVar2.m(), aVar2.getCount());
        aVar.remove();
        return tVar;
    }

    public e(Comparator<? super E> comparator) {
        Objects.requireNonNull(comparator);
        this.f4842j = comparator;
    }
}
