package b.l.a.c.i.b;

import android.os.RemoteException;
import java.util.Objects;

public final class o7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f4201h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b8 f4202i;

    public o7(b8 b8Var, p9 p9Var) {
        this.f4202i = b8Var;
        this.f4201h = p9Var;
    }

    public final void run() {
        b8 b8Var = this.f4202i;
        a3 a3Var = b8Var.d;
        if (a3Var == null) {
            b8Var.a.a().f.a("Failed to send consent settings to service");
            return;
        }
        try {
            Objects.requireNonNull(this.f4201h, "null reference");
            a3Var.D(this.f4201h);
            this.f4202i.s();
        } catch (RemoteException e2) {
            this.f4202i.a.a().f.b("Failed to send consent settings to the service", e2);
        }
    }
}
