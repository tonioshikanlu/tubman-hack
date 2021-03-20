package b.l.a.d.a.e;

import android.os.IBinder;
import android.os.RemoteException;
import b.l.a.d.a.i.n;

public final /* synthetic */ class h implements IBinder.DeathRecipient {
    public final p a;

    public h(p pVar) {
        this.a = pVar;
    }

    public final void binderDied() {
        p pVar = this.a;
        pVar.f4669b.b(4, "reportBinderDeath", new Object[0]);
        k kVar = (k) pVar.f4672h.get();
        if (kVar == null) {
            pVar.f4669b.b(4, "%s : Binder has died.", new Object[]{pVar.c});
            for (g gVar : pVar.d) {
                n<?> nVar = gVar.f4660h;
                if (nVar != null) {
                    nVar.a(new RemoteException(String.valueOf(pVar.c).concat(" : Binder has died.")));
                }
            }
            pVar.d.clear();
            return;
        }
        pVar.f4669b.b(4, "calling onBinderDied", new Object[0]);
        kVar.a();
    }
}
