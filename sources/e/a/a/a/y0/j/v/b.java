package e.a.a.a.y0.j.v;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.e0;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.o.c;
import e.b0.s;
import e.x.b.l;
import e.x.c.g;
import e.x.c.i;
import e.x.c.u;
import e.x.c.v;
import java.util.ArrayList;
import java.util.Collection;

public final class b {
    public static final /* synthetic */ int a = 0;

    public static final class a<N> implements c<w0> {
        public static final a a = new a();

        public Iterable a(Object obj) {
            w0 w0Var = (w0) obj;
            i.d(w0Var, "current");
            Collection<w0> g2 = w0Var.g();
            ArrayList arrayList = new ArrayList(b.q.a.a.C(g2, 10));
            for (w0 a2 : g2) {
                arrayList.add(a2.a());
            }
            return arrayList;
        }
    }

    /* renamed from: e.a.a.a.y0.j.v.b$b  reason: collision with other inner class name */
    public static final /* synthetic */ class C0213b extends g implements l<w0, Boolean> {

        /* renamed from: q  reason: collision with root package name */
        public static final C0213b f9422q = new C0213b();

        public C0213b() {
            super(1);
        }

        public final String D() {
            return "declaresDefaultValue()Z";
        }

        public final String getName() {
            return "declaresDefaultValue";
        }

        public Object invoke(Object obj) {
            w0 w0Var = (w0) obj;
            i.e(w0Var, "p1");
            return Boolean.valueOf(w0Var.k0());
        }

        public final e.a.g u() {
            return v.a(w0.class);
        }
    }

    static {
        i.d(d.l("value"), "Name.identifier(\"value\")");
    }

    public static final boolean a(w0 w0Var) {
        i.e(w0Var, "$this$declaresOrInheritsDefaultValue");
        Boolean I = e.a.a.a.y0.m.o1.c.I(b.q.a.a.l2(w0Var), a.a, C0213b.f9422q);
        i.d(I, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return I.booleanValue();
    }

    public static final e.a.a.a.y0.j.t.g<?> b(e.a.a.a.y0.b.a1.c cVar) {
        i.e(cVar, "$this$firstArgument");
        return (e.a.a.a.y0.j.t.g) e.t.g.p(cVar.a().values());
    }

    public static e.a.a.a.y0.b.b c(e.a.a.a.y0.b.b bVar, boolean z, l lVar, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        i.e(bVar, "$this$firstOverridden");
        i.e(lVar, "predicate");
        u uVar = new u();
        uVar.f7989h = null;
        return (e.a.a.a.y0.b.b) e.a.a.a.y0.m.o1.c.w(b.q.a.a.l2(bVar), new c(z), new d(uVar, lVar));
    }

    public static final e.a.a.a.y0.f.b d(k kVar) {
        i.e(kVar, "$this$fqNameOrNull");
        e.a.a.a.y0.f.c i2 = i(kVar);
        if (!i2.f()) {
            i2 = null;
        }
        if (i2 != null) {
            return i2.i();
        }
        return null;
    }

    public static final e e(e.a.a.a.y0.b.a1.c cVar) {
        i.e(cVar, "$this$annotationClass");
        h d = cVar.d().W0().d();
        if (!(d instanceof e)) {
            d = null;
        }
        return (e) d;
    }

    public static final e.a.a.a.y0.a.g f(k kVar) {
        i.e(kVar, "$this$builtIns");
        return k(kVar).v();
    }

    public static final e.a.a.a.y0.f.a g(h hVar) {
        k b2;
        e.a.a.a.y0.f.a g2;
        if (hVar == null || (b2 = hVar.b()) == null) {
            return null;
        }
        if (b2 instanceof y) {
            return new e.a.a.a.y0.f.a(((y) b2).e(), hVar.getName());
        }
        if (!(b2 instanceof e.a.a.a.y0.b.i) || (g2 = g((h) b2)) == null) {
            return null;
        }
        return g2.d(hVar.getName());
    }

    public static final e.a.a.a.y0.f.b h(k kVar) {
        i.e(kVar, "$this$fqNameSafe");
        e.a.a.a.y0.f.b h2 = e.a.a.a.y0.j.g.h(kVar);
        if (h2 == null) {
            h2 = e.a.a.a.y0.j.g.i(kVar).i();
        }
        if (h2 != null) {
            i.d(h2, "DescriptorUtils.getFqNameSafe(this)");
            return h2;
        }
        e.a.a.a.y0.j.g.a(4);
        throw null;
    }

    public static final e.a.a.a.y0.f.c i(k kVar) {
        i.e(kVar, "$this$fqNameUnsafe");
        e.a.a.a.y0.f.c g2 = e.a.a.a.y0.j.g.g(kVar);
        i.d(g2, "DescriptorUtils.getFqName(this)");
        return g2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = (e.a.a.a.y0.m.l1.f) r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.y0.m.l1.f j(e.a.a.a.y0.b.w r1) {
        /*
            java.lang.String r0 = "$this$getKotlinTypeRefiner"
            e.x.c.i.e(r1, r0)
            e.a.a.a.y0.b.w$a<e.a.a.a.y0.m.l1.n<e.a.a.a.y0.m.l1.f>> r0 = e.a.a.a.y0.m.l1.g.a
            java.lang.Object r1 = r1.E0(r0)
            e.a.a.a.y0.m.l1.n r1 = (e.a.a.a.y0.m.l1.n) r1
            if (r1 == 0) goto L_0x0016
            T r1 = r1.a
            e.a.a.a.y0.m.l1.f r1 = (e.a.a.a.y0.m.l1.f) r1
            if (r1 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            e.a.a.a.y0.m.l1.f$a r1 = e.a.a.a.y0.m.l1.f.a.a
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.v.b.j(e.a.a.a.y0.b.w):e.a.a.a.y0.m.l1.f");
    }

    public static final w k(k kVar) {
        i.e(kVar, "$this$module");
        w d = e.a.a.a.y0.j.g.d(kVar);
        i.d(d, "DescriptorUtils.getContainingModule(this)");
        return d;
    }

    public static final e.b0.h<k> l(k kVar) {
        i.e(kVar, "$this$parents");
        i.e(kVar, "$this$parentsWithSelf");
        return s.b(e.a.a.a.y0.m.o1.c.B(kVar, e.f9424h), 1);
    }

    public static final e.a.a.a.y0.b.b m(e.a.a.a.y0.b.b bVar) {
        i.e(bVar, "$this$propertyIfAccessor");
        if (!(bVar instanceof e0)) {
            return bVar;
        }
        f0 z0 = ((e0) bVar).z0();
        i.d(z0, "correspondingProperty");
        return z0;
    }
}
