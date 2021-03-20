package b.l.a.c.i.b;

import java.util.ArrayList;

public final class f8 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d9 f4007h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f4008i;

    public f8(d9 d9Var, Runnable runnable) {
        this.f4007h = d9Var;
        this.f4008i = runnable;
    }

    public final void run() {
        this.f4007h.n();
        d9 d9Var = this.f4007h;
        Runnable runnable = this.f4008i;
        d9Var.f3979j.d().h();
        if (d9Var.f3983n == null) {
            d9Var.f3983n = new ArrayList();
        }
        d9Var.f3983n.add(runnable);
        this.f4007h.k();
    }
}
