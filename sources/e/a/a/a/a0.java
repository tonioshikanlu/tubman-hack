package e.a.a.a;

import e.a.a.a.c0;
import e.a.a.a.y0.b.f0;
import e.a.l;
import e.a.m;
import e.f;
import e.g;
import e.x.c.i;
import e.x.c.k;
import java.lang.reflect.Field;

public class a0<T, V> extends c0<V> implements m<T, V> {
    public final o0<a<T, V>> r;
    public final f<Field> s = b.q.a.a.g2(g.PUBLICATION, new c(this));

    public static final class a<T, V> extends c0.b<V> implements m.a<T, V> {

        /* renamed from: n  reason: collision with root package name */
        public final a0<T, V> f7479n;

        public a(a0<T, ? extends V> a0Var) {
            i.e(a0Var, "property");
            this.f7479n = a0Var;
        }

        public c0 H() {
            return this.f7479n;
        }

        public V invoke(T t) {
            return this.f7479n.get(t);
        }

        public l p() {
            return this.f7479n;
        }
    }

    public static final class b extends k implements e.x.b.a<a<T, ? extends V>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a0 f7480h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var) {
            super(0);
            this.f7480h = a0Var;
        }

        public Object e() {
            return new a(this.f7480h);
        }
    }

    public static final class c extends k implements e.x.b.a<Field> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a0 f7481h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var) {
            super(0);
            this.f7481h = a0Var;
        }

        public Object e() {
            return this.f7481h.G();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        i.e(nVar, "container");
        i.e(f0Var, "descriptor");
        o0<a<T, V>> i2 = b.q.a.a.i2(new b(this));
        i.d(i2, "ReflectProperties.lazy { Getter(this) }");
        this.r = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(n nVar, String str, String str2, Object obj) {
        super(nVar, str, str2, (f0) null, obj);
        i.e(nVar, "container");
        i.e(str, "name");
        i.e(str2, "signature");
        i.e(nVar, "container");
        i.e(str, "name");
        i.e(str2, "signature");
        o0<a<T, V>> i2 = b.q.a.a.i2(new b(this));
        i.d(i2, "ReflectProperties.lazy { Getter(this) }");
        this.r = i2;
    }

    /* renamed from: K */
    public a<T, V> j() {
        a<T, V> e2 = this.r.e();
        i.d(e2, "_getter()");
        return e2;
    }

    public V get(T t) {
        return j().n(t);
    }

    public V invoke(T t) {
        return get(t);
    }
}
