package b.l.a.c.i.b;

import b.l.a.c.b.a;
import b.l.a.c.f.i.t8;
import java.util.Objects;

public final class v4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f4310h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e5 f4311i;

    public v4(e5 e5Var, p9 p9Var) {
        this.f4311i = e5Var;
        this.f4310h = p9Var;
    }

    public final void run() {
        this.f4311i.a.n();
        d9 d9Var = this.f4311i.a;
        p9 p9Var = this.f4310h;
        Objects.requireNonNull(d9Var);
        t8.b();
        if (d9Var.f3979j.f4114g.r((String) null, x2.y0)) {
            d9Var.f3979j.d().h();
            d9Var.R();
            a.x(p9Var.f4218h);
            g b2 = g.b(p9Var.C);
            g T = d9Var.T(p9Var.f4218h);
            d9Var.f3979j.a().f4096n.c("Setting consent, package, consent", p9Var.f4218h, b2);
            d9Var.S(p9Var.f4218h, b2);
            if (b2.f(T)) {
                d9Var.o(p9Var);
            }
        }
    }
}
