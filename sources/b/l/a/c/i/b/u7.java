package b.l.a.c.i.b;

import java.util.Objects;

public final class u7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a3 f4303h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a8 f4304i;

    public u7(a8 a8Var, a3 a3Var) {
        this.f4304i = a8Var;
        this.f4303h = a3Var;
    }

    public final void run() {
        synchronized (this.f4304i) {
            this.f4304i.a = false;
            if (!this.f4304i.c.w()) {
                this.f4304i.c.a.a().f4096n.a("Connected to service");
                b8 b8Var = this.f4304i.c;
                a3 a3Var = this.f4303h;
                b8Var.h();
                Objects.requireNonNull(a3Var, "null reference");
                b8Var.d = a3Var;
                b8Var.s();
                b8Var.u();
            }
        }
    }
}
