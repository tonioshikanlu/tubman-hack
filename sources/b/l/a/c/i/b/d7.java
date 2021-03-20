package b.l.a.c.i.b;

import java.util.Objects;

public final class d7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f3966h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f3967i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g9 f3968j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b8 f3969k;

    public d7(b8 b8Var, p9 p9Var, boolean z, g9 g9Var) {
        this.f3969k = b8Var;
        this.f3966h = p9Var;
        this.f3967i = z;
        this.f3968j = g9Var;
    }

    public final void run() {
        b8 b8Var = this.f3969k;
        a3 a3Var = b8Var.d;
        if (a3Var == null) {
            b8Var.a.a().f.a("Discarding data. Failed to set user property");
            return;
        }
        Objects.requireNonNull(this.f3966h, "null reference");
        this.f3969k.x(a3Var, this.f3967i ? null : this.f3968j, this.f3966h);
        this.f3969k.s();
    }
}
