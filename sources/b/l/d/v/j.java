package b.l.d.v;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final h f5323h;

    public j(h hVar) {
        this.f5323h = hVar;
    }

    public final void run() {
        h hVar = this.f5323h;
        synchronized (hVar) {
            if (hVar.a == 1) {
                hVar.a(1, "Timed out while binding");
            }
        }
    }
}
