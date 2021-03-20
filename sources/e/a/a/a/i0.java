package e.a.a.a;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.y0;
import e.a.l;
import e.a.p;
import e.a.q;
import e.f;
import e.g;
import e.h;
import e.t.o;
import e.x.c.i;
import e.x.c.j;
import e.x.c.k;
import e.x.c.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class i0 implements j {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ l[] f7544l;

    /* renamed from: h  reason: collision with root package name */
    public final n0<Type> f7545h;

    /* renamed from: i  reason: collision with root package name */
    public final n0 f7546i;

    /* renamed from: j  reason: collision with root package name */
    public final n0 f7547j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f7548k;

    public static final class a extends k implements e.x.b.a<List<? extends p>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i0 f7549h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ e.x.b.a f7550i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i0 i0Var, e.x.b.a aVar) {
            super(0);
            this.f7549h = i0Var;
            this.f7550i = aVar;
        }

        public Object e() {
            p pVar;
            List<y0> V0 = this.f7549h.f7548k.V0();
            if (V0.isEmpty()) {
                return o.f7934h;
            }
            f g2 = b.q.a.a.g2(g.PUBLICATION, new h0(this));
            ArrayList arrayList = new ArrayList(b.q.a.a.C(V0, 10));
            int i2 = 0;
            for (T next : V0) {
                int i3 = i2 + 1;
                g0 g0Var = null;
                if (i2 >= 0) {
                    y0 y0Var = (y0) next;
                    if (y0Var.c()) {
                        p.a aVar = p.d;
                        pVar = p.c;
                    } else {
                        d0 d = y0Var.d();
                        i.d(d, "typeProjection.type");
                        if (this.f7550i != null) {
                            g0Var = new g0(i2, this, g2, (l) null);
                        }
                        i0 i0Var = new i0(d, g0Var);
                        int ordinal = y0Var.b().ordinal();
                        if (ordinal == 0) {
                            p.a aVar2 = p.d;
                            i.e(i0Var, "type");
                            pVar = new p(q.INVARIANT, i0Var);
                        } else if (ordinal == 1) {
                            p.a aVar3 = p.d;
                            i.e(i0Var, "type");
                            pVar = new p(q.IN, i0Var);
                        } else if (ordinal == 2) {
                            p.a aVar4 = p.d;
                            i.e(i0Var, "type");
                            pVar = new p(q.OUT, i0Var);
                        } else {
                            throw new h();
                        }
                    }
                    arrayList.add(pVar);
                    i2 = i3;
                } else {
                    e.t.g.S();
                    throw null;
                }
            }
            return arrayList;
        }
    }

    public static final class b extends k implements e.x.b.a<e.a.f> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i0 f7551h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i0 i0Var) {
            super(0);
            this.f7551h = i0Var;
        }

        public Object e() {
            i0 i0Var = this.f7551h;
            return i0Var.e(i0Var.f7548k);
        }
    }

    static {
        Class<i0> cls = i0.class;
        f7544l = new l[]{v.c(new e.x.c.q(v.a(cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), v.c(new e.x.c.q(v.a(cls), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public i0(d0 d0Var, e.x.b.a<? extends Type> aVar) {
        i.e(d0Var, "type");
        this.f7548k = d0Var;
        n0<Type> n0Var = null;
        n0<Type> n0Var2 = !(aVar instanceof n0) ? null : aVar;
        if (n0Var2 != null) {
            n0Var = n0Var2;
        } else if (aVar != null) {
            n0Var = b.q.a.a.k2(aVar);
        }
        this.f7545h = n0Var;
        this.f7546i = b.q.a.a.k2(new b(this));
        this.f7547j = b.q.a.a.k2(new a(this, aVar));
    }

    public Type A() {
        n0<Type> n0Var = this.f7545h;
        if (n0Var != null) {
            return n0Var.e();
        }
        return null;
    }

    public List<p> a() {
        n0 n0Var = this.f7547j;
        l lVar = f7544l[1];
        return (List) n0Var.e();
    }

    public e.a.f b() {
        n0 n0Var = this.f7546i;
        l lVar = f7544l[0];
        return (e.a.f) n0Var.e();
    }

    public final e.a.f e(d0 d0Var) {
        d0 d;
        e.a.a.a.y0.b.h d2 = d0Var.W0().d();
        if (d2 instanceof e) {
            Class<?> j2 = v0.j((e) d2);
            if (j2 == null) {
                return null;
            }
            if (j2.isArray()) {
                y0 y0Var = (y0) e.t.g.Q(d0Var.V0());
                if (y0Var == null || (d = y0Var.d()) == null) {
                    return new a(j2);
                }
                i.d(d, "type.arguments.singleOrN…return KClassImpl(jClass)");
                e.a.f e2 = e(d);
                if (e2 != null) {
                    return new a(e.a.a.a.y0.b.d1.b.b.a(b.q.a.a.L0(b.q.a.a.R0(e2))));
                }
                throw new l0("Cannot determine classifier for array element type: " + this);
            } else if (f1.g(d0Var)) {
                return new a(j2);
            } else {
                List<e.a.e<? extends Object>> list = e.a.a.a.y0.b.d1.b.b.a;
                i.e(j2, "$this$primitiveByWrapper");
                Class<?> cls = e.a.a.a.y0.b.d1.b.b.f8289b.get(j2);
                if (cls != null) {
                    j2 = cls;
                }
                return new a(j2);
            }
        } else if (d2 instanceof r0) {
            return new j0((k0) null, (r0) d2);
        } else {
            if (!(d2 instanceof q0)) {
                return null;
            }
            throw new e.i(b.e.a.a.a.m("An operation is not implemented: ", "Type alias classifiers are not yet supported"));
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof i0) && i.a(this.f7548k, ((i0) obj).f7548k);
    }

    public int hashCode() {
        return this.f7548k.hashCode();
    }

    public List<Annotation> k() {
        return v0.d(this.f7548k);
    }

    public String toString() {
        r0 r0Var = r0.f7577b;
        return r0.e(this.f7548k);
    }

    public boolean x() {
        return this.f7548k.X0();
    }
}
