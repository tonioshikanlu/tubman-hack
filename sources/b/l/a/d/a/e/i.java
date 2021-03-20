package b.l.a.d.a.e;

import b.l.a.d.a.i.n;

public final class i extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g f4662i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p f4663j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(p pVar, n nVar, g gVar) {
        super(nVar);
        this.f4663j = pVar;
        this.f4662i = gVar;
    }

    public final void a() {
        p pVar = this.f4663j;
        g gVar = this.f4662i;
        if (pVar.f4675k == null && !pVar.f4670e) {
            pVar.f4669b.b(4, "Initiate binding to the service.", new Object[0]);
            pVar.d.add(gVar);
            o oVar = new o(pVar);
            pVar.f4674j = oVar;
            pVar.f4670e = true;
            if (!pVar.a.bindService(pVar.f, oVar, 1)) {
                pVar.f4669b.b(4, "Failed to bind to the service.", new Object[0]);
                pVar.f4670e = false;
                for (g gVar2 : pVar.d) {
                    n<?> nVar = gVar2.f4660h;
                    if (nVar != null) {
                        nVar.a(new q());
                    }
                }
                pVar.d.clear();
            }
        } else if (pVar.f4670e) {
            pVar.f4669b.b(4, "Waiting to bind to the service.", new Object[0]);
            pVar.d.add(gVar);
        } else {
            gVar.run();
        }
    }
}
