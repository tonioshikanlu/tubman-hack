package e.a.a.a.y0.j.y;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.c.a.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.t.g;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.util.Collection;
import java.util.List;

public final class l extends j {
    public static final /* synthetic */ e.a.l[] d = {v.c(new q(v.a(l.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b  reason: collision with root package name */
    public final i f9461b;
    public final e c;

    public static final class a extends k implements e.x.b.a<List<? extends l0>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ l f9462h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l lVar) {
            super(0);
            this.f9462h = lVar;
        }

        public Object e() {
            return g.B(b.q.a.a.W(this.f9462h.c), b.q.a.a.X(this.f9462h.c));
        }
    }

    public l(m mVar, e eVar) {
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(eVar, "containingClass");
        this.c = eVar;
        this.f9461b = mVar.a(new a(this));
    }

    public Collection a(d dVar, b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        e.a.a.a.y0.o.l lVar = new e.a.a.a.y0.o.l();
        for (Object next : (List) b.q.a.a.j1(this.f9461b, d[0])) {
            if (e.x.c.i.a(((l0) next).getName(), dVar)) {
                lVar.add(next);
            }
        }
        return lVar;
    }

    public h b(d dVar, b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        return null;
    }

    public Collection c(d dVar, e.x.b.l lVar) {
        e.x.c.i.e(dVar, "kindFilter");
        e.x.c.i.e(lVar, "nameFilter");
        return (List) b.q.a.a.j1(this.f9461b, d[0]);
    }
}
