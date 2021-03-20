package e.a.a.a;

import e.a.a.a.c0;
import e.a.a.a.y0.b.f0;
import e.a.i;
import e.x.b.l;

public final class r<V> extends x<V> implements Object<V>, e.x.b.a, i {
    public final o0<a<V>> t;

    public static final class a<R> extends c0.c<R> implements Object<R>, l {

        /* renamed from: n  reason: collision with root package name */
        public final r<R> f7576n;

        public a(r<R> rVar) {
            e.x.c.i.e(rVar, "property");
            this.f7576n = rVar;
        }

        public c0 H() {
            return this.f7576n;
        }

        public Object invoke(Object obj) {
            a<V> e2 = this.f7576n.t.e();
            e.x.c.i.d(e2, "_setter()");
            e2.n(obj);
            return e.r.a;
        }

        public e.a.l p() {
            return this.f7576n;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        e.x.c.i.e(nVar, "container");
        e.x.c.i.e(f0Var, "descriptor");
        o0<a<V>> i2 = b.q.a.a.i2(new s(this));
        e.x.c.i.d(i2, "ReflectProperties.lazy { Setter(this) }");
        this.t = i2;
    }

    public i.a m() {
        a<V> e2 = this.t.e();
        e.x.c.i.d(e2, "_setter()");
        return e2;
    }
}
