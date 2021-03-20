package b.l.a.c.i.b;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class c6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3947h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6 f3948i;

    public c6(m6 m6Var, AtomicReference atomicReference) {
        this.f3948i = m6Var;
        this.f3947h = atomicReference;
    }

    public final void run() {
        String str;
        synchronized (this.f3947h) {
            try {
                AtomicReference atomicReference = this.f3947h;
                l4 l4Var = this.f3948i.a;
                f fVar = l4Var.f4114g;
                String m2 = l4Var.b().m();
                w2<String> w2Var = x2.L;
                Objects.requireNonNull(fVar);
                if (m2 == null) {
                    str = null;
                } else {
                    str = fVar.c.b(m2, w2Var.a);
                }
                atomicReference.set(w2Var.a(str));
                this.f3947h.notify();
            } catch (Throwable th) {
                this.f3947h.notify();
                throw th;
            }
        }
    }
}
