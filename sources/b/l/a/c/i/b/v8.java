package b.l.a.c.i.b;

import b.l.a.c.c.p.c;
import java.util.Objects;

public final class v8 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e9 f4321h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ d9 f4322i;

    public v8(d9 d9Var, e9 e9Var) {
        this.f4322i = d9Var;
        this.f4321h = e9Var;
    }

    public final void run() {
        d9 d9Var = this.f4322i;
        d9Var.f3979j.d().h();
        j jVar = new j(d9Var);
        jVar.j();
        d9Var.c = jVar;
        d9Var.f3979j.f4114g.c = d9Var.a;
        c8 c8Var = new c8(d9Var);
        c8Var.j();
        d9Var.f3978i = c8Var;
        x9 x9Var = new x9(d9Var);
        x9Var.j();
        d9Var.f = x9Var;
        r6 r6Var = new r6(d9Var);
        r6Var.j();
        d9Var.f3977h = r6Var;
        t8 t8Var = new t8(d9Var);
        t8Var.j();
        d9Var.f3975e = t8Var;
        d9Var.d = new r3(d9Var);
        if (d9Var.f3984o != d9Var.f3985p) {
            d9Var.f3979j.a().f.c("Not all upload components initialized", Integer.valueOf(d9Var.f3984o), Integer.valueOf(d9Var.f3985p));
        }
        d9Var.f3980k = true;
        d9 d9Var2 = this.f4322i;
        d9Var2.f3979j.d().h();
        d9Var2.L().Q();
        if (d9Var2.f3979j.q().f4353e.a() == 0) {
            u3 u3Var = d9Var2.f3979j.q().f4353e;
            Objects.requireNonNull((c) d9Var2.f3979j.f4121n);
            u3Var.b(System.currentTimeMillis());
        }
        d9Var2.D();
    }
}
