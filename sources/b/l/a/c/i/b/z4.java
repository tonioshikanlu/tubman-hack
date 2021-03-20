package b.l.a.c.i.b;

public final class z4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g9 f4388h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p9 f4389i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e5 f4390j;

    public z4(e5 e5Var, g9 g9Var, p9 p9Var) {
        this.f4390j = e5Var;
        this.f4388h = g9Var;
        this.f4389i = p9Var;
    }

    public final void run() {
        this.f4390j.a.n();
        if (this.f4388h.V() == null) {
            this.f4390j.a.q(this.f4388h, this.f4389i);
        } else {
            this.f4390j.a.p(this.f4388h, this.f4389i);
        }
    }
}
