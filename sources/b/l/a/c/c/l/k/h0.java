package b.l.a.c.c.l.k;

import androidx.annotation.WorkerThread;

public abstract class h0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ x f2666h;

    public h0(x xVar, w wVar) {
        this.f2666h = xVar;
    }

    @WorkerThread
    public abstract void a();

    @WorkerThread
    public void run() {
        this.f2666h.f2718b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.f2666h.f2718b.unlock();
            }
        } catch (RuntimeException e2) {
            p0 p0Var = this.f2666h.a;
            p0Var.f2694e.sendMessage(p0Var.f2694e.obtainMessage(2, e2));
        } finally {
            this.f2666h.f2718b.unlock();
        }
    }
}
