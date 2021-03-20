package b.l.a.c.f.e;

public final class k3 extends g2<o6, l6> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l3 f3101b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k3(l3 l3Var, Class cls) {
        super(cls);
        this.f3101b = l3Var;
    }

    public static final l6 d(o6 o6Var) {
        k6 w = l6.w();
        r6 s = o6Var.s();
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        l6.A((l6) w.f3215i, s);
        byte[] a = ub.a(o6Var.t());
        um J = um.J(a, 0, a.length);
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        ((l6) w.f3215i).zzf = J;
        if (w.f3216j) {
            w.a();
            w.f3216j = false;
        }
        ((l6) w.f3215i).zzb = 0;
        return (l6) w.c();
    }

    public final void a(e0 e0Var) {
        o6 o6Var = (o6) e0Var;
        vb.a(o6Var.t());
        l3.i(o6Var.s());
    }

    public final /* bridge */ /* synthetic */ e0 b(um umVar) {
        return o6.u(umVar, fn.a());
    }

    public final /* bridge */ /* synthetic */ Object c(e0 e0Var) {
        return d((o6) e0Var);
    }
}
