package e.b0;

import e.x.b.l;
import e.x.c.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class f<T, R, E> implements h<E> {
    public final h<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f9854b;
    public final l<R, Iterator<E>> c;

    public static final class a implements Iterator<E>, e.x.c.z.a {

        /* renamed from: h  reason: collision with root package name */
        public final Iterator<T> f9855h;

        /* renamed from: i  reason: collision with root package name */
        public Iterator<? extends E> f9856i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ f f9857j;

        public a(f fVar) {
            this.f9857j = fVar;
            this.f9855h = fVar.a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.f9856i;
            if (it != null && !it.hasNext()) {
                this.f9856i = null;
            }
            while (true) {
                if (this.f9856i == null) {
                    if (this.f9855h.hasNext()) {
                        T next = this.f9855h.next();
                        f fVar = this.f9857j;
                        Iterator<? extends E> invoke = fVar.c.invoke(fVar.f9854b.invoke(next));
                        if (invoke.hasNext()) {
                            this.f9856i = invoke;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return a();
        }

        public E next() {
            if (a()) {
                Iterator<? extends E> it = this.f9856i;
                i.c(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h<? extends T> hVar, l<? super T, ? extends R> lVar, l<? super R, ? extends Iterator<? extends E>> lVar2) {
        i.e(hVar, "sequence");
        i.e(lVar, "transformer");
        i.e(lVar2, "iterator");
        this.a = hVar;
        this.f9854b = lVar;
        this.c = lVar2;
    }

    public Iterator<E> iterator() {
        return new a(this);
    }
}
