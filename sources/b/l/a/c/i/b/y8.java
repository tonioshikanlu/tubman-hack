package b.l.a.c.i.b;

import b.l.a.c.f.i.t8;
import java.util.concurrent.Callable;

public final class y8 implements Callable<String> {
    public final /* synthetic */ p9 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d9 f4386b;

    public y8(d9 d9Var, p9 p9Var) {
        this.f4386b = d9Var;
        this.a = p9Var;
    }

    public final Object call() {
        t8.b();
        if (!this.f4386b.f3979j.f4114g.r((String) null, x2.y0) || (this.f4386b.T(this.a.f4218h).e() && g.b(this.a.C).e())) {
            return this.f4386b.u(this.a).z();
        }
        this.f4386b.a().f4096n.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
