package b.l.a.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;
import b.l.a.d.a.e.g;
import b.l.a.d.a.e.q0;
import b.l.a.d.a.i.n;

public final class d extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f4495i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4496j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ n f4497k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4498l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ m f4499m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(m mVar, n nVar, int i2, String str, n nVar2, int i3) {
        super(nVar);
        this.f4499m = mVar;
        this.f4495i = i2;
        this.f4496j = str;
        this.f4497k = nVar2;
        this.f4498l = i3;
    }

    public final void a() {
        try {
            m mVar = this.f4499m;
            String str = mVar.a;
            int i2 = this.f4495i;
            String str2 = this.f4496j;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i2);
            bundle.putString("module_name", str2);
            ((q0) mVar.c.f4675k).C(str, bundle, m.h(), new l(this.f4499m, this.f4497k, this.f4495i, this.f4496j, this.f4498l));
        } catch (RemoteException e2) {
            m.f.a(e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}
