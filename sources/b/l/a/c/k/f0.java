package b.l.a.c.k;

import java.util.concurrent.Callable;

public final class f0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e0 f4424h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Callable f4425i;

    public f0(e0 e0Var, Callable callable) {
        this.f4424h = e0Var;
        this.f4425i = callable;
    }

    public final void run() {
        try {
            this.f4424h.q(this.f4425i.call());
        } catch (Exception e2) {
            this.f4424h.p(e2);
        }
    }
}
