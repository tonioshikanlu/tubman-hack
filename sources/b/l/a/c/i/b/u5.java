package b.l.a.c.i.b;

import java.util.concurrent.atomic.AtomicReference;

public final class u5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f4296h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6 f4297i;

    public u5(m6 m6Var, long j2) {
        this.f4297i = m6Var;
        this.f4296h = j2;
    }

    public final void run() {
        this.f4297i.n(this.f4296h, true);
        this.f4297i.a.z().z(new AtomicReference());
    }
}
