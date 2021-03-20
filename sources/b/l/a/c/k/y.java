package b.l.a.c.k;

public final class y implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f4447h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ x f4448i;

    public y(x xVar, h hVar) {
        this.f4448i = xVar;
        this.f4447h = hVar;
    }

    public final void run() {
        synchronized (this.f4448i.f4446b) {
            e<? super TResult> eVar = this.f4448i.c;
            if (eVar != null) {
                eVar.a(this.f4447h.j());
            }
        }
    }
}
