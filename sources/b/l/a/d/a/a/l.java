package b.l.a.d.a.a;

import android.os.Bundle;
import android.os.RemoteException;
import b.l.a.d.a.c.b;
import b.l.a.d.a.e.g;
import b.l.a.d.a.e.l0;
import b.l.a.d.a.i.n;

public final class l extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ n f4456i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4457j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p f4458k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(p pVar, n nVar, n nVar2, String str) {
        super(nVar);
        this.f4458k = pVar;
        this.f4456i = nVar2;
        this.f4457j = str;
    }

    public final void a() {
        try {
            p pVar = this.f4458k;
            String str = pVar.f4462b;
            Bundle bundle = new Bundle();
            bundle.putAll(b.a("app_update"));
            bundle.putInt("playcore.version.code", 10901);
            ((l0) pVar.a.f4675k).L(str, bundle, new n(this.f4458k, this.f4456i));
        } catch (RemoteException e2) {
            p.f4461e.a(e2, "completeUpdate(%s)", this.f4457j);
            this.f4456i.a(new RuntimeException(e2));
        }
    }
}
