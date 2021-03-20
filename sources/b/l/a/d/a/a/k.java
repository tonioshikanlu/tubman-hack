package b.l.a.d.a.a;

import android.os.RemoteException;
import b.l.a.d.a.e.g;
import b.l.a.d.a.e.l0;
import b.l.a.d.a.i.n;

public final class k extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4453i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ n f4454j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p f4455k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(p pVar, n nVar, String str, n nVar2) {
        super(nVar);
        this.f4455k = pVar;
        this.f4453i = str;
        this.f4454j = nVar2;
    }

    public final void a() {
        try {
            p pVar = this.f4455k;
            ((l0) pVar.a.f4675k).k0(pVar.f4462b, p.a(pVar, this.f4453i), new o(this.f4455k, this.f4454j, this.f4453i));
        } catch (RemoteException e2) {
            p.f4461e.a(e2, "requestUpdateInfo(%s)", this.f4453i);
            this.f4454j.a(new RuntimeException(e2));
        }
    }
}
