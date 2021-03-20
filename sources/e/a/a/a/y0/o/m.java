package e.a.a.a.y0.o;

import e.x.c.i;
import e.x.c.y;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class m<T> extends AbstractSet<T> {

    /* renamed from: h  reason: collision with root package name */
    public Object f9830h;

    /* renamed from: i  reason: collision with root package name */
    public int f9831i;

    public static final class a<T> implements Iterator<T>, Object {

        /* renamed from: h  reason: collision with root package name */
        public final Iterator<T> f9832h;

        public a(T[] tArr) {
            i.e(tArr, "array");
            this.f9832h = b.q.a.a.c2(tArr);
        }

        public boolean hasNext() {
            return this.f9832h.hasNext();
        }

        public T next() {
            return this.f9832h.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b {
        public static final <T> m<T> a() {
            return new m<>((DefaultConstructorMarker) null);
        }
    }

    public static final class c<T> implements Iterator<T>, Object {

        /* renamed from: h  reason: collision with root package name */
        public boolean f9833h = true;

        /* renamed from: i  reason: collision with root package name */
        public final T f9834i;

        public c(T t) {
            this.f9834i = t;
        }

        public boolean hasNext() {
            return this.f9833h;
        }

        public T next() {
            if (this.f9833h) {
                this.f9833h = false;
                return this.f9834i;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public m() {
    }

    public m(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final <T> m<T> d() {
        return new m<>((DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(T r5) {
        /*
            r4 = this;
            int r0 = r4.f9831i
            r1 = 1
            if (r0 != 0) goto L_0x0008
            r4.f9830h = r5
            goto L_0x0076
        L_0x0008:
            r2 = 0
            if (r0 != r1) goto L_0x0020
            java.lang.Object r0 = r4.f9830h
            boolean r0 = e.x.c.i.a(r0, r5)
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r4.f9830h
            r0[r2] = r3
            r0[r1] = r5
            r4.f9830h = r0
            goto L_0x0076
        L_0x0020:
            r3 = 5
            if (r0 >= r3) goto L_0x0064
            java.lang.Object r0 = r4.f9830h
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = b.q.a.a.K(r0, r5)
            if (r3 == 0) goto L_0x0033
            return r2
        L_0x0033:
            int r2 = r4.f9831i
            r3 = 4
            if (r2 != r3) goto L_0x0053
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "elements"
            e.x.c.i.e(r0, r2)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r3 = r0.length
            int r3 = b.q.a.a.q2(r3)
            r2.<init>(r3)
            b.q.a.a.d3(r0, r2)
            r2.add(r5)
            goto L_0x0061
        L_0x0053:
            int r2 = r2 + r1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "java.util.Arrays.copyOf(this, newSize)"
            e.x.c.i.d(r2, r0)
            int r0 = r2.length
            int r0 = r0 - r1
            r2[r0] = r5
        L_0x0061:
            r4.f9830h = r2
            goto L_0x0076
        L_0x0064:
            java.lang.Object r0 = r4.f9830h
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T>"
            java.util.Objects.requireNonNull(r0, r3)
            java.util.Set r0 = e.x.c.y.a(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L_0x0076
            return r2
        L_0x0076:
            int r5 = r4.f9831i
            int r5 = r5 + r1
            r4.f9831i = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.o.m.add(java.lang.Object):boolean");
    }

    public void clear() {
        this.f9830h = null;
        this.f9831i = 0;
    }

    public boolean contains(Object obj) {
        int i2 = this.f9831i;
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            return i.a(this.f9830h, obj);
        }
        if (i2 < 5) {
            Object obj2 = this.f9830h;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<T>");
            return b.q.a.a.K((Object[]) obj2, obj);
        }
        Object obj3 = this.f9830h;
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T>");
        return ((Set) obj3).contains(obj);
    }

    public Iterator<T> iterator() {
        Set a2;
        int i2 = this.f9831i;
        if (i2 == 0) {
            a2 = Collections.emptySet();
        } else if (i2 == 1) {
            return new c(this.f9830h);
        } else {
            if (i2 < 5) {
                Object obj = this.f9830h;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<T>");
                return new a((Object[]) obj);
            }
            Object obj2 = this.f9830h;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            a2 = y.a(obj2);
        }
        return a2.iterator();
    }

    public final int size() {
        return this.f9831i;
    }
}
