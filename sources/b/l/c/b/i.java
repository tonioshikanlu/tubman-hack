package b.l.c.b;

import b.l.c.b.o;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

public abstract class i<E> extends k<E> implements b0<E> {

    /* renamed from: h  reason: collision with root package name */
    public transient Comparator<? super E> f4870h;

    /* renamed from: i  reason: collision with root package name */
    public transient NavigableSet<E> f4871i;

    /* renamed from: j  reason: collision with root package name */
    public transient Set<o.a<E>> f4872j;

    public o.a<E> A() {
        return ((d) this).f4841k.E();
    }

    public o.a<E> E() {
        return ((d) this).f4841k.A();
    }

    public b0<E> O(E e2, f fVar) {
        return ((e) ((g0) ((d) this).f4841k).m(e2, fVar)).t();
    }

    public b0<E> Q(E e2, f fVar, E e3, f fVar2) {
        return ((e) ((d) this).f4841k.Q(e3, fVar2, e2, fVar)).t();
    }

    public NavigableSet<E> c() {
        NavigableSet<E> navigableSet = this.f4871i;
        if (navigableSet != null) {
            return navigableSet;
        }
        d0 d0Var = new d0(this);
        this.f4871i = d0Var;
        return d0Var;
    }

    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f4870h;
        if (comparator != null) {
            return comparator;
        }
        Comparator<? super E> comparator2 = ((d) this).f4841k.f4842j;
        w a = (comparator2 instanceof w ? (w) comparator2 : new g(comparator2)).a();
        this.f4870h = a;
        return a;
    }

    public o<E> d() {
        return ((d) this).f4841k;
    }

    public Set<o.a<E>> entrySet() {
        Set<o.a<E>> set = this.f4872j;
        if (set != null) {
            return set;
        }
        h hVar = new h(this);
        this.f4872j = hVar;
        return hVar;
    }

    public b0<E> m(E e2, f fVar) {
        return ((e) ((g0) ((d) this).f4841k).O(e2, fVar)).t();
    }

    public o.a<E> r() {
        return ((d) this).f4841k.z();
    }

    public b0<E> t() {
        return ((d) this).f4841k;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public String toString() {
        return entrySet().toString();
    }

    public o.a<E> z() {
        return ((d) this).f4841k.r();
    }

    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        }
        Iterator it = ((d) this).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            tArr[i2] = it.next();
            i2++;
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}
