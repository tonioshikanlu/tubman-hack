package b.l.a.c.k;

public final class u implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f4441h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ t f4442i;

    public u(t tVar, h hVar) {
        this.f4442i = tVar;
        this.f4441h = hVar;
    }

    public final void run() {
        synchronized (this.f4442i.f4440b) {
            c<TResult> cVar = this.f4442i.c;
            if (cVar != null) {
                cVar.c(this.f4441h);
            }
        }
    }
}
