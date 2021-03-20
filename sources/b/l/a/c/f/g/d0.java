package b.l.a.c.f.g;

import android.os.Looper;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.k.j;
import b.l.a.c.g.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

public final class d0 extends b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ LocationRequest f3456q;
    public final /* synthetic */ a r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(GoogleApiClient googleApiClient, LocationRequest locationRequest, a aVar) {
        super(googleApiClient);
        this.f3456q = locationRequest;
        this.r = aVar;
    }

    public final void j(a.b bVar) {
        p pVar = (p) bVar;
        c cVar = new c(this);
        LocationRequest locationRequest = this.f3456q;
        b.l.a.c.g.a aVar = this.r;
        b.l.a.c.b.a.G(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        Looper myLooper = Looper.myLooper();
        String simpleName = b.l.a.c.g.a.class.getSimpleName();
        b.l.a.c.b.a.B(aVar, "Listener must not be null");
        b.l.a.c.b.a.B(myLooper, "Looper must not be null");
        b.l.a.c.b.a.B(simpleName, "Listener type must not be null");
        j jVar = new j(myLooper, aVar, simpleName);
        synchronized (pVar.F) {
            pVar.F.b(locationRequest, jVar, cVar);
        }
    }
}
