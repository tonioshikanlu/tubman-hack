package e.a.a.a;

import e.a.a.a.c0;
import e.a.a.a.y0.b.f0;
import e.a.l;
import e.f;
import e.g;
import e.x.c.i;

public class x<V> extends c0<V> implements Object<V>, e.x.b.a {
    public final o0<a<V>> r;
    public final f<Object> s = b.q.a.a.g2(g.PUBLICATION, new z(this));

    public static final class a<R> extends c0.b<R> implements Object<R>, e.x.b.a {

        /* renamed from: n  reason: collision with root package name */
        public final x<R> f7609n;

        public a(x<? extends R> xVar) {
            i.e(xVar, "property");
            this.f7609n = xVar;
        }

        public c0 H() {
            return this.f7609n;
        }

        public R e() {
            return this.f7609n.j().n(new Object[0]);
        }

        public l p() {
            return this.f7609n;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        i.e(nVar, "container");
        i.e(f0Var, "descriptor");
        o0<a<V>> i2 = b.q.a.a.i2(new y(this));
        i.d(i2, "ReflectProperties.lazy { Getter(this) }");
        this.r = i2;
    }

    /* renamed from: K */
    public a<V> j() {
        a<V> e2 = this.r.e();
        i.d(e2, "_getter()");
        return e2;
    }

    public V e() {
        return j().n(new Object[0]);
    }
}
