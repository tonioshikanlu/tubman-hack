package e.a.a.a.y0.j.y;

import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.o0;
import e.a.a.a.y0.c.a.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.b1;
import e.a.a.a.y0.m.d1;
import e.a.a.a.y0.m.o1.c;
import e.f;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class m implements i {

    /* renamed from: b  reason: collision with root package name */
    public final d1 f9463b;
    public Map<k, k> c;
    public final f d = b.q.a.a.h2(new a(this));

    /* renamed from: e  reason: collision with root package name */
    public final i f9464e;

    public static final class a extends e.x.c.k implements e.x.b.a<Collection<? extends k>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ m f9465h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m mVar) {
            super(0);
            this.f9465h = mVar;
        }

        public Object e() {
            m mVar = this.f9465h;
            return mVar.h(b.q.a.a.E0(mVar.f9464e, (d) null, (l) null, 3, (Object) null));
        }
    }

    public m(i iVar, d1 d1Var) {
        i.e(iVar, "workerScope");
        i.e(d1Var, "givenSubstitutor");
        this.f9464e = iVar;
        b1 g2 = d1Var.g();
        i.d(g2, "givenSubstitutor.substitution");
        this.f9463b = b.q.a.a.v3(g2, false, 1).c();
    }

    public Collection<? extends l0> a(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return h(this.f9464e.a(dVar, bVar));
    }

    public h b(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        h b2 = this.f9464e.b(dVar, bVar);
        if (b2 != null) {
            return (h) i(b2);
        }
        return null;
    }

    public Collection<k> c(d dVar, l<? super d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        return (Collection) this.d.getValue();
    }

    public Collection<? extends f0> d(d dVar, b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return h(this.f9464e.d(dVar, bVar));
    }

    public Set<d> e() {
        return this.f9464e.e();
    }

    public Set<d> f() {
        return this.f9464e.f();
    }

    public Set<d> g() {
        return this.f9464e.g();
    }

    public final <D extends k> Collection<D> h(Collection<? extends D> collection) {
        if (this.f9463b.h() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c.n(collection.size()));
        Iterator<? extends D> it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((k) it.next()));
        }
        return linkedHashSet;
    }

    public final <D extends k> D i(D d2) {
        if (this.f9463b.h()) {
            return d2;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        Map<k, k> map = this.c;
        i.c(map);
        D d3 = map.get(d2);
        if (d3 == null) {
            if (d2 instanceof o0) {
                d3 = ((o0) d2).c(this.f9463b);
                if (d3 != null) {
                    map.put(d2, d3);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, " + "but " + d2 + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d2).toString());
            }
        }
        return (k) d3;
    }
}
