package e.a.a.a.y0.d.a.b0.n;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.d.a.a0.i;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.d.a.d0.m;
import e.a.a.a.y0.d.a.d0.o;
import e.a.a.a.y0.d.a.t;
import e.a.a.a.y0.j.t.g;
import e.a.a.a.y0.j.t.t;
import e.a.a.a.y0.l.j;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.y0;
import e.a.l;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class d implements e.a.a.a.y0.b.a1.c, i {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ l[] f8378h;
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final e.a.a.a.y0.l.i f8379b;
    public final e.a.a.a.y0.d.a.c0.a c;
    public final e.a.a.a.y0.l.i d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8380e;
    public final h f;

    /* renamed from: g  reason: collision with root package name */
    public final e.a.a.a.y0.d.a.d0.a f8381g;

    public static final class a extends k implements e.x.b.a<Map<e.a.a.a.y0.f.d, ? extends g<?>>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f8382h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(0);
            this.f8382h = dVar;
        }

        public Object e() {
            Collection<e.a.a.a.y0.d.a.d0.b> a = this.f8382h.f8381g.a();
            ArrayList arrayList = new ArrayList();
            for (e.a.a.a.y0.d.a.d0.b bVar : a) {
                e.a.a.a.y0.f.d name = bVar.getName();
                if (name == null) {
                    name = t.f8577b;
                }
                g<?> b2 = this.f8382h.b(bVar);
                e.j jVar = b2 != null ? new e.j(name, b2) : null;
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            return e.t.g.X(arrayList);
        }
    }

    public static final class b extends k implements e.x.b.a<e.a.a.a.y0.f.b> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f8383h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(0);
            this.f8383h = dVar;
        }

        public Object e() {
            e.a.a.a.y0.f.a g2 = this.f8383h.f8381g.g();
            if (g2 != null) {
                return g2.b();
            }
            return null;
        }
    }

    public static final class c extends k implements e.x.b.a<k0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f8384h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f8384h = dVar;
        }

        public Object e() {
            e.a.a.a.y0.f.b e2 = this.f8384h.e();
            if (e2 != null) {
                e.x.c.i.d(e2, "fqName ?: return@createL…fqName: $javaAnnotation\")");
                e eVar = null;
                e k2 = e.a.a.a.y0.a.p.c.k(e.a.a.a.y0.a.p.c.f7720m, e2, this.f8384h.f.c.f8356o.v(), (Integer) null, 4);
                if (k2 != null) {
                    eVar = k2;
                } else {
                    e.a.a.a.y0.d.a.d0.g o2 = this.f8384h.f8381g.o();
                    if (o2 != null) {
                        eVar = this.f8384h.f.c.f8352k.a(o2);
                    }
                }
                if (eVar == null) {
                    d dVar = this.f8384h;
                    w wVar = dVar.f.c.f8356o;
                    e.a.a.a.y0.f.a l2 = e.a.a.a.y0.f.a.l(e2);
                    e.x.c.i.d(l2, "ClassId.topLevel(fqName)");
                    eVar = b.q.a.a.o0(wVar, l2, dVar.f.c.d.b().f9578m);
                }
                return eVar.s();
            }
            StringBuilder y = b.e.a.a.a.y("No fqName: ");
            y.append(this.f8384h.f8381g);
            return e.a.a.a.y0.m.w.d(y.toString());
        }
    }

    static {
        Class<d> cls = d.class;
        f8378h = new l[]{v.c(new q(v.a(cls), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), v.c(new q(v.a(cls), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), v.c(new q(v.a(cls), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public d(h hVar, e.a.a.a.y0.d.a.d0.a aVar) {
        e.x.c.i.e(hVar, "c");
        e.x.c.i.e(aVar, "javaAnnotation");
        this.f = hVar;
        this.f8381g = aVar;
        this.a = hVar.c.a.d(new b(this));
        this.f8379b = hVar.c.a.a(new c(this));
        this.c = hVar.c.f8351j.a(aVar);
        this.d = hVar.c.a.a(new a(this));
        this.f8380e = aVar.j();
    }

    public Map<e.a.a.a.y0.f.d, g<?>> a() {
        return (Map) b.q.a.a.j1(this.d, f8378h[2]);
    }

    public final g<?> b(e.a.a.a.y0.d.a.d0.b bVar) {
        g<?> gVar;
        e.a.a.a.y0.j.t.t tVar;
        d0 d0Var;
        if (bVar instanceof o) {
            return e.a.a.a.y0.j.t.i.b(((o) bVar).getValue());
        }
        if (bVar instanceof m) {
            m mVar = (m) bVar;
            e.a.a.a.y0.f.a d2 = mVar.d();
            e.a.a.a.y0.f.d a2 = mVar.a();
            if (d2 == null || a2 == null) {
                return null;
            }
            return new e.a.a.a.y0.j.t.k(d2, a2);
        }
        if (bVar instanceof e.a.a.a.y0.d.a.d0.e) {
            e.a.a.a.y0.f.d name = bVar.getName();
            if (name == null) {
                name = t.f8577b;
            }
            e.x.c.i.d(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            List<e.a.a.a.y0.d.a.d0.b> c2 = ((e.a.a.a.y0.d.a.d0.e) bVar).c();
            k0 k0Var = (k0) b.q.a.a.j1(this.f8379b, f8378h[1]);
            e.x.c.i.d(k0Var, "type");
            if (b.q.a.a.I1(k0Var)) {
                return null;
            }
            e e2 = e.a.a.a.y0.j.v.b.e(this);
            e.x.c.i.c(e2);
            w0 u0 = b.q.a.a.u0(name, e2);
            if (u0 == null || (d0Var = u0.d()) == null) {
                d0Var = this.f.c.f8356o.v().h(j1.INVARIANT, e.a.a.a.y0.m.w.d("Unknown array element type"));
            }
            e.x.c.i.d(d0Var, "DescriptorResolverUtils.… type\")\n                )");
            ArrayList arrayList = new ArrayList(b.q.a.a.C(c2, 10));
            for (e.a.a.a.y0.d.a.d0.b b2 : c2) {
                Object b3 = b(b2);
                if (b3 == null) {
                    b3 = new e.a.a.a.y0.j.t.v();
                }
                arrayList.add(b3);
            }
            e.x.c.i.e(arrayList, "value");
            e.x.c.i.e(d0Var, "type");
            gVar = new e.a.a.a.y0.j.t.b(arrayList, new e.a.a.a.y0.j.t.h(d0Var));
        } else if (bVar instanceof e.a.a.a.y0.d.a.d0.c) {
            return new e.a.a.a.y0.j.t.a(new d(this.f, ((e.a.a.a.y0.d.a.d0.c) bVar).b()));
        } else if (!(bVar instanceof e.a.a.a.y0.d.a.d0.h)) {
            return null;
        } else {
            d0 d3 = this.f.f8366b.d(((e.a.a.a.y0.d.a.d0.h) bVar).e(), e.a.a.a.y0.d.a.b0.o.i.c(e.a.a.a.y0.d.a.z.k.COMMON, false, (r0) null, 3));
            e.x.c.i.e(d3, "argumentType");
            if (b.q.a.a.I1(d3)) {
                return null;
            }
            d0 d0Var2 = d3;
            int i2 = 0;
            while (e.a.a.a.y0.a.g.A(d0Var2)) {
                d0Var2 = ((y0) e.t.g.O(d0Var2.V0())).d();
                e.x.c.i.d(d0Var2, "type.arguments.single().type");
                i2++;
            }
            e.a.a.a.y0.b.h d4 = d0Var2.W0().d();
            if (d4 instanceof e) {
                e.a.a.a.y0.f.a g2 = e.a.a.a.y0.j.v.b.g(d4);
                if (g2 != null) {
                    return tVar;
                }
                tVar = new e.a.a.a.y0.j.t.t((t.a) new t.a.C0211a(d3));
                return tVar;
            } else if (!(d4 instanceof r0)) {
                return null;
            } else {
                e.a.a.a.y0.f.a l2 = e.a.a.a.y0.f.a.l(e.a.a.a.y0.a.g.f7647k.a.i());
                e.x.c.i.d(l2, "ClassId.topLevel(KotlinB…ns.FQ_NAMES.any.toSafe())");
                gVar = new e.a.a.a.y0.j.t.t(l2, 0);
            }
        }
        return gVar;
    }

    public d0 d() {
        return (k0) b.q.a.a.j1(this.f8379b, f8378h[1]);
    }

    public e.a.a.a.y0.f.b e() {
        j jVar = this.a;
        l lVar = f8378h[0];
        e.x.c.i.e(jVar, "$this$getValue");
        e.x.c.i.e(lVar, "p");
        return (e.a.a.a.y0.f.b) jVar.e();
    }

    public boolean j() {
        return this.f8380e;
    }

    public String toString() {
        return e.a.a.a.y0.i.c.s(e.a.a.a.y0.i.c.a, this, (e.a.a.a.y0.b.a1.e) null, 2, (Object) null);
    }

    public m0 w() {
        return this.c;
    }
}
