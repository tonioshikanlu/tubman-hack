package b.l.a.d.a.b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final q f4586h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f4587i;

    /* renamed from: j  reason: collision with root package name */
    public final AssetPackState f4588j;

    public o(q qVar, Bundle bundle, AssetPackState assetPackState) {
        this.f4586h = qVar;
        this.f4587i = bundle;
        this.f4588j = assetPackState;
    }

    public final void run() {
        q qVar = this.f4586h;
        Bundle bundle = this.f4587i;
        AssetPackState assetPackState = this.f4588j;
        v0 v0Var = qVar.f4601g;
        if (((Boolean) v0Var.b(new m0(v0Var, bundle))).booleanValue()) {
            qVar.f4608n.post(new n(qVar, assetPackState));
            qVar.f4603i.a().c();
        }
    }
}
