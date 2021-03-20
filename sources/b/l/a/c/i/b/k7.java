package b.l.a.c.i.b;

public final class k7 extends l {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b8 f4105e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k7(b8 b8Var, h5 h5Var) {
        super(h5Var);
        this.f4105e = b8Var;
    }

    public final void a() {
        b8 b8Var = this.f4105e;
        b8Var.h();
        if (b8Var.w()) {
            b8Var.a.a().f4096n.a("Inactivity, disconnecting from the service");
            b8Var.o();
        }
    }
}
