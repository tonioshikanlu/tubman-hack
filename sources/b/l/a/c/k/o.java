package b.l.a.c.k;

public final class o implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f4433h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ n f4434i;

    public o(n nVar, h hVar) {
        this.f4434i = nVar;
        this.f4433h = hVar;
    }

    public final void run() {
        if (this.f4433h.l()) {
            this.f4434i.c.r();
            return;
        }
        try {
            this.f4434i.c.q(this.f4434i.f4432b.a(this.f4433h));
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4434i.c.p((Exception) e2.getCause());
            } else {
                this.f4434i.c.p(e2);
            }
        } catch (Exception e3) {
            this.f4434i.c.p(e3);
        }
    }
}
