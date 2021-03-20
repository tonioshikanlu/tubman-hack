package e.b0;

import e.x.b.l;
import e.x.c.i;
import java.util.Iterator;

public final class u<T, R> implements h<R> {
    public final h<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f9874b;

    public static final class a implements Iterator<R>, e.x.c.z.a {

        /* renamed from: h  reason: collision with root package name */
        public final Iterator<T> f9875h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ u f9876i;

        public a(u uVar) {
            this.f9876i = uVar;
            this.f9875h = uVar.a.iterator();
        }

        public boolean hasNext() {
            return this.f9875h.hasNext();
        }

        public R next() {
            return this.f9876i.f9874b.invoke(this.f9875h.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public u(h<? extends T> hVar, l<? super T, ? extends R> lVar) {
        i.e(hVar, "sequence");
        i.e(lVar, "transformer");
        this.a = hVar;
        this.f9874b = lVar;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
