package b.l.a.c.k;

import java.util.concurrent.Executor;

public final class q implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f4436h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p f4437i;

    public q(p pVar, h hVar) {
        this.f4437i = pVar;
        this.f4436h = hVar;
    }

    public final void run() {
        try {
            h a = this.f4437i.f4435b.a(this.f4436h);
            if (a == null) {
                p pVar = this.f4437i;
                pVar.c.p(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f4426b;
            a.e(executor, this.f4437i);
            a.d(executor, this.f4437i);
            a.a(executor, this.f4437i);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4437i.c.p((Exception) e2.getCause());
            } else {
                this.f4437i.c.p(e2);
            }
        } catch (Exception e3) {
            this.f4437i.c.p(e3);
        }
    }
}
