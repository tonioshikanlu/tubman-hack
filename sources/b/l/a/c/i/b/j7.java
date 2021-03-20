package b.l.a.c.i.b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

public final class j7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f4081h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Bundle f4082i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b8 f4083j;

    public j7(b8 b8Var, p9 p9Var, Bundle bundle) {
        this.f4083j = b8Var;
        this.f4081h = p9Var;
        this.f4082i = bundle;
    }

    public final void run() {
        b8 b8Var = this.f4083j;
        a3 a3Var = b8Var.d;
        if (a3Var == null) {
            b8Var.a.a().f.a("Failed to send default event parameters to service");
            return;
        }
        try {
            Objects.requireNonNull(this.f4081h, "null reference");
            a3Var.c1(this.f4082i, this.f4081h);
        } catch (RemoteException e2) {
            this.f4083j.a.a().f.b("Failed to send default event parameters to service", e2);
        }
    }
}
