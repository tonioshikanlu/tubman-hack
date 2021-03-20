package b.l.a.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;
import b.l.a.d.a.e.g;
import b.l.a.d.a.e.q0;
import b.l.a.d.a.i.n;

public final class e extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f4521i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ n f4522j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f4523k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(m mVar, n nVar, int i2, n nVar2) {
        super(nVar);
        this.f4523k = mVar;
        this.f4521i = i2;
        this.f4522j = nVar2;
    }

    public final void a() {
        try {
            m mVar = this.f4523k;
            String str = mVar.a;
            int i2 = this.f4521i;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i2);
            ((q0) mVar.c.f4675k).d0(str, bundle, m.h(), new h(this.f4523k, this.f4522j, (int[]) null));
        } catch (RemoteException e2) {
            m.f.a(e2, "notifySessionFailed", new Object[0]);
        }
    }
}
