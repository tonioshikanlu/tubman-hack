package b.l.a.d.a.b;

import android.os.RemoteException;
import b.l.a.d.a.e.g;
import b.l.a.d.a.e.q0;
import b.l.a.d.a.i.n;

public final class c extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f4485i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4486j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f4487k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4488l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ n f4489m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ m f4490n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(m mVar, n nVar, int i2, String str, String str2, int i3, n nVar2) {
        super(nVar);
        this.f4490n = mVar;
        this.f4485i = i2;
        this.f4486j = str;
        this.f4487k = str2;
        this.f4488l = i3;
        this.f4489m = nVar2;
    }

    public final void a() {
        try {
            m mVar = this.f4490n;
            ((q0) mVar.c.f4675k).S0(mVar.a, m.j(this.f4485i, this.f4486j, this.f4487k, this.f4488l), m.h(), new h(this.f4490n, this.f4489m, (char[]) null));
        } catch (RemoteException e2) {
            m.f.a(e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}
