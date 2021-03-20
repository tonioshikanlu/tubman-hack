package b.l.a.c.i.b;

public final class y6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ t6 f4382h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f4383i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b7 f4384j;

    public y6(b7 b7Var, t6 t6Var, long j2) {
        this.f4384j = b7Var;
        this.f4382h = t6Var;
        this.f4383i = j2;
    }

    public final void run() {
        this.f4384j.n(this.f4382h, false, this.f4383i);
        b7 b7Var = this.f4384j;
        b7Var.f3924e = null;
        b8 z = b7Var.a.z();
        z.h();
        z.i();
        z.t(new i7(z, (t6) null));
    }
}
