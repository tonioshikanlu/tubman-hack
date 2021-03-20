package b.l.a.c.i.b;

import android.os.RemoteException;
import b.l.a.c.f.i.t8;
import b.l.a.c.f.i.tb;
import java.util.Objects;

public final class g7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f4017h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ tb f4018i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b8 f4019j;

    public g7(b8 b8Var, p9 p9Var, tb tbVar) {
        this.f4019j = b8Var;
        this.f4017h = p9Var;
        this.f4018i = tbVar;
    }

    public final void run() {
        String str = null;
        try {
            t8.b();
            if (!this.f4019j.a.f4114g.r((String) null, x2.w0) || this.f4019j.a.q().s().e()) {
                b8 b8Var = this.f4019j;
                a3 a3Var = b8Var.d;
                if (a3Var == null) {
                    b8Var.a.a().f.a("Failed to get app instance id");
                } else {
                    Objects.requireNonNull(this.f4017h, "null reference");
                    str = a3Var.Q(this.f4017h);
                    if (str != null) {
                        this.f4019j.a.s().f4149g.set(str);
                        this.f4019j.a.q().f4359l.b(str);
                    }
                    this.f4019j.s();
                }
                this.f4019j.a.t().P(this.f4018i, str);
            }
            this.f4019j.a.a().f4093k.a("Analytics storage consent denied; will not get app instance id");
            this.f4019j.a.s().f4149g.set((Object) null);
            this.f4019j.a.q().f4359l.b((String) null);
            this.f4019j.a.t().P(this.f4018i, str);
        } catch (RemoteException e2) {
            this.f4019j.a.a().f.b("Failed to get app instance id", e2);
        } catch (Throwable th) {
            this.f4019j.a.t().P(this.f4018i, (String) null);
            throw th;
        }
    }
}
