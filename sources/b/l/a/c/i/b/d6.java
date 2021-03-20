package b.l.a.c.i.b;

import java.util.concurrent.atomic.AtomicReference;

public final class d6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3964h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6 f3965i;

    public d6(m6 m6Var, AtomicReference atomicReference) {
        this.f3965i = m6Var;
        this.f3964h = atomicReference;
    }

    public final void run() {
        synchronized (this.f3964h) {
            try {
                AtomicReference atomicReference = this.f3964h;
                l4 l4Var = this.f3965i.a;
                atomicReference.set(Long.valueOf(l4Var.f4114g.o(l4Var.b().m(), x2.M)));
                this.f3964h.notify();
            } catch (Throwable th) {
                this.f3964h.notify();
                throw th;
            }
        }
    }
}
