package b.l.a.d.a.b;

import android.os.RemoteException;
import b.l.a.d.a.e.q0;
import b.l.a.d.a.i.n;

public final class g extends b.l.a.d.a.e.g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ n f4541i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f4542j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(m mVar, n nVar, n nVar2) {
        super(nVar);
        this.f4542j = mVar;
        this.f4541i = nVar2;
    }

    public final void a() {
        try {
            m mVar = this.f4542j;
            ((q0) mVar.d.f4675k).K0(mVar.a, m.h(), new k(this.f4542j, this.f4541i));
        } catch (RemoteException e2) {
            m.f.a(e2, "keepAlive", new Object[0]);
        }
    }
}
