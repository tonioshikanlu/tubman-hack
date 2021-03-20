package b.j.a.c.j0;

public abstract class u<T> {
    public T a;

    /* renamed from: b  reason: collision with root package name */
    public a<T> f2236b;
    public a<T> c;
    public int d;

    public static final class a<T> {
        public final T a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2237b;
        public a<T> c;

        public a(T t, int i2) {
            this.a = t;
            this.f2237b = i2;
        }
    }

    public abstract T a(int i2);

    public final T b(T t, int i2) {
        a<T> aVar = new a<>(t, i2);
        if (this.f2236b == null) {
            this.c = aVar;
            this.f2236b = aVar;
        } else {
            a<T> aVar2 = this.c;
            if (aVar2.c == null) {
                aVar2.c = aVar;
                this.c = aVar;
            } else {
                throw new IllegalStateException();
            }
        }
        this.d += i2;
        return a(i2 < 16384 ? i2 + i2 : i2 + (i2 >> 2));
    }

    public T c(T t, int i2) {
        int i3 = this.d + i2;
        T a2 = a(i3);
        int i4 = 0;
        for (a<T> aVar = this.f2236b; aVar != null; aVar = aVar.c) {
            System.arraycopy(aVar.a, 0, a2, i4, aVar.f2237b);
            i4 += aVar.f2237b;
        }
        System.arraycopy(t, 0, a2, i4, i2);
        int i5 = i4 + i2;
        if (i5 == i3) {
            return a2;
        }
        throw new IllegalStateException(b.e.a.a.a.i("Should have gotten ", i3, " entries, got ", i5));
    }

    public T d() {
        a<T> aVar = this.c;
        if (aVar != null) {
            this.a = aVar.a;
        }
        this.c = null;
        this.f2236b = null;
        this.d = 0;
        T t = this.a;
        return t == null ? a(12) : t;
    }
}
