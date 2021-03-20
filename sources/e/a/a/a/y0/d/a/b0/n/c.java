package e.a.a.a.y0.d.a.b0.n;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.c.a.b;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.d.a.d0.t;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.y.i;
import e.a.l;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public final class c implements i {
    public static final /* synthetic */ l[] f = {v.c(new q(v.a(c.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b  reason: collision with root package name */
    public final j f8375b;
    public final e.a.a.a.y0.l.i c;
    public final h d;

    /* renamed from: e  reason: collision with root package name */
    public final i f8376e;

    public static final class a extends k implements e.x.b.a<i[]> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ c f8377h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(0);
            this.f8377h = cVar;
        }

        public Object e() {
            Collection<e.a.a.a.y0.d.b.l> values = this.f8377h.f8376e.w0().values();
            ArrayList arrayList = new ArrayList();
            for (e.a.a.a.y0.d.b.l a : values) {
                c cVar = this.f8377h;
                i a2 = cVar.d.c.d.a(cVar.f8376e, a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            Object[] array = e.a.a.a.y0.m.o1.c.T(arrayList).toArray(new i[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (i[]) array;
        }
    }

    public c(h hVar, t tVar, i iVar) {
        e.x.c.i.e(hVar, "c");
        e.x.c.i.e(tVar, "jPackage");
        e.x.c.i.e(iVar, "packageFragment");
        this.d = hVar;
        this.f8376e = iVar;
        this.f8375b = new j(hVar, tVar, iVar);
        this.c = hVar.c.a.a(new a(this));
    }

    public Collection<l0> a(d dVar, b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        i(dVar, bVar);
        j jVar = this.f8375b;
        i[] h2 = h();
        Collection a2 = jVar.a(dVar, bVar);
        for (i a3 : h2) {
            a2 = e.a.a.a.y0.m.o1.c.s(a2, a3.a(dVar, bVar));
        }
        return a2 != null ? a2 : e.t.q.f7936h;
    }

    public e.a.a.a.y0.b.h b(d dVar, b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        i(dVar, bVar);
        j jVar = this.f8375b;
        Objects.requireNonNull(jVar);
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        e.a.a.a.y0.b.h hVar = null;
        e u = jVar.u(dVar, (g) null);
        if (u != null) {
            return u;
        }
        for (i b2 : h()) {
            e.a.a.a.y0.b.h b3 = b2.b(dVar, bVar);
            if (b3 != null) {
                if (!(b3 instanceof e.a.a.a.y0.b.i) || !((e.a.a.a.y0.b.i) b3).m0()) {
                    return b3;
                }
                if (hVar == null) {
                    hVar = b3;
                }
            }
        }
        return hVar;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [e.x.b.l, e.x.b.l<? super e.a.a.a.y0.f.d, java.lang.Boolean>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<e.a.a.a.y0.b.k> c(e.a.a.a.y0.j.y.d r6, e.x.b.l<? super e.a.a.a.y0.f.d, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "kindFilter"
            e.x.c.i.e(r6, r0)
            java.lang.String r0 = "nameFilter"
            e.x.c.i.e(r7, r0)
            e.a.a.a.y0.d.a.b0.n.j r0 = r5.f8375b
            e.a.a.a.y0.j.y.i[] r1 = r5.h()
            java.util.Collection r0 = r0.c(r6, r7)
            int r2 = r1.length
            r3 = 0
        L_0x0016:
            if (r3 >= r2) goto L_0x0025
            r4 = r1[r3]
            java.util.Collection r4 = r4.c(r6, r7)
            java.util.Collection r0 = e.a.a.a.y0.m.o1.c.s(r0, r4)
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0025:
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            e.t.q r0 = e.t.q.f7936h
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.b0.n.c.c(e.a.a.a.y0.j.y.d, e.x.b.l):java.util.Collection");
    }

    public Collection<f0> d(d dVar, b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        i(dVar, bVar);
        j jVar = this.f8375b;
        i[] h2 = h();
        Collection d2 = jVar.d(dVar, bVar);
        for (i d3 : h2) {
            d2 = e.a.a.a.y0.m.o1.c.s(d2, d3.d(dVar, bVar));
        }
        return d2 != null ? d2 : e.t.q.f7936h;
    }

    public Set<d> e() {
        i[] h2 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i e2 : h2) {
            e.t.g.b(linkedHashSet, e2.e());
        }
        linkedHashSet.addAll(this.f8375b.e());
        return linkedHashSet;
    }

    public Set<d> f() {
        i[] h2 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i f2 : h2) {
            e.t.g.b(linkedHashSet, f2.f());
        }
        linkedHashSet.addAll(this.f8375b.f());
        return linkedHashSet;
    }

    public Set<d> g() {
        Set<d> r0 = b.q.a.a.r0(b.q.a.a.r(h()));
        if (r0 == null) {
            return null;
        }
        r0.addAll(this.f8375b.g());
        return r0;
    }

    public final i[] h() {
        return (i[]) b.q.a.a.j1(this.c, f[0]);
    }

    public void i(d dVar, b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        b.q.a.a.A2(this.d.c.f8355n, bVar, this.f8376e, dVar);
    }
}
