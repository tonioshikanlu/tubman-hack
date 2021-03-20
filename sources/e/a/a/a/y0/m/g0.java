package e.a.a.a.y0.m;

import e.a.a.a.y0.l.e;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.l1.f;
import e.x.b.a;

public final class g0 extends k1 {

    /* renamed from: i  reason: collision with root package name */
    public final i<d0> f9673i;

    /* renamed from: j  reason: collision with root package name */
    public final m f9674j;

    /* renamed from: k  reason: collision with root package name */
    public final a<d0> f9675k;

    public g0(m mVar, a<? extends d0> aVar) {
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(aVar, "computation");
        this.f9674j = mVar;
        this.f9675k = aVar;
        this.f9673i = mVar.a(aVar);
    }

    public d0 Y0(f fVar) {
        e.x.c.i.e(fVar, "kotlinTypeRefiner");
        return new g0(this.f9674j, new f0(this, fVar));
    }

    public d0 a1() {
        return (d0) this.f9673i.e();
    }

    public boolean b1() {
        e.h hVar = (e.h) this.f9673i;
        return (hVar.f9632j == e.n.NOT_COMPUTED || hVar.f9632j == e.n.COMPUTING) ? false : true;
    }
}
