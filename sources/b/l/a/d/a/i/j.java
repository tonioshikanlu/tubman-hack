package b.l.a.d.a.i;

public final class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f4696h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ k f4697i;

    public j(k kVar, r rVar) {
        this.f4697i = kVar;
        this.f4696h = rVar;
    }

    public final void run() {
        synchronized (this.f4697i.f4698b) {
            c<? super ResultT> cVar = this.f4697i.c;
            if (cVar != null) {
                cVar.a(this.f4696h.f());
            }
        }
    }
}
