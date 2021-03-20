package e.a.a.a.y0.d.a.b0.n;

import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.d.a.b0.c;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.y.i;
import e.t.q;
import e.x.b.l;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class o extends s {

    /* renamed from: n  reason: collision with root package name */
    public final g f8450n;

    /* renamed from: o  reason: collision with root package name */
    public final e f8451o;

    public static final class a extends k implements l<i, Collection<? extends f0>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f8452h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(1);
            this.f8452h = dVar;
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "it");
            return iVar.d(this.f8452h, e.a.a.a.y0.c.a.d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    public static final class b extends k implements l<i, Collection<? extends d>> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f8453h = new b();

        public b() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "it");
            return iVar.f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(h hVar, g gVar, e eVar) {
        super(hVar);
        e.x.c.i.e(hVar, "c");
        e.x.c.i.e(gVar, "jClass");
        e.x.c.i.e(eVar, "ownerDescriptor");
        this.f8450n = gVar;
        this.f8451o = eVar;
    }

    public e.a.a.a.y0.b.h b(d dVar, e.a.a.a.y0.c.a.b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        return null;
    }

    public Set<d> h(e.a.a.a.y0.j.y.d dVar, l<? super d, Boolean> lVar) {
        e.x.c.i.e(dVar, "kindFilter");
        return q.f7936h;
    }

    public Set<d> i(e.a.a.a.y0.j.y.d dVar, l<? super d, Boolean> lVar) {
        e.x.c.i.e(dVar, "kindFilter");
        Set<d> c0 = e.t.g.c0(((b) this.c.e()).a());
        o b1 = b.q.a.a.b1(this.f8451o);
        Collection e2 = b1 != null ? b1.e() : null;
        if (e2 == null) {
            e2 = q.f7936h;
        }
        c0.addAll(e2);
        if (this.f8450n.s()) {
            c0.addAll(e.t.g.B(e.a.a.a.y0.j.g.f9379b, e.a.a.a.y0.j.g.a));
        }
        return c0;
    }

    public b j() {
        return new a(this.f8450n, n.f8449h);
    }

    public void l(Collection<l0> collection, d dVar) {
        l0 l0Var;
        String str;
        e.x.c.i.e(collection, "result");
        e.x.c.i.e(dVar, "name");
        o b1 = b.q.a.a.b1(this.f8451o);
        Set<T> d0 = b1 != null ? e.t.g.d0(b1.a(dVar, e.a.a.a.y0.c.a.d.WHEN_GET_SUPER_MEMBERS)) : q.f7936h;
        e eVar = this.f8451o;
        c cVar = this.f8431k.c;
        Collection<D> L2 = b.q.a.a.L2(dVar, d0, collection, eVar, cVar.f, cVar.u.a());
        e.x.c.i.d(L2, "resolveOverridesForStati….overridingUtil\n        )");
        collection.addAll(L2);
        if (this.f8450n.s()) {
            if (e.x.c.i.a(dVar, e.a.a.a.y0.j.g.f9379b)) {
                l0Var = b.q.a.a.W(this.f8451o);
                str = "createEnumValueOfMethod(ownerDescriptor)";
            } else if (e.x.c.i.a(dVar, e.a.a.a.y0.j.g.a)) {
                l0Var = b.q.a.a.X(this.f8451o);
                str = "createEnumValuesMethod(ownerDescriptor)";
            } else {
                return;
            }
            e.x.c.i.d(l0Var, str);
            collection.add(l0Var);
        }
    }

    public void m(d dVar, Collection<f0> collection) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(collection, "result");
        e eVar = this.f8451o;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.a.a.a.y0.m.o1.c.w(b.q.a.a.l2(eVar), q.a, new r(eVar, linkedHashSet, new a(dVar)));
        if (!collection.isEmpty()) {
            e eVar2 = this.f8451o;
            c cVar = this.f8431k.c;
            Collection<D> L2 = b.q.a.a.L2(dVar, linkedHashSet, collection, eVar2, cVar.f, cVar.u.a());
            e.x.c.i.d(L2, "resolveOverridesForStati…ingUtil\n                )");
            collection.addAll(L2);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : linkedHashSet) {
            f0 u = u((f0) next);
            Object obj = linkedHashMap.get(u);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(u, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : linkedHashMap.entrySet()) {
            e eVar3 = this.f8451o;
            c cVar2 = this.f8431k.c;
            e.t.g.b(arrayList, b.q.a.a.L2(dVar, (Collection) value.getValue(), collection, eVar3, cVar2.f, cVar2.u.a()));
        }
        collection.addAll(arrayList);
    }

    public Set<d> n(e.a.a.a.y0.j.y.d dVar, l<? super d, Boolean> lVar) {
        e.x.c.i.e(dVar, "kindFilter");
        Set<d> c0 = e.t.g.c0(((b) this.c.e()).c());
        e eVar = this.f8451o;
        e.a.a.a.y0.m.o1.c.w(b.q.a.a.l2(eVar), q.a, new r(eVar, c0, b.f8453h));
        return c0;
    }

    public e.a.a.a.y0.b.k p() {
        return this.f8451o;
    }

    public final f0 u(f0 f0Var) {
        b.a i2 = f0Var.i();
        e.x.c.i.d(i2, "this.kind");
        if (i2.d()) {
            return f0Var;
        }
        Collection<? extends f0> g2 = f0Var.g();
        e.x.c.i.d(g2, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(b.q.a.a.C(g2, 10));
        for (f0 f0Var2 : g2) {
            e.x.c.i.d(f0Var2, "it");
            arrayList.add(u(f0Var2));
        }
        return (f0) e.t.g.O(e.t.g.j(arrayList));
    }
}
