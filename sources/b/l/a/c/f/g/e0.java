package b.l.a.c.f.g;

import b.l.a.c.c.l.a;
import b.l.a.c.c.l.k.j;
import b.l.a.c.g.a;
import com.google.android.gms.common.api.GoogleApiClient;

public final class e0 extends b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ a f3457q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(GoogleApiClient googleApiClient, a aVar) {
        super(googleApiClient);
        this.f3457q = aVar;
    }

    public final void j(a.b bVar) {
        b.l.a.c.g.a aVar = this.f3457q;
        String simpleName = b.l.a.c.g.a.class.getSimpleName();
        b.l.a.c.b.a.B(aVar, "Listener must not be null");
        b.l.a.c.b.a.B(simpleName, "Listener type must not be null");
        b.l.a.c.b.a.y(simpleName, "Listener type must not be empty");
        j.a aVar2 = new j.a(aVar, simpleName);
        c cVar = new c(this);
        k kVar = ((p) bVar).F;
        kVar.a.a();
        b.l.a.c.b.a.B(aVar2, "Invalid null listener key");
        synchronized (kVar.d) {
            n remove = kVar.d.remove(aVar2);
            if (remove != null) {
                synchronized (remove) {
                    remove.f3460b.f2672b = null;
                }
                ((i) kVar.a.b()).q0(t.V(remove, cVar));
            }
        }
    }
}
