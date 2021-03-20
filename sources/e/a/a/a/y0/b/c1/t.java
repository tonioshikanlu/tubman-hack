package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.l;
import e.t.g;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class t extends m implements b0 {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ l[] f8265n = {v.c(new q(v.a(t.class), "fragments", "getFragments()Ljava/util/List;"))};

    /* renamed from: j  reason: collision with root package name */
    public final i f8266j;

    /* renamed from: k  reason: collision with root package name */
    public final e.a.a.a.y0.j.y.i f8267k;

    /* renamed from: l  reason: collision with root package name */
    public final a0 f8268l;

    /* renamed from: m  reason: collision with root package name */
    public final e.a.a.a.y0.f.b f8269m;

    public static final class a extends k implements e.x.b.a<List<? extends y>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ t f8270h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(t tVar) {
            super(0);
            this.f8270h = tVar;
        }

        public Object e() {
            a0 a0Var = this.f8270h.f8268l;
            a0Var.j0();
            return ((l) a0Var.f8160o.getValue()).a(this.f8270h.f8269m);
        }
    }

    public static final class b extends k implements e.x.b.a<e.a.a.a.y0.j.y.i> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ t f8271h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(t tVar) {
            super(0);
            this.f8271h = tVar;
        }

        public Object e() {
            if (this.f8271h.f0().isEmpty()) {
                return i.b.f9460b;
            }
            List<y> f0 = this.f8271h.f0();
            ArrayList arrayList = new ArrayList(b.q.a.a.C(f0, 10));
            for (y z : f0) {
                arrayList.add(z.z());
            }
            t tVar = this.f8271h;
            List J = g.J(arrayList, new j0(tVar.f8268l, tVar.f8269m));
            StringBuilder y = b.e.a.a.a.y("package view scope for ");
            y.append(this.f8271h.f8269m);
            y.append(" in ");
            y.append(this.f8271h.f8268l.getName());
            return e.a.a.a.y0.j.y.b.h(y.toString(), J);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, e.a.a.a.y0.f.b bVar, m mVar) {
        super(h.a.a, bVar.h());
        e.x.c.i.e(a0Var, "module");
        e.x.c.i.e(bVar, "fqName");
        e.x.c.i.e(mVar, "storageManager");
        Objects.requireNonNull(h.f7785e);
        this.f8268l = a0Var;
        this.f8269m = bVar;
        this.f8266j = mVar.a(new a(this));
        this.f8267k = new e.a.a.a.y0.j.y.h(mVar, new b(this));
    }

    public e.a.a.a.y0.b.k b() {
        if (this.f8269m.d()) {
            return null;
        }
        a0 a0Var = this.f8268l;
        e.a.a.a.y0.f.b e2 = this.f8269m.e();
        e.x.c.i.d(e2, "fqName.parent()");
        return a0Var.o0(e2);
    }

    public e.a.a.a.y0.f.b e() {
        return this.f8269m;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            obj = null;
        }
        b0 b0Var = (b0) obj;
        if (b0Var == null || !e.x.c.i.a(this.f8269m, b0Var.e()) || !e.x.c.i.a(this.f8268l, b0Var.n0())) {
            return false;
        }
        return true;
    }

    public List<y> f0() {
        return (List) b.q.a.a.j1(this.f8266j, f8265n[0]);
    }

    public int hashCode() {
        return this.f8269m.hashCode() + (this.f8268l.hashCode() * 31);
    }

    public boolean isEmpty() {
        return f0().isEmpty();
    }

    public <R, D> R l0(e.a.a.a.y0.b.m<R, D> mVar, D d) {
        e.x.c.i.e(mVar, "visitor");
        return mVar.d(this, d);
    }

    public w n0() {
        return this.f8268l;
    }

    public e.a.a.a.y0.j.y.i z() {
        return this.f8267k;
    }
}
