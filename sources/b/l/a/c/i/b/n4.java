package b.l.a.c.i.b;

public final class n4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f4171h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p9 f4172i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e5 f4173j;

    public n4(e5 e5Var, b bVar, p9 p9Var) {
        this.f4173j = e5Var;
        this.f4171h = bVar;
        this.f4172i = p9Var;
    }

    public final void run() {
        this.f4173j.a.n();
        if (this.f4171h.f3913j.V() == null) {
            this.f4173j.a.t(this.f4171h, this.f4172i);
        } else {
            this.f4173j.a.s(this.f4171h, this.f4172i);
        }
    }
}
