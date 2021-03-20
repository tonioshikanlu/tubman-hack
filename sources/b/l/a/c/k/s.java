package b.l.a.c.k;

public final class s implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f4439h;

    public s(r rVar) {
        this.f4439h = rVar;
    }

    public final void run() {
        synchronized (this.f4439h.f4438b) {
            b bVar = this.f4439h.c;
            if (bVar != null) {
                bVar.d();
            }
        }
    }
}
