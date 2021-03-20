package b.l.a.d.a.i;

public final class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f4690h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g f4691i;

    public f(g gVar, r rVar) {
        this.f4691i = gVar;
        this.f4690h = rVar;
    }

    public final void run() {
        synchronized (this.f4691i.f4692b) {
            a<ResultT> aVar = this.f4691i.c;
            if (aVar != null) {
                aVar.a(this.f4690h);
            }
        }
    }
}
