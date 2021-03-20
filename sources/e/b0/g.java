package e.b0;

import e.x.b.l;
import e.x.c.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class g<T> implements h<T> {
    public final e.x.b.a<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, T> f9858b;

    public static final class a implements Iterator<T>, e.x.c.z.a {

        /* renamed from: h  reason: collision with root package name */
        public T f9859h;

        /* renamed from: i  reason: collision with root package name */
        public int f9860i = -2;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g f9861j;

        public a(g gVar) {
            this.f9861j = gVar;
        }

        public final void a() {
            T t;
            if (this.f9860i == -2) {
                t = this.f9861j.a.e();
            } else {
                l<T, T> lVar = this.f9861j.f9858b;
                T t2 = this.f9859h;
                i.c(t2);
                t = lVar.invoke(t2);
            }
            this.f9859h = t;
            this.f9860i = t == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f9860i < 0) {
                a();
            }
            return this.f9860i == 1;
        }

        public T next() {
            if (this.f9860i < 0) {
                a();
            }
            if (this.f9860i != 0) {
                T t = this.f9859h;
                Objects.requireNonNull(t, "null cannot be cast to non-null type T");
                this.f9860i = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(e.x.b.a<? extends T> aVar, l<? super T, ? extends T> lVar) {
        i.e(aVar, "getInitialValue");
        i.e(lVar, "getNextValue");
        this.a = aVar;
        this.f9858b = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
