package b.l.a.c.i.b;

import java.util.Objects;

public final class w7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a3 f4335h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a8 f4336i;

    public w7(a8 a8Var, a3 a3Var) {
        this.f4336i = a8Var;
        this.f4335h = a3Var;
    }

    public final void run() {
        synchronized (this.f4336i) {
            this.f4336i.a = false;
            if (!this.f4336i.c.w()) {
                this.f4336i.c.a.a().f4095m.a("Connected to remote service");
                b8 b8Var = this.f4336i.c;
                a3 a3Var = this.f4335h;
                b8Var.h();
                Objects.requireNonNull(a3Var, "null reference");
                b8Var.d = a3Var;
                b8Var.s();
                b8Var.u();
            }
        }
    }
}
