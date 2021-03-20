package b.l.a.c.i.b;

public final class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h5 f4086h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ l f4087i;

    public k(l lVar, h5 h5Var) {
        this.f4087i = lVar;
        this.f4086h = h5Var;
    }

    public final void run() {
        this.f4086h.e();
        if (y9.a()) {
            this.f4086h.d().q(this);
            return;
        }
        boolean z = this.f4087i.c != 0;
        this.f4087i.c = 0;
        if (z) {
            this.f4087i.a();
        }
    }
}
