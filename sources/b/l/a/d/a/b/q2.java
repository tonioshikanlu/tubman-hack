package b.l.a.d.a.b;

import android.os.RemoteException;
import b.l.a.d.a.e.g;
import b.l.a.d.a.e.q0;
import b.l.a.d.a.i.n;
import java.util.Map;

public final class q2 extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f4614i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ n f4615j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f4616k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q2(m mVar, n nVar, Map map, n nVar2) {
        super(nVar);
        this.f4616k = mVar;
        this.f4614i = map;
        this.f4615j = nVar2;
    }

    public final void a() {
        try {
            m mVar = this.f4616k;
            ((q0) mVar.c.f4675k).G0(mVar.a, m.i(this.f4614i), new j(this.f4616k, this.f4615j));
        } catch (RemoteException e2) {
            m.f.a(e2, "syncPacks", new Object[0]);
            this.f4615j.a(new RuntimeException(e2));
        }
    }
}
