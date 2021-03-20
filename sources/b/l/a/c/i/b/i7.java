package b.l.a.c.i.b;

import android.os.RemoteException;

public final class i7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ t6 f4061h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b8 f4062i;

    public i7(b8 b8Var, t6 t6Var) {
        this.f4062i = b8Var;
        this.f4061h = t6Var;
    }

    public final void run() {
        b8 b8Var = this.f4062i;
        a3 a3Var = b8Var.d;
        if (a3Var == null) {
            b8Var.a.a().f.a("Failed to send current screen to service");
            return;
        }
        try {
            t6 t6Var = this.f4061h;
            if (t6Var == null) {
                a3Var.D0(0, (String) null, (String) null, b8Var.a.a.getPackageName());
            } else {
                a3Var.D0(t6Var.c, t6Var.a, t6Var.f4282b, b8Var.a.a.getPackageName());
            }
            this.f4062i.s();
        } catch (RemoteException e2) {
            this.f4062i.a.a().f.b("Failed to send current screen to the service", e2);
        }
    }
}
