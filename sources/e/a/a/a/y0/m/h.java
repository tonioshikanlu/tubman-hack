package e.a.a.a.y0.m;

import e.a.a.a.y0.b.p0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.l1.n;
import e.f;
import e.g;
import e.r;
import e.t.o;
import e.x.b.l;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class h implements v0 {
    public final i<b> a;

    public final class a implements v0 {
        public final f a = b.q.a.a.g2(g.PUBLICATION, new C0224a(this));

        /* renamed from: b  reason: collision with root package name */
        public final e.a.a.a.y0.m.l1.f f9676b;
        public final /* synthetic */ h c;

        /* renamed from: e.a.a.a.y0.m.h$a$a  reason: collision with other inner class name */
        public static final class C0224a extends k implements e.x.b.a<List<? extends d0>> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ a f9677h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0224a(a aVar) {
                super(0);
                this.f9677h = aVar;
            }

            public Object e() {
                a aVar = this.f9677h;
                e.a.a.a.y0.m.l1.f fVar = aVar.f9676b;
                List<d0> l2 = aVar.c.h();
                w.a<n<e.a.a.a.y0.m.l1.f>> aVar2 = e.a.a.a.y0.m.l1.g.a;
                e.x.c.i.e(fVar, "$this$refineTypes");
                e.x.c.i.e(l2, "types");
                ArrayList arrayList = new ArrayList(b.q.a.a.C(l2, 10));
                for (d0 g2 : l2) {
                    arrayList.add(fVar.g(g2));
                }
                return arrayList;
            }
        }

        public a(h hVar, e.a.a.a.y0.m.l1.f fVar) {
            e.x.c.i.e(fVar, "kotlinTypeRefiner");
            this.c = hVar;
            this.f9676b = fVar;
        }

        public v0 a(e.a.a.a.y0.m.l1.f fVar) {
            e.x.c.i.e(fVar, "kotlinTypeRefiner");
            return this.c.a(fVar);
        }

        public boolean b() {
            return this.c.b();
        }

        public e.a.a.a.y0.b.h d() {
            return this.c.d();
        }

        public boolean equals(Object obj) {
            return this.c.equals(obj);
        }

        public List<r0> g() {
            List<r0> g2 = this.c.g();
            e.x.c.i.d(g2, "this@AbstractTypeConstructor.parameters");
            return g2;
        }

        public Collection h() {
            return (List) this.a.getValue();
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            return this.c.toString();
        }

        public e.a.a.a.y0.a.g v() {
            e.a.a.a.y0.a.g v = this.c.v();
            e.x.c.i.d(v, "this@AbstractTypeConstructor.builtIns");
            return v;
        }
    }

    public static final class b {
        public List<? extends d0> a = b.q.a.a.l2(w.c);

        /* renamed from: b  reason: collision with root package name */
        public final Collection<d0> f9678b;

        public b(Collection<? extends d0> collection) {
            e.x.c.i.e(collection, "allSupertypes");
            this.f9678b = collection;
        }
    }

    public static final class c extends k implements e.x.b.a<b> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ h f9679h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h hVar) {
            super(0);
            this.f9679h = hVar;
        }

        public Object e() {
            return new b(this.f9679h.f());
        }
    }

    public static final class d extends k implements l<Boolean, b> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f9680h = new d();

        public d() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return new b(b.q.a.a.l2(w.c));
        }
    }

    public static final class e extends k implements l<b, r> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ h f9681h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(h hVar) {
            super(1);
            this.f9681h = hVar;
        }

        public Object invoke(Object obj) {
            b bVar = (b) obj;
            e.x.c.i.e(bVar, "supertypes");
            Collection<d0> a = this.f9681h.k().a(this.f9681h, bVar.f9678b, new k(this), new l(this));
            List<? extends d0> list = null;
            if (a.isEmpty()) {
                d0 i2 = this.f9681h.i();
                a = i2 != null ? b.q.a.a.l2(i2) : null;
                if (a == null) {
                    a = o.f7934h;
                }
            }
            this.f9681h.k().a(this.f9681h, a, new i(this), new j(this));
            if (a instanceof List) {
                list = a;
            }
            List<? extends d0> list2 = list;
            if (list2 == null) {
                list2 = e.t.g.W(a);
            }
            e.x.c.i.e(list2, "<set-?>");
            bVar.a = list2;
            return r.a;
        }
    }

    public h(m mVar) {
        e.x.c.i.e(mVar, "storageManager");
        this.a = mVar.e(new c(this), d.f9680h, new e(this));
    }

    public static final Collection e(h hVar, v0 v0Var, boolean z) {
        Objects.requireNonNull(hVar);
        h hVar2 = (h) (!(v0Var instanceof h) ? null : v0Var);
        if (hVar2 != null) {
            return e.t.g.I(((b) hVar2.a.e()).f9678b, hVar2.j(z));
        }
        Collection<d0> h2 = v0Var.h();
        e.x.c.i.d(h2, "supertypes");
        return h2;
    }

    public v0 a(e.a.a.a.y0.m.l1.f fVar) {
        e.x.c.i.e(fVar, "kotlinTypeRefiner");
        return new a(this, fVar);
    }

    public abstract e.a.a.a.y0.b.h d();

    public abstract Collection<d0> f();

    public d0 i() {
        return null;
    }

    public Collection<d0> j(boolean z) {
        return o.f7934h;
    }

    public abstract p0 k();

    /* renamed from: l */
    public List<d0> h() {
        return ((b) this.a.e()).a;
    }

    public void m(d0 d0Var) {
        e.x.c.i.e(d0Var, "type");
    }
}
