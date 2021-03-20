package b.l.a.d.a.g;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import b.l.a.d.a.i.n;

public final class b extends ResultReceiver {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ n f4683h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Handler handler, n nVar) {
        super(handler);
        this.f4683h = nVar;
    }

    public final void onReceiveResult(int i2, Bundle bundle) {
        this.f4683h.b(null);
    }
}
