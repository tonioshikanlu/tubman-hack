package e.a.a.a.y0.k.b.g0;

import e.a.a.a.y0.b.a1.c;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.l;
import e.x.c.q;
import e.x.c.v;
import java.util.Iterator;
import java.util.List;

public class a implements h {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ l[] f9507i = {v.c(new q(v.a(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: h  reason: collision with root package name */
    public final i f9508h;

    public a(m mVar, e.x.b.a<? extends List<? extends c>> aVar) {
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(aVar, "compute");
        this.f9508h = mVar.a(aVar);
    }

    public c i(b bVar) {
        e.x.c.i.e(bVar, "fqName");
        return b.q.a.a.i0(this, bVar);
    }

    public boolean isEmpty() {
        return ((List) b.q.a.a.j1(this.f9508h, f9507i[0])).isEmpty();
    }

    public Iterator<c> iterator() {
        return ((List) b.q.a.a.j1(this.f9508h, f9507i[0])).iterator();
    }

    public boolean x(b bVar) {
        e.x.c.i.e(bVar, "fqName");
        return b.q.a.a.n1(this, bVar);
    }
}
