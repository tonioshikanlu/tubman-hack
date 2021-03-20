package e.a.a.a.y0.j.y;

import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.x.c.k;

public final class h extends a {

    /* renamed from: b  reason: collision with root package name */
    public final i<i> f9456b;

    public static final class a extends k implements e.x.b.a<i> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e.x.b.a f9457h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e.x.b.a aVar) {
            super(0);
            this.f9457h = aVar;
        }

        public Object e() {
            i iVar = (i) this.f9457h.e();
            return iVar instanceof a ? ((a) iVar).h() : iVar;
        }
    }

    public h(m mVar, e.x.b.a<? extends i> aVar) {
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(aVar, "getScope");
        this.f9456b = mVar.a(new a(aVar));
    }

    public i i() {
        return (i) this.f9456b.e();
    }
}
