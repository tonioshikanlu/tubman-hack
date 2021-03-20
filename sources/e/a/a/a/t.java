package e.a.a.a;

import e.a.a.a.c0;
import e.a.a.a.y0.b.f0;
import e.a.j;
import e.a.l;
import e.r;
import e.x.c.i;
import e.x.c.k;

public final class t<T, V> extends a0<T, V> implements j<T, V> {
    public final o0<a<T, V>> t;

    public static final class a<T, V> extends c0.c<V> implements j.a<T, V> {

        /* renamed from: n  reason: collision with root package name */
        public final t<T, V> f7581n;

        public a(t<T, V> tVar) {
            i.e(tVar, "property");
            this.f7581n = tVar;
        }

        public c0 H() {
            return this.f7581n;
        }

        public Object invoke(Object obj, Object obj2) {
            this.f7581n.m().n(obj, obj2);
            return r.a;
        }

        public l p() {
            return this.f7581n;
        }
    }

    public static final class b extends k implements e.x.b.a<a<T, V>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ t f7582h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(t tVar) {
            super(0);
            this.f7582h = tVar;
        }

        public Object e() {
            return new a(this.f7582h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        i.e(nVar, "container");
        i.e(f0Var, "descriptor");
        o0<a<T, V>> i2 = b.q.a.a.i2(new b(this));
        i.d(i2, "ReflectProperties.lazy { Setter(this) }");
        this.t = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(n nVar, String str, String str2, Object obj) {
        super(nVar, str, str2, obj);
        i.e(nVar, "container");
        i.e(str, "name");
        i.e(str2, "signature");
        o0<a<T, V>> i2 = b.q.a.a.i2(new b(this));
        i.d(i2, "ReflectProperties.lazy { Setter(this) }");
        this.t = i2;
    }

    /* renamed from: L */
    public a<T, V> m() {
        a<T, V> e2 = this.t.e();
        i.d(e2, "_setter()");
        return e2;
    }

    public void q(T t2, V v) {
        m().n(t2, v);
    }
}
