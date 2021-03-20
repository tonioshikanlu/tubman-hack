package b.l.a.d.a.g;

import android.os.RemoteException;
import b.l.a.d.a.c.b;
import b.l.a.d.a.e.g;
import b.l.a.d.a.i.n;

public final class e extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ n f4685i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g f4686j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(g gVar, n nVar, n nVar2) {
        super(nVar);
        this.f4686j = gVar;
        this.f4685i = nVar2;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [b.l.a.d.a.e.e, b.l.a.d.a.g.f] */
    public final void a() {
        try {
            g gVar = this.f4686j;
            gVar.a.f4675k.c0(gVar.f4688b, b.a("review"), new f(this.f4686j, this.f4685i));
        } catch (RemoteException e2) {
            g.c.a(e2, "error requesting in-app review for %s", this.f4686j.f4688b);
            this.f4685i.a(new RuntimeException(e2));
        }
    }
}
