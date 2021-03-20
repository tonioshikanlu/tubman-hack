package b.l.a.d.a.i;

public final class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f4693h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i f4694i;

    public h(i iVar, r rVar) {
        this.f4694i = iVar;
        this.f4693h = rVar;
    }

    public final void run() {
        Exception exc;
        synchronized (this.f4694i.f4695b) {
            b bVar = this.f4694i.c;
            if (bVar != null) {
                r rVar = this.f4693h;
                synchronized (rVar.a) {
                    exc = rVar.f4702e;
                }
                bVar.b(exc);
            }
        }
    }
}
