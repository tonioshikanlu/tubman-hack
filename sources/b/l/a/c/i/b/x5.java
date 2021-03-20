package b.l.a.c.i.b;

import java.util.concurrent.atomic.AtomicReference;

public final class x5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4368h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6 f4369i;

    public x5(m6 m6Var, AtomicReference atomicReference) {
        this.f4369i = m6Var;
        this.f4368h = atomicReference;
    }

    public final void run() {
        synchronized (this.f4368h) {
            try {
                AtomicReference atomicReference = this.f4368h;
                l4 l4Var = this.f4369i.a;
                atomicReference.set(Boolean.valueOf(l4Var.f4114g.r(l4Var.b().m(), x2.K)));
                this.f4368h.notify();
            } catch (Throwable th) {
                this.f4368h.notify();
                throw th;
            }
        }
    }
}
