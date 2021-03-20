package b.l.a.c.i.b;

import android.os.RemoteException;
import java.util.Objects;

public final class n7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f4176h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b8 f4177i;

    public n7(b8 b8Var, p9 p9Var) {
        this.f4177i = b8Var;
        this.f4176h = p9Var;
    }

    public final void run() {
        b8 b8Var = this.f4177i;
        a3 a3Var = b8Var.d;
        if (a3Var == null) {
            b8Var.a.a().f.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Objects.requireNonNull(this.f4176h, "null reference");
            a3Var.K(this.f4176h);
            this.f4177i.s();
        } catch (RemoteException e2) {
            this.f4177i.a.a().f.b("Failed to send measurementEnabled to the service", e2);
        }
    }
}
