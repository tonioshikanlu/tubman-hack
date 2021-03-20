package b.j.a.c.b0;

import b.j.a.b.l;
import b.j.a.c.b0.z.h;
import b.j.a.c.b0.z.p;
import b.j.a.c.e0.r;
import b.j.a.c.e0.y;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.j0.b;
import b.j.a.c.j0.c0;
import b.j.a.c.j0.g;
import b.j.a.c.k;
import b.j.a.c.s;
import b.j.a.c.t;
import java.io.Closeable;
import java.io.Serializable;

public abstract class u extends b.j.a.c.e0.u implements Serializable {
    public static final j<Object> v = new h("No _valueDeserializer assigned");

    /* renamed from: k  reason: collision with root package name */
    public final t f1796k;

    /* renamed from: l  reason: collision with root package name */
    public final i f1797l;

    /* renamed from: m  reason: collision with root package name */
    public final t f1798m;

    /* renamed from: n  reason: collision with root package name */
    public final transient b f1799n;

    /* renamed from: o  reason: collision with root package name */
    public final j<Object> f1800o;

    /* renamed from: p  reason: collision with root package name */
    public final c f1801p;

    /* renamed from: q  reason: collision with root package name */
    public final r f1802q;
    public String r;
    public y s;
    public c0 t;
    public int u;

    public static abstract class a extends u {
        public final u w;

        public a(u uVar) {
            super(uVar);
            this.w = uVar;
        }

        public void B(Object obj, Object obj2) {
            this.w.B(obj, obj2);
        }

        public Object D(Object obj, Object obj2) {
            return this.w.D(obj, obj2);
        }

        public boolean F(Class<?> cls) {
            return this.w.F(cls);
        }

        public u G(t tVar) {
            return K(this.w.G(tVar));
        }

        public u H(r rVar) {
            return K(this.w.H(rVar));
        }

        public u J(j<?> jVar) {
            return K(this.w.J(jVar));
        }

        public u K(u uVar) {
            return uVar == this.w ? this : L(uVar);
        }

        public abstract u L(u uVar);

        public void b(int i2) {
            this.w.b(i2);
        }

        public b.j.a.c.e0.h e() {
            return this.w.e();
        }

        public void k(f fVar) {
            this.w.k(fVar);
        }

        public int n() {
            return this.w.n();
        }

        public Class<?> o() {
            return this.w.o();
        }

        public Object q() {
            return this.w.q();
        }

        public String r() {
            return this.w.r();
        }

        public y t() {
            return this.w.t();
        }

        public j<Object> u() {
            return this.w.u();
        }

        public c v() {
            return this.w.v();
        }

        public boolean w() {
            return this.w.w();
        }

        public boolean x() {
            return this.w.x();
        }

        public boolean y() {
            return this.w.y();
        }
    }

    public u(u uVar) {
        super((b.j.a.c.e0.u) uVar);
        this.u = -1;
        this.f1796k = uVar.f1796k;
        this.f1797l = uVar.f1797l;
        this.f1798m = uVar.f1798m;
        this.f1799n = uVar.f1799n;
        this.f1800o = uVar.f1800o;
        this.f1801p = uVar.f1801p;
        this.r = uVar.r;
        this.u = uVar.u;
        this.t = uVar.t;
        this.f1802q = uVar.f1802q;
    }

    public u(u uVar, j<?> jVar, r rVar) {
        super((b.j.a.c.e0.u) uVar);
        this.u = -1;
        this.f1796k = uVar.f1796k;
        this.f1797l = uVar.f1797l;
        this.f1798m = uVar.f1798m;
        this.f1799n = uVar.f1799n;
        this.f1801p = uVar.f1801p;
        this.r = uVar.r;
        this.u = uVar.u;
        this.f1800o = jVar == null ? v : jVar;
        this.t = uVar.t;
        this.f1802q = rVar == v ? this.f1800o : rVar;
    }

    public u(u uVar, t tVar) {
        super((b.j.a.c.e0.u) uVar);
        this.u = -1;
        this.f1796k = tVar;
        this.f1797l = uVar.f1797l;
        this.f1798m = uVar.f1798m;
        this.f1799n = uVar.f1799n;
        this.f1800o = uVar.f1800o;
        this.f1801p = uVar.f1801p;
        this.r = uVar.r;
        this.u = uVar.u;
        this.t = uVar.t;
        this.f1802q = uVar.f1802q;
    }

    public u(r rVar, i iVar, c cVar, b bVar) {
        this(rVar.h(), iVar, rVar.E(), cVar, bVar, rVar.l());
    }

    public u(t tVar, i iVar, s sVar, j<Object> jVar) {
        super(sVar);
        this.u = -1;
        this.f1796k = tVar == null ? t.f2304l : tVar.d();
        this.f1797l = iVar;
        this.f1798m = null;
        this.f1799n = null;
        this.t = null;
        this.f1801p = null;
        this.f1800o = jVar;
        this.f1802q = jVar;
    }

