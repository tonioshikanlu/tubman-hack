package b.l.a.c.i.b;

import java.util.concurrent.atomic.AtomicReference;

public final class e6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3992h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6 f3993i;

    public e6(m6 m6Var, AtomicReference atomicReference) {
        this.f3993i = m6Var;
        this.f3992h = atomicReference;
    }

    public final void run() {
        synchronized (this.f3992h) {
            try {
                AtomicReference atomicReference = this.f3992h;
                l4 l4Var = this.f3993i.a;
                atomicReference.set(Integer.valueOf(l4Var.f4114g.p(l4Var.b().m(), x2.N)));
                this.f3992h.notify();
            } catch (Throwable th) {
                this.f3992h.notify();
                throw th;
            }
        }
    }
}
