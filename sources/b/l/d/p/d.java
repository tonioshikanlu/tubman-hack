package b.l.d.p;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class d<T> {
    public final Set<Class<? super T>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<r> f5030b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final g<T> f5031e;
    public final Set<Class<?>> f;

    public static class b<T> {
        public final Set<Class<? super T>> a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<r> f5032b = new HashSet();
        public int c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public g<T> f5033e;
        public Set<Class<?>> f;

        public b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            Objects.requireNonNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class requireNonNull : clsArr) {
                Objects.requireNonNull(requireNonNull, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        public b<T> a(r rVar) {
            if (!this.a.contains(rVar.a)) {
                this.f5032b.add(rVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public d<T> b() {
            if (this.f5033e != null) {
                return new d(new HashSet(this.a), new HashSet(this.f5032b), this.c, this.d, this.f5033e, this.f, (a) null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public b<T> c(g<T> gVar) {
            this.f5033e = gVar;
            return this;
        }

        public final b<T> d(int i2) {
            if (this.c == 0) {
                this.c = i2;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public d(Set set, Set set2, int i2, int i3, g gVar, Set set3, a aVar) {
        this.a = Collections.unmodifiableSet(set);
        this.f5030b = Collections.unmodifiableSet(set2);
        this.c = i2;
        this.d = i3;
        this.f5031e = gVar;
        this.f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0], (a) null);
    }

    @SafeVarargs
    public static <T> d<T> c(T t, Class<T> cls, Class<? super T>... clsArr) {
        b bVar = new b(cls, clsArr, (a) null);
        bVar.c(new b(t));
        return bVar.b();
    }

    public boolean b() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.f5030b.toArray()) + "}";
    }
}
