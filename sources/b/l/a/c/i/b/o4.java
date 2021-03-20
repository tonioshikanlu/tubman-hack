package b.l.a.c.i.b;

import java.util.Objects;

public final class o4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f4193h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e5 f4194i;

    public o4(e5 e5Var, b bVar) {
        this.f4194i = e5Var;
        this.f4193h = bVar;
    }

    public final void run() {
        this.f4194i.a.n();
        if (this.f4193h.f3913j.V() == null) {
            d9 d9Var = this.f4194i.a;
            b bVar = this.f4193h;
            Objects.requireNonNull(d9Var);
            p9 G = d9Var.G(bVar.f3911h);
            if (G != null) {
                d9Var.t(bVar, G);
                return;
            }
            return;
        }
        d9 d9Var2 = this.f4194i.a;
        b bVar2 = this.f4193h;
        Objects.requireNonNull(d9Var2);
        p9 G2 = d9Var2.G(bVar2.f3911h);
        if (G2 != null) {
            d9Var2.s(bVar2, G2);
        }
    }
}
