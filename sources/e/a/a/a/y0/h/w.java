package e.a.a.a.y0.h;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class w extends AbstractList<String> implements RandomAccess, n {

    /* renamed from: h  reason: collision with root package name */
    public final n f9286h;

    public class a implements ListIterator<String> {

        /* renamed from: h  reason: collision with root package name */
        public ListIterator<String> f9287h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ int f9288i;

        public a(int i2) {
            this.f9288i = i2;
            this.f9287h = w.this.f9286h.listIterator(i2);
        }

        public void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f9287h.hasNext();
        }

        public boolean hasPrevious() {
            return this.f9287h.hasPrevious();
        }

        public Object next() {
            return this.f9287h.next();
        }

        public int nextIndex() {
            return this.f9287h.nextIndex();
        }

        public Object previous() {
            return this.f9287h.previous();
        }

        public int previousIndex() {
            return this.f9287h.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* renamed from: h  reason: collision with root package name */
        public Iterator<String> f9290h;

        public b() {
            this.f9290h = w.this.f9286h.iterator();
        }

        public boolean hasNext() {
            return this.f9290h.hasNext();
        }

        public Object next() {
            return this.f9290h.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public w(n nVar) {
        this.f9286h = nVar;
    }

    public n B() {
        return this;
    }

    public List<?> M() {
        return this.f9286h.M();
    }

    public void P(c cVar) {
        throw new UnsupportedOperationException();
    }

    public Object get(int i2) {
        return (String) this.f9286h.get(i2);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public ListIterator<String> listIterator(int i2) {
        return new a(i2);
    }

    public int size() {
        return this.f9286h.size();
    }

    public c u(int i2) {
        return this.f9286h.u(i2);
    }
}
