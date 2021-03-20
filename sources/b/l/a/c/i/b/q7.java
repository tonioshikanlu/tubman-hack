package b.l.a.c.i.b;

import java.util.Objects;

public final class q7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f4233h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f4234i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f4235j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b8 f4236k;

    public q7(b8 b8Var, p9 p9Var, boolean z, b bVar, b bVar2) {
        this.f4236k = b8Var;
        this.f4233h = p9Var;
        this.f4234i = z;
        this.f4235j = bVar;
    }

    public final void run() {
        b8 b8Var = this.f4236k;
        a3 a3Var = b8Var.d;
        if (a3Var == null) {
            b8Var.a.a().f.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Objects.requireNonNull(this.f4233h, "null reference");
        this.f4236k.x(a3Var, this.f4234i ? null : this.f4235j, this.f4233h);
        this.f4236k.s();
    }
}
