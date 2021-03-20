package e.b0;

import e.x.b.l;
import e.x.c.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class t<T> implements h<T> {
    public final h<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, Boolean> f9869b;

    public static final class a implements Iterator<T>, e.x.c.z.a {

        /* renamed from: h  reason: collision with root package name */
        public final Iterator<T> f9870h;

        /* renamed from: i  reason: collision with root package name */
        public int f9871i = -1;

        /* renamed from: j  reason: collision with root package name */
        public T f9872j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t f9873k;

        public a(t tVar) {
            this.f9873k = tVar;
            this.f9870h = tVar.a.iterator();
        }

        public final void a() {
            if (this.f9870h.hasNext()) {
                T next = this.f9870h.next();
                if (this.f9873k.f9869b.invoke(next).booleanValue()) {
                    this.f9871i = 1;
                    this.f9872j = next;
                    return;
                }
            }
            this.f9871i = 0;
        }

        public boolean hasNext() {
            if (this.f9871i == -1) {
                a();
            }
            return this.f9871i == 1;
        }

        public T next() {
            if (this.f9871i == -1) {
                a();
            }
            if (this.f9871i != 0) {
                T t = this.f9872j;
                this.f9872j = null;
                this.f9871i = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(h<? extends T> hVar, l<? super T, Boolean> lVar) {
        i.e(hVar, "sequence");
        i.e(lVar, "predicate");
        this.a = hVar;
        this.f9869b = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
