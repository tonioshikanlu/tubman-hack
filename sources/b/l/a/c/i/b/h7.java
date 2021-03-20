package b.l.a.c.i.b;

import android.os.RemoteException;
import b.l.a.c.c.m.v.a;
import java.util.Objects;

public final class h7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f4045h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b8 f4046i;

    public h7(b8 b8Var, p9 p9Var) {
        this.f4046i = b8Var;
        this.f4045h = p9Var;
    }

    public final void run() {
        b8 b8Var = this.f4046i;
        a3 a3Var = b8Var.d;
        if (a3Var == null) {
            b8Var.a.a().f.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Objects.requireNonNull(this.f4045h, "null reference");
            a3Var.B0(this.f4045h);
            this.f4046i.a.v().m();
            this.f4046i.x(a3Var, (a) null, this.f4045h);
            this.f4046i.s();
        } catch (RemoteException e2) {
            this.f4046i.a.a().f.b("Failed to send app launch to the service", e2);
        }
    }
}
