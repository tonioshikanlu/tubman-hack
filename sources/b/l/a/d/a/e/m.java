package b.l.a.d.a.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public final class m extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ IBinder f4665i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ o f4666j;

    public m(o oVar, IBinder iBinder) {
        this.f4666j = oVar;
        this.f4665i = iBinder;
    }

    public final void a() {
        p pVar = this.f4666j.a;
        pVar.f4675k = (IInterface) pVar.f4671g.a(this.f4665i);
        p pVar2 = this.f4666j.a;
        pVar2.f4669b.b(4, "linkToDeath", new Object[0]);
        try {
            pVar2.f4675k.asBinder().linkToDeath(pVar2.f4673i, 0);
        } catch (RemoteException e2) {
            pVar2.f4669b.a(e2, "linkToDeath failed", new Object[0]);
        }
        p pVar3 = this.f4666j.a;
        pVar3.f4670e = false;
        for (g run : pVar3.d) {
            run.run();
        }
        this.f4666j.a.d.clear();
    }
}
