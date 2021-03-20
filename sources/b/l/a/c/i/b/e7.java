package b.l.a.c.i.b;

import android.os.RemoteException;
import java.util.Objects;

public final class e7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f3994h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b8 f3995i;

    public e7(b8 b8Var, p9 p9Var) {
        this.f3995i = b8Var;
        this.f3994h = p9Var;
    }

    public final void run() {
        b8 b8Var = this.f3995i;
        a3 a3Var = b8Var.d;
        if (a3Var == null) {
            b8Var.a.a().f.a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Objects.requireNonNull(this.f3994h, "null reference");
            a3Var.U0(this.f3994h);
        } catch (RemoteException e2) {
            this.f3995i.a.a().f.b("Failed to reset data on the service: remote exception", e2);
        }
        this.f3995i.s();
    }
}
