package b.l.a.c.k;

public final class w implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f4444h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ v f4445i;

    public w(v vVar, h hVar) {
        this.f4445i = vVar;
        this.f4444h = hVar;
    }

    public final void run() {
        synchronized (this.f4445i.f4443b) {
            d dVar = this.f4445i.c;
            if (dVar != null) {
                dVar.b(this.f4444h.i());
            }
        }
    }
}
