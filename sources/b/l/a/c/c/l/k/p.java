package b.l.a.c.c.l.k;

import b.l.a.c.c.d;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.a.b;
import b.l.a.c.k.i;

public abstract class p<A extends a.b, ResultT> {
    public final d[] a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2691b;

    public static class a<A extends a.b, ResultT> {
        public m<A, i<ResultT>> a;

        /* renamed from: b  reason: collision with root package name */
        public d[] f2692b;

        public a(l1 l1Var) {
        }

        public p<A, ResultT> a() {
            b.l.a.c.b.a.k(this.a != null, "execute parameter required");
            return new m1(this, this.f2692b, true);
        }
    }

    public p(d[] dVarArr, boolean z, l1 l1Var) {
        this.a = dVarArr;
        this.f2691b = z;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>((l1) null);
    }
}