    public u(t tVar, i iVar, t tVar2, c cVar, b bVar, s sVar) {
        super(sVar);
        this.u = -1;
        this.f1796k = tVar == null ? t.f2304l : tVar.d();
        this.f1797l = iVar;
        this.f1798m = tVar2;
        this.f1799n = bVar;
        this.t = null;
        this.f1801p = cVar != null ? cVar.f(this) : cVar;
        j<Object> jVar = v;
        this.f1800o = jVar;
        this.f1802q = jVar;
    }

    public void A() {
    }

    public abstract void B(Object obj, Object obj2);

    public abstract Object D(Object obj, Object obj2);

    public void E(Class<?>[] clsArr) {
        if (clsArr == null) {
            this.t = null;
            return;
        }
        c0 c0Var = c0.f2205h;
        int length = clsArr.length;
        if (length != 0) {
            c0Var = length != 1 ? new c0.a(clsArr) : new c0.b(clsArr[0]);
        }
        this.t = c0Var;
    }

    public boolean F(Class<?> cls) {
        c0 c0Var = this.t;
        return c0Var == null || c0Var.a(cls);
    }

    public abstract u G(t tVar);

    public abstract u H(r rVar);

    public u I(String str) {
        t tVar = this.f1796k;
        t tVar2 = tVar == null ? new t(str) : tVar.f(str);
        return tVar2 == this.f1796k ? this : G(tVar2);
    }

    public abstract u J(j<?> jVar);

    public void a(b.j.a.b.i iVar, Exception exc, Object obj) {
        if (exc instanceof IllegalArgumentException) {
            String f = g.f(obj);
            StringBuilder sb = new StringBuilder("Problem deserializing property '");
            sb.append(this.f1796k.f2305h);
            sb.append("' (expected type: ");
            sb.append(this.f1797l);
            sb.append("; actual type: ");
            sb.append(f);
            sb.append(")");
            String i2 = g.i(exc);
            if (i2 != null) {
                sb.append(", problem: ");
            } else {
                i2 = " (no error message provided)";
            }
            sb.append(i2);
            throw new k((Closeable) iVar, sb.toString(), (Throwable) exc);
        }
        g.D(exc);
        g.E(exc);
        Throwable r2 = g.r(exc);
        throw new k((Closeable) iVar, g.i(r2), r2);
    }

    public void b(int i2) {
        if (this.u == -1) {
            this.u = i2;
            return;
        }
        StringBuilder y = b.e.a.a.a.y("Property '");
        y.append(this.f1796k.f2305h);
        y.append("' already had index (");
        y.append(this.u);
        y.append("), trying to assign ");
        y.append(i2);
        throw new IllegalStateException(y.toString());
    }

    public final Object c(b.j.a.b.i iVar, b.j.a.c.g gVar) {
        if (iVar.L0(l.VALUE_NULL)) {
            return this.f1802q.c(gVar);
        }
        c cVar = this.f1801p;
        if (cVar != null) {
            return this.f1800o.f(iVar, gVar, cVar);
        }
        Object d = this.f1800o.d(iVar, gVar);
        return d == null ? this.f1802q.c(gVar) : d;
    }

    public i d() {
        return this.f1797l;
    }

    public abstract b.j.a.c.e0.h e();

    public abstract void f(b.j.a.b.i iVar, b.j.a.c.g gVar, Object obj);

    public abstract Object g(b.j.a.b.i iVar, b.j.a.c.g gVar, Object obj);

    public final String getName() {
        return this.f1796k.f2305h;
    }

    public t h() {
        return this.f1796k;
    }

    public final Object i(b.j.a.b.i iVar, b.j.a.c.g gVar, Object obj) {
        if (iVar.L0(l.VALUE_NULL)) {
            return p.a(this.f1802q) ? obj : this.f1802q.c(gVar);
        }
        if (this.f1801p == null) {
            Object e2 = this.f1800o.e(iVar, gVar, obj);
            if (e2 == null) {
                return p.a(this.f1802q) ? obj : this.f1802q.c(gVar);
            }
            return e2;
        }
        gVar.l(this.f1797l, String.format("Cannot merge polymorphic property '%s'", new Object[]{this.f1796k.f2305h}));
        throw null;
    }

    public void k(f fVar) {
    }

    public int n() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", new Object[]{this.f1796k.f2305h, getClass().getName()}));
    }

    public Class<?> o() {
        return e().h();
    }

    public Object q() {
        return null;
    }

    public String r() {
        return this.r;
    }

    public y t() {
        return this.s;
    }

    public String toString() {
        return b.e.a.a.a.q(b.e.a.a.a.y("[property '"), this.f1796k.f2305h, "']");
    }

    public j<Object> u() {
        j<Object> jVar = this.f1800o;
        if (jVar == v) {
            return null;
        }
        return jVar;
    }

    public c v() {
        return this.f1801p;
    }

    public boolean w() {
        j<Object> jVar = this.f1800o;
        return (jVar == null || jVar == v) ? false : true;
    }

    public boolean x() {
        return this.f1801p != null;
    }

    public boolean y() {
        return this.t != null;
    }

    public boolean z() {
        return false;
    }
}
