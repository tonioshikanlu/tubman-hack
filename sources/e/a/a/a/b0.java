package e.a.a.a;

import e.a.a.a.c0;
import e.a.a.a.y0.b.f0;
import e.a.l;
import e.f;
import e.g;
import e.x.b.p;
import e.x.c.i;
import e.x.c.k;
import java.lang.reflect.Field;

public class b0<D, E, V> extends c0<V> implements Object<D, E, V>, p {
    public final o0<a<D, E, V>> r;
    public final f<Field> s = b.q.a.a.g2(g.PUBLICATION, new c(this));

    public static final class a<D, E, V> extends c0.b<V> implements Object<D, E, V>, p {

        /* renamed from: n  reason: collision with root package name */
        public final b0<D, E, V> f7493n;

        public a(b0<D, E, ? extends V> b0Var) {
            i.e(b0Var, "property");
            this.f7493n = b0Var;
        }

        public c0 H() {
            return this.f7493n;
        }

        public V invoke(D d, E e2) {
            return this.f7493n.K(d, e2);
        }

        public l p() {
            return this.f7493n;
        }
    }

    public static final class b extends k implements e.x.b.a<a<D, E, ? extends V>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ b0 f7494h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var) {
            super(0);
            this.f7494h = b0Var;
        }

        public Object e() {
            return new a(this.f7494h);
        }
    }

    public static final class c extends k implements e.x.b.a<Field> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ b0 f7495h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b0 b0Var) {
            super(0);
            this.f7495h = b0Var;
        }

        public Object e() {
            return this.f7495h.G();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        i.e(nVar, "container");
        i.e(f0Var, "descriptor");
        o0<a<D, E, V>> i2 = b.q.a.a.i2(new b(this));
        i.d(i2, "ReflectProperties.lazy { Getter(this) }");
        this.r = i2;
    }

    public V K(D d, E e2) {
        return j().n(d, e2);
    }

    /* renamed from: L */
    public a<D, E, V> j() {
        a<D, E, V> e2 = this.r.e();
        i.d(e2, "_getter()");
        return e2;
    }

    public V invoke(D d, E e2) {
        return K(d, e2);
    }
}
