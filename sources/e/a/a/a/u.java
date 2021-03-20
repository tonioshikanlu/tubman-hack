package e.a.a.a;

import e.a.a.a.c0;
import e.a.a.a.y0.b.f0;
import e.a.i;
import e.a.l;
import e.r;
import e.x.b.p;
import e.x.b.q;
import e.x.c.k;

public final class u<D, E, V> extends b0<D, E, V> implements Object<D, E, V>, p, i {
    public final o0<a<D, E, V>> t;

    public static final class a<D, E, V> extends c0.c<V> implements Object<D, E, V>, q {

        /* renamed from: n  reason: collision with root package name */
        public final u<D, E, V> f7584n;

        public a(u<D, E, V> uVar) {
            e.x.c.i.e(uVar, "property");
            this.f7584n = uVar;
        }

        public c0 H() {
            return this.f7584n;
        }

        public l p() {
            return this.f7584n;
        }

        public Object r(Object obj, Object obj2, Object obj3) {
            a<D, E, V> e2 = this.f7584n.t.e();
            e.x.c.i.d(e2, "_setter()");
            e2.n(obj, obj2, obj3);
            return r.a;
        }
    }

    public static final class b extends k implements e.x.b.a<a<D, E, V>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ u f7585h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(u uVar) {
            super(0);
            this.f7585h = uVar;
        }

        public Object e() {
            return new a(this.f7585h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        e.x.c.i.e(nVar, "container");
        e.x.c.i.e(f0Var, "descriptor");
        o0<a<D, E, V>> i2 = b.q.a.a.i2(new b(this));
        e.x.c.i.d(i2, "ReflectProperties.lazy { Setter(this) }");
        this.t = i2;
    }

    public i.a m() {
        a<D, E, V> e2 = this.t.e();
        e.x.c.i.d(e2, "_setter()");
        return e2;
    }
}
