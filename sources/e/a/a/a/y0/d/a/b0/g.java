package e.a.a.a.y0.d.a.b0;

import e.a.a.a.y0.b.z;
import e.a.a.a.y0.d.a.b0.m;
import e.a.a.a.y0.d.a.b0.n.i;
import e.a.a.a.y0.d.a.d0.t;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.l.e;
import e.c;
import e.t.o;
import e.x.b.l;
import e.x.c.k;
import java.util.Collection;
import java.util.List;

public final class g implements z {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final e.a.a.a.y0.l.a<b, i> f8363b;

    public static final class a extends k implements e.x.b.a<i> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ g f8364h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ t f8365i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, t tVar) {
            super(0);
            this.f8364h = gVar;
            this.f8365i = tVar;
        }

        public Object e() {
            return new i(this.f8364h.a, this.f8365i);
        }
    }

    public g(c cVar) {
        e.x.c.i.e(cVar, "components");
        h hVar = new h(cVar, m.a.a, new c(null));
        this.a = hVar;
        this.f8363b = hVar.c.a.f();
    }

    public List<i> a(b bVar) {
        e.x.c.i.e(bVar, "fqName");
        return e.t.g.C(b(bVar));
    }

    public final i b(b bVar) {
        t a2 = this.a.c.f8346b.a(bVar);
        if (a2 == null) {
            return null;
        }
        return (i) ((e.d) this.f8363b).c(bVar, new a(this, a2));
    }

    public Collection y(b bVar, l lVar) {
        e.x.c.i.e(bVar, "fqName");
        e.x.c.i.e(lVar, "nameFilter");
        i b2 = b(bVar);
        List list = b2 != null ? (List) b2.f8410p.e() : null;
        return list != null ? list : o.f7934h;
    }
}
